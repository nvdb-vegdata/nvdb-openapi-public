package no.vegvesen.vt.nvdb.apiles

import no.vegvesen.vt.nvdb.apiles.KeyValueStore.get
import no.vegvesen.vt.nvdb.vegobjekter.api.VegobjekterApi
import no.vegvesen.vt.nvdb.vegobjekter.model.InkluderIVegobjekt
import no.vegvesen.vt.nvdb.vegobjekter.model.Vegobjekt
import org.jetbrains.exposed.v1.core.SqlExpressionBuilder.eq
import org.jetbrains.exposed.v1.core.and
import org.jetbrains.exposed.v1.core.or
import org.jetbrains.exposed.v1.jdbc.batchInsert
import org.jetbrains.exposed.v1.jdbc.deleteWhere
import org.jetbrains.exposed.v1.jdbc.transactions.transaction
import java.time.Instant

val vegobjekterApi = VegobjekterApi()

fun importAndUpdateVegobjekter(vegobjektType: Int) {
    // State variables for tracking import progress and resumption points
    val importStarted: Instant? = KeyValueStore.get<Instant>(Key.VegobjekterImportStarted)
    val importCompleted: Instant? = KeyValueStore.get<Instant>(Key.VegobjekterImportCompleted)
    val lastStart: String? =
        KeyValueStore.get<String>(Key.VegobjekterImportLastStart)  // Pagination cursor for resuming backfill

    // Determine which phase to execute based on persisted state
    if (importCompleted != null) {
        println("Vegobjekter import already completed")
    } else if (importStarted != null) {
        // Resume interrupted backfill from last known pagination position
        println("Resuming vegobjekter import from position: $lastStart")
        performVegobjekterImport(vegobjektType, lastStart)
    } else {
        // Begin fresh backfill import
        println("Starting new vegobjekter import...")
        KeyValueStore.set(Key.VegobjekterImportStarted, Instant.now())
        performVegobjekterImport(vegobjektType, null)
    }

    // Transition to event-driven update phase after backfill completion
    // Uses the completion timestamp as baseline for detecting subsequent changes
    performVegobjekterUpdate(vegobjektType)
}

data class VersjonId(val id: Long, val versjon: Int)

/**
 * Event-driven update phase: monitors for changes and selectively reloads modified data.
 *
 * This phase replaces expensive full table scans with targeted updates based on
 * change events from the NVDB endringer API. Only objects that have actually
 * changed since the last update are fetched and refreshed.
 */
private fun performVegobjekterUpdate(vegobjektType: Int) {
    // Find updates from start of import to catch any changes that occurred during the backfill
    var lastUpdate: String? =
        KeyValueStore.get<String>(Key.VegobjekterUpdateLastStart)
            ?: KeyValueStore.get<Instant>(Key.VegobjekterImportStarted)?.toString()
            ?: error("Perform a backfill import before starting updates")

    var stop = false
    while (!stop) {
        println("Finding vegobjekt updates since: $lastUpdate")

        // Query the change log API to identify modified objects since last update
        val endringer = vegobjekterApi.getVegobjektEndringerForType(
            VegobjekterApi.GetVegobjektEndringerForTypeRequest()
                .vegobjekttypeId(vegobjektType)
                .start(lastUpdate)
        )

        if (endringer.metadata.returnert == 0) {
            stop = true
            println("No more vegobjekt updates found since $lastUpdate")
        } else {
            val updatedVersjonIds = endringer.vegobjektVersjonerEndret.map { VersjonId(it.id, it.versjon) }.toSet()
            val removedVersjonIds = endringer.vegobjektVersjonerFjernet.map { VersjonId(it.id, it.versjon) }.toSet()

            // Extract just the IDs for fetching current data
            val updatedIds = updatedVersjonIds.map { it.id }.toSet()

            // Selective reload: only fetch current data for objects identified as changed
            val vegobjekter = fetchUpdatedVegobjekter(vegobjektType, updatedIds)
            transaction {
                // Remove stale data for both deleted and updated objects using efficient batch delete
                val allVersjonIds = removedVersjonIds.plus(updatedVersjonIds)
                if (allVersjonIds.isNotEmpty()) {
                    Vegobjekter.deleteWhere {
                        allVersjonIds.map { versjonId ->
                            (Vegobjekter.id eq versjonId.id) and (Vegobjekter.versjon eq versjonId.versjon)
                        }.reduce { acc, condition -> acc or condition }
                    }
                }

                // Insert fresh data for updated objects (deleted objects are not re-inserted)
                Vegobjekter.batchInsert(vegobjekter) { vegobjekt ->
                    this[Vegobjekter.id] = vegobjekt.id
                    this[Vegobjekter.versjon] = vegobjekt.metadata!!.versjon
                    this[Vegobjekter.type] = vegobjekt.metadata!!.type.id
                    this[Vegobjekter.data] = vegobjekt.toJson()
                }

                // Advance the update cursor to prevent reprocessing the same changes
                lastUpdate = endringer.metadata.neste?.start
                if (lastUpdate != null) {
                    KeyValueStore.set(Key.VegobjekterUpdateLastStart, lastUpdate!!)
                } else {
                    stop = true
                }
            }
            println("Processed ${endringer.metadata.returnert} vegobjekt updates")
        }
    }
}

/**
 * Fetches current data for a specific set of vegobjekter.
 * Used during the update phase to reload only objects that have changed.
 */
private fun fetchUpdatedVegobjekter(vegobjektType: Int, vegobjektIds: Set<Long>): List<Vegobjekt> {
    val vegobjekter = mutableListOf<Vegobjekt>()

    var start: String? = null

    // Handle pagination when fetching specific vegobjekter by ID
    do {
        val response = vegobjekterApi.getVegobjekterByType(
            VegobjekterApi.GetVegobjekterByTypeRequest()
                .vegobjekttypeId(vegobjektType)
                .inkluder(setOf(InkluderIVegobjekt.ALLE))
                .start(start)
                .ider(vegobjektIds)
        )
        val elements = response.objekter
        vegobjekter.addAll(elements)
        start = response.metadata.neste?.start
    } while (elements.isNotEmpty() && start != null)

    return vegobjekter
}

/**
 * Initial backfill phase: paginated import of all existing vegobjekter data.
 *
 * This phase performs a complete dump of the NVDB vegobjekter dataset for the specified
 * vegobjekt type. Progress is tracked via pagination cursors to enable resumption
 * after interruptions without data loss or duplication.
 */
fun performVegobjekterImport(vegobjektType: Int, startFrom: String?) {
    var stop = false
    var start: String? = startFrom  // Resume from saved pagination cursor if available
    var totalImported = 0

    while (!stop) {
        // Fetch next page of vegobjekter
        val response = vegobjekterApi.getVegobjekterByType(
            VegobjekterApi.GetVegobjekterByTypeRequest()
                .inkluder(setOf(InkluderIVegobjekt.ALLE))
                .vegobjekttypeId(vegobjektType)
                .start(start)
        )

        if (response.objekter.isEmpty()) {
            stop = true
            println("Vegobjekter import completed. Total objects imported: $totalImported")

            // Mark backfill phase as completed, enabling transition to update phase
            KeyValueStore.set(Key.VegobjekterImportCompleted, Instant.now())
        } else {
            // Persist each page immediately to minimize data loss on interruption
            transaction {
                Vegobjekter.batchInsert(response.objekter) { vegobjekt ->
                    this[Vegobjekter.id] = vegobjekt.id
                    this[Vegobjekter.versjon] = vegobjekt.metadata!!.versjon
                    this[Vegobjekter.type] = vegobjekt.metadata!!.type.id
                    this[Vegobjekter.data] = vegobjekt.toJson()
                }

                // Save pagination cursor for potential resumption
                start = response.metadata?.neste?.start
                start?.let { KeyValueStore.set(Key.VegobjekterImportLastStart, it) }
            }

            totalImported += response.objekter.size
            println("Imported ${response.objekter.size} vegobjekter (total: $totalImported)")
        }
    }
}

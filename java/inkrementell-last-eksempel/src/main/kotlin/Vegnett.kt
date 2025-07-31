package no.vegvesen.vt.nvdb.apiles

import no.vegvesen.vt.nvdb.apiles.KeyValueStore.get
import no.vegvesen.vt.nvdb.vegnett.api.VegnettApi
import no.vegvesen.vt.nvdb.vegnett.model.Veglenkesegment
import org.jetbrains.exposed.v1.core.SqlExpressionBuilder.inList
import org.jetbrains.exposed.v1.jdbc.batchInsert
import org.jetbrains.exposed.v1.jdbc.deleteWhere
import org.jetbrains.exposed.v1.jdbc.transactions.transaction
import java.time.Instant
import java.time.ZoneOffset


val vegnettApi = VegnettApi()

fun importAndUpdateVegnett(kommune: Int) {
    // State variables for tracking import progress and resumption points
    val importStarted: Instant? = KeyValueStore.get<Instant>(Key.VegnettImportStarted)
    val importCompleted: Instant? = KeyValueStore.get<Instant>(Key.VegnettImportCompleted)
    val lastStart: String? = KeyValueStore.get<String>(Key.VegnettLastStart)  // Pagination cursor for resuming backfill

    // Determine which phase to execute based on persisted state
    if (importCompleted != null) {
        println("Import already completed")
    } else if (importStarted != null) {
        // Resume interrupted backfill from last known pagination position
        println("Resuming import from position: $lastStart")
        performVegnettImport(lastStart, kommune)
    } else {
        // Begin fresh backfill import
        println("Starting new import...")
        KeyValueStore.set(Key.VegnettImportStarted, Instant.now())
        performVegnettImport(null, kommune)
    }

    // Transition to event-driven update phase after backfill completion
    // Uses the completion timestamp as baseline for detecting subsequent changes
    performVegnettUpdate(kommune)
}

/**
 * Event-driven update phase: monitors for changes and selectively reloads modified data.
 *
 * This phase replaces expensive full table scans with targeted updates based on
 * change events from the NVDB endringer API. Only objects that have actually
 * changed since the last update are fetched and refreshed.
 */
private fun performVegnettUpdate(kommune: Int) {
    // Find updates from start of import to catch any changes that occurred during the backfill
    var lastUpdate =
        KeyValueStore.get<Instant>(Key.VegnettLastUpdate) ?: KeyValueStore.get(Key.VegnettImportStarted)
        ?: error("Perform a backfill import before starting updates")

    var stop = false
    while (!stop) {
        println("Finding updates since: $lastUpdate")

        // Query the change log API to identify modified objects since last update
        val endringer = vegnettApi.getVeglenkesekvensEndringer(
            VegnettApi.GetVeglenkesekvensEndringerRequest().kommune(setOf(kommune)).start(
                lastUpdate.atOffset(
                    ZoneOffset.UTC
                )
            )
        )
        if (endringer.metadata.returnert == 0) {
            stop = true
            println("No more updates found since $lastUpdate")
        } else {
            val updatedIds = endringer.veglenkesekvenserSegmentert.map { it.id }.toSet()
            val removedIds = endringer.veglenkesekvenserFjernet.map { it.id }.toSet()

            // Selective reload: only fetch current data for objects identified as changed
            val segments = fetchUpdatedSegments(updatedIds)
            transaction {
                // Remove stale data for both deleted and updated objects
                Veglenkesegmenter.deleteWhere {
                    Veglenkesegmenter.id inList removedIds.plus(updatedIds)
                }

                // Insert fresh data for updated objects (deleted objects are not re-inserted)
                Veglenkesegmenter.batchInsert(segments) { segment ->
                    this[Veglenkesegmenter.id] = segment.veglenkesekvensid
                    this[Veglenkesegmenter.veglenkeNummer] = segment.veglenkenummer
                    this[Veglenkesegmenter.segmentNummer] = segment.segmentnummer
                    this[Veglenkesegmenter.data] = segment.toJson()
                }

                // Advance the update cursor to prevent reprocessing the same changes
                lastUpdate = Instant.now()
                KeyValueStore.set(Key.VegnettLastUpdate, lastUpdate)
            }
            println("Processed ${endringer.metadata.returnert} updates")
        }
    }
}

/**
 * Fetches current data for a specific set of road network segments.
 * Used during the update phase to reload only objects that have changed.
 */
private fun fetchUpdatedSegments(segmentertIds: Set<Long>): List<Veglenkesegment> {
    val segments = mutableListOf<Veglenkesegment>()

    var start: String? = null

    // Handle pagination when fetching specific segments by ID
    do {
        val response = vegnettApi.getVeglenkesegmenter(
            VegnettApi.GetVeglenkesegmenterRequest().start(start).ider(
                segmentertIds
            )
        )
        val elements = response.objekter
        segments.addAll(elements)
        start = response.metadata?.neste?.start
    } while (elements.isNotEmpty())

    return segments
}

/**
 * Initial backfill phase: paginated import of all existing road network data.
 *
 * This phase performs a complete dump of the NVDB dataset for the specified
 * municipality. Progress is tracked via pagination cursors to enable resumption
 * after interruptions without data loss or duplication.
 */
fun performVegnettImport(startFrom: String?, kommune: Int) {
    var stop = false
    var start: String? = startFrom  // Resume from saved pagination cursor if available
    var totalImported = 0

    while (!stop) {
        // Fetch next page of road network segments
        val response = vegnettApi.getVeglenkesegmenter(
            VegnettApi.GetVeglenkesegmenterRequest().kommune(setOf(kommune)).start(start)
        )

        if (response.objekter.isEmpty()) {
            stop = true
            println("Import completed. Total segments imported: $totalImported")

            // Mark backfill phase as completed, enabling transition to update phase
            KeyValueStore.set(Key.VegnettImportCompleted, Instant.now())
        } else {
            // Persist each page immediately to minimize data loss on interruption
            transaction {
                Veglenkesegmenter.batchInsert(response.objekter) { segment ->
                    this[Veglenkesegmenter.id] = segment.veglenkesekvensid
                    this[Veglenkesegmenter.veglenkeNummer] = segment.veglenkenummer
                    this[Veglenkesegmenter.segmentNummer] = segment.segmentnummer
                    this[Veglenkesegmenter.data] = segment.toJson()
                }

                // Save pagination cursor for potential resumption
                start = response.metadata?.neste?.start
                start?.let { KeyValueStore.set(Key.VegnettLastStart, it) }
            }

            totalImported += response.objekter.size
            println("Imported ${response.objekter.size} segments (total: $totalImported)")
        }
    }
}

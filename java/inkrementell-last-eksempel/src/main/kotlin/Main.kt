@file:OptIn(ExperimentalTime::class)

package no.vegvesen.vt.nvdb.apiles

import no.vegvesen.vt.nvdb.apiles.KeyValueStore.get
import java.time.Instant
import kotlin.time.ExperimentalTime


/**
 * Implements a resumable incremental import pattern for NVDB road network data.
 *
 * The system operates in two distinct phases:
 * 1. Initial backfill: Paginated bulk import of all existing data
 * 2. Event-driven updates: Continuous monitoring for changes using the endringer API
 *
 * State persistence allows the system to resume from interruptions at any point.
 */
fun main() {
    initializeDatabase()

    val kommune = 5001 // Example municipality ID for testing
    importAndUpdateVegnett(kommune)

    val vegobjektType = 3 // Example type ID for testing
    importAndUpdateVegobjekter(vegobjektType)
}

fun importAndUpdateVegobjekter(vegobjektType: Int) {
    // State variables for tracking import progress and resumption points
    val importStarted: Instant? = KeyValueStore.get<Instant>(Key.VegobjekterImportStarted)
    val importCompleted: Instant? = KeyValueStore.get<Instant>(Key.VegobjekterImportCompleted)
    val lastStart: String? =
        KeyValueStore.get<String>(Key.VegobjekterLastStart)  // Pagination cursor for resuming backfill

    // Determine which phase to execute based on persisted state
    if (importCompleted != null) {
        println("Import already completed")
    } else if (importStarted != null) {
        // Resume interrupted backfill from last known pagination position
        println("Resuming import from position: $lastStart")
        performVegobjekterImport(vegobjektType, lastStart)
    } else {
        // Begin fresh backfill import
        println("Starting new import...")
        KeyValueStore.set(Key.VegobjekterImportStarted, Instant.now())
        performVegobjekterImport(vegobjektType, null)
    }

    // Transition to event-driven update phase after backfill completion
    // Uses the completion timestamp as baseline for detecting subsequent changes
    performVegobjekterUpdate(vegobjektType)
}

fun performVegobjekterImport(vegobjektType: Int, lastStart: String?) {

}

fun performVegobjekterUpdate(vegobjektType: Int) {
    TODO("Not yet implemented")
}


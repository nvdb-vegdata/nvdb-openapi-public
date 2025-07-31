@file:OptIn(ExperimentalTime::class)

package no.vegvesen.vt.nvdb.apiles

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

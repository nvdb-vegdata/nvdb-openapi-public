package no.vegvesen.vt.nvdb.apiles

import org.jetbrains.exposed.v1.core.Table
import org.jetbrains.exposed.v1.jdbc.Database
import org.jetbrains.exposed.v1.jdbc.SchemaUtils
import org.jetbrains.exposed.v1.jdbc.transactions.transaction
import java.io.File

/**
 * Database schema definitions for the NVDB incremental import system.
 * These tables support a two-phase import strategy: initial backfill followed by event-driven updates.
 */

object Vegobjekter : Table() {
    val id = long("id")
    val versjon = integer("versjon")
    val type = integer("type")
    val data = text("data")

    override val primaryKey = PrimaryKey(id, versjon)
}

object Veglenkesegmenter : Table() {
    val id = long("id")
    val veglenkeNummer = integer("veglenke_nummer")
    val segmentNummer = integer("segment_nummer")
    val data = text("data")

    override val primaryKey = PrimaryKey(id, veglenkeNummer, segmentNummer)
}

/**
 * Key-value store for maintaining import state across application restarts.
 * Enables resumable imports by tracking progress and timestamps.
 */
object KeyValue : Table() {
    val key = varchar("key", 255)
    val value = text("value")

    override val primaryKey = PrimaryKey(key)
}

fun initializeDatabase() {
    val dbFile = File("nvdb.db")
    Database.connect("jdbc:sqlite:${dbFile.absolutePath}")
    println("Prepared connection to SQLite database: ${dbFile.absolutePath}")

    transaction {
        SchemaUtils.create(Vegobjekter, Veglenkesegmenter, KeyValue)
        println("Tables created/verified: Vegobjekter, Veglenkesegmenter, KeyValue")
    }
}

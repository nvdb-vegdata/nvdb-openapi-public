@file:OptIn(ExperimentalTime::class)

package no.vegvesen.vt.nvdb.apiles

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import no.vegvesen.vt.nvdb.vegnett.api.VegnettApi
import org.jetbrains.exposed.v1.core.SqlExpressionBuilder.eq
import org.jetbrains.exposed.v1.core.Table
import org.jetbrains.exposed.v1.jdbc.*
import org.jetbrains.exposed.v1.jdbc.transactions.transaction
import java.io.File
import kotlin.time.Clock
import kotlin.time.ExperimentalTime
import kotlin.time.Instant

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

object KeyValue : Table() {
    val key = varchar("key", 255)
    val value = text("value")

    override val primaryKey = PrimaryKey(key)
}

val objectMapper = ObjectMapper().apply {
    registerModule(JavaTimeModule())
}

fun Any.toJson(): String = objectMapper.writeValueAsString(this)

fun <T : Any> String.fromJson(clazz: Class<T>): T =
    objectMapper.readValue<T>(this, clazz)

fun main() {
    val dbFile = File("nvdb.db")
    Database.connect("jdbc:sqlite:${dbFile.absolutePath}", "org.sqlite.JDBC")
    println("Prepared connection to SQLite database: ${dbFile.absolutePath}")

    val vegnettApi = VegnettApi()

    transaction {
        SchemaUtils.create(Vegobjekter, Veglenkesegmenter, KeyValue)
        println("Tables created/verified: Vegobjekter, Veglenkesegmenter, KeyValue")
    }

    // Check import status
    val importStatus = transaction {
        val importStarted = KeyValue.select(KeyValue.value)
            .where { KeyValue.key eq "ImportStarted" }
            .map { it[KeyValue.value] }
            .firstOrNull()
            ?.fromJson(Instant::class.java)

        val importCompleted = KeyValue.select(KeyValue.value)
            .where { KeyValue.key eq "ImportCompleted" }
            .map { it[KeyValue.value] }
            .firstOrNull()
            ?.fromJson(Instant::class.java)

        val lastStart = KeyValue.select(KeyValue.value)
            .where { KeyValue.key eq "LastStart" }
            .map { it[KeyValue.value] }
            .firstOrNull()

        Triple(importStarted, importCompleted, lastStart)
    }

    val (importStarted, importCompleted, lastStart) = importStatus

    if (importCompleted != null) {
        println("Import already completed")
    } else if (importStarted != null) {
        println("Resuming import from position: $lastStart")
        performImport(vegnettApi, lastStart)
    } else {
        println("Starting new import...")
        transaction {
            KeyValue.insert {
                it[key] = "ImportStarted"
                it[value] = Clock.System.now().toJson()
            }
        }
        performImport(vegnettApi, null)
    }
}

fun performImport(vegnettApi: VegnettApi, startFrom: String?) {
    var stop = false
    var start: String? = startFrom
    var totalImported = 0

    while (!stop) {
        val segmenter = vegnettApi.getVeglenkesegmenter(
            VegnettApi.GetVeglenkesegmenterRequest().kommune(setOf(5001)).start(start)
        )

        if (segmenter.objekter.isEmpty()) {
            stop = true
            println("Import completed. Total segments imported: $totalImported")

            // Mark import as completed
            transaction {
                KeyValue.insert {
                    it[key] = "ImportCompleted"
                    it[value] = Clock.System.now().toJson()
                }
            }
        } else {
            // Each fetch happens in its own transaction
            transaction {
                // Batch insert segmenter into Veglenkesegmenter
                Veglenkesegmenter.batchInsert(segmenter.objekter) { segment ->
                    this[Veglenkesegmenter.id] = segment.veglenkesekvensid
                    this[Veglenkesegmenter.veglenkeNummer] = segment.veglenkenummer
                    this[Veglenkesegmenter.segmentNummer] = segment.segmentnummer
                    this[Veglenkesegmenter.data] = segment.toJson()
                }

                // Save the next start position
                start = segmenter.metadata?.neste?.start
                if (start != null) {
                    // Delete existing LastStart entry if it exists
                    KeyValue.deleteWhere { KeyValue.key eq "LastStart" }
                    // Insert new LastStart entry
                    KeyValue.insert {
                        it[key] = "LastStart"
                        it[value] = start!!
                    }
                }
            }

            totalImported += segmenter.objekter.size
            println("Imported ${segmenter.objekter.size} segments (total: $totalImported)")
        }
    }

}

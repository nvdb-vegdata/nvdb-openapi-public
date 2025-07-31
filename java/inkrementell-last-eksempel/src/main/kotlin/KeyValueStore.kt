package no.vegvesen.vt.nvdb.apiles

import org.jetbrains.exposed.v1.jdbc.select
import org.jetbrains.exposed.v1.jdbc.transactions.transaction
import org.jetbrains.exposed.v1.jdbc.upsert

/**
 * Provides a simple key-value store for persisting import state.
 */
object KeyValueStore {

    inline fun <reified T : Any> KeyValueStore.get(key: Key): T? = transaction {
        KeyValue.select(KeyValue.value)
            .where { KeyValue.key eq key.name }
            .map { it[KeyValue.value] }
            .singleOrNull()
            ?.fromJson(T::class.java)
    }

    fun <T : Any> set(key: Key, value: T) = transaction {
        KeyValue.upsert {
            it[KeyValue.key] = key.name
            it[KeyValue.value] = value.toJson()
        }
    }
}

enum class Key {
    VegnettImportStarted,
    VegnettImportCompleted,
    VegnettLastStart,
    VegnettLastUpdate,
    VegobjekterImportStarted,
    VegobjekterImportCompleted,
    VegobjekterLastStart,
    VegobjekterLastUpdate
}

package no.vegvesen.vt.nvdb.apiles

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule

/**
 * JSON serialization utilities for the NVDB import system.
 * Configured to handle Java 8 time types used throughout the application.
 */

val objectMapper = ObjectMapper().apply {
    registerModule(JavaTimeModule())
}

fun Any.toJson(): String = objectMapper.writeValueAsString(this)

fun <T : Any> String.fromJson(clazz: Class<T>): T =
    objectMapper.readValue<T>(this, clazz)
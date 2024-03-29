/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package no.vegvesen.nvdb.datakatalog.model


import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param id 
 * @param dato 
 * @param versjon 
 */
@Serializable

data class Versjon (

    @SerialName(value = "id") @Required val id: kotlin.Int,

    @SerialName(value = "dato") @Required val dato: java.time.LocalDate,

    @SerialName(value = "versjon") @Required val versjon: kotlin.String

)


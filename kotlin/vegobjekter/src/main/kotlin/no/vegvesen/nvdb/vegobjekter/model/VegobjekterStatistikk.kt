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

package no.vegvesen.nvdb.vegobjekter.model


import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param antall 
 * @param lengde 
 */
@Serializable

data class VegobjekterStatistikk (

    @SerialName(value = "antall") val antall: kotlin.Int? = null,

    @SerialName(value = "lengde") val lengde: kotlin.Double? = null

)


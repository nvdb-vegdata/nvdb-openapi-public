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
 * @param navn 
 * @param gatekode 
 * @param sideveg 
 */
@Serializable

data class Gate (

    @SerialName(value = "navn") @Required val navn: kotlin.String,

    @SerialName(value = "gatekode") @Required val gatekode: kotlin.Int,

    @SerialName(value = "sideveg") val sideveg: kotlin.Boolean? = null

)


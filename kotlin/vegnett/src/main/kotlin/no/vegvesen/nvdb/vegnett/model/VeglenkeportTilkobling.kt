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

package no.vegvesen.nvdb.vegnett.model


import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param portnummer 
 * @param nodeid 
 * @param href 
 */
@Serializable

data class VeglenkeportTilkobling (

    @SerialName(value = "portnummer") @Required val portnummer: kotlin.Int,

    @SerialName(value = "nodeid") @Required val nodeid: kotlin.Long,

    @SerialName(value = "href") @Required val href: kotlin.String

)


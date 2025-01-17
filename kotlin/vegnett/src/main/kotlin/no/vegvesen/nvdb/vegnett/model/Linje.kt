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

import no.vegvesen.nvdb.vegnett.model.Segment

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param type 
 * @param veglenkesekvensid 
 * @param startposisjon 
 * @param sluttposisjon 
 * @param kortform 
 */
@Serializable

data class Linje (

    @SerialName(value = "type") @Required override val type: kotlin.String,

    @SerialName(value = "veglenkesekvensid") @Required val veglenkesekvensid: kotlin.Long,

    @SerialName(value = "startposisjon") @Required val startposisjon: kotlin.Double,

    @SerialName(value = "sluttposisjon") @Required val sluttposisjon: kotlin.Double,

    @SerialName(value = "kortform") @Required val kortform: kotlin.String

) : Segment


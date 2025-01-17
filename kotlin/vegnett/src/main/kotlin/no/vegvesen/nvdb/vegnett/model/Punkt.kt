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
 * @param relativPosisjon 
 * @param kortform 
 */
@Serializable

data class Punkt (

    @SerialName(value = "type") @Required override val type: kotlin.String,

    @SerialName(value = "veglenkesekvensid") @Required val veglenkesekvensid: kotlin.Long,

    @SerialName(value = "relativPosisjon") @Required val relativPosisjon: kotlin.Double,

    @SerialName(value = "kortform") @Required val kortform: kotlin.String

) : Segment


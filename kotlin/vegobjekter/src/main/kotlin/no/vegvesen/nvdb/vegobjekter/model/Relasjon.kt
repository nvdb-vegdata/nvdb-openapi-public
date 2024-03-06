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

import no.vegvesen.nvdb.vegobjekter.model.VegobjektType

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param listeid 
 * @param id 
 * @param type 
 * @param vegobjekter 
 */
@Serializable

data class Relasjon (

    @SerialName(value = "listeid") @Required val listeid: kotlin.Int,

    @SerialName(value = "id") @Required val id: kotlin.Int,

    @SerialName(value = "type") @Required val type: VegobjektType,

    @SerialName(value = "vegobjekter") @Required val vegobjekter: kotlin.String

)


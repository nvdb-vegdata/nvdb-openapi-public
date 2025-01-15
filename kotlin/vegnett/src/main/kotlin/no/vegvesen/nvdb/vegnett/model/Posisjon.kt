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

import no.vegvesen.nvdb.vegnett.model.PosisjonGeometri
import no.vegvesen.nvdb.vegnett.model.PosisjonVeglenkesekvens
import no.vegvesen.nvdb.vegnett.model.Vegsystemreferanse

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param vegsystemreferanse 
 * @param veglenkesekvens 
 * @param geometri 
 * @param kommune 
 */
@Serializable

data class Posisjon (

    @SerialName(value = "vegsystemreferanse") @Required val vegsystemreferanse: Vegsystemreferanse,

    @SerialName(value = "veglenkesekvens") @Required val veglenkesekvens: PosisjonVeglenkesekvens,

    @SerialName(value = "geometri") @Required val geometri: PosisjonGeometri,

    @SerialName(value = "kommune") @Required val kommune: kotlin.Int

)


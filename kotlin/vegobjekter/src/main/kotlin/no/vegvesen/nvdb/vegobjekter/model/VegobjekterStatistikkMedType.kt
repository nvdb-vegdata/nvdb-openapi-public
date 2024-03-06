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

import no.vegvesen.nvdb.vegobjekter.model.VegobjekterStatistikk

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param id 
 * @param navn 
 * @param href 
 * @param statistikk 
 */
@Serializable

data class VegobjekterStatistikkMedType (

    @SerialName(value = "id") @Required val id: kotlin.Int,

    @SerialName(value = "navn") @Required val navn: kotlin.String,

    @SerialName(value = "href") @Required val href: kotlin.String,

    @SerialName(value = "statistikk") @Required val statistikk: VegobjekterStatistikk

)

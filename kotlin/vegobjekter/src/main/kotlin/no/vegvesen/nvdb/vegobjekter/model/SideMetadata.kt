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

import no.vegvesen.nvdb.vegobjekter.model.NesteSide

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param returnert 
 * @param sidestørrelse 
 * @param antall 
 * @param neste 
 */
@Serializable

data class SideMetadata (

    @SerialName(value = "returnert") @Required val returnert: kotlin.Int,

    @SerialName(value = "sidestørrelse") @Required val sidestørrelse: kotlin.Int,

    @SerialName(value = "antall") val antall: kotlin.Int? = null,

    @SerialName(value = "neste") val neste: NesteSide? = null

)


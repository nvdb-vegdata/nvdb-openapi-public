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

import no.vegvesen.nvdb.vegobjekter.model.Kryssystem
import no.vegvesen.nvdb.vegobjekter.model.Sideanlegg
import no.vegvesen.nvdb.vegobjekter.model.Strekning
import no.vegvesen.nvdb.vegobjekter.model.Vegsystem

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param vegsystem 
 * @param strekning 
 * @param kryssystem 
 * @param sideanlegg 
 * @param kortform 
 */
@Serializable

data class Vegsystemreferanse (

    @SerialName(value = "vegsystem") val vegsystem: Vegsystem? = null,

    @SerialName(value = "strekning") val strekning: Strekning? = null,

    @SerialName(value = "kryssystem") val kryssystem: Kryssystem? = null,

    @SerialName(value = "sideanlegg") val sideanlegg: Sideanlegg? = null,

    @SerialName(value = "kortform") val kortform: kotlin.String? = null

)


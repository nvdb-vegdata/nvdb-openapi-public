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

package no.vegvesen.nvdb.datakatalog.model

import no.vegvesen.nvdb.datakatalog.model.Assosiasjonstype

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param foreldre 
 * @param barn 
 */
@Serializable

data class Relasjonstyper (

    @SerialName(value = "foreldre") @Required val foreldre: kotlin.collections.List<Assosiasjonstype>,

    @SerialName(value = "barn") @Required val barn: kotlin.collections.List<Assosiasjonstype>

)

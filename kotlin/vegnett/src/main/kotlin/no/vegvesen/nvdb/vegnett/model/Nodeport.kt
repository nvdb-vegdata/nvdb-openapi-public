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

import no.vegvesen.nvdb.vegnett.model.NodeportTilkobling

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param id 
 * @param tilkobling 
 */
@Serializable

data class Nodeport (

    @SerialName(value = "id") @Required val id: kotlin.Int,

    @SerialName(value = "tilkobling") @Required val tilkobling: NodeportTilkobling

)


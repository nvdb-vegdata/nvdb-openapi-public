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

import no.vegvesen.nvdb.vegobjekter.model.Egenskap

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param id 
 * @param navn 
 * @param egenskapstype 
 * @param blobId 
 * @param blobFormat 
 * @param href 
 */
@Serializable

data class BinaerEgenskap (

    @SerialName(value = "id") @Required override val id: kotlin.Int,

    @SerialName(value = "navn") @Required override val navn: kotlin.String,

    @SerialName(value = "egenskapstype") @Required override val egenskapstype: BinaerEgenskap.Egenskapstype,

    @SerialName(value = "blob_id") val blobId: kotlin.Int? = null,

    @SerialName(value = "blob_format") val blobFormat: kotlin.String? = null,

    @SerialName(value = "href") val href: kotlin.String? = null

) : Egenskap


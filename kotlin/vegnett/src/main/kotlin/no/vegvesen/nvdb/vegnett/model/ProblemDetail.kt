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


import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param type 
 * @param title 
 * @param status 
 * @param detail 
 * @param instance 
 * @param properties 
 */
@Serializable

data class ProblemDetail (

    @SerialName(value = "type") val type: kotlin.String? = null,

    @SerialName(value = "title") val title: kotlin.String? = null,

    @SerialName(value = "status") val status: kotlin.Int? = null,

    @SerialName(value = "detail") val detail: kotlin.String? = null,

    @SerialName(value = "instance") val instance: kotlin.String? = null,

    @SerialName(value = "properties") val properties: kotlin.collections.Map<kotlin.String, kotlin.String>? = null

)


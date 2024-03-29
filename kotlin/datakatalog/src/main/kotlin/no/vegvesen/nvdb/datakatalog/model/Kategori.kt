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


import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param id 
 * @param sorteringsnummer 
 * @param navn 
 * @param kortnavn 
 * @param beskrivelse 
 * @param startDato 
 */
@Serializable

data class Kategori (

    @SerialName(value = "id") @Required val id: kotlin.Int,

    @SerialName(value = "sorteringsnummer") @Required val sorteringsnummer: kotlin.Int,

    @SerialName(value = "navn") val navn: kotlin.String? = null,

    @SerialName(value = "kortnavn") val kortnavn: kotlin.String? = null,

    @SerialName(value = "beskrivelse") val beskrivelse: kotlin.String? = null,

    @SerialName(value = "startDato") val startDato: java.time.LocalDate? = null

)


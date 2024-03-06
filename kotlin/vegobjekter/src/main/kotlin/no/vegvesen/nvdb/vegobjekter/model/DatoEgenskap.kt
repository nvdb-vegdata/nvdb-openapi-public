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
 * @param verdi 
 */
@Serializable

data class DatoEgenskap (

    @SerialName(value = "id") @Required override val id: kotlin.Int,

    @SerialName(value = "navn") @Required override val navn: kotlin.String,

    @SerialName(value = "egenskapstype") @Required override val egenskapstype: DatoEgenskap.Egenskapstype,

    @SerialName(value = "verdi") val verdi: java.time.LocalDate? = null

) : Egenskap


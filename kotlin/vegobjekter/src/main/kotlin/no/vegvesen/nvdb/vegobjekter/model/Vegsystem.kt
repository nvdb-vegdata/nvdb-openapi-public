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


import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param id 
 * @param versjon 
 * @param vegkategori 
 * @param fase 
 * @param nummer 
 */
@Serializable

data class Vegsystem (

    @SerialName(value = "id") @Required val id: kotlin.Long,

    @SerialName(value = "versjon") @Required val versjon: kotlin.Int,

    @SerialName(value = "vegkategori") @Required val vegkategori: Vegsystem.Vegkategori,

    @SerialName(value = "fase") @Required val fase: Vegsystem.Fase,

    @SerialName(value = "nummer") @Required val nummer: kotlin.Int

) {

    /**
     * 
     *
     * Values: e,f,k,p,r,s
     */
    @Serializable
    enum class Vegkategori(val value: kotlin.String) {
        @SerialName(value = "E") e("E"),
        @SerialName(value = "F") f("F"),
        @SerialName(value = "K") k("K"),
        @SerialName(value = "P") p("P"),
        @SerialName(value = "R") r("R"),
        @SerialName(value = "S") s("S");
    }
    /**
     * 
     *
     * Values: p,a,v,f
     */
    @Serializable
    enum class Fase(val value: kotlin.String) {
        @SerialName(value = "P") p("P"),
        @SerialName(value = "A") a("A"),
        @SerialName(value = "V") v("V"),
        @SerialName(value = "F") f("F");
    }
}

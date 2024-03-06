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
 * @param navn 
 * @param egenskapstype 
 */


interface Egenskap {

    @SerialName(value = "id") @Required val id: kotlin.Int
    @SerialName(value = "navn") @Required val navn: kotlin.String
    @SerialName(value = "egenskapstype") @Required val egenskapstype: Egenskap.Egenskapstype
    /**
     * 
     *
     * Values: assosiasjon,boolsk,binær,tekst,dato,flyttall,heltall,struktur,geometri,stedfesting,kortdato,tid,liste,tekstenum,heltallenum,flyttallenum
     */
    @Serializable
    enum class Egenskapstype(val value: kotlin.String) {
        @SerialName(value = "Assosiasjon") assosiasjon("Assosiasjon"),
        @SerialName(value = "Boolsk") boolsk("Boolsk"),
        @SerialName(value = "Binær") binær("Binær"),
        @SerialName(value = "Tekst") tekst("Tekst"),
        @SerialName(value = "Dato") dato("Dato"),
        @SerialName(value = "Flyttall") flyttall("Flyttall"),
        @SerialName(value = "Heltall") heltall("Heltall"),
        @SerialName(value = "Struktur") struktur("Struktur"),
        @SerialName(value = "Geometri") geometri("Geometri"),
        @SerialName(value = "Stedfesting") stedfesting("Stedfesting"),
        @SerialName(value = "Kortdato") kortdato("Kortdato"),
        @SerialName(value = "Tid") tid("Tid"),
        @SerialName(value = "Liste") liste("Liste"),
        @SerialName(value = "Tekstenum") tekstenum("Tekstenum"),
        @SerialName(value = "Heltallenum") heltallenum("Heltallenum"),
        @SerialName(value = "Flyttallenum") flyttallenum("Flyttallenum");
    }
}


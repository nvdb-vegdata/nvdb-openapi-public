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

import no.vegvesen.nvdb.datakatalog.model.AssosiasjonstypeVegobjekttype

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param id 
 * @param egenskapstype 
 * @param type 
 * @param innenforMor 
 * @param relasjonstype 
 * @param navn 
 */
@Serializable

data class AssosiasjonstypeListeInnhold (

    @SerialName(value = "id") @Required val id: kotlin.Int,

    @SerialName(value = "egenskapstype") @Required val egenskapstype: kotlin.String,

    @SerialName(value = "type") @Required val type: AssosiasjonstypeVegobjekttype,

    @SerialName(value = "innenfor_mor") val innenforMor: AssosiasjonstypeListeInnhold.InnenforMor? = null,

    @SerialName(value = "relasjonstype") val relasjonstype: AssosiasjonstypeListeInnhold.Relasjonstype? = null,

    @SerialName(value = "navn") val navn: kotlin.String? = null

) {

    /**
     * 
     *
     * Values: nEI,jA,mEDAVVIK
     */
    @Serializable
    enum class InnenforMor(val value: kotlin.String) {
        @SerialName(value = "NEI") nEI("NEI"),
        @SerialName(value = "JA") jA("JA"),
        @SerialName(value = "MED_AVVIK") mEDAVVIK("MED_AVVIK");
    }
    /**
     * 
     *
     * Values: aSSOSIASJON,aGGREGERING,kOMPOSISJON,tOPOLOGI
     */
    @Serializable
    enum class Relasjonstype(val value: kotlin.String) {
        @SerialName(value = "ASSOSIASJON") aSSOSIASJON("ASSOSIASJON"),
        @SerialName(value = "AGGREGERING") aGGREGERING("AGGREGERING"),
        @SerialName(value = "KOMPOSISJON") kOMPOSISJON("KOMPOSISJON"),
        @SerialName(value = "TOPOLOGI") tOPOLOGI("TOPOLOGI");
    }
}

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

import no.vegvesen.nvdb.datakatalog.model.EgenskapstypeEnum
import no.vegvesen.nvdb.datakatalog.model.Viktighet

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param id 
 * @param egenskapstype 
 * @param avledet 
 * @param sorteringsnummer 
 * @param obligatoriskVerdi 
 * @param skrivebeskyttet 
 * @param sensitivitet 
 * @param høydereferanseTall 
 * @param nøyaktighetskravGrunnriss 
 * @param nøyaktighetskravHøyde 
 * @param referansegeometriTilstrekkelig 
 * @param viktighet 
 * @param kategori 
 * @param navn 
 * @param kortnavn 
 * @param beskrivelse 
 * @param sosinavn 
 * @param sosinvdbnavn 
 * @param komplementærEgenskapstype 
 * @param gruppesorteringsnummer 
 * @param veiledning 
 * @param grunnrissreferanse 
 * @param høydereferanse 
 * @param sosiReferanse 
 */


interface Stedfesting {

    @SerialName(value = "id") @Required val id: kotlin.Int
    @SerialName(value = "egenskapstype") @Required val egenskapstype: EgenskapstypeEnum
    @SerialName(value = "avledet") @Required val avledet: kotlin.Boolean
    @SerialName(value = "sorteringsnummer") @Required val sorteringsnummer: kotlin.Int
    @SerialName(value = "obligatorisk_verdi") @Required val obligatoriskVerdi: kotlin.Boolean
    @SerialName(value = "skrivebeskyttet") @Required val skrivebeskyttet: kotlin.Boolean
    @SerialName(value = "sensitivitet") @Required val sensitivitet: kotlin.Int
    @SerialName(value = "høydereferanse_tall") @Required val høydereferanseTall: kotlin.Int
    @SerialName(value = "nøyaktighetskrav_grunnriss") @Required val nøyaktighetskravGrunnriss: kotlin.Double
    @SerialName(value = "nøyaktighetskrav_høyde") @Required val nøyaktighetskravHøyde: kotlin.Double
    @SerialName(value = "referansegeometri_tilstrekkelig") @Required val referansegeometriTilstrekkelig: kotlin.Boolean
    @SerialName(value = "viktighet") @Required val viktighet: Viktighet
    @SerialName(value = "kategori") @Required val kategori: kotlin.Int
    @SerialName(value = "navn") val navn: kotlin.String?
    @SerialName(value = "kortnavn") val kortnavn: kotlin.String?
    @SerialName(value = "beskrivelse") val beskrivelse: kotlin.String?
    @SerialName(value = "sosinavn") val sosinavn: kotlin.String?
    @SerialName(value = "sosinvdbnavn") val sosinvdbnavn: kotlin.String?
    @SerialName(value = "komplementær_egenskapstype") val komplementærEgenskapstype: kotlin.Int?
    @SerialName(value = "gruppesorteringsnummer") val gruppesorteringsnummer: kotlin.Int?
    @SerialName(value = "veiledning") val veiledning: kotlin.String?
    @SerialName(value = "grunnrissreferanse") val grunnrissreferanse: kotlin.String?
    @SerialName(value = "høydereferanse") val høydereferanse: kotlin.String?
    @SerialName(value = "sosi_referanse") val sosiReferanse: kotlin.String?
}


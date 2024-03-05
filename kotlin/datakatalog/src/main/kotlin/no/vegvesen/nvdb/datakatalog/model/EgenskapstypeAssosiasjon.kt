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

import no.vegvesen.nvdb.datakatalog.model.Egenskapstype

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param id 
 * @param egenskapstype 
 * @param sorteringsnummer 
 * @param avledet 
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
 * @param tilknytning 
 * @param vegobjekttypeid 
 * @param innenforMor 
 * @param startdato 
 * @param sluttdato 
 * @param assosiasjonskrav 
 * @param assosiasjonskravkommentar 
 */
@Serializable

data class EgenskapstypeAssosiasjon (

    @SerialName(value = "id") @Required override val id: kotlin.Int,

    @SerialName(value = "egenskapstype") @Required override val egenskapstype: EgenskapstypeAssosiasjon.Egenskapstype,

    @SerialName(value = "sorteringsnummer") @Required override val sorteringsnummer: kotlin.Int,

    @SerialName(value = "avledet") @Required override val avledet: kotlin.Boolean,

    @SerialName(value = "obligatorisk_verdi") @Required override val obligatoriskVerdi: kotlin.Boolean,

    @SerialName(value = "skrivebeskyttet") @Required override val skrivebeskyttet: kotlin.Boolean,

    @SerialName(value = "sensitivitet") @Required override val sensitivitet: kotlin.Int,

    @SerialName(value = "høydereferanse_tall") @Required override val høydereferanseTall: kotlin.Int,

    @SerialName(value = "nøyaktighetskrav_grunnriss") @Required override val nøyaktighetskravGrunnriss: kotlin.Double,

    @SerialName(value = "nøyaktighetskrav_høyde") @Required override val nøyaktighetskravHøyde: kotlin.Double,

    @SerialName(value = "referansegeometri_tilstrekkelig") @Required override val referansegeometriTilstrekkelig: kotlin.Boolean,

    @SerialName(value = "viktighet") @Required override val viktighet: EgenskapstypeAssosiasjon.Viktighet,

    @SerialName(value = "kategori") @Required override val kategori: kotlin.Int,

    @SerialName(value = "navn") override val navn: kotlin.String? = null,

    @SerialName(value = "kortnavn") override val kortnavn: kotlin.String? = null,

    @SerialName(value = "beskrivelse") override val beskrivelse: kotlin.String? = null,

    @SerialName(value = "sosinavn") override val sosinavn: kotlin.String? = null,

    @SerialName(value = "sosinvdbnavn") override val sosinvdbnavn: kotlin.String? = null,

    @SerialName(value = "komplementær_egenskapstype") override val komplementærEgenskapstype: kotlin.Int? = null,

    @SerialName(value = "gruppesorteringsnummer") override val gruppesorteringsnummer: kotlin.Int? = null,

    @SerialName(value = "veiledning") override val veiledning: kotlin.String? = null,

    @SerialName(value = "grunnrissreferanse") override val grunnrissreferanse: kotlin.String? = null,

    @SerialName(value = "høydereferanse") override val høydereferanse: kotlin.String? = null,

    @SerialName(value = "sosi_referanse") override val sosiReferanse: kotlin.String? = null,

    @SerialName(value = "tilknytning") val tilknytning: kotlin.Int? = null,

    @SerialName(value = "vegobjekttypeid") val vegobjekttypeid: kotlin.Int? = null,

    @SerialName(value = "innenfor_mor") val innenforMor: kotlin.Int? = null,

    @SerialName(value = "startdato") val startdato: java.time.LocalDate? = null,

    @SerialName(value = "sluttdato") val sluttdato: java.time.LocalDate? = null,

    @SerialName(value = "assosiasjonskrav") val assosiasjonskrav: kotlin.Int? = null,

    @SerialName(value = "assosiasjonskravkommentar") val assosiasjonskravkommentar: kotlin.String? = null

) : Egenskapstype


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
import no.vegvesen.nvdb.datakatalog.model.Enhet
import no.vegvesen.nvdb.datakatalog.model.EnumverdiFlyttall

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param id 
 * @param sorteringsnummer 
 * @param avledet 
 * @param egenskapstype 
 * @param obligatoriskVerdi 
 * @param skrivebeskyttet 
 * @param sensitivitet 
 * @param høydereferanseTall 
 * @param nøyaktighetskravGrunnriss 
 * @param nøyaktighetskravHøyde 
 * @param referansegeometriTilstrekkelig 
 * @param viktighet 
 * @param kategori 
 * @param lengdeavhengigVerdi 
 * @param ajourholdSnu 
 * @param fortegnsendringSnu 
 * @param tillatteVerdier 
 * @param kortnavn 
 * @param beskrivelse 
 * @param sosinavn 
 * @param sosinvdbnavn 
 * @param komplementærEgenskapstype 
 * @param navn 
 * @param gruppesorteringsnummer 
 * @param veiledning 
 * @param grunnrissreferanse 
 * @param høydereferanse 
 * @param sosiReferanse 
 * @param objektlisteDato 
 * @param sluttDato 
 * @param standardverdi 
 * @param minAnbefalt 
 * @param maksAnbefalt 
 * @param min 
 * @param maks 
 * @param desimaler 
 * @param feltlengde 
 * @param enhet 
 */
@Serializable

data class EgenskapstypeFlyttallenum (

    @SerialName(value = "id") @Required override val id: kotlin.Int,

    @SerialName(value = "sorteringsnummer") @Required override val sorteringsnummer: kotlin.Int,

    @SerialName(value = "avledet") @Required override val avledet: kotlin.Boolean,

    @SerialName(value = "egenskapstype") @Required override val egenskapstype: EgenskapstypeFlyttallenum.Egenskapstype,

    @SerialName(value = "obligatorisk_verdi") @Required override val obligatoriskVerdi: kotlin.Boolean,

    @SerialName(value = "skrivebeskyttet") @Required override val skrivebeskyttet: kotlin.Boolean,

    @SerialName(value = "sensitivitet") @Required override val sensitivitet: kotlin.Int,

    @SerialName(value = "høydereferanse_tall") @Required override val høydereferanseTall: kotlin.Int,

    @SerialName(value = "nøyaktighetskrav_grunnriss") @Required override val nøyaktighetskravGrunnriss: kotlin.Double,

    @SerialName(value = "nøyaktighetskrav_høyde") @Required override val nøyaktighetskravHøyde: kotlin.Double,

    @SerialName(value = "referansegeometri_tilstrekkelig") @Required override val referansegeometriTilstrekkelig: kotlin.Boolean,

    @SerialName(value = "viktighet") @Required override val viktighet: EgenskapstypeFlyttallenum.Viktighet,

    @SerialName(value = "kategori") @Required override val kategori: kotlin.Int,

    @SerialName(value = "lengdeavhengig_verdi") @Required val lengdeavhengigVerdi: kotlin.Boolean,

    @SerialName(value = "ajourhold_snu") @Required val ajourholdSnu: kotlin.Boolean,

    @SerialName(value = "fortegnsendring_snu") @Required val fortegnsendringSnu: kotlin.Boolean,

    @SerialName(value = "tillatte_verdier") @Required val tillatteVerdier: kotlin.collections.List<EnumverdiFlyttall>,

    @SerialName(value = "kortnavn") override val kortnavn: kotlin.String? = null,

    @SerialName(value = "beskrivelse") override val beskrivelse: kotlin.String? = null,

    @SerialName(value = "sosinavn") override val sosinavn: kotlin.String? = null,

    @SerialName(value = "sosinvdbnavn") override val sosinvdbnavn: kotlin.String? = null,

    @SerialName(value = "komplementær_egenskapstype") override val komplementærEgenskapstype: kotlin.Int? = null,

    @SerialName(value = "navn") override val navn: kotlin.String? = null,

    @SerialName(value = "gruppesorteringsnummer") override val gruppesorteringsnummer: kotlin.Int? = null,

    @SerialName(value = "veiledning") override val veiledning: kotlin.String? = null,

    @SerialName(value = "grunnrissreferanse") override val grunnrissreferanse: kotlin.String? = null,

    @SerialName(value = "høydereferanse") override val høydereferanse: kotlin.String? = null,

    @SerialName(value = "sosi_referanse") override val sosiReferanse: kotlin.String? = null,

    @SerialName(value = "objektliste_dato") val objektlisteDato: java.time.LocalDate? = null,

    @SerialName(value = "slutt_dato") val sluttDato: java.time.LocalDate? = null,

    @SerialName(value = "standardverdi") val standardverdi: kotlin.Double? = null,

    @SerialName(value = "min_anbefalt") val minAnbefalt: kotlin.Double? = null,

    @SerialName(value = "maks_anbefalt") val maksAnbefalt: kotlin.Double? = null,

    @SerialName(value = "min") val min: kotlin.Double? = null,

    @SerialName(value = "maks") val maks: kotlin.Double? = null,

    @SerialName(value = "desimaler") val desimaler: kotlin.Int? = null,

    @SerialName(value = "feltlengde") val feltlengde: kotlin.Int? = null,

    @SerialName(value = "enhet") val enhet: Enhet? = null

) : Egenskapstype


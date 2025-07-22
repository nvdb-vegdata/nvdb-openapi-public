package no.vegvesen.vt.nvdb.vegobjekter.api

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.collections.shouldNotBeEmpty
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeInstanceOf
import kotlinx.coroutines.runBlocking
import no.vegvesen.vt.nvdb.vegobjekter.model.*

class VegobjekterApiTest() : ShouldSpec({
    should("get vegobjekt") {
        val vegobjekter = VegobjekterApi()
        val fartsgrense = runBlocking {
            vegobjekter.getVegobjektById(
                78697179,
                setOf(InkluderIVegobjekt.ALLE),
                null,
                null,
                null,
                null,
                null,
                null,
            ).block()
        }
        with(fartsgrense!!) {
            id shouldBe 78697179
            with(egenskaper!!){
                shouldNotBeEmpty()
                any {
                    it.navn == "Fartsgrense" && it.egenskapstype == Egenskapstype.HELTALLENUM
                }
            }
        }
    }

    should("get vegobjekter") {
        val vegobjekter = VegobjekterApi()
        val antall = 20
        val fartsgrenser = runBlocking {
            vegobjekter.getVegobjekterByType(
                105,
                null,
                setOf(InkluderIVegobjekt.ALLE),
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                antall,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
            ).block()
        }
        with(fartsgrenser!!){
            metadata.returnert shouldBe antall
            objekter.size shouldBe antall
        }
    }

    should("get vegobjekt with kortdato-egenskap") {
        val vegobjekter = VegobjekterApi()
        val kortdatoVegobjekt = runBlocking {
            vegobjekter.getVegobjektByTypeAndId(
                721,
                190266874,
                setOf(InkluderIVegobjekt.ALLE),
                null,
                null,
                null,
                null,
                null,
                null
            ).block()
        }
        with(kortdatoVegobjekt!!){
            id shouldBe 190266874
            with(egenskaper!!){
                shouldNotBeEmpty()
                any {
                    it.egenskapstype == Egenskapstype.KORTDATO && (it as KortDatoEgenskap).verdi!!.matches("""^\d{2}-\d{2}$""".toRegex())
                }
            }
        }
    }

    should("get vegobjekt with dato-egenskap") {
        val vegobjekter = VegobjekterApi()
        val datoVegobjekt = runBlocking {
            vegobjekter.getVegobjektByTypeAndId(
                721,
                190266874,
                setOf(InkluderIVegobjekt.ALLE),
                null,
                null,
                null,
                null,
                null,
                null
            ).block()
        }
        with(datoVegobjekt!!){
            id shouldBe 190266874
            with(egenskaper!!){
                shouldNotBeEmpty()
                any {
                    it.egenskapstype == Egenskapstype.DATO && (it as DatoEgenskap).verdi != null
                }
            }
        }
    }

    should("get vegobjekt with tid-egenskap") {
        val vegobjekter = VegobjekterApi()
        val tidVegobjekt = runBlocking {
            vegobjekter.getVegobjektByTypeAndId(
                721,
                190266874,
                setOf(InkluderIVegobjekt.ALLE),
                null,
                null,
                null,
                null,
                null,
                null
            ).block()
        }
        with(tidVegobjekt!!){
            id shouldBe 190266874
            with(egenskaper!!){
                shouldNotBeEmpty()
                any {
                    it.egenskapstype == Egenskapstype.TID && (it as TidEgenskap).verdi!!.matches("""^\d{2}:\d{2}$""".toRegex())
                }
            }
        }
    }

    should("get relasjoner with dybde") {
        val vegobjekter = VegobjekterApi()
        val dybdeVegobjekt = runBlocking {
            vegobjekter.getVegobjektByTypeAndId(
                95,
                78735745,
                setOf(InkluderIVegobjekt.ALLE),
                null,
                null,
                null,
                "full",
                null,
                null
            ).block()
        }
        with(dybdeVegobjekt!!){
            id shouldBe 78735745
            relasjoner!!.barn!!.single()
                .shouldBeInstanceOf<RelasjonMedVegobjekter>()
                .vegobjekter.single()
                .relasjoner.shouldNotBeNull()
        }
    }
})

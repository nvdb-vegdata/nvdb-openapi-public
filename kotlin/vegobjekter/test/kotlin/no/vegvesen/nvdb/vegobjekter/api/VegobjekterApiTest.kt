package no.vegvesen.nvdb.vegobjekter.api

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.collections.shouldNotBeEmpty
import io.kotest.matchers.ints.shouldBeGreaterThan
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeInstanceOf
import kotlinx.coroutines.runBlocking
import no.vegvesen.nvdb.vegobjekter.model.*

class VegobjekterApiTest() : ShouldSpec({
    should("get vegobjekt") {
        val vegobjekter = VegobjekterApi()
        val fartsgrense = runBlocking {
            vegobjekter.getVegobjektById(
                78697179,
                setOf("alle"),
                null,
                null,
                null,
                null,
                null,
                null,
            ).body()
        }
        with(fartsgrense) {
            id shouldBe 78697179
            with(egenskaper!!){
                shouldNotBeEmpty()
                any {
                    it.navn == "Fartsgrense" && it.egenskapstype == Egenskap.Egenskapstype.Heltallenum
                }
            }
        }
    }

    should("get vegobjekter") {
        val vegobjekter = VegobjekterApi()
        val fartsgrenser = runBlocking {
            vegobjekter.getVegobjekterByType(
                105,
                null,
                listOf("alle"),
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
            ).body()
        }
        with(fartsgrenser){
            metadata.returnert shouldBeGreaterThan 0
            objekter.size shouldBe metadata.returnert
        }
    }

    should("get vegobjekt with kortdato-egenskap") {
        val vegobjekter = VegobjekterApi()
        val kortdatoVegobjekt = runBlocking {
            vegobjekter.getVegobjektById1(
                721,
                190266874,
                setOf("alle"),
                null,
                null,
                null,
                null,
                null,
                null
            ).body()
        }
        with(kortdatoVegobjekt){
            id shouldBe 190266874
            with(egenskaper!!){
                shouldNotBeEmpty()
                any {
                    it.egenskapstype == Egenskap.Egenskapstype.Kortdato && (it as KortDatoEgenskap).verdi!!.matches("""^\d{2}-\d{2}$""".toRegex())
                }
            }
        }
    }

    should("get vegobjekt with dato-egenskap") {
        val vegobjekter = VegobjekterApi()
        val datoVegobjekt = runBlocking {
            vegobjekter.getVegobjektById1(
                721,
                190266874,
                setOf("alle"),
                null,
                null,
                null,
                null,
                null,
                null
            ).body()
        }
        with(datoVegobjekt){
            id shouldBe 190266874
            with(egenskaper!!){
                shouldNotBeEmpty()
                any {
                    it.egenskapstype == Egenskap.Egenskapstype.Dato && (it as DatoEgenskap).verdi != null
                }
            }
        }
    }

    should("get vegobjekt with tid-egenskap") {
        val vegobjekter = VegobjekterApi()
        val tidVegobjekt = runBlocking {
            vegobjekter.getVegobjektById1(
                721,
                190266874,
                setOf("alle"),
                null,
                null,
                null,
                null,
                null,
                null
            ).body()
        }
        with(tidVegobjekt){
            id shouldBe 190266874
            with(egenskaper!!){
                shouldNotBeEmpty()
                any {
                    it.egenskapstype == Egenskap.Egenskapstype.Tid && (it as TidEgenskap).verdi!!.matches("""^\d{2}:\d{2}$""".toRegex())
                }
            }
        }
    }

    should("get relasjoner with dybde") {
        val vegobjekter = VegobjekterApi()
        val dybdeVegobjekt = runBlocking {
            vegobjekter.getVegobjektById1(
                95,
                78735745,
                setOf("alle"),
                null,
                null,
                null,
                "full",
                null,
                null
            ).body()
        }
        with(dybdeVegobjekt){
            id shouldBe 78735745
            relasjoner!!.barn!!.single()
                .shouldBeInstanceOf<RelasjonMedVegobjekter>()
                .vegobjekter.single()
                .relasjoner.shouldNotBeNull()
        }
    }
})

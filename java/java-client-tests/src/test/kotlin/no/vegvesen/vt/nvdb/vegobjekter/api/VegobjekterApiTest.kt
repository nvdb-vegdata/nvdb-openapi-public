package no.vegvesen.vt.nvdb.vegobjekter.api

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.collections.shouldNotBeEmpty
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeInstanceOf
import no.vegvesen.vt.nvdb.vegobjekter.model.*

class VegobjekterApiTest() : ShouldSpec({
    should("get vegobjekt") {
        val vegobjekter = VegobjekterApi()
        val fartsgrense =
            vegobjekter.getVegobjektById(
                VegobjekterApi.GetVegobjektByIdRequest().id(78697179)
                    .inkluder(setOf(InkluderIVegobjekt.ALLE))
            )
        with(fartsgrense!!) {
            id shouldBe 78697179
            with(egenskaper!!) {
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
        val fartsgrenser =
            vegobjekter.getVegobjekterByType(
                VegobjekterApi.GetVegobjekterByTypeRequest()
                    .vegobjekttypeId(105)
                    .inkluder(setOf(InkluderIVegobjekt.ALLE))
                    .antall(antall)
            )
        with(fartsgrenser!!) {
            metadata.returnert shouldBe antall
            objekter.size shouldBe antall
        }
    }

    should("get vegobjekt with kortdato-egenskap") {
        val vegobjekter = VegobjekterApi()
        val kortdatoVegobjekt =
            vegobjekter.getVegobjektByTypeAndId(
                VegobjekterApi.GetVegobjektByTypeAndIdRequest()
                    .vegobjekttypeId(721)
                    .vegobjektId(190266874)
                    .inkluder(setOf(InkluderIVegobjekt.ALLE))
            )
        with(kortdatoVegobjekt!!) {
            id shouldBe 190266874
            with(egenskaper!!) {
                shouldNotBeEmpty()
                any {
                    it.egenskapstype == Egenskapstype.KORTDATO && (it as KortDatoEgenskap).verdi!!.matches("""^\d{2}-\d{2}$""".toRegex())
                }
            }
        }
    }

    should("get vegobjekt with dato-egenskap") {
        val vegobjekter = VegobjekterApi()
        val datoVegobjekt =
            vegobjekter.getVegobjektByTypeAndId(
                VegobjekterApi.GetVegobjektByTypeAndIdRequest()
                    .vegobjekttypeId(721)
                    .vegobjektId(190266874)
                    .inkluder(setOf(InkluderIVegobjekt.ALLE))
            )
        with(datoVegobjekt!!) {
            id shouldBe 190266874
            with(egenskaper!!) {
                shouldNotBeEmpty()
                any {
                    it.egenskapstype == Egenskapstype.DATO && (it as DatoEgenskap).verdi != null
                }
            }
        }
    }

    should("get vegobjekt with tid-egenskap") {
        val vegobjekter = VegobjekterApi()
        val tidVegobjekt =
            vegobjekter.getVegobjektByTypeAndId(
                VegobjekterApi.GetVegobjektByTypeAndIdRequest()
                    .vegobjekttypeId(721)
                    .vegobjektId(190266874)
                    .inkluder(setOf(InkluderIVegobjekt.ALLE))
            )
        with(tidVegobjekt!!) {
            id shouldBe 190266874
            with(egenskaper!!) {
                shouldNotBeEmpty()
                any {
                    it.egenskapstype == Egenskapstype.TID && (it as TidEgenskap).verdi!!.matches("""^\d{2}:\d{2}$""".toRegex())
                }
            }
        }
    }

    should("get relasjoner with dybde") {
        val vegobjekter = VegobjekterApi()
        val dybdeVegobjekt =
            vegobjekter.getVegobjektByTypeAndId(
                VegobjekterApi.GetVegobjektByTypeAndIdRequest()
                    .vegobjekttypeId(95)
                    .vegobjektId(78735745)
                    .inkluder(setOf(InkluderIVegobjekt.ALLE))
                    .dybde("full")
            )
        with(dybdeVegobjekt!!) {
            id shouldBe 78735745
            relasjoner!!.barn!!.single()
                .shouldBeInstanceOf<RelasjonMedVegobjekter>()
                .vegobjekter.single()
                .relasjoner.shouldNotBeNull()
        }
    }
})

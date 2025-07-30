package no.vegvesen.vt.nvdb.datakatalog.api

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.ints.shouldBeGreaterThan
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.beInstanceOf
import kotlinx.coroutines.runBlocking
import no.vegvesen.vt.nvdb.datakatalog.model.EgenskapstypeEnum
import no.vegvesen.vt.nvdb.datakatalog.model.StedfestingEnkel
import no.vegvesen.vt.nvdb.datakatalog.model.StedfestingListe

class DatakatalogenApiTest() : ShouldSpec({
    should("get vegobjekttyper") {
        val datakatalogen = DatakatalogenApi()
        val vegobjekttyper = runBlocking {
            datakatalogen.getVegobjekttyper(null, null)
        }
        vegobjekttyper!!.size shouldBeGreaterThan 400
        vegobjekttyper.first().navn shouldBe "Skjerm"
    }

    should("get vegobjekttype 'Skjerm' with StedfestingListe") {
        val datakatalogen = DatakatalogenApi()
        val vegobjekttype = runBlocking {
            datakatalogen.getVegobjekttype(3, null)
        }
        with(vegobjekttype!!) {
            navn shouldBe "Skjerm"
            stedfesting!!.let {
                it should beInstanceOf<StedfestingListe>()
                it.egenskapstype shouldBe EgenskapstypeEnum.LISTE
            }
        }
    }

    should("get vegobjekttype 'Nedsenka kantstein' with StedfestingEnkel") {
        val datakatalogen = DatakatalogenApi()
        val vegobjekttype = runBlocking {
            datakatalogen.getVegobjekttype(10, null)
        }
        with(vegobjekttype!!) {
            navn shouldBe "Nedsenka kantstein"
            stedfesting!!.let {
                it should beInstanceOf<StedfestingEnkel>()
                it.egenskapstype shouldBe EgenskapstypeEnum.STEDFESTING
            }
        }
    }

    should("get egenskapstype 1087 with egenskapstype Tekstenum") {
        val datakatalogen = DatakatalogenApi()
        val egenskapstype = runBlocking {
            datakatalogen.getEgenskapstype(1087)
        }
        with(egenskapstype) {
            navn shouldBe "Materiale skjerm"
            egenskapstype.egenskapstype shouldBe EgenskapstypeEnum.TEKSTENUM
        }
    }

    should("get egenskapstype 1298 with egenskapstype Flyttall") {
        val datakatalogen = DatakatalogenApi()
        val egenskapstype = runBlocking {
            datakatalogen.getEgenskapstypeForVegobjekttype(5, 1298)
        }
        with(egenskapstype) {
            navn shouldBe "Lengde"
            egenskapstype.egenskapstype shouldBe EgenskapstypeEnum.FLYTTALL
        }
    }
})

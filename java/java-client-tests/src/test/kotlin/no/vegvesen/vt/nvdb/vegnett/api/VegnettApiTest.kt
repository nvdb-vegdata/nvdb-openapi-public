package no.vegvesen.vt.nvdb.vegnett.api

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.collections.shouldNotBeEmpty
import io.kotest.matchers.ints.shouldBeGreaterThan
import io.kotest.matchers.shouldBe

class VegnettApiTest() : ShouldSpec({
    should("get veglenkesekvenser") {
        val vegnett = VegnettApi()
        val antall = 20
        val veglenkesekvenser = vegnett.getVeglenkesekvenser(
            VegnettApi.GetVeglenkesekvenserRequest().antall(antall)
        )
        with(veglenkesekvenser!!) {
            metadata.returnert shouldBe antall
            objekter.size shouldBe antall
        }
    }

    should("get veglenkesekvens") {
        val vegnett = VegnettApi()
        val veglenkesekvens = vegnett.getVeglenkesekvens(41260, null)
        with(veglenkesekvens!!) {
            veglenkesekvensid shouldBe 41260
            veglenker.shouldNotBeEmpty()
        }
    }

    should("get veglenkesegmenter") {
        val vegnett = VegnettApi()
        val antall = 20
        val veglenkesegmenter = vegnett.getVeglenkesegmenter(
            VegnettApi.GetVeglenkesegmenterRequest().antall(antall)
        )
        with(veglenkesegmenter!!) {
            metadata.returnert shouldBe 20
            objekter.size shouldBe 20
        }
    }

    should("get veglenkesegment") {
        val vegnett = VegnettApi()
        val veglenkesegment = vegnett.getVeglenkesegmenter(
            VegnettApi.GetVeglenkesegmenterRequest().ider(setOf(41260))
        )
        with(veglenkesegment!!) {
            metadata.returnert shouldBeGreaterThan 0
            objekter.size shouldBe metadata.returnert
        }
    }

    should("get noder") {
        val vegnett = NoderApi()
        val antall = 20
        val noder = vegnett.getNoder(
            NoderApi.GetNoderRequest().antall(antall)
        )
        with(noder!!) {
            metadata.returnert shouldBe antall
            objekter.size shouldBe antall
        }
    }

    should("get node") {
        val vegnett = NoderApi()
        val node = vegnett.getNode(267330, null)
        with(node!!) {
            id shouldBe 267330
            porter.shouldNotBeEmpty()
        }
    }
})

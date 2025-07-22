package no.vegvesen.vt.nvdb.vegnett.api

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.collections.shouldNotBeEmpty
import io.kotest.matchers.ints.shouldBeGreaterThan
import io.kotest.matchers.shouldBe
import kotlinx.coroutines.runBlocking

class VegnettApiTest() : ShouldSpec({
    should("get veglenkesekvenser") {
        val vegnett = VegnettApi()
        val antall = 20
        val veglenkesekvenser = runBlocking {
            vegnett.getVeglenkesekvenser(
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
            ).block()
        }
        with(veglenkesekvenser!!) {
            metadata.returnert shouldBe antall
            objekter.size shouldBe antall
        }
    }

    should("get veglenkesekvens") {
        val vegnett = VegnettApi()
        val veglenkesekvens = runBlocking {
            vegnett.getVeglenkesekvens(41260, null).block()
        }
        with(veglenkesekvens!!){
            veglenkesekvensid shouldBe 41260
            veglenker.shouldNotBeEmpty()
        }
    }

    should("get veglenkesegmenter") {
        val vegnett = VegnettApi()
        val antall = 20
        val veglenkesegmenter = runBlocking {
            vegnett.getVeglenkesegmenter(
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
                antall,
                null,
                null,
            ).block()
        }
        with(veglenkesegmenter!!) {
            metadata.returnert shouldBe 20
            objekter.size shouldBe 20
        }
    }

    should("get veglenkesegment") {
        val vegnett = VegnettApi()
        val veglenkesegment = runBlocking {
            vegnett.getVeglenkesegmenter(
                null,
                setOf(41260),
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
            ).block()
        }
        with(veglenkesegment!!) {
            metadata.returnert shouldBeGreaterThan 0
            objekter.size shouldBe metadata.returnert
        }
    }

    should("get noder") {
        val vegnett = NoderApi()
        val antall = 20
        val noder = runBlocking {
            vegnett.getNoder(
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
                null
            ).block()
        }
        with(noder!!) {
            metadata.returnert shouldBe antall
            objekter.size shouldBe antall
        }
    }

    should("get node") {
        val vegnett = NoderApi()
        val node = runBlocking {
            vegnett.getNode(267330, null).block()
        }
        with(node!!) {
            id shouldBe 267330
            porter.shouldNotBeEmpty()
        }
    }
})

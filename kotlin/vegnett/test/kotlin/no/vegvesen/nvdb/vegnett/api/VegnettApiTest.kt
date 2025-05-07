package no.vegvesen.nvdb.vegnett.api

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.collections.shouldNotBeEmpty
import io.kotest.matchers.ints.shouldBeGreaterThan
import io.kotest.matchers.shouldBe
import kotlinx.coroutines.runBlocking

class VegnettApiTest() : ShouldSpec({
    should("get veglenkesekvenser") {
        val vegnett = VegnettApi()
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
                null,
                null,
            ).body()
        }
        with(veglenkesekvenser) {
            metadata.returnert shouldBeGreaterThan 0
            objekter.size shouldBe metadata.returnert
        }
    }

    should("get veglenkesekvens") {
        val vegnett = VegnettApi()
        val veglenkesekvens = runBlocking {
            vegnett.getVeglenkesekvens(41260, null).body()
        }
        with(veglenkesekvens){
            veglenkesekvensid shouldBe 41260
            veglenker.shouldNotBeEmpty()
        }
    }

    should("get veglenkesegmenter") {
        val vegnett = VegnettApi()
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
                null,
                null,
                null,
            ).body()
        }
        with(veglenkesegmenter) {
            metadata.returnert shouldBeGreaterThan 0
            objekter.size shouldBe metadata.returnert
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
            ).body()
        }
        with(veglenkesegment) {
            metadata.returnert shouldBeGreaterThan 0
            objekter.size shouldBe metadata.returnert
        }
    }

    should("get noder") {
        val vegnett = NoderApi()
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
                null,
                null,
                null
            ).body()
        }
        with(noder) {
            metadata.returnert shouldBeGreaterThan 0
            objekter.size shouldBe metadata.returnert
        }
    }

    should("get node") {
        val vegnett = NoderApi()
        val node = runBlocking {
            vegnett.getNode(267330, null).body()
        }
        with(node) {
            id shouldBe 267330
            porter.shouldNotBeEmpty()
        }
    }
})

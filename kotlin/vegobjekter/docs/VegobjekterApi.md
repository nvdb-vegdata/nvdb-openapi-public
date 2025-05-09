# VegobjekterApi

All URIs are relative to *https://nvdbapiles.atlas.vegvesen.no/vegobjekter-blue*

| Method                                                                         | HTTP request                                                          | Description                            |
| ------------------------------------------------------------------------------ | --------------------------------------------------------------------- | -------------------------------------- |
| [**getVegobjektById**](VegobjekterApi.md#getVegobjektById)                     | **GET** /api/v4/vegobjekt                                             | Hent enkelt vegobjekt                  |
| [**getVegobjektById1**](VegobjekterApi.md#getVegobjektById1)                   | **GET** /api/v4/vegobjekter/{vegobjekttypeId}/{vegobjektId}           | Hent gjeldende versjon av et vegobjekt |
| [**getVegobjektByIdAndVersjon**](VegobjekterApi.md#getVegobjektByIdAndVersjon) | **GET** /api/v4/vegobjekter/{vegobjekttypeId}/{vegobjektId}/{versjon} | Hent spesifikk versjon av et vegobjekt |
| [**getVegobjektVersjoner**](VegobjekterApi.md#getVegobjektVersjoner)           | **GET** /api/v4/vegobjekter/{vegobjekttypeId}/{vegobjektId}/versjoner | Hent alle versjoner av et vegobjekt    |
| [**getVegobjekterByType**](VegobjekterApi.md#getVegobjekterByType)             | **GET** /api/v4/vegobjekter/{vegobjekttypeId}                         | Hent vegobjekter av en type            |

<a id="getVegobjektById"></a>

# **getVegobjektById**

> Vegobjekt getVegobjektById(id, inkluder, srid, inkludergeometri, inkluderEgenskaper, dybde, geometritoleranse, tidspunkt)

Hent enkelt vegobjekt

### Example

```kotlin
// Import classes:
//import no.vegvesen.nvdb.vegobjekter.infrastructure.*
//import no.vegvesen.nvdb.vegobjekter.model.*

val apiInstance = VegobjekterApi()
val id : kotlin.Long = 789 // kotlin.Long | ID for vegobjekt som skal hentes.
val inkluder : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID.
val srid : kotlin.String = srid_example // kotlin.String | Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: <a href='https://epsg.io/5972'>EPSG:5972</a> <a href='https://epsg.io/5973'>EPSG:5973</a> <a href='https://epsg.io/5975'>EPSG:5975</a> <a href='https://epsg.io/4326'>EPSG:4326</a>.
val inkludergeometri : kotlin.String = inkludergeometri_example // kotlin.String | Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under `vegobjekt.egenskaper` om den finnes, stedfestet geometri er plassert under `vegobjekt.lokasjon`. I tillegg til de nevnte feltene på vegobjekt-responsen returneres også `vegobjekt.geometri` (dersom man har `inkluder=geometri` eller `alle`), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved å se på `vegobjekt.geometri.egengeometri`.
val inkluderEgenskaper : kotlin.String = inkluderEgenskaper_example // kotlin.String | Gir mulighet til å filtrere hvilke egenskaper som skal returneres med inkluder=egenskaper. `basis` er alle egenskaper som ikke er assosiasjoner, stedfesting, geometri, eller lister av disse.
val dybde : kotlin.String = dybde_example // kotlin.String | Hvor mange nivå barn skal inkluderes. 1 betyr bare IDer, 2-n betyr ett eller flere mellomnivåer, 'full' betyr alle nivåer.
val geometritoleranse : kotlin.Int = 56 // kotlin.Int | Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.
val tidspunkt : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Finner versjonen som var gyldig denne datoen.
try {
    val result : Vegobjekt = apiInstance.getVegobjektById(id, inkluder, srid, inkludergeometri, inkluderEgenskaper, dybde, geometritoleranse, tidspunkt)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VegobjekterApi#getVegobjektById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VegobjekterApi#getVegobjektById")
    e.printStackTrace()
}
```

### Parameters

| **id** | **kotlin.Long**| ID for vegobjekt som skal hentes. | |
| **inkluder** | **kotlin.collections.Set&lt;kotlin.String&gt;**| Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID. | [optional] [enum: metadata, egenskaper, relasjoner, lokasjon, vegsegmenter, geometri, alle, minimum] |
| **srid** | **kotlin.String**| Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;. | [optional] [enum: 5972, 5973, 5975, 4326, UTM32, UTM33, UTM35, WGS84] |
| **inkludergeometri** | **kotlin.String**| Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under &#x60;vegobjekt.egenskaper&#x60; om den finnes, stedfestet geometri er plassert under &#x60;vegobjekt.lokasjon&#x60;. I tillegg til de nevnte feltene på vegobjekt-responsen returneres også &#x60;vegobjekt.geometri&#x60; (dersom man har &#x60;inkluder&#x3D;geometri&#x60; eller &#x60;alle&#x60;), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved å se på &#x60;vegobjekt.geometri.egengeometri&#x60;. | [optional] [enum: ingen, egenskaper, lokasjon, utledet] |
| **inkluderEgenskaper** | **kotlin.String**| Gir mulighet til å filtrere hvilke egenskaper som skal returneres med inkluder&#x3D;egenskaper. &#x60;basis&#x60; er alle egenskaper som ikke er assosiasjoner, stedfesting, geometri, eller lister av disse. | [optional] [enum: basis, geometri, alle] |
| **dybde** | **kotlin.String**| Hvor mange nivå barn skal inkluderes. 1 betyr bare IDer, 2-n betyr ett eller flere mellomnivåer, &#39;full&#39; betyr alle nivåer. | [optional] |
| **geometritoleranse** | **kotlin.Int**| Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri. | [optional] |
| Name | Type | Description | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tidspunkt** | **java.time.LocalDate**| Finner versjonen som var gyldig denne datoen. | [optional] |

### Return type

**Vegobjekt**

### Authorization

Configure bearerAuth:
ApiClient.accessToken = ""

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

<a id="getVegobjektById1"></a>

# **getVegobjektById1**

> Vegobjekt getVegobjektById1(vegobjekttypeId, vegobjektId, inkluder, srid, inkludergeometri, inkluderEgenskaper, dybde, geometritoleranse, tidspunkt)

Hent gjeldende versjon av et vegobjekt

### Example

```kotlin
// Import classes:
//import no.vegvesen.nvdb.vegobjekter.infrastructure.*
//import no.vegvesen.nvdb.vegobjekter.model.*

val apiInstance = VegobjekterApi()
val vegobjekttypeId : kotlin.Int = 56 // kotlin.Int | Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.  Eksempel: 581
val vegobjektId : kotlin.Long = 789 // kotlin.Long |
val inkluder : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID.
val srid : kotlin.String = srid_example // kotlin.String | Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: <a href='https://epsg.io/5972'>EPSG:5972</a> <a href='https://epsg.io/5973'>EPSG:5973</a> <a href='https://epsg.io/5975'>EPSG:5975</a> <a href='https://epsg.io/4326'>EPSG:4326</a>.
val inkludergeometri : kotlin.String = inkludergeometri_example // kotlin.String | Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under `vegobjekt.egenskaper` om den finnes, stedfestet geometri er plassert under `vegobjekt.lokasjon`. I tillegg til de nevnte feltene på vegobjekt-responsen returneres også `vegobjekt.geometri` (dersom man har `inkluder=geometri` eller `alle`), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved å se på `vegobjekt.geometri.egengeometri`.
val inkluderEgenskaper : kotlin.String = inkluderEgenskaper_example // kotlin.String | Gir mulighet til å filtrere hvilke egenskaper som skal returneres med inkluder=egenskaper. `basis` er alle egenskaper som ikke er assosiasjoner, stedfesting, geometri, eller lister av disse.
val dybde : kotlin.String = dybde_example // kotlin.String | Hvor mange nivå barn skal inkluderes. 1 betyr bare IDer, 2-n betyr ett eller flere mellomnivåer, 'full' betyr alle nivåer.
val geometritoleranse : kotlin.Int = 56 // kotlin.Int | Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.
val tidspunkt : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Finner versjonen som var gyldig denne datoen.
try {
    val result : Vegobjekt = apiInstance.getVegobjektById1(vegobjekttypeId, vegobjektId, inkluder, srid, inkludergeometri, inkluderEgenskaper, dybde, geometritoleranse, tidspunkt)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VegobjekterApi#getVegobjektById1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VegobjekterApi#getVegobjektById1")
    e.printStackTrace()
}
```

### Parameters

| **vegobjekttypeId** | **kotlin.Int**| Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier. Eksempel: 581 | |
| **vegobjektId** | **kotlin.Long**| | |
| **inkluder** | **kotlin.collections.Set&lt;kotlin.String&gt;**| Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID. | [optional] [enum: metadata, egenskaper, relasjoner, lokasjon, vegsegmenter, geometri, alle, minimum] |
| **srid** | **kotlin.String**| Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;. | [optional] [enum: 5972, 5973, 5975, 4326, UTM32, UTM33, UTM35, WGS84] |
| **inkludergeometri** | **kotlin.String**| Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under &#x60;vegobjekt.egenskaper&#x60; om den finnes, stedfestet geometri er plassert under &#x60;vegobjekt.lokasjon&#x60;. I tillegg til de nevnte feltene på vegobjekt-responsen returneres også &#x60;vegobjekt.geometri&#x60; (dersom man har &#x60;inkluder&#x3D;geometri&#x60; eller &#x60;alle&#x60;), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved å se på &#x60;vegobjekt.geometri.egengeometri&#x60;. | [optional] [enum: ingen, egenskaper, lokasjon, utledet] |
| **inkluderEgenskaper** | **kotlin.String**| Gir mulighet til å filtrere hvilke egenskaper som skal returneres med inkluder&#x3D;egenskaper. &#x60;basis&#x60; er alle egenskaper som ikke er assosiasjoner, stedfesting, geometri, eller lister av disse. | [optional] [enum: basis, geometri, alle] |
| **dybde** | **kotlin.String**| Hvor mange nivå barn skal inkluderes. 1 betyr bare IDer, 2-n betyr ett eller flere mellomnivåer, &#39;full&#39; betyr alle nivåer. | [optional] |
| **geometritoleranse** | **kotlin.Int**| Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri. | [optional] |
| Name | Type | Description | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tidspunkt** | **java.time.LocalDate**| Finner versjonen som var gyldig denne datoen. | [optional] |

### Return type

**Vegobjekt**

### Authorization

Configure bearerAuth:
ApiClient.accessToken = ""

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

<a id="getVegobjektByIdAndVersjon"></a>

# **getVegobjektByIdAndVersjon**

> Vegobjekt getVegobjektByIdAndVersjon(vegobjekttypeId, vegobjektId, versjon, inkluder, srid, inkludergeometri, inkluderEgenskaper, dybde, geometritoleranse, tidspunkt)

Hent spesifikk versjon av et vegobjekt

### Example

```kotlin
// Import classes:
//import no.vegvesen.nvdb.vegobjekter.infrastructure.*
//import no.vegvesen.nvdb.vegobjekter.model.*

val apiInstance = VegobjekterApi()
val vegobjekttypeId : kotlin.Int = 56 // kotlin.Int | Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.  Eksempel: 581
val vegobjektId : kotlin.Long = 789 // kotlin.Long |
val versjon : kotlin.Int = 56 // kotlin.Int |
val inkluder : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID.
val srid : kotlin.String = srid_example // kotlin.String | Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: <a href='https://epsg.io/5972'>EPSG:5972</a> <a href='https://epsg.io/5973'>EPSG:5973</a> <a href='https://epsg.io/5975'>EPSG:5975</a> <a href='https://epsg.io/4326'>EPSG:4326</a>.
val inkludergeometri : kotlin.String = inkludergeometri_example // kotlin.String | Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under `vegobjekt.egenskaper` om den finnes, stedfestet geometri er plassert under `vegobjekt.lokasjon`. I tillegg til de nevnte feltene på vegobjekt-responsen returneres også `vegobjekt.geometri` (dersom man har `inkluder=geometri` eller `alle`), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved å se på `vegobjekt.geometri.egengeometri`.
val inkluderEgenskaper : kotlin.String = inkluderEgenskaper_example // kotlin.String | Gir mulighet til å filtrere hvilke egenskaper som skal returneres med inkluder=egenskaper. `basis` er alle egenskaper som ikke er assosiasjoner, stedfesting, geometri, eller lister av disse.
val dybde : kotlin.String = dybde_example // kotlin.String | Hvor mange nivå barn skal inkluderes. 1 betyr bare IDer, 2-n betyr ett eller flere mellomnivåer, 'full' betyr alle nivåer.
val geometritoleranse : kotlin.Int = 56 // kotlin.Int | Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.
val tidspunkt : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Finner versjonen som var gyldig denne datoen.
try {
    val result : Vegobjekt = apiInstance.getVegobjektByIdAndVersjon(vegobjekttypeId, vegobjektId, versjon, inkluder, srid, inkludergeometri, inkluderEgenskaper, dybde, geometritoleranse, tidspunkt)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VegobjekterApi#getVegobjektByIdAndVersjon")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VegobjekterApi#getVegobjektByIdAndVersjon")
    e.printStackTrace()
}
```

### Parameters

| **vegobjekttypeId** | **kotlin.Int**| Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier. Eksempel: 581 | |
| **vegobjektId** | **kotlin.Long**| | |
| **versjon** | **kotlin.Int**| | |
| **inkluder** | **kotlin.collections.Set&lt;kotlin.String&gt;**| Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID. | [optional] [enum: metadata, egenskaper, relasjoner, lokasjon, vegsegmenter, geometri, alle, minimum] |
| **srid** | **kotlin.String**| Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;. | [optional] [enum: 5972, 5973, 5975, 4326, UTM32, UTM33, UTM35, WGS84] |
| **inkludergeometri** | **kotlin.String**| Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under &#x60;vegobjekt.egenskaper&#x60; om den finnes, stedfestet geometri er plassert under &#x60;vegobjekt.lokasjon&#x60;. I tillegg til de nevnte feltene på vegobjekt-responsen returneres også &#x60;vegobjekt.geometri&#x60; (dersom man har &#x60;inkluder&#x3D;geometri&#x60; eller &#x60;alle&#x60;), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved å se på &#x60;vegobjekt.geometri.egengeometri&#x60;. | [optional] [enum: ingen, egenskaper, lokasjon, utledet] |
| **inkluderEgenskaper** | **kotlin.String**| Gir mulighet til å filtrere hvilke egenskaper som skal returneres med inkluder&#x3D;egenskaper. &#x60;basis&#x60; er alle egenskaper som ikke er assosiasjoner, stedfesting, geometri, eller lister av disse. | [optional] [enum: basis, geometri, alle] |
| **dybde** | **kotlin.String**| Hvor mange nivå barn skal inkluderes. 1 betyr bare IDer, 2-n betyr ett eller flere mellomnivåer, &#39;full&#39; betyr alle nivåer. | [optional] |
| **geometritoleranse** | **kotlin.Int**| Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri. | [optional] |
| Name | Type | Description | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tidspunkt** | **java.time.LocalDate**| Finner versjonen som var gyldig denne datoen. | [optional] |

### Return type

**Vegobjekt**

### Authorization

Configure bearerAuth:
ApiClient.accessToken = ""

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

<a id="getVegobjektVersjoner"></a>

# **getVegobjektVersjoner**

> kotlin.collections.List&lt;Vegobjekt&gt; getVegobjektVersjoner(vegobjekttypeId, vegobjektId, inkluder, srid, inkludergeometri, inkluderEgenskaper, dybde, geometritoleranse, tidspunkt)

Hent alle versjoner av et vegobjekt

### Example

```kotlin
// Import classes:
//import no.vegvesen.nvdb.vegobjekter.infrastructure.*
//import no.vegvesen.nvdb.vegobjekter.model.*

val apiInstance = VegobjekterApi()
val vegobjekttypeId : kotlin.Int = 56 // kotlin.Int | Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.  Eksempel: 581
val vegobjektId : kotlin.Long = 789 // kotlin.Long |
val inkluder : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID.
val srid : kotlin.String = srid_example // kotlin.String | Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: <a href='https://epsg.io/5972'>EPSG:5972</a> <a href='https://epsg.io/5973'>EPSG:5973</a> <a href='https://epsg.io/5975'>EPSG:5975</a> <a href='https://epsg.io/4326'>EPSG:4326</a>.
val inkludergeometri : kotlin.String = inkludergeometri_example // kotlin.String | Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under `vegobjekt.egenskaper` om den finnes, stedfestet geometri er plassert under `vegobjekt.lokasjon`. I tillegg til de nevnte feltene på vegobjekt-responsen returneres også `vegobjekt.geometri` (dersom man har `inkluder=geometri` eller `alle`), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved å se på `vegobjekt.geometri.egengeometri`.
val inkluderEgenskaper : kotlin.String = inkluderEgenskaper_example // kotlin.String | Gir mulighet til å filtrere hvilke egenskaper som skal returneres med inkluder=egenskaper. `basis` er alle egenskaper som ikke er assosiasjoner, stedfesting, geometri, eller lister av disse.
val dybde : kotlin.String = dybde_example // kotlin.String | Hvor mange nivå barn skal inkluderes. 1 betyr bare IDer, 2-n betyr ett eller flere mellomnivåer, 'full' betyr alle nivåer.
val geometritoleranse : kotlin.Int = 56 // kotlin.Int | Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.
val tidspunkt : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Finner versjonen som var gyldig denne datoen.
try {
    val result : kotlin.collections.List<Vegobjekt> = apiInstance.getVegobjektVersjoner(vegobjekttypeId, vegobjektId, inkluder, srid, inkludergeometri, inkluderEgenskaper, dybde, geometritoleranse, tidspunkt)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VegobjekterApi#getVegobjektVersjoner")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VegobjekterApi#getVegobjektVersjoner")
    e.printStackTrace()
}
```

### Parameters

| **vegobjekttypeId** | **kotlin.Int**| Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier. Eksempel: 581 | |
| **vegobjektId** | **kotlin.Long**| | |
| **inkluder** | **kotlin.collections.Set&lt;kotlin.String&gt;**| Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID. | [optional] [enum: metadata, egenskaper, relasjoner, lokasjon, vegsegmenter, geometri, alle, minimum] |
| **srid** | **kotlin.String**| Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;. | [optional] [enum: 5972, 5973, 5975, 4326, UTM32, UTM33, UTM35, WGS84] |
| **inkludergeometri** | **kotlin.String**| Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under &#x60;vegobjekt.egenskaper&#x60; om den finnes, stedfestet geometri er plassert under &#x60;vegobjekt.lokasjon&#x60;. I tillegg til de nevnte feltene på vegobjekt-responsen returneres også &#x60;vegobjekt.geometri&#x60; (dersom man har &#x60;inkluder&#x3D;geometri&#x60; eller &#x60;alle&#x60;), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved å se på &#x60;vegobjekt.geometri.egengeometri&#x60;. | [optional] [enum: ingen, egenskaper, lokasjon, utledet] |
| **inkluderEgenskaper** | **kotlin.String**| Gir mulighet til å filtrere hvilke egenskaper som skal returneres med inkluder&#x3D;egenskaper. &#x60;basis&#x60; er alle egenskaper som ikke er assosiasjoner, stedfesting, geometri, eller lister av disse. | [optional] [enum: basis, geometri, alle] |
| **dybde** | **kotlin.String**| Hvor mange nivå barn skal inkluderes. 1 betyr bare IDer, 2-n betyr ett eller flere mellomnivåer, &#39;full&#39; betyr alle nivåer. | [optional] |
| **geometritoleranse** | **kotlin.Int**| Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri. | [optional] |
| Name | Type | Description | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tidspunkt** | **java.time.LocalDate**| Finner versjonen som var gyldig denne datoen. | [optional] |

### Return type

**kotlin.collections.List&lt;Vegobjekt&gt;**

### Authorization

Configure bearerAuth:
ApiClient.accessToken = ""

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

<a id="getVegobjekterByType"></a>

# **getVegobjekterByType**

> VegobjekterSide getVegobjekterByType(vegobjekttypeId, ider, inkluder, srid, inkludergeometri, inkluderEgenskaper, segmentering, fylke, kommune, kontraktsomrade, riksvegrute, vegforvalter, vegsystemreferanse, kartutsnitt, polygon, typeveg, adskiltelop, kryssystem, sideanlegg, trafikantgruppe, antall, start, geometritoleranse, tidspunkt, alleVersjoner, inkluderAntall, veglenkesekvens, egenskap, overlapp, veglenketype, detaljniva, endretEtter)

Hent vegobjekter av en type

### Example

```kotlin
// Import classes:
//import no.vegvesen.nvdb.vegobjekter.infrastructure.*
//import no.vegvesen.nvdb.vegobjekter.model.*

val apiInstance = VegobjekterApi()
val vegobjekttypeId : kotlin.Int = 56 // kotlin.Int | Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.  Eksempel: 581
val ider : kotlin.collections.Set<kotlin.Long> =  // kotlin.collections.Set<kotlin.Long> | Kommaseparert liste med vegobjekt-IDer.
val inkluder : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID.
val srid : kotlin.String = srid_example // kotlin.String | Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: <a href='https://epsg.io/5972'>EPSG:5972</a> <a href='https://epsg.io/5973'>EPSG:5973</a> <a href='https://epsg.io/5975'>EPSG:5975</a> <a href='https://epsg.io/4326'>EPSG:4326</a>.
val inkludergeometri : kotlin.String = inkludergeometri_example // kotlin.String | Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under `vegobjekt.egenskaper` om den finnes, stedfestet geometri er plassert under `vegobjekt.lokasjon`. I tillegg til de nevnte feltene på vegobjekt-responsen returneres også `vegobjekt.geometri` (dersom man har `inkluder=geometri` eller `alle`), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved å se på `vegobjekt.geometri.egengeometri`.
val inkluderEgenskaper : kotlin.String = inkluderEgenskaper_example // kotlin.String | Gir mulighet til å filtrere hvilke egenskaper som skal returneres med inkluder=egenskaper. `basis` er alle egenskaper som ikke er assosiasjoner, stedfesting, geometri, eller lister av disse.
val segmentering : kotlin.Boolean = true // kotlin.Boolean | Angir om lengde skal inkludere bare deler av vegnettet som er innenfor søkeparametre tilknyttet segmentering (fylke, kommune, vegsystemreferanse, kontraktsområde, riksvegrute, vegforvalter).  Default: `true`
val fylke : kotlin.collections.Set<kotlin.Int> =  // kotlin.collections.Set<kotlin.Int> | Filtrer på fylke. Kommaseparert liste. Se /omrader/fylker for mulige verdier.  Eksempel: `50`
val kommune : kotlin.collections.Set<kotlin.Int> =  // kotlin.collections.Set<kotlin.Int> | Filtrer på kommune. Kommaseparert liste. Se /omrader/kommuner for mulige verdier.  Eksempel: `5001`
val kontraktsomrade : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | Filtrer på kontraktsomrade. Kommaseparert liste. Se /omrader/kontraktsomrader for mulige verdier.  Eksempel: `9503 Midtre Hålogaland 2021-2026`
val riksvegrute : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | Filtrer på riksvegrute. Kommaseparert liste. Se /omrader/riksvegruter for mulige verdier.  Eksempel: `RUTE4A` eller som enumid `20290`
val vegforvalter : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | Filtrer på vegforvalter. Kommaseparert liste. Se [/omrader/api/v4/vegforvaltere](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der) for mulige verdier.  Eksempel: `Møre og Romsdal fylkeskommune` eller som enumid `21774`
val vegsystemreferanse : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | Filtrer vegobjekter på [vegsystemreferanse](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: `EV6S1D1 m12`
val kartutsnitt : kotlin.String = kartutsnitt_example // kotlin.String | Filtrer vegobjekter med kartutsnitt i det gjeldende geografiske referansesystemet (`srid`-paramteret). Formatet er `minX, minY, maxX, maxY`. Merk at vegobjektets bounding box benyttes for sammenligning, som kan medføre at vegobjekter som er utenfor kartutsnittet også returneres. For å unngå dette, kan du bruke `polygon` i stedet.  Eksempel: `265273, 7019372, 346553, 7061071`
val polygon : kotlin.String = polygon_example // kotlin.String | Filtrer vegobjekter med polygon i det gjeldende geografiske referansesystemet (`srid`-paramteret).  Eksempel: `20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000`
val typeveg : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | Filtrer Relasjonstype.vegobjekter på type veg på vegnettet objektet er stedfestet på. Kommaseparert liste.  Eksempel: `kanalisertVeg, enkelBilveg, rampe, rundkjøring, bilferje, passasjerferje, gangOgSykkelveg, sykkelveg, gangveg, gågate, fortau, trapp, gangfelt, gatetun, traktorveg, sti, annet`
val adskiltelop : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | Filtrer vegobjekter på om de er stedfestet hvor det er en Strekning med verdi satt for «adskilte løp».
val kryssystem : kotlin.Boolean = true // kotlin.Boolean | Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Kryssystem.
val sideanlegg : kotlin.Boolean = true // kotlin.Boolean | Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Sideanlegg.
val trafikantgruppe : kotlin.String = trafikantgruppe_example // kotlin.String | Filtrer vegobjekter på trafikantgruppe.
val antall : kotlin.Int = 56 // kotlin.Int | Angir hvor mange objekter som skal returneres. Øvre grense er avhengig av størrelse på respons, og vil kunne variere fra endepunkt til endepunkt. Dersom det angis en verdi for antall som overskrider maksimum, vil maksimumsverdi benyttes. Se også `sidestørrelse` i responsens `metadata`-objekt.
val start : kotlin.String = start_example // kotlin.String | Angir offset for hvilke objekter som skal returneres. Denne får man i metadata-feltet i responsen.
val geometritoleranse : kotlin.Int = 56 // kotlin.Int | Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.
val tidspunkt : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Finner versjonen som var gyldig denne datoen.
val alleVersjoner : kotlin.Boolean = true // kotlin.Boolean | Returner alle versjoner som matcher de oppgitte parametrene. Dersom ikke satt eller `false` vil kun objekter uten sluttdato returneres.
val inkluderAntall : kotlin.Boolean = true // kotlin.Boolean | Hvorvidt totalt antall objekter skal returneres i responsen. Default er `false`.
val veglenkesekvens : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | Filtrer vegobjekter på om de er stedfestet på gjeldende veglenkesekvenser. Kommaseparert liste.  Eksempel: `0.37@319531,0.83-0.97@41640`
val egenskap : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Filtrer vegobjekter på egenskaper, relasjoner og overlapp. Se [dokumentasjon](https://nvdb.atlas.vegvesen.no/docs/produkter/nvdbapil/v4/introduksjon/Avanserte_filter)
val overlapp : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Filtrer vegobjekter på overlapp. Se [dokumentasjon](https://nvdb.atlas.vegvesen.no/docs/produkter/nvdbapil/v4/introduksjon/Avanserte_filter)
val veglenketype : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | Filtrer vegobjekter på veglenketype på vegnettet objektet er stedfestet. Kommaseparert liste.
val detaljniva : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | Filtrer vegobjekter på detaljnivå på vegnettet objektet er stedfestet på (kortnavn fra datakatalogen).
val endretEtter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | Hente endringer siden sist. Eksempel: 2024-12-02T10:15:30.123456
try {
    val result : VegobjekterSide = apiInstance.getVegobjekterByType(vegobjekttypeId, ider, inkluder, srid, inkludergeometri, inkluderEgenskaper, segmentering, fylke, kommune, kontraktsomrade, riksvegrute, vegforvalter, vegsystemreferanse, kartutsnitt, polygon, typeveg, adskiltelop, kryssystem, sideanlegg, trafikantgruppe, antall, start, geometritoleranse, tidspunkt, alleVersjoner, inkluderAntall, veglenkesekvens, egenskap, overlapp, veglenketype, detaljniva, endretEtter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VegobjekterApi#getVegobjekterByType")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VegobjekterApi#getVegobjekterByType")
    e.printStackTrace()
}
```

### Parameters

| **vegobjekttypeId** | **kotlin.Int**| Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier. Eksempel: 581 | |
| **ider** | **kotlin.collections.Set&lt;kotlin.Long&gt;**| Kommaseparert liste med vegobjekt-IDer. | [optional] |
| **inkluder** | **kotlin.collections.List&lt;kotlin.String&gt;**| Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID. | [optional] [enum: metadata, egenskaper, relasjoner, lokasjon, vegsegmenter, geometri, alle, minimum] |
| **srid** | **kotlin.String**| Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;. | [optional] [enum: 5972, 5973, 5975, 4326, UTM32, UTM33, UTM35, WGS84] |
| **inkludergeometri** | **kotlin.String**| Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under &#x60;vegobjekt.egenskaper&#x60; om den finnes, stedfestet geometri er plassert under &#x60;vegobjekt.lokasjon&#x60;. I tillegg til de nevnte feltene på vegobjekt-responsen returneres også &#x60;vegobjekt.geometri&#x60; (dersom man har &#x60;inkluder&#x3D;geometri&#x60; eller &#x60;alle&#x60;), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved å se på &#x60;vegobjekt.geometri.egengeometri&#x60;. | [optional] [enum: ingen, egenskaper, lokasjon, utledet] |
| **inkluderEgenskaper** | **kotlin.String**| Gir mulighet til å filtrere hvilke egenskaper som skal returneres med inkluder&#x3D;egenskaper. &#x60;basis&#x60; er alle egenskaper som ikke er assosiasjoner, stedfesting, geometri, eller lister av disse. | [optional] [enum: basis, geometri, alle] |
| **segmentering** | **kotlin.Boolean**| Angir om lengde skal inkludere bare deler av vegnettet som er innenfor søkeparametre tilknyttet segmentering (fylke, kommune, vegsystemreferanse, kontraktsområde, riksvegrute, vegforvalter). Default: &#x60;true&#x60; | [optional] |
| **fylke** | **kotlin.collections.Set&lt;kotlin.Int&gt;**| Filtrer på fylke. Kommaseparert liste. Se /omrader/fylker for mulige verdier. Eksempel: &#x60;50&#x60; | [optional] |
| **kommune** | **kotlin.collections.Set&lt;kotlin.Int&gt;**| Filtrer på kommune. Kommaseparert liste. Se /omrader/kommuner for mulige verdier. Eksempel: &#x60;5001&#x60; | [optional] |
| **kontraktsomrade** | **kotlin.collections.Set&lt;kotlin.String&gt;**| Filtrer på kontraktsomrade. Kommaseparert liste. Se /omrader/kontraktsomrader for mulige verdier. Eksempel: &#x60;9503 Midtre Hålogaland 2021-2026&#x60; | [optional] |
| **riksvegrute** | **kotlin.collections.Set&lt;kotlin.String&gt;**| Filtrer på riksvegrute. Kommaseparert liste. Se /omrader/riksvegruter for mulige verdier. Eksempel: &#x60;RUTE4A&#x60; eller som enumid &#x60;20290&#x60; | [optional] |
| **vegforvalter** | **kotlin.collections.Set&lt;kotlin.String&gt;**| Filtrer på vegforvalter. Kommaseparert liste. Se [/omrader/api/v4/vegforvaltere](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der) for mulige verdier. Eksempel: &#x60;Møre og Romsdal fylkeskommune&#x60; eller som enumid &#x60;21774&#x60; | [optional] |
| **vegsystemreferanse** | **kotlin.collections.Set&lt;kotlin.String&gt;**| Filtrer vegobjekter på [vegsystemreferanse](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område. Eksempel: &#x60;EV6S1D1 m12&#x60; | [optional] |
| **kartutsnitt** | **kotlin.String**| Filtrer vegobjekter med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;. Merk at vegobjektets bounding box benyttes for sammenligning, som kan medføre at vegobjekter som er utenfor kartutsnittet også returneres. For å unngå dette, kan du bruke &#x60;polygon&#x60; i stedet. Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60; | [optional] |
| **polygon** | **kotlin.String**| Filtrer vegobjekter med polygon i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Eksempel: &#x60;20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000&#x60; | [optional] |
| **typeveg** | **kotlin.collections.Set&lt;kotlin.String&gt;**| Filtrer Relasjonstype.vegobjekter på type veg på vegnettet objektet er stedfestet på. Kommaseparert liste. Eksempel: &#x60;kanalisertVeg, enkelBilveg, rampe, rundkjøring, bilferje, passasjerferje, gangOgSykkelveg, sykkelveg, gangveg, gågate, fortau, trapp, gangfelt, gatetun, traktorveg, sti, annet&#x60; | [optional] [enum: kanalisertVeg, enkelBilveg, rampe, rundkjøring, bilferje, passasjerferje, gangOgSykkelveg, sykkelveg, gangveg, gågate, fortau, trapp, gangfelt, gatetun, traktorveg, sti, annet] |
| **adskiltelop** | **kotlin.collections.Set&lt;kotlin.String&gt;**| Filtrer vegobjekter på om de er stedfestet hvor det er en Strekning med verdi satt for «adskilte løp». | [optional] [enum: Med, Mot, Nei] |
| **kryssystem** | **kotlin.Boolean**| Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Kryssystem. | [optional] |
| **sideanlegg** | **kotlin.Boolean**| Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Sideanlegg. | [optional] |
| **trafikantgruppe** | **kotlin.String**| Filtrer vegobjekter på trafikantgruppe. | [optional] [enum: K, G] |
| **antall** | **kotlin.Int**| Angir hvor mange objekter som skal returneres. Øvre grense er avhengig av størrelse på respons, og vil kunne variere fra endepunkt til endepunkt. Dersom det angis en verdi for antall som overskrider maksimum, vil maksimumsverdi benyttes. Se også &#x60;sidestørrelse&#x60; i responsens &#x60;metadata&#x60;-objekt. | [optional] |
| **start** | **kotlin.String**| Angir offset for hvilke objekter som skal returneres. Denne får man i metadata-feltet i responsen. | [optional] |
| **geometritoleranse** | **kotlin.Int**| Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri. | [optional] |
| **tidspunkt** | **java.time.LocalDate**| Finner versjonen som var gyldig denne datoen. | [optional] |
| **alleVersjoner** | **kotlin.Boolean**| Returner alle versjoner som matcher de oppgitte parametrene. Dersom ikke satt eller &#x60;false&#x60; vil kun objekter uten sluttdato returneres. | [optional] |
| **inkluderAntall** | **kotlin.Boolean**| Hvorvidt totalt antall objekter skal returneres i responsen. Default er &#x60;false&#x60;. | [optional] |
| **veglenkesekvens** | **kotlin.collections.Set&lt;kotlin.String&gt;**| Filtrer vegobjekter på om de er stedfestet på gjeldende veglenkesekvenser. Kommaseparert liste. Eksempel: &#x60;0.37@319531,0.83-0.97@41640&#x60; | [optional] |
| **egenskap** | **kotlin.collections.List&lt;kotlin.String&gt;**| Filtrer vegobjekter på egenskaper, relasjoner og overlapp. Se [dokumentasjon](https://nvdb.atlas.vegvesen.no/docs/produkter/nvdbapil/v4/introduksjon/Avanserte_filter) | [optional] |
| **overlapp** | **kotlin.collections.List&lt;kotlin.String&gt;**| Filtrer vegobjekter på overlapp. Se [dokumentasjon](https://nvdb.atlas.vegvesen.no/docs/produkter/nvdbapil/v4/introduksjon/Avanserte_filter) | [optional] |
| **veglenketype** | **kotlin.collections.Set&lt;kotlin.String&gt;**| Filtrer vegobjekter på veglenketype på vegnettet objektet er stedfestet. Kommaseparert liste. | [optional] [enum: ukjent, detaljert, konnektering, detaljert_konnektering, hoved] |
| **detaljniva** | **kotlin.collections.Set&lt;kotlin.String&gt;**| Filtrer vegobjekter på detaljnivå på vegnettet objektet er stedfestet på (kortnavn fra datakatalogen). | [optional] [enum: VT, KB, KF, VTKB] |
| Name | Type | Description | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **endretEtter** | **java.time.OffsetDateTime**| Hente endringer siden sist. Eksempel: 2024-12-02T10:15:30.123456 | [optional] |

### Return type

**VegobjekterSide**

### Authorization

Configure bearerAuth:
ApiClient.accessToken = ""

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

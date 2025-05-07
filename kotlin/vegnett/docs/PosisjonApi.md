# PosisjonApi

All URIs are relative to *https://nvdbapiles.atlas.vegvesen.no/vegnett-blue*

| Method                                                          | HTTP request              | Description                                                                                                                                                        |
| --------------------------------------------------------------- | ------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [**findPosisjon**](PosisjonApi.md#findPosisjon)                 | **GET** /api/v4/posisjon  | Finn nærmeste posisjon på vegnettet for gitte koordinater. Koordinater kan angis som &#x60;nord&#x60; og &#x60;ost&#x60; eller &#x60;lat&#x60; og &#x60;lon&#x60;. |
| [**findPosisjonForVeg**](PosisjonApi.md#findPosisjonForVeg)     | **GET** /api/v4/veg       | Slå opp posisjon på veglenkesekvens eller vegsystemreferanse                                                                                                       |
| [**findPosisjonerForVeg**](PosisjonApi.md#findPosisjonerForVeg) | **GET** /api/v4/veg/batch | Slå opp flere posisjoner på veglenkesekvens eller vegsystemreferanse                                                                                               |

<a id="findPosisjon"></a>

# **findPosisjon**

> kotlin.collections.List&lt;PosisjonMedAvstand&gt; findPosisjon(nord, ost, lat, lon, maksAvstand, maksAntall, konnekteringslenker, detaljerteLenker, tidspunkt, vegsystemreferanse, srid, trafikantgruppe)

Finn nærmeste posisjon på vegnettet for gitte koordinater. Koordinater kan angis som &#x60;nord&#x60; og &#x60;ost&#x60; eller &#x60;lat&#x60; og &#x60;lon&#x60;.

### Example

```kotlin
// Import classes:
//import no.vegvesen.nvdb.vegnett.infrastructure.*
//import no.vegvesen.nvdb.vegnett.model.*

val apiInstance = PosisjonApi()
val nord : kotlin.Double = 1.2 // kotlin.Double | Nordlig koordinat
val ost : kotlin.Double = 1.2 // kotlin.Double | Østlig koordinat
val lat : kotlin.Double = 1.2 // kotlin.Double | Breddegrad
val lon : kotlin.Double = 1.2 // kotlin.Double | Lengdegrad
val maksAvstand : kotlin.Int = 56 // kotlin.Int | Angir søkeavstand i meter
val maksAntall : kotlin.Int = 56 // kotlin.Int | Angir maks antall treff
val konnekteringslenker : kotlin.Boolean = true // kotlin.Boolean | Angir om det skal returneres treff på konnekteringslenker
val detaljerteLenker : kotlin.Boolean = true // kotlin.Boolean | Angir om det skal returneres treff på detaljerte lenker
val tidspunkt : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Begrens spørring til det gitte tidspunktet.
val vegsystemreferanse : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | Filtrer på [vegsystemreferanse](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: `EV6S1D1 m12`
val srid : kotlin.String = srid_example // kotlin.String | Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: <a href='https://epsg.io/5972'>EPSG:5972</a> <a href='https://epsg.io/5973'>EPSG:5973</a> <a href='https://epsg.io/5975'>EPSG:5975</a> <a href='https://epsg.io/4326'>EPSG:4326</a>.
val trafikantgruppe : kotlin.String = trafikantgruppe_example // kotlin.String | Filtrer på trafikantgruppe.
try {
    val result : kotlin.collections.List<PosisjonMedAvstand> = apiInstance.findPosisjon(nord, ost, lat, lon, maksAvstand, maksAntall, konnekteringslenker, detaljerteLenker, tidspunkt, vegsystemreferanse, srid, trafikantgruppe)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PosisjonApi#findPosisjon")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PosisjonApi#findPosisjon")
    e.printStackTrace()
}
```

### Parameters

| **nord** | **kotlin.Double**| Nordlig koordinat | [optional] |
| **ost** | **kotlin.Double**| Østlig koordinat | [optional] |
| **lat** | **kotlin.Double**| Breddegrad | [optional] |
| **lon** | **kotlin.Double**| Lengdegrad | [optional] |
| **maksAvstand** | **kotlin.Int**| Angir søkeavstand i meter | [optional] |
| **maksAntall** | **kotlin.Int**| Angir maks antall treff | [optional] |
| **konnekteringslenker** | **kotlin.Boolean**| Angir om det skal returneres treff på konnekteringslenker | [optional] |
| **detaljerteLenker** | **kotlin.Boolean**| Angir om det skal returneres treff på detaljerte lenker | [optional] |
| **tidspunkt** | **java.time.LocalDate**| Begrens spørring til det gitte tidspunktet. | [optional] |
| **vegsystemreferanse** | **kotlin.collections.Set&lt;kotlin.String&gt;**| Filtrer på [vegsystemreferanse](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område. Eksempel: &#x60;EV6S1D1 m12&#x60; | [optional] |
| **srid** | **kotlin.String**| Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;. | [optional] [enum: 5972, 5973, 5975, 4326, UTM32, UTM33, UTM35, WGS84] |
| Name | Type | Description | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **trafikantgruppe** | **kotlin.String**| Filtrer på trafikantgruppe. | [optional] [enum: K, G] |

### Return type

**kotlin.collections.List&lt;PosisjonMedAvstand&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

<a id="findPosisjonForVeg"></a>

# **findPosisjonForVeg**

> Posisjon findPosisjonForVeg(vegsystemreferanse, veglenkesekvens, tidspunkt, srid, kommune)

Slå opp posisjon på veglenkesekvens eller vegsystemreferanse

### Example

```kotlin
// Import classes:
//import no.vegvesen.nvdb.vegnett.infrastructure.*
//import no.vegvesen.nvdb.vegnett.model.*

val apiInstance = PosisjonApi()
val vegsystemreferanse : kotlin.String = vegsystemreferanse_example // kotlin.String | Finn posisjon for [vegsystemreferanse](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Må inneholde én enkelt meterverdi. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: `EV6S1D1m341`
val veglenkesekvens : kotlin.String = veglenkesekvens_example // kotlin.String | Finn posisjon på veglenkesekvens. Format: `posisjon@veglenkesekvensid`.  Eksempel: `0.456@1226`
val tidspunkt : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Begrens spørring til det gitte tidspunktet.
val srid : kotlin.String = srid_example // kotlin.String | Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: <a href='https://epsg.io/5972'>EPSG:5972</a> <a href='https://epsg.io/5973'>EPSG:5973</a> <a href='https://epsg.io/5975'>EPSG:5975</a> <a href='https://epsg.io/4326'>EPSG:4326</a>.
val kommune : kotlin.collections.Set<kotlin.Int> =  // kotlin.collections.Set<kotlin.Int> | Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der) for mulige verdier.  Eksempel: `5001`
try {
    val result : Posisjon = apiInstance.findPosisjonForVeg(vegsystemreferanse, veglenkesekvens, tidspunkt, srid, kommune)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PosisjonApi#findPosisjonForVeg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PosisjonApi#findPosisjonForVeg")
    e.printStackTrace()
}
```

### Parameters

| **vegsystemreferanse** | **kotlin.String**| Finn posisjon for [vegsystemreferanse](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Må inneholde én enkelt meterverdi. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område. Eksempel: &#x60;EV6S1D1m341&#x60; | [optional] |
| **veglenkesekvens** | **kotlin.String**| Finn posisjon på veglenkesekvens. Format: &#x60;posisjon@veglenkesekvensid&#x60;. Eksempel: &#x60;0.456@1226&#x60; | [optional] |
| **tidspunkt** | **java.time.LocalDate**| Begrens spørring til det gitte tidspunktet. | [optional] |
| **srid** | **kotlin.String**| Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;. | [optional] [enum: 5972, 5973, 5975, 4326, UTM32, UTM33, UTM35, WGS84] |
| Name | Type | Description | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **kommune** | **kotlin.collections.Set&lt;kotlin.Int&gt;**| Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der) for mulige verdier. Eksempel: &#x60;5001&#x60; | [optional] |

### Return type

**Posisjon**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

<a id="findPosisjonerForVeg"></a>

# **findPosisjonerForVeg**

> AlwaysIncludeMapStringPosisjon findPosisjonerForVeg(vegsystemreferanser, veglenkesekvenser, kommune, srid)

Slå opp flere posisjoner på veglenkesekvens eller vegsystemreferanse

### Example

```kotlin
// Import classes:
//import no.vegvesen.nvdb.vegnett.infrastructure.*
//import no.vegvesen.nvdb.vegnett.model.*

val apiInstance = PosisjonApi()
val vegsystemreferanser : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Finn posisjoner for [vegsystemreferanser](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Må inneholde én enkelt meterverdi. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: `EV6S1D1m341`
val veglenkesekvenser : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Finn posisjoner på veglenkesekvenser. Format: `posisjon@veglenkesekvensid`.  Eksempel: `0.456@1226`
val kommune : kotlin.collections.Set<kotlin.Int> =  // kotlin.collections.Set<kotlin.Int> | Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der) for mulige verdier.  Eksempel: `5001`
val srid : kotlin.String = srid_example // kotlin.String | Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: <a href='https://epsg.io/5972'>EPSG:5972</a> <a href='https://epsg.io/5973'>EPSG:5973</a> <a href='https://epsg.io/5975'>EPSG:5975</a> <a href='https://epsg.io/4326'>EPSG:4326</a>.
try {
    val result : AlwaysIncludeMapStringPosisjon = apiInstance.findPosisjonerForVeg(vegsystemreferanser, veglenkesekvenser, kommune, srid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PosisjonApi#findPosisjonerForVeg")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PosisjonApi#findPosisjonerForVeg")
    e.printStackTrace()
}
```

### Parameters

| **vegsystemreferanser** | **kotlin.collections.List&lt;kotlin.String&gt;**| Finn posisjoner for [vegsystemreferanser](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Må inneholde én enkelt meterverdi. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område. Eksempel: &#x60;EV6S1D1m341&#x60; | [optional] |
| **veglenkesekvenser** | **kotlin.collections.List&lt;kotlin.String&gt;**| Finn posisjoner på veglenkesekvenser. Format: &#x60;posisjon@veglenkesekvensid&#x60;. Eksempel: &#x60;0.456@1226&#x60; | [optional] |
| **kommune** | **kotlin.collections.Set&lt;kotlin.Int&gt;**| Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der) for mulige verdier. Eksempel: &#x60;5001&#x60; | [optional] |
| Name | Type | Description | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **srid** | **kotlin.String**| Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;. | [optional] [enum: 5972, 5973, 5975, 4326, UTM32, UTM33, UTM35, WGS84] |

### Return type

**AlwaysIncludeMapStringPosisjon**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

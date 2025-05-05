# RuteApi

All URIs are relative to *https://nvdbapiles.atlas.vegvesen.no/vegnett*

| Method                              | HTTP request                       | Description |
| ----------------------------------- | ---------------------------------- | ----------- |
| [**getRute**](RuteApi.md#getRute)   | **GET** /api/v4/beta/vegnett/rute  |
| [**postRute**](RuteApi.md#postRute) | **POST** /api/v4/beta/vegnett/rute |

<a id="getRute"></a>

# **getRute**

> GetRute200Response getRute(start, slutt, geometri, maksAvstand, omkrets, konnekteringslenker, detaljerteLenker, kortform, vegsystemreferanse, trafikantgruppe, beholdTrafikantgruppe, typeveg, tidspunkt, srid)

### Example

```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import no.vegvesen.nvdb.vegnett.model.*

val apiInstance = RuteApi()
val start : kotlin.String = start_example // kotlin.String | Startposisjon som et punkt eller posisjon@veglenkesekvens.  Eksempler: `226761.786, 6564469.3787` `0.1@1234`
val slutt : kotlin.String = slutt_example // kotlin.String | Sluttposisjon som et punkt eller posisjon@veglenkesekvens.  Eksempler: `226855.034, 6564472.225` `0.9@4321`
val geometri : kotlin.String = geometri_example // kotlin.String | Finn sammenhengende vegnett som passer med denne geometrien.  Eksempel: `LINESTRING Z(226778.2 6564468.6 5, 226747.1 6564470.1 5, 226717.5 6564466.4 5, 226705.9 6564462.7 6.2, 226687.2 6564462.9 6, 226657.7 6564460.7 6, 226628.5 6564459.5 6, 226611.3 6564459.6 6.2)`
val maksAvstand : kotlin.Int = 56 // kotlin.Int | Maks avstand i meter til veglenker.  Standardverdi: `10`
val omkrets : kotlin.Int = 56 // kotlin.Int | Konvolutt lagt rundt start- og slutt-punkt for å beregne rute.  Standardverdi: `200`. Må være større enn 0.
val konnekteringslenker : kotlin.Boolean = true // kotlin.Boolean | Inkluder konnekteringslenker.  Standardverdi: `true`
val detaljerteLenker : kotlin.Boolean = true // kotlin.Boolean | Inkluder detaljerte lenker.  Standardverdi: `false`
val kortform : kotlin.Boolean = true // kotlin.Boolean | Returner minimal respons.  Standardverdi: `false`
val vegsystemreferanse : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Filtrer på vegsystemreferanse. Kommaseparert liste.  Eksempler: `EV6` `R` `F`
val trafikantgruppe : kotlin.String = trafikantgruppe_example // kotlin.String | Filtrer på trafikantgruppe.
val beholdTrafikantgruppe : kotlin.Boolean = true // kotlin.Boolean | Behold trafikantgruppe gjennom ruten. Trafikantgruppe velges fra første og siste punkt i ruten, om de er ulike velges K (kjørende). Overstyres av parameteren trafikantgruppe.  Standardverdi: `false`
val typeveg : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Filtrer på type veg. Kommaseparert liste.
val tidspunkt : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Begrens spørring til dette tidspunktet.
val srid : kotlin.String = srid_example // kotlin.String | Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: <a href='https://epsg.io/5972'>EPSG:5972</a> <a href='https://epsg.io/5973'>EPSG:5973</a> <a href='https://epsg.io/5975'>EPSG:5975</a> <a href='https://epsg.io/4326'>EPSG:4326</a>.
try {
    val result : GetRute200Response = apiInstance.getRute(start, slutt, geometri, maksAvstand, omkrets, konnekteringslenker, detaljerteLenker, kortform, vegsystemreferanse, trafikantgruppe, beholdTrafikantgruppe, typeveg, tidspunkt, srid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RuteApi#getRute")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RuteApi#getRute")
    e.printStackTrace()
}
```

### Parameters

| Name                      | Type                                             | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                             | Notes                                                                                                                                                                                                   |
| ------------------------- | ------------------------------------------------ | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **start**                 | **kotlin.String**                                | Startposisjon som et punkt eller posisjon@veglenkesekvens. Eksempler: &#x60;226761.786, 6564469.3787&#x60; &#x60;0.1@1234&#x60;                                                                                                                                                                                                                                                                                                                                         | [optional]                                                                                                                                                                                              |
| **slutt**                 | **kotlin.String**                                | Sluttposisjon som et punkt eller posisjon@veglenkesekvens. Eksempler: &#x60;226855.034, 6564472.225&#x60; &#x60;0.9@4321&#x60;                                                                                                                                                                                                                                                                                                                                          | [optional]                                                                                                                                                                                              |
| **geometri**              | **kotlin.String**                                | Finn sammenhengende vegnett som passer med denne geometrien. Eksempel: &#x60;LINESTRING Z(226778.2 6564468.6 5, 226747.1 6564470.1 5, 226717.5 6564466.4 5, 226705.9 6564462.7 6.2, 226687.2 6564462.9 6, 226657.7 6564460.7 6, 226628.5 6564459.5 6, 226611.3 6564459.6 6.2)&#x60;                                                                                                                                                                                     | [optional]                                                                                                                                                                                              |
| **maksAvstand**           | **kotlin.Int**                                   | Maks avstand i meter til veglenker. Standardverdi: &#x60;10&#x60;                                                                                                                                                                                                                                                                                                                                                                                                       | [optional]                                                                                                                                                                                              |
| **omkrets**               | **kotlin.Int**                                   | Konvolutt lagt rundt start- og slutt-punkt for å beregne rute. Standardverdi: &#x60;200&#x60;. Må være større enn 0.                                                                                                                                                                                                                                                                                                                                                    | [optional]                                                                                                                                                                                              |
| **konnekteringslenker**   | **kotlin.Boolean**                               | Inkluder konnekteringslenker. Standardverdi: &#x60;true&#x60;                                                                                                                                                                                                                                                                                                                                                                                                           | [optional]                                                                                                                                                                                              |
| **detaljerteLenker**      | **kotlin.Boolean**                               | Inkluder detaljerte lenker. Standardverdi: &#x60;false&#x60;                                                                                                                                                                                                                                                                                                                                                                                                            | [optional]                                                                                                                                                                                              |
| **kortform**              | **kotlin.Boolean**                               | Returner minimal respons. Standardverdi: &#x60;false&#x60;                                                                                                                                                                                                                                                                                                                                                                                                              | [optional]                                                                                                                                                                                              |
| **vegsystemreferanse**    | **kotlin.collections.List&lt;kotlin.String&gt;** | Filtrer på vegsystemreferanse. Kommaseparert liste. Eksempler: &#x60;EV6&#x60; &#x60;R&#x60; &#x60;F&#x60;                                                                                                                                                                                                                                                                                                                                                              | [optional]                                                                                                                                                                                              |
| **trafikantgruppe**       | **kotlin.String**                                | Filtrer på trafikantgruppe.                                                                                                                                                                                                                                                                                                                                                                                                                                             | [optional] [enum: K, G]                                                                                                                                                                                 |
| **beholdTrafikantgruppe** | **kotlin.Boolean**                               | Behold trafikantgruppe gjennom ruten. Trafikantgruppe velges fra første og siste punkt i ruten, om de er ulike velges K (kjørende). Overstyres av parameteren trafikantgruppe. Standardverdi: &#x60;false&#x60;                                                                                                                                                                                                                                                         | [optional]                                                                                                                                                                                              |
| **typeveg**               | **kotlin.collections.List&lt;kotlin.String&gt;** | Filtrer på type veg. Kommaseparert liste.                                                                                                                                                                                                                                                                                                                                                                                                                               | [optional] [enum: Enkel bilveg, Kanalisert veg, Rampe, Rundkjøring, Bilferje, Gang- og sykkelveg, Sykkelveg, Gangveg, Gågate, Fortau, Trapp, Gangfelt, Gatetun, Passasjerferje, Traktorveg, Sti, Annet] |
| **tidspunkt**             | **java.time.LocalDate**                          | Begrens spørring til dette tidspunktet.                                                                                                                                                                                                                                                                                                                                                                                                                                 | [optional]                                                                                                                                                                                              |
| **srid**                  | **kotlin.String**                                | Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;. | [optional] [enum: 5972, 5973, 5975, 4326, UTM32, UTM33, UTM35, WGS84]                                                                                                                                   |

### Return type

**GetRute200Response**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

<a id="postRute"></a>

# **postRute**

> GetRute200Response postRute(finnRuteParameters)

### Example

```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import no.vegvesen.nvdb.vegnett.model.*

val apiInstance = RuteApi()
val finnRuteParameters : FinnRuteParameters =  // FinnRuteParameters |
try {
    val result : GetRute200Response = apiInstance.postRute(finnRuteParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RuteApi#postRute")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RuteApi#postRute")
    e.printStackTrace()
}
```

### Parameters

| Name                   | Type                   | Description | Notes |
| ---------------------- | ---------------------- | ----------- | ----- |
| **finnRuteParameters** | **FinnRuteParameters** |             |

### Return type

**GetRute200Response**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: _/_

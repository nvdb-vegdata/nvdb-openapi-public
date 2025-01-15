# StatistikkApi

All URIs are relative to *https://nvdbapiles.atlas.vegvesen.no/vegobjekter*

| Method                                                                                    | HTTP request                                                      | Description                                                              |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------- | ------------------------------------------------------------------------ |
| [**getVegobjekterStatistikk**](StatistikkApi.md#getVegobjekterStatistikk)                 | **GET** /api/v4/vegobjekter/{vegobjekttypeid}/statistikk          | Hent statistikk for en vegobjekttype                                     |
| [**getVegobjekterStatistikkGruppert**](StatistikkApi.md#getVegobjekterStatistikkGruppert) | **GET** /api/v4/vegobjekter/{vegobjekttypeid}/statistikk/gruppert | Hent statistikk for en vegobjekttype, gruppert på ett eller flere felter |
| [**getVegobjekterStatistikkMedTyper**](StatistikkApi.md#getVegobjekterStatistikkMedTyper) | **GET** /api/v4/vegobjekter/statistikk                            | Hent overordnet statistikk for alle vegobjekttyper                       |

<a id="getVegobjekterStatistikk"></a>

# **getVegobjekterStatistikk**

> VegobjekterStatistikk getVegobjekterStatistikk(vegobjekttypeid, srid, segmentering, fylke, kommune, kontraktsomrade, riksvegrute, vegsystemreferanse, kartutsnitt, polygon, typeveg, overlappendeVegobjektIder, adskiltelop, kryssystem, sideanlegg, trafikantgruppe, inkluder, veglenkesekvens, endretEtter)

Hent statistikk for en vegobjekttype

### Example

```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import no.vegvesen.nvdb.vegobjekter.model.*

val apiInstance = StatistikkApi()
val vegobjekttypeid : kotlin.Int = 56 // kotlin.Int | Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.  Eksempel: 581
val srid : kotlin.String = srid_example // kotlin.String | Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: <a href='https://epsg.io/5972'>EPSG:5972</a> <a href='https://epsg.io/5973'>EPSG:5973</a> <a href='https://epsg.io/5975'>EPSG:5975</a> <a href='https://epsg.io/4326'>EPSG:4326</a>.
val segmentering : kotlin.Boolean = true // kotlin.Boolean | Angir om strekningsobjekter skal segmenteres etter søkeområdet (fylke, kommune, vegsystemreferanse, kontraktsområde, riksvegrute).  Default: `true`
val fylke : kotlin.collections.Set<kotlin.Int> =  // kotlin.collections.Set<kotlin.Int> | Filtrer på fylke. Kommaseparert liste. Se /omrader/fylker for mulige verdier.  Eksempel: `50`
val kommune : kotlin.collections.Set<kotlin.Int> =  // kotlin.collections.Set<kotlin.Int> | Filtrer på kommune. Kommaseparert liste. Se /omrader/kommuner for mulige verdier.  Eksempel: `5001`
val kontraktsomrade : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | Filtrer på kontraktsomrade. Kommaseparert liste. Se /omrader/kontraktsomrader for mulige verdier.  Eksempel: `1539 Tunnel- og bergsikr 2018-2023 Nordm og Romsd`
val riksvegrute : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | Filtrer på riksvegrute. Kommaseparert liste. Se /omrader/riksvegruter for mulige verdier.  Eksempel: `RUTE4A` eller som enumid `20290`
val vegsystemreferanse : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | Filtrer vegobjekter på [vegsystemreferanse](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: `EV6S1D1 m12`
val kartutsnitt : kotlin.String = kartutsnitt_example // kotlin.String | Filtrer vegobjekter med kartutsnitt i det gjeldende geografiske referansesystemet (`srid`-paramteret). Formatet er `minX, minY, maxX, maxY`.  Eksempel: `265273, 7019372, 346553, 7061071`
val polygon : kotlin.String = polygon_example // kotlin.String | Filtrer vegobjekter med polygon i det gjeldende geografiske referansesystemet (`srid`-paramteret).  Eksempel: `20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000`
val typeveg : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | Filtrer vegobjekter på type veg på vegnettet objektet er stedfestet på. Kommaseparert liste.  Eksempel: `kanalisertVeg, enkelBilveg, rampe, rundkjøring, bilferje, passasjerferje, gangOgSykkelveg, sykkelveg, gangveg, gågate, fortau, trapp, gangfelt, gatetun, traktorveg, sti, annet`
val overlappendeVegobjektIder : kotlin.collections.Set<kotlin.Long> =  // kotlin.collections.Set<kotlin.Long> | Filtrer vegobjekter på om de har geometri som overlapper med vegobjekt med gitt id. Hvis flere vegobjekt-ider spesifiseres vil vegobjekter som overlapper med minst én av de bli returnert.
val adskiltelop : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | Filtrer vegobjekter på om de er stedfestet hvor det er en Strekning med verdi satt for «adskilte løp».
val kryssystem : kotlin.Boolean = true // kotlin.Boolean | Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Kryssystem.
val sideanlegg : kotlin.Boolean = true // kotlin.Boolean | Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Sideanlegg.
val trafikantgruppe : kotlin.String = trafikantgruppe_example // kotlin.String | Filtrer vegobjekter på trafikantgruppe.
val inkluder : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Kommaseparert liste av statistikkfelt som skal inkluderes i resultatet.
val veglenkesekvens : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | Filtrer vegobjekter på om de er stedfestet på gjeldende veglenkesekvenser. Kommaseparert liste.  Eksempel: `0.37@319531,0.83-0.97@41640`
val endretEtter : kotlinx.datetime.Instant = 2013-10-20T19:20:30+01:00 // kotlinx.datetime.Instant | Hente endringer siden sist. Eksempel: 2024-12-02T10:15:30.123456
try {
    val result : VegobjekterStatistikk = apiInstance.getVegobjekterStatistikk(vegobjekttypeid, srid, segmentering, fylke, kommune, kontraktsomrade, riksvegrute, vegsystemreferanse, kartutsnitt, polygon, typeveg, overlappendeVegobjektIder, adskiltelop, kryssystem, sideanlegg, trafikantgruppe, inkluder, veglenkesekvens, endretEtter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StatistikkApi#getVegobjekterStatistikk")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StatistikkApi#getVegobjekterStatistikk")
    e.printStackTrace()
}
```

### Parameters

| Name                          | Type                                             | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     | Notes                                                                                                                                                                                              |
| ----------------------------- | ------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **vegobjekttypeid**           | **kotlin.Int**                                   | Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier. Eksempel: 581                                                                                                                                                                                                                                                                                                                                                                                        |
| **srid**                      | **kotlin.String**                                | Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;. | [optional] [enum: 5972, 5973, 5975, 4326, UTM32, UTM33, UTM35, WGS84]                                                                                                                              |
| **segmentering**              | **kotlin.Boolean**                               | Angir om strekningsobjekter skal segmenteres etter søkeområdet (fylke, kommune, vegsystemreferanse, kontraktsområde, riksvegrute). Default: &#x60;true&#x60;                                                                                                                                                                                                                                                                                                                                                                    | [optional]                                                                                                                                                                                         |
| **fylke**                     | **kotlin.collections.Set&lt;kotlin.Int&gt;**     | Filtrer på fylke. Kommaseparert liste. Se /omrader/fylker for mulige verdier. Eksempel: &#x60;50&#x60;                                                                                                                                                                                                                                                                                                                                                                                                                          | [optional]                                                                                                                                                                                         |
| **kommune**                   | **kotlin.collections.Set&lt;kotlin.Int&gt;**     | Filtrer på kommune. Kommaseparert liste. Se /omrader/kommuner for mulige verdier. Eksempel: &#x60;5001&#x60;                                                                                                                                                                                                                                                                                                                                                                                                                    | [optional]                                                                                                                                                                                         |
| **kontraktsomrade**           | **kotlin.collections.Set&lt;kotlin.String&gt;**  | Filtrer på kontraktsomrade. Kommaseparert liste. Se /omrader/kontraktsomrader for mulige verdier. Eksempel: &#x60;1539 Tunnel- og bergsikr 2018-2023 Nordm og Romsd&#x60;                                                                                                                                                                                                                                                                                                                                                       | [optional]                                                                                                                                                                                         |
| **riksvegrute**               | **kotlin.collections.Set&lt;kotlin.String&gt;**  | Filtrer på riksvegrute. Kommaseparert liste. Se /omrader/riksvegruter for mulige verdier. Eksempel: &#x60;RUTE4A&#x60; eller som enumid &#x60;20290&#x60;                                                                                                                                                                                                                                                                                                                                                                       | [optional]                                                                                                                                                                                         |
| **vegsystemreferanse**        | **kotlin.collections.Set&lt;kotlin.String&gt;**  | Filtrer vegobjekter på [vegsystemreferanse](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område. Eksempel: &#x60;EV6S1D1 m12&#x60;                                                                                                                                                                                                                                                                | [optional]                                                                                                                                                                                         |
| **kartutsnitt**               | **kotlin.String**                                | Filtrer vegobjekter med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;. Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60;                                                                                                                                                                                                                                                                                                         | [optional]                                                                                                                                                                                         |
| **polygon**                   | **kotlin.String**                                | Filtrer vegobjekter med polygon i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Eksempel: &#x60;20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000&#x60;                                                                                                                                                                                                                                                                                                                                   | [optional]                                                                                                                                                                                         |
| **typeveg**                   | **kotlin.collections.Set&lt;kotlin.String&gt;**  | Filtrer vegobjekter på type veg på vegnettet objektet er stedfestet på. Kommaseparert liste. Eksempel: &#x60;kanalisertVeg, enkelBilveg, rampe, rundkjøring, bilferje, passasjerferje, gangOgSykkelveg, sykkelveg, gangveg, gågate, fortau, trapp, gangfelt, gatetun, traktorveg, sti, annet&#x60;                                                                                                                                                                                                                              | [optional] [enum: kanalisertVeg, enkelBilveg, rampe, rundkjøring, bilferje, passasjerferje, gangOgSykkelveg, sykkelveg, gangveg, gågate, fortau, trapp, gangfelt, gatetun, traktorveg, sti, annet] |
| **overlappendeVegobjektIder** | **kotlin.collections.Set&lt;kotlin.Long&gt;**    | Filtrer vegobjekter på om de har geometri som overlapper med vegobjekt med gitt id. Hvis flere vegobjekt-ider spesifiseres vil vegobjekter som overlapper med minst én av de bli returnert.                                                                                                                                                                                                                                                                                                                                     | [optional]                                                                                                                                                                                         |
| **adskiltelop**               | **kotlin.collections.Set&lt;kotlin.String&gt;**  | Filtrer vegobjekter på om de er stedfestet hvor det er en Strekning med verdi satt for «adskilte løp».                                                                                                                                                                                                                                                                                                                                                                                                                          | [optional] [enum: Med, Mot, Nei]                                                                                                                                                                   |
| **kryssystem**                | **kotlin.Boolean**                               | Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Kryssystem.                                                                                                                                                                                                                                                                                                                                                                                                                                             | [optional]                                                                                                                                                                                         |
| **sideanlegg**                | **kotlin.Boolean**                               | Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Sideanlegg.                                                                                                                                                                                                                                                                                                                                                                                                                                             | [optional]                                                                                                                                                                                         |
| **trafikantgruppe**           | **kotlin.String**                                | Filtrer vegobjekter på trafikantgruppe.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | [optional] [enum: K, G]                                                                                                                                                                            |
| **inkluder**                  | **kotlin.collections.List&lt;kotlin.String&gt;** | Kommaseparert liste av statistikkfelt som skal inkluderes i resultatet.                                                                                                                                                                                                                                                                                                                                                                                                                                                         | [optional] [enum: lengde, antall, alle]                                                                                                                                                            |
| **veglenkesekvens**           | **kotlin.collections.Set&lt;kotlin.String&gt;**  | Filtrer vegobjekter på om de er stedfestet på gjeldende veglenkesekvenser. Kommaseparert liste. Eksempel: &#x60;0.37@319531,0.83-0.97@41640&#x60;                                                                                                                                                                                                                                                                                                                                                                               | [optional]                                                                                                                                                                                         |
| **endretEtter**               | **kotlinx.datetime.Instant**                     | Hente endringer siden sist. Eksempel: 2024-12-02T10:15:30.123456                                                                                                                                                                                                                                                                                                                                                                                                                                                                | [optional]                                                                                                                                                                                         |

### Return type

**VegobjekterStatistikk**

### Authorization

Configure bearerAuth:
ApiClient.accessToken = ""

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

<a id="getVegobjekterStatistikkGruppert"></a>

# **getVegobjekterStatistikkGruppert**

> kotlin.collections.List&lt;VegobjekterStatistikkGruppert&gt; getVegobjekterStatistikkGruppert(vegobjekttypeid, gruppering, srid, kartutsnitt, inkluder, veglenkesekvens)

Hent statistikk for en vegobjekttype, gruppert på ett eller flere felter

### Example

```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import no.vegvesen.nvdb.vegobjekter.model.*

val apiInstance = StatistikkApi()
val vegobjekttypeid : kotlin.Int = 56 // kotlin.Int |
val gruppering : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | Velg en eller flere felter som statistikken skal grupperes på.
val srid : kotlin.String = srid_example // kotlin.String | Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: <a href='https://epsg.io/5972'>EPSG:5972</a> <a href='https://epsg.io/5973'>EPSG:5973</a> <a href='https://epsg.io/5975'>EPSG:5975</a> <a href='https://epsg.io/4326'>EPSG:4326</a>.
val kartutsnitt : kotlin.String = kartutsnitt_example // kotlin.String | Filtrer vegobjekter med kartutsnitt i det gjeldende geografiske referansesystemet (`srid`-paramteret). Formatet er `minX, minY, maxX, maxY`.  Eksempel: `265273, 7019372, 346553, 7061071`
val inkluder : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | Kommaseparert liste av statistikkfelt som skal inkluderes i resultatet.
val veglenkesekvens : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | Filtrer vegobjekter på om de er stedfestet på gjeldende veglenkesekvenser. Kommaseparert liste.  Eksempel: `0.37@319531,0.83-0.97@41640`
try {
    val result : kotlin.collections.List<VegobjekterStatistikkGruppert> = apiInstance.getVegobjekterStatistikkGruppert(vegobjekttypeid, gruppering, srid, kartutsnitt, inkluder, veglenkesekvens)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StatistikkApi#getVegobjekterStatistikkGruppert")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StatistikkApi#getVegobjekterStatistikkGruppert")
    e.printStackTrace()
}
```

### Parameters

| Name                | Type                                            | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     | Notes                                                                 |
| ------------------- | ----------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------- |
| **vegobjekttypeid** | **kotlin.Int**                                  |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
| **gruppering**      | **kotlin.collections.Set&lt;kotlin.String&gt;** | Velg en eller flere felter som statistikken skal grupperes på.                                                                                                                                                                                                                                                                                                                                                                                                                                                                  | [enum: fylke, kommune, vegkategori]                                   |
| **srid**            | **kotlin.String**                               | Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;. | [optional] [enum: 5972, 5973, 5975, 4326, UTM32, UTM33, UTM35, WGS84] |
| **kartutsnitt**     | **kotlin.String**                               | Filtrer vegobjekter med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;. Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60;                                                                                                                                                                                                                                                                                                         | [optional]                                                            |
| **inkluder**        | **kotlin.collections.Set&lt;kotlin.String&gt;** | Kommaseparert liste av statistikkfelt som skal inkluderes i resultatet.                                                                                                                                                                                                                                                                                                                                                                                                                                                         | [optional] [enum: lengde, antall, alle]                               |
| **veglenkesekvens** | **kotlin.collections.Set&lt;kotlin.String&gt;** | Filtrer vegobjekter på om de er stedfestet på gjeldende veglenkesekvenser. Kommaseparert liste. Eksempel: &#x60;0.37@319531,0.83-0.97@41640&#x60;                                                                                                                                                                                                                                                                                                                                                                               | [optional]                                                            |

### Return type

**kotlin.collections.List&lt;VegobjekterStatistikkGruppert&gt;**

### Authorization

Configure bearerAuth:
ApiClient.accessToken = ""

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

<a id="getVegobjekterStatistikkMedTyper"></a>

# **getVegobjekterStatistikkMedTyper**

> kotlin.collections.List&lt;VegobjekterStatistikkMedType&gt; getVegobjekterStatistikkMedTyper(inkluder)

Hent overordnet statistikk for alle vegobjekttyper

### Example

```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import no.vegvesen.nvdb.vegobjekter.model.*

val apiInstance = StatistikkApi()
val inkluder : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Kommaseparert liste av statistikkfelt som skal inkluderes i resultatet.
try {
    val result : kotlin.collections.List<VegobjekterStatistikkMedType> = apiInstance.getVegobjekterStatistikkMedTyper(inkluder)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StatistikkApi#getVegobjekterStatistikkMedTyper")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StatistikkApi#getVegobjekterStatistikkMedTyper")
    e.printStackTrace()
}
```

### Parameters

| Name         | Type                                             | Description                                                             | Notes                                   |
| ------------ | ------------------------------------------------ | ----------------------------------------------------------------------- | --------------------------------------- |
| **inkluder** | **kotlin.collections.List&lt;kotlin.String&gt;** | Kommaseparert liste av statistikkfelt som skal inkluderes i resultatet. | [optional] [enum: lengde, antall, alle] |

### Return type

**kotlin.collections.List&lt;VegobjekterStatistikkMedType&gt;**

### Authorization

Configure bearerAuth:
ApiClient.accessToken = ""

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

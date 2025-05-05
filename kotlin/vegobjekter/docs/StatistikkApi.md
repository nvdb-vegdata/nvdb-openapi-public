# StatistikkApi

All URIs are relative to *https://nvdbapiles.atlas.vegvesen.no/vegobjekter-blue*

| Method                                                                                    | HTTP request                                                      | Description                                                              |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------- | ------------------------------------------------------------------------ |
| [**getVegobjekterStatistikk**](StatistikkApi.md#getVegobjekterStatistikk)                 | **GET** /api/v4/vegobjekter/{vegobjekttypeid}/statistikk          | Hent statistikk for en vegobjekttype                                     |
| [**getVegobjekterStatistikkGruppert**](StatistikkApi.md#getVegobjekterStatistikkGruppert) | **GET** /api/v4/vegobjekter/{vegobjekttypeid}/statistikk/gruppert | Hent statistikk for en vegobjekttype, gruppert på ett eller flere felter |
| [**getVegobjekterStatistikkMedTyper**](StatistikkApi.md#getVegobjekterStatistikkMedTyper) | **GET** /api/v4/vegobjekter/statistikk                            | Hent overordnet statistikk for alle vegobjekttyper                       |

<a id="getVegobjekterStatistikk"></a>

# **getVegobjekterStatistikk**

> VegobjekterStatistikk getVegobjekterStatistikk(vegobjekttypeid, srid, segmentering, fylke, kommune, kontraktsomrade, riksvegrute, vegforvalter, vegsystemreferanse, kartutsnitt, polygon, typeveg, adskiltelop, kryssystem, sideanlegg, trafikantgruppe, inkluder, veglenkesekvens, veglenketype, detaljniva, endretEtter, tidspunkt, egenskap, overlapp)

Hent statistikk for en vegobjekttype

### Example

```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import no.vegvesen.nvdb.vegobjekter.model.*

val apiInstance = StatistikkApi()
val vegobjekttypeid : kotlin.Int = 56 // kotlin.Int | Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.  Eksempel: 581
val srid : kotlin.String = srid_example // kotlin.String | Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: <a href='https://epsg.io/5972'>EPSG:5972</a> <a href='https://epsg.io/5973'>EPSG:5973</a> <a href='https://epsg.io/5975'>EPSG:5975</a> <a href='https://epsg.io/4326'>EPSG:4326</a>.
val segmentering : kotlin.Boolean = true // kotlin.Boolean | Angir om strekningsobjekter skal segmenteres etter søkeområdet (fylke, kommune, vegsystemreferanse, kontraktsområde, riksvegrute, vegforvalter).  Default: `true`
val fylke : kotlin.collections.List<kotlin.Int> =  // kotlin.collections.List<kotlin.Int> | Filtrer på fylke. Kommaseparert liste. Se /omrader/fylker for mulige verdier.  Eksempel: `50`
val kommune : kotlin.collections.List<kotlin.Int> =  // kotlin.collections.List<kotlin.Int> | Filtrer på kommune. Kommaseparert liste. Se /omrader/kommuner for mulige verdier.  Eksempel: `5001`
val kontraktsomrade : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Filtrer på kontraktsomrade. Kommaseparert liste. Se /omrader/kontraktsomrader for mulige verdier.  Eksempel: `1539 Tunnel- og bergsikr 2018-2023 Nordm og Romsd`
val riksvegrute : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Filtrer på riksvegrute. Kommaseparert liste. Se /omrader/riksvegruter for mulige verdier.  Eksempel: `RUTE4A` eller som enumid `20290`
val vegforvalter : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Filtrer på vegforvalter. Kommaseparert liste. Se [/omrader/api/v4/vegforvaltere](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der) for mulige verdier.  Eksempel: `Møre og Romsdal fylkeskommune` eller som enumid `21774`
val vegsystemreferanse : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Filtrer vegobjekter på [vegsystemreferanse](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: `EV6S1D1 m12`
val kartutsnitt : kotlin.String = kartutsnitt_example // kotlin.String | Filtrer vegobjekter med kartutsnitt i det gjeldende geografiske referansesystemet (`srid`-paramteret). Formatet er `minX, minY, maxX, maxY`. Merk at vegobjektets bounding box benyttes for sammenligning, som kan medføre at vegobjekter som er utenfor kartutsnittet også returneres. For å unngå dette, kan du bruke `polygon` i stedet.  Eksempel: `265273, 7019372, 346553, 7061071`
val polygon : kotlin.String = polygon_example // kotlin.String | Filtrer vegobjekter med polygon i det gjeldende geografiske referansesystemet (`srid`-paramteret). Merk: For statistikk-spørringer vil polygonets bounding box benyttes, ikke polygonet selv.  Eksempel: `20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000`
val typeveg : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Filtrer Relasjonstype.vegobjekter på type veg på vegnettet objektet er stedfestet på. Kommaseparert liste.  Eksempel: `kanalisertVeg, enkelBilveg, rampe, rundkjøring, bilferje, passasjerferje, gangOgSykkelveg, sykkelveg, gangveg, gågate, fortau, trapp, gangfelt, gatetun, traktorveg, sti, annet`
val adskiltelop : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Filtrer vegobjekter på om de er stedfestet hvor det er en Strekning med verdi satt for «adskilte løp».
val kryssystem : kotlin.Boolean = true // kotlin.Boolean | Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Kryssystem.
val sideanlegg : kotlin.Boolean = true // kotlin.Boolean | Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Sideanlegg.
val trafikantgruppe : kotlin.String = trafikantgruppe_example // kotlin.String | Filtrer vegobjekter på trafikantgruppe.
val inkluder : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Kommaseparert liste av statistikkfelt som skal inkluderes i resultatet.
val veglenkesekvens : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Filtrer vegobjekter på om de er stedfestet på gjeldende veglenkesekvenser. Kommaseparert liste.  Eksempel: `0.37@319531,0.83-0.97@41640`
val veglenketype : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Filtrer vegobjekter på veglenketype på vegnettet objektet er stedfestet. Kommaseparert liste.
val detaljniva : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Filtrer vegobjekter på detaljnivå på vegnettet objektet er stedfestet på (kortnavn fra datakatalogen).
val endretEtter : kotlinx.datetime.Instant = 2013-10-20T19:20:30+01:00 // kotlinx.datetime.Instant | Finner statistikk for vegobjekter som har blitt endret etter dette tidspunktet. Eksmepel: 2024-12-02T10:15:30
val tidspunkt : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Finner statistikk for vegobjekter som var gyldige denne datoen.
val egenskap : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Filtrer vegobjekter på egenskaper, relasjoner og overlapp. Se [dokumentasjon](https://nvdb.atlas.vegvesen.no/docs/produkter/nvdbapil/v4/introduksjon/Avanserte_filter)
val overlapp : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Filtrer vegobjekter på overlapp. Se [dokumentasjon](https://nvdb.atlas.vegvesen.no/docs/produkter/nvdbapil/v4/introduksjon/Avanserte_filter)
try {
    val result : VegobjekterStatistikk = apiInstance.getVegobjekterStatistikk(vegobjekttypeid, srid, segmentering, fylke, kommune, kontraktsomrade, riksvegrute, vegforvalter, vegsystemreferanse, kartutsnitt, polygon, typeveg, adskiltelop, kryssystem, sideanlegg, trafikantgruppe, inkluder, veglenkesekvens, veglenketype, detaljniva, endretEtter, tidspunkt, egenskap, overlapp)
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

| Name                   | Type                                             | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     | Notes                                                                                                                                                                                              |
| ---------------------- | ------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **vegobjekttypeid**    | **kotlin.Int**                                   | Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier. Eksempel: 581                                                                                                                                                                                                                                                                                                                                                                                        |
| **srid**               | **kotlin.String**                                | Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;. | [optional] [enum: 5972, 5973, 5975, 4326, UTM32, UTM33, UTM35, WGS84]                                                                                                                              |
| **segmentering**       | **kotlin.Boolean**                               | Angir om strekningsobjekter skal segmenteres etter søkeområdet (fylke, kommune, vegsystemreferanse, kontraktsområde, riksvegrute, vegforvalter). Default: &#x60;true&#x60;                                                                                                                                                                                                                                                                                                                                                      | [optional]                                                                                                                                                                                         |
| **fylke**              | **kotlin.collections.List&lt;kotlin.Int&gt;**    | Filtrer på fylke. Kommaseparert liste. Se /omrader/fylker for mulige verdier. Eksempel: &#x60;50&#x60;                                                                                                                                                                                                                                                                                                                                                                                                                          | [optional]                                                                                                                                                                                         |
| **kommune**            | **kotlin.collections.List&lt;kotlin.Int&gt;**    | Filtrer på kommune. Kommaseparert liste. Se /omrader/kommuner for mulige verdier. Eksempel: &#x60;5001&#x60;                                                                                                                                                                                                                                                                                                                                                                                                                    | [optional]                                                                                                                                                                                         |
| **kontraktsomrade**    | **kotlin.collections.List&lt;kotlin.String&gt;** | Filtrer på kontraktsomrade. Kommaseparert liste. Se /omrader/kontraktsomrader for mulige verdier. Eksempel: &#x60;1539 Tunnel- og bergsikr 2018-2023 Nordm og Romsd&#x60;                                                                                                                                                                                                                                                                                                                                                       | [optional]                                                                                                                                                                                         |
| **riksvegrute**        | **kotlin.collections.List&lt;kotlin.String&gt;** | Filtrer på riksvegrute. Kommaseparert liste. Se /omrader/riksvegruter for mulige verdier. Eksempel: &#x60;RUTE4A&#x60; eller som enumid &#x60;20290&#x60;                                                                                                                                                                                                                                                                                                                                                                       | [optional]                                                                                                                                                                                         |
| **vegforvalter**       | **kotlin.collections.List&lt;kotlin.String&gt;** | Filtrer på vegforvalter. Kommaseparert liste. Se [/omrader/api/v4/vegforvaltere](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der) for mulige verdier. Eksempel: &#x60;Møre og Romsdal fylkeskommune&#x60; eller som enumid &#x60;21774&#x60;                                                                                                                                                                                                                                   | [optional]                                                                                                                                                                                         |
| **vegsystemreferanse** | **kotlin.collections.List&lt;kotlin.String&gt;** | Filtrer vegobjekter på [vegsystemreferanse](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område. Eksempel: &#x60;EV6S1D1 m12&#x60;                                                                                                                                                                                                                                                                | [optional]                                                                                                                                                                                         |
| **kartutsnitt**        | **kotlin.String**                                | Filtrer vegobjekter med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;. Merk at vegobjektets bounding box benyttes for sammenligning, som kan medføre at vegobjekter som er utenfor kartutsnittet også returneres. For å unngå dette, kan du bruke &#x60;polygon&#x60; i stedet. Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60;                                                                                                | [optional]                                                                                                                                                                                         |
| **polygon**            | **kotlin.String**                                | Filtrer vegobjekter med polygon i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Merk: For statistikk-spørringer vil polygonets bounding box benyttes, ikke polygonet selv. Eksempel: &#x60;20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000&#x60;                                                                                                                                                                                                                                        | [optional]                                                                                                                                                                                         |
| **typeveg**            | **kotlin.collections.List&lt;kotlin.String&gt;** | Filtrer Relasjonstype.vegobjekter på type veg på vegnettet objektet er stedfestet på. Kommaseparert liste. Eksempel: &#x60;kanalisertVeg, enkelBilveg, rampe, rundkjøring, bilferje, passasjerferje, gangOgSykkelveg, sykkelveg, gangveg, gågate, fortau, trapp, gangfelt, gatetun, traktorveg, sti, annet&#x60;                                                                                                                                                                                                                | [optional] [enum: kanalisertVeg, enkelBilveg, rampe, rundkjøring, bilferje, passasjerferje, gangOgSykkelveg, sykkelveg, gangveg, gågate, fortau, trapp, gangfelt, gatetun, traktorveg, sti, annet] |
| **adskiltelop**        | **kotlin.collections.List&lt;kotlin.String&gt;** | Filtrer vegobjekter på om de er stedfestet hvor det er en Strekning med verdi satt for «adskilte løp».                                                                                                                                                                                                                                                                                                                                                                                                                          | [optional] [enum: Med, Mot, Nei]                                                                                                                                                                   |
| **kryssystem**         | **kotlin.Boolean**                               | Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Kryssystem.                                                                                                                                                                                                                                                                                                                                                                                                                                             | [optional]                                                                                                                                                                                         |
| **sideanlegg**         | **kotlin.Boolean**                               | Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Sideanlegg.                                                                                                                                                                                                                                                                                                                                                                                                                                             | [optional]                                                                                                                                                                                         |
| **trafikantgruppe**    | **kotlin.String**                                | Filtrer vegobjekter på trafikantgruppe.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | [optional] [enum: K, G]                                                                                                                                                                            |
| **inkluder**           | **kotlin.collections.List&lt;kotlin.String&gt;** | Kommaseparert liste av statistikkfelt som skal inkluderes i resultatet.                                                                                                                                                                                                                                                                                                                                                                                                                                                         | [optional] [enum: lengde, antall, alle]                                                                                                                                                            |
| **veglenkesekvens**    | **kotlin.collections.List&lt;kotlin.String&gt;** | Filtrer vegobjekter på om de er stedfestet på gjeldende veglenkesekvenser. Kommaseparert liste. Eksempel: &#x60;0.37@319531,0.83-0.97@41640&#x60;                                                                                                                                                                                                                                                                                                                                                                               | [optional]                                                                                                                                                                                         |
| **veglenketype**       | **kotlin.collections.List&lt;kotlin.String&gt;** | Filtrer vegobjekter på veglenketype på vegnettet objektet er stedfestet. Kommaseparert liste.                                                                                                                                                                                                                                                                                                                                                                                                                                   | [optional] [enum: ukjent, detaljert, konnektering, detaljert_konnektering, hoved]                                                                                                                  |
| **detaljniva**         | **kotlin.collections.List&lt;kotlin.String&gt;** | Filtrer vegobjekter på detaljnivå på vegnettet objektet er stedfestet på (kortnavn fra datakatalogen).                                                                                                                                                                                                                                                                                                                                                                                                                          | [optional] [enum: VT, KB, KF, VTKB]                                                                                                                                                                |
| **endretEtter**        | **kotlinx.datetime.Instant**                     | Finner statistikk for vegobjekter som har blitt endret etter dette tidspunktet. Eksmepel: 2024-12-02T10:15:30                                                                                                                                                                                                                                                                                                                                                                                                                   | [optional]                                                                                                                                                                                         |
| **tidspunkt**          | **java.time.LocalDate**                          | Finner statistikk for vegobjekter som var gyldige denne datoen.                                                                                                                                                                                                                                                                                                                                                                                                                                                                 | [optional]                                                                                                                                                                                         |
| **egenskap**           | **kotlin.collections.List&lt;kotlin.String&gt;** | Filtrer vegobjekter på egenskaper, relasjoner og overlapp. Se [dokumentasjon](https://nvdb.atlas.vegvesen.no/docs/produkter/nvdbapil/v4/introduksjon/Avanserte_filter)                                                                                                                                                                                                                                                                                                                                                          | [optional]                                                                                                                                                                                         |
| **overlapp**           | **kotlin.collections.List&lt;kotlin.String&gt;** | Filtrer vegobjekter på overlapp. Se [dokumentasjon](https://nvdb.atlas.vegvesen.no/docs/produkter/nvdbapil/v4/introduksjon/Avanserte_filter)                                                                                                                                                                                                                                                                                                                                                                                    | [optional]                                                                                                                                                                                         |

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

> kotlin.collections.List&lt;VegobjekterStatistikkGruppert&gt; getVegobjekterStatistikkGruppert(vegobjekttypeid, gruppering, srid, kartutsnitt, inkluder, veglenkesekvens, tidspunkt)

Hent statistikk for en vegobjekttype, gruppert på ett eller flere felter

### Example

```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import no.vegvesen.nvdb.vegobjekter.model.*

val apiInstance = StatistikkApi()
val vegobjekttypeid : kotlin.Int = 56 // kotlin.Int |
val gruppering : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Velg en eller flere felter som statistikken skal grupperes på.
val srid : kotlin.String = srid_example // kotlin.String | Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: <a href='https://epsg.io/5972'>EPSG:5972</a> <a href='https://epsg.io/5973'>EPSG:5973</a> <a href='https://epsg.io/5975'>EPSG:5975</a> <a href='https://epsg.io/4326'>EPSG:4326</a>.
val kartutsnitt : kotlin.String = kartutsnitt_example // kotlin.String | Filtrer vegobjekter med kartutsnitt i det gjeldende geografiske referansesystemet (`srid`-paramteret). Formatet er `minX, minY, maxX, maxY`. Merk at vegobjektets bounding box benyttes for sammenligning, som kan medføre at vegobjekter som er utenfor kartutsnittet også returneres. For å unngå dette, kan du bruke `polygon` i stedet.  Eksempel: `265273, 7019372, 346553, 7061071`
val inkluder : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Kommaseparert liste av statistikkfelt som skal inkluderes i resultatet.
val veglenkesekvens : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Filtrer vegobjekter på om de er stedfestet på gjeldende veglenkesekvenser. Kommaseparert liste.  Eksempel: `0.37@319531,0.83-0.97@41640`
val tidspunkt : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Finner versjonen som var gyldig denne datoen.
try {
    val result : kotlin.collections.List<VegobjekterStatistikkGruppert> = apiInstance.getVegobjekterStatistikkGruppert(vegobjekttypeid, gruppering, srid, kartutsnitt, inkluder, veglenkesekvens, tidspunkt)
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

| Name                | Type                                             | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     | Notes                                                                 |
| ------------------- | ------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------- |
| **vegobjekttypeid** | **kotlin.Int**                                   |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
| **gruppering**      | **kotlin.collections.List&lt;kotlin.String&gt;** | Velg en eller flere felter som statistikken skal grupperes på.                                                                                                                                                                                                                                                                                                                                                                                                                                                                  | [enum: fylke, kommune, vegkategori]                                   |
| **srid**            | **kotlin.String**                                | Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;. | [optional] [enum: 5972, 5973, 5975, 4326, UTM32, UTM33, UTM35, WGS84] |
| **kartutsnitt**     | **kotlin.String**                                | Filtrer vegobjekter med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;. Merk at vegobjektets bounding box benyttes for sammenligning, som kan medføre at vegobjekter som er utenfor kartutsnittet også returneres. For å unngå dette, kan du bruke &#x60;polygon&#x60; i stedet. Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60;                                                                                                | [optional]                                                            |
| **inkluder**        | **kotlin.collections.List&lt;kotlin.String&gt;** | Kommaseparert liste av statistikkfelt som skal inkluderes i resultatet.                                                                                                                                                                                                                                                                                                                                                                                                                                                         | [optional] [enum: lengde, antall, alle]                               |
| **veglenkesekvens** | **kotlin.collections.List&lt;kotlin.String&gt;** | Filtrer vegobjekter på om de er stedfestet på gjeldende veglenkesekvenser. Kommaseparert liste. Eksempel: &#x60;0.37@319531,0.83-0.97@41640&#x60;                                                                                                                                                                                                                                                                                                                                                                               | [optional]                                                            |
| **tidspunkt**       | **java.time.LocalDate**                          | Finner versjonen som var gyldig denne datoen.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   | [optional]                                                            |

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

> kotlin.collections.List&lt;VegobjekterStatistikkMedType&gt; getVegobjekterStatistikkMedTyper(inkluder, tidspunkt)

Hent overordnet statistikk for alle vegobjekttyper

### Example

```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import no.vegvesen.nvdb.vegobjekter.model.*

val apiInstance = StatistikkApi()
val inkluder : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Kommaseparert liste av statistikkfelt som skal inkluderes i resultatet.
val tidspunkt : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Finner versjonen som var gyldig denne datoen.
try {
    val result : kotlin.collections.List<VegobjekterStatistikkMedType> = apiInstance.getVegobjekterStatistikkMedTyper(inkluder, tidspunkt)
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

| Name          | Type                                             | Description                                                             | Notes                                   |
| ------------- | ------------------------------------------------ | ----------------------------------------------------------------------- | --------------------------------------- |
| **inkluder**  | **kotlin.collections.List&lt;kotlin.String&gt;** | Kommaseparert liste av statistikkfelt som skal inkluderes i resultatet. | [optional] [enum: lengde, antall, alle] |
| **tidspunkt** | **java.time.LocalDate**                          | Finner versjonen som var gyldig denne datoen.                           | [optional]                              |

### Return type

**kotlin.collections.List&lt;VegobjekterStatistikkMedType&gt;**

### Authorization

Configure bearerAuth:
ApiClient.accessToken = ""

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

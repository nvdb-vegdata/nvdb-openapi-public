# VegnettApi

All URIs are relative to *https://nvdbapiles.atlas.vegvesen.no/vegnett-blue*

| Method                                                                         | HTTP request                                                     | Description                        |
| ------------------------------------------------------------------------------ | ---------------------------------------------------------------- | ---------------------------------- |
| [**getSegmentertVeglenkesekvens**](VegnettApi.md#getSegmentertVeglenkesekvens) | **GET** /api/v4/veglenkesekvenser/segmentert/{veglenkesekvensId} | Hent en segmentert veglenkesekvens |
| [**getVeglenkesegmenter**](VegnettApi.md#getVeglenkesegmenter)                 | **GET** /api/v4/veglenkesekvenser/segmentert                     | Hent segmenterte veglenkesekvenser |
| [**getVeglenkesekvens**](VegnettApi.md#getVeglenkesekvens)                     | **GET** /api/v4/veglenkesekvenser/{veglenkesekvensId}            | Hent en veglenkesekvens            |
| [**getVeglenkesekvenser**](VegnettApi.md#getVeglenkesekvenser)                 | **GET** /api/v4/veglenkesekvenser                                | Hent veglenkesekvenser             |

<a id="getSegmentertVeglenkesekvens"></a>

# **getSegmentertVeglenkesekvens**

> kotlin.collections.List&lt;Veglenkesegment&gt; getSegmentertVeglenkesekvens(veglenkesekvensId, srid, historisk, tidspunkt)

Hent en segmentert veglenkesekvens

### Example

```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import no.vegvesen.nvdb.vegnett.model.*

val apiInstance = VegnettApi()
val veglenkesekvensId : kotlin.Long = 789 // kotlin.Long | ID for veglenkesekvensen.
val srid : kotlin.String = srid_example // kotlin.String | Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: <a href='https://epsg.io/5972'>EPSG:5972</a> <a href='https://epsg.io/5973'>EPSG:5973</a> <a href='https://epsg.io/5975'>EPSG:5975</a> <a href='https://epsg.io/4326'>EPSG:4326</a>.
val historisk : kotlin.Boolean = true // kotlin.Boolean | For `false` returneres kun dagens veglenkesegmenter. For `true` returneres dagens og historiske veglenkesegmenter. Default er `false`.
val tidspunkt : kotlinx.datetime.LocalDate = 2013-10-20 // kotlinx.datetime.LocalDate | Begrens spørring til det gitte tidspunktet.
try {
    val result : kotlin.collections.List<Veglenkesegment> = apiInstance.getSegmentertVeglenkesekvens(veglenkesekvensId, srid, historisk, tidspunkt)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VegnettApi#getSegmentertVeglenkesekvens")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VegnettApi#getSegmentertVeglenkesekvens")
    e.printStackTrace()
}
```

### Parameters

| **veglenkesekvensId** | **kotlin.Long**| ID for veglenkesekvensen. | |
| **srid** | **kotlin.String**| Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;. | [optional] [enum: 5972, 5973, 5975, 4326, UTM32, UTM33, UTM35, WGS84] |
| **historisk** | **kotlin.Boolean**| For &#x60;false&#x60; returneres kun dagens veglenkesegmenter. For &#x60;true&#x60; returneres dagens og historiske veglenkesegmenter. Default er &#x60;false&#x60;. | [optional] |
| Name | Type | Description | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tidspunkt** | **kotlinx.datetime.LocalDate**| Begrens spørring til det gitte tidspunktet. | [optional] |

### Return type

**kotlin.collections.List&lt;Veglenkesegment&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

<a id="getVeglenkesegmenter"></a>

# **getVeglenkesegmenter**

> VeglenkesegmenterSide getVeglenkesegmenter(srid, ider, fylke, kommune, kontraktsomrade, riksvegrute, vegforvalter, vegsystemreferanse, kartutsnitt, polygon, detaljniva, typeveg, superid, adskiltelop, kryssystem, sideanlegg, veglenketype, arm, trafikantgruppe, geometritoleranse, historisk, tidspunkt, antall, start, inkluderAntall)

Hent segmenterte veglenkesekvenser

### Example

```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import no.vegvesen.nvdb.vegnett.model.*

val apiInstance = VegnettApi()
val srid : kotlin.String = srid_example // kotlin.String | Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: <a href='https://epsg.io/5972'>EPSG:5972</a> <a href='https://epsg.io/5973'>EPSG:5973</a> <a href='https://epsg.io/5975'>EPSG:5975</a> <a href='https://epsg.io/4326'>EPSG:4326</a>.
val ider : kotlin.collections.Set<kotlin.Long> =  // kotlin.collections.Set<kotlin.Long> | Kommaseparert liste med IDer.
val fylke : kotlin.collections.Set<kotlin.Int> =  // kotlin.collections.Set<kotlin.Int> | Filtrer på fylke. Kommaseparert liste. Se [/omrader/api/v4/fylker](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der) for mulige verdier.  Eksempel: `50`
val kommune : kotlin.collections.Set<kotlin.Int> =  // kotlin.collections.Set<kotlin.Int> | Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der) for mulige verdier.  Eksempel: `5001`
val kontraktsomrade : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | Filtrer på kontraktsomrade. Kommaseparert liste. Se [/omrader/api/v4/kontraktsomrader](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der) for mulige verdier.  Eksempel: `1539 Tunnel- og bergsikr 2018-2023 Nordm og Romsd`
val riksvegrute : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | Filtrer på riksvegrute. Kommaseparert liste. Se [/omrader/api/v4/riksvegruter](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der) for mulige verdier.  Eksempel: `RUTE4A` eller som enumid `20290`
val vegforvalter : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | Filtrer på vegforvalter. Kommaseparert liste. Se [/omrader/api/v4/vegforvaltere](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der) for mulige verdier.  Eksempel: `Møre og Romsdal fylkeskommune` eller som enumid `21774`
val vegsystemreferanse : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | Filtrer på [vegsystemreferanse](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: `EV6S1D1 m12`
val kartutsnitt : kotlin.String = kartutsnitt_example // kotlin.String | Filtrer med kartutsnitt i det gjeldende geografiske referansesystemet (`srid`-paramteret). Formatet er `minX, minY, maxX, maxY`.  Eksempel: `265273, 7019372, 346553, 7061071`
val polygon : kotlin.String = polygon_example // kotlin.String | Filtrer med polygon i det gjeldende geografiske referansesystemet (`srid`-paramteret).  Eksempel: `20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000`
val detaljniva : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | Filtrer på veglenkens detaljnivå (kortnavn fra datakatalogen). Kommaseparert liste.   Eksempel: `VT,VTKB`
val typeveg : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | Filtrer veglenker på type veg. Kommaseparert liste.  Eksempel: `kanalisertVeg, enkelBilveg, rampe, rundkjøring, bilferje, passasjerferje, gangOgSykkelveg, sykkelveg, gangveg, gågate, fortau, trapp, gangfelt, gatetun, traktorveg, sti, annet`
val superid : kotlin.Long = 789 // kotlin.Long | Hent detaljerte veglenkesegmenter stedfestet på veglenkesekvens med denne IDen.
val adskiltelop : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | Filtrer på om veglenkesegmentene er stedfestet hvor det er en Strekning med verdi satt for «adskilte løp».
val kryssystem : kotlin.Boolean = true // kotlin.Boolean | Filtrer på om de er stedfestet på samme sted hvor det er et Kryssystem.
val sideanlegg : kotlin.Boolean = true // kotlin.Boolean | Filtrer på om de er stedfestet på samme sted hvor det er et Sideanlegg.
val veglenketype : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | Filtrer på veglenken sin veglenketype. Kommaseparert liste.
val arm : kotlin.Boolean = true // kotlin.Boolean | Filtrer veglenker på om de er stedfestet på en Strekning med verdi satt for «arm».
val trafikantgruppe : kotlin.String = trafikantgruppe_example // kotlin.String | Filtrer på trafikantgruppe.
val geometritoleranse : kotlin.Int = 56 // kotlin.Int | Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.
val historisk : kotlin.Boolean = true // kotlin.Boolean | For `false` returneres kun dagens veglenkesegmenter. For `true` returneres dagens og historiske veglenkesegmenter. Default er `false`.
val tidspunkt : kotlinx.datetime.LocalDate = 2013-10-20 // kotlinx.datetime.LocalDate | Begrens spørring til det gitte tidspunktet.
val antall : kotlin.Int = 56 // kotlin.Int | Angir hvor mange objekter som skal returneres. Se også `sidestørrelse` i responsens `metadata`-objekt.
val start : kotlin.String = start_example // kotlin.String | Angir paginerings-start for objekter som skal returneres. Brukes sammen med `antall`. Neste start får man i metadata-feltet i responsen. Settes blankt for å starte fra begynnelsen.
val inkluderAntall : kotlin.Boolean = true // kotlin.Boolean | Hvorvidt totalt antall objekter skal returneres i responsen. Default er `false`.
try {
    val result : VeglenkesegmenterSide = apiInstance.getVeglenkesegmenter(srid, ider, fylke, kommune, kontraktsomrade, riksvegrute, vegforvalter, vegsystemreferanse, kartutsnitt, polygon, detaljniva, typeveg, superid, adskiltelop, kryssystem, sideanlegg, veglenketype, arm, trafikantgruppe, geometritoleranse, historisk, tidspunkt, antall, start, inkluderAntall)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VegnettApi#getVeglenkesegmenter")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VegnettApi#getVeglenkesegmenter")
    e.printStackTrace()
}
```

### Parameters

| **srid** | **kotlin.String**| Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;. | [optional] [enum: 5972, 5973, 5975, 4326, UTM32, UTM33, UTM35, WGS84] |
| **ider** | **kotlin.collections.Set&lt;kotlin.Long&gt;**| Kommaseparert liste med IDer. | [optional] |
| **fylke** | **kotlin.collections.Set&lt;kotlin.Int&gt;**| Filtrer på fylke. Kommaseparert liste. Se [/omrader/api/v4/fylker](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der) for mulige verdier. Eksempel: &#x60;50&#x60; | [optional] |
| **kommune** | **kotlin.collections.Set&lt;kotlin.Int&gt;**| Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der) for mulige verdier. Eksempel: &#x60;5001&#x60; | [optional] |
| **kontraktsomrade** | **kotlin.collections.Set&lt;kotlin.String&gt;**| Filtrer på kontraktsomrade. Kommaseparert liste. Se [/omrader/api/v4/kontraktsomrader](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der) for mulige verdier. Eksempel: &#x60;1539 Tunnel- og bergsikr 2018-2023 Nordm og Romsd&#x60; | [optional] |
| **riksvegrute** | **kotlin.collections.Set&lt;kotlin.String&gt;**| Filtrer på riksvegrute. Kommaseparert liste. Se [/omrader/api/v4/riksvegruter](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der) for mulige verdier. Eksempel: &#x60;RUTE4A&#x60; eller som enumid &#x60;20290&#x60; | [optional] |
| **vegforvalter** | **kotlin.collections.Set&lt;kotlin.String&gt;**| Filtrer på vegforvalter. Kommaseparert liste. Se [/omrader/api/v4/vegforvaltere](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der) for mulige verdier. Eksempel: &#x60;Møre og Romsdal fylkeskommune&#x60; eller som enumid &#x60;21774&#x60; | [optional] |
| **vegsystemreferanse** | **kotlin.collections.Set&lt;kotlin.String&gt;**| Filtrer på [vegsystemreferanse](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område. Eksempel: &#x60;EV6S1D1 m12&#x60; | [optional] |
| **kartutsnitt** | **kotlin.String**| Filtrer med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;. Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60; | [optional] |
| **polygon** | **kotlin.String**| Filtrer med polygon i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Eksempel: &#x60;20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000&#x60; | [optional] |
| **detaljniva** | **kotlin.collections.Set&lt;kotlin.String&gt;**| Filtrer på veglenkens detaljnivå (kortnavn fra datakatalogen). Kommaseparert liste. Eksempel: &#x60;VT,VTKB&#x60; | [optional] [enum: VT, KB, KF, VTKB] |
| **typeveg** | **kotlin.collections.Set&lt;kotlin.String&gt;**| Filtrer veglenker på type veg. Kommaseparert liste. Eksempel: &#x60;kanalisertVeg, enkelBilveg, rampe, rundkjøring, bilferje, passasjerferje, gangOgSykkelveg, sykkelveg, gangveg, gågate, fortau, trapp, gangfelt, gatetun, traktorveg, sti, annet&#x60; | [optional] [enum: kanalisertVeg, enkelBilveg, rampe, rundkjøring, bilferje, passasjerferje, gangOgSykkelveg, sykkelveg, gangveg, gågate, fortau, trapp, gangfelt, gatetun, traktorveg, sti, annet] |
| **superid** | **kotlin.Long**| Hent detaljerte veglenkesegmenter stedfestet på veglenkesekvens med denne IDen. | [optional] |
| **adskiltelop** | **kotlin.collections.Set&lt;kotlin.String&gt;**| Filtrer på om veglenkesegmentene er stedfestet hvor det er en Strekning med verdi satt for «adskilte løp». | [optional] [enum: Med, Mot, Nei] |
| **kryssystem** | **kotlin.Boolean**| Filtrer på om de er stedfestet på samme sted hvor det er et Kryssystem. | [optional] |
| **sideanlegg** | **kotlin.Boolean**| Filtrer på om de er stedfestet på samme sted hvor det er et Sideanlegg. | [optional] |
| **veglenketype** | **kotlin.collections.Set&lt;kotlin.String&gt;**| Filtrer på veglenken sin veglenketype. Kommaseparert liste. | [optional] [enum: Hoved, Detaljert, Konnektering, detaljert_konnektering] |
| **arm** | **kotlin.Boolean**| Filtrer veglenker på om de er stedfestet på en Strekning med verdi satt for «arm». | [optional] |
| **trafikantgruppe** | **kotlin.String**| Filtrer på trafikantgruppe. | [optional] [enum: K, G] |
| **geometritoleranse** | **kotlin.Int**| Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri. Nummeret angir distansetoleranse i meter for generering av forenklet geometri. | [optional] |
| **historisk** | **kotlin.Boolean**| For &#x60;false&#x60; returneres kun dagens veglenkesegmenter. For &#x60;true&#x60; returneres dagens og historiske veglenkesegmenter. Default er &#x60;false&#x60;. | [optional] |
| **tidspunkt** | **kotlinx.datetime.LocalDate**| Begrens spørring til det gitte tidspunktet. | [optional] |
| **antall** | **kotlin.Int**| Angir hvor mange objekter som skal returneres. Se også &#x60;sidestørrelse&#x60; i responsens &#x60;metadata&#x60;-objekt. | [optional] |
| **start** | **kotlin.String**| Angir paginerings-start for objekter som skal returneres. Brukes sammen med &#x60;antall&#x60;. Neste start får man i metadata-feltet i responsen. Settes blankt for å starte fra begynnelsen. | [optional] |
| Name | Type | Description | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **inkluderAntall** | **kotlin.Boolean**| Hvorvidt totalt antall objekter skal returneres i responsen. Default er &#x60;false&#x60;. | [optional] |

### Return type

**VeglenkesegmenterSide**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

<a id="getVeglenkesekvens"></a>

# **getVeglenkesekvens**

> Veglenkesekvens getVeglenkesekvens(veglenkesekvensId, srid)

Hent en veglenkesekvens

### Example

```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import no.vegvesen.nvdb.vegnett.model.*

val apiInstance = VegnettApi()
val veglenkesekvensId : kotlin.Long = 789 // kotlin.Long | ID for veglenkesekvensen.
val srid : kotlin.String = srid_example // kotlin.String | Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: <a href='https://epsg.io/5972'>EPSG:5972</a> <a href='https://epsg.io/5973'>EPSG:5973</a> <a href='https://epsg.io/5975'>EPSG:5975</a> <a href='https://epsg.io/4326'>EPSG:4326</a>.
try {
    val result : Veglenkesekvens = apiInstance.getVeglenkesekvens(veglenkesekvensId, srid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VegnettApi#getVeglenkesekvens")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VegnettApi#getVeglenkesekvens")
    e.printStackTrace()
}
```

### Parameters

| **veglenkesekvensId** | **kotlin.Long**| ID for veglenkesekvensen. | |
| Name | Type | Description | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **srid** | **kotlin.String**| Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;. | [optional] [enum: 5972, 5973, 5975, 4326, UTM32, UTM33, UTM35, WGS84] |

### Return type

**Veglenkesekvens**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

<a id="getVeglenkesekvenser"></a>

# **getVeglenkesekvenser**

> VeglenkesekvenserSide getVeglenkesekvenser(ider, fylke, kommune, kontraktsomrade, riksvegrute, vegsystemreferanse, topologiniva, superid, srid, antall, start, inkluderAntall)

Hent veglenkesekvenser

### Example

```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import no.vegvesen.nvdb.vegnett.model.*

val apiInstance = VegnettApi()
val ider : kotlin.collections.Set<kotlin.Long> =  // kotlin.collections.Set<kotlin.Long> | Kommaseparert liste med IDer.
val fylke : kotlin.collections.Set<kotlin.Int> =  // kotlin.collections.Set<kotlin.Int> | Filtrer på fylke. Kommaseparert liste. Se [/omrader/api/v4/fylker](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der) for mulige verdier.  Eksempel: `50`
val kommune : kotlin.collections.Set<kotlin.Int> =  // kotlin.collections.Set<kotlin.Int> | Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der) for mulige verdier.  Eksempel: `5001`
val kontraktsomrade : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | Filtrer på kontraktsomrade. Kommaseparert liste. Se [/omrader/api/v4/kontraktsomrader](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der) for mulige verdier.  Eksempel: `1539 Tunnel- og bergsikr 2018-2023 Nordm og Romsd`
val riksvegrute : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | Filtrer på riksvegrute. Kommaseparert liste. Se [/omrader/api/v4/riksvegruter](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der) for mulige verdier.  Eksempel: `RUTE4A` eller som enumid `20290`
val vegsystemreferanse : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | Filtrer på [vegsystemreferanse](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: `EV6S1D1 m12`
val topologiniva : kotlin.String = topologiniva_example // kotlin.String | Hent kun elementer på det gitte topologinivået. - Dersom en veglenke har nivå vegtrasé er ofte feltet for topologinivå ikke tilstede. Man vil da få alle veglenker som ikke har verdi `kjørefelt` eller `kjørebane`.
val superid : kotlin.Long = 789 // kotlin.Long | Hent detaljerte veglenkesekvenser stedfestet på veglenkesekvens med denne IDen.
val srid : kotlin.String = srid_example // kotlin.String | Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: <a href='https://epsg.io/5972'>EPSG:5972</a> <a href='https://epsg.io/5973'>EPSG:5973</a> <a href='https://epsg.io/5975'>EPSG:5975</a> <a href='https://epsg.io/4326'>EPSG:4326</a>.
val antall : kotlin.Int = 56 // kotlin.Int | Angir hvor mange objekter som skal returneres. Se også `sidestørrelse` i responsens `metadata`-objekt.
val start : kotlin.String = start_example // kotlin.String | Angir paginerings-start for objekter som skal returneres. Brukes sammen med `antall`. Neste start får man i metadata-feltet i responsen. Settes blankt for å starte fra begynnelsen.
val inkluderAntall : kotlin.Boolean = true // kotlin.Boolean | Hvorvidt totalt antall objekter skal returneres i responsen. Default er `false`.
try {
    val result : VeglenkesekvenserSide = apiInstance.getVeglenkesekvenser(ider, fylke, kommune, kontraktsomrade, riksvegrute, vegsystemreferanse, topologiniva, superid, srid, antall, start, inkluderAntall)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VegnettApi#getVeglenkesekvenser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VegnettApi#getVeglenkesekvenser")
    e.printStackTrace()
}
```

### Parameters

| **ider** | **kotlin.collections.Set&lt;kotlin.Long&gt;**| Kommaseparert liste med IDer. | [optional] |
| **fylke** | **kotlin.collections.Set&lt;kotlin.Int&gt;**| Filtrer på fylke. Kommaseparert liste. Se [/omrader/api/v4/fylker](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der) for mulige verdier. Eksempel: &#x60;50&#x60; | [optional] |
| **kommune** | **kotlin.collections.Set&lt;kotlin.Int&gt;**| Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der) for mulige verdier. Eksempel: &#x60;5001&#x60; | [optional] |
| **kontraktsomrade** | **kotlin.collections.Set&lt;kotlin.String&gt;**| Filtrer på kontraktsomrade. Kommaseparert liste. Se [/omrader/api/v4/kontraktsomrader](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der) for mulige verdier. Eksempel: &#x60;1539 Tunnel- og bergsikr 2018-2023 Nordm og Romsd&#x60; | [optional] |
| **riksvegrute** | **kotlin.collections.Set&lt;kotlin.String&gt;**| Filtrer på riksvegrute. Kommaseparert liste. Se [/omrader/api/v4/riksvegruter](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der) for mulige verdier. Eksempel: &#x60;RUTE4A&#x60; eller som enumid &#x60;20290&#x60; | [optional] |
| **vegsystemreferanse** | **kotlin.collections.Set&lt;kotlin.String&gt;**| Filtrer på [vegsystemreferanse](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område. Eksempel: &#x60;EV6S1D1 m12&#x60; | [optional] |
| **topologiniva** | **kotlin.String**| Hent kun elementer på det gitte topologinivået. - Dersom en veglenke har nivå vegtrasé er ofte feltet for topologinivå ikke tilstede. Man vil da få alle veglenker som ikke har verdi &#x60;kjørefelt&#x60; eller &#x60;kjørebane&#x60;. | [optional] [enum: kjørebane, kjørefelt, vegtrase] |
| **superid** | **kotlin.Long**| Hent detaljerte veglenkesekvenser stedfestet på veglenkesekvens med denne IDen. | [optional] |
| **srid** | **kotlin.String**| Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;. | [optional] [enum: 5972, 5973, 5975, 4326, UTM32, UTM33, UTM35, WGS84] |
| **antall** | **kotlin.Int**| Angir hvor mange objekter som skal returneres. Se også &#x60;sidestørrelse&#x60; i responsens &#x60;metadata&#x60;-objekt. | [optional] |
| **start** | **kotlin.String**| Angir paginerings-start for objekter som skal returneres. Brukes sammen med &#x60;antall&#x60;. Neste start får man i metadata-feltet i responsen. Settes blankt for å starte fra begynnelsen. | [optional] |
| Name | Type | Description | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **inkluderAntall** | **kotlin.Boolean**| Hvorvidt totalt antall objekter skal returneres i responsen. Default er &#x60;false&#x60;. | [optional] |

### Return type

**VeglenkesekvenserSide**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

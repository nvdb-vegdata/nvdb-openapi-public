# NoderApi

All URIs are relative to *https://nvdbapiles.atlas.vegvesen.no/vegnett-blue*

| Method                               | HTTP request               | Description  |
| ------------------------------------ | -------------------------- | ------------ |
| [**getNode**](NoderApi.md#getNode)   | **GET** /api/v4/noder/{id} | Hent en node |
| [**getNoder**](NoderApi.md#getNoder) | **GET** /api/v4/noder      | Hent noder   |

<a id="getNode"></a>

# **getNode**

> Node getNode(id, srid)

Hent en node

### Example

```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import no.vegvesen.nvdb.vegnett.model.*

val apiInstance = NoderApi()
val id : kotlin.Long = 789 // kotlin.Long | ID for noden.
val srid : kotlin.String = srid_example // kotlin.String | Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: <a href='https://epsg.io/5972'>EPSG:5972</a> <a href='https://epsg.io/5973'>EPSG:5973</a> <a href='https://epsg.io/5975'>EPSG:5975</a> <a href='https://epsg.io/4326'>EPSG:4326</a>.
try {
    val result : Node = apiInstance.getNode(id, srid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NoderApi#getNode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NoderApi#getNode")
    e.printStackTrace()
}
```

### Parameters

| **id** | **kotlin.Long**| ID for noden. | |
| Name | Type | Description | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **srid** | **kotlin.String**| Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;. | [optional] [enum: 5972, 5973, 5975, 4326, UTM32, UTM33, UTM35, WGS84] |

### Return type

**Node**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

<a id="getNoder"></a>

# **getNoder**

> NodeSide getNoder(srid, ider, fylke, kommune, kontraktsomrade, vegsystemreferanse, kartutsnitt, polygon, superid, antall, start, inkluderAntall)

Hent noder

### Example

```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import no.vegvesen.nvdb.vegnett.model.*

val apiInstance = NoderApi()
val srid : kotlin.String = srid_example // kotlin.String | Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: <a href='https://epsg.io/5972'>EPSG:5972</a> <a href='https://epsg.io/5973'>EPSG:5973</a> <a href='https://epsg.io/5975'>EPSG:5975</a> <a href='https://epsg.io/4326'>EPSG:4326</a>.
val ider : kotlin.collections.Set<kotlin.Long> =  // kotlin.collections.Set<kotlin.Long> | Kommaseparert liste med IDer.
val fylke : kotlin.collections.Set<kotlin.Int> =  // kotlin.collections.Set<kotlin.Int> | Filtrer på fylke. Kommaseparert liste. Se [/omrader/api/v4/fylker](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der) for mulige verdier.  Eksempel: `50`
val kommune : kotlin.collections.Set<kotlin.Int> =  // kotlin.collections.Set<kotlin.Int> | Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der) for mulige verdier.  Eksempel: `5001`
val kontraktsomrade : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | Filtrer på kontraktsomrade. Kommaseparert liste. Se [/omrader/api/v4/kontraktsomrader](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der) for mulige verdier.  Eksempel: `1539 Tunnel- og bergsikr 2018-2023 Nordm og Romsd`
val vegsystemreferanse : kotlin.collections.Set<kotlin.String> =  // kotlin.collections.Set<kotlin.String> | Filtrer på [vegsystemreferanse](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: `EV6S1D1 m12`
val kartutsnitt : kotlin.String = kartutsnitt_example // kotlin.String | Filtrer med kartutsnitt i det gjeldende geografiske referansesystemet (`srid`-paramteret). Formatet er `minX, minY, maxX, maxY`.  Eksempel: `265273, 7019372, 346553, 7061071`
val polygon : kotlin.String = polygon_example // kotlin.String | Filtrer med polygon i det gjeldende geografiske referansesystemet (`srid`-paramteret).  Eksempel: `20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000`
val superid : kotlin.Long = 789 // kotlin.Long | Hent noder tilkoblet detaljerte veglenker stedfestet på veglenkesekvens med denne IDen.
val antall : kotlin.Int = 56 // kotlin.Int | Angir hvor mange objekter som skal returneres. Se også `sidestørrelse` i responsens `metadata`-objekt.
val start : kotlin.String = start_example // kotlin.String | Angir paginerings-start for objekter som skal returneres. Brukes sammen med `antall`. Neste start får man i metadata-feltet i responsen. Settes blankt for å starte fra begynnelsen.
val inkluderAntall : kotlin.Boolean = true // kotlin.Boolean | Hvorvidt totalt antall objekter skal returneres i responsen. Default er `false`.
try {
    val result : NodeSide = apiInstance.getNoder(srid, ider, fylke, kommune, kontraktsomrade, vegsystemreferanse, kartutsnitt, polygon, superid, antall, start, inkluderAntall)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NoderApi#getNoder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NoderApi#getNoder")
    e.printStackTrace()
}
```

### Parameters

| **srid** | **kotlin.String**| Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;. | [optional] [enum: 5972, 5973, 5975, 4326, UTM32, UTM33, UTM35, WGS84] |
| **ider** | **kotlin.collections.Set&lt;kotlin.Long&gt;**| Kommaseparert liste med IDer. | [optional] |
| **fylke** | **kotlin.collections.Set&lt;kotlin.Int&gt;**| Filtrer på fylke. Kommaseparert liste. Se [/omrader/api/v4/fylker](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der) for mulige verdier. Eksempel: &#x60;50&#x60; | [optional] |
| **kommune** | **kotlin.collections.Set&lt;kotlin.Int&gt;**| Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der) for mulige verdier. Eksempel: &#x60;5001&#x60; | [optional] |
| **kontraktsomrade** | **kotlin.collections.Set&lt;kotlin.String&gt;**| Filtrer på kontraktsomrade. Kommaseparert liste. Se [/omrader/api/v4/kontraktsomrader](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der) for mulige verdier. Eksempel: &#x60;1539 Tunnel- og bergsikr 2018-2023 Nordm og Romsd&#x60; | [optional] |
| **vegsystemreferanse** | **kotlin.collections.Set&lt;kotlin.String&gt;**| Filtrer på [vegsystemreferanse](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område. Eksempel: &#x60;EV6S1D1 m12&#x60; | [optional] |
| **kartutsnitt** | **kotlin.String**| Filtrer med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;. Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60; | [optional] |
| **polygon** | **kotlin.String**| Filtrer med polygon i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Eksempel: &#x60;20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000&#x60; | [optional] |
| **superid** | **kotlin.Long**| Hent noder tilkoblet detaljerte veglenker stedfestet på veglenkesekvens med denne IDen. | [optional] |
| **antall** | **kotlin.Int**| Angir hvor mange objekter som skal returneres. Se også &#x60;sidestørrelse&#x60; i responsens &#x60;metadata&#x60;-objekt. | [optional] |
| **start** | **kotlin.String**| Angir paginerings-start for objekter som skal returneres. Brukes sammen med &#x60;antall&#x60;. Neste start får man i metadata-feltet i responsen. Settes blankt for å starte fra begynnelsen. | [optional] |
| Name | Type | Description | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **inkluderAntall** | **kotlin.Boolean**| Hvorvidt totalt antall objekter skal returneres i responsen. Default er &#x60;false&#x60;. | [optional] |

### Return type

**NodeSide**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

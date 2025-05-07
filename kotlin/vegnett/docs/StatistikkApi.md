# StatistikkApi

All URIs are relative to *https://nvdbapiles.atlas.vegvesen.no/vegnett-blue*

| Method                                                                                                | HTTP request                                                     | Description                                                               |
| ----------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------- |
| [**getVeglenkesegmenterStatistikkGruppert**](StatistikkApi.md#getVeglenkesegmenterStatistikkGruppert) | **GET** /api/v4/veglenkesekvenser/segmentert/statistikk/gruppert | Hent statistikk for segmentert vegnett, gruppert på en eller flere felter |

<a id="getVeglenkesegmenterStatistikkGruppert"></a>

# **getVeglenkesegmenterStatistikkGruppert**

> kotlin.collections.List&lt;VeglenkesegmenterStatistikkGruppert&gt; getVeglenkesegmenterStatistikkGruppert(gruppering, srid, kartutsnitt)

Hent statistikk for segmentert vegnett, gruppert på en eller flere felter

### Example

```kotlin
// Import classes:
//import no.vegvesen.nvdb.vegnett.infrastructure.*
//import no.vegvesen.nvdb.vegnett.model.*

val apiInstance = StatistikkApi()
val gruppering : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Velg en eller flere felter som statistikken skal grupperes på.
val srid : kotlin.String = srid_example // kotlin.String | Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: <a href='https://epsg.io/5972'>EPSG:5972</a> <a href='https://epsg.io/5973'>EPSG:5973</a> <a href='https://epsg.io/5975'>EPSG:5975</a> <a href='https://epsg.io/4326'>EPSG:4326</a>.
val kartutsnitt : kotlin.String = kartutsnitt_example // kotlin.String | Filtrer med kartutsnitt i det gjeldende geografiske referansesystemet (`srid`-paramteret). Formatet er `minX, minY, maxX, maxY`.  Eksempel: `265273, 7019372, 346553, 7061071`
try {
    val result : kotlin.collections.List<VeglenkesegmenterStatistikkGruppert> = apiInstance.getVeglenkesegmenterStatistikkGruppert(gruppering, srid, kartutsnitt)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StatistikkApi#getVeglenkesegmenterStatistikkGruppert")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StatistikkApi#getVeglenkesegmenterStatistikkGruppert")
    e.printStackTrace()
}
```

### Parameters

| **gruppering** | **kotlin.collections.List&lt;kotlin.String&gt;**| Velg en eller flere felter som statistikken skal grupperes på. | [enum: fylke, vegkategori] |
| **srid** | **kotlin.String**| Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;. | [optional] [enum: 5972, 5973, 5975, 4326, UTM32, UTM33, UTM35, WGS84] |
| Name | Type | Description | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **kartutsnitt** | **kotlin.String**| Filtrer med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;. Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60; | [optional] |

### Return type

**kotlin.collections.List&lt;VeglenkesegmenterStatistikkGruppert&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

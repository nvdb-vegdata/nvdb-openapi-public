# DatakatalogenApi

All URIs are relative to *https://nvdbapiles.atlas.vegvesen.no/datakatalog*

| Method                                                                                       | HTTP request                                                       | Description                                                                       |
| -------------------------------------------------------------------------------------------- | ------------------------------------------------------------------ | --------------------------------------------------------------------------------- |
| [**getEgenskapstype**](DatakatalogenApi.md#getEgenskapstype)                                 | **GET** /api/v1/egenskapstyper/{egenskapstypeid}                   | Returnerer angitt egenskapstype                                                   |
| [**getEgenskapstypeForVegobjekttype**](DatakatalogenApi.md#getEgenskapstypeForVegobjekttype) | **GET** /api/v1/vegobjekttyper/{vegobjekttypeid}/{egenskapstypeid} | Returnerer angitt egenskapstype for angitt vegobjekttype                          |
| [**getEgenskapstypeKategorier**](DatakatalogenApi.md#getEgenskapstypeKategorier)             | **GET** /api/v1/egenskapstypekategorier                            | Returnerer alle kategorier for egenskapstypene                                    |
| [**getEnheter**](DatakatalogenApi.md#getEnheter)                                             | **GET** /api/v1/enheter                                            | Returnerer alle enheter                                                           |
| [**getKategorier**](DatakatalogenApi.md#getKategorier)                                       | **GET** /api/v1/kategorier                                         | Returnerer alle kategorier for vegobjekter                                        |
| [**getVegobjekttype**](DatakatalogenApi.md#getVegobjekttype)                                 | **GET** /api/v1/vegobjekttyper/{vegobjekttypeid}                   | Returnerer angitt vegobjekttype                                                   |
| [**getVegobjekttyper**](DatakatalogenApi.md#getVegobjekttyper)                               | **GET** /api/v1/vegobjekttyper                                     | Returnerer alle vegobjekttypene                                                   |
| [**getVegobjekttyperHistorisk**](DatakatalogenApi.md#getVegobjekttyperHistorisk)             | **GET** /api/v1/vegobjekttyper/historisk/{versjon}                 | Returnerer alle vegobjekttypene for en gitt versjon av datakatalogen, f.eks. 2.31 |
| [**getVersjon**](DatakatalogenApi.md#getVersjon)                                             | **GET** /api/v1/versjon                                            | Returnerer aktiv versjon på datakatalog                                           |

<a id="getEgenskapstype"></a>

# **getEgenskapstype**

> Egenskapstype getEgenskapstype(egenskapstypeid)

Returnerer angitt egenskapstype

### Example

```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import no.vegvesen.nvdb.datakatalog.model.*

val apiInstance = DatakatalogenApi()
val egenskapstypeid : kotlin.Int = 56 // kotlin.Int |
try {
    val result : Egenskapstype = apiInstance.getEgenskapstype(egenskapstypeid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DatakatalogenApi#getEgenskapstype")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DatakatalogenApi#getEgenskapstype")
    e.printStackTrace()
}
```

### Parameters

| Name                | Type           | Description | Notes |
| ------------------- | -------------- | ----------- | ----- |
| **egenskapstypeid** | **kotlin.Int** |             |

### Return type

**Egenskapstype**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

<a id="getEgenskapstypeForVegobjekttype"></a>

# **getEgenskapstypeForVegobjekttype**

> Egenskapstype getEgenskapstypeForVegobjekttype(vegobjekttypeid, egenskapstypeid)

Returnerer angitt egenskapstype for angitt vegobjekttype

### Example

```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import no.vegvesen.nvdb.datakatalog.model.*

val apiInstance = DatakatalogenApi()
val vegobjekttypeid : kotlin.Int = 56 // kotlin.Int |
val egenskapstypeid : kotlin.Int = 56 // kotlin.Int |
try {
    val result : Egenskapstype = apiInstance.getEgenskapstypeForVegobjekttype(vegobjekttypeid, egenskapstypeid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DatakatalogenApi#getEgenskapstypeForVegobjekttype")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DatakatalogenApi#getEgenskapstypeForVegobjekttype")
    e.printStackTrace()
}
```

### Parameters

| Name                | Type           | Description | Notes |
| ------------------- | -------------- | ----------- | ----- |
| **vegobjekttypeid** | **kotlin.Int** |             |
| **egenskapstypeid** | **kotlin.Int** |             |

### Return type

**Egenskapstype**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

<a id="getEgenskapstypeKategorier"></a>

# **getEgenskapstypeKategorier**

> kotlin.collections.List&lt;EgenskapstypeKategori&gt; getEgenskapstypeKategorier()

Returnerer alle kategorier for egenskapstypene

### Example

```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import no.vegvesen.nvdb.datakatalog.model.*

val apiInstance = DatakatalogenApi()
try {
    val result : kotlin.collections.List<EgenskapstypeKategori> = apiInstance.getEgenskapstypeKategorier()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DatakatalogenApi#getEgenskapstypeKategorier")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DatakatalogenApi#getEgenskapstypeKategorier")
    e.printStackTrace()
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

**kotlin.collections.List&lt;EgenskapstypeKategori&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

<a id="getEnheter"></a>

# **getEnheter**

> kotlin.collections.List&lt;Enhet&gt; getEnheter()

Returnerer alle enheter

### Example

```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import no.vegvesen.nvdb.datakatalog.model.*

val apiInstance = DatakatalogenApi()
try {
    val result : kotlin.collections.List<Enhet> = apiInstance.getEnheter()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DatakatalogenApi#getEnheter")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DatakatalogenApi#getEnheter")
    e.printStackTrace()
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

**kotlin.collections.List&lt;Enhet&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

<a id="getKategorier"></a>

# **getKategorier**

> kotlin.collections.List&lt;Kategori&gt; getKategorier()

Returnerer alle kategorier for vegobjekter

### Example

```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import no.vegvesen.nvdb.datakatalog.model.*

val apiInstance = DatakatalogenApi()
try {
    val result : kotlin.collections.List<Kategori> = apiInstance.getKategorier()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DatakatalogenApi#getKategorier")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DatakatalogenApi#getKategorier")
    e.printStackTrace()
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

**kotlin.collections.List&lt;Kategori&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

<a id="getVegobjekttype"></a>

# **getVegobjekttype**

> Vegobjekttype getVegobjekttype(vegobjekttypeid, inkluder)

Returnerer angitt vegobjekttype

### Example

```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import no.vegvesen.nvdb.datakatalog.model.*

val apiInstance = DatakatalogenApi()
val vegobjekttypeid : kotlin.Int = 56 // kotlin.Int |
val inkluder : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Kommaseparert liste med hvilke informasjonsfelter som skal inkluderes i tillegg til vegobjekttypenes metadata.
try {
    val result : Vegobjekttype = apiInstance.getVegobjekttype(vegobjekttypeid, inkluder)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DatakatalogenApi#getVegobjekttype")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DatakatalogenApi#getVegobjekttype")
    e.printStackTrace()
}
```

### Parameters

| Name                | Type                                             | Description                                                                                                    | Notes                                                                         |
| ------------------- | ------------------------------------------------ | -------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| **vegobjekttypeid** | **kotlin.Int**                                   |                                                                                                                |
| **inkluder**        | **kotlin.collections.List&lt;kotlin.String&gt;** | Kommaseparert liste med hvilke informasjonsfelter som skal inkluderes i tillegg til vegobjekttypenes metadata. | [optional] [enum: egenskapstyper, relasjonstyper, stedfesting, alle, minimum] |

### Return type

**Vegobjekttype**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

<a id="getVegobjekttyper"></a>

# **getVegobjekttyper**

> kotlin.collections.List&lt;Vegobjekttype&gt; getVegobjekttyper(inkluder, kategori)

Returnerer alle vegobjekttypene

### Example

```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import no.vegvesen.nvdb.datakatalog.model.*

val apiInstance = DatakatalogenApi()
val inkluder : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Kommaseparert liste med hvilke informasjonsfelter som skal inkluderes i tillegg til vegobjekttypenes metadata.
val kategori : kotlin.Int = 56 // kotlin.Int | Begrens vegobjekttyper etter kategori. (/vegobjekttyper/kategorier)
try {
    val result : kotlin.collections.List<Vegobjekttype> = apiInstance.getVegobjekttyper(inkluder, kategori)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DatakatalogenApi#getVegobjekttyper")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DatakatalogenApi#getVegobjekttyper")
    e.printStackTrace()
}
```

### Parameters

| Name         | Type                                             | Description                                                                                                    | Notes                                                                         |
| ------------ | ------------------------------------------------ | -------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| **inkluder** | **kotlin.collections.List&lt;kotlin.String&gt;** | Kommaseparert liste med hvilke informasjonsfelter som skal inkluderes i tillegg til vegobjekttypenes metadata. | [optional] [enum: egenskapstyper, relasjonstyper, stedfesting, alle, minimum] |
| **kategori** | **kotlin.Int**                                   | Begrens vegobjekttyper etter kategori. (/vegobjekttyper/kategorier)                                            | [optional]                                                                    |

### Return type

**kotlin.collections.List&lt;Vegobjekttype&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

<a id="getVegobjekttyperHistorisk"></a>

# **getVegobjekttyperHistorisk**

> kotlin.collections.List&lt;Vegobjekttype&gt; getVegobjekttyperHistorisk(versjon, inkluder, kategori)

Returnerer alle vegobjekttypene for en gitt versjon av datakatalogen, f.eks. 2.31

### Example

```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import no.vegvesen.nvdb.datakatalog.model.*

val apiInstance = DatakatalogenApi()
val versjon : kotlin.String = versjon_example // kotlin.String |
val inkluder : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Kommaseparert liste med hvilke informasjonsfelter som skal inkluderes i tillegg til vegobjekttypenes metadata.
val kategori : kotlin.Int = 56 // kotlin.Int | Begrens vegobjekttyper etter kategori. (/vegobjekttyper/kategorier)
try {
    val result : kotlin.collections.List<Vegobjekttype> = apiInstance.getVegobjekttyperHistorisk(versjon, inkluder, kategori)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DatakatalogenApi#getVegobjekttyperHistorisk")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DatakatalogenApi#getVegobjekttyperHistorisk")
    e.printStackTrace()
}
```

### Parameters

| Name         | Type                                             | Description                                                                                                    | Notes                                                                         |
| ------------ | ------------------------------------------------ | -------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| **versjon**  | **kotlin.String**                                |                                                                                                                |
| **inkluder** | **kotlin.collections.List&lt;kotlin.String&gt;** | Kommaseparert liste med hvilke informasjonsfelter som skal inkluderes i tillegg til vegobjekttypenes metadata. | [optional] [enum: egenskapstyper, relasjonstyper, stedfesting, alle, minimum] |
| **kategori** | **kotlin.Int**                                   | Begrens vegobjekttyper etter kategori. (/vegobjekttyper/kategorier)                                            | [optional]                                                                    |

### Return type

**kotlin.collections.List&lt;Vegobjekttype&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

<a id="getVersjon"></a>

# **getVersjon**

> Versjon getVersjon()

Returnerer aktiv versjon på datakatalog

### Example

```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import no.vegvesen.nvdb.datakatalog.model.*

val apiInstance = DatakatalogenApi()
try {
    val result : Versjon = apiInstance.getVersjon()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DatakatalogenApi#getVersjon")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DatakatalogenApi#getVersjon")
    e.printStackTrace()
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

**Versjon**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

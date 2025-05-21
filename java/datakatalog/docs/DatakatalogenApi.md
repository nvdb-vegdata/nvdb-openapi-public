# DatakatalogenApi

All URIs are relative to *https://nvdbapiles.atlas.vegvesen.no/datakatalog*

| Method                                                                                       | HTTP request                                                          | Description                                                                       |
| -------------------------------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| [**getEgenskapstype**](DatakatalogenApi.md#getEgenskapstype)                                 | **GET** /api/v1/egenskapstyper/{egenskapstypeid}                      | Returnerer angitt egenskapstype                                                   |
| [**getEgenskapstypeForVegobjekttype**](DatakatalogenApi.md#getEgenskapstypeForVegobjekttype) | **GET** /api/v1/vegobjekttyper/{vegobjekttypeid}/{egenskapstypeid}    | Returnerer angitt egenskapstype for angitt vegobjekttype                          |
| [**getEgenskapstypeKategorier**](DatakatalogenApi.md#getEgenskapstypeKategorier)             | **GET** /api/v1/egenskapstypekategorier                               | Returnerer alle kategorier for egenskapstypene                                    |
| [**getEnheter**](DatakatalogenApi.md#getEnheter)                                             | **GET** /api/v1/enheter                                               | Returnerer alle enheter                                                           |
| [**getKategorier**](DatakatalogenApi.md#getKategorier)                                       | **GET** /api/v1/kategorier                                            | Returnerer alle kategorier for vegobjekter                                        |
| [**getProduktspesifikasjon**](DatakatalogenApi.md#getProduktspesifikasjon)                   | **GET** /api/v1/vegobjekttyper/{vegobjekttypeid}/produktspesifikasjon | Returnerer produktspesifikasjonen til den angitte vegobjekttypen                  |
| [**getVegobjekttype**](DatakatalogenApi.md#getVegobjekttype)                                 | **GET** /api/v1/vegobjekttyper/{vegobjekttypeid}                      | Returnerer angitt vegobjekttype                                                   |
| [**getVegobjekttyper**](DatakatalogenApi.md#getVegobjekttyper)                               | **GET** /api/v1/vegobjekttyper                                        | Returnerer alle vegobjekttypene                                                   |
| [**getVegobjekttyperHistorisk**](DatakatalogenApi.md#getVegobjekttyperHistorisk)             | **GET** /api/v1/vegobjekttyper/historisk/{versjon}                    | Returnerer alle vegobjekttypene for en gitt versjon av datakatalogen, f.eks. 2.31 |
| [**getVersjon**](DatakatalogenApi.md#getVersjon)                                             | **GET** /api/v1/versjon                                               | Returnerer aktiv versjon på datakatalog                                           |

## getEgenskapstype

> Egenskapstype getEgenskapstype(egenskapstypeid)

Returnerer angitt egenskapstype

### Example

```java
// Import classes:
import no.vegvesen.vt.nvdb.datakatalog.infrastructure.ApiClient;
import no.vegvesen.vt.nvdb.datakatalog.infrastructure.ApiException;
import no.vegvesen.vt.nvdb.datakatalog.infrastructure.Configuration;
import no.vegvesen.vt.nvdb.datakatalog.infrastructure.models.*;
import no.vegvesen.vt.nvdb.datakatalog.api.DatakatalogenApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://nvdbapiles.atlas.vegvesen.no/datakatalog");

        DatakatalogenApi apiInstance = new DatakatalogenApi(defaultClient);
        Integer egenskapstypeid = 56; // Integer |
        try {
            Egenskapstype result = apiInstance.getEgenskapstype(egenskapstypeid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DatakatalogenApi#getEgenskapstype");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name                | Type        | Description | Notes |
| ------------------- | ----------- | ----------- | ----- |
| **egenskapstypeid** | **Integer** |             |       |

### Return type

[**Egenskapstype**](Egenskapstype.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

### HTTP response details

| Status code | Description           | Response headers |
| ----------- | --------------------- | ---------------- |
| **500**     | Internal Server Error | -                |
| **503**     | Service Unavailable   | -                |
| **404**     | Not Found             | -                |
| **200**     | OK                    | -                |

## getEgenskapstypeForVegobjekttype

> Egenskapstype getEgenskapstypeForVegobjekttype(vegobjekttypeid, egenskapstypeid)

Returnerer angitt egenskapstype for angitt vegobjekttype

### Example

```java
// Import classes:
import no.vegvesen.vt.nvdb.datakatalog.infrastructure.ApiClient;
import no.vegvesen.vt.nvdb.datakatalog.infrastructure.ApiException;
import no.vegvesen.vt.nvdb.datakatalog.infrastructure.Configuration;
import no.vegvesen.vt.nvdb.datakatalog.infrastructure.models.*;
import no.vegvesen.vt.nvdb.datakatalog.api.DatakatalogenApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://nvdbapiles.atlas.vegvesen.no/datakatalog");

        DatakatalogenApi apiInstance = new DatakatalogenApi(defaultClient);
        Integer vegobjekttypeid = 56; // Integer |
        Integer egenskapstypeid = 56; // Integer |
        try {
            Egenskapstype result = apiInstance.getEgenskapstypeForVegobjekttype(vegobjekttypeid, egenskapstypeid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DatakatalogenApi#getEgenskapstypeForVegobjekttype");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name                | Type        | Description | Notes |
| ------------------- | ----------- | ----------- | ----- |
| **vegobjekttypeid** | **Integer** |             |       |
| **egenskapstypeid** | **Integer** |             |       |

### Return type

[**Egenskapstype**](Egenskapstype.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

### HTTP response details

| Status code | Description           | Response headers |
| ----------- | --------------------- | ---------------- |
| **500**     | Internal Server Error | -                |
| **503**     | Service Unavailable   | -                |
| **404**     | Not Found             | -                |
| **200**     | OK                    | -                |

## getEgenskapstypeKategorier

> List&lt;EgenskapstypeKategori&gt; getEgenskapstypeKategorier()

Returnerer alle kategorier for egenskapstypene

### Example

```java
// Import classes:
import no.vegvesen.vt.nvdb.datakatalog.infrastructure.ApiClient;
import no.vegvesen.vt.nvdb.datakatalog.infrastructure.ApiException;
import no.vegvesen.vt.nvdb.datakatalog.infrastructure.Configuration;
import no.vegvesen.vt.nvdb.datakatalog.infrastructure.models.*;
import no.vegvesen.vt.nvdb.datakatalog.api.DatakatalogenApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://nvdbapiles.atlas.vegvesen.no/datakatalog");

        DatakatalogenApi apiInstance = new DatakatalogenApi(defaultClient);
        try {
            List<EgenskapstypeKategori> result = apiInstance.getEgenskapstypeKategorier();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DatakatalogenApi#getEgenskapstypeKategorier");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;EgenskapstypeKategori&gt;**](EgenskapstypeKategori.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

### HTTP response details

| Status code | Description           | Response headers |
| ----------- | --------------------- | ---------------- |
| **500**     | Internal Server Error | -                |
| **503**     | Service Unavailable   | -                |
| **404**     | Not Found             | -                |
| **200**     | OK                    | -                |

## getEnheter

> List&lt;Enhet&gt; getEnheter()

Returnerer alle enheter

### Example

```java
// Import classes:
import no.vegvesen.vt.nvdb.datakatalog.infrastructure.ApiClient;
import no.vegvesen.vt.nvdb.datakatalog.infrastructure.ApiException;
import no.vegvesen.vt.nvdb.datakatalog.infrastructure.Configuration;
import no.vegvesen.vt.nvdb.datakatalog.infrastructure.models.*;
import no.vegvesen.vt.nvdb.datakatalog.api.DatakatalogenApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://nvdbapiles.atlas.vegvesen.no/datakatalog");

        DatakatalogenApi apiInstance = new DatakatalogenApi(defaultClient);
        try {
            List<Enhet> result = apiInstance.getEnheter();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DatakatalogenApi#getEnheter");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;Enhet&gt;**](Enhet.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

### HTTP response details

| Status code | Description           | Response headers |
| ----------- | --------------------- | ---------------- |
| **500**     | Internal Server Error | -                |
| **503**     | Service Unavailable   | -                |
| **404**     | Not Found             | -                |
| **200**     | OK                    | -                |

## getKategorier

> List&lt;Kategori&gt; getKategorier()

Returnerer alle kategorier for vegobjekter

### Example

```java
// Import classes:
import no.vegvesen.vt.nvdb.datakatalog.infrastructure.ApiClient;
import no.vegvesen.vt.nvdb.datakatalog.infrastructure.ApiException;
import no.vegvesen.vt.nvdb.datakatalog.infrastructure.Configuration;
import no.vegvesen.vt.nvdb.datakatalog.infrastructure.models.*;
import no.vegvesen.vt.nvdb.datakatalog.api.DatakatalogenApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://nvdbapiles.atlas.vegvesen.no/datakatalog");

        DatakatalogenApi apiInstance = new DatakatalogenApi(defaultClient);
        try {
            List<Kategori> result = apiInstance.getKategorier();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DatakatalogenApi#getKategorier");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;Kategori&gt;**](Kategori.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

### HTTP response details

| Status code | Description           | Response headers |
| ----------- | --------------------- | ---------------- |
| **500**     | Internal Server Error | -                |
| **503**     | Service Unavailable   | -                |
| **404**     | Not Found             | -                |
| **200**     | OK                    | -                |

## getProduktspesifikasjon

> ProductSpecification getProduktspesifikasjon(vegobjekttypeid)

Returnerer produktspesifikasjonen til den angitte vegobjekttypen

### Example

```java
// Import classes:
import no.vegvesen.vt.nvdb.datakatalog.infrastructure.ApiClient;
import no.vegvesen.vt.nvdb.datakatalog.infrastructure.ApiException;
import no.vegvesen.vt.nvdb.datakatalog.infrastructure.Configuration;
import no.vegvesen.vt.nvdb.datakatalog.infrastructure.models.*;
import no.vegvesen.vt.nvdb.datakatalog.api.DatakatalogenApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://nvdbapiles.atlas.vegvesen.no/datakatalog");

        DatakatalogenApi apiInstance = new DatakatalogenApi(defaultClient);
        Integer vegobjekttypeid = 56; // Integer |
        try {
            ProductSpecification result = apiInstance.getProduktspesifikasjon(vegobjekttypeid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DatakatalogenApi#getProduktspesifikasjon");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name                | Type        | Description | Notes |
| ------------------- | ----------- | ----------- | ----- |
| **vegobjekttypeid** | **Integer** |             |       |

### Return type

[**ProductSpecification**](ProductSpecification.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

### HTTP response details

| Status code | Description           | Response headers |
| ----------- | --------------------- | ---------------- |
| **500**     | Internal Server Error | -                |
| **503**     | Service Unavailable   | -                |
| **404**     | Not Found             | -                |
| **200**     | OK                    | -                |

## getVegobjekttype

> Vegobjekttype getVegobjekttype(vegobjekttypeid, inkluder)

Returnerer angitt vegobjekttype

### Example

```java
// Import classes:
import no.vegvesen.vt.nvdb.datakatalog.infrastructure.ApiClient;
import no.vegvesen.vt.nvdb.datakatalog.infrastructure.ApiException;
import no.vegvesen.vt.nvdb.datakatalog.infrastructure.Configuration;
import no.vegvesen.vt.nvdb.datakatalog.infrastructure.models.*;
import no.vegvesen.vt.nvdb.datakatalog.api.DatakatalogenApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://nvdbapiles.atlas.vegvesen.no/datakatalog");

        DatakatalogenApi apiInstance = new DatakatalogenApi(defaultClient);
        Integer vegobjekttypeid = 56; // Integer |
        Set<String> inkluder = Arrays.asList(); // Set<String> | Kommaseparert liste med hvilke informasjonsfelter som skal inkluderes i tillegg til vegobjekttypenes metadata.
        try {
            Vegobjekttype result = apiInstance.getVegobjekttype(vegobjekttypeid, inkluder);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DatakatalogenApi#getVegobjekttype");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name                | Type                               | Description                                                                                                    | Notes                                                                         |
| ------------------- | ---------------------------------- | -------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| **vegobjekttypeid** | **Integer**                        |                                                                                                                |                                                                               |
| **inkluder**        | [**Set&lt;String&gt;**](String.md) | Kommaseparert liste med hvilke informasjonsfelter som skal inkluderes i tillegg til vegobjekttypenes metadata. | [optional] [enum: egenskapstyper, relasjonstyper, stedfesting, alle, minimum] |

### Return type

[**Vegobjekttype**](Vegobjekttype.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

### HTTP response details

| Status code | Description           | Response headers |
| ----------- | --------------------- | ---------------- |
| **500**     | Internal Server Error | -                |
| **503**     | Service Unavailable   | -                |
| **404**     | Not Found             | -                |
| **200**     | OK                    | -                |

## getVegobjekttyper

> List&lt;Vegobjekttype&gt; getVegobjekttyper(inkluder, kategori)

Returnerer alle vegobjekttypene

### Example

```java
// Import classes:
import no.vegvesen.vt.nvdb.datakatalog.infrastructure.ApiClient;
import no.vegvesen.vt.nvdb.datakatalog.infrastructure.ApiException;
import no.vegvesen.vt.nvdb.datakatalog.infrastructure.Configuration;
import no.vegvesen.vt.nvdb.datakatalog.infrastructure.models.*;
import no.vegvesen.vt.nvdb.datakatalog.api.DatakatalogenApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://nvdbapiles.atlas.vegvesen.no/datakatalog");

        DatakatalogenApi apiInstance = new DatakatalogenApi(defaultClient);
        Set<String> inkluder = Arrays.asList(); // Set<String> | Kommaseparert liste med hvilke informasjonsfelter som skal inkluderes i tillegg til vegobjekttypenes metadata.
        Integer kategori = 56; // Integer | Begrens vegobjekttyper etter kategori. (/vegobjekttyper/kategorier)
        try {
            List<Vegobjekttype> result = apiInstance.getVegobjekttyper(inkluder, kategori);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DatakatalogenApi#getVegobjekttyper");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name         | Type                               | Description                                                                                                    | Notes                                                                         |
| ------------ | ---------------------------------- | -------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| **inkluder** | [**Set&lt;String&gt;**](String.md) | Kommaseparert liste med hvilke informasjonsfelter som skal inkluderes i tillegg til vegobjekttypenes metadata. | [optional] [enum: egenskapstyper, relasjonstyper, stedfesting, alle, minimum] |
| **kategori** | **Integer**                        | Begrens vegobjekttyper etter kategori. (/vegobjekttyper/kategorier)                                            | [optional]                                                                    |

### Return type

[**List&lt;Vegobjekttype&gt;**](Vegobjekttype.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

### HTTP response details

| Status code | Description           | Response headers |
| ----------- | --------------------- | ---------------- |
| **500**     | Internal Server Error | -                |
| **503**     | Service Unavailable   | -                |
| **404**     | Not Found             | -                |
| **200**     | OK                    | -                |

## getVegobjekttyperHistorisk

> List&lt;Vegobjekttype&gt; getVegobjekttyperHistorisk(versjon, inkluder, kategori)

Returnerer alle vegobjekttypene for en gitt versjon av datakatalogen, f.eks. 2.31

### Example

```java
// Import classes:
import no.vegvesen.vt.nvdb.datakatalog.infrastructure.ApiClient;
import no.vegvesen.vt.nvdb.datakatalog.infrastructure.ApiException;
import no.vegvesen.vt.nvdb.datakatalog.infrastructure.Configuration;
import no.vegvesen.vt.nvdb.datakatalog.infrastructure.models.*;
import no.vegvesen.vt.nvdb.datakatalog.api.DatakatalogenApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://nvdbapiles.atlas.vegvesen.no/datakatalog");

        DatakatalogenApi apiInstance = new DatakatalogenApi(defaultClient);
        String versjon = "versjon_example"; // String |
        Set<String> inkluder = Arrays.asList(); // Set<String> | Kommaseparert liste med hvilke informasjonsfelter som skal inkluderes i tillegg til vegobjekttypenes metadata.
        Integer kategori = 56; // Integer | Begrens vegobjekttyper etter kategori. (/vegobjekttyper/kategorier)
        try {
            List<Vegobjekttype> result = apiInstance.getVegobjekttyperHistorisk(versjon, inkluder, kategori);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DatakatalogenApi#getVegobjekttyperHistorisk");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name         | Type                               | Description                                                                                                    | Notes                                                                         |
| ------------ | ---------------------------------- | -------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| **versjon**  | **String**                         |                                                                                                                |                                                                               |
| **inkluder** | [**Set&lt;String&gt;**](String.md) | Kommaseparert liste med hvilke informasjonsfelter som skal inkluderes i tillegg til vegobjekttypenes metadata. | [optional] [enum: egenskapstyper, relasjonstyper, stedfesting, alle, minimum] |
| **kategori** | **Integer**                        | Begrens vegobjekttyper etter kategori. (/vegobjekttyper/kategorier)                                            | [optional]                                                                    |

### Return type

[**List&lt;Vegobjekttype&gt;**](Vegobjekttype.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

### HTTP response details

| Status code | Description           | Response headers |
| ----------- | --------------------- | ---------------- |
| **500**     | Internal Server Error | -                |
| **503**     | Service Unavailable   | -                |
| **404**     | Not Found             | -                |
| **200**     | OK                    | -                |

## getVersjon

> Versjon getVersjon()

Returnerer aktiv versjon på datakatalog

### Example

```java
// Import classes:
import no.vegvesen.vt.nvdb.datakatalog.infrastructure.ApiClient;
import no.vegvesen.vt.nvdb.datakatalog.infrastructure.ApiException;
import no.vegvesen.vt.nvdb.datakatalog.infrastructure.Configuration;
import no.vegvesen.vt.nvdb.datakatalog.infrastructure.models.*;
import no.vegvesen.vt.nvdb.datakatalog.api.DatakatalogenApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://nvdbapiles.atlas.vegvesen.no/datakatalog");

        DatakatalogenApi apiInstance = new DatakatalogenApi(defaultClient);
        try {
            Versjon result = apiInstance.getVersjon();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DatakatalogenApi#getVersjon");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Versjon**](Versjon.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

### HTTP response details

| Status code | Description           | Response headers |
| ----------- | --------------------- | ---------------- |
| **500**     | Internal Server Error | -                |
| **503**     | Service Unavailable   | -                |
| **404**     | Not Found             | -                |
| **200**     | OK                    | -                |

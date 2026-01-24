# DatakatalogenApi

All URIs are relative to *https://nvdbapiles.atlas.vegvesen.no/datakatalog*

| Method                                                                                       | HTTP request                                                          | Description                                                                       |
| -------------------------------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| [**getEgenskapstype**](DatakatalogenApi.md#getegenskapstype)                                 | **GET** /api/v1/egenskapstyper/{egenskapstypeid}                      | Returnerer angitt egenskapstype                                                   |
| [**getEgenskapstypeForVegobjekttype**](DatakatalogenApi.md#getegenskapstypeforvegobjekttype) | **GET** /api/v1/vegobjekttyper/{vegobjekttypeid}/{egenskapstypeid}    | Returnerer angitt egenskapstype for angitt vegobjekttype                          |
| [**getEgenskapstypeKategorier**](DatakatalogenApi.md#getegenskapstypekategorier)             | **GET** /api/v1/egenskapstypekategorier                               | Returnerer alle kategorier for egenskapstypene                                    |
| [**getEnheter**](DatakatalogenApi.md#getenheter)                                             | **GET** /api/v1/enheter                                               | Returnerer alle enheter                                                           |
| [**getKategorier**](DatakatalogenApi.md#getkategorier)                                       | **GET** /api/v1/kategorier                                            | Returnerer alle kategorier for vegobjekter                                        |
| [**getProduktspesifikasjon**](DatakatalogenApi.md#getproduktspesifikasjon)                   | **GET** /api/v1/vegobjekttyper/{vegobjekttypeid}/produktspesifikasjon | Returnerer produktspesifikasjonen til den angitte vegobjekttypen                  |
| [**getVegobjekttype**](DatakatalogenApi.md#getvegobjekttype)                                 | **GET** /api/v1/vegobjekttyper/{vegobjekttypeid}                      | Returnerer angitt vegobjekttype                                                   |
| [**getVegobjekttyper**](DatakatalogenApi.md#getvegobjekttyper)                               | **GET** /api/v1/vegobjekttyper                                        | Returnerer alle vegobjekttypene                                                   |
| [**getVegobjekttyperHistorisk**](DatakatalogenApi.md#getvegobjekttyperhistorisk)             | **GET** /api/v1/vegobjekttyper/historisk/{versjon}                    | Returnerer alle vegobjekttypene for en gitt versjon av datakatalogen, f.eks. 2.31 |
| [**getVersjon**](DatakatalogenApi.md#getversjon)                                             | **GET** /api/v1/versjon                                               | Returnerer aktiv versjon på datakatalog                                           |

## getEgenskapstype

> Egenskapstype getEgenskapstype(egenskapstypeid)

Returnerer angitt egenskapstype

### Example

```ts
import { Configuration, DatakatalogenApi } from ''
import type { GetEgenskapstypeRequest } from ''

async function example() {
  console.log('🚀 Testing  SDK...')
  const api = new DatakatalogenApi()

  const body = {
    // number
    egenskapstypeid: 56,
  } satisfies GetEgenskapstypeRequest

  try {
    const data = await api.getEgenskapstype(body)
    console.log(data)
  } catch (error) {
    console.error(error)
  }
}

// Run the test
example().catch(console.error)
```

### Parameters

| Name                | Type     | Description | Notes                     |
| ------------------- | -------- | ----------- | ------------------------- |
| **egenskapstypeid** | `number` |             | [Defaults to `undefined`] |

### Return type

[**Egenskapstype**](Egenskapstype.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `*/*`

### HTTP response details

| Status code | Description           | Response headers |
| ----------- | --------------------- | ---------------- |
| **500**     | Internal Server Error | -                |
| **503**     | Service Unavailable   | -                |
| **404**     | Not Found             | -                |
| **200**     | OK                    | -                |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

## getEgenskapstypeForVegobjekttype

> Egenskapstype getEgenskapstypeForVegobjekttype(vegobjekttypeid, egenskapstypeid)

Returnerer angitt egenskapstype for angitt vegobjekttype

### Example

```ts
import { Configuration, DatakatalogenApi } from ''
import type { GetEgenskapstypeForVegobjekttypeRequest } from ''

async function example() {
  console.log('🚀 Testing  SDK...')
  const api = new DatakatalogenApi()

  const body = {
    // number
    vegobjekttypeid: 56,
    // number
    egenskapstypeid: 56,
  } satisfies GetEgenskapstypeForVegobjekttypeRequest

  try {
    const data = await api.getEgenskapstypeForVegobjekttype(body)
    console.log(data)
  } catch (error) {
    console.error(error)
  }
}

// Run the test
example().catch(console.error)
```

### Parameters

| Name                | Type     | Description | Notes                     |
| ------------------- | -------- | ----------- | ------------------------- |
| **vegobjekttypeid** | `number` |             | [Defaults to `undefined`] |
| **egenskapstypeid** | `number` |             | [Defaults to `undefined`] |

### Return type

[**Egenskapstype**](Egenskapstype.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `*/*`

### HTTP response details

| Status code | Description           | Response headers |
| ----------- | --------------------- | ---------------- |
| **500**     | Internal Server Error | -                |
| **503**     | Service Unavailable   | -                |
| **404**     | Not Found             | -                |
| **200**     | OK                    | -                |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

## getEgenskapstypeKategorier

> Array&lt;EgenskapstypeKategori&gt; getEgenskapstypeKategorier()

Returnerer alle kategorier for egenskapstypene

### Example

```ts
import { Configuration, DatakatalogenApi } from ''
import type { GetEgenskapstypeKategorierRequest } from ''

async function example() {
  console.log('🚀 Testing  SDK...')
  const api = new DatakatalogenApi()

  try {
    const data = await api.getEgenskapstypeKategorier()
    console.log(data)
  } catch (error) {
    console.error(error)
  }
}

// Run the test
example().catch(console.error)
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Array&lt;EgenskapstypeKategori&gt;**](EgenskapstypeKategori.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `*/*`

### HTTP response details

| Status code | Description           | Response headers |
| ----------- | --------------------- | ---------------- |
| **500**     | Internal Server Error | -                |
| **503**     | Service Unavailable   | -                |
| **404**     | Not Found             | -                |
| **200**     | OK                    | -                |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

## getEnheter

> Array&lt;Enhet&gt; getEnheter()

Returnerer alle enheter

### Example

```ts
import { Configuration, DatakatalogenApi } from ''
import type { GetEnheterRequest } from ''

async function example() {
  console.log('🚀 Testing  SDK...')
  const api = new DatakatalogenApi()

  try {
    const data = await api.getEnheter()
    console.log(data)
  } catch (error) {
    console.error(error)
  }
}

// Run the test
example().catch(console.error)
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Array&lt;Enhet&gt;**](Enhet.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `*/*`

### HTTP response details

| Status code | Description           | Response headers |
| ----------- | --------------------- | ---------------- |
| **500**     | Internal Server Error | -                |
| **503**     | Service Unavailable   | -                |
| **404**     | Not Found             | -                |
| **200**     | OK                    | -                |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

## getKategorier

> Array&lt;Kategori&gt; getKategorier()

Returnerer alle kategorier for vegobjekter

### Example

```ts
import { Configuration, DatakatalogenApi } from ''
import type { GetKategorierRequest } from ''

async function example() {
  console.log('🚀 Testing  SDK...')
  const api = new DatakatalogenApi()

  try {
    const data = await api.getKategorier()
    console.log(data)
  } catch (error) {
    console.error(error)
  }
}

// Run the test
example().catch(console.error)
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Array&lt;Kategori&gt;**](Kategori.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `*/*`

### HTTP response details

| Status code | Description           | Response headers |
| ----------- | --------------------- | ---------------- |
| **500**     | Internal Server Error | -                |
| **503**     | Service Unavailable   | -                |
| **404**     | Not Found             | -                |
| **200**     | OK                    | -                |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

## getProduktspesifikasjon

> ProductSpecification getProduktspesifikasjon(vegobjekttypeid)

Returnerer produktspesifikasjonen til den angitte vegobjekttypen

### Example

```ts
import { Configuration, DatakatalogenApi } from ''
import type { GetProduktspesifikasjonRequest } from ''

async function example() {
  console.log('🚀 Testing  SDK...')
  const api = new DatakatalogenApi()

  const body = {
    // number
    vegobjekttypeid: 56,
  } satisfies GetProduktspesifikasjonRequest

  try {
    const data = await api.getProduktspesifikasjon(body)
    console.log(data)
  } catch (error) {
    console.error(error)
  }
}

// Run the test
example().catch(console.error)
```

### Parameters

| Name                | Type     | Description | Notes                     |
| ------------------- | -------- | ----------- | ------------------------- |
| **vegobjekttypeid** | `number` |             | [Defaults to `undefined`] |

### Return type

[**ProductSpecification**](ProductSpecification.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `*/*`

### HTTP response details

| Status code | Description           | Response headers |
| ----------- | --------------------- | ---------------- |
| **500**     | Internal Server Error | -                |
| **503**     | Service Unavailable   | -                |
| **404**     | Not Found             | -                |
| **200**     | OK                    | -                |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

## getVegobjekttype

> Vegobjekttype getVegobjekttype(vegobjekttypeid, inkluder)

Returnerer angitt vegobjekttype

### Example

```ts
import {
  Configuration,
  DatakatalogenApi,
} from '';
import type { GetVegobjekttypeRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new DatakatalogenApi();

  const body = {
    // number
    vegobjekttypeid: 56,
    // Set<'egenskapstyper' | 'relasjonstyper' | 'stedfesting' | 'alle' | 'minimum'> | Kommaseparert liste med hvilke informasjonsfelter som skal inkluderes i tillegg til vegobjekttypenes metadata. (optional)
    inkluder: ...,
  } satisfies GetVegobjekttypeRequest;

  try {
    const data = await api.getVegobjekttype(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters

| Name                | Type                                                                 | Description                                                                                                    | Notes                                                                         |
| ------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| **vegobjekttypeid** | `number`                                                             |                                                                                                                | [Defaults to `undefined`]                                                     |
| **inkluder**        | `egenskapstyper`, `relasjonstyper`, `stedfesting`, `alle`, `minimum` | Kommaseparert liste med hvilke informasjonsfelter som skal inkluderes i tillegg til vegobjekttypenes metadata. | [Optional] [Enum: egenskapstyper, relasjonstyper, stedfesting, alle, minimum] |

### Return type

[**Vegobjekttype**](Vegobjekttype.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `*/*`

### HTTP response details

| Status code | Description           | Response headers |
| ----------- | --------------------- | ---------------- |
| **500**     | Internal Server Error | -                |
| **503**     | Service Unavailable   | -                |
| **404**     | Not Found             | -                |
| **200**     | OK                    | -                |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

## getVegobjekttyper

> Array&lt;Vegobjekttype&gt; getVegobjekttyper(inkluder, kategori)

Returnerer alle vegobjekttypene

### Example

```ts
import {
  Configuration,
  DatakatalogenApi,
} from '';
import type { GetVegobjekttyperRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new DatakatalogenApi();

  const body = {
    // Set<'egenskapstyper' | 'relasjonstyper' | 'stedfesting' | 'alle' | 'minimum'> | Kommaseparert liste med hvilke informasjonsfelter som skal inkluderes i tillegg til vegobjekttypenes metadata. (optional)
    inkluder: ...,
    // number | Begrens vegobjekttyper etter kategori. (/vegobjekttyper/kategorier) (optional)
    kategori: 56,
  } satisfies GetVegobjekttyperRequest;

  try {
    const data = await api.getVegobjekttyper(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters

| Name         | Type                                                                 | Description                                                                                                    | Notes                                                                         |
| ------------ | -------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| **inkluder** | `egenskapstyper`, `relasjonstyper`, `stedfesting`, `alle`, `minimum` | Kommaseparert liste med hvilke informasjonsfelter som skal inkluderes i tillegg til vegobjekttypenes metadata. | [Optional] [Enum: egenskapstyper, relasjonstyper, stedfesting, alle, minimum] |
| **kategori** | `number`                                                             | Begrens vegobjekttyper etter kategori. (/vegobjekttyper/kategorier)                                            | [Optional] [Defaults to `undefined`]                                          |

### Return type

[**Array&lt;Vegobjekttype&gt;**](Vegobjekttype.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `*/*`

### HTTP response details

| Status code | Description           | Response headers |
| ----------- | --------------------- | ---------------- |
| **500**     | Internal Server Error | -                |
| **503**     | Service Unavailable   | -                |
| **404**     | Not Found             | -                |
| **200**     | OK                    | -                |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

## getVegobjekttyperHistorisk

> Array&lt;Vegobjekttype&gt; getVegobjekttyperHistorisk(versjon, inkluder, kategori)

Returnerer alle vegobjekttypene for en gitt versjon av datakatalogen, f.eks. 2.31

### Example

```ts
import {
  Configuration,
  DatakatalogenApi,
} from '';
import type { GetVegobjekttyperHistoriskRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new DatakatalogenApi();

  const body = {
    // string
    versjon: versjon_example,
    // Set<'egenskapstyper' | 'relasjonstyper' | 'stedfesting' | 'alle' | 'minimum'> | Kommaseparert liste med hvilke informasjonsfelter som skal inkluderes i tillegg til vegobjekttypenes metadata. (optional)
    inkluder: ...,
    // number | Begrens vegobjekttyper etter kategori. (/vegobjekttyper/kategorier) (optional)
    kategori: 56,
  } satisfies GetVegobjekttyperHistoriskRequest;

  try {
    const data = await api.getVegobjekttyperHistorisk(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters

| Name         | Type                                                                 | Description                                                                                                    | Notes                                                                         |
| ------------ | -------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| **versjon**  | `string`                                                             |                                                                                                                | [Defaults to `undefined`]                                                     |
| **inkluder** | `egenskapstyper`, `relasjonstyper`, `stedfesting`, `alle`, `minimum` | Kommaseparert liste med hvilke informasjonsfelter som skal inkluderes i tillegg til vegobjekttypenes metadata. | [Optional] [Enum: egenskapstyper, relasjonstyper, stedfesting, alle, minimum] |
| **kategori** | `number`                                                             | Begrens vegobjekttyper etter kategori. (/vegobjekttyper/kategorier)                                            | [Optional] [Defaults to `undefined`]                                          |

### Return type

[**Array&lt;Vegobjekttype&gt;**](Vegobjekttype.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `*/*`

### HTTP response details

| Status code | Description           | Response headers |
| ----------- | --------------------- | ---------------- |
| **500**     | Internal Server Error | -                |
| **503**     | Service Unavailable   | -                |
| **404**     | Not Found             | -                |
| **200**     | OK                    | -                |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

## getVersjon

> Versjon getVersjon()

Returnerer aktiv versjon på datakatalog

### Example

```ts
import { Configuration, DatakatalogenApi } from ''
import type { GetVersjonRequest } from ''

async function example() {
  console.log('🚀 Testing  SDK...')
  const api = new DatakatalogenApi()

  try {
    const data = await api.getVersjon()
    console.log(data)
  } catch (error) {
    console.error(error)
  }
}

// Run the test
example().catch(console.error)
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Versjon**](Versjon.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `*/*`

### HTTP response details

| Status code | Description           | Response headers |
| ----------- | --------------------- | ---------------- |
| **500**     | Internal Server Error | -                |
| **503**     | Service Unavailable   | -                |
| **404**     | Not Found             | -                |
| **200**     | OK                    | -                |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

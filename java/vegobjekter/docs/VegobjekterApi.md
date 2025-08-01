# VegobjekterApi

All URIs are relative to *https://nvdbapiles.atlas.vegvesen.no/vegobjekter*

| Method                                                                                 | HTTP request                                                          | Description                                        |
| -------------------------------------------------------------------------------------- | --------------------------------------------------------------------- | -------------------------------------------------- |
| [**getVegobjektById**](VegobjekterApi.md#getVegobjektById)                             | **GET** /api/v4/vegobjekt                                             | Hent enkelt vegobjekt                              |
| [**getVegobjektByTypeAndId**](VegobjekterApi.md#getVegobjektByTypeAndId)               | **GET** /api/v4/vegobjekter/{vegobjekttypeId}/{vegobjektId}           | Hent gjeldende versjon av et vegobjekt             |
| [**getVegobjektByTypeIdAndVersjon**](VegobjekterApi.md#getVegobjektByTypeIdAndVersjon) | **GET** /api/v4/vegobjekter/{vegobjekttypeId}/{vegobjektId}/{versjon} | Hent spesifikk versjon av et vegobjekt             |
| [**getVegobjektEndringerForType**](VegobjekterApi.md#getVegobjektEndringerForType)     | **GET** /api/v4/vegobjekter/{vegobjekttypeId}/endringer               | Hent endringer for en vegobjekttype innen 30 dager |
| [**getVegobjektVersjoner**](VegobjekterApi.md#getVegobjektVersjoner)                   | **GET** /api/v4/vegobjekter/{vegobjekttypeId}/{vegobjektId}/versjoner | Hent alle versjoner av et vegobjekt                |
| [**getVegobjekterByType**](VegobjekterApi.md#getVegobjekterByType)                     | **GET** /api/v4/vegobjekter/{vegobjekttypeId}                         | Hent vegobjekter av en type                        |

## getVegobjektById

> Vegobjekt getVegobjektById(id, inkluder, srid, inkludergeometri, inkluderEgenskaper, dybde, geometritoleranse, tidspunkt)

Hent enkelt vegobjekt

### Example

```java
// Import classes:
import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.ApiClient;
import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.ApiException;
import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.Configuration;
import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.auth.*;
import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.models.*;
import no.vegvesen.vt.nvdb.vegobjekter.api.VegobjekterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://nvdbapiles.atlas.vegvesen.no/vegobjekter");

        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        VegobjekterApi apiInstance = new VegobjekterApi(defaultClient);
        Long id = 56L; // Long | ID for vegobjekt som skal hentes.
        Set<InkluderIVegobjekt> inkluder = Arrays.asList(); // Set<InkluderIVegobjekt> | Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID.
        SridParameter srid = SridParameter.fromValue("5972"); // SridParameter | Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: <a href='https://epsg.io/5972'>EPSG:5972</a> <a href='https://epsg.io/5973'>EPSG:5973</a> <a href='https://epsg.io/5975'>EPSG:5975</a> <a href='https://epsg.io/4326'>EPSG:4326</a>.
        InkluderGeometri inkludergeometri = InkluderGeometri.fromValue("ingen"); // InkluderGeometri | Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under `vegobjekt.egenskaper` om den finnes, stedfestet geometri er plassert under `vegobjekt.lokasjon`. I tillegg til de nevnte feltene på vegobjekt-responsen returneres også `vegobjekt.geometri` (dersom man har `inkluder=geometri` eller `alle`), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved å se på `vegobjekt.geometri.egengeometri`.
        InkluderIEgenskaper inkluderEgenskaper = InkluderIEgenskaper.fromValue("basis"); // InkluderIEgenskaper | Gir mulighet til å filtrere hvilke egenskaper som skal returneres med inkluder=egenskaper. `basis` er alle egenskaper som ikke er geometri, eller lister av geometri.
        String dybde = "dybde_example"; // String | Hvor mange nivå barn skal inkluderes. 1 betyr bare IDer, 2-n betyr ett eller flere mellomnivåer, 'full' betyr alle nivåer.
        Integer geometritoleranse = 56; // Integer | Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.
        LocalDate tidspunkt = LocalDate.now(); // LocalDate | Finner versjonen som var gyldig denne datoen.
        try {
            Vegobjekt result = apiInstance.getVegobjektById(id, inkluder, srid, inkludergeometri, inkluderEgenskaper, dybde, geometritoleranse, tidspunkt);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VegobjekterApi#getVegobjektById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name                   | Type                                                       | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    | Notes                                                                 |
| ---------------------- | ---------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------- |
| **id**                 | **Long**                                                   | ID for vegobjekt som skal hentes.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |                                                                       |
| **inkluder**           | [**Set&lt;InkluderIVegobjekt&gt;**](InkluderIVegobjekt.md) | Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      | [optional]                                                            |
| **srid**               | [**SridParameter**](.md)                                   | Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.                                                                                                                                                                | [optional] [enum: 5972, 5973, 5975, 4326, UTM32, UTM33, UTM35, WGS84] |
| **inkludergeometri**   | [**InkluderGeometri**](.md)                                | Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under &#x60;vegobjekt.egenskaper&#x60; om den finnes, stedfestet geometri er plassert under &#x60;vegobjekt.lokasjon&#x60;. I tillegg til de nevnte feltene på vegobjekt-responsen returneres også &#x60;vegobjekt.geometri&#x60; (dersom man har &#x60;inkluder&#x3D;geometri&#x60; eller &#x60;alle&#x60;), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved å se på &#x60;vegobjekt.geometri.egengeometri&#x60;. | [optional] [enum: ingen, egenskap, lokasjon, utledet]                 |
| **inkluderEgenskaper** | [**InkluderIEgenskaper**](.md)                             | Gir mulighet til å filtrere hvilke egenskaper som skal returneres med inkluder&#x3D;egenskaper. &#x60;basis&#x60; er alle egenskaper som ikke er geometri, eller lister av geometri.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           | [optional] [enum: basis, geometri, alle]                              |
| **dybde**              | **String**                                                 | Hvor mange nivå barn skal inkluderes. 1 betyr bare IDer, 2-n betyr ett eller flere mellomnivåer, &#39;full&#39; betyr alle nivåer.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             | [optional]                                                            |
| **geometritoleranse**  | **Integer**                                                | Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     | [optional]                                                            |
| **tidspunkt**          | **LocalDate**                                              | Finner versjonen som var gyldig denne datoen.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  | [optional]                                                            |

### Return type

[**Vegobjekt**](Vegobjekt.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

### HTTP response details

| Status code | Description           | Response headers |
| ----------- | --------------------- | ---------------- |
| **500**     | Internal Server Error | -                |
| **400**     | Bad Request           | -                |
| **404**     | Not Found             | -                |
| **401**     | Unauthorized          | -                |
| **403**     | Forbidden             | -                |
| **200**     | OK                    | -                |

## getVegobjektByTypeAndId

> Vegobjekt getVegobjektByTypeAndId(vegobjekttypeId, vegobjektId, inkluder, srid, inkludergeometri, inkluderEgenskaper, dybde, geometritoleranse, tidspunkt)

Hent gjeldende versjon av et vegobjekt

### Example

```java
// Import classes:
import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.ApiClient;
import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.ApiException;
import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.Configuration;
import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.auth.*;
import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.models.*;
import no.vegvesen.vt.nvdb.vegobjekter.api.VegobjekterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://nvdbapiles.atlas.vegvesen.no/vegobjekter");

        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        VegobjekterApi apiInstance = new VegobjekterApi(defaultClient);
        Integer vegobjekttypeId = 56; // Integer | Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.  Eksempel: 581
        Long vegobjektId = 56L; // Long |
        Set<InkluderIVegobjekt> inkluder = Arrays.asList(); // Set<InkluderIVegobjekt> | Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID.
        SridParameter srid = SridParameter.fromValue("5972"); // SridParameter | Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: <a href='https://epsg.io/5972'>EPSG:5972</a> <a href='https://epsg.io/5973'>EPSG:5973</a> <a href='https://epsg.io/5975'>EPSG:5975</a> <a href='https://epsg.io/4326'>EPSG:4326</a>.
        InkluderGeometri inkludergeometri = InkluderGeometri.fromValue("ingen"); // InkluderGeometri | Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under `vegobjekt.egenskaper` om den finnes, stedfestet geometri er plassert under `vegobjekt.lokasjon`. I tillegg til de nevnte feltene på vegobjekt-responsen returneres også `vegobjekt.geometri` (dersom man har `inkluder=geometri` eller `alle`), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved å se på `vegobjekt.geometri.egengeometri`.
        InkluderIEgenskaper inkluderEgenskaper = InkluderIEgenskaper.fromValue("basis"); // InkluderIEgenskaper | Gir mulighet til å filtrere hvilke egenskaper som skal returneres med inkluder=egenskaper. `basis` er alle egenskaper som ikke er geometri, eller lister av geometri.
        String dybde = "dybde_example"; // String | Hvor mange nivå barn skal inkluderes. 1 betyr bare IDer, 2-n betyr ett eller flere mellomnivåer, 'full' betyr alle nivåer.
        Integer geometritoleranse = 56; // Integer | Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.
        LocalDate tidspunkt = LocalDate.now(); // LocalDate | Finner versjonen som var gyldig denne datoen.
        try {
            Vegobjekt result = apiInstance.getVegobjektByTypeAndId(vegobjekttypeId, vegobjektId, inkluder, srid, inkludergeometri, inkluderEgenskaper, dybde, geometritoleranse, tidspunkt);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VegobjekterApi#getVegobjektByTypeAndId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name                   | Type                                                       | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    | Notes                                                                 |
| ---------------------- | ---------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------- |
| **vegobjekttypeId**    | **Integer**                                                | Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier. Eksempel: 581                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |                                                                       |
| **vegobjektId**        | **Long**                                                   |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |                                                                       |
| **inkluder**           | [**Set&lt;InkluderIVegobjekt&gt;**](InkluderIVegobjekt.md) | Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      | [optional]                                                            |
| **srid**               | [**SridParameter**](.md)                                   | Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.                                                                                                                                                                | [optional] [enum: 5972, 5973, 5975, 4326, UTM32, UTM33, UTM35, WGS84] |
| **inkludergeometri**   | [**InkluderGeometri**](.md)                                | Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under &#x60;vegobjekt.egenskaper&#x60; om den finnes, stedfestet geometri er plassert under &#x60;vegobjekt.lokasjon&#x60;. I tillegg til de nevnte feltene på vegobjekt-responsen returneres også &#x60;vegobjekt.geometri&#x60; (dersom man har &#x60;inkluder&#x3D;geometri&#x60; eller &#x60;alle&#x60;), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved å se på &#x60;vegobjekt.geometri.egengeometri&#x60;. | [optional] [enum: ingen, egenskap, lokasjon, utledet]                 |
| **inkluderEgenskaper** | [**InkluderIEgenskaper**](.md)                             | Gir mulighet til å filtrere hvilke egenskaper som skal returneres med inkluder&#x3D;egenskaper. &#x60;basis&#x60; er alle egenskaper som ikke er geometri, eller lister av geometri.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           | [optional] [enum: basis, geometri, alle]                              |
| **dybde**              | **String**                                                 | Hvor mange nivå barn skal inkluderes. 1 betyr bare IDer, 2-n betyr ett eller flere mellomnivåer, &#39;full&#39; betyr alle nivåer.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             | [optional]                                                            |
| **geometritoleranse**  | **Integer**                                                | Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     | [optional]                                                            |
| **tidspunkt**          | **LocalDate**                                              | Finner versjonen som var gyldig denne datoen.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  | [optional]                                                            |

### Return type

[**Vegobjekt**](Vegobjekt.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

### HTTP response details

| Status code | Description           | Response headers |
| ----------- | --------------------- | ---------------- |
| **500**     | Internal Server Error | -                |
| **400**     | Bad Request           | -                |
| **404**     | Not Found             | -                |
| **401**     | Unauthorized          | -                |
| **403**     | Forbidden             | -                |
| **200**     | OK                    | -                |

## getVegobjektByTypeIdAndVersjon

> Vegobjekt getVegobjektByTypeIdAndVersjon(vegobjekttypeId, vegobjektId, versjon, inkluder, srid, inkludergeometri, inkluderEgenskaper, dybde, geometritoleranse, tidspunkt)

Hent spesifikk versjon av et vegobjekt

### Example

```java
// Import classes:
import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.ApiClient;
import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.ApiException;
import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.Configuration;
import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.auth.*;
import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.models.*;
import no.vegvesen.vt.nvdb.vegobjekter.api.VegobjekterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://nvdbapiles.atlas.vegvesen.no/vegobjekter");

        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        VegobjekterApi apiInstance = new VegobjekterApi(defaultClient);
        Integer vegobjekttypeId = 56; // Integer | Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.  Eksempel: 581
        Long vegobjektId = 56L; // Long |
        Integer versjon = 56; // Integer |
        Set<InkluderIVegobjekt> inkluder = Arrays.asList(); // Set<InkluderIVegobjekt> | Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID.
        SridParameter srid = SridParameter.fromValue("5972"); // SridParameter | Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: <a href='https://epsg.io/5972'>EPSG:5972</a> <a href='https://epsg.io/5973'>EPSG:5973</a> <a href='https://epsg.io/5975'>EPSG:5975</a> <a href='https://epsg.io/4326'>EPSG:4326</a>.
        InkluderGeometri inkludergeometri = InkluderGeometri.fromValue("ingen"); // InkluderGeometri | Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under `vegobjekt.egenskaper` om den finnes, stedfestet geometri er plassert under `vegobjekt.lokasjon`. I tillegg til de nevnte feltene på vegobjekt-responsen returneres også `vegobjekt.geometri` (dersom man har `inkluder=geometri` eller `alle`), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved å se på `vegobjekt.geometri.egengeometri`.
        InkluderIEgenskaper inkluderEgenskaper = InkluderIEgenskaper.fromValue("basis"); // InkluderIEgenskaper | Gir mulighet til å filtrere hvilke egenskaper som skal returneres med inkluder=egenskaper. `basis` er alle egenskaper som ikke er geometri, eller lister av geometri.
        String dybde = "dybde_example"; // String | Hvor mange nivå barn skal inkluderes. 1 betyr bare IDer, 2-n betyr ett eller flere mellomnivåer, 'full' betyr alle nivåer.
        Integer geometritoleranse = 56; // Integer | Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.
        LocalDate tidspunkt = LocalDate.now(); // LocalDate | Finner versjonen som var gyldig denne datoen.
        try {
            Vegobjekt result = apiInstance.getVegobjektByTypeIdAndVersjon(vegobjekttypeId, vegobjektId, versjon, inkluder, srid, inkludergeometri, inkluderEgenskaper, dybde, geometritoleranse, tidspunkt);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VegobjekterApi#getVegobjektByTypeIdAndVersjon");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name                   | Type                                                       | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    | Notes                                                                 |
| ---------------------- | ---------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------- |
| **vegobjekttypeId**    | **Integer**                                                | Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier. Eksempel: 581                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |                                                                       |
| **vegobjektId**        | **Long**                                                   |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |                                                                       |
| **versjon**            | **Integer**                                                |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |                                                                       |
| **inkluder**           | [**Set&lt;InkluderIVegobjekt&gt;**](InkluderIVegobjekt.md) | Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      | [optional]                                                            |
| **srid**               | [**SridParameter**](.md)                                   | Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.                                                                                                                                                                | [optional] [enum: 5972, 5973, 5975, 4326, UTM32, UTM33, UTM35, WGS84] |
| **inkludergeometri**   | [**InkluderGeometri**](.md)                                | Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under &#x60;vegobjekt.egenskaper&#x60; om den finnes, stedfestet geometri er plassert under &#x60;vegobjekt.lokasjon&#x60;. I tillegg til de nevnte feltene på vegobjekt-responsen returneres også &#x60;vegobjekt.geometri&#x60; (dersom man har &#x60;inkluder&#x3D;geometri&#x60; eller &#x60;alle&#x60;), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved å se på &#x60;vegobjekt.geometri.egengeometri&#x60;. | [optional] [enum: ingen, egenskap, lokasjon, utledet]                 |
| **inkluderEgenskaper** | [**InkluderIEgenskaper**](.md)                             | Gir mulighet til å filtrere hvilke egenskaper som skal returneres med inkluder&#x3D;egenskaper. &#x60;basis&#x60; er alle egenskaper som ikke er geometri, eller lister av geometri.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           | [optional] [enum: basis, geometri, alle]                              |
| **dybde**              | **String**                                                 | Hvor mange nivå barn skal inkluderes. 1 betyr bare IDer, 2-n betyr ett eller flere mellomnivåer, &#39;full&#39; betyr alle nivåer.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             | [optional]                                                            |
| **geometritoleranse**  | **Integer**                                                | Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     | [optional]                                                            |
| **tidspunkt**          | **LocalDate**                                              | Finner versjonen som var gyldig denne datoen.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  | [optional]                                                            |

### Return type

[**Vegobjekt**](Vegobjekt.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

### HTTP response details

| Status code | Description           | Response headers |
| ----------- | --------------------- | ---------------- |
| **500**     | Internal Server Error | -                |
| **400**     | Bad Request           | -                |
| **404**     | Not Found             | -                |
| **401**     | Unauthorized          | -                |
| **403**     | Forbidden             | -                |
| **200**     | OK                    | -                |

## getVegobjektEndringerForType

> VegobjektEndringerSide getVegobjektEndringerForType(vegobjekttypeId, ider, start, antall, historisk)

Hent endringer for en vegobjekttype innen 30 dager

### Example

```java
// Import classes:
import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.ApiClient;
import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.ApiException;
import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.Configuration;
import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.auth.*;
import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.models.*;
import no.vegvesen.vt.nvdb.vegobjekter.api.VegobjekterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://nvdbapiles.atlas.vegvesen.no/vegobjekter");

        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        VegobjekterApi apiInstance = new VegobjekterApi(defaultClient);
        Integer vegobjekttypeId = 56; // Integer | Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.  Eksempel: 581
        Set<Long> ider = Arrays.asList(); // Set<Long> | Hent endringer for oppgitte vegobjekt IDer. Dersom denne utelates vil alle endringer for den angitte typen hentes.
        OffsetDateTime start = OffsetDateTime.now(); // OffsetDateTime | Hent alle endringer etter gitt tidspunkt. Dersom denne utelates vil de eldste endringene hentes først.
        Integer antall = 56; // Integer | Antall endringer som skal være med i responsen. Merk at det faktiske antallet kan variere fra respons til respons. Dette er fordi endringer på samme vegobjektversjon innenfor samme side blir aggregert sammen ved å ta den nyeste endringen. Maksverdi: 1000
        Boolean historisk = true; // Boolean | Bestem om du ønsker endringer for aktive eller historiske vegobjekter. Standardverdi: `false`
        try {
            VegobjektEndringerSide result = apiInstance.getVegobjektEndringerForType(vegobjekttypeId, ider, start, antall, historisk);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VegobjekterApi#getVegobjektEndringerForType");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name                | Type                           | Description                                                                                                                                                                                                                                                    | Notes      |
| ------------------- | ------------------------------ | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **vegobjekttypeId** | **Integer**                    | Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier. Eksempel: 581                                                                                                                       |            |
| **ider**            | [**Set&lt;Long&gt;**](Long.md) | Hent endringer for oppgitte vegobjekt IDer. Dersom denne utelates vil alle endringer for den angitte typen hentes.                                                                                                                                             | [optional] |
| **start**           | **OffsetDateTime**             | Hent alle endringer etter gitt tidspunkt. Dersom denne utelates vil de eldste endringene hentes først.                                                                                                                                                         | [optional] |
| **antall**          | **Integer**                    | Antall endringer som skal være med i responsen. Merk at det faktiske antallet kan variere fra respons til respons. Dette er fordi endringer på samme vegobjektversjon innenfor samme side blir aggregert sammen ved å ta den nyeste endringen. Maksverdi: 1000 | [optional] |
| **historisk**       | **Boolean**                    | Bestem om du ønsker endringer for aktive eller historiske vegobjekter. Standardverdi: &#x60;false&#x60;                                                                                                                                                        | [optional] |

### Return type

[**VegobjektEndringerSide**](VegobjektEndringerSide.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

### HTTP response details

| Status code | Description           | Response headers |
| ----------- | --------------------- | ---------------- |
| **500**     | Internal Server Error | -                |
| **400**     | Bad Request           | -                |
| **404**     | Not Found             | -                |
| **401**     | Unauthorized          | -                |
| **403**     | Forbidden             | -                |
| **200**     | OK                    | -                |

## getVegobjektVersjoner

> List&lt;Vegobjekt&gt; getVegobjektVersjoner(vegobjekttypeId, vegobjektId, inkluder, srid, inkludergeometri, inkluderEgenskaper, dybde, geometritoleranse, tidspunkt)

Hent alle versjoner av et vegobjekt

### Example

```java
// Import classes:
import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.ApiClient;
import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.ApiException;
import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.Configuration;
import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.auth.*;
import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.models.*;
import no.vegvesen.vt.nvdb.vegobjekter.api.VegobjekterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://nvdbapiles.atlas.vegvesen.no/vegobjekter");

        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        VegobjekterApi apiInstance = new VegobjekterApi(defaultClient);
        Integer vegobjekttypeId = 56; // Integer | Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.  Eksempel: 581
        Long vegobjektId = 56L; // Long |
        Set<InkluderIVegobjekt> inkluder = Arrays.asList(); // Set<InkluderIVegobjekt> | Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID.
        SridParameter srid = SridParameter.fromValue("5972"); // SridParameter | Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: <a href='https://epsg.io/5972'>EPSG:5972</a> <a href='https://epsg.io/5973'>EPSG:5973</a> <a href='https://epsg.io/5975'>EPSG:5975</a> <a href='https://epsg.io/4326'>EPSG:4326</a>.
        InkluderGeometri inkludergeometri = InkluderGeometri.fromValue("ingen"); // InkluderGeometri | Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under `vegobjekt.egenskaper` om den finnes, stedfestet geometri er plassert under `vegobjekt.lokasjon`. I tillegg til de nevnte feltene på vegobjekt-responsen returneres også `vegobjekt.geometri` (dersom man har `inkluder=geometri` eller `alle`), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved å se på `vegobjekt.geometri.egengeometri`.
        InkluderIEgenskaper inkluderEgenskaper = InkluderIEgenskaper.fromValue("basis"); // InkluderIEgenskaper | Gir mulighet til å filtrere hvilke egenskaper som skal returneres med inkluder=egenskaper. `basis` er alle egenskaper som ikke er geometri, eller lister av geometri.
        String dybde = "dybde_example"; // String | Hvor mange nivå barn skal inkluderes. 1 betyr bare IDer, 2-n betyr ett eller flere mellomnivåer, 'full' betyr alle nivåer.
        Integer geometritoleranse = 56; // Integer | Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.
        LocalDate tidspunkt = LocalDate.now(); // LocalDate | Finner versjonen som var gyldig denne datoen.
        try {
            List<Vegobjekt> result = apiInstance.getVegobjektVersjoner(vegobjekttypeId, vegobjektId, inkluder, srid, inkludergeometri, inkluderEgenskaper, dybde, geometritoleranse, tidspunkt);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VegobjekterApi#getVegobjektVersjoner");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name                   | Type                                                       | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    | Notes                                                                 |
| ---------------------- | ---------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------- |
| **vegobjekttypeId**    | **Integer**                                                | Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier. Eksempel: 581                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |                                                                       |
| **vegobjektId**        | **Long**                                                   |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |                                                                       |
| **inkluder**           | [**Set&lt;InkluderIVegobjekt&gt;**](InkluderIVegobjekt.md) | Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      | [optional]                                                            |
| **srid**               | [**SridParameter**](.md)                                   | Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.                                                                                                                                                                | [optional] [enum: 5972, 5973, 5975, 4326, UTM32, UTM33, UTM35, WGS84] |
| **inkludergeometri**   | [**InkluderGeometri**](.md)                                | Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under &#x60;vegobjekt.egenskaper&#x60; om den finnes, stedfestet geometri er plassert under &#x60;vegobjekt.lokasjon&#x60;. I tillegg til de nevnte feltene på vegobjekt-responsen returneres også &#x60;vegobjekt.geometri&#x60; (dersom man har &#x60;inkluder&#x3D;geometri&#x60; eller &#x60;alle&#x60;), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved å se på &#x60;vegobjekt.geometri.egengeometri&#x60;. | [optional] [enum: ingen, egenskap, lokasjon, utledet]                 |
| **inkluderEgenskaper** | [**InkluderIEgenskaper**](.md)                             | Gir mulighet til å filtrere hvilke egenskaper som skal returneres med inkluder&#x3D;egenskaper. &#x60;basis&#x60; er alle egenskaper som ikke er geometri, eller lister av geometri.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           | [optional] [enum: basis, geometri, alle]                              |
| **dybde**              | **String**                                                 | Hvor mange nivå barn skal inkluderes. 1 betyr bare IDer, 2-n betyr ett eller flere mellomnivåer, &#39;full&#39; betyr alle nivåer.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             | [optional]                                                            |
| **geometritoleranse**  | **Integer**                                                | Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     | [optional]                                                            |
| **tidspunkt**          | **LocalDate**                                              | Finner versjonen som var gyldig denne datoen.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  | [optional]                                                            |

### Return type

[**List&lt;Vegobjekt&gt;**](Vegobjekt.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

### HTTP response details

| Status code | Description           | Response headers |
| ----------- | --------------------- | ---------------- |
| **500**     | Internal Server Error | -                |
| **400**     | Bad Request           | -                |
| **404**     | Not Found             | -                |
| **401**     | Unauthorized          | -                |
| **403**     | Forbidden             | -                |
| **200**     | OK                    | -                |

## getVegobjekterByType

> VegobjekterSide getVegobjekterByType(vegobjekttypeId, ider, inkluder, srid, inkludergeometri, inkluderEgenskaper, segmentering, fylke, kommune, kontraktsomrade, riksvegrute, vegforvalter, vegsystemreferanse, kartutsnitt, polygon, typeveg, adskiltelop, kryssystem, sideanlegg, trafikantgruppe, antall, start, geometritoleranse, tidspunkt, alleVersjoner, inkluderAntall, veglenkesekvens, egenskap, overlapp, veglenketype, detaljniva, endretEtter)

Hent vegobjekter av en type

### Example

```java
// Import classes:
import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.ApiClient;
import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.ApiException;
import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.Configuration;
import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.auth.*;
import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.models.*;
import no.vegvesen.vt.nvdb.vegobjekter.api.VegobjekterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://nvdbapiles.atlas.vegvesen.no/vegobjekter");

        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        VegobjekterApi apiInstance = new VegobjekterApi(defaultClient);
        Integer vegobjekttypeId = 56; // Integer | Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.  Eksempel: 581
        Set<Long> ider = Arrays.asList(); // Set<Long> | Kommaseparert liste med vegobjekt-IDer.
        Set<InkluderIVegobjekt> inkluder = Arrays.asList(); // Set<InkluderIVegobjekt> | Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID.
        SridParameter srid = SridParameter.fromValue("5972"); // SridParameter | Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: <a href='https://epsg.io/5972'>EPSG:5972</a> <a href='https://epsg.io/5973'>EPSG:5973</a> <a href='https://epsg.io/5975'>EPSG:5975</a> <a href='https://epsg.io/4326'>EPSG:4326</a>.
        InkluderGeometri inkludergeometri = InkluderGeometri.fromValue("ingen"); // InkluderGeometri | Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under `vegobjekt.egenskaper` om den finnes, stedfestet geometri er plassert under `vegobjekt.lokasjon`. I tillegg til de nevnte feltene på vegobjekt-responsen returneres også `vegobjekt.geometri` (dersom man har `inkluder=geometri` eller `alle`), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved å se på `vegobjekt.geometri.egengeometri`.
        InkluderIEgenskaper inkluderEgenskaper = InkluderIEgenskaper.fromValue("basis"); // InkluderIEgenskaper | Gir mulighet til å filtrere hvilke egenskaper som skal returneres med inkluder=egenskaper. `basis` er alle egenskaper som ikke er geometri, eller lister av geometri.
        Boolean segmentering = true; // Boolean | Angir om strekningsobjekter skal segmenteres etter søkeområdet (fylke, kommune, vegsystemreferanse, kontraktsområde, riksvegrute, vegforvalter).  Default: `false`
        Set<Integer> fylke = Arrays.asList(); // Set<Integer> | Filtrer på fylke. Kommaseparert liste. Se /omrader/fylker for mulige verdier.  Eksempel: `50`
        Set<Integer> kommune = Arrays.asList(); // Set<Integer> | Filtrer på kommune. Kommaseparert liste. Se /omrader/kommuner for mulige verdier.  Eksempel: `5001`
        Set<String> kontraktsomrade = Arrays.asList(); // Set<String> | Filtrer på kontraktsomrade. Kommaseparert liste. Se /omrader/kontraktsomrader for mulige verdier. Det er mulig å bruke ID-en for kontraktsområdet istedenfor det fulle navnet.  Eksempel: `9503 Midtre Hålogaland 2021-2026`
        Set<String> riksvegrute = Arrays.asList(); // Set<String> | Filtrer på riksvegrute. Kommaseparert liste. Se /omrader/riksvegruter for mulige verdier.  Eksempel: `RUTE4A` eller som enumid `20290`
        Set<String> vegforvalter = Arrays.asList(); // Set<String> | Filtrer på vegforvalter. Kommaseparert liste. Se [/omrader/api/v4/vegforvaltere](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der#/Omr%C3%A5der/getVegforvaltere) for mulige verdier.  Eksempel: `Møre og Romsdal fylkeskommune` eller som enumid `21774`
        Set<String> vegsystemreferanse = Arrays.asList(); // Set<String> | Filtrer vegobjekter på [vegsystemreferanse](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: `EV6S1D1 m12`
        String kartutsnitt = "kartutsnitt_example"; // String | Filtrer vegobjekter med kartutsnitt i det gjeldende geografiske referansesystemet (`srid`-paramteret). Formatet er `minX, minY, maxX, maxY`. Merk at vegobjektets bounding box benyttes for sammenligning, som kan medføre at vegobjekter som er utenfor kartutsnittet også returneres. For å unngå dette, kan du bruke `polygon` i stedet.  Eksempel: `265273, 7019372, 346553, 7061071`
        String polygon = "polygon_example"; // String | Filtrer vegobjekter med polygon i det gjeldende geografiske referansesystemet (`srid`-paramteret).  Eksempel: `20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000`
        Set<TypeVegSosi> typeveg = Arrays.asList(); // Set<TypeVegSosi> | Filtrer Relasjonstype.vegobjekter på type veg på vegnettet objektet er stedfestet på. Kommaseparert liste.  Eksempel: `kanalisertVeg, enkelBilveg, rampe, rundkjøring, bilferje, passasjerferje, gangOgSykkelveg, sykkelveg, gangveg, gågate, fortau, trapp, gangfelt, gatetun, traktorveg, sti, annet`
        Set<AdskilteLop> adskiltelop = Arrays.asList(); // Set<AdskilteLop> | Filtrer vegobjekter på om de er stedfestet hvor det er en Strekning med verdi satt for «adskilte løp».
        Boolean kryssystem = true; // Boolean | Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Kryssystem.
        Boolean sideanlegg = true; // Boolean | Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Sideanlegg.
        Trafikantgruppe trafikantgruppe = Trafikantgruppe.fromValue("K"); // Trafikantgruppe | Filtrer vegobjekter på trafikantgruppe.
        Integer antall = 56; // Integer | Angir hvor mange objekter som skal returneres. Øvre grense er avhengig av størrelse på respons, og vil kunne variere fra endepunkt til endepunkt. Dersom det angis en verdi for antall som overskrider maksimum, vil maksimumsverdi benyttes. Se også `sidestørrelse` i responsens `metadata`-objekt.
        String start = "start_example"; // String | Angir offset for hvilke objekter som skal returneres. Denne får man i metadata-feltet i responsen.
        Integer geometritoleranse = 56; // Integer | Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.
        LocalDate tidspunkt = LocalDate.now(); // LocalDate | Finner versjonen som var gyldig denne datoen.
        Boolean alleVersjoner = true; // Boolean | Returner alle versjoner som matcher de oppgitte parametrene. Dersom ikke satt eller `false` vil kun objekter uten sluttdato returneres.
        Boolean inkluderAntall = true; // Boolean | Hvorvidt totalt antall objekter skal returneres i responsen. Default er `false`.
        Set<String> veglenkesekvens = Arrays.asList(); // Set<String> | Filtrer vegobjekter på om de er stedfestet på gjeldende veglenkesekvenser. Kommaseparert liste.  Eksempel: `0.37@319531,0.83-0.97@41640`
        List<String> egenskap = Arrays.asList(); // List<String> | Filtrer vegobjekter på egenskaper, relasjoner og overlapp. Husk URL encoding hvis verdien inneholder likhetstegn. Se [dokumentasjon](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Avanserte_filter)
        List<String> overlapp = Arrays.asList(); // List<String> | Filtrer vegobjekter på overlapp. Husk URL encoding hvis verdien inneholder likhetstegn. Se [dokumentasjon](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Avanserte_filter)
        Set<VeglenkeTypeParameter> veglenketype = Arrays.asList(); // Set<VeglenkeTypeParameter> | Filtrer vegobjekter på veglenketype på vegnettet objektet er stedfestet. Kommaseparert liste.
        Set<DetaljnivaParameter> detaljniva = Arrays.asList(); // Set<DetaljnivaParameter> | Filtrer vegobjekter på detaljnivå på vegnettet objektet er stedfestet på (kortnavn fra datakatalogen).
        OffsetDateTime endretEtter = OffsetDateTime.now(); // OffsetDateTime | Hente endringer siden et tidspunkt. Tidspunkt skal følge ISO 8601 med tidssone eller som UTC. Eksempler: `2024-12-02T10:15:30.123+01:00`, `2024-12-02T09:15:30.123Z`
        try {
            VegobjekterSide result = apiInstance.getVegobjekterByType(vegobjekttypeId, ider, inkluder, srid, inkludergeometri, inkluderEgenskaper, segmentering, fylke, kommune, kontraktsomrade, riksvegrute, vegforvalter, vegsystemreferanse, kartutsnitt, polygon, typeveg, adskiltelop, kryssystem, sideanlegg, trafikantgruppe, antall, start, geometritoleranse, tidspunkt, alleVersjoner, inkluderAntall, veglenkesekvens, egenskap, overlapp, veglenketype, detaljniva, endretEtter);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VegobjekterApi#getVegobjekterByType");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name                   | Type                                                             | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    | Notes                                                                 |
| ---------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------- |
| **vegobjekttypeId**    | **Integer**                                                      | Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier. Eksempel: 581                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |                                                                       |
| **ider**               | [**Set&lt;Long&gt;**](Long.md)                                   | Kommaseparert liste med vegobjekt-IDer.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        | [optional]                                                            |
| **inkluder**           | [**Set&lt;InkluderIVegobjekt&gt;**](InkluderIVegobjekt.md)       | Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      | [optional]                                                            |
| **srid**               | [**SridParameter**](.md)                                         | Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.                                                                                                                                                                | [optional] [enum: 5972, 5973, 5975, 4326, UTM32, UTM33, UTM35, WGS84] |
| **inkludergeometri**   | [**InkluderGeometri**](.md)                                      | Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under &#x60;vegobjekt.egenskaper&#x60; om den finnes, stedfestet geometri er plassert under &#x60;vegobjekt.lokasjon&#x60;. I tillegg til de nevnte feltene på vegobjekt-responsen returneres også &#x60;vegobjekt.geometri&#x60; (dersom man har &#x60;inkluder&#x3D;geometri&#x60; eller &#x60;alle&#x60;), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved å se på &#x60;vegobjekt.geometri.egengeometri&#x60;. | [optional] [enum: ingen, egenskap, lokasjon, utledet]                 |
| **inkluderEgenskaper** | [**InkluderIEgenskaper**](.md)                                   | Gir mulighet til å filtrere hvilke egenskaper som skal returneres med inkluder&#x3D;egenskaper. &#x60;basis&#x60; er alle egenskaper som ikke er geometri, eller lister av geometri.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           | [optional] [enum: basis, geometri, alle]                              |
| **segmentering**       | **Boolean**                                                      | Angir om strekningsobjekter skal segmenteres etter søkeområdet (fylke, kommune, vegsystemreferanse, kontraktsområde, riksvegrute, vegforvalter). Default: &#x60;false&#x60;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    | [optional]                                                            |
| **fylke**              | [**Set&lt;Integer&gt;**](Integer.md)                             | Filtrer på fylke. Kommaseparert liste. Se /omrader/fylker for mulige verdier. Eksempel: &#x60;50&#x60;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | [optional]                                                            |
| **kommune**            | [**Set&lt;Integer&gt;**](Integer.md)                             | Filtrer på kommune. Kommaseparert liste. Se /omrader/kommuner for mulige verdier. Eksempel: &#x60;5001&#x60;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   | [optional]                                                            |
| **kontraktsomrade**    | [**Set&lt;String&gt;**](String.md)                               | Filtrer på kontraktsomrade. Kommaseparert liste. Se /omrader/kontraktsomrader for mulige verdier. Det er mulig å bruke ID-en for kontraktsområdet istedenfor det fulle navnet. Eksempel: &#x60;9503 Midtre Hålogaland 2021-2026&#x60;                                                                                                                                                                                                                                                                                                                                                                                                                                                          | [optional]                                                            |
| **riksvegrute**        | [**Set&lt;String&gt;**](String.md)                               | Filtrer på riksvegrute. Kommaseparert liste. Se /omrader/riksvegruter for mulige verdier. Eksempel: &#x60;RUTE4A&#x60; eller som enumid &#x60;20290&#x60;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      | [optional]                                                            |
| **vegforvalter**       | [**Set&lt;String&gt;**](String.md)                               | Filtrer på vegforvalter. Kommaseparert liste. Se [/omrader/api/v4/vegforvaltere](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der#/Omr%C3%A5der/getVegforvaltere) for mulige verdier. Eksempel: &#x60;Møre og Romsdal fylkeskommune&#x60; eller som enumid &#x60;21774&#x60;                                                                                                                                                                                                                                                                                                                                                                   | [optional]                                                            |
| **vegsystemreferanse** | [**Set&lt;String&gt;**](String.md)                               | Filtrer vegobjekter på [vegsystemreferanse](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område. Eksempel: &#x60;EV6S1D1 m12&#x60;                                                                                                                                                                                                                                                                                                                                                                                                                         | [optional]                                                            |
| **kartutsnitt**        | **String**                                                       | Filtrer vegobjekter med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;. Merk at vegobjektets bounding box benyttes for sammenligning, som kan medføre at vegobjekter som er utenfor kartutsnittet også returneres. For å unngå dette, kan du bruke &#x60;polygon&#x60; i stedet. Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60;                                                                                                                                                                                                                                                               | [optional]                                                            |
| **polygon**            | **String**                                                       | Filtrer vegobjekter med polygon i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Eksempel: &#x60;20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000&#x60;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  | [optional]                                                            |
| **typeveg**            | [**Set&lt;TypeVegSosi&gt;**](TypeVegSosi.md)                     | Filtrer Relasjonstype.vegobjekter på type veg på vegnettet objektet er stedfestet på. Kommaseparert liste. Eksempel: &#x60;kanalisertVeg, enkelBilveg, rampe, rundkjøring, bilferje, passasjerferje, gangOgSykkelveg, sykkelveg, gangveg, gågate, fortau, trapp, gangfelt, gatetun, traktorveg, sti, annet&#x60;                                                                                                                                                                                                                                                                                                                                                                               | [optional]                                                            |
| **adskiltelop**        | [**Set&lt;AdskilteLop&gt;**](AdskilteLop.md)                     | Filtrer vegobjekter på om de er stedfestet hvor det er en Strekning med verdi satt for «adskilte løp».                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | [optional]                                                            |
| **kryssystem**         | **Boolean**                                                      | Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Kryssystem.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            | [optional]                                                            |
| **sideanlegg**         | **Boolean**                                                      | Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Sideanlegg.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            | [optional]                                                            |
| **trafikantgruppe**    | [**Trafikantgruppe**](.md)                                       | Filtrer vegobjekter på trafikantgruppe.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        | [optional] [enum: K, G]                                               |
| **antall**             | **Integer**                                                      | Angir hvor mange objekter som skal returneres. Øvre grense er avhengig av størrelse på respons, og vil kunne variere fra endepunkt til endepunkt. Dersom det angis en verdi for antall som overskrider maksimum, vil maksimumsverdi benyttes. Se også &#x60;sidestørrelse&#x60; i responsens &#x60;metadata&#x60;-objekt.                                                                                                                                                                                                                                                                                                                                                                      | [optional]                                                            |
| **start**              | **String**                                                       | Angir offset for hvilke objekter som skal returneres. Denne får man i metadata-feltet i responsen.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             | [optional]                                                            |
| **geometritoleranse**  | **Integer**                                                      | Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     | [optional]                                                            |
| **tidspunkt**          | **LocalDate**                                                    | Finner versjonen som var gyldig denne datoen.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  | [optional]                                                            |
| **alleVersjoner**      | **Boolean**                                                      | Returner alle versjoner som matcher de oppgitte parametrene. Dersom ikke satt eller &#x60;false&#x60; vil kun objekter uten sluttdato returneres.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              | [optional]                                                            |
| **inkluderAntall**     | **Boolean**                                                      | Hvorvidt totalt antall objekter skal returneres i responsen. Default er &#x60;false&#x60;.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     | [optional]                                                            |
| **veglenkesekvens**    | [**Set&lt;String&gt;**](String.md)                               | Filtrer vegobjekter på om de er stedfestet på gjeldende veglenkesekvenser. Kommaseparert liste. Eksempel: &#x60;0.37@319531,0.83-0.97@41640&#x60;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              | [optional]                                                            |
| **egenskap**           | [**List&lt;String&gt;**](String.md)                              | Filtrer vegobjekter på egenskaper, relasjoner og overlapp. Husk URL encoding hvis verdien inneholder likhetstegn. Se [dokumentasjon](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Avanserte_filter)                                                                                                                                                                                                                                                                                                                                                                                                                                                                            | [optional]                                                            |
| **overlapp**           | [**List&lt;String&gt;**](String.md)                              | Filtrer vegobjekter på overlapp. Husk URL encoding hvis verdien inneholder likhetstegn. Se [dokumentasjon](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Avanserte_filter)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      | [optional]                                                            |
| **veglenketype**       | [**Set&lt;VeglenkeTypeParameter&gt;**](VeglenkeTypeParameter.md) | Filtrer vegobjekter på veglenketype på vegnettet objektet er stedfestet. Kommaseparert liste.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  | [optional]                                                            |
| **detaljniva**         | [**Set&lt;DetaljnivaParameter&gt;**](DetaljnivaParameter.md)     | Filtrer vegobjekter på detaljnivå på vegnettet objektet er stedfestet på (kortnavn fra datakatalogen).                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | [optional]                                                            |
| **endretEtter**        | **OffsetDateTime**                                               | Hente endringer siden et tidspunkt. Tidspunkt skal følge ISO 8601 med tidssone eller som UTC. Eksempler: &#x60;2024-12-02T10:15:30.123+01:00&#x60;, &#x60;2024-12-02T09:15:30.123Z&#x60;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       | [optional]                                                            |

### Return type

[**VegobjekterSide**](VegobjekterSide.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

### HTTP response details

| Status code | Description           | Response headers |
| ----------- | --------------------- | ---------------- |
| **500**     | Internal Server Error | -                |
| **400**     | Bad Request           | -                |
| **404**     | Not Found             | -                |
| **401**     | Unauthorized          | -                |
| **403**     | Forbidden             | -                |
| **200**     | OK                    | -                |

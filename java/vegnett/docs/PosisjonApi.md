# PosisjonApi

All URIs are relative to *https://nvdbapiles.atlas.vegvesen.no/vegnett*

| Method                                                          | HTTP request              | Description                                                                                                                                                        |
| --------------------------------------------------------------- | ------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [**findPosisjon**](PosisjonApi.md#findPosisjon)                 | **GET** /api/v4/posisjon  | Finn nærmeste posisjon på vegnettet for gitte koordinater. Koordinater kan angis som &#x60;nord&#x60; og &#x60;ost&#x60; eller &#x60;lat&#x60; og &#x60;lon&#x60;. |
| [**findPosisjonForVeg**](PosisjonApi.md#findPosisjonForVeg)     | **GET** /api/v4/veg       | Slå opp posisjon på veglenkesekvens eller vegsystemreferanse                                                                                                       |
| [**findPosisjonerForVeg**](PosisjonApi.md#findPosisjonerForVeg) | **GET** /api/v4/veg/batch | Slå opp flere posisjoner på veglenkesekvens eller vegsystemreferanse                                                                                               |

## findPosisjon

> List&lt;PosisjonMedAvstand&gt; findPosisjon(nord, ost, lat, lon, maksAvstand, maksAntall, konnekteringslenker, detaljerteLenker, tidspunkt, vegsystemreferanse, srid, trafikantgruppe)

Finn nærmeste posisjon på vegnettet for gitte koordinater. Koordinater kan angis som &#x60;nord&#x60; og &#x60;ost&#x60; eller &#x60;lat&#x60; og &#x60;lon&#x60;.

### Example

```java
// Import classes:
import no.vegvesen.vt.nvdb.vegnett.infrastructure.ApiClient;
import no.vegvesen.vt.nvdb.vegnett.infrastructure.ApiException;
import no.vegvesen.vt.nvdb.vegnett.infrastructure.Configuration;
import no.vegvesen.vt.nvdb.vegnett.infrastructure.models.*;
import no.vegvesen.vt.nvdb.vegnett.api.PosisjonApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://nvdbapiles.atlas.vegvesen.no/vegnett");

        PosisjonApi apiInstance = new PosisjonApi(defaultClient);
        Double nord = 3.4D; // Double | Nordlig koordinat
        Double ost = 3.4D; // Double | Østlig koordinat
        Double lat = 3.4D; // Double | Breddegrad
        Double lon = 3.4D; // Double | Lengdegrad
        Integer maksAvstand = 56; // Integer | Angir søkeavstand i meter
        Integer maksAntall = 56; // Integer | Angir maks antall treff
        Boolean konnekteringslenker = true; // Boolean | Angir om det skal returneres treff på konnekteringslenker
        Boolean detaljerteLenker = true; // Boolean | Angir om det skal returneres treff på detaljerte lenker
        LocalDate tidspunkt = LocalDate.now(); // LocalDate | Begrens spørring til det gitte tidspunktet.
        Set<String> vegsystemreferanse = Arrays.asList(); // Set<String> | Filtrer på [vegsystemreferanse](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: `EV6S1D1 m12`
        String srid = "5972"; // String | Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: <a href='https://epsg.io/5972'>EPSG:5972</a> <a href='https://epsg.io/5973'>EPSG:5973</a> <a href='https://epsg.io/5975'>EPSG:5975</a> <a href='https://epsg.io/4326'>EPSG:4326</a>.
        String trafikantgruppe = "K"; // String | Filtrer på trafikantgruppe.
        try {
            List<PosisjonMedAvstand> result = apiInstance.findPosisjon(nord, ost, lat, lon, maksAvstand, maksAntall, konnekteringslenker, detaljerteLenker, tidspunkt, vegsystemreferanse, srid, trafikantgruppe);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PosisjonApi#findPosisjon");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name                    | Type                               | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                             | Notes                                                                 |
| ----------------------- | ---------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------- |
| **nord**                | **Double**                         | Nordlig koordinat                                                                                                                                                                                                                                                                                                                                                                                                                                                       | [optional]                                                            |
| **ost**                 | **Double**                         | Østlig koordinat                                                                                                                                                                                                                                                                                                                                                                                                                                                        | [optional]                                                            |
| **lat**                 | **Double**                         | Breddegrad                                                                                                                                                                                                                                                                                                                                                                                                                                                              | [optional]                                                            |
| **lon**                 | **Double**                         | Lengdegrad                                                                                                                                                                                                                                                                                                                                                                                                                                                              | [optional]                                                            |
| **maksAvstand**         | **Integer**                        | Angir søkeavstand i meter                                                                                                                                                                                                                                                                                                                                                                                                                                               | [optional]                                                            |
| **maksAntall**          | **Integer**                        | Angir maks antall treff                                                                                                                                                                                                                                                                                                                                                                                                                                                 | [optional]                                                            |
| **konnekteringslenker** | **Boolean**                        | Angir om det skal returneres treff på konnekteringslenker                                                                                                                                                                                                                                                                                                                                                                                                               | [optional]                                                            |
| **detaljerteLenker**    | **Boolean**                        | Angir om det skal returneres treff på detaljerte lenker                                                                                                                                                                                                                                                                                                                                                                                                                 | [optional]                                                            |
| **tidspunkt**           | **LocalDate**                      | Begrens spørring til det gitte tidspunktet.                                                                                                                                                                                                                                                                                                                                                                                                                             | [optional]                                                            |
| **vegsystemreferanse**  | [**Set&lt;String&gt;**](String.md) | Filtrer på [vegsystemreferanse](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område. Eksempel: &#x60;EV6S1D1 m12&#x60;                                                                                                                                                                                                              | [optional]                                                            |
| **srid**                | **String**                         | Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;. | [optional] [enum: 5972, 5973, 5975, 4326, UTM32, UTM33, UTM35, WGS84] |
| **trafikantgruppe**     | **String**                         | Filtrer på trafikantgruppe.                                                                                                                                                                                                                                                                                                                                                                                                                                             | [optional] [enum: K, G]                                               |

### Return type

[**List&lt;PosisjonMedAvstand&gt;**](PosisjonMedAvstand.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

### HTTP response details

| Status code | Description           | Response headers |
| ----------- | --------------------- | ---------------- |
| **500**     | Internal Server Error | -                |
| **400**     | Bad Request           | -                |
| **404**     | Not Found             | -                |
| **200**     | OK                    | -                |

## findPosisjonForVeg

> Posisjon findPosisjonForVeg(vegsystemreferanse, veglenkesekvens, tidspunkt, srid, kommune)

Slå opp posisjon på veglenkesekvens eller vegsystemreferanse

### Example

```java
// Import classes:
import no.vegvesen.vt.nvdb.vegnett.infrastructure.ApiClient;
import no.vegvesen.vt.nvdb.vegnett.infrastructure.ApiException;
import no.vegvesen.vt.nvdb.vegnett.infrastructure.Configuration;
import no.vegvesen.vt.nvdb.vegnett.infrastructure.models.*;
import no.vegvesen.vt.nvdb.vegnett.api.PosisjonApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://nvdbapiles.atlas.vegvesen.no/vegnett");

        PosisjonApi apiInstance = new PosisjonApi(defaultClient);
        String vegsystemreferanse = "vegsystemreferanse_example"; // String | Finn posisjon for [vegsystemreferanse](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Må inneholde én enkelt meterverdi. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: `EV6S1D1m341`
        String veglenkesekvens = "veglenkesekvens_example"; // String | Finn posisjon på veglenkesekvens. Format: `posisjon@veglenkesekvensid`.  Eksempel: `0.456@1226`
        LocalDate tidspunkt = LocalDate.now(); // LocalDate | Begrens spørring til det gitte tidspunktet.
        String srid = "5972"; // String | Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: <a href='https://epsg.io/5972'>EPSG:5972</a> <a href='https://epsg.io/5973'>EPSG:5973</a> <a href='https://epsg.io/5975'>EPSG:5975</a> <a href='https://epsg.io/4326'>EPSG:4326</a>.
        Set<Integer> kommune = Arrays.asList(); // Set<Integer> | Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der#/Omr%C3%A5der/getKommuner) for mulige verdier.  Eksempel: `5001`
        try {
            Posisjon result = apiInstance.findPosisjonForVeg(vegsystemreferanse, veglenkesekvens, tidspunkt, srid, kommune);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PosisjonApi#findPosisjonForVeg");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name                   | Type                                 | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                             | Notes                                                                 |
| ---------------------- | ------------------------------------ | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------- |
| **vegsystemreferanse** | **String**                           | Finn posisjon for [vegsystemreferanse](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Må inneholde én enkelt meterverdi. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område. Eksempel: &#x60;EV6S1D1m341&#x60;                                                                                                                                                                                         | [optional]                                                            |
| **veglenkesekvens**    | **String**                           | Finn posisjon på veglenkesekvens. Format: &#x60;posisjon@veglenkesekvensid&#x60;. Eksempel: &#x60;0.456@1226&#x60;                                                                                                                                                                                                                                                                                                                                                      | [optional]                                                            |
| **tidspunkt**          | **LocalDate**                        | Begrens spørring til det gitte tidspunktet.                                                                                                                                                                                                                                                                                                                                                                                                                             | [optional]                                                            |
| **srid**               | **String**                           | Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;. | [optional] [enum: 5972, 5973, 5975, 4326, UTM32, UTM33, UTM35, WGS84] |
| **kommune**            | [**Set&lt;Integer&gt;**](Integer.md) | Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der#/Omr%C3%A5der/getKommuner) for mulige verdier. Eksempel: &#x60;5001&#x60;                                                                                                                                                                                                                       | [optional]                                                            |

### Return type

[**Posisjon**](Posisjon.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

### HTTP response details

| Status code | Description           | Response headers |
| ----------- | --------------------- | ---------------- |
| **500**     | Internal Server Error | -                |
| **400**     | Bad Request           | -                |
| **404**     | Not Found             | -                |
| **200**     | OK                    | -                |

## findPosisjonerForVeg

> AlwaysIncludeMapStringPosisjon findPosisjonerForVeg(vegsystemreferanser, veglenkesekvenser, kommune, srid)

Slå opp flere posisjoner på veglenkesekvens eller vegsystemreferanse

### Example

```java
// Import classes:
import no.vegvesen.vt.nvdb.vegnett.infrastructure.ApiClient;
import no.vegvesen.vt.nvdb.vegnett.infrastructure.ApiException;
import no.vegvesen.vt.nvdb.vegnett.infrastructure.Configuration;
import no.vegvesen.vt.nvdb.vegnett.infrastructure.models.*;
import no.vegvesen.vt.nvdb.vegnett.api.PosisjonApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://nvdbapiles.atlas.vegvesen.no/vegnett");

        PosisjonApi apiInstance = new PosisjonApi(defaultClient);
        List<String> vegsystemreferanser = Arrays.asList(); // List<String> | Finn posisjoner for [vegsystemreferanser](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Må inneholde én enkelt meterverdi. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: `EV6S1D1m341`
        List<String> veglenkesekvenser = Arrays.asList(); // List<String> | Finn posisjoner på veglenkesekvenser. Format: `posisjon@veglenkesekvensid`.  Eksempel: `0.456@1226`
        Set<Integer> kommune = Arrays.asList(); // Set<Integer> | Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der#/Omr%C3%A5der/getKommuner) for mulige verdier.  Eksempel: `5001`
        String srid = "5972"; // String | Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: <a href='https://epsg.io/5972'>EPSG:5972</a> <a href='https://epsg.io/5973'>EPSG:5973</a> <a href='https://epsg.io/5975'>EPSG:5975</a> <a href='https://epsg.io/4326'>EPSG:4326</a>.
        try {
            AlwaysIncludeMapStringPosisjon result = apiInstance.findPosisjonerForVeg(vegsystemreferanser, veglenkesekvenser, kommune, srid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PosisjonApi#findPosisjonerForVeg");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name                    | Type                                 | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                             | Notes                                                                 |
| ----------------------- | ------------------------------------ | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------- |
| **vegsystemreferanser** | [**List&lt;String&gt;**](String.md)  | Finn posisjoner for [vegsystemreferanser](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Må inneholde én enkelt meterverdi. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område. Eksempel: &#x60;EV6S1D1m341&#x60;                                                                                                                                                                                      | [optional]                                                            |
| **veglenkesekvenser**   | [**List&lt;String&gt;**](String.md)  | Finn posisjoner på veglenkesekvenser. Format: &#x60;posisjon@veglenkesekvensid&#x60;. Eksempel: &#x60;0.456@1226&#x60;                                                                                                                                                                                                                                                                                                                                                  | [optional]                                                            |
| **kommune**             | [**Set&lt;Integer&gt;**](Integer.md) | Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der#/Omr%C3%A5der/getKommuner) for mulige verdier. Eksempel: &#x60;5001&#x60;                                                                                                                                                                                                                       | [optional]                                                            |
| **srid**                | **String**                           | Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;. | [optional] [enum: 5972, 5973, 5975, 4326, UTM32, UTM33, UTM35, WGS84] |

### Return type

[**AlwaysIncludeMapStringPosisjon**](AlwaysIncludeMapStringPosisjon.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

### HTTP response details

| Status code | Description           | Response headers |
| ----------- | --------------------- | ---------------- |
| **500**     | Internal Server Error | -                |
| **400**     | Bad Request           | -                |
| **404**     | Not Found             | -                |
| **200**     | OK                    | -                |

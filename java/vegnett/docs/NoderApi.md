# NoderApi

All URIs are relative to *https://nvdbapiles.atlas.vegvesen.no/vegnett*

| Method                               | HTTP request               | Description  |
| ------------------------------------ | -------------------------- | ------------ |
| [**getNode**](NoderApi.md#getNode)   | **GET** /api/v4/noder/{id} | Hent en node |
| [**getNoder**](NoderApi.md#getNoder) | **GET** /api/v4/noder      | Hent noder   |

## getNode

> Node getNode(id, srid)

Hent en node

### Example

```java
// Import classes:
import no.vegvesen.vt.nvdb.vegnett.infrastructure.ApiClient;
import no.vegvesen.vt.nvdb.vegnett.infrastructure.ApiException;
import no.vegvesen.vt.nvdb.vegnett.infrastructure.Configuration;
import no.vegvesen.vt.nvdb.vegnett.infrastructure.models.*;
import no.vegvesen.vt.nvdb.vegnett.api.NoderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://nvdbapiles.atlas.vegvesen.no/vegnett");

        NoderApi apiInstance = new NoderApi(defaultClient);
        Long id = 56L; // Long | ID for noden.
        String srid = "5972"; // String | Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: <a href='https://epsg.io/5972'>EPSG:5972</a> <a href='https://epsg.io/5973'>EPSG:5973</a> <a href='https://epsg.io/5975'>EPSG:5975</a> <a href='https://epsg.io/4326'>EPSG:4326</a>.
        try {
            Node result = apiInstance.getNode(id, srid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NoderApi#getNode");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name     | Type       | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                             | Notes                                                                 |
| -------- | ---------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------- |
| **id**   | **Long**   | ID for noden.                                                                                                                                                                                                                                                                                                                                                                                                                                                           |                                                                       |
| **srid** | **String** | Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;. | [optional] [enum: 5972, 5973, 5975, 4326, UTM32, UTM33, UTM35, WGS84] |

### Return type

[**Node**](Node.md)

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

## getNoder

> NodeSide getNoder(srid, ider, fylke, kommune, kontraktsomrade, vegsystemreferanse, kartutsnitt, polygon, superid, antall, start, inkluderAntall)

Hent noder

### Example

```java
// Import classes:
import no.vegvesen.vt.nvdb.vegnett.infrastructure.ApiClient;
import no.vegvesen.vt.nvdb.vegnett.infrastructure.ApiException;
import no.vegvesen.vt.nvdb.vegnett.infrastructure.Configuration;
import no.vegvesen.vt.nvdb.vegnett.infrastructure.models.*;
import no.vegvesen.vt.nvdb.vegnett.api.NoderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://nvdbapiles.atlas.vegvesen.no/vegnett");

        NoderApi apiInstance = new NoderApi(defaultClient);
        String srid = "5972"; // String | Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: <a href='https://epsg.io/5972'>EPSG:5972</a> <a href='https://epsg.io/5973'>EPSG:5973</a> <a href='https://epsg.io/5975'>EPSG:5975</a> <a href='https://epsg.io/4326'>EPSG:4326</a>.
        Set<Long> ider = Arrays.asList(); // Set<Long> | Kommaseparert liste med IDer.
        Set<Integer> fylke = Arrays.asList(); // Set<Integer> | Filtrer på fylke. Kommaseparert liste. Se [/omrader/api/v4/fylker](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der) for mulige verdier.  Eksempel: `50`
        Set<Integer> kommune = Arrays.asList(); // Set<Integer> | Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der) for mulige verdier.  Eksempel: `5001`
        Set<String> kontraktsomrade = Arrays.asList(); // Set<String> | Filtrer på kontraktsomrade. Kommaseparert liste. Se [/omrader/api/v4/kontraktsomrader](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der) for mulige verdier.  Eksempel: `9503 Midtre Hålogaland 2021-2026`
        Set<String> vegsystemreferanse = Arrays.asList(); // Set<String> | Filtrer på [vegsystemreferanse](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: `EV6S1D1 m12`
        String kartutsnitt = "kartutsnitt_example"; // String | Filtrer med kartutsnitt i det gjeldende geografiske referansesystemet (`srid`-paramteret). Formatet er `minX, minY, maxX, maxY`.  Eksempel: `265273, 7019372, 346553, 7061071`
        String polygon = "polygon_example"; // String | Filtrer med polygon i det gjeldende geografiske referansesystemet (`srid`-paramteret).  Eksempel: `20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000`
        Long superid = 56L; // Long | Hent noder tilkoblet detaljerte veglenker stedfestet på veglenkesekvens med denne IDen.
        Integer antall = 56; // Integer | Angir hvor mange objekter som skal returneres. Se også `sidestørrelse` i responsens `metadata`-objekt.
        String start = "start_example"; // String | Angir paginerings-start for objekter som skal returneres. Brukes sammen med `antall`. Neste start får man i metadata-feltet i responsen. Settes blankt for å starte fra begynnelsen.
        Boolean inkluderAntall = true; // Boolean | Hvorvidt totalt antall objekter skal returneres i responsen. Default er `false`.
        try {
            NodeSide result = apiInstance.getNoder(srid, ider, fylke, kommune, kontraktsomrade, vegsystemreferanse, kartutsnitt, polygon, superid, antall, start, inkluderAntall);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NoderApi#getNoder");
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
| **srid**               | **String**                           | Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;. | [optional] [enum: 5972, 5973, 5975, 4326, UTM32, UTM33, UTM35, WGS84] |
| **ider**               | [**Set&lt;Long&gt;**](Long.md)       | Kommaseparert liste med IDer.                                                                                                                                                                                                                                                                                                                                                                                                                                           | [optional]                                                            |
| **fylke**              | [**Set&lt;Integer&gt;**](Integer.md) | Filtrer på fylke. Kommaseparert liste. Se [/omrader/api/v4/fylker](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der) for mulige verdier. Eksempel: &#x60;50&#x60;                                                                                                                                                                                                                                                       | [optional]                                                            |
| **kommune**            | [**Set&lt;Integer&gt;**](Integer.md) | Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der) for mulige verdier. Eksempel: &#x60;5001&#x60;                                                                                                                                                                                                                                                 | [optional]                                                            |
| **kontraktsomrade**    | [**Set&lt;String&gt;**](String.md)   | Filtrer på kontraktsomrade. Kommaseparert liste. Se [/omrader/api/v4/kontraktsomrader](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der) for mulige verdier. Eksempel: &#x60;9503 Midtre Hålogaland 2021-2026&#x60;                                                                                                                                                                                                     | [optional]                                                            |
| **vegsystemreferanse** | [**Set&lt;String&gt;**](String.md)   | Filtrer på [vegsystemreferanse](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område. Eksempel: &#x60;EV6S1D1 m12&#x60;                                                                                                                                                                                                                    | [optional]                                                            |
| **kartutsnitt**        | **String**                           | Filtrer med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;. Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60;                                                                                                                                                                                                                                                             | [optional]                                                            |
| **polygon**            | **String**                           | Filtrer med polygon i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Eksempel: &#x60;20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000&#x60;                                                                                                                                                                                                                                                                                       | [optional]                                                            |
| **superid**            | **Long**                             | Hent noder tilkoblet detaljerte veglenker stedfestet på veglenkesekvens med denne IDen.                                                                                                                                                                                                                                                                                                                                                                                 | [optional]                                                            |
| **antall**             | **Integer**                          | Angir hvor mange objekter som skal returneres. Se også &#x60;sidestørrelse&#x60; i responsens &#x60;metadata&#x60;-objekt.                                                                                                                                                                                                                                                                                                                                              | [optional]                                                            |
| **start**              | **String**                           | Angir paginerings-start for objekter som skal returneres. Brukes sammen med &#x60;antall&#x60;. Neste start får man i metadata-feltet i responsen. Settes blankt for å starte fra begynnelsen.                                                                                                                                                                                                                                                                          | [optional]                                                            |
| **inkluderAntall**     | **Boolean**                          | Hvorvidt totalt antall objekter skal returneres i responsen. Default er &#x60;false&#x60;.                                                                                                                                                                                                                                                                                                                                                                              | [optional]                                                            |

### Return type

[**NodeSide**](NodeSide.md)

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

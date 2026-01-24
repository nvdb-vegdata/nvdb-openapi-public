# StatistikkApi

All URIs are relative to *https://nvdbapiles.atlas.vegvesen.no/vegnett*

| Method                                                                                                | HTTP request                                                     | Description                                                               |
| ----------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------- |
| [**getVeglenkesegmenterStatistikk**](StatistikkApi.md#getVeglenkesegmenterStatistikk)                 | **GET** /api/v4/veglenkesekvenser/segmentert/statistikk          | Hent statistikk for det aktive segmenterte vegnettet                      |
| [**getVeglenkesegmenterStatistikkGruppert**](StatistikkApi.md#getVeglenkesegmenterStatistikkGruppert) | **GET** /api/v4/veglenkesekvenser/segmentert/statistikk/gruppert | Hent statistikk for segmentert vegnett, gruppert på en eller flere felter |

## getVeglenkesegmenterStatistikk

> VeglenkesegmenterStatistikk getVeglenkesegmenterStatistikk()

Hent statistikk for det aktive segmenterte vegnettet

### Example

```java
// Import classes:
import no.vegvesen.vt.nvdb.vegnett.infrastructure.ApiClient;
import no.vegvesen.vt.nvdb.vegnett.infrastructure.ApiException;
import no.vegvesen.vt.nvdb.vegnett.infrastructure.Configuration;
import no.vegvesen.vt.nvdb.vegnett.infrastructure.models.*;
import no.vegvesen.vt.nvdb.vegnett.api.StatistikkApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://nvdbapiles.atlas.vegvesen.no/vegnett");

        StatistikkApi apiInstance = new StatistikkApi(defaultClient);
        try {
            VeglenkesegmenterStatistikk result = apiInstance.getVeglenkesegmenterStatistikk();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatistikkApi#getVeglenkesegmenterStatistikk");
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

[**VeglenkesegmenterStatistikk**](VeglenkesegmenterStatistikk.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

### HTTP response details

| Status code | Description           | Response headers |
| ----------- | --------------------- | ---------------- |
| **400**     | Bad Request           | -                |
| **404**     | Not Found             | -                |
| **500**     | Internal Server Error | -                |
| **200**     | OK                    | -                |

## getVeglenkesegmenterStatistikkGruppert

> List&lt;VeglenkesegmenterStatistikkGruppert&gt; getVeglenkesegmenterStatistikkGruppert(gruppering, srid, kartutsnitt)

Hent statistikk for segmentert vegnett, gruppert på en eller flere felter

### Example

```java
// Import classes:
import no.vegvesen.vt.nvdb.vegnett.infrastructure.ApiClient;
import no.vegvesen.vt.nvdb.vegnett.infrastructure.ApiException;
import no.vegvesen.vt.nvdb.vegnett.infrastructure.Configuration;
import no.vegvesen.vt.nvdb.vegnett.infrastructure.models.*;
import no.vegvesen.vt.nvdb.vegnett.api.StatistikkApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://nvdbapiles.atlas.vegvesen.no/vegnett");

        StatistikkApi apiInstance = new StatistikkApi(defaultClient);
        List<Gruppering> gruppering = Arrays.asList(); // List<Gruppering> | Velg en eller flere felter som statistikken skal grupperes på.
        SridParameter srid = SridParameter.fromValue("5972"); // SridParameter | Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Query-parametere med koordinater oppgis i UTM33 for UTM-formater, 4326/WGS84 oppgis dersom srid er 4326/WGS84. Mer informasjon: <a href='https://epsg.io/5972'>EPSG:5972</a> <a href='https://epsg.io/5973'>EPSG:5973</a> <a href='https://epsg.io/5975'>EPSG:5975</a> <a href='https://epsg.io/4326'>EPSG:4326</a>.
        String kartutsnitt = "kartutsnitt_example"; // String | Filtrer med kartutsnitt i UTM 33. Formatet er `minX, minY, maxX, maxY`.  Eksempel: `265273, 7019372, 346553, 7061071`
        try {
            List<VeglenkesegmenterStatistikkGruppert> result = apiInstance.getVeglenkesegmenterStatistikkGruppert(gruppering, srid, kartutsnitt);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatistikkApi#getVeglenkesegmenterStatistikkGruppert");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name            | Type                                        | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            | Notes                                                                 |
| --------------- | ------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------- |
| **gruppering**  | [**List&lt;Gruppering&gt;**](Gruppering.md) | Velg en eller flere felter som statistikken skal grupperes på.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |                                                                       |
| **srid**        | [**SridParameter**](.md)                    | Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Query-parametere med koordinater oppgis i UTM33 for UTM-formater, 4326/WGS84 oppgis dersom srid er 4326/WGS84. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;. | [optional] [enum: 5972, 5973, 5975, 4326, UTM32, UTM33, UTM35, WGS84] |
| **kartutsnitt** | **String**                                  | Filtrer med kartutsnitt i UTM 33. Formatet er &#x60;minX, minY, maxX, maxY&#x60;. Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60;                                                                                                                                                                                                                                                                                                                                                                                                                                               | [optional]                                                            |

### Return type

[**List&lt;VeglenkesegmenterStatistikkGruppert&gt;**](VeglenkesegmenterStatistikkGruppert.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: _/_

### HTTP response details

| Status code | Description           | Response headers |
| ----------- | --------------------- | ---------------- |
| **400**     | Bad Request           | -                |
| **404**     | Not Found             | -                |
| **500**     | Internal Server Error | -                |
| **200**     | OK                    | -                |

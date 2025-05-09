# RuteApi

All URIs are relative to *https://nvdbapiles.atlas.vegvesen.no/vegnett*

| Method                              | HTTP request                       | Description |
| ----------------------------------- | ---------------------------------- | ----------- |
| [**getRute**](RuteApi.md#getRute)   | **GET** /api/v4/beta/vegnett/rute  |             |
| [**postRute**](RuteApi.md#postRute) | **POST** /api/v4/beta/vegnett/rute |             |

## getRute

> GetRute200Response getRute(start, slutt, geometri, maksAvstand, omkrets, konnekteringslenker, detaljerteLenker, kortform, vegsystemreferanse, trafikantgruppe, beholdTrafikantgruppe, typeveg, tidspunkt, srid)

### Example

```java
// Import classes:
import no.vegvesen.vt.nvdb.vegnett.infrastructure.ApiClient;
import no.vegvesen.vt.nvdb.vegnett.infrastructure.ApiException;
import no.vegvesen.vt.nvdb.vegnett.infrastructure.Configuration;
import no.vegvesen.vt.nvdb.vegnett.infrastructure.models.*;
import no.vegvesen.vt.nvdb.vegnett.api.RuteApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://nvdbapiles.atlas.vegvesen.no/vegnett");

        RuteApi apiInstance = new RuteApi(defaultClient);
        String start = "start_example"; // String | Startposisjon som et punkt eller posisjon@veglenkesekvens.  Eksempler: `226761.786, 6564469.3787` `0.1@1234`
        String slutt = "slutt_example"; // String | Sluttposisjon som et punkt eller posisjon@veglenkesekvens.  Eksempler: `226855.034, 6564472.225` `0.9@4321`
        String geometri = "geometri_example"; // String | Finn sammenhengende vegnett som passer med denne geometrien.  Eksempel: `LINESTRING Z (226778.2 6564468.6 5, 226747.1 6564470.1 5, 226717.5 6564466.4 5, 226705.9 6564462.7 6.2, 226687.2 6564462.9 6, 226657.7 6564460.7 6, 226628.5 6564459.5 6, 226611.3 6564459.6 6.2)`
        Integer maksAvstand = 56; // Integer | Maks avstand i meter til veglenker.  Standardverdi: `10`
        Integer omkrets = 56; // Integer | Konvolutt lagt rundt start- og slutt-punkt for å beregne rute.  Standardverdi: `200`. Må være større enn 0.
        Boolean konnekteringslenker = true; // Boolean | Inkluder konnekteringslenker.  Standardverdi: `true`
        Boolean detaljerteLenker = true; // Boolean | Inkluder detaljerte lenker.  Standardverdi: `false`
        Boolean kortform = true; // Boolean | Returner minimal respons.  Standardverdi: `false`
        Set<String> vegsystemreferanse = Arrays.asList(); // Set<String> | Filtrer på vegsystemreferanse. Kommaseparert liste.  Eksempler: `EV6` `R` `F`
        String trafikantgruppe = "K"; // String | Filtrer på trafikantgruppe.
        Boolean beholdTrafikantgruppe = true; // Boolean | Behold trafikantgruppe gjennom ruten. Trafikantgruppe velges fra første og siste punkt i ruten, om de er ulike velges K (kjørende). Overstyres av parameteren trafikantgruppe.  Standardverdi: `false`
        Set<String> typeveg = Arrays.asList(); // Set<String> | Filtrer på type veg. Kommaseparert liste.
        LocalDate tidspunkt = LocalDate.now(); // LocalDate | Begrens spørring til dette tidspunktet.
        String srid = "5972"; // String | Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: <a href='https://epsg.io/5972'>EPSG:5972</a> <a href='https://epsg.io/5973'>EPSG:5973</a> <a href='https://epsg.io/5975'>EPSG:5975</a> <a href='https://epsg.io/4326'>EPSG:4326</a>.
        try {
            GetRute200Response result = apiInstance.getRute(start, slutt, geometri, maksAvstand, omkrets, konnekteringslenker, detaljerteLenker, kortform, vegsystemreferanse, trafikantgruppe, beholdTrafikantgruppe, typeveg, tidspunkt, srid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RuteApi#getRute");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name                      | Type                               | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                             | Notes                                                                                                                                                                                                   |
| ------------------------- | ---------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **start**                 | **String**                         | Startposisjon som et punkt eller posisjon@veglenkesekvens. Eksempler: &#x60;226761.786, 6564469.3787&#x60; &#x60;0.1@1234&#x60;                                                                                                                                                                                                                                                                                                                                         | [optional]                                                                                                                                                                                              |
| **slutt**                 | **String**                         | Sluttposisjon som et punkt eller posisjon@veglenkesekvens. Eksempler: &#x60;226855.034, 6564472.225&#x60; &#x60;0.9@4321&#x60;                                                                                                                                                                                                                                                                                                                                          | [optional]                                                                                                                                                                                              |
| **geometri**              | **String**                         | Finn sammenhengende vegnett som passer med denne geometrien. Eksempel: &#x60;LINESTRING Z (226778.2 6564468.6 5, 226747.1 6564470.1 5, 226717.5 6564466.4 5, 226705.9 6564462.7 6.2, 226687.2 6564462.9 6, 226657.7 6564460.7 6, 226628.5 6564459.5 6, 226611.3 6564459.6 6.2)&#x60;                                                                                                                                                                                    | [optional]                                                                                                                                                                                              |
| **maksAvstand**           | **Integer**                        | Maks avstand i meter til veglenker. Standardverdi: &#x60;10&#x60;                                                                                                                                                                                                                                                                                                                                                                                                       | [optional]                                                                                                                                                                                              |
| **omkrets**               | **Integer**                        | Konvolutt lagt rundt start- og slutt-punkt for å beregne rute. Standardverdi: &#x60;200&#x60;. Må være større enn 0.                                                                                                                                                                                                                                                                                                                                                    | [optional]                                                                                                                                                                                              |
| **konnekteringslenker**   | **Boolean**                        | Inkluder konnekteringslenker. Standardverdi: &#x60;true&#x60;                                                                                                                                                                                                                                                                                                                                                                                                           | [optional]                                                                                                                                                                                              |
| **detaljerteLenker**      | **Boolean**                        | Inkluder detaljerte lenker. Standardverdi: &#x60;false&#x60;                                                                                                                                                                                                                                                                                                                                                                                                            | [optional]                                                                                                                                                                                              |
| **kortform**              | **Boolean**                        | Returner minimal respons. Standardverdi: &#x60;false&#x60;                                                                                                                                                                                                                                                                                                                                                                                                              | [optional]                                                                                                                                                                                              |
| **vegsystemreferanse**    | [**Set&lt;String&gt;**](String.md) | Filtrer på vegsystemreferanse. Kommaseparert liste. Eksempler: &#x60;EV6&#x60; &#x60;R&#x60; &#x60;F&#x60;                                                                                                                                                                                                                                                                                                                                                              | [optional]                                                                                                                                                                                              |
| **trafikantgruppe**       | **String**                         | Filtrer på trafikantgruppe.                                                                                                                                                                                                                                                                                                                                                                                                                                             | [optional] [enum: K, G]                                                                                                                                                                                 |
| **beholdTrafikantgruppe** | **Boolean**                        | Behold trafikantgruppe gjennom ruten. Trafikantgruppe velges fra første og siste punkt i ruten, om de er ulike velges K (kjørende). Overstyres av parameteren trafikantgruppe. Standardverdi: &#x60;false&#x60;                                                                                                                                                                                                                                                         | [optional]                                                                                                                                                                                              |
| **typeveg**               | [**Set&lt;String&gt;**](String.md) | Filtrer på type veg. Kommaseparert liste.                                                                                                                                                                                                                                                                                                                                                                                                                               | [optional] [enum: Enkel bilveg, Kanalisert veg, Rampe, Rundkjøring, Bilferje, Gang- og sykkelveg, Sykkelveg, Gangveg, Gågate, Fortau, Trapp, Gangfelt, Gatetun, Passasjerferje, Traktorveg, Sti, Annet] |
| **tidspunkt**             | **LocalDate**                      | Begrens spørring til dette tidspunktet.                                                                                                                                                                                                                                                                                                                                                                                                                                 | [optional]                                                                                                                                                                                              |
| **srid**                  | **String**                         | Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;. | [optional] [enum: 5972, 5973, 5975, 4326, UTM32, UTM33, UTM35, WGS84]                                                                                                                                   |

### Return type

[**GetRute200Response**](GetRute200Response.md)

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

## postRute

> GetRute200Response postRute(finnRuteParameters)

### Example

```java
// Import classes:
import no.vegvesen.vt.nvdb.vegnett.infrastructure.ApiClient;
import no.vegvesen.vt.nvdb.vegnett.infrastructure.ApiException;
import no.vegvesen.vt.nvdb.vegnett.infrastructure.Configuration;
import no.vegvesen.vt.nvdb.vegnett.infrastructure.models.*;
import no.vegvesen.vt.nvdb.vegnett.api.RuteApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://nvdbapiles.atlas.vegvesen.no/vegnett");

        RuteApi apiInstance = new RuteApi(defaultClient);
        FinnRuteParameters finnRuteParameters = new FinnRuteParameters(); // FinnRuteParameters |
        try {
            GetRute200Response result = apiInstance.postRute(finnRuteParameters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RuteApi#postRute");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name                   | Type                                            | Description | Notes |
| ---------------------- | ----------------------------------------------- | ----------- | ----- |
| **finnRuteParameters** | [**FinnRuteParameters**](FinnRuteParameters.md) |             |       |

### Return type

[**GetRute200Response**](GetRute200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: _/_

### HTTP response details

| Status code | Description           | Response headers |
| ----------- | --------------------- | ---------------- |
| **500**     | Internal Server Error | -                |
| **400**     | Bad Request           | -                |
| **404**     | Not Found             | -                |
| **200**     | OK                    | -                |

# VegnettApi

All URIs are relative to *https://nvdbapiles.atlas.vegvesen.no/vegnett*

| Method                                                                         | HTTP request                                                     | Description                         |
| ------------------------------------------------------------------------------ | ---------------------------------------------------------------- | ----------------------------------- |
| [**getSegmentertVeglenkesekvens**](VegnettApi.md#getSegmentertVeglenkesekvens) | **GET** /api/v4/veglenkesekvenser/segmentert/{veglenkesekvensId} | Hent en segmentert veglenkesekvens  |
| [**getVeglenkesegmenter**](VegnettApi.md#getVeglenkesegmenter)                 | **GET** /api/v4/veglenkesekvenser/segmentert                     | Hent segmenterte veglenkesekvenser  |
| [**getVeglenkesekvens**](VegnettApi.md#getVeglenkesekvens)                     | **GET** /api/v4/veglenkesekvenser/{veglenkesekvensId}            | Hent en veglenkesekvens             |
| [**getVeglenkesekvensEndringer**](VegnettApi.md#getVeglenkesekvensEndringer)   | **GET** /api/v4/veglenkesekvenser/endringer                      | Hent endringer på veglenkesekvenser |
| [**getVeglenkesekvenser**](VegnettApi.md#getVeglenkesekvenser)                 | **GET** /api/v4/veglenkesekvenser                                | Hent veglenkesekvenser              |

## getSegmentertVeglenkesekvens

> List&lt;Veglenkesegment&gt; getSegmentertVeglenkesekvens(veglenkesekvensId, srid, historisk, tidspunkt)

Hent en segmentert veglenkesekvens

### Example

```java
// Import classes:
import no.vegvesen.vt.nvdb.vegnett.infrastructure.ApiClient;
import no.vegvesen.vt.nvdb.vegnett.infrastructure.ApiException;
import no.vegvesen.vt.nvdb.vegnett.infrastructure.Configuration;
import no.vegvesen.vt.nvdb.vegnett.infrastructure.models.*;
import no.vegvesen.vt.nvdb.vegnett.api.VegnettApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://nvdbapiles.atlas.vegvesen.no/vegnett");

        VegnettApi apiInstance = new VegnettApi(defaultClient);
        Long veglenkesekvensId = 56L; // Long | ID for veglenkesekvensen.
        String srid = "5972"; // String | Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: <a href='https://epsg.io/5972'>EPSG:5972</a> <a href='https://epsg.io/5973'>EPSG:5973</a> <a href='https://epsg.io/5975'>EPSG:5975</a> <a href='https://epsg.io/4326'>EPSG:4326</a>.
        Boolean historisk = true; // Boolean | For `false` returneres kun dagens veglenkesegmenter. For `true` returneres dagens og historiske veglenkesegmenter. Default er `false`.
        LocalDate tidspunkt = LocalDate.now(); // LocalDate | Begrens spørring til det gitte tidspunktet.
        try {
            List<Veglenkesegment> result = apiInstance.getSegmentertVeglenkesekvens(veglenkesekvensId, srid, historisk, tidspunkt);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VegnettApi#getSegmentertVeglenkesekvens");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name                  | Type          | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                             | Notes                                                                 |
| --------------------- | ------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------- |
| **veglenkesekvensId** | **Long**      | ID for veglenkesekvensen.                                                                                                                                                                                                                                                                                                                                                                                                                                               |                                                                       |
| **srid**              | **String**    | Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;. | [optional] [enum: 5972, 5973, 5975, 4326, UTM32, UTM33, UTM35, WGS84] |
| **historisk**         | **Boolean**   | For &#x60;false&#x60; returneres kun dagens veglenkesegmenter. For &#x60;true&#x60; returneres dagens og historiske veglenkesegmenter. Default er &#x60;false&#x60;.                                                                                                                                                                                                                                                                                                    | [optional]                                                            |
| **tidspunkt**         | **LocalDate** | Begrens spørring til det gitte tidspunktet.                                                                                                                                                                                                                                                                                                                                                                                                                             | [optional]                                                            |

### Return type

[**List&lt;Veglenkesegment&gt;**](Veglenkesegment.md)

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

## getVeglenkesegmenter

> VeglenkesegmenterSide getVeglenkesegmenter(srid, ider, fylke, kommune, kontraktsomrade, riksvegrute, vegforvalter, vegsystemreferanse, kartutsnitt, polygon, detaljniva, typeveg, superid, adskiltelop, kryssystem, sideanlegg, veglenketype, arm, trafikantgruppe, geometritoleranse, historisk, tidspunkt, antall, start, inkluderAntall)

Hent segmenterte veglenkesekvenser

### Example

```java
// Import classes:
import no.vegvesen.vt.nvdb.vegnett.infrastructure.ApiClient;
import no.vegvesen.vt.nvdb.vegnett.infrastructure.ApiException;
import no.vegvesen.vt.nvdb.vegnett.infrastructure.Configuration;
import no.vegvesen.vt.nvdb.vegnett.infrastructure.models.*;
import no.vegvesen.vt.nvdb.vegnett.api.VegnettApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://nvdbapiles.atlas.vegvesen.no/vegnett");

        VegnettApi apiInstance = new VegnettApi(defaultClient);
        String srid = "5972"; // String | Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: <a href='https://epsg.io/5972'>EPSG:5972</a> <a href='https://epsg.io/5973'>EPSG:5973</a> <a href='https://epsg.io/5975'>EPSG:5975</a> <a href='https://epsg.io/4326'>EPSG:4326</a>.
        Set<Long> ider = Arrays.asList(); // Set<Long> | Kommaseparert liste med IDer.
        Set<Integer> fylke = Arrays.asList(); // Set<Integer> | Filtrer på fylke. Kommaseparert liste. Se [/omrader/api/v4/fylker](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der#/Omr%C3%A5der/getFylker) for mulige verdier.  Eksempel: `50`
        Set<Integer> kommune = Arrays.asList(); // Set<Integer> | Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der#/Omr%C3%A5der/getKommuner) for mulige verdier.  Eksempel: `5001`
        Set<String> kontraktsomrade = Arrays.asList(); // Set<String> | Filtrer på kontraktsomrade. Kommaseparert liste. Se [/omrader/api/v4/kontraktsomrader](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der#/Omr%C3%A5der/getKontraktsomrader) for mulige verdier.  Eksempel: `9503 Midtre Hålogaland 2021-2026`
        Set<String> riksvegrute = Arrays.asList(); // Set<String> | Filtrer på riksvegrute. Kommaseparert liste. Se [/omrader/api/v4/riksvegruter](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der#/Omr%C3%A5der/getRiksvegruter) for mulige verdier.  Eksempel: `RUTE4A` eller som enumid `20290`
        Set<String> vegforvalter = Arrays.asList(); // Set<String> | Filtrer på vegforvalter. Kommaseparert liste. Se [/omrader/api/v4/vegforvaltere](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der#/Omr%C3%A5der/getVegforvaltere) for mulige verdier.  Eksempel: `Møre og Romsdal fylkeskommune` eller som enumid `21774`
        Set<String> vegsystemreferanse = Arrays.asList(); // Set<String> | Filtrer på [vegsystemreferanse](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: `EV6S1D1 m12`
        String kartutsnitt = "kartutsnitt_example"; // String | Filtrer med kartutsnitt i det gjeldende geografiske referansesystemet (`srid`-paramteret). Formatet er `minX, minY, maxX, maxY`.  Eksempel: `265273, 7019372, 346553, 7061071`
        String polygon = "polygon_example"; // String | Filtrer med polygon i det gjeldende geografiske referansesystemet (`srid`-paramteret).  Eksempel: `20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000`
        Set<String> detaljniva = Arrays.asList(); // Set<String> | Filtrer på veglenkens detaljnivå (kortnavn fra datakatalogen). Kommaseparert liste.   Eksempel: `VT,VTKB`
        Set<String> typeveg = Arrays.asList(); // Set<String> | Filtrer veglenker på type veg. Kommaseparert liste.  Eksempel: `kanalisertVeg, enkelBilveg, rampe, rundkjøring, bilferje, passasjerferje, gangOgSykkelveg, sykkelveg, gangveg, gågate, fortau, trapp, gangfelt, gatetun, traktorveg, sti, annet`
        Long superid = 56L; // Long | Hent detaljerte veglenkesegmenter stedfestet på veglenkesekvens med denne IDen.
        Set<String> adskiltelop = Arrays.asList(); // Set<String> | Filtrer på om veglenkesegmentene er stedfestet hvor det er en Strekning med verdi satt for «adskilte løp».
        Boolean kryssystem = true; // Boolean | Filtrer på om de er stedfestet på samme sted hvor det er et Kryssystem.
        Boolean sideanlegg = true; // Boolean | Filtrer på om de er stedfestet på samme sted hvor det er et Sideanlegg.
        Set<String> veglenketype = Arrays.asList(); // Set<String> | Filtrer på veglenken sin veglenketype. Kommaseparert liste.
        Boolean arm = true; // Boolean | Filtrer veglenker på om de er stedfestet på en Strekning med verdi satt for «arm».
        String trafikantgruppe = "K"; // String | Filtrer på trafikantgruppe.
        Integer geometritoleranse = 56; // Integer | Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.
        Boolean historisk = true; // Boolean | For `false` returneres kun dagens veglenkesegmenter. For `true` returneres dagens og historiske veglenkesegmenter. Default er `false`.
        LocalDate tidspunkt = LocalDate.now(); // LocalDate | Begrens spørring til det gitte tidspunktet.
        Integer antall = 56; // Integer | Angir hvor mange objekter som skal returneres. Se også `sidestørrelse` i responsens `metadata`-objekt.
        String start = "start_example"; // String | Angir paginerings-start for objekter som skal returneres. Brukes sammen med `antall`. Neste start får man i metadata-feltet i responsen. Settes blankt for å starte fra begynnelsen.
        Boolean inkluderAntall = true; // Boolean | Hvorvidt totalt antall objekter skal returneres i responsen. Default er `false`.
        try {
            VeglenkesegmenterSide result = apiInstance.getVeglenkesegmenter(srid, ider, fylke, kommune, kontraktsomrade, riksvegrute, vegforvalter, vegsystemreferanse, kartutsnitt, polygon, detaljniva, typeveg, superid, adskiltelop, kryssystem, sideanlegg, veglenketype, arm, trafikantgruppe, geometritoleranse, historisk, tidspunkt, antall, start, inkluderAntall);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VegnettApi#getVeglenkesegmenter");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name                   | Type                                 | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                             | Notes                                                                                                                                                                                              |
| ---------------------- | ------------------------------------ | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **srid**               | **String**                           | Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;. | [optional] [enum: 5972, 5973, 5975, 4326, UTM32, UTM33, UTM35, WGS84]                                                                                                                              |
| **ider**               | [**Set&lt;Long&gt;**](Long.md)       | Kommaseparert liste med IDer.                                                                                                                                                                                                                                                                                                                                                                                                                                           | [optional]                                                                                                                                                                                         |
| **fylke**              | [**Set&lt;Integer&gt;**](Integer.md) | Filtrer på fylke. Kommaseparert liste. Se [/omrader/api/v4/fylker](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der#/Omr%C3%A5der/getFylker) for mulige verdier. Eksempel: &#x60;50&#x60;                                                                                                                                                                                                                               | [optional]                                                                                                                                                                                         |
| **kommune**            | [**Set&lt;Integer&gt;**](Integer.md) | Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der#/Omr%C3%A5der/getKommuner) for mulige verdier. Eksempel: &#x60;5001&#x60;                                                                                                                                                                                                                       | [optional]                                                                                                                                                                                         |
| **kontraktsomrade**    | [**Set&lt;String&gt;**](String.md)   | Filtrer på kontraktsomrade. Kommaseparert liste. Se [/omrader/api/v4/kontraktsomrader](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der#/Omr%C3%A5der/getKontraktsomrader) for mulige verdier. Eksempel: &#x60;9503 Midtre Hålogaland 2021-2026&#x60;                                                                                                                                                                   | [optional]                                                                                                                                                                                         |
| **riksvegrute**        | [**Set&lt;String&gt;**](String.md)   | Filtrer på riksvegrute. Kommaseparert liste. Se [/omrader/api/v4/riksvegruter](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der#/Omr%C3%A5der/getRiksvegruter) for mulige verdier. Eksempel: &#x60;RUTE4A&#x60; eller som enumid &#x60;20290&#x60;                                                                                                                                                                      | [optional]                                                                                                                                                                                         |
| **vegforvalter**       | [**Set&lt;String&gt;**](String.md)   | Filtrer på vegforvalter. Kommaseparert liste. Se [/omrader/api/v4/vegforvaltere](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der#/Omr%C3%A5der/getVegforvaltere) for mulige verdier. Eksempel: &#x60;Møre og Romsdal fylkeskommune&#x60; eller som enumid &#x60;21774&#x60;                                                                                                                                            | [optional]                                                                                                                                                                                         |
| **vegsystemreferanse** | [**Set&lt;String&gt;**](String.md)   | Filtrer på [vegsystemreferanse](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område. Eksempel: &#x60;EV6S1D1 m12&#x60;                                                                                                                                                                                                              | [optional]                                                                                                                                                                                         |
| **kartutsnitt**        | **String**                           | Filtrer med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;. Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60;                                                                                                                                                                                                                                                             | [optional]                                                                                                                                                                                         |
| **polygon**            | **String**                           | Filtrer med polygon i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Eksempel: &#x60;20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000&#x60;                                                                                                                                                                                                                                                                                       | [optional]                                                                                                                                                                                         |
| **detaljniva**         | [**Set&lt;String&gt;**](String.md)   | Filtrer på veglenkens detaljnivå (kortnavn fra datakatalogen). Kommaseparert liste. Eksempel: &#x60;VT,VTKB&#x60;                                                                                                                                                                                                                                                                                                                                                       | [optional] [enum: VT, KB, KF, VTKB]                                                                                                                                                                |
| **typeveg**            | [**Set&lt;String&gt;**](String.md)   | Filtrer veglenker på type veg. Kommaseparert liste. Eksempel: &#x60;kanalisertVeg, enkelBilveg, rampe, rundkjøring, bilferje, passasjerferje, gangOgSykkelveg, sykkelveg, gangveg, gågate, fortau, trapp, gangfelt, gatetun, traktorveg, sti, annet&#x60;                                                                                                                                                                                                               | [optional] [enum: kanalisertVeg, enkelBilveg, rampe, rundkjøring, bilferje, passasjerferje, gangOgSykkelveg, sykkelveg, gangveg, gågate, fortau, trapp, gangfelt, gatetun, traktorveg, sti, annet] |
| **superid**            | **Long**                             | Hent detaljerte veglenkesegmenter stedfestet på veglenkesekvens med denne IDen.                                                                                                                                                                                                                                                                                                                                                                                         | [optional]                                                                                                                                                                                         |
| **adskiltelop**        | [**Set&lt;String&gt;**](String.md)   | Filtrer på om veglenkesegmentene er stedfestet hvor det er en Strekning med verdi satt for «adskilte løp».                                                                                                                                                                                                                                                                                                                                                              | [optional] [enum: Med, Mot, Nei]                                                                                                                                                                   |
| **kryssystem**         | **Boolean**                          | Filtrer på om de er stedfestet på samme sted hvor det er et Kryssystem.                                                                                                                                                                                                                                                                                                                                                                                                 | [optional]                                                                                                                                                                                         |
| **sideanlegg**         | **Boolean**                          | Filtrer på om de er stedfestet på samme sted hvor det er et Sideanlegg.                                                                                                                                                                                                                                                                                                                                                                                                 | [optional]                                                                                                                                                                                         |
| **veglenketype**       | [**Set&lt;String&gt;**](String.md)   | Filtrer på veglenken sin veglenketype. Kommaseparert liste.                                                                                                                                                                                                                                                                                                                                                                                                             | [optional] [enum: Hoved, Detaljert, Konnektering, detaljert_konnektering]                                                                                                                          |
| **arm**                | **Boolean**                          | Filtrer veglenker på om de er stedfestet på en Strekning med verdi satt for «arm».                                                                                                                                                                                                                                                                                                                                                                                      | [optional]                                                                                                                                                                                         |
| **trafikantgruppe**    | **String**                           | Filtrer på trafikantgruppe.                                                                                                                                                                                                                                                                                                                                                                                                                                             | [optional] [enum: K, G]                                                                                                                                                                            |
| **geometritoleranse**  | **Integer**                          | Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.                                                                                                                                                                                                                                                                               | [optional]                                                                                                                                                                                         |
| **historisk**          | **Boolean**                          | For &#x60;false&#x60; returneres kun dagens veglenkesegmenter. For &#x60;true&#x60; returneres dagens og historiske veglenkesegmenter. Default er &#x60;false&#x60;.                                                                                                                                                                                                                                                                                                    | [optional]                                                                                                                                                                                         |
| **tidspunkt**          | **LocalDate**                        | Begrens spørring til det gitte tidspunktet.                                                                                                                                                                                                                                                                                                                                                                                                                             | [optional]                                                                                                                                                                                         |
| **antall**             | **Integer**                          | Angir hvor mange objekter som skal returneres. Se også &#x60;sidestørrelse&#x60; i responsens &#x60;metadata&#x60;-objekt.                                                                                                                                                                                                                                                                                                                                              | [optional]                                                                                                                                                                                         |
| **start**              | **String**                           | Angir paginerings-start for objekter som skal returneres. Brukes sammen med &#x60;antall&#x60;. Neste start får man i metadata-feltet i responsen. Settes blankt for å starte fra begynnelsen.                                                                                                                                                                                                                                                                          | [optional]                                                                                                                                                                                         |
| **inkluderAntall**     | **Boolean**                          | Hvorvidt totalt antall objekter skal returneres i responsen. Default er &#x60;false&#x60;.                                                                                                                                                                                                                                                                                                                                                                              | [optional]                                                                                                                                                                                         |

### Return type

[**VeglenkesegmenterSide**](VeglenkesegmenterSide.md)

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

## getVeglenkesekvens

> Veglenkesekvens getVeglenkesekvens(veglenkesekvensId, srid)

Hent en veglenkesekvens

### Example

```java
// Import classes:
import no.vegvesen.vt.nvdb.vegnett.infrastructure.ApiClient;
import no.vegvesen.vt.nvdb.vegnett.infrastructure.ApiException;
import no.vegvesen.vt.nvdb.vegnett.infrastructure.Configuration;
import no.vegvesen.vt.nvdb.vegnett.infrastructure.models.*;
import no.vegvesen.vt.nvdb.vegnett.api.VegnettApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://nvdbapiles.atlas.vegvesen.no/vegnett");

        VegnettApi apiInstance = new VegnettApi(defaultClient);
        Long veglenkesekvensId = 56L; // Long | ID for veglenkesekvensen.
        String srid = "5972"; // String | Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: <a href='https://epsg.io/5972'>EPSG:5972</a> <a href='https://epsg.io/5973'>EPSG:5973</a> <a href='https://epsg.io/5975'>EPSG:5975</a> <a href='https://epsg.io/4326'>EPSG:4326</a>.
        try {
            Veglenkesekvens result = apiInstance.getVeglenkesekvens(veglenkesekvensId, srid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VegnettApi#getVeglenkesekvens");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name                  | Type       | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                             | Notes                                                                 |
| --------------------- | ---------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------- |
| **veglenkesekvensId** | **Long**   | ID for veglenkesekvensen.                                                                                                                                                                                                                                                                                                                                                                                                                                               |                                                                       |
| **srid**              | **String** | Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;. | [optional] [enum: 5972, 5973, 5975, 4326, UTM32, UTM33, UTM35, WGS84] |

### Return type

[**Veglenkesekvens**](Veglenkesekvens.md)

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

## getVeglenkesekvensEndringer

> VeglenkesekvensEndringerSide getVeglenkesekvensEndringer(start, antall, ider)

Hent endringer på veglenkesekvenser

### Example

```java
// Import classes:
import no.vegvesen.vt.nvdb.vegnett.infrastructure.ApiClient;
import no.vegvesen.vt.nvdb.vegnett.infrastructure.ApiException;
import no.vegvesen.vt.nvdb.vegnett.infrastructure.Configuration;
import no.vegvesen.vt.nvdb.vegnett.infrastructure.models.*;
import no.vegvesen.vt.nvdb.vegnett.api.VegnettApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://nvdbapiles.atlas.vegvesen.no/vegnett");

        VegnettApi apiInstance = new VegnettApi(defaultClient);
        OffsetDateTime start = OffsetDateTime.now(); // OffsetDateTime | Hent alle endringer etter gitt tidspunkt. Dersom denne utelates vil de eldste endringene hentes først.
        Integer antall = 56; // Integer | Antall endringer som skal være med i responsen. Merk at det faktiske antallet kan variere fra respons til respons. Dette er fordi endringer på samme veglenkesekvens innenfor samme side blir aggregert sammen ved å ta den nyeste endringen.
        Set<Long> ider = Arrays.asList(); // Set<Long> | Hent endringer for oppgitte veglenkesekvens IDer. Dersom denne utelates vil alle endringer hentes.
        try {
            VeglenkesekvensEndringerSide result = apiInstance.getVeglenkesekvensEndringer(start, antall, ider);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VegnettApi#getVeglenkesekvensEndringer");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name       | Type                           | Description                                                                                                                                                                                                                                   | Notes      |
| ---------- | ------------------------------ | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **start**  | **OffsetDateTime**             | Hent alle endringer etter gitt tidspunkt. Dersom denne utelates vil de eldste endringene hentes først.                                                                                                                                        | [optional] |
| **antall** | **Integer**                    | Antall endringer som skal være med i responsen. Merk at det faktiske antallet kan variere fra respons til respons. Dette er fordi endringer på samme veglenkesekvens innenfor samme side blir aggregert sammen ved å ta den nyeste endringen. | [optional] |
| **ider**   | [**Set&lt;Long&gt;**](Long.md) | Hent endringer for oppgitte veglenkesekvens IDer. Dersom denne utelates vil alle endringer hentes.                                                                                                                                            | [optional] |

### Return type

[**VeglenkesekvensEndringerSide**](VeglenkesekvensEndringerSide.md)

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

## getVeglenkesekvenser

> VeglenkesekvenserSide getVeglenkesekvenser(ider, fylke, kommune, kontraktsomrade, riksvegrute, vegsystemreferanse, topologiniva, superid, srid, polygon, antall, start, inkluderAntall)

Hent veglenkesekvenser

### Example

```java
// Import classes:
import no.vegvesen.vt.nvdb.vegnett.infrastructure.ApiClient;
import no.vegvesen.vt.nvdb.vegnett.infrastructure.ApiException;
import no.vegvesen.vt.nvdb.vegnett.infrastructure.Configuration;
import no.vegvesen.vt.nvdb.vegnett.infrastructure.models.*;
import no.vegvesen.vt.nvdb.vegnett.api.VegnettApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://nvdbapiles.atlas.vegvesen.no/vegnett");

        VegnettApi apiInstance = new VegnettApi(defaultClient);
        Set<Long> ider = Arrays.asList(); // Set<Long> | Kommaseparert liste med IDer.
        Set<Integer> fylke = Arrays.asList(); // Set<Integer> | Filtrer på fylke. Kommaseparert liste. Se [/omrader/api/v4/fylker](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der#/Omr%C3%A5der/getFylker) for mulige verdier.  Eksempel: `50`
        Set<Integer> kommune = Arrays.asList(); // Set<Integer> | Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der#/Omr%C3%A5der/getKommuner) for mulige verdier.  Eksempel: `5001`
        Set<String> kontraktsomrade = Arrays.asList(); // Set<String> | Filtrer på kontraktsomrade. Kommaseparert liste. Se [/omrader/api/v4/kontraktsomrader](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der#/Omr%C3%A5der/getKontraktsomrader) for mulige verdier.  Eksempel: `9503 Midtre Hålogaland 2021-2026`
        Set<String> riksvegrute = Arrays.asList(); // Set<String> | Filtrer på riksvegrute. Kommaseparert liste. Se [/omrader/api/v4/riksvegruter](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der#/Omr%C3%A5der/getRiksvegruter) for mulige verdier.  Eksempel: `RUTE4A` eller som enumid `20290`
        Set<String> vegsystemreferanse = Arrays.asList(); // Set<String> | Filtrer på [vegsystemreferanse](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: `EV6S1D1 m12`
        String topologiniva = "kjørebane"; // String | Hent kun elementer på det gitte topologinivået. - Dersom en veglenke har nivå vegtrasé er ofte feltet for topologinivå ikke tilstede. Man vil da få alle veglenker som ikke har verdi `kjørefelt` eller `kjørebane`.
        Long superid = 56L; // Long | Hent detaljerte veglenkesekvenser stedfestet på veglenkesekvens med denne IDen.
        String srid = "5972"; // String | Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: <a href='https://epsg.io/5972'>EPSG:5972</a> <a href='https://epsg.io/5973'>EPSG:5973</a> <a href='https://epsg.io/5975'>EPSG:5975</a> <a href='https://epsg.io/4326'>EPSG:4326</a>.
        String polygon = "polygon_example"; // String | Filtrer med polygon i det gjeldende geografiske referansesystemet (`srid`-paramteret).  Eksempel: `20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000`
        Integer antall = 56; // Integer | Angir hvor mange objekter som skal returneres. Se også `sidestørrelse` i responsens `metadata`-objekt.
        String start = "start_example"; // String | Angir paginerings-start for objekter som skal returneres. Brukes sammen med `antall`. Neste start får man i metadata-feltet i responsen. Settes blankt for å starte fra begynnelsen.
        Boolean inkluderAntall = true; // Boolean | Hvorvidt totalt antall objekter skal returneres i responsen. Default er `false`.
        try {
            VeglenkesekvenserSide result = apiInstance.getVeglenkesekvenser(ider, fylke, kommune, kontraktsomrade, riksvegrute, vegsystemreferanse, topologiniva, superid, srid, polygon, antall, start, inkluderAntall);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VegnettApi#getVeglenkesekvenser");
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
| **ider**               | [**Set&lt;Long&gt;**](Long.md)       | Kommaseparert liste med IDer.                                                                                                                                                                                                                                                                                                                                                                                                                                           | [optional]                                                            |
| **fylke**              | [**Set&lt;Integer&gt;**](Integer.md) | Filtrer på fylke. Kommaseparert liste. Se [/omrader/api/v4/fylker](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der#/Omr%C3%A5der/getFylker) for mulige verdier. Eksempel: &#x60;50&#x60;                                                                                                                                                                                                                               | [optional]                                                            |
| **kommune**            | [**Set&lt;Integer&gt;**](Integer.md) | Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der#/Omr%C3%A5der/getKommuner) for mulige verdier. Eksempel: &#x60;5001&#x60;                                                                                                                                                                                                                       | [optional]                                                            |
| **kontraktsomrade**    | [**Set&lt;String&gt;**](String.md)   | Filtrer på kontraktsomrade. Kommaseparert liste. Se [/omrader/api/v4/kontraktsomrader](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der#/Omr%C3%A5der/getKontraktsomrader) for mulige verdier. Eksempel: &#x60;9503 Midtre Hålogaland 2021-2026&#x60;                                                                                                                                                                   | [optional]                                                            |
| **riksvegrute**        | [**Set&lt;String&gt;**](String.md)   | Filtrer på riksvegrute. Kommaseparert liste. Se [/omrader/api/v4/riksvegruter](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der#/Omr%C3%A5der/getRiksvegruter) for mulige verdier. Eksempel: &#x60;RUTE4A&#x60; eller som enumid &#x60;20290&#x60;                                                                                                                                                                      | [optional]                                                            |
| **vegsystemreferanse** | [**Set&lt;String&gt;**](String.md)   | Filtrer på [vegsystemreferanse](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område. Eksempel: &#x60;EV6S1D1 m12&#x60;                                                                                                                                                                                                              | [optional]                                                            |
| **topologiniva**       | **String**                           | Hent kun elementer på det gitte topologinivået. - Dersom en veglenke har nivå vegtrasé er ofte feltet for topologinivå ikke tilstede. Man vil da få alle veglenker som ikke har verdi &#x60;kjørefelt&#x60; eller &#x60;kjørebane&#x60;.                                                                                                                                                                                                                                | [optional] [enum: kjørebane, kjørefelt, vegtrase]                     |
| **superid**            | **Long**                             | Hent detaljerte veglenkesekvenser stedfestet på veglenkesekvens med denne IDen.                                                                                                                                                                                                                                                                                                                                                                                         | [optional]                                                            |
| **srid**               | **String**                           | Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;. | [optional] [enum: 5972, 5973, 5975, 4326, UTM32, UTM33, UTM35, WGS84] |
| **polygon**            | **String**                           | Filtrer med polygon i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Eksempel: &#x60;20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000&#x60;                                                                                                                                                                                                                                                                                       | [optional]                                                            |
| **antall**             | **Integer**                          | Angir hvor mange objekter som skal returneres. Se også &#x60;sidestørrelse&#x60; i responsens &#x60;metadata&#x60;-objekt.                                                                                                                                                                                                                                                                                                                                              | [optional]                                                            |
| **start**              | **String**                           | Angir paginerings-start for objekter som skal returneres. Brukes sammen med &#x60;antall&#x60;. Neste start får man i metadata-feltet i responsen. Settes blankt for å starte fra begynnelsen.                                                                                                                                                                                                                                                                          | [optional]                                                            |
| **inkluderAntall**     | **Boolean**                          | Hvorvidt totalt antall objekter skal returneres i responsen. Default er &#x60;false&#x60;.                                                                                                                                                                                                                                                                                                                                                                              | [optional]                                                            |

### Return type

[**VeglenkesekvenserSide**](VeglenkesekvenserSide.md)

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

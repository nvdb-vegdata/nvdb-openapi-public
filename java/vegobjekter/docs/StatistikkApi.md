# StatistikkApi

All URIs are relative to *https://nvdbapiles.atlas.vegvesen.no/vegobjekter*

| Method                                                                                    | HTTP request                                                      | Description                                                              |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------- | ------------------------------------------------------------------------ |
| [**getVegobjekterStatistikk**](StatistikkApi.md#getVegobjekterStatistikk)                 | **GET** /api/v4/vegobjekter/{vegobjekttypeid}/statistikk          | Hent statistikk for en vegobjekttype                                     |
| [**getVegobjekterStatistikkGruppert**](StatistikkApi.md#getVegobjekterStatistikkGruppert) | **GET** /api/v4/vegobjekter/{vegobjekttypeid}/statistikk/gruppert | Hent statistikk for en vegobjekttype, gruppert på ett eller flere felter |
| [**getVegobjekterStatistikkMedTyper**](StatistikkApi.md#getVegobjekterStatistikkMedTyper) | **GET** /api/v4/vegobjekter/statistikk                            | Hent overordnet statistikk for alle vegobjekttyper                       |

## getVegobjekterStatistikk

> VegobjekterStatistikk getVegobjekterStatistikk(vegobjekttypeid, srid, segmentering, fylke, kommune, kontraktsomrade, riksvegrute, vegforvalter, vegsystemreferanse, kartutsnitt, polygon, typeveg, adskiltelop, kryssystem, sideanlegg, trafikantgruppe, inkluder, veglenkesekvens, veglenketype, detaljniva, endretEtter, tidspunkt, egenskap, overlapp)

Hent statistikk for en vegobjekttype

### Example

```java
// Import classes:
import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.ApiClient;
import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.ApiException;
import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.Configuration;
import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.auth.*;
import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.models.*;
import no.vegvesen.vt.nvdb.vegobjekter.api.StatistikkApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://nvdbapiles.atlas.vegvesen.no/vegobjekter");

        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatistikkApi apiInstance = new StatistikkApi(defaultClient);
        Integer vegobjekttypeid = 56; // Integer | Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.  Eksempel: 581
        String srid = "5972"; // String | Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: <a href='https://epsg.io/5972'>EPSG:5972</a> <a href='https://epsg.io/5973'>EPSG:5973</a> <a href='https://epsg.io/5975'>EPSG:5975</a> <a href='https://epsg.io/4326'>EPSG:4326</a>.
        Boolean segmentering = true; // Boolean | Angir om lengde skal inkludere bare deler av vegnettet som er innenfor søkeparametre tilknyttet segmentering (fylke, kommune, vegsystemreferanse, kontraktsområde, riksvegrute, vegforvalter).  Default: `false`
        Set<Integer> fylke = Arrays.asList(); // Set<Integer> | Filtrer på fylke. Kommaseparert liste. Se /omrader/fylker for mulige verdier.  Eksempel: `50`
        Set<Integer> kommune = Arrays.asList(); // Set<Integer> | Filtrer på kommune. Kommaseparert liste. Se /omrader/kommuner for mulige verdier.  Eksempel: `5001`
        Set<String> kontraktsomrade = Arrays.asList(); // Set<String> | Filtrer på kontraktsomrade. Kommaseparert liste. Se /omrader/kontraktsomrader for mulige verdier.  Eksempel: `9503 Midtre Hålogaland 2021-2026`
        Set<String> riksvegrute = Arrays.asList(); // Set<String> | Filtrer på riksvegrute. Kommaseparert liste. Se /omrader/riksvegruter for mulige verdier.  Eksempel: `RUTE4A` eller som enumid `20290`
        Set<String> vegforvalter = Arrays.asList(); // Set<String> | Filtrer på vegforvalter. Kommaseparert liste. Se [/omrader/api/v4/vegforvaltere](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der) for mulige verdier.  Eksempel: `Møre og Romsdal fylkeskommune` eller som enumid `21774`
        Set<String> vegsystemreferanse = Arrays.asList(); // Set<String> | Filtrer vegobjekter på [vegsystemreferanse](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: `EV6S1D1 m12`
        String kartutsnitt = "kartutsnitt_example"; // String | Filtrer vegobjekter med kartutsnitt i det gjeldende geografiske referansesystemet (`srid`-paramteret). Formatet er `minX, minY, maxX, maxY`. Merk at vegobjektets bounding box benyttes for sammenligning, som kan medføre at vegobjekter som er utenfor kartutsnittet også returneres. For å unngå dette, kan du bruke `polygon` i stedet.  Eksempel: `265273, 7019372, 346553, 7061071`
        String polygon = "polygon_example"; // String | Filtrer vegobjekter med polygon i det gjeldende geografiske referansesystemet (`srid`-paramteret). Merk: For statistikk-spørringer vil polygonets bounding box benyttes, ikke polygonet selv.  Eksempel: `20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000`
        Set<String> typeveg = Arrays.asList(); // Set<String> | Filtrer Relasjonstype.vegobjekter på type veg på vegnettet objektet er stedfestet på. Kommaseparert liste.  Eksempel: `kanalisertVeg, enkelBilveg, rampe, rundkjøring, bilferje, passasjerferje, gangOgSykkelveg, sykkelveg, gangveg, gågate, fortau, trapp, gangfelt, gatetun, traktorveg, sti, annet`
        Set<String> adskiltelop = Arrays.asList(); // Set<String> | Filtrer vegobjekter på om de er stedfestet hvor det er en Strekning med verdi satt for «adskilte løp».
        Boolean kryssystem = true; // Boolean | Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Kryssystem.
        Boolean sideanlegg = true; // Boolean | Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Sideanlegg.
        String trafikantgruppe = "K"; // String | Filtrer vegobjekter på trafikantgruppe.
        List<String> inkluder = Arrays.asList(); // List<String> | Kommaseparert liste av statistikkfelt som skal inkluderes i resultatet.
        Set<String> veglenkesekvens = Arrays.asList(); // Set<String> | Filtrer vegobjekter på om de er stedfestet på gjeldende veglenkesekvenser. Kommaseparert liste.  Eksempel: `0.37@319531,0.83-0.97@41640`
        Set<String> veglenketype = Arrays.asList(); // Set<String> | Filtrer vegobjekter på veglenketype på vegnettet objektet er stedfestet. Kommaseparert liste.
        Set<String> detaljniva = Arrays.asList(); // Set<String> | Filtrer vegobjekter på detaljnivå på vegnettet objektet er stedfestet på (kortnavn fra datakatalogen).
        OffsetDateTime endretEtter = OffsetDateTime.now(); // OffsetDateTime | Finner statistikk for vegobjekter som har blitt endret etter dette tidspunktet. Eksmepel: 2024-12-02T10:15:30
        LocalDate tidspunkt = LocalDate.now(); // LocalDate | Finner statistikk for vegobjekter som var gyldige denne datoen.
        List<String> egenskap = Arrays.asList(); // List<String> | Filtrer vegobjekter på egenskaper, relasjoner og overlapp. Se [dokumentasjon](https://nvdb.atlas.vegvesen.no/docs/produkter/nvdbapil/v4/introduksjon/Avanserte_filter)
        List<String> overlapp = Arrays.asList(); // List<String> | Filtrer vegobjekter på overlapp. Se [dokumentasjon](https://nvdb.atlas.vegvesen.no/docs/produkter/nvdbapil/v4/introduksjon/Avanserte_filter)
        try {
            VegobjekterStatistikk result = apiInstance.getVegobjekterStatistikk(vegobjekttypeid, srid, segmentering, fylke, kommune, kontraktsomrade, riksvegrute, vegforvalter, vegsystemreferanse, kartutsnitt, polygon, typeveg, adskiltelop, kryssystem, sideanlegg, trafikantgruppe, inkluder, veglenkesekvens, veglenketype, detaljniva, endretEtter, tidspunkt, egenskap, overlapp);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatistikkApi#getVegobjekterStatistikk");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name                   | Type                                 | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     | Notes                                                                                                                                                                                              |
| ---------------------- | ------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **vegobjekttypeid**    | **Integer**                          | Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier. Eksempel: 581                                                                                                                                                                                                                                                                                                                                                                                        |                                                                                                                                                                                                    |
| **srid**               | **String**                           | Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;. | [optional] [enum: 5972, 5973, 5975, 4326, UTM32, UTM33, UTM35, WGS84]                                                                                                                              |
| **segmentering**       | **Boolean**                          | Angir om lengde skal inkludere bare deler av vegnettet som er innenfor søkeparametre tilknyttet segmentering (fylke, kommune, vegsystemreferanse, kontraktsområde, riksvegrute, vegforvalter). Default: &#x60;false&#x60;                                                                                                                                                                                                                                                                                                       | [optional]                                                                                                                                                                                         |
| **fylke**              | [**Set&lt;Integer&gt;**](Integer.md) | Filtrer på fylke. Kommaseparert liste. Se /omrader/fylker for mulige verdier. Eksempel: &#x60;50&#x60;                                                                                                                                                                                                                                                                                                                                                                                                                          | [optional]                                                                                                                                                                                         |
| **kommune**            | [**Set&lt;Integer&gt;**](Integer.md) | Filtrer på kommune. Kommaseparert liste. Se /omrader/kommuner for mulige verdier. Eksempel: &#x60;5001&#x60;                                                                                                                                                                                                                                                                                                                                                                                                                    | [optional]                                                                                                                                                                                         |
| **kontraktsomrade**    | [**Set&lt;String&gt;**](String.md)   | Filtrer på kontraktsomrade. Kommaseparert liste. Se /omrader/kontraktsomrader for mulige verdier. Eksempel: &#x60;9503 Midtre Hålogaland 2021-2026&#x60;                                                                                                                                                                                                                                                                                                                                                                        | [optional]                                                                                                                                                                                         |
| **riksvegrute**        | [**Set&lt;String&gt;**](String.md)   | Filtrer på riksvegrute. Kommaseparert liste. Se /omrader/riksvegruter for mulige verdier. Eksempel: &#x60;RUTE4A&#x60; eller som enumid &#x60;20290&#x60;                                                                                                                                                                                                                                                                                                                                                                       | [optional]                                                                                                                                                                                         |
| **vegforvalter**       | [**Set&lt;String&gt;**](String.md)   | Filtrer på vegforvalter. Kommaseparert liste. Se [/omrader/api/v4/vegforvaltere](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der) for mulige verdier. Eksempel: &#x60;Møre og Romsdal fylkeskommune&#x60; eller som enumid &#x60;21774&#x60;                                                                                                                                                                                                                                   | [optional]                                                                                                                                                                                         |
| **vegsystemreferanse** | [**Set&lt;String&gt;**](String.md)   | Filtrer vegobjekter på [vegsystemreferanse](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område. Eksempel: &#x60;EV6S1D1 m12&#x60;                                                                                                                                                                                                                                                                | [optional]                                                                                                                                                                                         |
| **kartutsnitt**        | **String**                           | Filtrer vegobjekter med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;. Merk at vegobjektets bounding box benyttes for sammenligning, som kan medføre at vegobjekter som er utenfor kartutsnittet også returneres. For å unngå dette, kan du bruke &#x60;polygon&#x60; i stedet. Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60;                                                                                                | [optional]                                                                                                                                                                                         |
| **polygon**            | **String**                           | Filtrer vegobjekter med polygon i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Merk: For statistikk-spørringer vil polygonets bounding box benyttes, ikke polygonet selv. Eksempel: &#x60;20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000&#x60;                                                                                                                                                                                                                                        | [optional]                                                                                                                                                                                         |
| **typeveg**            | [**Set&lt;String&gt;**](String.md)   | Filtrer Relasjonstype.vegobjekter på type veg på vegnettet objektet er stedfestet på. Kommaseparert liste. Eksempel: &#x60;kanalisertVeg, enkelBilveg, rampe, rundkjøring, bilferje, passasjerferje, gangOgSykkelveg, sykkelveg, gangveg, gågate, fortau, trapp, gangfelt, gatetun, traktorveg, sti, annet&#x60;                                                                                                                                                                                                                | [optional] [enum: kanalisertVeg, enkelBilveg, rampe, rundkjøring, bilferje, passasjerferje, gangOgSykkelveg, sykkelveg, gangveg, gågate, fortau, trapp, gangfelt, gatetun, traktorveg, sti, annet] |
| **adskiltelop**        | [**Set&lt;String&gt;**](String.md)   | Filtrer vegobjekter på om de er stedfestet hvor det er en Strekning med verdi satt for «adskilte løp».                                                                                                                                                                                                                                                                                                                                                                                                                          | [optional] [enum: Med, Mot, Nei]                                                                                                                                                                   |
| **kryssystem**         | **Boolean**                          | Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Kryssystem.                                                                                                                                                                                                                                                                                                                                                                                                                                             | [optional]                                                                                                                                                                                         |
| **sideanlegg**         | **Boolean**                          | Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Sideanlegg.                                                                                                                                                                                                                                                                                                                                                                                                                                             | [optional]                                                                                                                                                                                         |
| **trafikantgruppe**    | **String**                           | Filtrer vegobjekter på trafikantgruppe.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | [optional] [enum: K, G]                                                                                                                                                                            |
| **inkluder**           | [**List&lt;String&gt;**](String.md)  | Kommaseparert liste av statistikkfelt som skal inkluderes i resultatet.                                                                                                                                                                                                                                                                                                                                                                                                                                                         | [optional] [enum: lengde, antall, alle]                                                                                                                                                            |
| **veglenkesekvens**    | [**Set&lt;String&gt;**](String.md)   | Filtrer vegobjekter på om de er stedfestet på gjeldende veglenkesekvenser. Kommaseparert liste. Eksempel: &#x60;0.37@319531,0.83-0.97@41640&#x60;                                                                                                                                                                                                                                                                                                                                                                               | [optional]                                                                                                                                                                                         |
| **veglenketype**       | [**Set&lt;String&gt;**](String.md)   | Filtrer vegobjekter på veglenketype på vegnettet objektet er stedfestet. Kommaseparert liste.                                                                                                                                                                                                                                                                                                                                                                                                                                   | [optional] [enum: ukjent, detaljert, konnektering, detaljert_konnektering, hoved]                                                                                                                  |
| **detaljniva**         | [**Set&lt;String&gt;**](String.md)   | Filtrer vegobjekter på detaljnivå på vegnettet objektet er stedfestet på (kortnavn fra datakatalogen).                                                                                                                                                                                                                                                                                                                                                                                                                          | [optional] [enum: VT, KB, KF, VTKB]                                                                                                                                                                |
| **endretEtter**        | **OffsetDateTime**                   | Finner statistikk for vegobjekter som har blitt endret etter dette tidspunktet. Eksmepel: 2024-12-02T10:15:30                                                                                                                                                                                                                                                                                                                                                                                                                   | [optional]                                                                                                                                                                                         |
| **tidspunkt**          | **LocalDate**                        | Finner statistikk for vegobjekter som var gyldige denne datoen.                                                                                                                                                                                                                                                                                                                                                                                                                                                                 | [optional]                                                                                                                                                                                         |
| **egenskap**           | [**List&lt;String&gt;**](String.md)  | Filtrer vegobjekter på egenskaper, relasjoner og overlapp. Se [dokumentasjon](https://nvdb.atlas.vegvesen.no/docs/produkter/nvdbapil/v4/introduksjon/Avanserte_filter)                                                                                                                                                                                                                                                                                                                                                          | [optional]                                                                                                                                                                                         |
| **overlapp**           | [**List&lt;String&gt;**](String.md)  | Filtrer vegobjekter på overlapp. Se [dokumentasjon](https://nvdb.atlas.vegvesen.no/docs/produkter/nvdbapil/v4/introduksjon/Avanserte_filter)                                                                                                                                                                                                                                                                                                                                                                                    | [optional]                                                                                                                                                                                         |

### Return type

[**VegobjekterStatistikk**](VegobjekterStatistikk.md)

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

## getVegobjekterStatistikkGruppert

> List&lt;VegobjekterStatistikkGruppert&gt; getVegobjekterStatistikkGruppert(vegobjekttypeid, gruppering, srid, kartutsnitt, inkluder, veglenkesekvens, tidspunkt)

Hent statistikk for en vegobjekttype, gruppert på ett eller flere felter

### Example

```java
// Import classes:
import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.ApiClient;
import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.ApiException;
import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.Configuration;
import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.auth.*;
import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.models.*;
import no.vegvesen.vt.nvdb.vegobjekter.api.StatistikkApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://nvdbapiles.atlas.vegvesen.no/vegobjekter");

        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatistikkApi apiInstance = new StatistikkApi(defaultClient);
        Integer vegobjekttypeid = 56; // Integer |
        Set<String> gruppering = Arrays.asList(); // Set<String> | Velg en eller flere felter som statistikken skal grupperes på.
        String srid = "5972"; // String | Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: <a href='https://epsg.io/5972'>EPSG:5972</a> <a href='https://epsg.io/5973'>EPSG:5973</a> <a href='https://epsg.io/5975'>EPSG:5975</a> <a href='https://epsg.io/4326'>EPSG:4326</a>.
        String kartutsnitt = "kartutsnitt_example"; // String | Filtrer vegobjekter med kartutsnitt i det gjeldende geografiske referansesystemet (`srid`-paramteret). Formatet er `minX, minY, maxX, maxY`. Merk at vegobjektets bounding box benyttes for sammenligning, som kan medføre at vegobjekter som er utenfor kartutsnittet også returneres. For å unngå dette, kan du bruke `polygon` i stedet.  Eksempel: `265273, 7019372, 346553, 7061071`
        Set<String> inkluder = Arrays.asList(); // Set<String> | Kommaseparert liste av statistikkfelt som skal inkluderes i resultatet.
        Set<String> veglenkesekvens = Arrays.asList(); // Set<String> | Filtrer vegobjekter på om de er stedfestet på gjeldende veglenkesekvenser. Kommaseparert liste.  Eksempel: `0.37@319531,0.83-0.97@41640`
        LocalDate tidspunkt = LocalDate.now(); // LocalDate | Finner versjonen som var gyldig denne datoen.
        try {
            List<VegobjekterStatistikkGruppert> result = apiInstance.getVegobjekterStatistikkGruppert(vegobjekttypeid, gruppering, srid, kartutsnitt, inkluder, veglenkesekvens, tidspunkt);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatistikkApi#getVegobjekterStatistikkGruppert");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name                | Type                               | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     | Notes                                                                 |
| ------------------- | ---------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------- |
| **vegobjekttypeid** | **Integer**                        |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |                                                                       |
| **gruppering**      | [**Set&lt;String&gt;**](String.md) | Velg en eller flere felter som statistikken skal grupperes på.                                                                                                                                                                                                                                                                                                                                                                                                                                                                  | [enum: fylke, kommune, vegkategori]                                   |
| **srid**            | **String**                         | Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;. | [optional] [enum: 5972, 5973, 5975, 4326, UTM32, UTM33, UTM35, WGS84] |
| **kartutsnitt**     | **String**                         | Filtrer vegobjekter med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;. Merk at vegobjektets bounding box benyttes for sammenligning, som kan medføre at vegobjekter som er utenfor kartutsnittet også returneres. For å unngå dette, kan du bruke &#x60;polygon&#x60; i stedet. Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60;                                                                                                | [optional]                                                            |
| **inkluder**        | [**Set&lt;String&gt;**](String.md) | Kommaseparert liste av statistikkfelt som skal inkluderes i resultatet.                                                                                                                                                                                                                                                                                                                                                                                                                                                         | [optional] [enum: lengde, antall, alle]                               |
| **veglenkesekvens** | [**Set&lt;String&gt;**](String.md) | Filtrer vegobjekter på om de er stedfestet på gjeldende veglenkesekvenser. Kommaseparert liste. Eksempel: &#x60;0.37@319531,0.83-0.97@41640&#x60;                                                                                                                                                                                                                                                                                                                                                                               | [optional]                                                            |
| **tidspunkt**       | **LocalDate**                      | Finner versjonen som var gyldig denne datoen.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   | [optional]                                                            |

### Return type

[**List&lt;VegobjekterStatistikkGruppert&gt;**](VegobjekterStatistikkGruppert.md)

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

## getVegobjekterStatistikkMedTyper

> List&lt;VegobjekterStatistikkMedType&gt; getVegobjekterStatistikkMedTyper(inkluder, kontraktsomrade, tidspunkt)

Hent overordnet statistikk for alle vegobjekttyper

### Example

```java
// Import classes:
import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.ApiClient;
import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.ApiException;
import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.Configuration;
import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.auth.*;
import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.models.*;
import no.vegvesen.vt.nvdb.vegobjekter.api.StatistikkApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://nvdbapiles.atlas.vegvesen.no/vegobjekter");

        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatistikkApi apiInstance = new StatistikkApi(defaultClient);
        List<String> inkluder = Arrays.asList(); // List<String> | Kommaseparert liste av statistikkfelt som skal inkluderes i resultatet.
        Set<String> kontraktsomrade = Arrays.asList(); // Set<String> | Filtrer på kontraktsomrade. Kommaseparert liste. Se /omrader/kontraktsomrader for mulige verdier.  Eksempel: `9503 Midtre Hålogaland 2021-2026`
        LocalDate tidspunkt = LocalDate.now(); // LocalDate | Finner versjonen som var gyldig denne datoen.
        try {
            List<VegobjekterStatistikkMedType> result = apiInstance.getVegobjekterStatistikkMedTyper(inkluder, kontraktsomrade, tidspunkt);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatistikkApi#getVegobjekterStatistikkMedTyper");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

| Name                | Type                                | Description                                                                                                                                              | Notes                                   |
| ------------------- | ----------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------- |
| **inkluder**        | [**List&lt;String&gt;**](String.md) | Kommaseparert liste av statistikkfelt som skal inkluderes i resultatet.                                                                                  | [optional] [enum: lengde, antall, alle] |
| **kontraktsomrade** | [**Set&lt;String&gt;**](String.md)  | Filtrer på kontraktsomrade. Kommaseparert liste. Se /omrader/kontraktsomrader for mulige verdier. Eksempel: &#x60;9503 Midtre Hålogaland 2021-2026&#x60; | [optional]                              |
| **tidspunkt**       | **LocalDate**                       | Finner versjonen som var gyldig denne datoen.                                                                                                            | [optional]                              |

### Return type

[**List&lt;VegobjekterStatistikkMedType&gt;**](VegobjekterStatistikkMedType.md)

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

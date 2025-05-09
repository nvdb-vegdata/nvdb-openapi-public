package no.vegvesen.vt.nvdb.vegobjekter.api;

import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.ApiClient;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import no.vegvesen.vt.nvdb.vegobjekter.model.ProblemDetail;
import java.util.Set;
import no.vegvesen.vt.nvdb.vegobjekter.model.VegobjekterStatistikk;
import no.vegvesen.vt.nvdb.vegobjekter.model.VegobjekterStatistikkGruppert;
import no.vegvesen.vt.nvdb.vegobjekter.model.VegobjekterStatistikkMedType;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class StatistikkApi {
    private ApiClient apiClient;

    public StatistikkApi() {
        this(new ApiClient());
    }

    @Autowired
    public StatistikkApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Hent statistikk for en vegobjekttype
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param vegobjekttypeid Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.  Eksempel: 581         
     * @param srid Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param segmentering Angir om lengde skal inkludere bare deler av vegnettet som er innenfor søkeparametre tilknyttet segmentering (fylke, kommune, vegsystemreferanse, kontraktsområde, riksvegrute, vegforvalter).  Default: &#x60;false&#x60;
     * @param fylke Filtrer på fylke. Kommaseparert liste. Se /omrader/fylker for mulige verdier.  Eksempel: &#x60;50&#x60;
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se /omrader/kommuner for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @param kontraktsomrade Filtrer på kontraktsomrade. Kommaseparert liste. Se /omrader/kontraktsomrader for mulige verdier.  Eksempel: &#x60;9503 Midtre Hålogaland 2021-2026&#x60;
     * @param riksvegrute Filtrer på riksvegrute. Kommaseparert liste. Se /omrader/riksvegruter for mulige verdier.  Eksempel: &#x60;RUTE4A&#x60; eller som enumid &#x60;20290&#x60;
     * @param vegforvalter Filtrer på vegforvalter. Kommaseparert liste. Se [/omrader/api/v4/vegforvaltere](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;Møre og Romsdal fylkeskommune&#x60; eller som enumid &#x60;21774&#x60;
     * @param vegsystemreferanse Filtrer vegobjekter på [vegsystemreferanse](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1 m12&#x60;
     * @param kartutsnitt Filtrer vegobjekter med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;. Merk at vegobjektets bounding box benyttes for sammenligning, som kan medføre at vegobjekter som er utenfor kartutsnittet også returneres. For å unngå dette, kan du bruke &#x60;polygon&#x60; i stedet.  Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60;
     * @param polygon Filtrer vegobjekter med polygon i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Merk: For statistikk-spørringer vil polygonets bounding box benyttes, ikke polygonet selv.  Eksempel: &#x60;20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000&#x60;
     * @param typeveg Filtrer Relasjonstype.vegobjekter på type veg på vegnettet objektet er stedfestet på. Kommaseparert liste.  Eksempel: &#x60;kanalisertVeg, enkelBilveg, rampe, rundkjøring, bilferje, passasjerferje, gangOgSykkelveg, sykkelveg, gangveg, gågate, fortau, trapp, gangfelt, gatetun, traktorveg, sti, annet&#x60;
     * @param adskiltelop Filtrer vegobjekter på om de er stedfestet hvor det er en Strekning med verdi satt for «adskilte løp».
     * @param kryssystem Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Kryssystem.
     * @param sideanlegg Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Sideanlegg.
     * @param trafikantgruppe Filtrer vegobjekter på trafikantgruppe.
     * @param inkluder Kommaseparert liste av statistikkfelt som skal inkluderes i resultatet.
     * @param veglenkesekvens Filtrer vegobjekter på om de er stedfestet på gjeldende veglenkesekvenser. Kommaseparert liste.  Eksempel: &#x60;0.37@319531,0.83-0.97@41640&#x60;
     * @param veglenketype Filtrer vegobjekter på veglenketype på vegnettet objektet er stedfestet. Kommaseparert liste.
     * @param detaljniva Filtrer vegobjekter på detaljnivå på vegnettet objektet er stedfestet på (kortnavn fra datakatalogen).
     * @param endretEtter Finner statistikk for vegobjekter som har blitt endret etter dette tidspunktet. Eksmepel: 2024-12-02T10:15:30
     * @param tidspunkt Finner statistikk for vegobjekter som var gyldige denne datoen.
     * @param egenskap Filtrer vegobjekter på egenskaper, relasjoner og overlapp. Se [dokumentasjon](https://nvdb.atlas.vegvesen.no/docs/produkter/nvdbapil/v4/introduksjon/Avanserte_filter)
     * @param overlapp Filtrer vegobjekter på overlapp. Se [dokumentasjon](https://nvdb.atlas.vegvesen.no/docs/produkter/nvdbapil/v4/introduksjon/Avanserte_filter)
     * @return VegobjekterStatistikk
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getVegobjekterStatistikkRequestCreation(@jakarta.annotation.Nonnull Integer vegobjekttypeid, @jakarta.annotation.Nullable String srid, @jakarta.annotation.Nullable Boolean segmentering, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable Set<String> riksvegrute, @jakarta.annotation.Nullable Set<String> vegforvalter, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable String kartutsnitt, @jakarta.annotation.Nullable String polygon, @jakarta.annotation.Nullable Set<String> typeveg, @jakarta.annotation.Nullable Set<String> adskiltelop, @jakarta.annotation.Nullable Boolean kryssystem, @jakarta.annotation.Nullable Boolean sideanlegg, @jakarta.annotation.Nullable String trafikantgruppe, @jakarta.annotation.Nullable List<String> inkluder, @jakarta.annotation.Nullable Set<String> veglenkesekvens, @jakarta.annotation.Nullable Set<String> veglenketype, @jakarta.annotation.Nullable Set<String> detaljniva, @jakarta.annotation.Nullable OffsetDateTime endretEtter, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable List<String> egenskap, @jakarta.annotation.Nullable List<String> overlapp) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'vegobjekttypeid' is set
        if (vegobjekttypeid == null) {
            throw new WebClientResponseException("Missing the required parameter 'vegobjekttypeid' when calling getVegobjekterStatistikk", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("vegobjekttypeid", vegobjekttypeid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "srid", srid));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "segmentering", segmentering));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "fylke", fylke));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "kommune", kommune));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "kontraktsomrade", kontraktsomrade));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "riksvegrute", riksvegrute));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "vegforvalter", vegforvalter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "vegsystemreferanse", vegsystemreferanse));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "kartutsnitt", kartutsnitt));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "polygon", polygon));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "typeveg", typeveg));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "adskiltelop", adskiltelop));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "kryssystem", kryssystem));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sideanlegg", sideanlegg));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "trafikantgruppe", trafikantgruppe));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "inkluder", inkluder));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "veglenkesekvens", veglenkesekvens));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "veglenketype", veglenketype));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "detaljniva", detaljniva));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "endret_etter", endretEtter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tidspunkt", tidspunkt));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "egenskap", egenskap));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "overlapp", overlapp));
        
        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<VegobjekterStatistikk> localVarReturnType = new ParameterizedTypeReference<VegobjekterStatistikk>() {};
        return apiClient.invokeAPI("/api/v4/vegobjekter/{vegobjekttypeid}/statistikk", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Hent statistikk for en vegobjekttype
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param vegobjekttypeid Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.  Eksempel: 581         
     * @param srid Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param segmentering Angir om lengde skal inkludere bare deler av vegnettet som er innenfor søkeparametre tilknyttet segmentering (fylke, kommune, vegsystemreferanse, kontraktsområde, riksvegrute, vegforvalter).  Default: &#x60;false&#x60;
     * @param fylke Filtrer på fylke. Kommaseparert liste. Se /omrader/fylker for mulige verdier.  Eksempel: &#x60;50&#x60;
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se /omrader/kommuner for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @param kontraktsomrade Filtrer på kontraktsomrade. Kommaseparert liste. Se /omrader/kontraktsomrader for mulige verdier.  Eksempel: &#x60;9503 Midtre Hålogaland 2021-2026&#x60;
     * @param riksvegrute Filtrer på riksvegrute. Kommaseparert liste. Se /omrader/riksvegruter for mulige verdier.  Eksempel: &#x60;RUTE4A&#x60; eller som enumid &#x60;20290&#x60;
     * @param vegforvalter Filtrer på vegforvalter. Kommaseparert liste. Se [/omrader/api/v4/vegforvaltere](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;Møre og Romsdal fylkeskommune&#x60; eller som enumid &#x60;21774&#x60;
     * @param vegsystemreferanse Filtrer vegobjekter på [vegsystemreferanse](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1 m12&#x60;
     * @param kartutsnitt Filtrer vegobjekter med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;. Merk at vegobjektets bounding box benyttes for sammenligning, som kan medføre at vegobjekter som er utenfor kartutsnittet også returneres. For å unngå dette, kan du bruke &#x60;polygon&#x60; i stedet.  Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60;
     * @param polygon Filtrer vegobjekter med polygon i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Merk: For statistikk-spørringer vil polygonets bounding box benyttes, ikke polygonet selv.  Eksempel: &#x60;20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000&#x60;
     * @param typeveg Filtrer Relasjonstype.vegobjekter på type veg på vegnettet objektet er stedfestet på. Kommaseparert liste.  Eksempel: &#x60;kanalisertVeg, enkelBilveg, rampe, rundkjøring, bilferje, passasjerferje, gangOgSykkelveg, sykkelveg, gangveg, gågate, fortau, trapp, gangfelt, gatetun, traktorveg, sti, annet&#x60;
     * @param adskiltelop Filtrer vegobjekter på om de er stedfestet hvor det er en Strekning med verdi satt for «adskilte løp».
     * @param kryssystem Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Kryssystem.
     * @param sideanlegg Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Sideanlegg.
     * @param trafikantgruppe Filtrer vegobjekter på trafikantgruppe.
     * @param inkluder Kommaseparert liste av statistikkfelt som skal inkluderes i resultatet.
     * @param veglenkesekvens Filtrer vegobjekter på om de er stedfestet på gjeldende veglenkesekvenser. Kommaseparert liste.  Eksempel: &#x60;0.37@319531,0.83-0.97@41640&#x60;
     * @param veglenketype Filtrer vegobjekter på veglenketype på vegnettet objektet er stedfestet. Kommaseparert liste.
     * @param detaljniva Filtrer vegobjekter på detaljnivå på vegnettet objektet er stedfestet på (kortnavn fra datakatalogen).
     * @param endretEtter Finner statistikk for vegobjekter som har blitt endret etter dette tidspunktet. Eksmepel: 2024-12-02T10:15:30
     * @param tidspunkt Finner statistikk for vegobjekter som var gyldige denne datoen.
     * @param egenskap Filtrer vegobjekter på egenskaper, relasjoner og overlapp. Se [dokumentasjon](https://nvdb.atlas.vegvesen.no/docs/produkter/nvdbapil/v4/introduksjon/Avanserte_filter)
     * @param overlapp Filtrer vegobjekter på overlapp. Se [dokumentasjon](https://nvdb.atlas.vegvesen.no/docs/produkter/nvdbapil/v4/introduksjon/Avanserte_filter)
     * @return VegobjekterStatistikk
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<VegobjekterStatistikk> getVegobjekterStatistikk(@jakarta.annotation.Nonnull Integer vegobjekttypeid, @jakarta.annotation.Nullable String srid, @jakarta.annotation.Nullable Boolean segmentering, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable Set<String> riksvegrute, @jakarta.annotation.Nullable Set<String> vegforvalter, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable String kartutsnitt, @jakarta.annotation.Nullable String polygon, @jakarta.annotation.Nullable Set<String> typeveg, @jakarta.annotation.Nullable Set<String> adskiltelop, @jakarta.annotation.Nullable Boolean kryssystem, @jakarta.annotation.Nullable Boolean sideanlegg, @jakarta.annotation.Nullable String trafikantgruppe, @jakarta.annotation.Nullable List<String> inkluder, @jakarta.annotation.Nullable Set<String> veglenkesekvens, @jakarta.annotation.Nullable Set<String> veglenketype, @jakarta.annotation.Nullable Set<String> detaljniva, @jakarta.annotation.Nullable OffsetDateTime endretEtter, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable List<String> egenskap, @jakarta.annotation.Nullable List<String> overlapp) throws WebClientResponseException {
        ParameterizedTypeReference<VegobjekterStatistikk> localVarReturnType = new ParameterizedTypeReference<VegobjekterStatistikk>() {};
        return getVegobjekterStatistikkRequestCreation(vegobjekttypeid, srid, segmentering, fylke, kommune, kontraktsomrade, riksvegrute, vegforvalter, vegsystemreferanse, kartutsnitt, polygon, typeveg, adskiltelop, kryssystem, sideanlegg, trafikantgruppe, inkluder, veglenkesekvens, veglenketype, detaljniva, endretEtter, tidspunkt, egenskap, overlapp).bodyToMono(localVarReturnType);
    }

    /**
     * Hent statistikk for en vegobjekttype
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param vegobjekttypeid Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.  Eksempel: 581         
     * @param srid Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param segmentering Angir om lengde skal inkludere bare deler av vegnettet som er innenfor søkeparametre tilknyttet segmentering (fylke, kommune, vegsystemreferanse, kontraktsområde, riksvegrute, vegforvalter).  Default: &#x60;false&#x60;
     * @param fylke Filtrer på fylke. Kommaseparert liste. Se /omrader/fylker for mulige verdier.  Eksempel: &#x60;50&#x60;
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se /omrader/kommuner for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @param kontraktsomrade Filtrer på kontraktsomrade. Kommaseparert liste. Se /omrader/kontraktsomrader for mulige verdier.  Eksempel: &#x60;9503 Midtre Hålogaland 2021-2026&#x60;
     * @param riksvegrute Filtrer på riksvegrute. Kommaseparert liste. Se /omrader/riksvegruter for mulige verdier.  Eksempel: &#x60;RUTE4A&#x60; eller som enumid &#x60;20290&#x60;
     * @param vegforvalter Filtrer på vegforvalter. Kommaseparert liste. Se [/omrader/api/v4/vegforvaltere](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;Møre og Romsdal fylkeskommune&#x60; eller som enumid &#x60;21774&#x60;
     * @param vegsystemreferanse Filtrer vegobjekter på [vegsystemreferanse](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1 m12&#x60;
     * @param kartutsnitt Filtrer vegobjekter med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;. Merk at vegobjektets bounding box benyttes for sammenligning, som kan medføre at vegobjekter som er utenfor kartutsnittet også returneres. For å unngå dette, kan du bruke &#x60;polygon&#x60; i stedet.  Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60;
     * @param polygon Filtrer vegobjekter med polygon i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Merk: For statistikk-spørringer vil polygonets bounding box benyttes, ikke polygonet selv.  Eksempel: &#x60;20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000&#x60;
     * @param typeveg Filtrer Relasjonstype.vegobjekter på type veg på vegnettet objektet er stedfestet på. Kommaseparert liste.  Eksempel: &#x60;kanalisertVeg, enkelBilveg, rampe, rundkjøring, bilferje, passasjerferje, gangOgSykkelveg, sykkelveg, gangveg, gågate, fortau, trapp, gangfelt, gatetun, traktorveg, sti, annet&#x60;
     * @param adskiltelop Filtrer vegobjekter på om de er stedfestet hvor det er en Strekning med verdi satt for «adskilte løp».
     * @param kryssystem Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Kryssystem.
     * @param sideanlegg Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Sideanlegg.
     * @param trafikantgruppe Filtrer vegobjekter på trafikantgruppe.
     * @param inkluder Kommaseparert liste av statistikkfelt som skal inkluderes i resultatet.
     * @param veglenkesekvens Filtrer vegobjekter på om de er stedfestet på gjeldende veglenkesekvenser. Kommaseparert liste.  Eksempel: &#x60;0.37@319531,0.83-0.97@41640&#x60;
     * @param veglenketype Filtrer vegobjekter på veglenketype på vegnettet objektet er stedfestet. Kommaseparert liste.
     * @param detaljniva Filtrer vegobjekter på detaljnivå på vegnettet objektet er stedfestet på (kortnavn fra datakatalogen).
     * @param endretEtter Finner statistikk for vegobjekter som har blitt endret etter dette tidspunktet. Eksmepel: 2024-12-02T10:15:30
     * @param tidspunkt Finner statistikk for vegobjekter som var gyldige denne datoen.
     * @param egenskap Filtrer vegobjekter på egenskaper, relasjoner og overlapp. Se [dokumentasjon](https://nvdb.atlas.vegvesen.no/docs/produkter/nvdbapil/v4/introduksjon/Avanserte_filter)
     * @param overlapp Filtrer vegobjekter på overlapp. Se [dokumentasjon](https://nvdb.atlas.vegvesen.no/docs/produkter/nvdbapil/v4/introduksjon/Avanserte_filter)
     * @return ResponseEntity&lt;VegobjekterStatistikk&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<VegobjekterStatistikk>> getVegobjekterStatistikkWithHttpInfo(@jakarta.annotation.Nonnull Integer vegobjekttypeid, @jakarta.annotation.Nullable String srid, @jakarta.annotation.Nullable Boolean segmentering, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable Set<String> riksvegrute, @jakarta.annotation.Nullable Set<String> vegforvalter, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable String kartutsnitt, @jakarta.annotation.Nullable String polygon, @jakarta.annotation.Nullable Set<String> typeveg, @jakarta.annotation.Nullable Set<String> adskiltelop, @jakarta.annotation.Nullable Boolean kryssystem, @jakarta.annotation.Nullable Boolean sideanlegg, @jakarta.annotation.Nullable String trafikantgruppe, @jakarta.annotation.Nullable List<String> inkluder, @jakarta.annotation.Nullable Set<String> veglenkesekvens, @jakarta.annotation.Nullable Set<String> veglenketype, @jakarta.annotation.Nullable Set<String> detaljniva, @jakarta.annotation.Nullable OffsetDateTime endretEtter, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable List<String> egenskap, @jakarta.annotation.Nullable List<String> overlapp) throws WebClientResponseException {
        ParameterizedTypeReference<VegobjekterStatistikk> localVarReturnType = new ParameterizedTypeReference<VegobjekterStatistikk>() {};
        return getVegobjekterStatistikkRequestCreation(vegobjekttypeid, srid, segmentering, fylke, kommune, kontraktsomrade, riksvegrute, vegforvalter, vegsystemreferanse, kartutsnitt, polygon, typeveg, adskiltelop, kryssystem, sideanlegg, trafikantgruppe, inkluder, veglenkesekvens, veglenketype, detaljniva, endretEtter, tidspunkt, egenskap, overlapp).toEntity(localVarReturnType);
    }

    /**
     * Hent statistikk for en vegobjekttype
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param vegobjekttypeid Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.  Eksempel: 581         
     * @param srid Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param segmentering Angir om lengde skal inkludere bare deler av vegnettet som er innenfor søkeparametre tilknyttet segmentering (fylke, kommune, vegsystemreferanse, kontraktsområde, riksvegrute, vegforvalter).  Default: &#x60;false&#x60;
     * @param fylke Filtrer på fylke. Kommaseparert liste. Se /omrader/fylker for mulige verdier.  Eksempel: &#x60;50&#x60;
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se /omrader/kommuner for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @param kontraktsomrade Filtrer på kontraktsomrade. Kommaseparert liste. Se /omrader/kontraktsomrader for mulige verdier.  Eksempel: &#x60;9503 Midtre Hålogaland 2021-2026&#x60;
     * @param riksvegrute Filtrer på riksvegrute. Kommaseparert liste. Se /omrader/riksvegruter for mulige verdier.  Eksempel: &#x60;RUTE4A&#x60; eller som enumid &#x60;20290&#x60;
     * @param vegforvalter Filtrer på vegforvalter. Kommaseparert liste. Se [/omrader/api/v4/vegforvaltere](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;Møre og Romsdal fylkeskommune&#x60; eller som enumid &#x60;21774&#x60;
     * @param vegsystemreferanse Filtrer vegobjekter på [vegsystemreferanse](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1 m12&#x60;
     * @param kartutsnitt Filtrer vegobjekter med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;. Merk at vegobjektets bounding box benyttes for sammenligning, som kan medføre at vegobjekter som er utenfor kartutsnittet også returneres. For å unngå dette, kan du bruke &#x60;polygon&#x60; i stedet.  Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60;
     * @param polygon Filtrer vegobjekter med polygon i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Merk: For statistikk-spørringer vil polygonets bounding box benyttes, ikke polygonet selv.  Eksempel: &#x60;20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000&#x60;
     * @param typeveg Filtrer Relasjonstype.vegobjekter på type veg på vegnettet objektet er stedfestet på. Kommaseparert liste.  Eksempel: &#x60;kanalisertVeg, enkelBilveg, rampe, rundkjøring, bilferje, passasjerferje, gangOgSykkelveg, sykkelveg, gangveg, gågate, fortau, trapp, gangfelt, gatetun, traktorveg, sti, annet&#x60;
     * @param adskiltelop Filtrer vegobjekter på om de er stedfestet hvor det er en Strekning med verdi satt for «adskilte løp».
     * @param kryssystem Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Kryssystem.
     * @param sideanlegg Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Sideanlegg.
     * @param trafikantgruppe Filtrer vegobjekter på trafikantgruppe.
     * @param inkluder Kommaseparert liste av statistikkfelt som skal inkluderes i resultatet.
     * @param veglenkesekvens Filtrer vegobjekter på om de er stedfestet på gjeldende veglenkesekvenser. Kommaseparert liste.  Eksempel: &#x60;0.37@319531,0.83-0.97@41640&#x60;
     * @param veglenketype Filtrer vegobjekter på veglenketype på vegnettet objektet er stedfestet. Kommaseparert liste.
     * @param detaljniva Filtrer vegobjekter på detaljnivå på vegnettet objektet er stedfestet på (kortnavn fra datakatalogen).
     * @param endretEtter Finner statistikk for vegobjekter som har blitt endret etter dette tidspunktet. Eksmepel: 2024-12-02T10:15:30
     * @param tidspunkt Finner statistikk for vegobjekter som var gyldige denne datoen.
     * @param egenskap Filtrer vegobjekter på egenskaper, relasjoner og overlapp. Se [dokumentasjon](https://nvdb.atlas.vegvesen.no/docs/produkter/nvdbapil/v4/introduksjon/Avanserte_filter)
     * @param overlapp Filtrer vegobjekter på overlapp. Se [dokumentasjon](https://nvdb.atlas.vegvesen.no/docs/produkter/nvdbapil/v4/introduksjon/Avanserte_filter)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getVegobjekterStatistikkWithResponseSpec(@jakarta.annotation.Nonnull Integer vegobjekttypeid, @jakarta.annotation.Nullable String srid, @jakarta.annotation.Nullable Boolean segmentering, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable Set<String> riksvegrute, @jakarta.annotation.Nullable Set<String> vegforvalter, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable String kartutsnitt, @jakarta.annotation.Nullable String polygon, @jakarta.annotation.Nullable Set<String> typeveg, @jakarta.annotation.Nullable Set<String> adskiltelop, @jakarta.annotation.Nullable Boolean kryssystem, @jakarta.annotation.Nullable Boolean sideanlegg, @jakarta.annotation.Nullable String trafikantgruppe, @jakarta.annotation.Nullable List<String> inkluder, @jakarta.annotation.Nullable Set<String> veglenkesekvens, @jakarta.annotation.Nullable Set<String> veglenketype, @jakarta.annotation.Nullable Set<String> detaljniva, @jakarta.annotation.Nullable OffsetDateTime endretEtter, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable List<String> egenskap, @jakarta.annotation.Nullable List<String> overlapp) throws WebClientResponseException {
        return getVegobjekterStatistikkRequestCreation(vegobjekttypeid, srid, segmentering, fylke, kommune, kontraktsomrade, riksvegrute, vegforvalter, vegsystemreferanse, kartutsnitt, polygon, typeveg, adskiltelop, kryssystem, sideanlegg, trafikantgruppe, inkluder, veglenkesekvens, veglenketype, detaljniva, endretEtter, tidspunkt, egenskap, overlapp);
    }

    /**
     * Hent statistikk for en vegobjekttype, gruppert på ett eller flere felter
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param vegobjekttypeid The vegobjekttypeid parameter
     * @param gruppering Velg en eller flere felter som statistikken skal grupperes på.
     * @param srid Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param kartutsnitt Filtrer vegobjekter med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;. Merk at vegobjektets bounding box benyttes for sammenligning, som kan medføre at vegobjekter som er utenfor kartutsnittet også returneres. For å unngå dette, kan du bruke &#x60;polygon&#x60; i stedet.  Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60;
     * @param inkluder Kommaseparert liste av statistikkfelt som skal inkluderes i resultatet.
     * @param veglenkesekvens Filtrer vegobjekter på om de er stedfestet på gjeldende veglenkesekvenser. Kommaseparert liste.  Eksempel: &#x60;0.37@319531,0.83-0.97@41640&#x60;
     * @param tidspunkt Finner versjonen som var gyldig denne datoen.
     * @return List&lt;VegobjekterStatistikkGruppert&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getVegobjekterStatistikkGruppertRequestCreation(@jakarta.annotation.Nonnull Integer vegobjekttypeid, @jakarta.annotation.Nonnull Set<String> gruppering, @jakarta.annotation.Nullable String srid, @jakarta.annotation.Nullable String kartutsnitt, @jakarta.annotation.Nullable Set<String> inkluder, @jakarta.annotation.Nullable Set<String> veglenkesekvens, @jakarta.annotation.Nullable LocalDate tidspunkt) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'vegobjekttypeid' is set
        if (vegobjekttypeid == null) {
            throw new WebClientResponseException("Missing the required parameter 'vegobjekttypeid' when calling getVegobjekterStatistikkGruppert", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'gruppering' is set
        if (gruppering == null) {
            throw new WebClientResponseException("Missing the required parameter 'gruppering' when calling getVegobjekterStatistikkGruppert", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("vegobjekttypeid", vegobjekttypeid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "srid", srid));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "kartutsnitt", kartutsnitt));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "gruppering", gruppering));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "inkluder", inkluder));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "veglenkesekvens", veglenkesekvens));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tidspunkt", tidspunkt));
        
        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<VegobjekterStatistikkGruppert> localVarReturnType = new ParameterizedTypeReference<VegobjekterStatistikkGruppert>() {};
        return apiClient.invokeAPI("/api/v4/vegobjekter/{vegobjekttypeid}/statistikk/gruppert", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Hent statistikk for en vegobjekttype, gruppert på ett eller flere felter
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param vegobjekttypeid The vegobjekttypeid parameter
     * @param gruppering Velg en eller flere felter som statistikken skal grupperes på.
     * @param srid Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param kartutsnitt Filtrer vegobjekter med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;. Merk at vegobjektets bounding box benyttes for sammenligning, som kan medføre at vegobjekter som er utenfor kartutsnittet også returneres. For å unngå dette, kan du bruke &#x60;polygon&#x60; i stedet.  Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60;
     * @param inkluder Kommaseparert liste av statistikkfelt som skal inkluderes i resultatet.
     * @param veglenkesekvens Filtrer vegobjekter på om de er stedfestet på gjeldende veglenkesekvenser. Kommaseparert liste.  Eksempel: &#x60;0.37@319531,0.83-0.97@41640&#x60;
     * @param tidspunkt Finner versjonen som var gyldig denne datoen.
     * @return List&lt;VegobjekterStatistikkGruppert&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<VegobjekterStatistikkGruppert> getVegobjekterStatistikkGruppert(@jakarta.annotation.Nonnull Integer vegobjekttypeid, @jakarta.annotation.Nonnull Set<String> gruppering, @jakarta.annotation.Nullable String srid, @jakarta.annotation.Nullable String kartutsnitt, @jakarta.annotation.Nullable Set<String> inkluder, @jakarta.annotation.Nullable Set<String> veglenkesekvens, @jakarta.annotation.Nullable LocalDate tidspunkt) throws WebClientResponseException {
        ParameterizedTypeReference<VegobjekterStatistikkGruppert> localVarReturnType = new ParameterizedTypeReference<VegobjekterStatistikkGruppert>() {};
        return getVegobjekterStatistikkGruppertRequestCreation(vegobjekttypeid, gruppering, srid, kartutsnitt, inkluder, veglenkesekvens, tidspunkt).bodyToFlux(localVarReturnType);
    }

    /**
     * Hent statistikk for en vegobjekttype, gruppert på ett eller flere felter
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param vegobjekttypeid The vegobjekttypeid parameter
     * @param gruppering Velg en eller flere felter som statistikken skal grupperes på.
     * @param srid Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param kartutsnitt Filtrer vegobjekter med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;. Merk at vegobjektets bounding box benyttes for sammenligning, som kan medføre at vegobjekter som er utenfor kartutsnittet også returneres. For å unngå dette, kan du bruke &#x60;polygon&#x60; i stedet.  Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60;
     * @param inkluder Kommaseparert liste av statistikkfelt som skal inkluderes i resultatet.
     * @param veglenkesekvens Filtrer vegobjekter på om de er stedfestet på gjeldende veglenkesekvenser. Kommaseparert liste.  Eksempel: &#x60;0.37@319531,0.83-0.97@41640&#x60;
     * @param tidspunkt Finner versjonen som var gyldig denne datoen.
     * @return ResponseEntity&lt;List&lt;VegobjekterStatistikkGruppert&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<VegobjekterStatistikkGruppert>>> getVegobjekterStatistikkGruppertWithHttpInfo(@jakarta.annotation.Nonnull Integer vegobjekttypeid, @jakarta.annotation.Nonnull Set<String> gruppering, @jakarta.annotation.Nullable String srid, @jakarta.annotation.Nullable String kartutsnitt, @jakarta.annotation.Nullable Set<String> inkluder, @jakarta.annotation.Nullable Set<String> veglenkesekvens, @jakarta.annotation.Nullable LocalDate tidspunkt) throws WebClientResponseException {
        ParameterizedTypeReference<VegobjekterStatistikkGruppert> localVarReturnType = new ParameterizedTypeReference<VegobjekterStatistikkGruppert>() {};
        return getVegobjekterStatistikkGruppertRequestCreation(vegobjekttypeid, gruppering, srid, kartutsnitt, inkluder, veglenkesekvens, tidspunkt).toEntityList(localVarReturnType);
    }

    /**
     * Hent statistikk for en vegobjekttype, gruppert på ett eller flere felter
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param vegobjekttypeid The vegobjekttypeid parameter
     * @param gruppering Velg en eller flere felter som statistikken skal grupperes på.
     * @param srid Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param kartutsnitt Filtrer vegobjekter med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;. Merk at vegobjektets bounding box benyttes for sammenligning, som kan medføre at vegobjekter som er utenfor kartutsnittet også returneres. For å unngå dette, kan du bruke &#x60;polygon&#x60; i stedet.  Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60;
     * @param inkluder Kommaseparert liste av statistikkfelt som skal inkluderes i resultatet.
     * @param veglenkesekvens Filtrer vegobjekter på om de er stedfestet på gjeldende veglenkesekvenser. Kommaseparert liste.  Eksempel: &#x60;0.37@319531,0.83-0.97@41640&#x60;
     * @param tidspunkt Finner versjonen som var gyldig denne datoen.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getVegobjekterStatistikkGruppertWithResponseSpec(@jakarta.annotation.Nonnull Integer vegobjekttypeid, @jakarta.annotation.Nonnull Set<String> gruppering, @jakarta.annotation.Nullable String srid, @jakarta.annotation.Nullable String kartutsnitt, @jakarta.annotation.Nullable Set<String> inkluder, @jakarta.annotation.Nullable Set<String> veglenkesekvens, @jakarta.annotation.Nullable LocalDate tidspunkt) throws WebClientResponseException {
        return getVegobjekterStatistikkGruppertRequestCreation(vegobjekttypeid, gruppering, srid, kartutsnitt, inkluder, veglenkesekvens, tidspunkt);
    }

    /**
     * Hent overordnet statistikk for alle vegobjekttyper
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param inkluder Kommaseparert liste av statistikkfelt som skal inkluderes i resultatet.
     * @param kontraktsomrade Filtrer på kontraktsomrade. Kommaseparert liste. Se /omrader/kontraktsomrader for mulige verdier.  Eksempel: &#x60;9503 Midtre Hålogaland 2021-2026&#x60;
     * @param tidspunkt Finner versjonen som var gyldig denne datoen.
     * @return List&lt;VegobjekterStatistikkMedType&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getVegobjekterStatistikkMedTyperRequestCreation(@jakarta.annotation.Nullable List<String> inkluder, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable LocalDate tidspunkt) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "inkluder", inkluder));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "kontraktsomrade", kontraktsomrade));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tidspunkt", tidspunkt));
        
        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<VegobjekterStatistikkMedType> localVarReturnType = new ParameterizedTypeReference<VegobjekterStatistikkMedType>() {};
        return apiClient.invokeAPI("/api/v4/vegobjekter/statistikk", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Hent overordnet statistikk for alle vegobjekttyper
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param inkluder Kommaseparert liste av statistikkfelt som skal inkluderes i resultatet.
     * @param kontraktsomrade Filtrer på kontraktsomrade. Kommaseparert liste. Se /omrader/kontraktsomrader for mulige verdier.  Eksempel: &#x60;9503 Midtre Hålogaland 2021-2026&#x60;
     * @param tidspunkt Finner versjonen som var gyldig denne datoen.
     * @return List&lt;VegobjekterStatistikkMedType&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<VegobjekterStatistikkMedType> getVegobjekterStatistikkMedTyper(@jakarta.annotation.Nullable List<String> inkluder, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable LocalDate tidspunkt) throws WebClientResponseException {
        ParameterizedTypeReference<VegobjekterStatistikkMedType> localVarReturnType = new ParameterizedTypeReference<VegobjekterStatistikkMedType>() {};
        return getVegobjekterStatistikkMedTyperRequestCreation(inkluder, kontraktsomrade, tidspunkt).bodyToFlux(localVarReturnType);
    }

    /**
     * Hent overordnet statistikk for alle vegobjekttyper
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param inkluder Kommaseparert liste av statistikkfelt som skal inkluderes i resultatet.
     * @param kontraktsomrade Filtrer på kontraktsomrade. Kommaseparert liste. Se /omrader/kontraktsomrader for mulige verdier.  Eksempel: &#x60;9503 Midtre Hålogaland 2021-2026&#x60;
     * @param tidspunkt Finner versjonen som var gyldig denne datoen.
     * @return ResponseEntity&lt;List&lt;VegobjekterStatistikkMedType&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<VegobjekterStatistikkMedType>>> getVegobjekterStatistikkMedTyperWithHttpInfo(@jakarta.annotation.Nullable List<String> inkluder, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable LocalDate tidspunkt) throws WebClientResponseException {
        ParameterizedTypeReference<VegobjekterStatistikkMedType> localVarReturnType = new ParameterizedTypeReference<VegobjekterStatistikkMedType>() {};
        return getVegobjekterStatistikkMedTyperRequestCreation(inkluder, kontraktsomrade, tidspunkt).toEntityList(localVarReturnType);
    }

    /**
     * Hent overordnet statistikk for alle vegobjekttyper
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param inkluder Kommaseparert liste av statistikkfelt som skal inkluderes i resultatet.
     * @param kontraktsomrade Filtrer på kontraktsomrade. Kommaseparert liste. Se /omrader/kontraktsomrader for mulige verdier.  Eksempel: &#x60;9503 Midtre Hålogaland 2021-2026&#x60;
     * @param tidspunkt Finner versjonen som var gyldig denne datoen.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getVegobjekterStatistikkMedTyperWithResponseSpec(@jakarta.annotation.Nullable List<String> inkluder, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable LocalDate tidspunkt) throws WebClientResponseException {
        return getVegobjekterStatistikkMedTyperRequestCreation(inkluder, kontraktsomrade, tidspunkt);
    }
}

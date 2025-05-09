package no.vegvesen.vt.nvdb.vegnett.api;

import no.vegvesen.vt.nvdb.vegnett.infrastructure.ApiClient;

import no.vegvesen.vt.nvdb.vegnett.model.AlwaysIncludeMapStringPosisjon;
import java.time.LocalDate;
import no.vegvesen.vt.nvdb.vegnett.model.Posisjon;
import no.vegvesen.vt.nvdb.vegnett.model.PosisjonMedAvstand;
import no.vegvesen.vt.nvdb.vegnett.model.ProblemDetail;
import java.util.Set;

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
public class PosisjonApi {
    private ApiClient apiClient;

    public PosisjonApi() {
        this(new ApiClient());
    }

    @Autowired
    public PosisjonApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Finn nærmeste posisjon på vegnettet for gitte koordinater. Koordinater kan angis som &#x60;nord&#x60; og &#x60;ost&#x60; eller &#x60;lat&#x60; og &#x60;lon&#x60;.
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param nord Nordlig koordinat
     * @param ost Østlig koordinat
     * @param lat Breddegrad
     * @param lon Lengdegrad
     * @param maksAvstand Angir søkeavstand i meter
     * @param maksAntall Angir maks antall treff
     * @param konnekteringslenker Angir om det skal returneres treff på konnekteringslenker
     * @param detaljerteLenker Angir om det skal returneres treff på detaljerte lenker
     * @param tidspunkt Begrens spørring til det gitte tidspunktet.
     * @param vegsystemreferanse Filtrer på [vegsystemreferanse](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1 m12&#x60;
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param trafikantgruppe Filtrer på trafikantgruppe.
     * @return List&lt;PosisjonMedAvstand&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec findPosisjonRequestCreation(@jakarta.annotation.Nullable Double nord, @jakarta.annotation.Nullable Double ost, @jakarta.annotation.Nullable Double lat, @jakarta.annotation.Nullable Double lon, @jakarta.annotation.Nullable Integer maksAvstand, @jakarta.annotation.Nullable Integer maksAntall, @jakarta.annotation.Nullable Boolean konnekteringslenker, @jakarta.annotation.Nullable Boolean detaljerteLenker, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable String srid, @jakarta.annotation.Nullable String trafikantgruppe) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nord", nord));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "ost", ost));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lat", lat));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lon", lon));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maks_avstand", maksAvstand));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maks_antall", maksAntall));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "konnekteringslenker", konnekteringslenker));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "detaljerte_lenker", detaljerteLenker));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tidspunkt", tidspunkt));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "vegsystemreferanse", vegsystemreferanse));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "srid", srid));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "trafikantgruppe", trafikantgruppe));
        
        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<PosisjonMedAvstand> localVarReturnType = new ParameterizedTypeReference<PosisjonMedAvstand>() {};
        return apiClient.invokeAPI("/api/v4/posisjon", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Finn nærmeste posisjon på vegnettet for gitte koordinater. Koordinater kan angis som &#x60;nord&#x60; og &#x60;ost&#x60; eller &#x60;lat&#x60; og &#x60;lon&#x60;.
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param nord Nordlig koordinat
     * @param ost Østlig koordinat
     * @param lat Breddegrad
     * @param lon Lengdegrad
     * @param maksAvstand Angir søkeavstand i meter
     * @param maksAntall Angir maks antall treff
     * @param konnekteringslenker Angir om det skal returneres treff på konnekteringslenker
     * @param detaljerteLenker Angir om det skal returneres treff på detaljerte lenker
     * @param tidspunkt Begrens spørring til det gitte tidspunktet.
     * @param vegsystemreferanse Filtrer på [vegsystemreferanse](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1 m12&#x60;
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param trafikantgruppe Filtrer på trafikantgruppe.
     * @return List&lt;PosisjonMedAvstand&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<PosisjonMedAvstand> findPosisjon(@jakarta.annotation.Nullable Double nord, @jakarta.annotation.Nullable Double ost, @jakarta.annotation.Nullable Double lat, @jakarta.annotation.Nullable Double lon, @jakarta.annotation.Nullable Integer maksAvstand, @jakarta.annotation.Nullable Integer maksAntall, @jakarta.annotation.Nullable Boolean konnekteringslenker, @jakarta.annotation.Nullable Boolean detaljerteLenker, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable String srid, @jakarta.annotation.Nullable String trafikantgruppe) throws WebClientResponseException {
        ParameterizedTypeReference<PosisjonMedAvstand> localVarReturnType = new ParameterizedTypeReference<PosisjonMedAvstand>() {};
        return findPosisjonRequestCreation(nord, ost, lat, lon, maksAvstand, maksAntall, konnekteringslenker, detaljerteLenker, tidspunkt, vegsystemreferanse, srid, trafikantgruppe).bodyToFlux(localVarReturnType);
    }

    /**
     * Finn nærmeste posisjon på vegnettet for gitte koordinater. Koordinater kan angis som &#x60;nord&#x60; og &#x60;ost&#x60; eller &#x60;lat&#x60; og &#x60;lon&#x60;.
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param nord Nordlig koordinat
     * @param ost Østlig koordinat
     * @param lat Breddegrad
     * @param lon Lengdegrad
     * @param maksAvstand Angir søkeavstand i meter
     * @param maksAntall Angir maks antall treff
     * @param konnekteringslenker Angir om det skal returneres treff på konnekteringslenker
     * @param detaljerteLenker Angir om det skal returneres treff på detaljerte lenker
     * @param tidspunkt Begrens spørring til det gitte tidspunktet.
     * @param vegsystemreferanse Filtrer på [vegsystemreferanse](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1 m12&#x60;
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param trafikantgruppe Filtrer på trafikantgruppe.
     * @return ResponseEntity&lt;List&lt;PosisjonMedAvstand&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<PosisjonMedAvstand>>> findPosisjonWithHttpInfo(@jakarta.annotation.Nullable Double nord, @jakarta.annotation.Nullable Double ost, @jakarta.annotation.Nullable Double lat, @jakarta.annotation.Nullable Double lon, @jakarta.annotation.Nullable Integer maksAvstand, @jakarta.annotation.Nullable Integer maksAntall, @jakarta.annotation.Nullable Boolean konnekteringslenker, @jakarta.annotation.Nullable Boolean detaljerteLenker, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable String srid, @jakarta.annotation.Nullable String trafikantgruppe) throws WebClientResponseException {
        ParameterizedTypeReference<PosisjonMedAvstand> localVarReturnType = new ParameterizedTypeReference<PosisjonMedAvstand>() {};
        return findPosisjonRequestCreation(nord, ost, lat, lon, maksAvstand, maksAntall, konnekteringslenker, detaljerteLenker, tidspunkt, vegsystemreferanse, srid, trafikantgruppe).toEntityList(localVarReturnType);
    }

    /**
     * Finn nærmeste posisjon på vegnettet for gitte koordinater. Koordinater kan angis som &#x60;nord&#x60; og &#x60;ost&#x60; eller &#x60;lat&#x60; og &#x60;lon&#x60;.
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param nord Nordlig koordinat
     * @param ost Østlig koordinat
     * @param lat Breddegrad
     * @param lon Lengdegrad
     * @param maksAvstand Angir søkeavstand i meter
     * @param maksAntall Angir maks antall treff
     * @param konnekteringslenker Angir om det skal returneres treff på konnekteringslenker
     * @param detaljerteLenker Angir om det skal returneres treff på detaljerte lenker
     * @param tidspunkt Begrens spørring til det gitte tidspunktet.
     * @param vegsystemreferanse Filtrer på [vegsystemreferanse](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1 m12&#x60;
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param trafikantgruppe Filtrer på trafikantgruppe.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec findPosisjonWithResponseSpec(@jakarta.annotation.Nullable Double nord, @jakarta.annotation.Nullable Double ost, @jakarta.annotation.Nullable Double lat, @jakarta.annotation.Nullable Double lon, @jakarta.annotation.Nullable Integer maksAvstand, @jakarta.annotation.Nullable Integer maksAntall, @jakarta.annotation.Nullable Boolean konnekteringslenker, @jakarta.annotation.Nullable Boolean detaljerteLenker, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable String srid, @jakarta.annotation.Nullable String trafikantgruppe) throws WebClientResponseException {
        return findPosisjonRequestCreation(nord, ost, lat, lon, maksAvstand, maksAntall, konnekteringslenker, detaljerteLenker, tidspunkt, vegsystemreferanse, srid, trafikantgruppe);
    }

    /**
     * Slå opp posisjon på veglenkesekvens eller vegsystemreferanse
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param vegsystemreferanse Finn posisjon for [vegsystemreferanse](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Må inneholde én enkelt meterverdi. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1m341&#x60;
     * @param veglenkesekvens Finn posisjon på veglenkesekvens. Format: &#x60;posisjon@veglenkesekvensid&#x60;.  Eksempel: &#x60;0.456@1226&#x60;
     * @param tidspunkt Begrens spørring til det gitte tidspunktet.
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @return Posisjon
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec findPosisjonForVegRequestCreation(@jakarta.annotation.Nullable String vegsystemreferanse, @jakarta.annotation.Nullable String veglenkesekvens, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable String srid, @jakarta.annotation.Nullable Set<Integer> kommune) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "vegsystemreferanse", vegsystemreferanse));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "veglenkesekvens", veglenkesekvens));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tidspunkt", tidspunkt));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "srid", srid));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "kommune", kommune));
        
        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Posisjon> localVarReturnType = new ParameterizedTypeReference<Posisjon>() {};
        return apiClient.invokeAPI("/api/v4/veg", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Slå opp posisjon på veglenkesekvens eller vegsystemreferanse
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param vegsystemreferanse Finn posisjon for [vegsystemreferanse](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Må inneholde én enkelt meterverdi. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1m341&#x60;
     * @param veglenkesekvens Finn posisjon på veglenkesekvens. Format: &#x60;posisjon@veglenkesekvensid&#x60;.  Eksempel: &#x60;0.456@1226&#x60;
     * @param tidspunkt Begrens spørring til det gitte tidspunktet.
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @return Posisjon
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Posisjon> findPosisjonForVeg(@jakarta.annotation.Nullable String vegsystemreferanse, @jakarta.annotation.Nullable String veglenkesekvens, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable String srid, @jakarta.annotation.Nullable Set<Integer> kommune) throws WebClientResponseException {
        ParameterizedTypeReference<Posisjon> localVarReturnType = new ParameterizedTypeReference<Posisjon>() {};
        return findPosisjonForVegRequestCreation(vegsystemreferanse, veglenkesekvens, tidspunkt, srid, kommune).bodyToMono(localVarReturnType);
    }

    /**
     * Slå opp posisjon på veglenkesekvens eller vegsystemreferanse
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param vegsystemreferanse Finn posisjon for [vegsystemreferanse](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Må inneholde én enkelt meterverdi. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1m341&#x60;
     * @param veglenkesekvens Finn posisjon på veglenkesekvens. Format: &#x60;posisjon@veglenkesekvensid&#x60;.  Eksempel: &#x60;0.456@1226&#x60;
     * @param tidspunkt Begrens spørring til det gitte tidspunktet.
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @return ResponseEntity&lt;Posisjon&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Posisjon>> findPosisjonForVegWithHttpInfo(@jakarta.annotation.Nullable String vegsystemreferanse, @jakarta.annotation.Nullable String veglenkesekvens, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable String srid, @jakarta.annotation.Nullable Set<Integer> kommune) throws WebClientResponseException {
        ParameterizedTypeReference<Posisjon> localVarReturnType = new ParameterizedTypeReference<Posisjon>() {};
        return findPosisjonForVegRequestCreation(vegsystemreferanse, veglenkesekvens, tidspunkt, srid, kommune).toEntity(localVarReturnType);
    }

    /**
     * Slå opp posisjon på veglenkesekvens eller vegsystemreferanse
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param vegsystemreferanse Finn posisjon for [vegsystemreferanse](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Må inneholde én enkelt meterverdi. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1m341&#x60;
     * @param veglenkesekvens Finn posisjon på veglenkesekvens. Format: &#x60;posisjon@veglenkesekvensid&#x60;.  Eksempel: &#x60;0.456@1226&#x60;
     * @param tidspunkt Begrens spørring til det gitte tidspunktet.
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec findPosisjonForVegWithResponseSpec(@jakarta.annotation.Nullable String vegsystemreferanse, @jakarta.annotation.Nullable String veglenkesekvens, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable String srid, @jakarta.annotation.Nullable Set<Integer> kommune) throws WebClientResponseException {
        return findPosisjonForVegRequestCreation(vegsystemreferanse, veglenkesekvens, tidspunkt, srid, kommune);
    }

    /**
     * Slå opp flere posisjoner på veglenkesekvens eller vegsystemreferanse
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param vegsystemreferanser Finn posisjoner for [vegsystemreferanser](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Må inneholde én enkelt meterverdi. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1m341&#x60;
     * @param veglenkesekvenser Finn posisjoner på veglenkesekvenser. Format: &#x60;posisjon@veglenkesekvensid&#x60;.  Eksempel: &#x60;0.456@1226&#x60;
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @return AlwaysIncludeMapStringPosisjon
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec findPosisjonerForVegRequestCreation(@jakarta.annotation.Nullable List<String> vegsystemreferanser, @jakarta.annotation.Nullable List<String> veglenkesekvenser, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable String srid) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "vegsystemreferanser", vegsystemreferanser));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "veglenkesekvenser", veglenkesekvenser));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "kommune", kommune));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "srid", srid));
        
        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<AlwaysIncludeMapStringPosisjon> localVarReturnType = new ParameterizedTypeReference<AlwaysIncludeMapStringPosisjon>() {};
        return apiClient.invokeAPI("/api/v4/veg/batch", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Slå opp flere posisjoner på veglenkesekvens eller vegsystemreferanse
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param vegsystemreferanser Finn posisjoner for [vegsystemreferanser](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Må inneholde én enkelt meterverdi. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1m341&#x60;
     * @param veglenkesekvenser Finn posisjoner på veglenkesekvenser. Format: &#x60;posisjon@veglenkesekvensid&#x60;.  Eksempel: &#x60;0.456@1226&#x60;
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @return AlwaysIncludeMapStringPosisjon
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<AlwaysIncludeMapStringPosisjon> findPosisjonerForVeg(@jakarta.annotation.Nullable List<String> vegsystemreferanser, @jakarta.annotation.Nullable List<String> veglenkesekvenser, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable String srid) throws WebClientResponseException {
        ParameterizedTypeReference<AlwaysIncludeMapStringPosisjon> localVarReturnType = new ParameterizedTypeReference<AlwaysIncludeMapStringPosisjon>() {};
        return findPosisjonerForVegRequestCreation(vegsystemreferanser, veglenkesekvenser, kommune, srid).bodyToMono(localVarReturnType);
    }

    /**
     * Slå opp flere posisjoner på veglenkesekvens eller vegsystemreferanse
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param vegsystemreferanser Finn posisjoner for [vegsystemreferanser](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Må inneholde én enkelt meterverdi. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1m341&#x60;
     * @param veglenkesekvenser Finn posisjoner på veglenkesekvenser. Format: &#x60;posisjon@veglenkesekvensid&#x60;.  Eksempel: &#x60;0.456@1226&#x60;
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @return ResponseEntity&lt;AlwaysIncludeMapStringPosisjon&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<AlwaysIncludeMapStringPosisjon>> findPosisjonerForVegWithHttpInfo(@jakarta.annotation.Nullable List<String> vegsystemreferanser, @jakarta.annotation.Nullable List<String> veglenkesekvenser, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable String srid) throws WebClientResponseException {
        ParameterizedTypeReference<AlwaysIncludeMapStringPosisjon> localVarReturnType = new ParameterizedTypeReference<AlwaysIncludeMapStringPosisjon>() {};
        return findPosisjonerForVegRequestCreation(vegsystemreferanser, veglenkesekvenser, kommune, srid).toEntity(localVarReturnType);
    }

    /**
     * Slå opp flere posisjoner på veglenkesekvens eller vegsystemreferanse
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param vegsystemreferanser Finn posisjoner for [vegsystemreferanser](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Må inneholde én enkelt meterverdi. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1m341&#x60;
     * @param veglenkesekvenser Finn posisjoner på veglenkesekvenser. Format: &#x60;posisjon@veglenkesekvensid&#x60;.  Eksempel: &#x60;0.456@1226&#x60;
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec findPosisjonerForVegWithResponseSpec(@jakarta.annotation.Nullable List<String> vegsystemreferanser, @jakarta.annotation.Nullable List<String> veglenkesekvenser, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable String srid) throws WebClientResponseException {
        return findPosisjonerForVegRequestCreation(vegsystemreferanser, veglenkesekvenser, kommune, srid);
    }
}

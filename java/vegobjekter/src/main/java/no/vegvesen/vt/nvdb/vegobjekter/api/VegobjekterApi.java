package no.vegvesen.vt.nvdb.vegobjekter.api;

import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.ApiClient;

import no.vegvesen.vt.nvdb.vegobjekter.model.AdskilteLop;
import no.vegvesen.vt.nvdb.vegobjekter.model.DetaljnivaParameter;
import no.vegvesen.vt.nvdb.vegobjekter.model.InkluderGeometri;
import no.vegvesen.vt.nvdb.vegobjekter.model.InkluderIEgenskaper;
import no.vegvesen.vt.nvdb.vegobjekter.model.InkluderIVegobjekt;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import no.vegvesen.vt.nvdb.vegobjekter.model.ProblemDetail;
import java.util.Set;
import no.vegvesen.vt.nvdb.vegobjekter.model.SridParameter;
import no.vegvesen.vt.nvdb.vegobjekter.model.Trafikantgruppe;
import no.vegvesen.vt.nvdb.vegobjekter.model.TypeVegSosi;
import no.vegvesen.vt.nvdb.vegobjekter.model.VeglenkeTypeParameter;
import no.vegvesen.vt.nvdb.vegobjekter.model.Vegobjekt;
import no.vegvesen.vt.nvdb.vegobjekter.model.VegobjektEndringerSide;
import no.vegvesen.vt.nvdb.vegobjekter.model.VegobjekterSide;

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
public class VegobjekterApi {
    private ApiClient apiClient;

    public VegobjekterApi() {
        this(new ApiClient());
    }

    @Autowired
    public VegobjekterApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Hent enkelt vegobjekt
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param id ID for vegobjekt som skal hentes.
     * @param inkluder Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID.
     * @param srid Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param inkludergeometri Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under &#x60;vegobjekt.egenskaper&#x60; om den finnes, stedfestet geometri er plassert under &#x60;vegobjekt.lokasjon&#x60;. I tillegg til de nevnte feltene på vegobjekt-responsen returneres også &#x60;vegobjekt.geometri&#x60; (dersom man har &#x60;inkluder&#x3D;geometri&#x60; eller &#x60;alle&#x60;), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved å se på &#x60;vegobjekt.geometri.egengeometri&#x60;.
     * @param inkluderEgenskaper Gir mulighet til å filtrere hvilke egenskaper som skal returneres med inkluder&#x3D;egenskaper. &#x60;basis&#x60; er alle egenskaper som ikke er geometri, eller lister av geometri.
     * @param dybde Hvor mange nivå barn skal inkluderes. 1 betyr bare IDer, 2-n betyr ett eller flere mellomnivåer, &#39;full&#39; betyr alle nivåer.
     * @param geometritoleranse Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.
     * @param tidspunkt Finner versjonen som var gyldig denne datoen.
     * @return Vegobjekt
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getVegobjektByIdRequestCreation(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable InkluderGeometri inkludergeometri, @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper, @jakarta.annotation.Nullable String dybde, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable LocalDate tidspunkt) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getVegobjektById", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "id", id));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "inkluder", inkluder));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "srid", srid));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "inkludergeometri", inkludergeometri));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "inkluder_egenskaper", inkluderEgenskaper));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "dybde", dybde));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "geometritoleranse", geometritoleranse));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tidspunkt", tidspunkt));
        
        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Vegobjekt> localVarReturnType = new ParameterizedTypeReference<Vegobjekt>() {};
        return apiClient.invokeAPI("/api/v4/vegobjekt", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Hent enkelt vegobjekt
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param id ID for vegobjekt som skal hentes.
     * @param inkluder Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID.
     * @param srid Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param inkludergeometri Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under &#x60;vegobjekt.egenskaper&#x60; om den finnes, stedfestet geometri er plassert under &#x60;vegobjekt.lokasjon&#x60;. I tillegg til de nevnte feltene på vegobjekt-responsen returneres også &#x60;vegobjekt.geometri&#x60; (dersom man har &#x60;inkluder&#x3D;geometri&#x60; eller &#x60;alle&#x60;), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved å se på &#x60;vegobjekt.geometri.egengeometri&#x60;.
     * @param inkluderEgenskaper Gir mulighet til å filtrere hvilke egenskaper som skal returneres med inkluder&#x3D;egenskaper. &#x60;basis&#x60; er alle egenskaper som ikke er geometri, eller lister av geometri.
     * @param dybde Hvor mange nivå barn skal inkluderes. 1 betyr bare IDer, 2-n betyr ett eller flere mellomnivåer, &#39;full&#39; betyr alle nivåer.
     * @param geometritoleranse Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.
     * @param tidspunkt Finner versjonen som var gyldig denne datoen.
     * @return Vegobjekt
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Vegobjekt> getVegobjektById(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable InkluderGeometri inkludergeometri, @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper, @jakarta.annotation.Nullable String dybde, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable LocalDate tidspunkt) throws WebClientResponseException {
        ParameterizedTypeReference<Vegobjekt> localVarReturnType = new ParameterizedTypeReference<Vegobjekt>() {};
        return getVegobjektByIdRequestCreation(id, inkluder, srid, inkludergeometri, inkluderEgenskaper, dybde, geometritoleranse, tidspunkt).bodyToMono(localVarReturnType);
    }

    /**
     * Hent enkelt vegobjekt
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param id ID for vegobjekt som skal hentes.
     * @param inkluder Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID.
     * @param srid Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param inkludergeometri Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under &#x60;vegobjekt.egenskaper&#x60; om den finnes, stedfestet geometri er plassert under &#x60;vegobjekt.lokasjon&#x60;. I tillegg til de nevnte feltene på vegobjekt-responsen returneres også &#x60;vegobjekt.geometri&#x60; (dersom man har &#x60;inkluder&#x3D;geometri&#x60; eller &#x60;alle&#x60;), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved å se på &#x60;vegobjekt.geometri.egengeometri&#x60;.
     * @param inkluderEgenskaper Gir mulighet til å filtrere hvilke egenskaper som skal returneres med inkluder&#x3D;egenskaper. &#x60;basis&#x60; er alle egenskaper som ikke er geometri, eller lister av geometri.
     * @param dybde Hvor mange nivå barn skal inkluderes. 1 betyr bare IDer, 2-n betyr ett eller flere mellomnivåer, &#39;full&#39; betyr alle nivåer.
     * @param geometritoleranse Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.
     * @param tidspunkt Finner versjonen som var gyldig denne datoen.
     * @return ResponseEntity&lt;Vegobjekt&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Vegobjekt>> getVegobjektByIdWithHttpInfo(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable InkluderGeometri inkludergeometri, @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper, @jakarta.annotation.Nullable String dybde, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable LocalDate tidspunkt) throws WebClientResponseException {
        ParameterizedTypeReference<Vegobjekt> localVarReturnType = new ParameterizedTypeReference<Vegobjekt>() {};
        return getVegobjektByIdRequestCreation(id, inkluder, srid, inkludergeometri, inkluderEgenskaper, dybde, geometritoleranse, tidspunkt).toEntity(localVarReturnType);
    }

    /**
     * Hent enkelt vegobjekt
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param id ID for vegobjekt som skal hentes.
     * @param inkluder Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID.
     * @param srid Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param inkludergeometri Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under &#x60;vegobjekt.egenskaper&#x60; om den finnes, stedfestet geometri er plassert under &#x60;vegobjekt.lokasjon&#x60;. I tillegg til de nevnte feltene på vegobjekt-responsen returneres også &#x60;vegobjekt.geometri&#x60; (dersom man har &#x60;inkluder&#x3D;geometri&#x60; eller &#x60;alle&#x60;), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved å se på &#x60;vegobjekt.geometri.egengeometri&#x60;.
     * @param inkluderEgenskaper Gir mulighet til å filtrere hvilke egenskaper som skal returneres med inkluder&#x3D;egenskaper. &#x60;basis&#x60; er alle egenskaper som ikke er geometri, eller lister av geometri.
     * @param dybde Hvor mange nivå barn skal inkluderes. 1 betyr bare IDer, 2-n betyr ett eller flere mellomnivåer, &#39;full&#39; betyr alle nivåer.
     * @param geometritoleranse Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.
     * @param tidspunkt Finner versjonen som var gyldig denne datoen.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getVegobjektByIdWithResponseSpec(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable InkluderGeometri inkludergeometri, @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper, @jakarta.annotation.Nullable String dybde, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable LocalDate tidspunkt) throws WebClientResponseException {
        return getVegobjektByIdRequestCreation(id, inkluder, srid, inkludergeometri, inkluderEgenskaper, dybde, geometritoleranse, tidspunkt);
    }

    /**
     * Hent gjeldende versjon av et vegobjekt
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param vegobjekttypeId Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.  Eksempel: 581         
     * @param vegobjektId The vegobjektId parameter
     * @param inkluder Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID.
     * @param srid Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param inkludergeometri Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under &#x60;vegobjekt.egenskaper&#x60; om den finnes, stedfestet geometri er plassert under &#x60;vegobjekt.lokasjon&#x60;. I tillegg til de nevnte feltene på vegobjekt-responsen returneres også &#x60;vegobjekt.geometri&#x60; (dersom man har &#x60;inkluder&#x3D;geometri&#x60; eller &#x60;alle&#x60;), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved å se på &#x60;vegobjekt.geometri.egengeometri&#x60;.
     * @param inkluderEgenskaper Gir mulighet til å filtrere hvilke egenskaper som skal returneres med inkluder&#x3D;egenskaper. &#x60;basis&#x60; er alle egenskaper som ikke er geometri, eller lister av geometri.
     * @param dybde Hvor mange nivå barn skal inkluderes. 1 betyr bare IDer, 2-n betyr ett eller flere mellomnivåer, &#39;full&#39; betyr alle nivåer.
     * @param geometritoleranse Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.
     * @param tidspunkt Finner versjonen som var gyldig denne datoen.
     * @return Vegobjekt
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getVegobjektByTypeAndIdRequestCreation(@jakarta.annotation.Nonnull Integer vegobjekttypeId, @jakarta.annotation.Nonnull Long vegobjektId, @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable InkluderGeometri inkludergeometri, @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper, @jakarta.annotation.Nullable String dybde, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable LocalDate tidspunkt) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'vegobjekttypeId' is set
        if (vegobjekttypeId == null) {
            throw new WebClientResponseException("Missing the required parameter 'vegobjekttypeId' when calling getVegobjektByTypeAndId", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'vegobjektId' is set
        if (vegobjektId == null) {
            throw new WebClientResponseException("Missing the required parameter 'vegobjektId' when calling getVegobjektByTypeAndId", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("vegobjekttypeId", vegobjekttypeId);
        pathParams.put("vegobjektId", vegobjektId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "inkluder", inkluder));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "srid", srid));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "inkludergeometri", inkludergeometri));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "inkluder_egenskaper", inkluderEgenskaper));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "dybde", dybde));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "geometritoleranse", geometritoleranse));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tidspunkt", tidspunkt));
        
        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Vegobjekt> localVarReturnType = new ParameterizedTypeReference<Vegobjekt>() {};
        return apiClient.invokeAPI("/api/v4/vegobjekter/{vegobjekttypeId}/{vegobjektId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Hent gjeldende versjon av et vegobjekt
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param vegobjekttypeId Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.  Eksempel: 581         
     * @param vegobjektId The vegobjektId parameter
     * @param inkluder Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID.
     * @param srid Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param inkludergeometri Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under &#x60;vegobjekt.egenskaper&#x60; om den finnes, stedfestet geometri er plassert under &#x60;vegobjekt.lokasjon&#x60;. I tillegg til de nevnte feltene på vegobjekt-responsen returneres også &#x60;vegobjekt.geometri&#x60; (dersom man har &#x60;inkluder&#x3D;geometri&#x60; eller &#x60;alle&#x60;), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved å se på &#x60;vegobjekt.geometri.egengeometri&#x60;.
     * @param inkluderEgenskaper Gir mulighet til å filtrere hvilke egenskaper som skal returneres med inkluder&#x3D;egenskaper. &#x60;basis&#x60; er alle egenskaper som ikke er geometri, eller lister av geometri.
     * @param dybde Hvor mange nivå barn skal inkluderes. 1 betyr bare IDer, 2-n betyr ett eller flere mellomnivåer, &#39;full&#39; betyr alle nivåer.
     * @param geometritoleranse Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.
     * @param tidspunkt Finner versjonen som var gyldig denne datoen.
     * @return Vegobjekt
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Vegobjekt> getVegobjektByTypeAndId(@jakarta.annotation.Nonnull Integer vegobjekttypeId, @jakarta.annotation.Nonnull Long vegobjektId, @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable InkluderGeometri inkludergeometri, @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper, @jakarta.annotation.Nullable String dybde, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable LocalDate tidspunkt) throws WebClientResponseException {
        ParameterizedTypeReference<Vegobjekt> localVarReturnType = new ParameterizedTypeReference<Vegobjekt>() {};
        return getVegobjektByTypeAndIdRequestCreation(vegobjekttypeId, vegobjektId, inkluder, srid, inkludergeometri, inkluderEgenskaper, dybde, geometritoleranse, tidspunkt).bodyToMono(localVarReturnType);
    }

    /**
     * Hent gjeldende versjon av et vegobjekt
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param vegobjekttypeId Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.  Eksempel: 581         
     * @param vegobjektId The vegobjektId parameter
     * @param inkluder Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID.
     * @param srid Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param inkludergeometri Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under &#x60;vegobjekt.egenskaper&#x60; om den finnes, stedfestet geometri er plassert under &#x60;vegobjekt.lokasjon&#x60;. I tillegg til de nevnte feltene på vegobjekt-responsen returneres også &#x60;vegobjekt.geometri&#x60; (dersom man har &#x60;inkluder&#x3D;geometri&#x60; eller &#x60;alle&#x60;), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved å se på &#x60;vegobjekt.geometri.egengeometri&#x60;.
     * @param inkluderEgenskaper Gir mulighet til å filtrere hvilke egenskaper som skal returneres med inkluder&#x3D;egenskaper. &#x60;basis&#x60; er alle egenskaper som ikke er geometri, eller lister av geometri.
     * @param dybde Hvor mange nivå barn skal inkluderes. 1 betyr bare IDer, 2-n betyr ett eller flere mellomnivåer, &#39;full&#39; betyr alle nivåer.
     * @param geometritoleranse Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.
     * @param tidspunkt Finner versjonen som var gyldig denne datoen.
     * @return ResponseEntity&lt;Vegobjekt&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Vegobjekt>> getVegobjektByTypeAndIdWithHttpInfo(@jakarta.annotation.Nonnull Integer vegobjekttypeId, @jakarta.annotation.Nonnull Long vegobjektId, @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable InkluderGeometri inkludergeometri, @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper, @jakarta.annotation.Nullable String dybde, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable LocalDate tidspunkt) throws WebClientResponseException {
        ParameterizedTypeReference<Vegobjekt> localVarReturnType = new ParameterizedTypeReference<Vegobjekt>() {};
        return getVegobjektByTypeAndIdRequestCreation(vegobjekttypeId, vegobjektId, inkluder, srid, inkludergeometri, inkluderEgenskaper, dybde, geometritoleranse, tidspunkt).toEntity(localVarReturnType);
    }

    /**
     * Hent gjeldende versjon av et vegobjekt
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param vegobjekttypeId Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.  Eksempel: 581         
     * @param vegobjektId The vegobjektId parameter
     * @param inkluder Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID.
     * @param srid Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param inkludergeometri Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under &#x60;vegobjekt.egenskaper&#x60; om den finnes, stedfestet geometri er plassert under &#x60;vegobjekt.lokasjon&#x60;. I tillegg til de nevnte feltene på vegobjekt-responsen returneres også &#x60;vegobjekt.geometri&#x60; (dersom man har &#x60;inkluder&#x3D;geometri&#x60; eller &#x60;alle&#x60;), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved å se på &#x60;vegobjekt.geometri.egengeometri&#x60;.
     * @param inkluderEgenskaper Gir mulighet til å filtrere hvilke egenskaper som skal returneres med inkluder&#x3D;egenskaper. &#x60;basis&#x60; er alle egenskaper som ikke er geometri, eller lister av geometri.
     * @param dybde Hvor mange nivå barn skal inkluderes. 1 betyr bare IDer, 2-n betyr ett eller flere mellomnivåer, &#39;full&#39; betyr alle nivåer.
     * @param geometritoleranse Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.
     * @param tidspunkt Finner versjonen som var gyldig denne datoen.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getVegobjektByTypeAndIdWithResponseSpec(@jakarta.annotation.Nonnull Integer vegobjekttypeId, @jakarta.annotation.Nonnull Long vegobjektId, @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable InkluderGeometri inkludergeometri, @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper, @jakarta.annotation.Nullable String dybde, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable LocalDate tidspunkt) throws WebClientResponseException {
        return getVegobjektByTypeAndIdRequestCreation(vegobjekttypeId, vegobjektId, inkluder, srid, inkludergeometri, inkluderEgenskaper, dybde, geometritoleranse, tidspunkt);
    }

    /**
     * Hent spesifikk versjon av et vegobjekt
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param vegobjekttypeId Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.  Eksempel: 581         
     * @param vegobjektId The vegobjektId parameter
     * @param versjon The versjon parameter
     * @param inkluder Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID.
     * @param srid Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param inkludergeometri Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under &#x60;vegobjekt.egenskaper&#x60; om den finnes, stedfestet geometri er plassert under &#x60;vegobjekt.lokasjon&#x60;. I tillegg til de nevnte feltene på vegobjekt-responsen returneres også &#x60;vegobjekt.geometri&#x60; (dersom man har &#x60;inkluder&#x3D;geometri&#x60; eller &#x60;alle&#x60;), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved å se på &#x60;vegobjekt.geometri.egengeometri&#x60;.
     * @param inkluderEgenskaper Gir mulighet til å filtrere hvilke egenskaper som skal returneres med inkluder&#x3D;egenskaper. &#x60;basis&#x60; er alle egenskaper som ikke er geometri, eller lister av geometri.
     * @param dybde Hvor mange nivå barn skal inkluderes. 1 betyr bare IDer, 2-n betyr ett eller flere mellomnivåer, &#39;full&#39; betyr alle nivåer.
     * @param geometritoleranse Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.
     * @param tidspunkt Finner versjonen som var gyldig denne datoen.
     * @return Vegobjekt
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getVegobjektByTypeIdAndVersjonRequestCreation(@jakarta.annotation.Nonnull Integer vegobjekttypeId, @jakarta.annotation.Nonnull Long vegobjektId, @jakarta.annotation.Nonnull Integer versjon, @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable InkluderGeometri inkludergeometri, @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper, @jakarta.annotation.Nullable String dybde, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable LocalDate tidspunkt) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'vegobjekttypeId' is set
        if (vegobjekttypeId == null) {
            throw new WebClientResponseException("Missing the required parameter 'vegobjekttypeId' when calling getVegobjektByTypeIdAndVersjon", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'vegobjektId' is set
        if (vegobjektId == null) {
            throw new WebClientResponseException("Missing the required parameter 'vegobjektId' when calling getVegobjektByTypeIdAndVersjon", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'versjon' is set
        if (versjon == null) {
            throw new WebClientResponseException("Missing the required parameter 'versjon' when calling getVegobjektByTypeIdAndVersjon", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("vegobjekttypeId", vegobjekttypeId);
        pathParams.put("vegobjektId", vegobjektId);
        pathParams.put("versjon", versjon);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "inkluder", inkluder));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "srid", srid));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "inkludergeometri", inkludergeometri));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "inkluder_egenskaper", inkluderEgenskaper));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "dybde", dybde));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "geometritoleranse", geometritoleranse));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tidspunkt", tidspunkt));
        
        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Vegobjekt> localVarReturnType = new ParameterizedTypeReference<Vegobjekt>() {};
        return apiClient.invokeAPI("/api/v4/vegobjekter/{vegobjekttypeId}/{vegobjektId}/{versjon}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Hent spesifikk versjon av et vegobjekt
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param vegobjekttypeId Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.  Eksempel: 581         
     * @param vegobjektId The vegobjektId parameter
     * @param versjon The versjon parameter
     * @param inkluder Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID.
     * @param srid Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param inkludergeometri Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under &#x60;vegobjekt.egenskaper&#x60; om den finnes, stedfestet geometri er plassert under &#x60;vegobjekt.lokasjon&#x60;. I tillegg til de nevnte feltene på vegobjekt-responsen returneres også &#x60;vegobjekt.geometri&#x60; (dersom man har &#x60;inkluder&#x3D;geometri&#x60; eller &#x60;alle&#x60;), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved å se på &#x60;vegobjekt.geometri.egengeometri&#x60;.
     * @param inkluderEgenskaper Gir mulighet til å filtrere hvilke egenskaper som skal returneres med inkluder&#x3D;egenskaper. &#x60;basis&#x60; er alle egenskaper som ikke er geometri, eller lister av geometri.
     * @param dybde Hvor mange nivå barn skal inkluderes. 1 betyr bare IDer, 2-n betyr ett eller flere mellomnivåer, &#39;full&#39; betyr alle nivåer.
     * @param geometritoleranse Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.
     * @param tidspunkt Finner versjonen som var gyldig denne datoen.
     * @return Vegobjekt
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Vegobjekt> getVegobjektByTypeIdAndVersjon(@jakarta.annotation.Nonnull Integer vegobjekttypeId, @jakarta.annotation.Nonnull Long vegobjektId, @jakarta.annotation.Nonnull Integer versjon, @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable InkluderGeometri inkludergeometri, @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper, @jakarta.annotation.Nullable String dybde, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable LocalDate tidspunkt) throws WebClientResponseException {
        ParameterizedTypeReference<Vegobjekt> localVarReturnType = new ParameterizedTypeReference<Vegobjekt>() {};
        return getVegobjektByTypeIdAndVersjonRequestCreation(vegobjekttypeId, vegobjektId, versjon, inkluder, srid, inkludergeometri, inkluderEgenskaper, dybde, geometritoleranse, tidspunkt).bodyToMono(localVarReturnType);
    }

    /**
     * Hent spesifikk versjon av et vegobjekt
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param vegobjekttypeId Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.  Eksempel: 581         
     * @param vegobjektId The vegobjektId parameter
     * @param versjon The versjon parameter
     * @param inkluder Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID.
     * @param srid Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param inkludergeometri Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under &#x60;vegobjekt.egenskaper&#x60; om den finnes, stedfestet geometri er plassert under &#x60;vegobjekt.lokasjon&#x60;. I tillegg til de nevnte feltene på vegobjekt-responsen returneres også &#x60;vegobjekt.geometri&#x60; (dersom man har &#x60;inkluder&#x3D;geometri&#x60; eller &#x60;alle&#x60;), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved å se på &#x60;vegobjekt.geometri.egengeometri&#x60;.
     * @param inkluderEgenskaper Gir mulighet til å filtrere hvilke egenskaper som skal returneres med inkluder&#x3D;egenskaper. &#x60;basis&#x60; er alle egenskaper som ikke er geometri, eller lister av geometri.
     * @param dybde Hvor mange nivå barn skal inkluderes. 1 betyr bare IDer, 2-n betyr ett eller flere mellomnivåer, &#39;full&#39; betyr alle nivåer.
     * @param geometritoleranse Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.
     * @param tidspunkt Finner versjonen som var gyldig denne datoen.
     * @return ResponseEntity&lt;Vegobjekt&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Vegobjekt>> getVegobjektByTypeIdAndVersjonWithHttpInfo(@jakarta.annotation.Nonnull Integer vegobjekttypeId, @jakarta.annotation.Nonnull Long vegobjektId, @jakarta.annotation.Nonnull Integer versjon, @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable InkluderGeometri inkludergeometri, @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper, @jakarta.annotation.Nullable String dybde, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable LocalDate tidspunkt) throws WebClientResponseException {
        ParameterizedTypeReference<Vegobjekt> localVarReturnType = new ParameterizedTypeReference<Vegobjekt>() {};
        return getVegobjektByTypeIdAndVersjonRequestCreation(vegobjekttypeId, vegobjektId, versjon, inkluder, srid, inkludergeometri, inkluderEgenskaper, dybde, geometritoleranse, tidspunkt).toEntity(localVarReturnType);
    }

    /**
     * Hent spesifikk versjon av et vegobjekt
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param vegobjekttypeId Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.  Eksempel: 581         
     * @param vegobjektId The vegobjektId parameter
     * @param versjon The versjon parameter
     * @param inkluder Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID.
     * @param srid Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param inkludergeometri Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under &#x60;vegobjekt.egenskaper&#x60; om den finnes, stedfestet geometri er plassert under &#x60;vegobjekt.lokasjon&#x60;. I tillegg til de nevnte feltene på vegobjekt-responsen returneres også &#x60;vegobjekt.geometri&#x60; (dersom man har &#x60;inkluder&#x3D;geometri&#x60; eller &#x60;alle&#x60;), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved å se på &#x60;vegobjekt.geometri.egengeometri&#x60;.
     * @param inkluderEgenskaper Gir mulighet til å filtrere hvilke egenskaper som skal returneres med inkluder&#x3D;egenskaper. &#x60;basis&#x60; er alle egenskaper som ikke er geometri, eller lister av geometri.
     * @param dybde Hvor mange nivå barn skal inkluderes. 1 betyr bare IDer, 2-n betyr ett eller flere mellomnivåer, &#39;full&#39; betyr alle nivåer.
     * @param geometritoleranse Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.
     * @param tidspunkt Finner versjonen som var gyldig denne datoen.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getVegobjektByTypeIdAndVersjonWithResponseSpec(@jakarta.annotation.Nonnull Integer vegobjekttypeId, @jakarta.annotation.Nonnull Long vegobjektId, @jakarta.annotation.Nonnull Integer versjon, @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable InkluderGeometri inkludergeometri, @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper, @jakarta.annotation.Nullable String dybde, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable LocalDate tidspunkt) throws WebClientResponseException {
        return getVegobjektByTypeIdAndVersjonRequestCreation(vegobjekttypeId, vegobjektId, versjon, inkluder, srid, inkludergeometri, inkluderEgenskaper, dybde, geometritoleranse, tidspunkt);
    }

    /**
     * Hent endringer for en vegobjekttype innen 30 dager
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param vegobjekttypeId Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.  Eksempel: 581         
     * @param ider Hent endringer for oppgitte vegobjekt IDer. Dersom denne utelates vil alle endringer for den angitte typen hentes.
     * @param start Hent alle endringer etter gitt tidspunkt. Dersom denne utelates vil de eldste endringene hentes først.
     * @param antall Antall endringer som skal være med i responsen. Merk at det faktiske antallet kan variere fra respons til respons. Dette er fordi endringer på samme vegobjektversjon innenfor samme side blir aggregert sammen ved å ta den nyeste endringen. Maksverdi: 1000
     * @param historisk Bestem om du ønsker endringer for aktive eller historiske vegobjekter. Standardverdi: &#x60;false&#x60;
     * @return VegobjektEndringerSide
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getVegobjektEndringerForTypeRequestCreation(@jakarta.annotation.Nonnull Integer vegobjekttypeId, @jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable OffsetDateTime start, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable Boolean historisk) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'vegobjekttypeId' is set
        if (vegobjekttypeId == null) {
            throw new WebClientResponseException("Missing the required parameter 'vegobjekttypeId' when calling getVegobjektEndringerForType", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("vegobjekttypeId", vegobjekttypeId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "ider", ider));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start", start));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "antall", antall));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "historisk", historisk));
        
        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<VegobjektEndringerSide> localVarReturnType = new ParameterizedTypeReference<VegobjektEndringerSide>() {};
        return apiClient.invokeAPI("/api/v4/vegobjekter/{vegobjekttypeId}/endringer", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Hent endringer for en vegobjekttype innen 30 dager
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param vegobjekttypeId Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.  Eksempel: 581         
     * @param ider Hent endringer for oppgitte vegobjekt IDer. Dersom denne utelates vil alle endringer for den angitte typen hentes.
     * @param start Hent alle endringer etter gitt tidspunkt. Dersom denne utelates vil de eldste endringene hentes først.
     * @param antall Antall endringer som skal være med i responsen. Merk at det faktiske antallet kan variere fra respons til respons. Dette er fordi endringer på samme vegobjektversjon innenfor samme side blir aggregert sammen ved å ta den nyeste endringen. Maksverdi: 1000
     * @param historisk Bestem om du ønsker endringer for aktive eller historiske vegobjekter. Standardverdi: &#x60;false&#x60;
     * @return VegobjektEndringerSide
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<VegobjektEndringerSide> getVegobjektEndringerForType(@jakarta.annotation.Nonnull Integer vegobjekttypeId, @jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable OffsetDateTime start, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable Boolean historisk) throws WebClientResponseException {
        ParameterizedTypeReference<VegobjektEndringerSide> localVarReturnType = new ParameterizedTypeReference<VegobjektEndringerSide>() {};
        return getVegobjektEndringerForTypeRequestCreation(vegobjekttypeId, ider, start, antall, historisk).bodyToMono(localVarReturnType);
    }

    /**
     * Hent endringer for en vegobjekttype innen 30 dager
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param vegobjekttypeId Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.  Eksempel: 581         
     * @param ider Hent endringer for oppgitte vegobjekt IDer. Dersom denne utelates vil alle endringer for den angitte typen hentes.
     * @param start Hent alle endringer etter gitt tidspunkt. Dersom denne utelates vil de eldste endringene hentes først.
     * @param antall Antall endringer som skal være med i responsen. Merk at det faktiske antallet kan variere fra respons til respons. Dette er fordi endringer på samme vegobjektversjon innenfor samme side blir aggregert sammen ved å ta den nyeste endringen. Maksverdi: 1000
     * @param historisk Bestem om du ønsker endringer for aktive eller historiske vegobjekter. Standardverdi: &#x60;false&#x60;
     * @return ResponseEntity&lt;VegobjektEndringerSide&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<VegobjektEndringerSide>> getVegobjektEndringerForTypeWithHttpInfo(@jakarta.annotation.Nonnull Integer vegobjekttypeId, @jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable OffsetDateTime start, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable Boolean historisk) throws WebClientResponseException {
        ParameterizedTypeReference<VegobjektEndringerSide> localVarReturnType = new ParameterizedTypeReference<VegobjektEndringerSide>() {};
        return getVegobjektEndringerForTypeRequestCreation(vegobjekttypeId, ider, start, antall, historisk).toEntity(localVarReturnType);
    }

    /**
     * Hent endringer for en vegobjekttype innen 30 dager
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param vegobjekttypeId Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.  Eksempel: 581         
     * @param ider Hent endringer for oppgitte vegobjekt IDer. Dersom denne utelates vil alle endringer for den angitte typen hentes.
     * @param start Hent alle endringer etter gitt tidspunkt. Dersom denne utelates vil de eldste endringene hentes først.
     * @param antall Antall endringer som skal være med i responsen. Merk at det faktiske antallet kan variere fra respons til respons. Dette er fordi endringer på samme vegobjektversjon innenfor samme side blir aggregert sammen ved å ta den nyeste endringen. Maksverdi: 1000
     * @param historisk Bestem om du ønsker endringer for aktive eller historiske vegobjekter. Standardverdi: &#x60;false&#x60;
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getVegobjektEndringerForTypeWithResponseSpec(@jakarta.annotation.Nonnull Integer vegobjekttypeId, @jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable OffsetDateTime start, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable Boolean historisk) throws WebClientResponseException {
        return getVegobjektEndringerForTypeRequestCreation(vegobjekttypeId, ider, start, antall, historisk);
    }

    /**
     * Hent alle versjoner av et vegobjekt
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param vegobjekttypeId Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.  Eksempel: 581         
     * @param vegobjektId The vegobjektId parameter
     * @param inkluder Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID.
     * @param srid Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param inkludergeometri Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under &#x60;vegobjekt.egenskaper&#x60; om den finnes, stedfestet geometri er plassert under &#x60;vegobjekt.lokasjon&#x60;. I tillegg til de nevnte feltene på vegobjekt-responsen returneres også &#x60;vegobjekt.geometri&#x60; (dersom man har &#x60;inkluder&#x3D;geometri&#x60; eller &#x60;alle&#x60;), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved å se på &#x60;vegobjekt.geometri.egengeometri&#x60;.
     * @param inkluderEgenskaper Gir mulighet til å filtrere hvilke egenskaper som skal returneres med inkluder&#x3D;egenskaper. &#x60;basis&#x60; er alle egenskaper som ikke er geometri, eller lister av geometri.
     * @param dybde Hvor mange nivå barn skal inkluderes. 1 betyr bare IDer, 2-n betyr ett eller flere mellomnivåer, &#39;full&#39; betyr alle nivåer.
     * @param geometritoleranse Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.
     * @param tidspunkt Finner versjonen som var gyldig denne datoen.
     * @return List&lt;Vegobjekt&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getVegobjektVersjonerRequestCreation(@jakarta.annotation.Nonnull Integer vegobjekttypeId, @jakarta.annotation.Nonnull Long vegobjektId, @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable InkluderGeometri inkludergeometri, @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper, @jakarta.annotation.Nullable String dybde, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable LocalDate tidspunkt) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'vegobjekttypeId' is set
        if (vegobjekttypeId == null) {
            throw new WebClientResponseException("Missing the required parameter 'vegobjekttypeId' when calling getVegobjektVersjoner", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'vegobjektId' is set
        if (vegobjektId == null) {
            throw new WebClientResponseException("Missing the required parameter 'vegobjektId' when calling getVegobjektVersjoner", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("vegobjekttypeId", vegobjekttypeId);
        pathParams.put("vegobjektId", vegobjektId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "inkluder", inkluder));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "srid", srid));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "inkludergeometri", inkludergeometri));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "inkluder_egenskaper", inkluderEgenskaper));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "dybde", dybde));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "geometritoleranse", geometritoleranse));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tidspunkt", tidspunkt));
        
        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Vegobjekt> localVarReturnType = new ParameterizedTypeReference<Vegobjekt>() {};
        return apiClient.invokeAPI("/api/v4/vegobjekter/{vegobjekttypeId}/{vegobjektId}/versjoner", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Hent alle versjoner av et vegobjekt
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param vegobjekttypeId Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.  Eksempel: 581         
     * @param vegobjektId The vegobjektId parameter
     * @param inkluder Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID.
     * @param srid Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param inkludergeometri Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under &#x60;vegobjekt.egenskaper&#x60; om den finnes, stedfestet geometri er plassert under &#x60;vegobjekt.lokasjon&#x60;. I tillegg til de nevnte feltene på vegobjekt-responsen returneres også &#x60;vegobjekt.geometri&#x60; (dersom man har &#x60;inkluder&#x3D;geometri&#x60; eller &#x60;alle&#x60;), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved å se på &#x60;vegobjekt.geometri.egengeometri&#x60;.
     * @param inkluderEgenskaper Gir mulighet til å filtrere hvilke egenskaper som skal returneres med inkluder&#x3D;egenskaper. &#x60;basis&#x60; er alle egenskaper som ikke er geometri, eller lister av geometri.
     * @param dybde Hvor mange nivå barn skal inkluderes. 1 betyr bare IDer, 2-n betyr ett eller flere mellomnivåer, &#39;full&#39; betyr alle nivåer.
     * @param geometritoleranse Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.
     * @param tidspunkt Finner versjonen som var gyldig denne datoen.
     * @return List&lt;Vegobjekt&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Vegobjekt> getVegobjektVersjoner(@jakarta.annotation.Nonnull Integer vegobjekttypeId, @jakarta.annotation.Nonnull Long vegobjektId, @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable InkluderGeometri inkludergeometri, @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper, @jakarta.annotation.Nullable String dybde, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable LocalDate tidspunkt) throws WebClientResponseException {
        ParameterizedTypeReference<Vegobjekt> localVarReturnType = new ParameterizedTypeReference<Vegobjekt>() {};
        return getVegobjektVersjonerRequestCreation(vegobjekttypeId, vegobjektId, inkluder, srid, inkludergeometri, inkluderEgenskaper, dybde, geometritoleranse, tidspunkt).bodyToFlux(localVarReturnType);
    }

    /**
     * Hent alle versjoner av et vegobjekt
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param vegobjekttypeId Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.  Eksempel: 581         
     * @param vegobjektId The vegobjektId parameter
     * @param inkluder Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID.
     * @param srid Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param inkludergeometri Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under &#x60;vegobjekt.egenskaper&#x60; om den finnes, stedfestet geometri er plassert under &#x60;vegobjekt.lokasjon&#x60;. I tillegg til de nevnte feltene på vegobjekt-responsen returneres også &#x60;vegobjekt.geometri&#x60; (dersom man har &#x60;inkluder&#x3D;geometri&#x60; eller &#x60;alle&#x60;), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved å se på &#x60;vegobjekt.geometri.egengeometri&#x60;.
     * @param inkluderEgenskaper Gir mulighet til å filtrere hvilke egenskaper som skal returneres med inkluder&#x3D;egenskaper. &#x60;basis&#x60; er alle egenskaper som ikke er geometri, eller lister av geometri.
     * @param dybde Hvor mange nivå barn skal inkluderes. 1 betyr bare IDer, 2-n betyr ett eller flere mellomnivåer, &#39;full&#39; betyr alle nivåer.
     * @param geometritoleranse Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.
     * @param tidspunkt Finner versjonen som var gyldig denne datoen.
     * @return ResponseEntity&lt;List&lt;Vegobjekt&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Vegobjekt>>> getVegobjektVersjonerWithHttpInfo(@jakarta.annotation.Nonnull Integer vegobjekttypeId, @jakarta.annotation.Nonnull Long vegobjektId, @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable InkluderGeometri inkludergeometri, @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper, @jakarta.annotation.Nullable String dybde, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable LocalDate tidspunkt) throws WebClientResponseException {
        ParameterizedTypeReference<Vegobjekt> localVarReturnType = new ParameterizedTypeReference<Vegobjekt>() {};
        return getVegobjektVersjonerRequestCreation(vegobjekttypeId, vegobjektId, inkluder, srid, inkludergeometri, inkluderEgenskaper, dybde, geometritoleranse, tidspunkt).toEntityList(localVarReturnType);
    }

    /**
     * Hent alle versjoner av et vegobjekt
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param vegobjekttypeId Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.  Eksempel: 581         
     * @param vegobjektId The vegobjektId parameter
     * @param inkluder Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID.
     * @param srid Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param inkludergeometri Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under &#x60;vegobjekt.egenskaper&#x60; om den finnes, stedfestet geometri er plassert under &#x60;vegobjekt.lokasjon&#x60;. I tillegg til de nevnte feltene på vegobjekt-responsen returneres også &#x60;vegobjekt.geometri&#x60; (dersom man har &#x60;inkluder&#x3D;geometri&#x60; eller &#x60;alle&#x60;), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved å se på &#x60;vegobjekt.geometri.egengeometri&#x60;.
     * @param inkluderEgenskaper Gir mulighet til å filtrere hvilke egenskaper som skal returneres med inkluder&#x3D;egenskaper. &#x60;basis&#x60; er alle egenskaper som ikke er geometri, eller lister av geometri.
     * @param dybde Hvor mange nivå barn skal inkluderes. 1 betyr bare IDer, 2-n betyr ett eller flere mellomnivåer, &#39;full&#39; betyr alle nivåer.
     * @param geometritoleranse Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.
     * @param tidspunkt Finner versjonen som var gyldig denne datoen.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getVegobjektVersjonerWithResponseSpec(@jakarta.annotation.Nonnull Integer vegobjekttypeId, @jakarta.annotation.Nonnull Long vegobjektId, @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable InkluderGeometri inkludergeometri, @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper, @jakarta.annotation.Nullable String dybde, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable LocalDate tidspunkt) throws WebClientResponseException {
        return getVegobjektVersjonerRequestCreation(vegobjekttypeId, vegobjektId, inkluder, srid, inkludergeometri, inkluderEgenskaper, dybde, geometritoleranse, tidspunkt);
    }

    /**
     * Hent vegobjekter av en type
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param vegobjekttypeId Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.  Eksempel: 581         
     * @param ider Kommaseparert liste med vegobjekt-IDer.
     * @param inkluder Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID.
     * @param srid Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param inkludergeometri Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under &#x60;vegobjekt.egenskaper&#x60; om den finnes, stedfestet geometri er plassert under &#x60;vegobjekt.lokasjon&#x60;. I tillegg til de nevnte feltene på vegobjekt-responsen returneres også &#x60;vegobjekt.geometri&#x60; (dersom man har &#x60;inkluder&#x3D;geometri&#x60; eller &#x60;alle&#x60;), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved å se på &#x60;vegobjekt.geometri.egengeometri&#x60;.
     * @param inkluderEgenskaper Gir mulighet til å filtrere hvilke egenskaper som skal returneres med inkluder&#x3D;egenskaper. &#x60;basis&#x60; er alle egenskaper som ikke er geometri, eller lister av geometri.
     * @param segmentering Angir om strekningsobjekter skal segmenteres etter søkeområdet (fylke, kommune, vegsystemreferanse, kontraktsområde, riksvegrute, vegforvalter).  Default: &#x60;false&#x60;
     * @param fylke Filtrer på fylke. Kommaseparert liste. Se /omrader/fylker for mulige verdier.  Eksempel: &#x60;50&#x60;
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se /omrader/kommuner for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @param kontraktsomrade Filtrer på kontraktsomrade. Kommaseparert liste. Se /omrader/kontraktsomrader for mulige verdier. Det er mulig å bruke ID-en for kontraktsområdet istedenfor det fulle navnet.  Eksempel: &#x60;9503 Midtre Hålogaland 2021-2026&#x60;
     * @param riksvegrute Filtrer på riksvegrute. Kommaseparert liste. Se /omrader/riksvegruter for mulige verdier.  Eksempel: &#x60;RUTE4A&#x60; eller som enumid &#x60;20290&#x60;
     * @param vegforvalter Filtrer på vegforvalter. Kommaseparert liste. Se [/omrader/api/v4/vegforvaltere](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getVegforvaltere) for mulige verdier.  Eksempel: &#x60;Møre og Romsdal fylkeskommune&#x60; eller som enumid &#x60;21774&#x60;
     * @param vegsystemreferanse Filtrer vegobjekter på [vegsystemreferanse](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1 m12&#x60;
     * @param kartutsnitt Filtrer vegobjekter med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;. Merk at vegobjektets bounding box benyttes for sammenligning, som kan medføre at vegobjekter som er utenfor kartutsnittet også returneres. For å unngå dette, kan du bruke &#x60;polygon&#x60; i stedet.  Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60;
     * @param polygon Filtrer vegobjekter med polygon i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret).  Eksempel: &#x60;20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000&#x60;
     * @param typeveg Filtrer Relasjonstype.vegobjekter på type veg på vegnettet objektet er stedfestet på. Kommaseparert liste.  Eksempel: &#x60;kanalisertVeg, enkelBilveg, rampe, rundkjøring, bilferje, passasjerferje, gangOgSykkelveg, sykkelveg, gangveg, gågate, fortau, trapp, gangfelt, gatetun, traktorveg, sti, annet&#x60;
     * @param adskiltelop Filtrer vegobjekter på om de er stedfestet hvor det er en Strekning med verdi satt for «adskilte løp».
     * @param kryssystem Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Kryssystem.
     * @param sideanlegg Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Sideanlegg.
     * @param trafikantgruppe Filtrer vegobjekter på trafikantgruppe.
     * @param antall Angir hvor mange objekter som skal returneres. Øvre grense er avhengig av størrelse på respons, og vil kunne variere fra endepunkt til endepunkt. Dersom det angis en verdi for antall som overskrider maksimum, vil maksimumsverdi benyttes. Se også &#x60;sidestørrelse&#x60; i responsens &#x60;metadata&#x60;-objekt.
     * @param start Angir offset for hvilke objekter som skal returneres. Denne får man i metadata-feltet i responsen.
     * @param geometritoleranse Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.
     * @param tidspunkt Finner versjonen som var gyldig denne datoen.
     * @param alleVersjoner Returner alle versjoner som matcher de oppgitte parametrene. Dersom ikke satt eller &#x60;false&#x60; vil kun objekter uten sluttdato returneres.
     * @param inkluderAntall Hvorvidt totalt antall objekter skal returneres i responsen. Default er &#x60;false&#x60;.
     * @param veglenkesekvens Filtrer vegobjekter på om de er stedfestet på gjeldende veglenkesekvenser. Kommaseparert liste.  Eksempel: &#x60;0.37@319531,0.83-0.97@41640&#x60;
     * @param egenskap Filtrer vegobjekter på egenskaper, relasjoner og overlapp. Husk URL encoding hvis verdien inneholder likhetstegn. Se [dokumentasjon](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Avanserte_filter)
     * @param overlapp Filtrer vegobjekter på overlapp. Husk URL encoding hvis verdien inneholder likhetstegn. Se [dokumentasjon](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Avanserte_filter)
     * @param veglenketype Filtrer vegobjekter på veglenketype på vegnettet objektet er stedfestet. Kommaseparert liste.
     * @param detaljniva Filtrer vegobjekter på detaljnivå på vegnettet objektet er stedfestet på (kortnavn fra datakatalogen).
     * @param endretEtter Hente endringer siden et tidspunkt. Tidspunkt skal følge ISO 8601 med tidssone eller som UTC. Eksempler: &#x60;2024-12-02T10:15:30.123+01:00&#x60;, &#x60;2024-12-02T09:15:30.123Z&#x60;
     * @return VegobjekterSide
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getVegobjekterByTypeRequestCreation(@jakarta.annotation.Nonnull Integer vegobjekttypeId, @jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable InkluderGeometri inkludergeometri, @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper, @jakarta.annotation.Nullable Boolean segmentering, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable Set<String> riksvegrute, @jakarta.annotation.Nullable Set<String> vegforvalter, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable String kartutsnitt, @jakarta.annotation.Nullable String polygon, @jakarta.annotation.Nullable Set<TypeVegSosi> typeveg, @jakarta.annotation.Nullable Set<AdskilteLop> adskiltelop, @jakarta.annotation.Nullable Boolean kryssystem, @jakarta.annotation.Nullable Boolean sideanlegg, @jakarta.annotation.Nullable Trafikantgruppe trafikantgruppe, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable String start, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable Boolean alleVersjoner, @jakarta.annotation.Nullable Boolean inkluderAntall, @jakarta.annotation.Nullable Set<String> veglenkesekvens, @jakarta.annotation.Nullable List<String> egenskap, @jakarta.annotation.Nullable List<String> overlapp, @jakarta.annotation.Nullable Set<VeglenkeTypeParameter> veglenketype, @jakarta.annotation.Nullable Set<DetaljnivaParameter> detaljniva, @jakarta.annotation.Nullable OffsetDateTime endretEtter) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'vegobjekttypeId' is set
        if (vegobjekttypeId == null) {
            throw new WebClientResponseException("Missing the required parameter 'vegobjekttypeId' when calling getVegobjekterByType", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("vegobjekttypeId", vegobjekttypeId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "ider", ider));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "inkluder", inkluder));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "srid", srid));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "inkludergeometri", inkludergeometri));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "inkluder_egenskaper", inkluderEgenskaper));
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
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "antall", antall));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start", start));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "geometritoleranse", geometritoleranse));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tidspunkt", tidspunkt));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "alle_versjoner", alleVersjoner));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "inkluderAntall", inkluderAntall));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "veglenkesekvens", veglenkesekvens));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "egenskap", egenskap));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "overlapp", overlapp));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "veglenketype", veglenketype));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "detaljniva", detaljniva));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "endret_etter", endretEtter));
        
        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<VegobjekterSide> localVarReturnType = new ParameterizedTypeReference<VegobjekterSide>() {};
        return apiClient.invokeAPI("/api/v4/vegobjekter/{vegobjekttypeId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Hent vegobjekter av en type
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param vegobjekttypeId Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.  Eksempel: 581         
     * @param ider Kommaseparert liste med vegobjekt-IDer.
     * @param inkluder Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID.
     * @param srid Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param inkludergeometri Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under &#x60;vegobjekt.egenskaper&#x60; om den finnes, stedfestet geometri er plassert under &#x60;vegobjekt.lokasjon&#x60;. I tillegg til de nevnte feltene på vegobjekt-responsen returneres også &#x60;vegobjekt.geometri&#x60; (dersom man har &#x60;inkluder&#x3D;geometri&#x60; eller &#x60;alle&#x60;), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved å se på &#x60;vegobjekt.geometri.egengeometri&#x60;.
     * @param inkluderEgenskaper Gir mulighet til å filtrere hvilke egenskaper som skal returneres med inkluder&#x3D;egenskaper. &#x60;basis&#x60; er alle egenskaper som ikke er geometri, eller lister av geometri.
     * @param segmentering Angir om strekningsobjekter skal segmenteres etter søkeområdet (fylke, kommune, vegsystemreferanse, kontraktsområde, riksvegrute, vegforvalter).  Default: &#x60;false&#x60;
     * @param fylke Filtrer på fylke. Kommaseparert liste. Se /omrader/fylker for mulige verdier.  Eksempel: &#x60;50&#x60;
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se /omrader/kommuner for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @param kontraktsomrade Filtrer på kontraktsomrade. Kommaseparert liste. Se /omrader/kontraktsomrader for mulige verdier. Det er mulig å bruke ID-en for kontraktsområdet istedenfor det fulle navnet.  Eksempel: &#x60;9503 Midtre Hålogaland 2021-2026&#x60;
     * @param riksvegrute Filtrer på riksvegrute. Kommaseparert liste. Se /omrader/riksvegruter for mulige verdier.  Eksempel: &#x60;RUTE4A&#x60; eller som enumid &#x60;20290&#x60;
     * @param vegforvalter Filtrer på vegforvalter. Kommaseparert liste. Se [/omrader/api/v4/vegforvaltere](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getVegforvaltere) for mulige verdier.  Eksempel: &#x60;Møre og Romsdal fylkeskommune&#x60; eller som enumid &#x60;21774&#x60;
     * @param vegsystemreferanse Filtrer vegobjekter på [vegsystemreferanse](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1 m12&#x60;
     * @param kartutsnitt Filtrer vegobjekter med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;. Merk at vegobjektets bounding box benyttes for sammenligning, som kan medføre at vegobjekter som er utenfor kartutsnittet også returneres. For å unngå dette, kan du bruke &#x60;polygon&#x60; i stedet.  Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60;
     * @param polygon Filtrer vegobjekter med polygon i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret).  Eksempel: &#x60;20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000&#x60;
     * @param typeveg Filtrer Relasjonstype.vegobjekter på type veg på vegnettet objektet er stedfestet på. Kommaseparert liste.  Eksempel: &#x60;kanalisertVeg, enkelBilveg, rampe, rundkjøring, bilferje, passasjerferje, gangOgSykkelveg, sykkelveg, gangveg, gågate, fortau, trapp, gangfelt, gatetun, traktorveg, sti, annet&#x60;
     * @param adskiltelop Filtrer vegobjekter på om de er stedfestet hvor det er en Strekning med verdi satt for «adskilte løp».
     * @param kryssystem Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Kryssystem.
     * @param sideanlegg Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Sideanlegg.
     * @param trafikantgruppe Filtrer vegobjekter på trafikantgruppe.
     * @param antall Angir hvor mange objekter som skal returneres. Øvre grense er avhengig av størrelse på respons, og vil kunne variere fra endepunkt til endepunkt. Dersom det angis en verdi for antall som overskrider maksimum, vil maksimumsverdi benyttes. Se også &#x60;sidestørrelse&#x60; i responsens &#x60;metadata&#x60;-objekt.
     * @param start Angir offset for hvilke objekter som skal returneres. Denne får man i metadata-feltet i responsen.
     * @param geometritoleranse Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.
     * @param tidspunkt Finner versjonen som var gyldig denne datoen.
     * @param alleVersjoner Returner alle versjoner som matcher de oppgitte parametrene. Dersom ikke satt eller &#x60;false&#x60; vil kun objekter uten sluttdato returneres.
     * @param inkluderAntall Hvorvidt totalt antall objekter skal returneres i responsen. Default er &#x60;false&#x60;.
     * @param veglenkesekvens Filtrer vegobjekter på om de er stedfestet på gjeldende veglenkesekvenser. Kommaseparert liste.  Eksempel: &#x60;0.37@319531,0.83-0.97@41640&#x60;
     * @param egenskap Filtrer vegobjekter på egenskaper, relasjoner og overlapp. Husk URL encoding hvis verdien inneholder likhetstegn. Se [dokumentasjon](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Avanserte_filter)
     * @param overlapp Filtrer vegobjekter på overlapp. Husk URL encoding hvis verdien inneholder likhetstegn. Se [dokumentasjon](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Avanserte_filter)
     * @param veglenketype Filtrer vegobjekter på veglenketype på vegnettet objektet er stedfestet. Kommaseparert liste.
     * @param detaljniva Filtrer vegobjekter på detaljnivå på vegnettet objektet er stedfestet på (kortnavn fra datakatalogen).
     * @param endretEtter Hente endringer siden et tidspunkt. Tidspunkt skal følge ISO 8601 med tidssone eller som UTC. Eksempler: &#x60;2024-12-02T10:15:30.123+01:00&#x60;, &#x60;2024-12-02T09:15:30.123Z&#x60;
     * @return VegobjekterSide
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<VegobjekterSide> getVegobjekterByType(@jakarta.annotation.Nonnull Integer vegobjekttypeId, @jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable InkluderGeometri inkludergeometri, @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper, @jakarta.annotation.Nullable Boolean segmentering, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable Set<String> riksvegrute, @jakarta.annotation.Nullable Set<String> vegforvalter, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable String kartutsnitt, @jakarta.annotation.Nullable String polygon, @jakarta.annotation.Nullable Set<TypeVegSosi> typeveg, @jakarta.annotation.Nullable Set<AdskilteLop> adskiltelop, @jakarta.annotation.Nullable Boolean kryssystem, @jakarta.annotation.Nullable Boolean sideanlegg, @jakarta.annotation.Nullable Trafikantgruppe trafikantgruppe, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable String start, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable Boolean alleVersjoner, @jakarta.annotation.Nullable Boolean inkluderAntall, @jakarta.annotation.Nullable Set<String> veglenkesekvens, @jakarta.annotation.Nullable List<String> egenskap, @jakarta.annotation.Nullable List<String> overlapp, @jakarta.annotation.Nullable Set<VeglenkeTypeParameter> veglenketype, @jakarta.annotation.Nullable Set<DetaljnivaParameter> detaljniva, @jakarta.annotation.Nullable OffsetDateTime endretEtter) throws WebClientResponseException {
        ParameterizedTypeReference<VegobjekterSide> localVarReturnType = new ParameterizedTypeReference<VegobjekterSide>() {};
        return getVegobjekterByTypeRequestCreation(vegobjekttypeId, ider, inkluder, srid, inkludergeometri, inkluderEgenskaper, segmentering, fylke, kommune, kontraktsomrade, riksvegrute, vegforvalter, vegsystemreferanse, kartutsnitt, polygon, typeveg, adskiltelop, kryssystem, sideanlegg, trafikantgruppe, antall, start, geometritoleranse, tidspunkt, alleVersjoner, inkluderAntall, veglenkesekvens, egenskap, overlapp, veglenketype, detaljniva, endretEtter).bodyToMono(localVarReturnType);
    }

    /**
     * Hent vegobjekter av en type
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param vegobjekttypeId Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.  Eksempel: 581         
     * @param ider Kommaseparert liste med vegobjekt-IDer.
     * @param inkluder Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID.
     * @param srid Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param inkludergeometri Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under &#x60;vegobjekt.egenskaper&#x60; om den finnes, stedfestet geometri er plassert under &#x60;vegobjekt.lokasjon&#x60;. I tillegg til de nevnte feltene på vegobjekt-responsen returneres også &#x60;vegobjekt.geometri&#x60; (dersom man har &#x60;inkluder&#x3D;geometri&#x60; eller &#x60;alle&#x60;), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved å se på &#x60;vegobjekt.geometri.egengeometri&#x60;.
     * @param inkluderEgenskaper Gir mulighet til å filtrere hvilke egenskaper som skal returneres med inkluder&#x3D;egenskaper. &#x60;basis&#x60; er alle egenskaper som ikke er geometri, eller lister av geometri.
     * @param segmentering Angir om strekningsobjekter skal segmenteres etter søkeområdet (fylke, kommune, vegsystemreferanse, kontraktsområde, riksvegrute, vegforvalter).  Default: &#x60;false&#x60;
     * @param fylke Filtrer på fylke. Kommaseparert liste. Se /omrader/fylker for mulige verdier.  Eksempel: &#x60;50&#x60;
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se /omrader/kommuner for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @param kontraktsomrade Filtrer på kontraktsomrade. Kommaseparert liste. Se /omrader/kontraktsomrader for mulige verdier. Det er mulig å bruke ID-en for kontraktsområdet istedenfor det fulle navnet.  Eksempel: &#x60;9503 Midtre Hålogaland 2021-2026&#x60;
     * @param riksvegrute Filtrer på riksvegrute. Kommaseparert liste. Se /omrader/riksvegruter for mulige verdier.  Eksempel: &#x60;RUTE4A&#x60; eller som enumid &#x60;20290&#x60;
     * @param vegforvalter Filtrer på vegforvalter. Kommaseparert liste. Se [/omrader/api/v4/vegforvaltere](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getVegforvaltere) for mulige verdier.  Eksempel: &#x60;Møre og Romsdal fylkeskommune&#x60; eller som enumid &#x60;21774&#x60;
     * @param vegsystemreferanse Filtrer vegobjekter på [vegsystemreferanse](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1 m12&#x60;
     * @param kartutsnitt Filtrer vegobjekter med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;. Merk at vegobjektets bounding box benyttes for sammenligning, som kan medføre at vegobjekter som er utenfor kartutsnittet også returneres. For å unngå dette, kan du bruke &#x60;polygon&#x60; i stedet.  Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60;
     * @param polygon Filtrer vegobjekter med polygon i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret).  Eksempel: &#x60;20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000&#x60;
     * @param typeveg Filtrer Relasjonstype.vegobjekter på type veg på vegnettet objektet er stedfestet på. Kommaseparert liste.  Eksempel: &#x60;kanalisertVeg, enkelBilveg, rampe, rundkjøring, bilferje, passasjerferje, gangOgSykkelveg, sykkelveg, gangveg, gågate, fortau, trapp, gangfelt, gatetun, traktorveg, sti, annet&#x60;
     * @param adskiltelop Filtrer vegobjekter på om de er stedfestet hvor det er en Strekning med verdi satt for «adskilte løp».
     * @param kryssystem Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Kryssystem.
     * @param sideanlegg Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Sideanlegg.
     * @param trafikantgruppe Filtrer vegobjekter på trafikantgruppe.
     * @param antall Angir hvor mange objekter som skal returneres. Øvre grense er avhengig av størrelse på respons, og vil kunne variere fra endepunkt til endepunkt. Dersom det angis en verdi for antall som overskrider maksimum, vil maksimumsverdi benyttes. Se også &#x60;sidestørrelse&#x60; i responsens &#x60;metadata&#x60;-objekt.
     * @param start Angir offset for hvilke objekter som skal returneres. Denne får man i metadata-feltet i responsen.
     * @param geometritoleranse Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.
     * @param tidspunkt Finner versjonen som var gyldig denne datoen.
     * @param alleVersjoner Returner alle versjoner som matcher de oppgitte parametrene. Dersom ikke satt eller &#x60;false&#x60; vil kun objekter uten sluttdato returneres.
     * @param inkluderAntall Hvorvidt totalt antall objekter skal returneres i responsen. Default er &#x60;false&#x60;.
     * @param veglenkesekvens Filtrer vegobjekter på om de er stedfestet på gjeldende veglenkesekvenser. Kommaseparert liste.  Eksempel: &#x60;0.37@319531,0.83-0.97@41640&#x60;
     * @param egenskap Filtrer vegobjekter på egenskaper, relasjoner og overlapp. Husk URL encoding hvis verdien inneholder likhetstegn. Se [dokumentasjon](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Avanserte_filter)
     * @param overlapp Filtrer vegobjekter på overlapp. Husk URL encoding hvis verdien inneholder likhetstegn. Se [dokumentasjon](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Avanserte_filter)
     * @param veglenketype Filtrer vegobjekter på veglenketype på vegnettet objektet er stedfestet. Kommaseparert liste.
     * @param detaljniva Filtrer vegobjekter på detaljnivå på vegnettet objektet er stedfestet på (kortnavn fra datakatalogen).
     * @param endretEtter Hente endringer siden et tidspunkt. Tidspunkt skal følge ISO 8601 med tidssone eller som UTC. Eksempler: &#x60;2024-12-02T10:15:30.123+01:00&#x60;, &#x60;2024-12-02T09:15:30.123Z&#x60;
     * @return ResponseEntity&lt;VegobjekterSide&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<VegobjekterSide>> getVegobjekterByTypeWithHttpInfo(@jakarta.annotation.Nonnull Integer vegobjekttypeId, @jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable InkluderGeometri inkludergeometri, @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper, @jakarta.annotation.Nullable Boolean segmentering, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable Set<String> riksvegrute, @jakarta.annotation.Nullable Set<String> vegforvalter, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable String kartutsnitt, @jakarta.annotation.Nullable String polygon, @jakarta.annotation.Nullable Set<TypeVegSosi> typeveg, @jakarta.annotation.Nullable Set<AdskilteLop> adskiltelop, @jakarta.annotation.Nullable Boolean kryssystem, @jakarta.annotation.Nullable Boolean sideanlegg, @jakarta.annotation.Nullable Trafikantgruppe trafikantgruppe, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable String start, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable Boolean alleVersjoner, @jakarta.annotation.Nullable Boolean inkluderAntall, @jakarta.annotation.Nullable Set<String> veglenkesekvens, @jakarta.annotation.Nullable List<String> egenskap, @jakarta.annotation.Nullable List<String> overlapp, @jakarta.annotation.Nullable Set<VeglenkeTypeParameter> veglenketype, @jakarta.annotation.Nullable Set<DetaljnivaParameter> detaljniva, @jakarta.annotation.Nullable OffsetDateTime endretEtter) throws WebClientResponseException {
        ParameterizedTypeReference<VegobjekterSide> localVarReturnType = new ParameterizedTypeReference<VegobjekterSide>() {};
        return getVegobjekterByTypeRequestCreation(vegobjekttypeId, ider, inkluder, srid, inkludergeometri, inkluderEgenskaper, segmentering, fylke, kommune, kontraktsomrade, riksvegrute, vegforvalter, vegsystemreferanse, kartutsnitt, polygon, typeveg, adskiltelop, kryssystem, sideanlegg, trafikantgruppe, antall, start, geometritoleranse, tidspunkt, alleVersjoner, inkluderAntall, veglenkesekvens, egenskap, overlapp, veglenketype, detaljniva, endretEtter).toEntity(localVarReturnType);
    }

    /**
     * Hent vegobjekter av en type
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param vegobjekttypeId Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.  Eksempel: 581         
     * @param ider Kommaseparert liste med vegobjekt-IDer.
     * @param inkluder Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID.
     * @param srid Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param inkludergeometri Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under &#x60;vegobjekt.egenskaper&#x60; om den finnes, stedfestet geometri er plassert under &#x60;vegobjekt.lokasjon&#x60;. I tillegg til de nevnte feltene på vegobjekt-responsen returneres også &#x60;vegobjekt.geometri&#x60; (dersom man har &#x60;inkluder&#x3D;geometri&#x60; eller &#x60;alle&#x60;), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved å se på &#x60;vegobjekt.geometri.egengeometri&#x60;.
     * @param inkluderEgenskaper Gir mulighet til å filtrere hvilke egenskaper som skal returneres med inkluder&#x3D;egenskaper. &#x60;basis&#x60; er alle egenskaper som ikke er geometri, eller lister av geometri.
     * @param segmentering Angir om strekningsobjekter skal segmenteres etter søkeområdet (fylke, kommune, vegsystemreferanse, kontraktsområde, riksvegrute, vegforvalter).  Default: &#x60;false&#x60;
     * @param fylke Filtrer på fylke. Kommaseparert liste. Se /omrader/fylker for mulige verdier.  Eksempel: &#x60;50&#x60;
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se /omrader/kommuner for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @param kontraktsomrade Filtrer på kontraktsomrade. Kommaseparert liste. Se /omrader/kontraktsomrader for mulige verdier. Det er mulig å bruke ID-en for kontraktsområdet istedenfor det fulle navnet.  Eksempel: &#x60;9503 Midtre Hålogaland 2021-2026&#x60;
     * @param riksvegrute Filtrer på riksvegrute. Kommaseparert liste. Se /omrader/riksvegruter for mulige verdier.  Eksempel: &#x60;RUTE4A&#x60; eller som enumid &#x60;20290&#x60;
     * @param vegforvalter Filtrer på vegforvalter. Kommaseparert liste. Se [/omrader/api/v4/vegforvaltere](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getVegforvaltere) for mulige verdier.  Eksempel: &#x60;Møre og Romsdal fylkeskommune&#x60; eller som enumid &#x60;21774&#x60;
     * @param vegsystemreferanse Filtrer vegobjekter på [vegsystemreferanse](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1 m12&#x60;
     * @param kartutsnitt Filtrer vegobjekter med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;. Merk at vegobjektets bounding box benyttes for sammenligning, som kan medføre at vegobjekter som er utenfor kartutsnittet også returneres. For å unngå dette, kan du bruke &#x60;polygon&#x60; i stedet.  Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60;
     * @param polygon Filtrer vegobjekter med polygon i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret).  Eksempel: &#x60;20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000&#x60;
     * @param typeveg Filtrer Relasjonstype.vegobjekter på type veg på vegnettet objektet er stedfestet på. Kommaseparert liste.  Eksempel: &#x60;kanalisertVeg, enkelBilveg, rampe, rundkjøring, bilferje, passasjerferje, gangOgSykkelveg, sykkelveg, gangveg, gågate, fortau, trapp, gangfelt, gatetun, traktorveg, sti, annet&#x60;
     * @param adskiltelop Filtrer vegobjekter på om de er stedfestet hvor det er en Strekning med verdi satt for «adskilte løp».
     * @param kryssystem Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Kryssystem.
     * @param sideanlegg Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Sideanlegg.
     * @param trafikantgruppe Filtrer vegobjekter på trafikantgruppe.
     * @param antall Angir hvor mange objekter som skal returneres. Øvre grense er avhengig av størrelse på respons, og vil kunne variere fra endepunkt til endepunkt. Dersom det angis en verdi for antall som overskrider maksimum, vil maksimumsverdi benyttes. Se også &#x60;sidestørrelse&#x60; i responsens &#x60;metadata&#x60;-objekt.
     * @param start Angir offset for hvilke objekter som skal returneres. Denne får man i metadata-feltet i responsen.
     * @param geometritoleranse Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.
     * @param tidspunkt Finner versjonen som var gyldig denne datoen.
     * @param alleVersjoner Returner alle versjoner som matcher de oppgitte parametrene. Dersom ikke satt eller &#x60;false&#x60; vil kun objekter uten sluttdato returneres.
     * @param inkluderAntall Hvorvidt totalt antall objekter skal returneres i responsen. Default er &#x60;false&#x60;.
     * @param veglenkesekvens Filtrer vegobjekter på om de er stedfestet på gjeldende veglenkesekvenser. Kommaseparert liste.  Eksempel: &#x60;0.37@319531,0.83-0.97@41640&#x60;
     * @param egenskap Filtrer vegobjekter på egenskaper, relasjoner og overlapp. Husk URL encoding hvis verdien inneholder likhetstegn. Se [dokumentasjon](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Avanserte_filter)
     * @param overlapp Filtrer vegobjekter på overlapp. Husk URL encoding hvis verdien inneholder likhetstegn. Se [dokumentasjon](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Avanserte_filter)
     * @param veglenketype Filtrer vegobjekter på veglenketype på vegnettet objektet er stedfestet. Kommaseparert liste.
     * @param detaljniva Filtrer vegobjekter på detaljnivå på vegnettet objektet er stedfestet på (kortnavn fra datakatalogen).
     * @param endretEtter Hente endringer siden et tidspunkt. Tidspunkt skal følge ISO 8601 med tidssone eller som UTC. Eksempler: &#x60;2024-12-02T10:15:30.123+01:00&#x60;, &#x60;2024-12-02T09:15:30.123Z&#x60;
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getVegobjekterByTypeWithResponseSpec(@jakarta.annotation.Nonnull Integer vegobjekttypeId, @jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable InkluderGeometri inkludergeometri, @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper, @jakarta.annotation.Nullable Boolean segmentering, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable Set<String> riksvegrute, @jakarta.annotation.Nullable Set<String> vegforvalter, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable String kartutsnitt, @jakarta.annotation.Nullable String polygon, @jakarta.annotation.Nullable Set<TypeVegSosi> typeveg, @jakarta.annotation.Nullable Set<AdskilteLop> adskiltelop, @jakarta.annotation.Nullable Boolean kryssystem, @jakarta.annotation.Nullable Boolean sideanlegg, @jakarta.annotation.Nullable Trafikantgruppe trafikantgruppe, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable String start, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable Boolean alleVersjoner, @jakarta.annotation.Nullable Boolean inkluderAntall, @jakarta.annotation.Nullable Set<String> veglenkesekvens, @jakarta.annotation.Nullable List<String> egenskap, @jakarta.annotation.Nullable List<String> overlapp, @jakarta.annotation.Nullable Set<VeglenkeTypeParameter> veglenketype, @jakarta.annotation.Nullable Set<DetaljnivaParameter> detaljniva, @jakarta.annotation.Nullable OffsetDateTime endretEtter) throws WebClientResponseException {
        return getVegobjekterByTypeRequestCreation(vegobjekttypeId, ider, inkluder, srid, inkludergeometri, inkluderEgenskaper, segmentering, fylke, kommune, kontraktsomrade, riksvegrute, vegforvalter, vegsystemreferanse, kartutsnitt, polygon, typeveg, adskiltelop, kryssystem, sideanlegg, trafikantgruppe, antall, start, geometritoleranse, tidspunkt, alleVersjoner, inkluderAntall, veglenkesekvens, egenskap, overlapp, veglenketype, detaljniva, endretEtter);
    }
}

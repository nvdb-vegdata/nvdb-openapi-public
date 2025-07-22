package no.vegvesen.vt.nvdb.vegnett.api;

import no.vegvesen.vt.nvdb.vegnett.infrastructure.ApiClient;

import no.vegvesen.vt.nvdb.vegnett.model.FinnRuteParameters;
import java.time.LocalDate;
import no.vegvesen.vt.nvdb.vegnett.model.ProblemDetail;
import no.vegvesen.vt.nvdb.vegnett.model.RuteResponse;
import java.util.Set;
import no.vegvesen.vt.nvdb.vegnett.model.SridParameter;
import no.vegvesen.vt.nvdb.vegnett.model.Trafikantgruppe;
import no.vegvesen.vt.nvdb.vegnett.model.TypeVeg;

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
public class RuteApi {
    private ApiClient apiClient;

    public RuteApi() {
        this(new ApiClient());
    }

    @Autowired
    public RuteApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * 
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param start Startposisjon som et punkt eller posisjon@veglenkesekvens.  Eksempler: &#x60;226761.786, 6564469.3787&#x60; &#x60;0.1@1234&#x60;
     * @param slutt Sluttposisjon som et punkt eller posisjon@veglenkesekvens.  Eksempler: &#x60;226855.034, 6564472.225&#x60; &#x60;0.9@4321&#x60;
     * @param geometri Finn sammenhengende vegnett som passer med denne geometrien.  Eksempel: &#x60;LINESTRING Z (226778.2 6564468.6 5, 226747.1 6564470.1 5, 226717.5 6564466.4 5, 226705.9 6564462.7 6.2, 226687.2 6564462.9 6, 226657.7 6564460.7 6, 226628.5 6564459.5 6, 226611.3 6564459.6 6.2)&#x60;
     * @param maksAvstand Maks avstand i meter til veglenker.  Standardverdi: &#x60;10&#x60;
     * @param omkrets Konvolutt lagt rundt start- og slutt-punkt for å beregne rute.  Standardverdi: &#x60;200&#x60;. Må være større enn 0.
     * @param konnekteringslenker Inkluder konnekteringslenker.  Standardverdi: &#x60;true&#x60;
     * @param detaljerteLenker Inkluder detaljerte lenker.  Standardverdi: &#x60;false&#x60;
     * @param kortform Returner minimal respons.  Standardverdi: &#x60;false&#x60;
     * @param vegsystemreferanse Filtrer på vegsystemreferanse. Kommaseparert liste.  Eksempler: &#x60;EV6&#x60; &#x60;R&#x60; &#x60;F&#x60;
     * @param trafikantgruppe Filtrer på trafikantgruppe.
     * @param beholdTrafikantgruppe Behold trafikantgruppe gjennom ruten. Trafikantgruppe velges fra første og siste punkt i ruten, om de er ulike velges K (kjørende). Overstyres av parameteren trafikantgruppe.  Standardverdi: &#x60;false&#x60;
     * @param typeveg Filtrer på type veg. Kommaseparert liste.
     * @param tidspunkt Begrens spørring til dette tidspunktet.
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @return RuteResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getRuteRequestCreation(@jakarta.annotation.Nullable String start, @jakarta.annotation.Nullable String slutt, @jakarta.annotation.Nullable String geometri, @jakarta.annotation.Nullable Integer maksAvstand, @jakarta.annotation.Nullable Integer omkrets, @jakarta.annotation.Nullable Boolean konnekteringslenker, @jakarta.annotation.Nullable Boolean detaljerteLenker, @jakarta.annotation.Nullable Boolean kortform, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable Trafikantgruppe trafikantgruppe, @jakarta.annotation.Nullable Boolean beholdTrafikantgruppe, @jakarta.annotation.Nullable Set<TypeVeg> typeveg, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable SridParameter srid) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start", start));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "slutt", slutt));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "geometri", geometri));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maks_avstand", maksAvstand));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "omkrets", omkrets));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "konnekteringslenker", konnekteringslenker));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "detaljerte_lenker", detaljerteLenker));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "kortform", kortform));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "vegsystemreferanse", vegsystemreferanse));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "trafikantgruppe", trafikantgruppe));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "behold_trafikantgruppe", beholdTrafikantgruppe));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "typeveg", typeveg));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tidspunkt", tidspunkt));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "srid", srid));
        
        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<RuteResponse> localVarReturnType = new ParameterizedTypeReference<RuteResponse>() {};
        return apiClient.invokeAPI("/api/v4/beta/vegnett/rute", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param start Startposisjon som et punkt eller posisjon@veglenkesekvens.  Eksempler: &#x60;226761.786, 6564469.3787&#x60; &#x60;0.1@1234&#x60;
     * @param slutt Sluttposisjon som et punkt eller posisjon@veglenkesekvens.  Eksempler: &#x60;226855.034, 6564472.225&#x60; &#x60;0.9@4321&#x60;
     * @param geometri Finn sammenhengende vegnett som passer med denne geometrien.  Eksempel: &#x60;LINESTRING Z (226778.2 6564468.6 5, 226747.1 6564470.1 5, 226717.5 6564466.4 5, 226705.9 6564462.7 6.2, 226687.2 6564462.9 6, 226657.7 6564460.7 6, 226628.5 6564459.5 6, 226611.3 6564459.6 6.2)&#x60;
     * @param maksAvstand Maks avstand i meter til veglenker.  Standardverdi: &#x60;10&#x60;
     * @param omkrets Konvolutt lagt rundt start- og slutt-punkt for å beregne rute.  Standardverdi: &#x60;200&#x60;. Må være større enn 0.
     * @param konnekteringslenker Inkluder konnekteringslenker.  Standardverdi: &#x60;true&#x60;
     * @param detaljerteLenker Inkluder detaljerte lenker.  Standardverdi: &#x60;false&#x60;
     * @param kortform Returner minimal respons.  Standardverdi: &#x60;false&#x60;
     * @param vegsystemreferanse Filtrer på vegsystemreferanse. Kommaseparert liste.  Eksempler: &#x60;EV6&#x60; &#x60;R&#x60; &#x60;F&#x60;
     * @param trafikantgruppe Filtrer på trafikantgruppe.
     * @param beholdTrafikantgruppe Behold trafikantgruppe gjennom ruten. Trafikantgruppe velges fra første og siste punkt i ruten, om de er ulike velges K (kjørende). Overstyres av parameteren trafikantgruppe.  Standardverdi: &#x60;false&#x60;
     * @param typeveg Filtrer på type veg. Kommaseparert liste.
     * @param tidspunkt Begrens spørring til dette tidspunktet.
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @return RuteResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<RuteResponse> getRute(@jakarta.annotation.Nullable String start, @jakarta.annotation.Nullable String slutt, @jakarta.annotation.Nullable String geometri, @jakarta.annotation.Nullable Integer maksAvstand, @jakarta.annotation.Nullable Integer omkrets, @jakarta.annotation.Nullable Boolean konnekteringslenker, @jakarta.annotation.Nullable Boolean detaljerteLenker, @jakarta.annotation.Nullable Boolean kortform, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable Trafikantgruppe trafikantgruppe, @jakarta.annotation.Nullable Boolean beholdTrafikantgruppe, @jakarta.annotation.Nullable Set<TypeVeg> typeveg, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable SridParameter srid) throws WebClientResponseException {
        ParameterizedTypeReference<RuteResponse> localVarReturnType = new ParameterizedTypeReference<RuteResponse>() {};
        return getRuteRequestCreation(start, slutt, geometri, maksAvstand, omkrets, konnekteringslenker, detaljerteLenker, kortform, vegsystemreferanse, trafikantgruppe, beholdTrafikantgruppe, typeveg, tidspunkt, srid).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param start Startposisjon som et punkt eller posisjon@veglenkesekvens.  Eksempler: &#x60;226761.786, 6564469.3787&#x60; &#x60;0.1@1234&#x60;
     * @param slutt Sluttposisjon som et punkt eller posisjon@veglenkesekvens.  Eksempler: &#x60;226855.034, 6564472.225&#x60; &#x60;0.9@4321&#x60;
     * @param geometri Finn sammenhengende vegnett som passer med denne geometrien.  Eksempel: &#x60;LINESTRING Z (226778.2 6564468.6 5, 226747.1 6564470.1 5, 226717.5 6564466.4 5, 226705.9 6564462.7 6.2, 226687.2 6564462.9 6, 226657.7 6564460.7 6, 226628.5 6564459.5 6, 226611.3 6564459.6 6.2)&#x60;
     * @param maksAvstand Maks avstand i meter til veglenker.  Standardverdi: &#x60;10&#x60;
     * @param omkrets Konvolutt lagt rundt start- og slutt-punkt for å beregne rute.  Standardverdi: &#x60;200&#x60;. Må være større enn 0.
     * @param konnekteringslenker Inkluder konnekteringslenker.  Standardverdi: &#x60;true&#x60;
     * @param detaljerteLenker Inkluder detaljerte lenker.  Standardverdi: &#x60;false&#x60;
     * @param kortform Returner minimal respons.  Standardverdi: &#x60;false&#x60;
     * @param vegsystemreferanse Filtrer på vegsystemreferanse. Kommaseparert liste.  Eksempler: &#x60;EV6&#x60; &#x60;R&#x60; &#x60;F&#x60;
     * @param trafikantgruppe Filtrer på trafikantgruppe.
     * @param beholdTrafikantgruppe Behold trafikantgruppe gjennom ruten. Trafikantgruppe velges fra første og siste punkt i ruten, om de er ulike velges K (kjørende). Overstyres av parameteren trafikantgruppe.  Standardverdi: &#x60;false&#x60;
     * @param typeveg Filtrer på type veg. Kommaseparert liste.
     * @param tidspunkt Begrens spørring til dette tidspunktet.
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @return ResponseEntity&lt;RuteResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<RuteResponse>> getRuteWithHttpInfo(@jakarta.annotation.Nullable String start, @jakarta.annotation.Nullable String slutt, @jakarta.annotation.Nullable String geometri, @jakarta.annotation.Nullable Integer maksAvstand, @jakarta.annotation.Nullable Integer omkrets, @jakarta.annotation.Nullable Boolean konnekteringslenker, @jakarta.annotation.Nullable Boolean detaljerteLenker, @jakarta.annotation.Nullable Boolean kortform, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable Trafikantgruppe trafikantgruppe, @jakarta.annotation.Nullable Boolean beholdTrafikantgruppe, @jakarta.annotation.Nullable Set<TypeVeg> typeveg, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable SridParameter srid) throws WebClientResponseException {
        ParameterizedTypeReference<RuteResponse> localVarReturnType = new ParameterizedTypeReference<RuteResponse>() {};
        return getRuteRequestCreation(start, slutt, geometri, maksAvstand, omkrets, konnekteringslenker, detaljerteLenker, kortform, vegsystemreferanse, trafikantgruppe, beholdTrafikantgruppe, typeveg, tidspunkt, srid).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param start Startposisjon som et punkt eller posisjon@veglenkesekvens.  Eksempler: &#x60;226761.786, 6564469.3787&#x60; &#x60;0.1@1234&#x60;
     * @param slutt Sluttposisjon som et punkt eller posisjon@veglenkesekvens.  Eksempler: &#x60;226855.034, 6564472.225&#x60; &#x60;0.9@4321&#x60;
     * @param geometri Finn sammenhengende vegnett som passer med denne geometrien.  Eksempel: &#x60;LINESTRING Z (226778.2 6564468.6 5, 226747.1 6564470.1 5, 226717.5 6564466.4 5, 226705.9 6564462.7 6.2, 226687.2 6564462.9 6, 226657.7 6564460.7 6, 226628.5 6564459.5 6, 226611.3 6564459.6 6.2)&#x60;
     * @param maksAvstand Maks avstand i meter til veglenker.  Standardverdi: &#x60;10&#x60;
     * @param omkrets Konvolutt lagt rundt start- og slutt-punkt for å beregne rute.  Standardverdi: &#x60;200&#x60;. Må være større enn 0.
     * @param konnekteringslenker Inkluder konnekteringslenker.  Standardverdi: &#x60;true&#x60;
     * @param detaljerteLenker Inkluder detaljerte lenker.  Standardverdi: &#x60;false&#x60;
     * @param kortform Returner minimal respons.  Standardverdi: &#x60;false&#x60;
     * @param vegsystemreferanse Filtrer på vegsystemreferanse. Kommaseparert liste.  Eksempler: &#x60;EV6&#x60; &#x60;R&#x60; &#x60;F&#x60;
     * @param trafikantgruppe Filtrer på trafikantgruppe.
     * @param beholdTrafikantgruppe Behold trafikantgruppe gjennom ruten. Trafikantgruppe velges fra første og siste punkt i ruten, om de er ulike velges K (kjørende). Overstyres av parameteren trafikantgruppe.  Standardverdi: &#x60;false&#x60;
     * @param typeveg Filtrer på type veg. Kommaseparert liste.
     * @param tidspunkt Begrens spørring til dette tidspunktet.
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getRuteWithResponseSpec(@jakarta.annotation.Nullable String start, @jakarta.annotation.Nullable String slutt, @jakarta.annotation.Nullable String geometri, @jakarta.annotation.Nullable Integer maksAvstand, @jakarta.annotation.Nullable Integer omkrets, @jakarta.annotation.Nullable Boolean konnekteringslenker, @jakarta.annotation.Nullable Boolean detaljerteLenker, @jakarta.annotation.Nullable Boolean kortform, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable Trafikantgruppe trafikantgruppe, @jakarta.annotation.Nullable Boolean beholdTrafikantgruppe, @jakarta.annotation.Nullable Set<TypeVeg> typeveg, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable SridParameter srid) throws WebClientResponseException {
        return getRuteRequestCreation(start, slutt, geometri, maksAvstand, omkrets, konnekteringslenker, detaljerteLenker, kortform, vegsystemreferanse, trafikantgruppe, beholdTrafikantgruppe, typeveg, tidspunkt, srid);
    }

    /**
     * 
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param finnRuteParameters The finnRuteParameters parameter
     * @return RuteResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec postRuteRequestCreation(@jakarta.annotation.Nonnull FinnRuteParameters finnRuteParameters) throws WebClientResponseException {
        Object postBody = finnRuteParameters;
        // verify the required parameter 'finnRuteParameters' is set
        if (finnRuteParameters == null) {
            throw new WebClientResponseException("Missing the required parameter 'finnRuteParameters' when calling postRute", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<RuteResponse> localVarReturnType = new ParameterizedTypeReference<RuteResponse>() {};
        return apiClient.invokeAPI("/api/v4/beta/vegnett/rute", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param finnRuteParameters The finnRuteParameters parameter
     * @return RuteResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<RuteResponse> postRute(@jakarta.annotation.Nonnull FinnRuteParameters finnRuteParameters) throws WebClientResponseException {
        ParameterizedTypeReference<RuteResponse> localVarReturnType = new ParameterizedTypeReference<RuteResponse>() {};
        return postRuteRequestCreation(finnRuteParameters).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param finnRuteParameters The finnRuteParameters parameter
     * @return ResponseEntity&lt;RuteResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<RuteResponse>> postRuteWithHttpInfo(@jakarta.annotation.Nonnull FinnRuteParameters finnRuteParameters) throws WebClientResponseException {
        ParameterizedTypeReference<RuteResponse> localVarReturnType = new ParameterizedTypeReference<RuteResponse>() {};
        return postRuteRequestCreation(finnRuteParameters).toEntity(localVarReturnType);
    }

    /**
     * 
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param finnRuteParameters The finnRuteParameters parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec postRuteWithResponseSpec(@jakarta.annotation.Nonnull FinnRuteParameters finnRuteParameters) throws WebClientResponseException {
        return postRuteRequestCreation(finnRuteParameters);
    }
}

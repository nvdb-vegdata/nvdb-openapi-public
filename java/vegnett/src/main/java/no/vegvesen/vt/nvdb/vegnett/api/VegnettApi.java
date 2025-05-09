package no.vegvesen.vt.nvdb.vegnett.api;

import no.vegvesen.vt.nvdb.vegnett.infrastructure.ApiClient;

import java.time.LocalDate;
import no.vegvesen.vt.nvdb.vegnett.model.ProblemDetail;
import java.util.Set;
import no.vegvesen.vt.nvdb.vegnett.model.Veglenkesegment;
import no.vegvesen.vt.nvdb.vegnett.model.VeglenkesegmenterSide;
import no.vegvesen.vt.nvdb.vegnett.model.Veglenkesekvens;
import no.vegvesen.vt.nvdb.vegnett.model.VeglenkesekvenserSide;

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
public class VegnettApi {
    private ApiClient apiClient;

    public VegnettApi() {
        this(new ApiClient());
    }

    @Autowired
    public VegnettApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Hent en segmentert veglenkesekvens
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param veglenkesekvensId ID for veglenkesekvensen.
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param historisk For &#x60;false&#x60; returneres kun dagens veglenkesegmenter. For &#x60;true&#x60; returneres dagens og historiske veglenkesegmenter. Default er &#x60;false&#x60;.
     * @param tidspunkt Begrens spørring til det gitte tidspunktet.
     * @return List&lt;Veglenkesegment&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getSegmentertVeglenkesekvensRequestCreation(@jakarta.annotation.Nonnull Long veglenkesekvensId, @jakarta.annotation.Nullable String srid, @jakarta.annotation.Nullable Boolean historisk, @jakarta.annotation.Nullable LocalDate tidspunkt) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'veglenkesekvensId' is set
        if (veglenkesekvensId == null) {
            throw new WebClientResponseException("Missing the required parameter 'veglenkesekvensId' when calling getSegmentertVeglenkesekvens", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("veglenkesekvensId", veglenkesekvensId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "srid", srid));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "historisk", historisk));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tidspunkt", tidspunkt));
        
        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Veglenkesegment> localVarReturnType = new ParameterizedTypeReference<Veglenkesegment>() {};
        return apiClient.invokeAPI("/api/v4/veglenkesekvenser/segmentert/{veglenkesekvensId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Hent en segmentert veglenkesekvens
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param veglenkesekvensId ID for veglenkesekvensen.
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param historisk For &#x60;false&#x60; returneres kun dagens veglenkesegmenter. For &#x60;true&#x60; returneres dagens og historiske veglenkesegmenter. Default er &#x60;false&#x60;.
     * @param tidspunkt Begrens spørring til det gitte tidspunktet.
     * @return List&lt;Veglenkesegment&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Veglenkesegment> getSegmentertVeglenkesekvens(@jakarta.annotation.Nonnull Long veglenkesekvensId, @jakarta.annotation.Nullable String srid, @jakarta.annotation.Nullable Boolean historisk, @jakarta.annotation.Nullable LocalDate tidspunkt) throws WebClientResponseException {
        ParameterizedTypeReference<Veglenkesegment> localVarReturnType = new ParameterizedTypeReference<Veglenkesegment>() {};
        return getSegmentertVeglenkesekvensRequestCreation(veglenkesekvensId, srid, historisk, tidspunkt).bodyToFlux(localVarReturnType);
    }

    /**
     * Hent en segmentert veglenkesekvens
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param veglenkesekvensId ID for veglenkesekvensen.
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param historisk For &#x60;false&#x60; returneres kun dagens veglenkesegmenter. For &#x60;true&#x60; returneres dagens og historiske veglenkesegmenter. Default er &#x60;false&#x60;.
     * @param tidspunkt Begrens spørring til det gitte tidspunktet.
     * @return ResponseEntity&lt;List&lt;Veglenkesegment&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Veglenkesegment>>> getSegmentertVeglenkesekvensWithHttpInfo(@jakarta.annotation.Nonnull Long veglenkesekvensId, @jakarta.annotation.Nullable String srid, @jakarta.annotation.Nullable Boolean historisk, @jakarta.annotation.Nullable LocalDate tidspunkt) throws WebClientResponseException {
        ParameterizedTypeReference<Veglenkesegment> localVarReturnType = new ParameterizedTypeReference<Veglenkesegment>() {};
        return getSegmentertVeglenkesekvensRequestCreation(veglenkesekvensId, srid, historisk, tidspunkt).toEntityList(localVarReturnType);
    }

    /**
     * Hent en segmentert veglenkesekvens
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param veglenkesekvensId ID for veglenkesekvensen.
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param historisk For &#x60;false&#x60; returneres kun dagens veglenkesegmenter. For &#x60;true&#x60; returneres dagens og historiske veglenkesegmenter. Default er &#x60;false&#x60;.
     * @param tidspunkt Begrens spørring til det gitte tidspunktet.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getSegmentertVeglenkesekvensWithResponseSpec(@jakarta.annotation.Nonnull Long veglenkesekvensId, @jakarta.annotation.Nullable String srid, @jakarta.annotation.Nullable Boolean historisk, @jakarta.annotation.Nullable LocalDate tidspunkt) throws WebClientResponseException {
        return getSegmentertVeglenkesekvensRequestCreation(veglenkesekvensId, srid, historisk, tidspunkt);
    }

    /**
     * Hent segmenterte veglenkesekvenser
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param ider Kommaseparert liste med IDer.
     * @param fylke Filtrer på fylke. Kommaseparert liste. Se [/omrader/api/v4/fylker](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;50&#x60;
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @param kontraktsomrade Filtrer på kontraktsomrade. Kommaseparert liste. Se [/omrader/api/v4/kontraktsomrader](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;1539 Tunnel- og bergsikr 2018-2023 Nordm og Romsd&#x60;
     * @param riksvegrute Filtrer på riksvegrute. Kommaseparert liste. Se [/omrader/api/v4/riksvegruter](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;RUTE4A&#x60; eller som enumid &#x60;20290&#x60;
     * @param vegforvalter Filtrer på vegforvalter. Kommaseparert liste. Se [/omrader/api/v4/vegforvaltere](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;Møre og Romsdal fylkeskommune&#x60; eller som enumid &#x60;21774&#x60;
     * @param vegsystemreferanse Filtrer på [vegsystemreferanse](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1 m12&#x60;
     * @param kartutsnitt Filtrer med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;.  Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60;
     * @param polygon Filtrer med polygon i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret).  Eksempel: &#x60;20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000&#x60;
     * @param detaljniva Filtrer på veglenkens detaljnivå (kortnavn fra datakatalogen). Kommaseparert liste.   Eksempel: &#x60;VT,VTKB&#x60;
     * @param typeveg Filtrer veglenker på type veg. Kommaseparert liste.  Eksempel: &#x60;kanalisertVeg, enkelBilveg, rampe, rundkjøring, bilferje, passasjerferje, gangOgSykkelveg, sykkelveg, gangveg, gågate, fortau, trapp, gangfelt, gatetun, traktorveg, sti, annet&#x60;
     * @param superid Hent detaljerte veglenkesegmenter stedfestet på veglenkesekvens med denne IDen.
     * @param adskiltelop Filtrer på om veglenkesegmentene er stedfestet hvor det er en Strekning med verdi satt for «adskilte løp».
     * @param kryssystem Filtrer på om de er stedfestet på samme sted hvor det er et Kryssystem.
     * @param sideanlegg Filtrer på om de er stedfestet på samme sted hvor det er et Sideanlegg.
     * @param veglenketype Filtrer på veglenken sin veglenketype. Kommaseparert liste.
     * @param arm Filtrer veglenker på om de er stedfestet på en Strekning med verdi satt for «arm».
     * @param trafikantgruppe Filtrer på trafikantgruppe.
     * @param geometritoleranse Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.
     * @param historisk For &#x60;false&#x60; returneres kun dagens veglenkesegmenter. For &#x60;true&#x60; returneres dagens og historiske veglenkesegmenter. Default er &#x60;false&#x60;.
     * @param tidspunkt Begrens spørring til det gitte tidspunktet.
     * @param antall Angir hvor mange objekter som skal returneres. Se også &#x60;sidestørrelse&#x60; i responsens &#x60;metadata&#x60;-objekt.
     * @param start Angir paginerings-start for objekter som skal returneres. Brukes sammen med &#x60;antall&#x60;. Neste start får man i metadata-feltet i responsen. Settes blankt for å starte fra begynnelsen.
     * @param inkluderAntall Hvorvidt totalt antall objekter skal returneres i responsen. Default er &#x60;false&#x60;.
     * @return VeglenkesegmenterSide
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getVeglenkesegmenterRequestCreation(@jakarta.annotation.Nullable String srid, @jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable Set<String> riksvegrute, @jakarta.annotation.Nullable Set<String> vegforvalter, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable String kartutsnitt, @jakarta.annotation.Nullable String polygon, @jakarta.annotation.Nullable Set<String> detaljniva, @jakarta.annotation.Nullable Set<String> typeveg, @jakarta.annotation.Nullable Long superid, @jakarta.annotation.Nullable Set<String> adskiltelop, @jakarta.annotation.Nullable Boolean kryssystem, @jakarta.annotation.Nullable Boolean sideanlegg, @jakarta.annotation.Nullable Set<String> veglenketype, @jakarta.annotation.Nullable Boolean arm, @jakarta.annotation.Nullable String trafikantgruppe, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable Boolean historisk, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable String start, @jakarta.annotation.Nullable Boolean inkluderAntall) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "srid", srid));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "ider", ider));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "fylke", fylke));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "kommune", kommune));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "kontraktsomrade", kontraktsomrade));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "riksvegrute", riksvegrute));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "vegforvalter", vegforvalter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "vegsystemreferanse", vegsystemreferanse));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "kartutsnitt", kartutsnitt));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "polygon", polygon));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "detaljniva", detaljniva));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "typeveg", typeveg));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "superid", superid));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "adskiltelop", adskiltelop));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "kryssystem", kryssystem));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sideanlegg", sideanlegg));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "veglenketype", veglenketype));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "arm", arm));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "trafikantgruppe", trafikantgruppe));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "geometritoleranse", geometritoleranse));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "historisk", historisk));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tidspunkt", tidspunkt));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "antall", antall));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start", start));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "inkluderAntall", inkluderAntall));
        
        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<VeglenkesegmenterSide> localVarReturnType = new ParameterizedTypeReference<VeglenkesegmenterSide>() {};
        return apiClient.invokeAPI("/api/v4/veglenkesekvenser/segmentert", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Hent segmenterte veglenkesekvenser
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param ider Kommaseparert liste med IDer.
     * @param fylke Filtrer på fylke. Kommaseparert liste. Se [/omrader/api/v4/fylker](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;50&#x60;
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @param kontraktsomrade Filtrer på kontraktsomrade. Kommaseparert liste. Se [/omrader/api/v4/kontraktsomrader](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;1539 Tunnel- og bergsikr 2018-2023 Nordm og Romsd&#x60;
     * @param riksvegrute Filtrer på riksvegrute. Kommaseparert liste. Se [/omrader/api/v4/riksvegruter](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;RUTE4A&#x60; eller som enumid &#x60;20290&#x60;
     * @param vegforvalter Filtrer på vegforvalter. Kommaseparert liste. Se [/omrader/api/v4/vegforvaltere](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;Møre og Romsdal fylkeskommune&#x60; eller som enumid &#x60;21774&#x60;
     * @param vegsystemreferanse Filtrer på [vegsystemreferanse](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1 m12&#x60;
     * @param kartutsnitt Filtrer med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;.  Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60;
     * @param polygon Filtrer med polygon i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret).  Eksempel: &#x60;20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000&#x60;
     * @param detaljniva Filtrer på veglenkens detaljnivå (kortnavn fra datakatalogen). Kommaseparert liste.   Eksempel: &#x60;VT,VTKB&#x60;
     * @param typeveg Filtrer veglenker på type veg. Kommaseparert liste.  Eksempel: &#x60;kanalisertVeg, enkelBilveg, rampe, rundkjøring, bilferje, passasjerferje, gangOgSykkelveg, sykkelveg, gangveg, gågate, fortau, trapp, gangfelt, gatetun, traktorveg, sti, annet&#x60;
     * @param superid Hent detaljerte veglenkesegmenter stedfestet på veglenkesekvens med denne IDen.
     * @param adskiltelop Filtrer på om veglenkesegmentene er stedfestet hvor det er en Strekning med verdi satt for «adskilte løp».
     * @param kryssystem Filtrer på om de er stedfestet på samme sted hvor det er et Kryssystem.
     * @param sideanlegg Filtrer på om de er stedfestet på samme sted hvor det er et Sideanlegg.
     * @param veglenketype Filtrer på veglenken sin veglenketype. Kommaseparert liste.
     * @param arm Filtrer veglenker på om de er stedfestet på en Strekning med verdi satt for «arm».
     * @param trafikantgruppe Filtrer på trafikantgruppe.
     * @param geometritoleranse Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.
     * @param historisk For &#x60;false&#x60; returneres kun dagens veglenkesegmenter. For &#x60;true&#x60; returneres dagens og historiske veglenkesegmenter. Default er &#x60;false&#x60;.
     * @param tidspunkt Begrens spørring til det gitte tidspunktet.
     * @param antall Angir hvor mange objekter som skal returneres. Se også &#x60;sidestørrelse&#x60; i responsens &#x60;metadata&#x60;-objekt.
     * @param start Angir paginerings-start for objekter som skal returneres. Brukes sammen med &#x60;antall&#x60;. Neste start får man i metadata-feltet i responsen. Settes blankt for å starte fra begynnelsen.
     * @param inkluderAntall Hvorvidt totalt antall objekter skal returneres i responsen. Default er &#x60;false&#x60;.
     * @return VeglenkesegmenterSide
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<VeglenkesegmenterSide> getVeglenkesegmenter(@jakarta.annotation.Nullable String srid, @jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable Set<String> riksvegrute, @jakarta.annotation.Nullable Set<String> vegforvalter, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable String kartutsnitt, @jakarta.annotation.Nullable String polygon, @jakarta.annotation.Nullable Set<String> detaljniva, @jakarta.annotation.Nullable Set<String> typeveg, @jakarta.annotation.Nullable Long superid, @jakarta.annotation.Nullable Set<String> adskiltelop, @jakarta.annotation.Nullable Boolean kryssystem, @jakarta.annotation.Nullable Boolean sideanlegg, @jakarta.annotation.Nullable Set<String> veglenketype, @jakarta.annotation.Nullable Boolean arm, @jakarta.annotation.Nullable String trafikantgruppe, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable Boolean historisk, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable String start, @jakarta.annotation.Nullable Boolean inkluderAntall) throws WebClientResponseException {
        ParameterizedTypeReference<VeglenkesegmenterSide> localVarReturnType = new ParameterizedTypeReference<VeglenkesegmenterSide>() {};
        return getVeglenkesegmenterRequestCreation(srid, ider, fylke, kommune, kontraktsomrade, riksvegrute, vegforvalter, vegsystemreferanse, kartutsnitt, polygon, detaljniva, typeveg, superid, adskiltelop, kryssystem, sideanlegg, veglenketype, arm, trafikantgruppe, geometritoleranse, historisk, tidspunkt, antall, start, inkluderAntall).bodyToMono(localVarReturnType);
    }

    /**
     * Hent segmenterte veglenkesekvenser
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param ider Kommaseparert liste med IDer.
     * @param fylke Filtrer på fylke. Kommaseparert liste. Se [/omrader/api/v4/fylker](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;50&#x60;
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @param kontraktsomrade Filtrer på kontraktsomrade. Kommaseparert liste. Se [/omrader/api/v4/kontraktsomrader](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;1539 Tunnel- og bergsikr 2018-2023 Nordm og Romsd&#x60;
     * @param riksvegrute Filtrer på riksvegrute. Kommaseparert liste. Se [/omrader/api/v4/riksvegruter](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;RUTE4A&#x60; eller som enumid &#x60;20290&#x60;
     * @param vegforvalter Filtrer på vegforvalter. Kommaseparert liste. Se [/omrader/api/v4/vegforvaltere](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;Møre og Romsdal fylkeskommune&#x60; eller som enumid &#x60;21774&#x60;
     * @param vegsystemreferanse Filtrer på [vegsystemreferanse](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1 m12&#x60;
     * @param kartutsnitt Filtrer med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;.  Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60;
     * @param polygon Filtrer med polygon i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret).  Eksempel: &#x60;20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000&#x60;
     * @param detaljniva Filtrer på veglenkens detaljnivå (kortnavn fra datakatalogen). Kommaseparert liste.   Eksempel: &#x60;VT,VTKB&#x60;
     * @param typeveg Filtrer veglenker på type veg. Kommaseparert liste.  Eksempel: &#x60;kanalisertVeg, enkelBilveg, rampe, rundkjøring, bilferje, passasjerferje, gangOgSykkelveg, sykkelveg, gangveg, gågate, fortau, trapp, gangfelt, gatetun, traktorveg, sti, annet&#x60;
     * @param superid Hent detaljerte veglenkesegmenter stedfestet på veglenkesekvens med denne IDen.
     * @param adskiltelop Filtrer på om veglenkesegmentene er stedfestet hvor det er en Strekning med verdi satt for «adskilte løp».
     * @param kryssystem Filtrer på om de er stedfestet på samme sted hvor det er et Kryssystem.
     * @param sideanlegg Filtrer på om de er stedfestet på samme sted hvor det er et Sideanlegg.
     * @param veglenketype Filtrer på veglenken sin veglenketype. Kommaseparert liste.
     * @param arm Filtrer veglenker på om de er stedfestet på en Strekning med verdi satt for «arm».
     * @param trafikantgruppe Filtrer på trafikantgruppe.
     * @param geometritoleranse Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.
     * @param historisk For &#x60;false&#x60; returneres kun dagens veglenkesegmenter. For &#x60;true&#x60; returneres dagens og historiske veglenkesegmenter. Default er &#x60;false&#x60;.
     * @param tidspunkt Begrens spørring til det gitte tidspunktet.
     * @param antall Angir hvor mange objekter som skal returneres. Se også &#x60;sidestørrelse&#x60; i responsens &#x60;metadata&#x60;-objekt.
     * @param start Angir paginerings-start for objekter som skal returneres. Brukes sammen med &#x60;antall&#x60;. Neste start får man i metadata-feltet i responsen. Settes blankt for å starte fra begynnelsen.
     * @param inkluderAntall Hvorvidt totalt antall objekter skal returneres i responsen. Default er &#x60;false&#x60;.
     * @return ResponseEntity&lt;VeglenkesegmenterSide&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<VeglenkesegmenterSide>> getVeglenkesegmenterWithHttpInfo(@jakarta.annotation.Nullable String srid, @jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable Set<String> riksvegrute, @jakarta.annotation.Nullable Set<String> vegforvalter, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable String kartutsnitt, @jakarta.annotation.Nullable String polygon, @jakarta.annotation.Nullable Set<String> detaljniva, @jakarta.annotation.Nullable Set<String> typeveg, @jakarta.annotation.Nullable Long superid, @jakarta.annotation.Nullable Set<String> adskiltelop, @jakarta.annotation.Nullable Boolean kryssystem, @jakarta.annotation.Nullable Boolean sideanlegg, @jakarta.annotation.Nullable Set<String> veglenketype, @jakarta.annotation.Nullable Boolean arm, @jakarta.annotation.Nullable String trafikantgruppe, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable Boolean historisk, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable String start, @jakarta.annotation.Nullable Boolean inkluderAntall) throws WebClientResponseException {
        ParameterizedTypeReference<VeglenkesegmenterSide> localVarReturnType = new ParameterizedTypeReference<VeglenkesegmenterSide>() {};
        return getVeglenkesegmenterRequestCreation(srid, ider, fylke, kommune, kontraktsomrade, riksvegrute, vegforvalter, vegsystemreferanse, kartutsnitt, polygon, detaljniva, typeveg, superid, adskiltelop, kryssystem, sideanlegg, veglenketype, arm, trafikantgruppe, geometritoleranse, historisk, tidspunkt, antall, start, inkluderAntall).toEntity(localVarReturnType);
    }

    /**
     * Hent segmenterte veglenkesekvenser
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param ider Kommaseparert liste med IDer.
     * @param fylke Filtrer på fylke. Kommaseparert liste. Se [/omrader/api/v4/fylker](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;50&#x60;
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @param kontraktsomrade Filtrer på kontraktsomrade. Kommaseparert liste. Se [/omrader/api/v4/kontraktsomrader](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;1539 Tunnel- og bergsikr 2018-2023 Nordm og Romsd&#x60;
     * @param riksvegrute Filtrer på riksvegrute. Kommaseparert liste. Se [/omrader/api/v4/riksvegruter](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;RUTE4A&#x60; eller som enumid &#x60;20290&#x60;
     * @param vegforvalter Filtrer på vegforvalter. Kommaseparert liste. Se [/omrader/api/v4/vegforvaltere](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;Møre og Romsdal fylkeskommune&#x60; eller som enumid &#x60;21774&#x60;
     * @param vegsystemreferanse Filtrer på [vegsystemreferanse](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1 m12&#x60;
     * @param kartutsnitt Filtrer med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;.  Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60;
     * @param polygon Filtrer med polygon i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret).  Eksempel: &#x60;20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000&#x60;
     * @param detaljniva Filtrer på veglenkens detaljnivå (kortnavn fra datakatalogen). Kommaseparert liste.   Eksempel: &#x60;VT,VTKB&#x60;
     * @param typeveg Filtrer veglenker på type veg. Kommaseparert liste.  Eksempel: &#x60;kanalisertVeg, enkelBilveg, rampe, rundkjøring, bilferje, passasjerferje, gangOgSykkelveg, sykkelveg, gangveg, gågate, fortau, trapp, gangfelt, gatetun, traktorveg, sti, annet&#x60;
     * @param superid Hent detaljerte veglenkesegmenter stedfestet på veglenkesekvens med denne IDen.
     * @param adskiltelop Filtrer på om veglenkesegmentene er stedfestet hvor det er en Strekning med verdi satt for «adskilte løp».
     * @param kryssystem Filtrer på om de er stedfestet på samme sted hvor det er et Kryssystem.
     * @param sideanlegg Filtrer på om de er stedfestet på samme sted hvor det er et Sideanlegg.
     * @param veglenketype Filtrer på veglenken sin veglenketype. Kommaseparert liste.
     * @param arm Filtrer veglenker på om de er stedfestet på en Strekning med verdi satt for «arm».
     * @param trafikantgruppe Filtrer på trafikantgruppe.
     * @param geometritoleranse Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.
     * @param historisk For &#x60;false&#x60; returneres kun dagens veglenkesegmenter. For &#x60;true&#x60; returneres dagens og historiske veglenkesegmenter. Default er &#x60;false&#x60;.
     * @param tidspunkt Begrens spørring til det gitte tidspunktet.
     * @param antall Angir hvor mange objekter som skal returneres. Se også &#x60;sidestørrelse&#x60; i responsens &#x60;metadata&#x60;-objekt.
     * @param start Angir paginerings-start for objekter som skal returneres. Brukes sammen med &#x60;antall&#x60;. Neste start får man i metadata-feltet i responsen. Settes blankt for å starte fra begynnelsen.
     * @param inkluderAntall Hvorvidt totalt antall objekter skal returneres i responsen. Default er &#x60;false&#x60;.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getVeglenkesegmenterWithResponseSpec(@jakarta.annotation.Nullable String srid, @jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable Set<String> riksvegrute, @jakarta.annotation.Nullable Set<String> vegforvalter, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable String kartutsnitt, @jakarta.annotation.Nullable String polygon, @jakarta.annotation.Nullable Set<String> detaljniva, @jakarta.annotation.Nullable Set<String> typeveg, @jakarta.annotation.Nullable Long superid, @jakarta.annotation.Nullable Set<String> adskiltelop, @jakarta.annotation.Nullable Boolean kryssystem, @jakarta.annotation.Nullable Boolean sideanlegg, @jakarta.annotation.Nullable Set<String> veglenketype, @jakarta.annotation.Nullable Boolean arm, @jakarta.annotation.Nullable String trafikantgruppe, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable Boolean historisk, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable String start, @jakarta.annotation.Nullable Boolean inkluderAntall) throws WebClientResponseException {
        return getVeglenkesegmenterRequestCreation(srid, ider, fylke, kommune, kontraktsomrade, riksvegrute, vegforvalter, vegsystemreferanse, kartutsnitt, polygon, detaljniva, typeveg, superid, adskiltelop, kryssystem, sideanlegg, veglenketype, arm, trafikantgruppe, geometritoleranse, historisk, tidspunkt, antall, start, inkluderAntall);
    }

    /**
     * Hent en veglenkesekvens
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param veglenkesekvensId ID for veglenkesekvensen.
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @return Veglenkesekvens
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getVeglenkesekvensRequestCreation(@jakarta.annotation.Nonnull Long veglenkesekvensId, @jakarta.annotation.Nullable String srid) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'veglenkesekvensId' is set
        if (veglenkesekvensId == null) {
            throw new WebClientResponseException("Missing the required parameter 'veglenkesekvensId' when calling getVeglenkesekvens", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("veglenkesekvensId", veglenkesekvensId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "srid", srid));
        
        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Veglenkesekvens> localVarReturnType = new ParameterizedTypeReference<Veglenkesekvens>() {};
        return apiClient.invokeAPI("/api/v4/veglenkesekvenser/{veglenkesekvensId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Hent en veglenkesekvens
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param veglenkesekvensId ID for veglenkesekvensen.
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @return Veglenkesekvens
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Veglenkesekvens> getVeglenkesekvens(@jakarta.annotation.Nonnull Long veglenkesekvensId, @jakarta.annotation.Nullable String srid) throws WebClientResponseException {
        ParameterizedTypeReference<Veglenkesekvens> localVarReturnType = new ParameterizedTypeReference<Veglenkesekvens>() {};
        return getVeglenkesekvensRequestCreation(veglenkesekvensId, srid).bodyToMono(localVarReturnType);
    }

    /**
     * Hent en veglenkesekvens
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param veglenkesekvensId ID for veglenkesekvensen.
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @return ResponseEntity&lt;Veglenkesekvens&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Veglenkesekvens>> getVeglenkesekvensWithHttpInfo(@jakarta.annotation.Nonnull Long veglenkesekvensId, @jakarta.annotation.Nullable String srid) throws WebClientResponseException {
        ParameterizedTypeReference<Veglenkesekvens> localVarReturnType = new ParameterizedTypeReference<Veglenkesekvens>() {};
        return getVeglenkesekvensRequestCreation(veglenkesekvensId, srid).toEntity(localVarReturnType);
    }

    /**
     * Hent en veglenkesekvens
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param veglenkesekvensId ID for veglenkesekvensen.
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getVeglenkesekvensWithResponseSpec(@jakarta.annotation.Nonnull Long veglenkesekvensId, @jakarta.annotation.Nullable String srid) throws WebClientResponseException {
        return getVeglenkesekvensRequestCreation(veglenkesekvensId, srid);
    }

    /**
     * Hent veglenkesekvenser
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param ider Kommaseparert liste med IDer.
     * @param fylke Filtrer på fylke. Kommaseparert liste. Se [/omrader/api/v4/fylker](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;50&#x60;
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @param kontraktsomrade Filtrer på kontraktsomrade. Kommaseparert liste. Se [/omrader/api/v4/kontraktsomrader](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;1539 Tunnel- og bergsikr 2018-2023 Nordm og Romsd&#x60;
     * @param riksvegrute Filtrer på riksvegrute. Kommaseparert liste. Se [/omrader/api/v4/riksvegruter](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;RUTE4A&#x60; eller som enumid &#x60;20290&#x60;
     * @param vegsystemreferanse Filtrer på [vegsystemreferanse](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1 m12&#x60;
     * @param topologiniva Hent kun elementer på det gitte topologinivået. - Dersom en veglenke har nivå vegtrasé er ofte feltet for topologinivå ikke tilstede. Man vil da få alle veglenker som ikke har verdi &#x60;kjørefelt&#x60; eller &#x60;kjørebane&#x60;.
     * @param superid Hent detaljerte veglenkesekvenser stedfestet på veglenkesekvens med denne IDen.
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param antall Angir hvor mange objekter som skal returneres. Se også &#x60;sidestørrelse&#x60; i responsens &#x60;metadata&#x60;-objekt.
     * @param start Angir paginerings-start for objekter som skal returneres. Brukes sammen med &#x60;antall&#x60;. Neste start får man i metadata-feltet i responsen. Settes blankt for å starte fra begynnelsen.
     * @param inkluderAntall Hvorvidt totalt antall objekter skal returneres i responsen. Default er &#x60;false&#x60;.
     * @return VeglenkesekvenserSide
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getVeglenkesekvenserRequestCreation(@jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable Set<String> riksvegrute, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable String topologiniva, @jakarta.annotation.Nullable Long superid, @jakarta.annotation.Nullable String srid, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable String start, @jakarta.annotation.Nullable Boolean inkluderAntall) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "ider", ider));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "fylke", fylke));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "kommune", kommune));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "kontraktsomrade", kontraktsomrade));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "riksvegrute", riksvegrute));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "vegsystemreferanse", vegsystemreferanse));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "topologiniva", topologiniva));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "superid", superid));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "srid", srid));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "antall", antall));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start", start));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "inkluderAntall", inkluderAntall));
        
        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<VeglenkesekvenserSide> localVarReturnType = new ParameterizedTypeReference<VeglenkesekvenserSide>() {};
        return apiClient.invokeAPI("/api/v4/veglenkesekvenser", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Hent veglenkesekvenser
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param ider Kommaseparert liste med IDer.
     * @param fylke Filtrer på fylke. Kommaseparert liste. Se [/omrader/api/v4/fylker](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;50&#x60;
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @param kontraktsomrade Filtrer på kontraktsomrade. Kommaseparert liste. Se [/omrader/api/v4/kontraktsomrader](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;1539 Tunnel- og bergsikr 2018-2023 Nordm og Romsd&#x60;
     * @param riksvegrute Filtrer på riksvegrute. Kommaseparert liste. Se [/omrader/api/v4/riksvegruter](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;RUTE4A&#x60; eller som enumid &#x60;20290&#x60;
     * @param vegsystemreferanse Filtrer på [vegsystemreferanse](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1 m12&#x60;
     * @param topologiniva Hent kun elementer på det gitte topologinivået. - Dersom en veglenke har nivå vegtrasé er ofte feltet for topologinivå ikke tilstede. Man vil da få alle veglenker som ikke har verdi &#x60;kjørefelt&#x60; eller &#x60;kjørebane&#x60;.
     * @param superid Hent detaljerte veglenkesekvenser stedfestet på veglenkesekvens med denne IDen.
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param antall Angir hvor mange objekter som skal returneres. Se også &#x60;sidestørrelse&#x60; i responsens &#x60;metadata&#x60;-objekt.
     * @param start Angir paginerings-start for objekter som skal returneres. Brukes sammen med &#x60;antall&#x60;. Neste start får man i metadata-feltet i responsen. Settes blankt for å starte fra begynnelsen.
     * @param inkluderAntall Hvorvidt totalt antall objekter skal returneres i responsen. Default er &#x60;false&#x60;.
     * @return VeglenkesekvenserSide
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<VeglenkesekvenserSide> getVeglenkesekvenser(@jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable Set<String> riksvegrute, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable String topologiniva, @jakarta.annotation.Nullable Long superid, @jakarta.annotation.Nullable String srid, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable String start, @jakarta.annotation.Nullable Boolean inkluderAntall) throws WebClientResponseException {
        ParameterizedTypeReference<VeglenkesekvenserSide> localVarReturnType = new ParameterizedTypeReference<VeglenkesekvenserSide>() {};
        return getVeglenkesekvenserRequestCreation(ider, fylke, kommune, kontraktsomrade, riksvegrute, vegsystemreferanse, topologiniva, superid, srid, antall, start, inkluderAntall).bodyToMono(localVarReturnType);
    }

    /**
     * Hent veglenkesekvenser
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param ider Kommaseparert liste med IDer.
     * @param fylke Filtrer på fylke. Kommaseparert liste. Se [/omrader/api/v4/fylker](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;50&#x60;
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @param kontraktsomrade Filtrer på kontraktsomrade. Kommaseparert liste. Se [/omrader/api/v4/kontraktsomrader](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;1539 Tunnel- og bergsikr 2018-2023 Nordm og Romsd&#x60;
     * @param riksvegrute Filtrer på riksvegrute. Kommaseparert liste. Se [/omrader/api/v4/riksvegruter](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;RUTE4A&#x60; eller som enumid &#x60;20290&#x60;
     * @param vegsystemreferanse Filtrer på [vegsystemreferanse](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1 m12&#x60;
     * @param topologiniva Hent kun elementer på det gitte topologinivået. - Dersom en veglenke har nivå vegtrasé er ofte feltet for topologinivå ikke tilstede. Man vil da få alle veglenker som ikke har verdi &#x60;kjørefelt&#x60; eller &#x60;kjørebane&#x60;.
     * @param superid Hent detaljerte veglenkesekvenser stedfestet på veglenkesekvens med denne IDen.
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param antall Angir hvor mange objekter som skal returneres. Se også &#x60;sidestørrelse&#x60; i responsens &#x60;metadata&#x60;-objekt.
     * @param start Angir paginerings-start for objekter som skal returneres. Brukes sammen med &#x60;antall&#x60;. Neste start får man i metadata-feltet i responsen. Settes blankt for å starte fra begynnelsen.
     * @param inkluderAntall Hvorvidt totalt antall objekter skal returneres i responsen. Default er &#x60;false&#x60;.
     * @return ResponseEntity&lt;VeglenkesekvenserSide&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<VeglenkesekvenserSide>> getVeglenkesekvenserWithHttpInfo(@jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable Set<String> riksvegrute, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable String topologiniva, @jakarta.annotation.Nullable Long superid, @jakarta.annotation.Nullable String srid, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable String start, @jakarta.annotation.Nullable Boolean inkluderAntall) throws WebClientResponseException {
        ParameterizedTypeReference<VeglenkesekvenserSide> localVarReturnType = new ParameterizedTypeReference<VeglenkesekvenserSide>() {};
        return getVeglenkesekvenserRequestCreation(ider, fylke, kommune, kontraktsomrade, riksvegrute, vegsystemreferanse, topologiniva, superid, srid, antall, start, inkluderAntall).toEntity(localVarReturnType);
    }

    /**
     * Hent veglenkesekvenser
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param ider Kommaseparert liste med IDer.
     * @param fylke Filtrer på fylke. Kommaseparert liste. Se [/omrader/api/v4/fylker](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;50&#x60;
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @param kontraktsomrade Filtrer på kontraktsomrade. Kommaseparert liste. Se [/omrader/api/v4/kontraktsomrader](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;1539 Tunnel- og bergsikr 2018-2023 Nordm og Romsd&#x60;
     * @param riksvegrute Filtrer på riksvegrute. Kommaseparert liste. Se [/omrader/api/v4/riksvegruter](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;RUTE4A&#x60; eller som enumid &#x60;20290&#x60;
     * @param vegsystemreferanse Filtrer på [vegsystemreferanse](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1 m12&#x60;
     * @param topologiniva Hent kun elementer på det gitte topologinivået. - Dersom en veglenke har nivå vegtrasé er ofte feltet for topologinivå ikke tilstede. Man vil da få alle veglenker som ikke har verdi &#x60;kjørefelt&#x60; eller &#x60;kjørebane&#x60;.
     * @param superid Hent detaljerte veglenkesekvenser stedfestet på veglenkesekvens med denne IDen.
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param antall Angir hvor mange objekter som skal returneres. Se også &#x60;sidestørrelse&#x60; i responsens &#x60;metadata&#x60;-objekt.
     * @param start Angir paginerings-start for objekter som skal returneres. Brukes sammen med &#x60;antall&#x60;. Neste start får man i metadata-feltet i responsen. Settes blankt for å starte fra begynnelsen.
     * @param inkluderAntall Hvorvidt totalt antall objekter skal returneres i responsen. Default er &#x60;false&#x60;.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getVeglenkesekvenserWithResponseSpec(@jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable Set<String> riksvegrute, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable String topologiniva, @jakarta.annotation.Nullable Long superid, @jakarta.annotation.Nullable String srid, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable String start, @jakarta.annotation.Nullable Boolean inkluderAntall) throws WebClientResponseException {
        return getVeglenkesekvenserRequestCreation(ider, fylke, kommune, kontraktsomrade, riksvegrute, vegsystemreferanse, topologiniva, superid, srid, antall, start, inkluderAntall);
    }
}

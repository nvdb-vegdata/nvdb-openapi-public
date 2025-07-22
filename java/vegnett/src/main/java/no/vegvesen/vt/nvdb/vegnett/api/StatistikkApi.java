package no.vegvesen.vt.nvdb.vegnett.api;

import no.vegvesen.vt.nvdb.vegnett.infrastructure.ApiClient;

import no.vegvesen.vt.nvdb.vegnett.model.Gruppering;
import no.vegvesen.vt.nvdb.vegnett.model.ProblemDetail;
import no.vegvesen.vt.nvdb.vegnett.model.SridParameter;
import no.vegvesen.vt.nvdb.vegnett.model.VeglenkesegmenterStatistikkGruppert;

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
     * Hent statistikk for segmentert vegnett, gruppert på en eller flere felter
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param gruppering Velg en eller flere felter som statistikken skal grupperes på.
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param kartutsnitt Filtrer med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;.  Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60;
     * @return List&lt;VeglenkesegmenterStatistikkGruppert&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getVeglenkesegmenterStatistikkGruppertRequestCreation(@jakarta.annotation.Nonnull List<Gruppering> gruppering, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable String kartutsnitt) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'gruppering' is set
        if (gruppering == null) {
            throw new WebClientResponseException("Missing the required parameter 'gruppering' when calling getVeglenkesegmenterStatistikkGruppert", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "srid", srid));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "kartutsnitt", kartutsnitt));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "gruppering", gruppering));
        
        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<VeglenkesegmenterStatistikkGruppert> localVarReturnType = new ParameterizedTypeReference<VeglenkesegmenterStatistikkGruppert>() {};
        return apiClient.invokeAPI("/api/v4/veglenkesekvenser/segmentert/statistikk/gruppert", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Hent statistikk for segmentert vegnett, gruppert på en eller flere felter
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param gruppering Velg en eller flere felter som statistikken skal grupperes på.
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param kartutsnitt Filtrer med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;.  Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60;
     * @return List&lt;VeglenkesegmenterStatistikkGruppert&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<VeglenkesegmenterStatistikkGruppert> getVeglenkesegmenterStatistikkGruppert(@jakarta.annotation.Nonnull List<Gruppering> gruppering, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable String kartutsnitt) throws WebClientResponseException {
        ParameterizedTypeReference<VeglenkesegmenterStatistikkGruppert> localVarReturnType = new ParameterizedTypeReference<VeglenkesegmenterStatistikkGruppert>() {};
        return getVeglenkesegmenterStatistikkGruppertRequestCreation(gruppering, srid, kartutsnitt).bodyToFlux(localVarReturnType);
    }

    /**
     * Hent statistikk for segmentert vegnett, gruppert på en eller flere felter
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param gruppering Velg en eller flere felter som statistikken skal grupperes på.
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param kartutsnitt Filtrer med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;.  Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60;
     * @return ResponseEntity&lt;List&lt;VeglenkesegmenterStatistikkGruppert&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<VeglenkesegmenterStatistikkGruppert>>> getVeglenkesegmenterStatistikkGruppertWithHttpInfo(@jakarta.annotation.Nonnull List<Gruppering> gruppering, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable String kartutsnitt) throws WebClientResponseException {
        ParameterizedTypeReference<VeglenkesegmenterStatistikkGruppert> localVarReturnType = new ParameterizedTypeReference<VeglenkesegmenterStatistikkGruppert>() {};
        return getVeglenkesegmenterStatistikkGruppertRequestCreation(gruppering, srid, kartutsnitt).toEntityList(localVarReturnType);
    }

    /**
     * Hent statistikk for segmentert vegnett, gruppert på en eller flere felter
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param gruppering Velg en eller flere felter som statistikken skal grupperes på.
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param kartutsnitt Filtrer med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;.  Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60;
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getVeglenkesegmenterStatistikkGruppertWithResponseSpec(@jakarta.annotation.Nonnull List<Gruppering> gruppering, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable String kartutsnitt) throws WebClientResponseException {
        return getVeglenkesegmenterStatistikkGruppertRequestCreation(gruppering, srid, kartutsnitt);
    }
}

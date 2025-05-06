package no.vegvesen.nvdb.datakatalog.api;

import no.vegvesen.nvdb.datakatalog.ApiClient;

import no.vegvesen.nvdb.datakatalog.model.Egenskapstype;
import no.vegvesen.nvdb.datakatalog.model.EgenskapstypeKategori;
import no.vegvesen.nvdb.datakatalog.model.Enhet;
import no.vegvesen.nvdb.datakatalog.model.Kategori;
import no.vegvesen.nvdb.datakatalog.model.ProblemDetail;
import no.vegvesen.nvdb.datakatalog.model.ProductSpecification;
import no.vegvesen.nvdb.datakatalog.model.Vegobjekttype;
import no.vegvesen.nvdb.datakatalog.model.Versjon;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class DatakatalogenApi {
    private ApiClient apiClient;

    public DatakatalogenApi() {
        this(new ApiClient());
    }

    @Autowired
    public DatakatalogenApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Returnerer angitt egenskapstype
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param egenskapstypeid The egenskapstypeid parameter
     * @return Egenskapstype
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getEgenskapstypeRequestCreation(@javax.annotation.Nonnull Integer egenskapstypeid) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'egenskapstypeid' is set
        if (egenskapstypeid == null) {
            throw new WebClientResponseException("Missing the required parameter 'egenskapstypeid' when calling getEgenskapstype", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("egenskapstypeid", egenskapstypeid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Egenskapstype> localVarReturnType = new ParameterizedTypeReference<Egenskapstype>() {};
        return apiClient.invokeAPI("/api/v1/egenskapstyper/{egenskapstypeid}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Returnerer angitt egenskapstype
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param egenskapstypeid The egenskapstypeid parameter
     * @return Egenskapstype
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Egenskapstype> getEgenskapstype(@javax.annotation.Nonnull Integer egenskapstypeid) throws WebClientResponseException {
        ParameterizedTypeReference<Egenskapstype> localVarReturnType = new ParameterizedTypeReference<Egenskapstype>() {};
        return getEgenskapstypeRequestCreation(egenskapstypeid).bodyToMono(localVarReturnType);
    }

    /**
     * Returnerer angitt egenskapstype
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param egenskapstypeid The egenskapstypeid parameter
     * @return ResponseEntity&lt;Egenskapstype&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Egenskapstype>> getEgenskapstypeWithHttpInfo(@javax.annotation.Nonnull Integer egenskapstypeid) throws WebClientResponseException {
        ParameterizedTypeReference<Egenskapstype> localVarReturnType = new ParameterizedTypeReference<Egenskapstype>() {};
        return getEgenskapstypeRequestCreation(egenskapstypeid).toEntity(localVarReturnType);
    }

    /**
     * Returnerer angitt egenskapstype
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param egenskapstypeid The egenskapstypeid parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getEgenskapstypeWithResponseSpec(@javax.annotation.Nonnull Integer egenskapstypeid) throws WebClientResponseException {
        return getEgenskapstypeRequestCreation(egenskapstypeid);
    }

    /**
     * Returnerer angitt egenskapstype for angitt vegobjekttype
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param vegobjekttypeid The vegobjekttypeid parameter
     * @param egenskapstypeid The egenskapstypeid parameter
     * @return Egenskapstype
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getEgenskapstypeForVegobjekttypeRequestCreation(@javax.annotation.Nonnull Integer vegobjekttypeid, @javax.annotation.Nonnull Integer egenskapstypeid) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'vegobjekttypeid' is set
        if (vegobjekttypeid == null) {
            throw new WebClientResponseException("Missing the required parameter 'vegobjekttypeid' when calling getEgenskapstypeForVegobjekttype", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'egenskapstypeid' is set
        if (egenskapstypeid == null) {
            throw new WebClientResponseException("Missing the required parameter 'egenskapstypeid' when calling getEgenskapstypeForVegobjekttype", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("vegobjekttypeid", vegobjekttypeid);
        pathParams.put("egenskapstypeid", egenskapstypeid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Egenskapstype> localVarReturnType = new ParameterizedTypeReference<Egenskapstype>() {};
        return apiClient.invokeAPI("/api/v1/vegobjekttyper/{vegobjekttypeid}/{egenskapstypeid}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Returnerer angitt egenskapstype for angitt vegobjekttype
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param vegobjekttypeid The vegobjekttypeid parameter
     * @param egenskapstypeid The egenskapstypeid parameter
     * @return Egenskapstype
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Egenskapstype> getEgenskapstypeForVegobjekttype(@javax.annotation.Nonnull Integer vegobjekttypeid, @javax.annotation.Nonnull Integer egenskapstypeid) throws WebClientResponseException {
        ParameterizedTypeReference<Egenskapstype> localVarReturnType = new ParameterizedTypeReference<Egenskapstype>() {};
        return getEgenskapstypeForVegobjekttypeRequestCreation(vegobjekttypeid, egenskapstypeid).bodyToMono(localVarReturnType);
    }

    /**
     * Returnerer angitt egenskapstype for angitt vegobjekttype
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param vegobjekttypeid The vegobjekttypeid parameter
     * @param egenskapstypeid The egenskapstypeid parameter
     * @return ResponseEntity&lt;Egenskapstype&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Egenskapstype>> getEgenskapstypeForVegobjekttypeWithHttpInfo(@javax.annotation.Nonnull Integer vegobjekttypeid, @javax.annotation.Nonnull Integer egenskapstypeid) throws WebClientResponseException {
        ParameterizedTypeReference<Egenskapstype> localVarReturnType = new ParameterizedTypeReference<Egenskapstype>() {};
        return getEgenskapstypeForVegobjekttypeRequestCreation(vegobjekttypeid, egenskapstypeid).toEntity(localVarReturnType);
    }

    /**
     * Returnerer angitt egenskapstype for angitt vegobjekttype
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param vegobjekttypeid The vegobjekttypeid parameter
     * @param egenskapstypeid The egenskapstypeid parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getEgenskapstypeForVegobjekttypeWithResponseSpec(@javax.annotation.Nonnull Integer vegobjekttypeid, @javax.annotation.Nonnull Integer egenskapstypeid) throws WebClientResponseException {
        return getEgenskapstypeForVegobjekttypeRequestCreation(vegobjekttypeid, egenskapstypeid);
    }

    /**
     * Returnerer alle kategorier for egenskapstypene
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @return List&lt;EgenskapstypeKategori&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getEgenskapstypeKategorierRequestCreation() throws WebClientResponseException {
        Object postBody = null;
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
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<EgenskapstypeKategori> localVarReturnType = new ParameterizedTypeReference<EgenskapstypeKategori>() {};
        return apiClient.invokeAPI("/api/v1/egenskapstypekategorier", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Returnerer alle kategorier for egenskapstypene
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @return List&lt;EgenskapstypeKategori&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<EgenskapstypeKategori> getEgenskapstypeKategorier() throws WebClientResponseException {
        ParameterizedTypeReference<EgenskapstypeKategori> localVarReturnType = new ParameterizedTypeReference<EgenskapstypeKategori>() {};
        return getEgenskapstypeKategorierRequestCreation().bodyToFlux(localVarReturnType);
    }

    /**
     * Returnerer alle kategorier for egenskapstypene
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;List&lt;EgenskapstypeKategori&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<EgenskapstypeKategori>>> getEgenskapstypeKategorierWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<EgenskapstypeKategori> localVarReturnType = new ParameterizedTypeReference<EgenskapstypeKategori>() {};
        return getEgenskapstypeKategorierRequestCreation().toEntityList(localVarReturnType);
    }

    /**
     * Returnerer alle kategorier for egenskapstypene
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getEgenskapstypeKategorierWithResponseSpec() throws WebClientResponseException {
        return getEgenskapstypeKategorierRequestCreation();
    }

    /**
     * Returnerer alle enheter
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @return List&lt;Enhet&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getEnheterRequestCreation() throws WebClientResponseException {
        Object postBody = null;
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
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Enhet> localVarReturnType = new ParameterizedTypeReference<Enhet>() {};
        return apiClient.invokeAPI("/api/v1/enheter", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Returnerer alle enheter
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @return List&lt;Enhet&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Enhet> getEnheter() throws WebClientResponseException {
        ParameterizedTypeReference<Enhet> localVarReturnType = new ParameterizedTypeReference<Enhet>() {};
        return getEnheterRequestCreation().bodyToFlux(localVarReturnType);
    }

    /**
     * Returnerer alle enheter
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;List&lt;Enhet&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Enhet>>> getEnheterWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<Enhet> localVarReturnType = new ParameterizedTypeReference<Enhet>() {};
        return getEnheterRequestCreation().toEntityList(localVarReturnType);
    }

    /**
     * Returnerer alle enheter
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getEnheterWithResponseSpec() throws WebClientResponseException {
        return getEnheterRequestCreation();
    }

    /**
     * Returnerer alle kategorier for vegobjekter
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @return List&lt;Kategori&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getKategorierRequestCreation() throws WebClientResponseException {
        Object postBody = null;
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
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Kategori> localVarReturnType = new ParameterizedTypeReference<Kategori>() {};
        return apiClient.invokeAPI("/api/v1/kategorier", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Returnerer alle kategorier for vegobjekter
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @return List&lt;Kategori&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Kategori> getKategorier() throws WebClientResponseException {
        ParameterizedTypeReference<Kategori> localVarReturnType = new ParameterizedTypeReference<Kategori>() {};
        return getKategorierRequestCreation().bodyToFlux(localVarReturnType);
    }

    /**
     * Returnerer alle kategorier for vegobjekter
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;List&lt;Kategori&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Kategori>>> getKategorierWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<Kategori> localVarReturnType = new ParameterizedTypeReference<Kategori>() {};
        return getKategorierRequestCreation().toEntityList(localVarReturnType);
    }

    /**
     * Returnerer alle kategorier for vegobjekter
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getKategorierWithResponseSpec() throws WebClientResponseException {
        return getKategorierRequestCreation();
    }

    /**
     * Returnerer produktspesifikasjonen til den angitte vegobjekttypen
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param vegobjekttypeid The vegobjekttypeid parameter
     * @return ProductSpecification
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getProduktspesifikasjonRequestCreation(@javax.annotation.Nonnull Integer vegobjekttypeid) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'vegobjekttypeid' is set
        if (vegobjekttypeid == null) {
            throw new WebClientResponseException("Missing the required parameter 'vegobjekttypeid' when calling getProduktspesifikasjon", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("vegobjekttypeid", vegobjekttypeid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ProductSpecification> localVarReturnType = new ParameterizedTypeReference<ProductSpecification>() {};
        return apiClient.invokeAPI("/api/v1/vegobjekttyper/{vegobjekttypeid}/produktspesifikasjon", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Returnerer produktspesifikasjonen til den angitte vegobjekttypen
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param vegobjekttypeid The vegobjekttypeid parameter
     * @return ProductSpecification
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ProductSpecification> getProduktspesifikasjon(@javax.annotation.Nonnull Integer vegobjekttypeid) throws WebClientResponseException {
        ParameterizedTypeReference<ProductSpecification> localVarReturnType = new ParameterizedTypeReference<ProductSpecification>() {};
        return getProduktspesifikasjonRequestCreation(vegobjekttypeid).bodyToMono(localVarReturnType);
    }

    /**
     * Returnerer produktspesifikasjonen til den angitte vegobjekttypen
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param vegobjekttypeid The vegobjekttypeid parameter
     * @return ResponseEntity&lt;ProductSpecification&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ProductSpecification>> getProduktspesifikasjonWithHttpInfo(@javax.annotation.Nonnull Integer vegobjekttypeid) throws WebClientResponseException {
        ParameterizedTypeReference<ProductSpecification> localVarReturnType = new ParameterizedTypeReference<ProductSpecification>() {};
        return getProduktspesifikasjonRequestCreation(vegobjekttypeid).toEntity(localVarReturnType);
    }

    /**
     * Returnerer produktspesifikasjonen til den angitte vegobjekttypen
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param vegobjekttypeid The vegobjekttypeid parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getProduktspesifikasjonWithResponseSpec(@javax.annotation.Nonnull Integer vegobjekttypeid) throws WebClientResponseException {
        return getProduktspesifikasjonRequestCreation(vegobjekttypeid);
    }

    /**
     * Returnerer angitt vegobjekttype
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param vegobjekttypeid The vegobjekttypeid parameter
     * @param inkluder Kommaseparert liste med hvilke informasjonsfelter som skal inkluderes i tillegg til vegobjekttypenes metadata.
     * @return Vegobjekttype
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getVegobjekttypeRequestCreation(@javax.annotation.Nonnull Integer vegobjekttypeid, @javax.annotation.Nullable List<String> inkluder) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'vegobjekttypeid' is set
        if (vegobjekttypeid == null) {
            throw new WebClientResponseException("Missing the required parameter 'vegobjekttypeid' when calling getVegobjekttype", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("vegobjekttypeid", vegobjekttypeid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "inkluder", inkluder));
        
        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Vegobjekttype> localVarReturnType = new ParameterizedTypeReference<Vegobjekttype>() {};
        return apiClient.invokeAPI("/api/v1/vegobjekttyper/{vegobjekttypeid}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Returnerer angitt vegobjekttype
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param vegobjekttypeid The vegobjekttypeid parameter
     * @param inkluder Kommaseparert liste med hvilke informasjonsfelter som skal inkluderes i tillegg til vegobjekttypenes metadata.
     * @return Vegobjekttype
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Vegobjekttype> getVegobjekttype(@javax.annotation.Nonnull Integer vegobjekttypeid, @javax.annotation.Nullable List<String> inkluder) throws WebClientResponseException {
        ParameterizedTypeReference<Vegobjekttype> localVarReturnType = new ParameterizedTypeReference<Vegobjekttype>() {};
        return getVegobjekttypeRequestCreation(vegobjekttypeid, inkluder).bodyToMono(localVarReturnType);
    }

    /**
     * Returnerer angitt vegobjekttype
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param vegobjekttypeid The vegobjekttypeid parameter
     * @param inkluder Kommaseparert liste med hvilke informasjonsfelter som skal inkluderes i tillegg til vegobjekttypenes metadata.
     * @return ResponseEntity&lt;Vegobjekttype&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Vegobjekttype>> getVegobjekttypeWithHttpInfo(@javax.annotation.Nonnull Integer vegobjekttypeid, @javax.annotation.Nullable List<String> inkluder) throws WebClientResponseException {
        ParameterizedTypeReference<Vegobjekttype> localVarReturnType = new ParameterizedTypeReference<Vegobjekttype>() {};
        return getVegobjekttypeRequestCreation(vegobjekttypeid, inkluder).toEntity(localVarReturnType);
    }

    /**
     * Returnerer angitt vegobjekttype
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param vegobjekttypeid The vegobjekttypeid parameter
     * @param inkluder Kommaseparert liste med hvilke informasjonsfelter som skal inkluderes i tillegg til vegobjekttypenes metadata.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getVegobjekttypeWithResponseSpec(@javax.annotation.Nonnull Integer vegobjekttypeid, @javax.annotation.Nullable List<String> inkluder) throws WebClientResponseException {
        return getVegobjekttypeRequestCreation(vegobjekttypeid, inkluder);
    }

    /**
     * Returnerer alle vegobjekttypene
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param inkluder Kommaseparert liste med hvilke informasjonsfelter som skal inkluderes i tillegg til vegobjekttypenes metadata.
     * @param kategori Begrens vegobjekttyper etter kategori. (/vegobjekttyper/kategorier)
     * @return List&lt;Vegobjekttype&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getVegobjekttyperRequestCreation(@javax.annotation.Nullable List<String> inkluder, @javax.annotation.Nullable Integer kategori) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "inkluder", inkluder));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "kategori", kategori));
        
        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Vegobjekttype> localVarReturnType = new ParameterizedTypeReference<Vegobjekttype>() {};
        return apiClient.invokeAPI("/api/v1/vegobjekttyper", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Returnerer alle vegobjekttypene
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param inkluder Kommaseparert liste med hvilke informasjonsfelter som skal inkluderes i tillegg til vegobjekttypenes metadata.
     * @param kategori Begrens vegobjekttyper etter kategori. (/vegobjekttyper/kategorier)
     * @return List&lt;Vegobjekttype&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Vegobjekttype> getVegobjekttyper(@javax.annotation.Nullable List<String> inkluder, @javax.annotation.Nullable Integer kategori) throws WebClientResponseException {
        ParameterizedTypeReference<Vegobjekttype> localVarReturnType = new ParameterizedTypeReference<Vegobjekttype>() {};
        return getVegobjekttyperRequestCreation(inkluder, kategori).bodyToFlux(localVarReturnType);
    }

    /**
     * Returnerer alle vegobjekttypene
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param inkluder Kommaseparert liste med hvilke informasjonsfelter som skal inkluderes i tillegg til vegobjekttypenes metadata.
     * @param kategori Begrens vegobjekttyper etter kategori. (/vegobjekttyper/kategorier)
     * @return ResponseEntity&lt;List&lt;Vegobjekttype&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Vegobjekttype>>> getVegobjekttyperWithHttpInfo(@javax.annotation.Nullable List<String> inkluder, @javax.annotation.Nullable Integer kategori) throws WebClientResponseException {
        ParameterizedTypeReference<Vegobjekttype> localVarReturnType = new ParameterizedTypeReference<Vegobjekttype>() {};
        return getVegobjekttyperRequestCreation(inkluder, kategori).toEntityList(localVarReturnType);
    }

    /**
     * Returnerer alle vegobjekttypene
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param inkluder Kommaseparert liste med hvilke informasjonsfelter som skal inkluderes i tillegg til vegobjekttypenes metadata.
     * @param kategori Begrens vegobjekttyper etter kategori. (/vegobjekttyper/kategorier)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getVegobjekttyperWithResponseSpec(@javax.annotation.Nullable List<String> inkluder, @javax.annotation.Nullable Integer kategori) throws WebClientResponseException {
        return getVegobjekttyperRequestCreation(inkluder, kategori);
    }

    /**
     * Returnerer alle vegobjekttypene for en gitt versjon av datakatalogen, f.eks. 2.31
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param versjon The versjon parameter
     * @param inkluder Kommaseparert liste med hvilke informasjonsfelter som skal inkluderes i tillegg til vegobjekttypenes metadata.
     * @param kategori Begrens vegobjekttyper etter kategori. (/vegobjekttyper/kategorier)
     * @return List&lt;Vegobjekttype&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getVegobjekttyperHistoriskRequestCreation(@javax.annotation.Nonnull String versjon, @javax.annotation.Nullable List<String> inkluder, @javax.annotation.Nullable Integer kategori) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'versjon' is set
        if (versjon == null) {
            throw new WebClientResponseException("Missing the required parameter 'versjon' when calling getVegobjekttyperHistorisk", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("versjon", versjon);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "inkluder", inkluder));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "kategori", kategori));
        
        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Vegobjekttype> localVarReturnType = new ParameterizedTypeReference<Vegobjekttype>() {};
        return apiClient.invokeAPI("/api/v1/vegobjekttyper/historisk/{versjon}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Returnerer alle vegobjekttypene for en gitt versjon av datakatalogen, f.eks. 2.31
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param versjon The versjon parameter
     * @param inkluder Kommaseparert liste med hvilke informasjonsfelter som skal inkluderes i tillegg til vegobjekttypenes metadata.
     * @param kategori Begrens vegobjekttyper etter kategori. (/vegobjekttyper/kategorier)
     * @return List&lt;Vegobjekttype&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Vegobjekttype> getVegobjekttyperHistorisk(@javax.annotation.Nonnull String versjon, @javax.annotation.Nullable List<String> inkluder, @javax.annotation.Nullable Integer kategori) throws WebClientResponseException {
        ParameterizedTypeReference<Vegobjekttype> localVarReturnType = new ParameterizedTypeReference<Vegobjekttype>() {};
        return getVegobjekttyperHistoriskRequestCreation(versjon, inkluder, kategori).bodyToFlux(localVarReturnType);
    }

    /**
     * Returnerer alle vegobjekttypene for en gitt versjon av datakatalogen, f.eks. 2.31
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param versjon The versjon parameter
     * @param inkluder Kommaseparert liste med hvilke informasjonsfelter som skal inkluderes i tillegg til vegobjekttypenes metadata.
     * @param kategori Begrens vegobjekttyper etter kategori. (/vegobjekttyper/kategorier)
     * @return ResponseEntity&lt;List&lt;Vegobjekttype&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<Vegobjekttype>>> getVegobjekttyperHistoriskWithHttpInfo(@javax.annotation.Nonnull String versjon, @javax.annotation.Nullable List<String> inkluder, @javax.annotation.Nullable Integer kategori) throws WebClientResponseException {
        ParameterizedTypeReference<Vegobjekttype> localVarReturnType = new ParameterizedTypeReference<Vegobjekttype>() {};
        return getVegobjekttyperHistoriskRequestCreation(versjon, inkluder, kategori).toEntityList(localVarReturnType);
    }

    /**
     * Returnerer alle vegobjekttypene for en gitt versjon av datakatalogen, f.eks. 2.31
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param versjon The versjon parameter
     * @param inkluder Kommaseparert liste med hvilke informasjonsfelter som skal inkluderes i tillegg til vegobjekttypenes metadata.
     * @param kategori Begrens vegobjekttyper etter kategori. (/vegobjekttyper/kategorier)
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getVegobjekttyperHistoriskWithResponseSpec(@javax.annotation.Nonnull String versjon, @javax.annotation.Nullable List<String> inkluder, @javax.annotation.Nullable Integer kategori) throws WebClientResponseException {
        return getVegobjekttyperHistoriskRequestCreation(versjon, inkluder, kategori);
    }

    /**
     * Returnerer aktiv versjon på datakatalog
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @return Versjon
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getVersjonRequestCreation() throws WebClientResponseException {
        Object postBody = null;
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
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Versjon> localVarReturnType = new ParameterizedTypeReference<Versjon>() {};
        return apiClient.invokeAPI("/api/v1/versjon", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Returnerer aktiv versjon på datakatalog
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @return Versjon
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Versjon> getVersjon() throws WebClientResponseException {
        ParameterizedTypeReference<Versjon> localVarReturnType = new ParameterizedTypeReference<Versjon>() {};
        return getVersjonRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * Returnerer aktiv versjon på datakatalog
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;Versjon&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Versjon>> getVersjonWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<Versjon> localVarReturnType = new ParameterizedTypeReference<Versjon>() {};
        return getVersjonRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * Returnerer aktiv versjon på datakatalog
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getVersjonWithResponseSpec() throws WebClientResponseException {
        return getVersjonRequestCreation();
    }
}

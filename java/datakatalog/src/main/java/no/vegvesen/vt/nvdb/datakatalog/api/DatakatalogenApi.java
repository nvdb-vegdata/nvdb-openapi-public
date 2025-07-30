package no.vegvesen.vt.nvdb.datakatalog.api;

import no.vegvesen.vt.nvdb.datakatalog.infrastructure.ApiClient;

import no.vegvesen.vt.nvdb.datakatalog.model.Egenskapstype;
import no.vegvesen.vt.nvdb.datakatalog.model.EgenskapstypeKategori;
import no.vegvesen.vt.nvdb.datakatalog.model.Enhet;
import no.vegvesen.vt.nvdb.datakatalog.model.Kategori;
import no.vegvesen.vt.nvdb.datakatalog.model.ProblemDetail;
import no.vegvesen.vt.nvdb.datakatalog.model.ProductSpecification;
import java.util.Set;
import no.vegvesen.vt.nvdb.datakatalog.model.Vegobjekttype;
import no.vegvesen.vt.nvdb.datakatalog.model.Versjon;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClient.ResponseSpec;
import org.springframework.web.client.RestClientResponseException;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public class DatakatalogenApi {
    private ApiClient apiClient;

    public DatakatalogenApi() {
        this(new ApiClient());
    }

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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getEgenskapstypeRequestCreation(@jakarta.annotation.Nonnull Integer egenskapstypeid) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'egenskapstypeid' is set
        if (egenskapstypeid == null) {
            throw new RestClientResponseException("Missing the required parameter 'egenskapstypeid' when calling getEgenskapstype", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("egenskapstypeid", egenskapstypeid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Egenskapstype> localVarReturnType = new ParameterizedTypeReference<>() {};
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Egenskapstype getEgenskapstype(@jakarta.annotation.Nonnull Integer egenskapstypeid) throws RestClientResponseException {
        ParameterizedTypeReference<Egenskapstype> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getEgenskapstypeRequestCreation(egenskapstypeid).body(localVarReturnType);
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Egenskapstype> getEgenskapstypeWithHttpInfo(@jakarta.annotation.Nonnull Integer egenskapstypeid) throws RestClientResponseException {
        ParameterizedTypeReference<Egenskapstype> localVarReturnType = new ParameterizedTypeReference<>() {};
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getEgenskapstypeWithResponseSpec(@jakarta.annotation.Nonnull Integer egenskapstypeid) throws RestClientResponseException {
        return getEgenskapstypeRequestCreation(egenskapstypeid);
    }

    public static class GetEgenskapstypeForVegobjekttypeRequest {
        private @jakarta.annotation.Nonnull Integer vegobjekttypeid;
        private @jakarta.annotation.Nonnull Integer egenskapstypeid;

        public GetEgenskapstypeForVegobjekttypeRequest() {}

        public GetEgenskapstypeForVegobjekttypeRequest(@jakarta.annotation.Nonnull Integer vegobjekttypeid, @jakarta.annotation.Nonnull Integer egenskapstypeid) {
            this.vegobjekttypeid = vegobjekttypeid;
            this.egenskapstypeid = egenskapstypeid;
        }

        public @jakarta.annotation.Nonnull Integer vegobjekttypeid() {
            return this.vegobjekttypeid;
        }
        public GetEgenskapstypeForVegobjekttypeRequest vegobjekttypeid(@jakarta.annotation.Nonnull Integer vegobjekttypeid) {
            this.vegobjekttypeid = vegobjekttypeid;
            return this;
        }

        public @jakarta.annotation.Nonnull Integer egenskapstypeid() {
            return this.egenskapstypeid;
        }
        public GetEgenskapstypeForVegobjekttypeRequest egenskapstypeid(@jakarta.annotation.Nonnull Integer egenskapstypeid) {
            this.egenskapstypeid = egenskapstypeid;
            return this;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            GetEgenskapstypeForVegobjekttypeRequest request = (GetEgenskapstypeForVegobjekttypeRequest) o;
            return Objects.equals(this.vegobjekttypeid, request.vegobjekttypeid()) &&
                Objects.equals(this.egenskapstypeid, request.egenskapstypeid());
        }

        @Override
        public int hashCode() {
            return Objects.hash(vegobjekttypeid, egenskapstypeid);
        }
    }

    /**
    * Returnerer angitt egenskapstype for angitt vegobjekttype
    * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param requestParameters The getEgenskapstypeForVegobjekttype request parameters as object
     * @return Egenskapstype
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public Egenskapstype getEgenskapstypeForVegobjekttype(GetEgenskapstypeForVegobjekttypeRequest requestParameters) throws RestClientResponseException {
      return this.getEgenskapstypeForVegobjekttype(requestParameters.vegobjekttypeid(), requestParameters.egenskapstypeid());
    }

  /**
  * Returnerer angitt egenskapstype for angitt vegobjekttype
  * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param requestParameters The getEgenskapstypeForVegobjekttype request parameters as object
     * @return ResponseEntity&lt;Egenskapstype&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseEntity<Egenskapstype> getEgenskapstypeForVegobjekttypeWithHttpInfo(GetEgenskapstypeForVegobjekttypeRequest requestParameters) throws RestClientResponseException {
      return this.getEgenskapstypeForVegobjekttypeWithHttpInfo(requestParameters.vegobjekttypeid(), requestParameters.egenskapstypeid());
    }

  /**
  * Returnerer angitt egenskapstype for angitt vegobjekttype
  * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param requestParameters The getEgenskapstypeForVegobjekttype request parameters as object
  * @return ResponseSpec
  * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseSpec getEgenskapstypeForVegobjekttypeWithResponseSpec(GetEgenskapstypeForVegobjekttypeRequest requestParameters) throws RestClientResponseException {
      return this.getEgenskapstypeForVegobjekttypeWithResponseSpec(requestParameters.vegobjekttypeid(), requestParameters.egenskapstypeid());
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getEgenskapstypeForVegobjekttypeRequestCreation(@jakarta.annotation.Nonnull Integer vegobjekttypeid, @jakarta.annotation.Nonnull Integer egenskapstypeid) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'vegobjekttypeid' is set
        if (vegobjekttypeid == null) {
            throw new RestClientResponseException("Missing the required parameter 'vegobjekttypeid' when calling getEgenskapstypeForVegobjekttype", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'egenskapstypeid' is set
        if (egenskapstypeid == null) {
            throw new RestClientResponseException("Missing the required parameter 'egenskapstypeid' when calling getEgenskapstypeForVegobjekttype", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("vegobjekttypeid", vegobjekttypeid);
        pathParams.put("egenskapstypeid", egenskapstypeid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Egenskapstype> localVarReturnType = new ParameterizedTypeReference<>() {};
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Egenskapstype getEgenskapstypeForVegobjekttype(@jakarta.annotation.Nonnull Integer vegobjekttypeid, @jakarta.annotation.Nonnull Integer egenskapstypeid) throws RestClientResponseException {
        ParameterizedTypeReference<Egenskapstype> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getEgenskapstypeForVegobjekttypeRequestCreation(vegobjekttypeid, egenskapstypeid).body(localVarReturnType);
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Egenskapstype> getEgenskapstypeForVegobjekttypeWithHttpInfo(@jakarta.annotation.Nonnull Integer vegobjekttypeid, @jakarta.annotation.Nonnull Integer egenskapstypeid) throws RestClientResponseException {
        ParameterizedTypeReference<Egenskapstype> localVarReturnType = new ParameterizedTypeReference<>() {};
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getEgenskapstypeForVegobjekttypeWithResponseSpec(@jakarta.annotation.Nonnull Integer vegobjekttypeid, @jakarta.annotation.Nonnull Integer egenskapstypeid) throws RestClientResponseException {
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getEgenskapstypeKategorierRequestCreation() throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<EgenskapstypeKategori>> localVarReturnType = new ParameterizedTypeReference<>() {};
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<EgenskapstypeKategori> getEgenskapstypeKategorier() throws RestClientResponseException {
        ParameterizedTypeReference<List<EgenskapstypeKategori>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getEgenskapstypeKategorierRequestCreation().body(localVarReturnType);
    }

    /**
     * Returnerer alle kategorier for egenskapstypene
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;List&lt;EgenskapstypeKategori&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<EgenskapstypeKategori>> getEgenskapstypeKategorierWithHttpInfo() throws RestClientResponseException {
        ParameterizedTypeReference<List<EgenskapstypeKategori>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getEgenskapstypeKategorierRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * Returnerer alle kategorier for egenskapstypene
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getEgenskapstypeKategorierWithResponseSpec() throws RestClientResponseException {
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getEnheterRequestCreation() throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<Enhet>> localVarReturnType = new ParameterizedTypeReference<>() {};
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<Enhet> getEnheter() throws RestClientResponseException {
        ParameterizedTypeReference<List<Enhet>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getEnheterRequestCreation().body(localVarReturnType);
    }

    /**
     * Returnerer alle enheter
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;List&lt;Enhet&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Enhet>> getEnheterWithHttpInfo() throws RestClientResponseException {
        ParameterizedTypeReference<List<Enhet>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getEnheterRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * Returnerer alle enheter
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getEnheterWithResponseSpec() throws RestClientResponseException {
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getKategorierRequestCreation() throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<Kategori>> localVarReturnType = new ParameterizedTypeReference<>() {};
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<Kategori> getKategorier() throws RestClientResponseException {
        ParameterizedTypeReference<List<Kategori>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getKategorierRequestCreation().body(localVarReturnType);
    }

    /**
     * Returnerer alle kategorier for vegobjekter
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;List&lt;Kategori&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Kategori>> getKategorierWithHttpInfo() throws RestClientResponseException {
        ParameterizedTypeReference<List<Kategori>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getKategorierRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * Returnerer alle kategorier for vegobjekter
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getKategorierWithResponseSpec() throws RestClientResponseException {
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getProduktspesifikasjonRequestCreation(@jakarta.annotation.Nonnull Integer vegobjekttypeid) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'vegobjekttypeid' is set
        if (vegobjekttypeid == null) {
            throw new RestClientResponseException("Missing the required parameter 'vegobjekttypeid' when calling getProduktspesifikasjon", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("vegobjekttypeid", vegobjekttypeid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ProductSpecification> localVarReturnType = new ParameterizedTypeReference<>() {};
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ProductSpecification getProduktspesifikasjon(@jakarta.annotation.Nonnull Integer vegobjekttypeid) throws RestClientResponseException {
        ParameterizedTypeReference<ProductSpecification> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getProduktspesifikasjonRequestCreation(vegobjekttypeid).body(localVarReturnType);
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ProductSpecification> getProduktspesifikasjonWithHttpInfo(@jakarta.annotation.Nonnull Integer vegobjekttypeid) throws RestClientResponseException {
        ParameterizedTypeReference<ProductSpecification> localVarReturnType = new ParameterizedTypeReference<>() {};
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getProduktspesifikasjonWithResponseSpec(@jakarta.annotation.Nonnull Integer vegobjekttypeid) throws RestClientResponseException {
        return getProduktspesifikasjonRequestCreation(vegobjekttypeid);
    }

    public static class GetVegobjekttypeRequest {
        private @jakarta.annotation.Nonnull Integer vegobjekttypeid;
        private @jakarta.annotation.Nullable Set<String> inkluder;

        public GetVegobjekttypeRequest() {}

        public GetVegobjekttypeRequest(@jakarta.annotation.Nonnull Integer vegobjekttypeid, @jakarta.annotation.Nullable Set<String> inkluder) {
            this.vegobjekttypeid = vegobjekttypeid;
            this.inkluder = inkluder;
        }

        public @jakarta.annotation.Nonnull Integer vegobjekttypeid() {
            return this.vegobjekttypeid;
        }
        public GetVegobjekttypeRequest vegobjekttypeid(@jakarta.annotation.Nonnull Integer vegobjekttypeid) {
            this.vegobjekttypeid = vegobjekttypeid;
            return this;
        }

        public @jakarta.annotation.Nullable Set<String> inkluder() {
            return this.inkluder;
        }
        public GetVegobjekttypeRequest inkluder(@jakarta.annotation.Nullable Set<String> inkluder) {
            this.inkluder = inkluder;
            return this;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            GetVegobjekttypeRequest request = (GetVegobjekttypeRequest) o;
            return Objects.equals(this.vegobjekttypeid, request.vegobjekttypeid()) &&
                Objects.equals(this.inkluder, request.inkluder());
        }

        @Override
        public int hashCode() {
            return Objects.hash(vegobjekttypeid, inkluder);
        }
    }

    /**
    * Returnerer angitt vegobjekttype
    * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param requestParameters The getVegobjekttype request parameters as object
     * @return Vegobjekttype
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public Vegobjekttype getVegobjekttype(GetVegobjekttypeRequest requestParameters) throws RestClientResponseException {
      return this.getVegobjekttype(requestParameters.vegobjekttypeid(), requestParameters.inkluder());
    }

  /**
  * Returnerer angitt vegobjekttype
  * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param requestParameters The getVegobjekttype request parameters as object
     * @return ResponseEntity&lt;Vegobjekttype&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseEntity<Vegobjekttype> getVegobjekttypeWithHttpInfo(GetVegobjekttypeRequest requestParameters) throws RestClientResponseException {
      return this.getVegobjekttypeWithHttpInfo(requestParameters.vegobjekttypeid(), requestParameters.inkluder());
    }

  /**
  * Returnerer angitt vegobjekttype
  * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param requestParameters The getVegobjekttype request parameters as object
  * @return ResponseSpec
  * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseSpec getVegobjekttypeWithResponseSpec(GetVegobjekttypeRequest requestParameters) throws RestClientResponseException {
      return this.getVegobjekttypeWithResponseSpec(requestParameters.vegobjekttypeid(), requestParameters.inkluder());
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getVegobjekttypeRequestCreation(@jakarta.annotation.Nonnull Integer vegobjekttypeid, @jakarta.annotation.Nullable Set<String> inkluder) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'vegobjekttypeid' is set
        if (vegobjekttypeid == null) {
            throw new RestClientResponseException("Missing the required parameter 'vegobjekttypeid' when calling getVegobjekttype", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("vegobjekttypeid", vegobjekttypeid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "inkluder", inkluder));
        
        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Vegobjekttype> localVarReturnType = new ParameterizedTypeReference<>() {};
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Vegobjekttype getVegobjekttype(@jakarta.annotation.Nonnull Integer vegobjekttypeid, @jakarta.annotation.Nullable Set<String> inkluder) throws RestClientResponseException {
        ParameterizedTypeReference<Vegobjekttype> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getVegobjekttypeRequestCreation(vegobjekttypeid, inkluder).body(localVarReturnType);
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Vegobjekttype> getVegobjekttypeWithHttpInfo(@jakarta.annotation.Nonnull Integer vegobjekttypeid, @jakarta.annotation.Nullable Set<String> inkluder) throws RestClientResponseException {
        ParameterizedTypeReference<Vegobjekttype> localVarReturnType = new ParameterizedTypeReference<>() {};
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getVegobjekttypeWithResponseSpec(@jakarta.annotation.Nonnull Integer vegobjekttypeid, @jakarta.annotation.Nullable Set<String> inkluder) throws RestClientResponseException {
        return getVegobjekttypeRequestCreation(vegobjekttypeid, inkluder);
    }

    public static class GetVegobjekttyperRequest {
        private @jakarta.annotation.Nullable Set<String> inkluder;
        private @jakarta.annotation.Nullable Integer kategori;

        public GetVegobjekttyperRequest() {}

        public GetVegobjekttyperRequest(@jakarta.annotation.Nullable Set<String> inkluder, @jakarta.annotation.Nullable Integer kategori) {
            this.inkluder = inkluder;
            this.kategori = kategori;
        }

        public @jakarta.annotation.Nullable Set<String> inkluder() {
            return this.inkluder;
        }
        public GetVegobjekttyperRequest inkluder(@jakarta.annotation.Nullable Set<String> inkluder) {
            this.inkluder = inkluder;
            return this;
        }

        public @jakarta.annotation.Nullable Integer kategori() {
            return this.kategori;
        }
        public GetVegobjekttyperRequest kategori(@jakarta.annotation.Nullable Integer kategori) {
            this.kategori = kategori;
            return this;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            GetVegobjekttyperRequest request = (GetVegobjekttyperRequest) o;
            return Objects.equals(this.inkluder, request.inkluder()) &&
                Objects.equals(this.kategori, request.kategori());
        }

        @Override
        public int hashCode() {
            return Objects.hash(inkluder, kategori);
        }
    }

    /**
    * Returnerer alle vegobjekttypene
    * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param requestParameters The getVegobjekttyper request parameters as object
     * @return List&lt;Vegobjekttype&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public List<Vegobjekttype> getVegobjekttyper(GetVegobjekttyperRequest requestParameters) throws RestClientResponseException {
      return this.getVegobjekttyper(requestParameters.inkluder(), requestParameters.kategori());
    }

  /**
  * Returnerer alle vegobjekttypene
  * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param requestParameters The getVegobjekttyper request parameters as object
     * @return ResponseEntity&lt;List&lt;Vegobjekttype&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseEntity<List<Vegobjekttype>> getVegobjekttyperWithHttpInfo(GetVegobjekttyperRequest requestParameters) throws RestClientResponseException {
      return this.getVegobjekttyperWithHttpInfo(requestParameters.inkluder(), requestParameters.kategori());
    }

  /**
  * Returnerer alle vegobjekttypene
  * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param requestParameters The getVegobjekttyper request parameters as object
  * @return ResponseSpec
  * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseSpec getVegobjekttyperWithResponseSpec(GetVegobjekttyperRequest requestParameters) throws RestClientResponseException {
      return this.getVegobjekttyperWithResponseSpec(requestParameters.inkluder(), requestParameters.kategori());
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getVegobjekttyperRequestCreation(@jakarta.annotation.Nullable Set<String> inkluder, @jakarta.annotation.Nullable Integer kategori) throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "inkluder", inkluder));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "kategori", kategori));
        
        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<Vegobjekttype>> localVarReturnType = new ParameterizedTypeReference<>() {};
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<Vegobjekttype> getVegobjekttyper(@jakarta.annotation.Nullable Set<String> inkluder, @jakarta.annotation.Nullable Integer kategori) throws RestClientResponseException {
        ParameterizedTypeReference<List<Vegobjekttype>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getVegobjekttyperRequestCreation(inkluder, kategori).body(localVarReturnType);
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Vegobjekttype>> getVegobjekttyperWithHttpInfo(@jakarta.annotation.Nullable Set<String> inkluder, @jakarta.annotation.Nullable Integer kategori) throws RestClientResponseException {
        ParameterizedTypeReference<List<Vegobjekttype>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getVegobjekttyperRequestCreation(inkluder, kategori).toEntity(localVarReturnType);
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getVegobjekttyperWithResponseSpec(@jakarta.annotation.Nullable Set<String> inkluder, @jakarta.annotation.Nullable Integer kategori) throws RestClientResponseException {
        return getVegobjekttyperRequestCreation(inkluder, kategori);
    }

    public static class GetVegobjekttyperHistoriskRequest {
        private @jakarta.annotation.Nonnull String versjon;
        private @jakarta.annotation.Nullable Set<String> inkluder;
        private @jakarta.annotation.Nullable Integer kategori;

        public GetVegobjekttyperHistoriskRequest() {}

        public GetVegobjekttyperHistoriskRequest(@jakarta.annotation.Nonnull String versjon, @jakarta.annotation.Nullable Set<String> inkluder, @jakarta.annotation.Nullable Integer kategori) {
            this.versjon = versjon;
            this.inkluder = inkluder;
            this.kategori = kategori;
        }

        public @jakarta.annotation.Nonnull String versjon() {
            return this.versjon;
        }
        public GetVegobjekttyperHistoriskRequest versjon(@jakarta.annotation.Nonnull String versjon) {
            this.versjon = versjon;
            return this;
        }

        public @jakarta.annotation.Nullable Set<String> inkluder() {
            return this.inkluder;
        }
        public GetVegobjekttyperHistoriskRequest inkluder(@jakarta.annotation.Nullable Set<String> inkluder) {
            this.inkluder = inkluder;
            return this;
        }

        public @jakarta.annotation.Nullable Integer kategori() {
            return this.kategori;
        }
        public GetVegobjekttyperHistoriskRequest kategori(@jakarta.annotation.Nullable Integer kategori) {
            this.kategori = kategori;
            return this;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            GetVegobjekttyperHistoriskRequest request = (GetVegobjekttyperHistoriskRequest) o;
            return Objects.equals(this.versjon, request.versjon()) &&
                Objects.equals(this.inkluder, request.inkluder()) &&
                Objects.equals(this.kategori, request.kategori());
        }

        @Override
        public int hashCode() {
            return Objects.hash(versjon, inkluder, kategori);
        }
    }

    /**
    * Returnerer alle vegobjekttypene for en gitt versjon av datakatalogen, f.eks. 2.31
    * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param requestParameters The getVegobjekttyperHistorisk request parameters as object
     * @return List&lt;Vegobjekttype&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public List<Vegobjekttype> getVegobjekttyperHistorisk(GetVegobjekttyperHistoriskRequest requestParameters) throws RestClientResponseException {
      return this.getVegobjekttyperHistorisk(requestParameters.versjon(), requestParameters.inkluder(), requestParameters.kategori());
    }

  /**
  * Returnerer alle vegobjekttypene for en gitt versjon av datakatalogen, f.eks. 2.31
  * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param requestParameters The getVegobjekttyperHistorisk request parameters as object
     * @return ResponseEntity&lt;List&lt;Vegobjekttype&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseEntity<List<Vegobjekttype>> getVegobjekttyperHistoriskWithHttpInfo(GetVegobjekttyperHistoriskRequest requestParameters) throws RestClientResponseException {
      return this.getVegobjekttyperHistoriskWithHttpInfo(requestParameters.versjon(), requestParameters.inkluder(), requestParameters.kategori());
    }

  /**
  * Returnerer alle vegobjekttypene for en gitt versjon av datakatalogen, f.eks. 2.31
  * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param requestParameters The getVegobjekttyperHistorisk request parameters as object
  * @return ResponseSpec
  * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseSpec getVegobjekttyperHistoriskWithResponseSpec(GetVegobjekttyperHistoriskRequest requestParameters) throws RestClientResponseException {
      return this.getVegobjekttyperHistoriskWithResponseSpec(requestParameters.versjon(), requestParameters.inkluder(), requestParameters.kategori());
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getVegobjekttyperHistoriskRequestCreation(@jakarta.annotation.Nonnull String versjon, @jakarta.annotation.Nullable Set<String> inkluder, @jakarta.annotation.Nullable Integer kategori) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'versjon' is set
        if (versjon == null) {
            throw new RestClientResponseException("Missing the required parameter 'versjon' when calling getVegobjekttyperHistorisk", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("versjon", versjon);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "inkluder", inkluder));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "kategori", kategori));
        
        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<Vegobjekttype>> localVarReturnType = new ParameterizedTypeReference<>() {};
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<Vegobjekttype> getVegobjekttyperHistorisk(@jakarta.annotation.Nonnull String versjon, @jakarta.annotation.Nullable Set<String> inkluder, @jakarta.annotation.Nullable Integer kategori) throws RestClientResponseException {
        ParameterizedTypeReference<List<Vegobjekttype>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getVegobjekttyperHistoriskRequestCreation(versjon, inkluder, kategori).body(localVarReturnType);
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Vegobjekttype>> getVegobjekttyperHistoriskWithHttpInfo(@jakarta.annotation.Nonnull String versjon, @jakarta.annotation.Nullable Set<String> inkluder, @jakarta.annotation.Nullable Integer kategori) throws RestClientResponseException {
        ParameterizedTypeReference<List<Vegobjekttype>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getVegobjekttyperHistoriskRequestCreation(versjon, inkluder, kategori).toEntity(localVarReturnType);
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getVegobjekttyperHistoriskWithResponseSpec(@jakarta.annotation.Nonnull String versjon, @jakarta.annotation.Nullable Set<String> inkluder, @jakarta.annotation.Nullable Integer kategori) throws RestClientResponseException {
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getVersjonRequestCreation() throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Versjon> localVarReturnType = new ParameterizedTypeReference<>() {};
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Versjon getVersjon() throws RestClientResponseException {
        ParameterizedTypeReference<Versjon> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getVersjonRequestCreation().body(localVarReturnType);
    }

    /**
     * Returnerer aktiv versjon på datakatalog
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;Versjon&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Versjon> getVersjonWithHttpInfo() throws RestClientResponseException {
        ParameterizedTypeReference<Versjon> localVarReturnType = new ParameterizedTypeReference<>() {};
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getVersjonWithResponseSpec() throws RestClientResponseException {
        return getVersjonRequestCreation();
    }
}

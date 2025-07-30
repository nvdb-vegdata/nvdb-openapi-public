package no.vegvesen.vt.nvdb.vegnett.api;

import no.vegvesen.vt.nvdb.vegnett.infrastructure.ApiClient;

import no.vegvesen.vt.nvdb.vegnett.model.Node;
import no.vegvesen.vt.nvdb.vegnett.model.NodeSide;
import no.vegvesen.vt.nvdb.vegnett.model.ProblemDetail;
import java.util.Set;
import no.vegvesen.vt.nvdb.vegnett.model.SridParameter;

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
public class NoderApi {
    private ApiClient apiClient;

    public NoderApi() {
        this(new ApiClient());
    }

    public NoderApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }


    public static class GetNodeRequest {
        private @jakarta.annotation.Nonnull Long id;
        private @jakarta.annotation.Nullable SridParameter srid;

        public GetNodeRequest() {}

        public GetNodeRequest(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nullable SridParameter srid) {
            this.id = id;
            this.srid = srid;
        }

        public @jakarta.annotation.Nonnull Long id() {
            return this.id;
        }
        public GetNodeRequest id(@jakarta.annotation.Nonnull Long id) {
            this.id = id;
            return this;
        }

        public @jakarta.annotation.Nullable SridParameter srid() {
            return this.srid;
        }
        public GetNodeRequest srid(@jakarta.annotation.Nullable SridParameter srid) {
            this.srid = srid;
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
            GetNodeRequest request = (GetNodeRequest) o;
            return Objects.equals(this.id, request.id()) &&
                Objects.equals(this.srid, request.srid());
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, srid);
        }
    }

    /**
    * Hent en node
    * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param requestParameters The getNode request parameters as object
     * @return Node
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public Node getNode(GetNodeRequest requestParameters) throws RestClientResponseException {
      return this.getNode(requestParameters.id(), requestParameters.srid());
    }

  /**
  * Hent en node
  * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param requestParameters The getNode request parameters as object
     * @return ResponseEntity&lt;Node&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseEntity<Node> getNodeWithHttpInfo(GetNodeRequest requestParameters) throws RestClientResponseException {
      return this.getNodeWithHttpInfo(requestParameters.id(), requestParameters.srid());
    }

  /**
  * Hent en node
  * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param requestParameters The getNode request parameters as object
  * @return ResponseSpec
  * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseSpec getNodeWithResponseSpec(GetNodeRequest requestParameters) throws RestClientResponseException {
      return this.getNodeWithResponseSpec(requestParameters.id(), requestParameters.srid());
    }

    /**
     * Hent en node
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param id ID for noden.
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @return Node
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getNodeRequestCreation(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nullable SridParameter srid) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new RestClientResponseException("Missing the required parameter 'id' when calling getNode", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "srid", srid));
        
        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Node> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/api/v4/noder/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Hent en node
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param id ID for noden.
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @return Node
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Node getNode(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nullable SridParameter srid) throws RestClientResponseException {
        ParameterizedTypeReference<Node> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getNodeRequestCreation(id, srid).body(localVarReturnType);
    }

    /**
     * Hent en node
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param id ID for noden.
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @return ResponseEntity&lt;Node&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Node> getNodeWithHttpInfo(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nullable SridParameter srid) throws RestClientResponseException {
        ParameterizedTypeReference<Node> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getNodeRequestCreation(id, srid).toEntity(localVarReturnType);
    }

    /**
     * Hent en node
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param id ID for noden.
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getNodeWithResponseSpec(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nullable SridParameter srid) throws RestClientResponseException {
        return getNodeRequestCreation(id, srid);
    }

    public static class GetNoderRequest {
        private @jakarta.annotation.Nullable SridParameter srid;
        private @jakarta.annotation.Nullable Set<Long> ider;
        private @jakarta.annotation.Nullable Set<Integer> fylke;
        private @jakarta.annotation.Nullable Set<Integer> kommune;
        private @jakarta.annotation.Nullable Set<String> kontraktsomrade;
        private @jakarta.annotation.Nullable Set<String> vegsystemreferanse;
        private @jakarta.annotation.Nullable String kartutsnitt;
        private @jakarta.annotation.Nullable String polygon;
        private @jakarta.annotation.Nullable Long superid;
        private @jakarta.annotation.Nullable Integer antall;
        private @jakarta.annotation.Nullable String start;
        private @jakarta.annotation.Nullable Boolean inkluderAntall;

        public GetNoderRequest() {}

        public GetNoderRequest(@jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable String kartutsnitt, @jakarta.annotation.Nullable String polygon, @jakarta.annotation.Nullable Long superid, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable String start, @jakarta.annotation.Nullable Boolean inkluderAntall) {
            this.srid = srid;
            this.ider = ider;
            this.fylke = fylke;
            this.kommune = kommune;
            this.kontraktsomrade = kontraktsomrade;
            this.vegsystemreferanse = vegsystemreferanse;
            this.kartutsnitt = kartutsnitt;
            this.polygon = polygon;
            this.superid = superid;
            this.antall = antall;
            this.start = start;
            this.inkluderAntall = inkluderAntall;
        }

        public @jakarta.annotation.Nullable SridParameter srid() {
            return this.srid;
        }
        public GetNoderRequest srid(@jakarta.annotation.Nullable SridParameter srid) {
            this.srid = srid;
            return this;
        }

        public @jakarta.annotation.Nullable Set<Long> ider() {
            return this.ider;
        }
        public GetNoderRequest ider(@jakarta.annotation.Nullable Set<Long> ider) {
            this.ider = ider;
            return this;
        }

        public @jakarta.annotation.Nullable Set<Integer> fylke() {
            return this.fylke;
        }
        public GetNoderRequest fylke(@jakarta.annotation.Nullable Set<Integer> fylke) {
            this.fylke = fylke;
            return this;
        }

        public @jakarta.annotation.Nullable Set<Integer> kommune() {
            return this.kommune;
        }
        public GetNoderRequest kommune(@jakarta.annotation.Nullable Set<Integer> kommune) {
            this.kommune = kommune;
            return this;
        }

        public @jakarta.annotation.Nullable Set<String> kontraktsomrade() {
            return this.kontraktsomrade;
        }
        public GetNoderRequest kontraktsomrade(@jakarta.annotation.Nullable Set<String> kontraktsomrade) {
            this.kontraktsomrade = kontraktsomrade;
            return this;
        }

        public @jakarta.annotation.Nullable Set<String> vegsystemreferanse() {
            return this.vegsystemreferanse;
        }
        public GetNoderRequest vegsystemreferanse(@jakarta.annotation.Nullable Set<String> vegsystemreferanse) {
            this.vegsystemreferanse = vegsystemreferanse;
            return this;
        }

        public @jakarta.annotation.Nullable String kartutsnitt() {
            return this.kartutsnitt;
        }
        public GetNoderRequest kartutsnitt(@jakarta.annotation.Nullable String kartutsnitt) {
            this.kartutsnitt = kartutsnitt;
            return this;
        }

        public @jakarta.annotation.Nullable String polygon() {
            return this.polygon;
        }
        public GetNoderRequest polygon(@jakarta.annotation.Nullable String polygon) {
            this.polygon = polygon;
            return this;
        }

        public @jakarta.annotation.Nullable Long superid() {
            return this.superid;
        }
        public GetNoderRequest superid(@jakarta.annotation.Nullable Long superid) {
            this.superid = superid;
            return this;
        }

        public @jakarta.annotation.Nullable Integer antall() {
            return this.antall;
        }
        public GetNoderRequest antall(@jakarta.annotation.Nullable Integer antall) {
            this.antall = antall;
            return this;
        }

        public @jakarta.annotation.Nullable String start() {
            return this.start;
        }
        public GetNoderRequest start(@jakarta.annotation.Nullable String start) {
            this.start = start;
            return this;
        }

        public @jakarta.annotation.Nullable Boolean inkluderAntall() {
            return this.inkluderAntall;
        }
        public GetNoderRequest inkluderAntall(@jakarta.annotation.Nullable Boolean inkluderAntall) {
            this.inkluderAntall = inkluderAntall;
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
            GetNoderRequest request = (GetNoderRequest) o;
            return Objects.equals(this.srid, request.srid()) &&
                Objects.equals(this.ider, request.ider()) &&
                Objects.equals(this.fylke, request.fylke()) &&
                Objects.equals(this.kommune, request.kommune()) &&
                Objects.equals(this.kontraktsomrade, request.kontraktsomrade()) &&
                Objects.equals(this.vegsystemreferanse, request.vegsystemreferanse()) &&
                Objects.equals(this.kartutsnitt, request.kartutsnitt()) &&
                Objects.equals(this.polygon, request.polygon()) &&
                Objects.equals(this.superid, request.superid()) &&
                Objects.equals(this.antall, request.antall()) &&
                Objects.equals(this.start, request.start()) &&
                Objects.equals(this.inkluderAntall, request.inkluderAntall());
        }

        @Override
        public int hashCode() {
            return Objects.hash(srid, ider, fylke, kommune, kontraktsomrade, vegsystemreferanse, kartutsnitt, polygon, superid, antall, start, inkluderAntall);
        }
    }

    /**
    * Hent noder
    * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param requestParameters The getNoder request parameters as object
     * @return NodeSide
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public NodeSide getNoder(GetNoderRequest requestParameters) throws RestClientResponseException {
      return this.getNoder(requestParameters.srid(), requestParameters.ider(), requestParameters.fylke(), requestParameters.kommune(), requestParameters.kontraktsomrade(), requestParameters.vegsystemreferanse(), requestParameters.kartutsnitt(), requestParameters.polygon(), requestParameters.superid(), requestParameters.antall(), requestParameters.start(), requestParameters.inkluderAntall());
    }

  /**
  * Hent noder
  * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param requestParameters The getNoder request parameters as object
     * @return ResponseEntity&lt;NodeSide&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseEntity<NodeSide> getNoderWithHttpInfo(GetNoderRequest requestParameters) throws RestClientResponseException {
      return this.getNoderWithHttpInfo(requestParameters.srid(), requestParameters.ider(), requestParameters.fylke(), requestParameters.kommune(), requestParameters.kontraktsomrade(), requestParameters.vegsystemreferanse(), requestParameters.kartutsnitt(), requestParameters.polygon(), requestParameters.superid(), requestParameters.antall(), requestParameters.start(), requestParameters.inkluderAntall());
    }

  /**
  * Hent noder
  * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param requestParameters The getNoder request parameters as object
  * @return ResponseSpec
  * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseSpec getNoderWithResponseSpec(GetNoderRequest requestParameters) throws RestClientResponseException {
      return this.getNoderWithResponseSpec(requestParameters.srid(), requestParameters.ider(), requestParameters.fylke(), requestParameters.kommune(), requestParameters.kontraktsomrade(), requestParameters.vegsystemreferanse(), requestParameters.kartutsnitt(), requestParameters.polygon(), requestParameters.superid(), requestParameters.antall(), requestParameters.start(), requestParameters.inkluderAntall());
    }

    /**
     * Hent noder
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param ider Kommaseparert liste med IDer.
     * @param fylke Filtrer på fylke. Kommaseparert liste. Se [/omrader/api/v4/fylker](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getFylker) for mulige verdier.  Eksempel: &#x60;50&#x60;
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getKommuner) for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @param kontraktsomrade Filtrer på kontraktsomrade. Kommaseparert liste. Se [/omrader/api/v4/kontraktsomrader](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getKontraktsomrader) for mulige verdier.  Eksempel: &#x60;9503 Midtre Hålogaland 2021-2026&#x60;
     * @param vegsystemreferanse Filtrer på [vegsystemreferanse](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1 m12&#x60;
     * @param kartutsnitt Filtrer med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;.  Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60;
     * @param polygon Filtrer med polygon i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret).  Eksempel: &#x60;20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000&#x60;
     * @param superid Hent noder tilkoblet detaljerte veglenker stedfestet på veglenkesekvens med denne IDen.
     * @param antall Angir hvor mange objekter som skal returneres. Se også &#x60;sidestørrelse&#x60; i responsens &#x60;metadata&#x60;-objekt.
     * @param start Angir paginerings-start for objekter som skal returneres. Brukes sammen med &#x60;antall&#x60;. Neste start får man i metadata-feltet i responsen. Settes blankt for å starte fra begynnelsen.
     * @param inkluderAntall Hvorvidt totalt antall objekter skal returneres i responsen. Default er &#x60;false&#x60;.
     * @return NodeSide
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getNoderRequestCreation(@jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable String kartutsnitt, @jakarta.annotation.Nullable String polygon, @jakarta.annotation.Nullable Long superid, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable String start, @jakarta.annotation.Nullable Boolean inkluderAntall) throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "srid", srid));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "ider", ider));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "fylke", fylke));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "kommune", kommune));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "kontraktsomrade", kontraktsomrade));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "vegsystemreferanse", vegsystemreferanse));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "kartutsnitt", kartutsnitt));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "polygon", polygon));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "superid", superid));
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

        ParameterizedTypeReference<NodeSide> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/api/v4/noder", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Hent noder
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param ider Kommaseparert liste med IDer.
     * @param fylke Filtrer på fylke. Kommaseparert liste. Se [/omrader/api/v4/fylker](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getFylker) for mulige verdier.  Eksempel: &#x60;50&#x60;
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getKommuner) for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @param kontraktsomrade Filtrer på kontraktsomrade. Kommaseparert liste. Se [/omrader/api/v4/kontraktsomrader](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getKontraktsomrader) for mulige verdier.  Eksempel: &#x60;9503 Midtre Hålogaland 2021-2026&#x60;
     * @param vegsystemreferanse Filtrer på [vegsystemreferanse](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1 m12&#x60;
     * @param kartutsnitt Filtrer med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;.  Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60;
     * @param polygon Filtrer med polygon i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret).  Eksempel: &#x60;20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000&#x60;
     * @param superid Hent noder tilkoblet detaljerte veglenker stedfestet på veglenkesekvens med denne IDen.
     * @param antall Angir hvor mange objekter som skal returneres. Se også &#x60;sidestørrelse&#x60; i responsens &#x60;metadata&#x60;-objekt.
     * @param start Angir paginerings-start for objekter som skal returneres. Brukes sammen med &#x60;antall&#x60;. Neste start får man i metadata-feltet i responsen. Settes blankt for å starte fra begynnelsen.
     * @param inkluderAntall Hvorvidt totalt antall objekter skal returneres i responsen. Default er &#x60;false&#x60;.
     * @return NodeSide
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public NodeSide getNoder(@jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable String kartutsnitt, @jakarta.annotation.Nullable String polygon, @jakarta.annotation.Nullable Long superid, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable String start, @jakarta.annotation.Nullable Boolean inkluderAntall) throws RestClientResponseException {
        ParameterizedTypeReference<NodeSide> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getNoderRequestCreation(srid, ider, fylke, kommune, kontraktsomrade, vegsystemreferanse, kartutsnitt, polygon, superid, antall, start, inkluderAntall).body(localVarReturnType);
    }

    /**
     * Hent noder
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param ider Kommaseparert liste med IDer.
     * @param fylke Filtrer på fylke. Kommaseparert liste. Se [/omrader/api/v4/fylker](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getFylker) for mulige verdier.  Eksempel: &#x60;50&#x60;
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getKommuner) for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @param kontraktsomrade Filtrer på kontraktsomrade. Kommaseparert liste. Se [/omrader/api/v4/kontraktsomrader](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getKontraktsomrader) for mulige verdier.  Eksempel: &#x60;9503 Midtre Hålogaland 2021-2026&#x60;
     * @param vegsystemreferanse Filtrer på [vegsystemreferanse](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1 m12&#x60;
     * @param kartutsnitt Filtrer med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;.  Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60;
     * @param polygon Filtrer med polygon i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret).  Eksempel: &#x60;20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000&#x60;
     * @param superid Hent noder tilkoblet detaljerte veglenker stedfestet på veglenkesekvens med denne IDen.
     * @param antall Angir hvor mange objekter som skal returneres. Se også &#x60;sidestørrelse&#x60; i responsens &#x60;metadata&#x60;-objekt.
     * @param start Angir paginerings-start for objekter som skal returneres. Brukes sammen med &#x60;antall&#x60;. Neste start får man i metadata-feltet i responsen. Settes blankt for å starte fra begynnelsen.
     * @param inkluderAntall Hvorvidt totalt antall objekter skal returneres i responsen. Default er &#x60;false&#x60;.
     * @return ResponseEntity&lt;NodeSide&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<NodeSide> getNoderWithHttpInfo(@jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable String kartutsnitt, @jakarta.annotation.Nullable String polygon, @jakarta.annotation.Nullable Long superid, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable String start, @jakarta.annotation.Nullable Boolean inkluderAntall) throws RestClientResponseException {
        ParameterizedTypeReference<NodeSide> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getNoderRequestCreation(srid, ider, fylke, kommune, kontraktsomrade, vegsystemreferanse, kartutsnitt, polygon, superid, antall, start, inkluderAntall).toEntity(localVarReturnType);
    }

    /**
     * Hent noder
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param ider Kommaseparert liste med IDer.
     * @param fylke Filtrer på fylke. Kommaseparert liste. Se [/omrader/api/v4/fylker](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getFylker) for mulige verdier.  Eksempel: &#x60;50&#x60;
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getKommuner) for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @param kontraktsomrade Filtrer på kontraktsomrade. Kommaseparert liste. Se [/omrader/api/v4/kontraktsomrader](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getKontraktsomrader) for mulige verdier.  Eksempel: &#x60;9503 Midtre Hålogaland 2021-2026&#x60;
     * @param vegsystemreferanse Filtrer på [vegsystemreferanse](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1 m12&#x60;
     * @param kartutsnitt Filtrer med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;.  Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60;
     * @param polygon Filtrer med polygon i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret).  Eksempel: &#x60;20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000&#x60;
     * @param superid Hent noder tilkoblet detaljerte veglenker stedfestet på veglenkesekvens med denne IDen.
     * @param antall Angir hvor mange objekter som skal returneres. Se også &#x60;sidestørrelse&#x60; i responsens &#x60;metadata&#x60;-objekt.
     * @param start Angir paginerings-start for objekter som skal returneres. Brukes sammen med &#x60;antall&#x60;. Neste start får man i metadata-feltet i responsen. Settes blankt for å starte fra begynnelsen.
     * @param inkluderAntall Hvorvidt totalt antall objekter skal returneres i responsen. Default er &#x60;false&#x60;.
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getNoderWithResponseSpec(@jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable String kartutsnitt, @jakarta.annotation.Nullable String polygon, @jakarta.annotation.Nullable Long superid, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable String start, @jakarta.annotation.Nullable Boolean inkluderAntall) throws RestClientResponseException {
        return getNoderRequestCreation(srid, ider, fylke, kommune, kontraktsomrade, vegsystemreferanse, kartutsnitt, polygon, superid, antall, start, inkluderAntall);
    }
}

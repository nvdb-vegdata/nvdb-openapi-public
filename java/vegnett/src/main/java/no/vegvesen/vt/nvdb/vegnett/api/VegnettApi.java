package no.vegvesen.vt.nvdb.vegnett.api;

import no.vegvesen.vt.nvdb.vegnett.infrastructure.ApiClient;

import no.vegvesen.vt.nvdb.vegnett.model.AdskilteLop;
import no.vegvesen.vt.nvdb.vegnett.model.DetaljnivaParameter;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import no.vegvesen.vt.nvdb.vegnett.model.ProblemDetail;
import java.util.Set;
import no.vegvesen.vt.nvdb.vegnett.model.SridParameter;
import no.vegvesen.vt.nvdb.vegnett.model.TopologinivaParameter;
import no.vegvesen.vt.nvdb.vegnett.model.Trafikantgruppe;
import no.vegvesen.vt.nvdb.vegnett.model.TypeVegSosi;
import no.vegvesen.vt.nvdb.vegnett.model.Veglenkesegment;
import no.vegvesen.vt.nvdb.vegnett.model.VeglenkesegmenterSide;
import no.vegvesen.vt.nvdb.vegnett.model.Veglenkesekvens;
import no.vegvesen.vt.nvdb.vegnett.model.VeglenkesekvensEndringerSide;
import no.vegvesen.vt.nvdb.vegnett.model.VeglenkesekvenserSide;
import no.vegvesen.vt.nvdb.vegnett.model.VeglenketypeParameter;

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
public class VegnettApi {
    private ApiClient apiClient;

    public VegnettApi() {
        this(new ApiClient());
    }

    public VegnettApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }


    public static class GetSegmentertVeglenkesekvensRequest {
        private @jakarta.annotation.Nonnull Long veglenkesekvensId;
        private @jakarta.annotation.Nullable SridParameter srid;
        private @jakarta.annotation.Nullable Boolean historisk;
        private @jakarta.annotation.Nullable LocalDate tidspunkt;

        public GetSegmentertVeglenkesekvensRequest() {}

        public GetSegmentertVeglenkesekvensRequest(@jakarta.annotation.Nonnull Long veglenkesekvensId, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable Boolean historisk, @jakarta.annotation.Nullable LocalDate tidspunkt) {
            this.veglenkesekvensId = veglenkesekvensId;
            this.srid = srid;
            this.historisk = historisk;
            this.tidspunkt = tidspunkt;
        }

        public @jakarta.annotation.Nonnull Long veglenkesekvensId() {
            return this.veglenkesekvensId;
        }
        public GetSegmentertVeglenkesekvensRequest veglenkesekvensId(@jakarta.annotation.Nonnull Long veglenkesekvensId) {
            this.veglenkesekvensId = veglenkesekvensId;
            return this;
        }

        public @jakarta.annotation.Nullable SridParameter srid() {
            return this.srid;
        }
        public GetSegmentertVeglenkesekvensRequest srid(@jakarta.annotation.Nullable SridParameter srid) {
            this.srid = srid;
            return this;
        }

        public @jakarta.annotation.Nullable Boolean historisk() {
            return this.historisk;
        }
        public GetSegmentertVeglenkesekvensRequest historisk(@jakarta.annotation.Nullable Boolean historisk) {
            this.historisk = historisk;
            return this;
        }

        public @jakarta.annotation.Nullable LocalDate tidspunkt() {
            return this.tidspunkt;
        }
        public GetSegmentertVeglenkesekvensRequest tidspunkt(@jakarta.annotation.Nullable LocalDate tidspunkt) {
            this.tidspunkt = tidspunkt;
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
            GetSegmentertVeglenkesekvensRequest request = (GetSegmentertVeglenkesekvensRequest) o;
            return Objects.equals(this.veglenkesekvensId, request.veglenkesekvensId()) &&
                Objects.equals(this.srid, request.srid()) &&
                Objects.equals(this.historisk, request.historisk()) &&
                Objects.equals(this.tidspunkt, request.tidspunkt());
        }

        @Override
        public int hashCode() {
            return Objects.hash(veglenkesekvensId, srid, historisk, tidspunkt);
        }
    }

    /**
    * Hent en segmentert veglenkesekvens
    * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param requestParameters The getSegmentertVeglenkesekvens request parameters as object
     * @return List&lt;Veglenkesegment&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public List<Veglenkesegment> getSegmentertVeglenkesekvens(GetSegmentertVeglenkesekvensRequest requestParameters) throws RestClientResponseException {
      return this.getSegmentertVeglenkesekvens(requestParameters.veglenkesekvensId(), requestParameters.srid(), requestParameters.historisk(), requestParameters.tidspunkt());
    }

  /**
  * Hent en segmentert veglenkesekvens
  * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param requestParameters The getSegmentertVeglenkesekvens request parameters as object
     * @return ResponseEntity&lt;List&lt;Veglenkesegment&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseEntity<List<Veglenkesegment>> getSegmentertVeglenkesekvensWithHttpInfo(GetSegmentertVeglenkesekvensRequest requestParameters) throws RestClientResponseException {
      return this.getSegmentertVeglenkesekvensWithHttpInfo(requestParameters.veglenkesekvensId(), requestParameters.srid(), requestParameters.historisk(), requestParameters.tidspunkt());
    }

  /**
  * Hent en segmentert veglenkesekvens
  * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param requestParameters The getSegmentertVeglenkesekvens request parameters as object
  * @return ResponseSpec
  * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseSpec getSegmentertVeglenkesekvensWithResponseSpec(GetSegmentertVeglenkesekvensRequest requestParameters) throws RestClientResponseException {
      return this.getSegmentertVeglenkesekvensWithResponseSpec(requestParameters.veglenkesekvensId(), requestParameters.srid(), requestParameters.historisk(), requestParameters.tidspunkt());
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getSegmentertVeglenkesekvensRequestCreation(@jakarta.annotation.Nonnull Long veglenkesekvensId, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable Boolean historisk, @jakarta.annotation.Nullable LocalDate tidspunkt) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'veglenkesekvensId' is set
        if (veglenkesekvensId == null) {
            throw new RestClientResponseException("Missing the required parameter 'veglenkesekvensId' when calling getSegmentertVeglenkesekvens", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("veglenkesekvensId", veglenkesekvensId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

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

        ParameterizedTypeReference<List<Veglenkesegment>> localVarReturnType = new ParameterizedTypeReference<>() {};
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<Veglenkesegment> getSegmentertVeglenkesekvens(@jakarta.annotation.Nonnull Long veglenkesekvensId, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable Boolean historisk, @jakarta.annotation.Nullable LocalDate tidspunkt) throws RestClientResponseException {
        ParameterizedTypeReference<List<Veglenkesegment>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getSegmentertVeglenkesekvensRequestCreation(veglenkesekvensId, srid, historisk, tidspunkt).body(localVarReturnType);
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Veglenkesegment>> getSegmentertVeglenkesekvensWithHttpInfo(@jakarta.annotation.Nonnull Long veglenkesekvensId, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable Boolean historisk, @jakarta.annotation.Nullable LocalDate tidspunkt) throws RestClientResponseException {
        ParameterizedTypeReference<List<Veglenkesegment>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getSegmentertVeglenkesekvensRequestCreation(veglenkesekvensId, srid, historisk, tidspunkt).toEntity(localVarReturnType);
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getSegmentertVeglenkesekvensWithResponseSpec(@jakarta.annotation.Nonnull Long veglenkesekvensId, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable Boolean historisk, @jakarta.annotation.Nullable LocalDate tidspunkt) throws RestClientResponseException {
        return getSegmentertVeglenkesekvensRequestCreation(veglenkesekvensId, srid, historisk, tidspunkt);
    }

    public static class GetVeglenkesegmenterRequest {
        private @jakarta.annotation.Nullable SridParameter srid;
        private @jakarta.annotation.Nullable Set<Long> ider;
        private @jakarta.annotation.Nullable Set<Integer> fylke;
        private @jakarta.annotation.Nullable Set<Integer> kommune;
        private @jakarta.annotation.Nullable Set<String> kontraktsomrade;
        private @jakarta.annotation.Nullable Set<String> riksvegrute;
        private @jakarta.annotation.Nullable Set<String> vegforvalter;
        private @jakarta.annotation.Nullable Set<String> vegsystemreferanse;
        private @jakarta.annotation.Nullable String kartutsnitt;
        private @jakarta.annotation.Nullable String polygon;
        private @jakarta.annotation.Nullable Set<DetaljnivaParameter> detaljniva;
        private @jakarta.annotation.Nullable Set<TypeVegSosi> typeveg;
        private @jakarta.annotation.Nullable Long superid;
        private @jakarta.annotation.Nullable Set<AdskilteLop> adskiltelop;
        private @jakarta.annotation.Nullable Boolean kryssystem;
        private @jakarta.annotation.Nullable Boolean sideanlegg;
        private @jakarta.annotation.Nullable Set<VeglenketypeParameter> veglenketype;
        private @jakarta.annotation.Nullable Boolean arm;
        private @jakarta.annotation.Nullable Trafikantgruppe trafikantgruppe;
        private @jakarta.annotation.Nullable Integer geometritoleranse;
        private @jakarta.annotation.Nullable Boolean historisk;
        private @jakarta.annotation.Nullable LocalDate tidspunkt;
        private @jakarta.annotation.Nullable Integer antall;
        private @jakarta.annotation.Nullable String start;
        private @jakarta.annotation.Nullable Boolean inkluderAntall;

        public GetVeglenkesegmenterRequest() {}

        public GetVeglenkesegmenterRequest(@jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable Set<String> riksvegrute, @jakarta.annotation.Nullable Set<String> vegforvalter, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable String kartutsnitt, @jakarta.annotation.Nullable String polygon, @jakarta.annotation.Nullable Set<DetaljnivaParameter> detaljniva, @jakarta.annotation.Nullable Set<TypeVegSosi> typeveg, @jakarta.annotation.Nullable Long superid, @jakarta.annotation.Nullable Set<AdskilteLop> adskiltelop, @jakarta.annotation.Nullable Boolean kryssystem, @jakarta.annotation.Nullable Boolean sideanlegg, @jakarta.annotation.Nullable Set<VeglenketypeParameter> veglenketype, @jakarta.annotation.Nullable Boolean arm, @jakarta.annotation.Nullable Trafikantgruppe trafikantgruppe, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable Boolean historisk, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable String start, @jakarta.annotation.Nullable Boolean inkluderAntall) {
            this.srid = srid;
            this.ider = ider;
            this.fylke = fylke;
            this.kommune = kommune;
            this.kontraktsomrade = kontraktsomrade;
            this.riksvegrute = riksvegrute;
            this.vegforvalter = vegforvalter;
            this.vegsystemreferanse = vegsystemreferanse;
            this.kartutsnitt = kartutsnitt;
            this.polygon = polygon;
            this.detaljniva = detaljniva;
            this.typeveg = typeveg;
            this.superid = superid;
            this.adskiltelop = adskiltelop;
            this.kryssystem = kryssystem;
            this.sideanlegg = sideanlegg;
            this.veglenketype = veglenketype;
            this.arm = arm;
            this.trafikantgruppe = trafikantgruppe;
            this.geometritoleranse = geometritoleranse;
            this.historisk = historisk;
            this.tidspunkt = tidspunkt;
            this.antall = antall;
            this.start = start;
            this.inkluderAntall = inkluderAntall;
        }

        public @jakarta.annotation.Nullable SridParameter srid() {
            return this.srid;
        }
        public GetVeglenkesegmenterRequest srid(@jakarta.annotation.Nullable SridParameter srid) {
            this.srid = srid;
            return this;
        }

        public @jakarta.annotation.Nullable Set<Long> ider() {
            return this.ider;
        }
        public GetVeglenkesegmenterRequest ider(@jakarta.annotation.Nullable Set<Long> ider) {
            this.ider = ider;
            return this;
        }

        public @jakarta.annotation.Nullable Set<Integer> fylke() {
            return this.fylke;
        }
        public GetVeglenkesegmenterRequest fylke(@jakarta.annotation.Nullable Set<Integer> fylke) {
            this.fylke = fylke;
            return this;
        }

        public @jakarta.annotation.Nullable Set<Integer> kommune() {
            return this.kommune;
        }
        public GetVeglenkesegmenterRequest kommune(@jakarta.annotation.Nullable Set<Integer> kommune) {
            this.kommune = kommune;
            return this;
        }

        public @jakarta.annotation.Nullable Set<String> kontraktsomrade() {
            return this.kontraktsomrade;
        }
        public GetVeglenkesegmenterRequest kontraktsomrade(@jakarta.annotation.Nullable Set<String> kontraktsomrade) {
            this.kontraktsomrade = kontraktsomrade;
            return this;
        }

        public @jakarta.annotation.Nullable Set<String> riksvegrute() {
            return this.riksvegrute;
        }
        public GetVeglenkesegmenterRequest riksvegrute(@jakarta.annotation.Nullable Set<String> riksvegrute) {
            this.riksvegrute = riksvegrute;
            return this;
        }

        public @jakarta.annotation.Nullable Set<String> vegforvalter() {
            return this.vegforvalter;
        }
        public GetVeglenkesegmenterRequest vegforvalter(@jakarta.annotation.Nullable Set<String> vegforvalter) {
            this.vegforvalter = vegforvalter;
            return this;
        }

        public @jakarta.annotation.Nullable Set<String> vegsystemreferanse() {
            return this.vegsystemreferanse;
        }
        public GetVeglenkesegmenterRequest vegsystemreferanse(@jakarta.annotation.Nullable Set<String> vegsystemreferanse) {
            this.vegsystemreferanse = vegsystemreferanse;
            return this;
        }

        public @jakarta.annotation.Nullable String kartutsnitt() {
            return this.kartutsnitt;
        }
        public GetVeglenkesegmenterRequest kartutsnitt(@jakarta.annotation.Nullable String kartutsnitt) {
            this.kartutsnitt = kartutsnitt;
            return this;
        }

        public @jakarta.annotation.Nullable String polygon() {
            return this.polygon;
        }
        public GetVeglenkesegmenterRequest polygon(@jakarta.annotation.Nullable String polygon) {
            this.polygon = polygon;
            return this;
        }

        public @jakarta.annotation.Nullable Set<DetaljnivaParameter> detaljniva() {
            return this.detaljniva;
        }
        public GetVeglenkesegmenterRequest detaljniva(@jakarta.annotation.Nullable Set<DetaljnivaParameter> detaljniva) {
            this.detaljniva = detaljniva;
            return this;
        }

        public @jakarta.annotation.Nullable Set<TypeVegSosi> typeveg() {
            return this.typeveg;
        }
        public GetVeglenkesegmenterRequest typeveg(@jakarta.annotation.Nullable Set<TypeVegSosi> typeveg) {
            this.typeveg = typeveg;
            return this;
        }

        public @jakarta.annotation.Nullable Long superid() {
            return this.superid;
        }
        public GetVeglenkesegmenterRequest superid(@jakarta.annotation.Nullable Long superid) {
            this.superid = superid;
            return this;
        }

        public @jakarta.annotation.Nullable Set<AdskilteLop> adskiltelop() {
            return this.adskiltelop;
        }
        public GetVeglenkesegmenterRequest adskiltelop(@jakarta.annotation.Nullable Set<AdskilteLop> adskiltelop) {
            this.adskiltelop = adskiltelop;
            return this;
        }

        public @jakarta.annotation.Nullable Boolean kryssystem() {
            return this.kryssystem;
        }
        public GetVeglenkesegmenterRequest kryssystem(@jakarta.annotation.Nullable Boolean kryssystem) {
            this.kryssystem = kryssystem;
            return this;
        }

        public @jakarta.annotation.Nullable Boolean sideanlegg() {
            return this.sideanlegg;
        }
        public GetVeglenkesegmenterRequest sideanlegg(@jakarta.annotation.Nullable Boolean sideanlegg) {
            this.sideanlegg = sideanlegg;
            return this;
        }

        public @jakarta.annotation.Nullable Set<VeglenketypeParameter> veglenketype() {
            return this.veglenketype;
        }
        public GetVeglenkesegmenterRequest veglenketype(@jakarta.annotation.Nullable Set<VeglenketypeParameter> veglenketype) {
            this.veglenketype = veglenketype;
            return this;
        }

        public @jakarta.annotation.Nullable Boolean arm() {
            return this.arm;
        }
        public GetVeglenkesegmenterRequest arm(@jakarta.annotation.Nullable Boolean arm) {
            this.arm = arm;
            return this;
        }

        public @jakarta.annotation.Nullable Trafikantgruppe trafikantgruppe() {
            return this.trafikantgruppe;
        }
        public GetVeglenkesegmenterRequest trafikantgruppe(@jakarta.annotation.Nullable Trafikantgruppe trafikantgruppe) {
            this.trafikantgruppe = trafikantgruppe;
            return this;
        }

        public @jakarta.annotation.Nullable Integer geometritoleranse() {
            return this.geometritoleranse;
        }
        public GetVeglenkesegmenterRequest geometritoleranse(@jakarta.annotation.Nullable Integer geometritoleranse) {
            this.geometritoleranse = geometritoleranse;
            return this;
        }

        public @jakarta.annotation.Nullable Boolean historisk() {
            return this.historisk;
        }
        public GetVeglenkesegmenterRequest historisk(@jakarta.annotation.Nullable Boolean historisk) {
            this.historisk = historisk;
            return this;
        }

        public @jakarta.annotation.Nullable LocalDate tidspunkt() {
            return this.tidspunkt;
        }
        public GetVeglenkesegmenterRequest tidspunkt(@jakarta.annotation.Nullable LocalDate tidspunkt) {
            this.tidspunkt = tidspunkt;
            return this;
        }

        public @jakarta.annotation.Nullable Integer antall() {
            return this.antall;
        }
        public GetVeglenkesegmenterRequest antall(@jakarta.annotation.Nullable Integer antall) {
            this.antall = antall;
            return this;
        }

        public @jakarta.annotation.Nullable String start() {
            return this.start;
        }
        public GetVeglenkesegmenterRequest start(@jakarta.annotation.Nullable String start) {
            this.start = start;
            return this;
        }

        public @jakarta.annotation.Nullable Boolean inkluderAntall() {
            return this.inkluderAntall;
        }
        public GetVeglenkesegmenterRequest inkluderAntall(@jakarta.annotation.Nullable Boolean inkluderAntall) {
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
            GetVeglenkesegmenterRequest request = (GetVeglenkesegmenterRequest) o;
            return Objects.equals(this.srid, request.srid()) &&
                Objects.equals(this.ider, request.ider()) &&
                Objects.equals(this.fylke, request.fylke()) &&
                Objects.equals(this.kommune, request.kommune()) &&
                Objects.equals(this.kontraktsomrade, request.kontraktsomrade()) &&
                Objects.equals(this.riksvegrute, request.riksvegrute()) &&
                Objects.equals(this.vegforvalter, request.vegforvalter()) &&
                Objects.equals(this.vegsystemreferanse, request.vegsystemreferanse()) &&
                Objects.equals(this.kartutsnitt, request.kartutsnitt()) &&
                Objects.equals(this.polygon, request.polygon()) &&
                Objects.equals(this.detaljniva, request.detaljniva()) &&
                Objects.equals(this.typeveg, request.typeveg()) &&
                Objects.equals(this.superid, request.superid()) &&
                Objects.equals(this.adskiltelop, request.adskiltelop()) &&
                Objects.equals(this.kryssystem, request.kryssystem()) &&
                Objects.equals(this.sideanlegg, request.sideanlegg()) &&
                Objects.equals(this.veglenketype, request.veglenketype()) &&
                Objects.equals(this.arm, request.arm()) &&
                Objects.equals(this.trafikantgruppe, request.trafikantgruppe()) &&
                Objects.equals(this.geometritoleranse, request.geometritoleranse()) &&
                Objects.equals(this.historisk, request.historisk()) &&
                Objects.equals(this.tidspunkt, request.tidspunkt()) &&
                Objects.equals(this.antall, request.antall()) &&
                Objects.equals(this.start, request.start()) &&
                Objects.equals(this.inkluderAntall, request.inkluderAntall());
        }

        @Override
        public int hashCode() {
            return Objects.hash(srid, ider, fylke, kommune, kontraktsomrade, riksvegrute, vegforvalter, vegsystemreferanse, kartutsnitt, polygon, detaljniva, typeveg, superid, adskiltelop, kryssystem, sideanlegg, veglenketype, arm, trafikantgruppe, geometritoleranse, historisk, tidspunkt, antall, start, inkluderAntall);
        }
    }

    /**
    * Hent segmenterte veglenkesekvenser
    * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param requestParameters The getVeglenkesegmenter request parameters as object
     * @return VeglenkesegmenterSide
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public VeglenkesegmenterSide getVeglenkesegmenter(GetVeglenkesegmenterRequest requestParameters) throws RestClientResponseException {
      return this.getVeglenkesegmenter(requestParameters.srid(), requestParameters.ider(), requestParameters.fylke(), requestParameters.kommune(), requestParameters.kontraktsomrade(), requestParameters.riksvegrute(), requestParameters.vegforvalter(), requestParameters.vegsystemreferanse(), requestParameters.kartutsnitt(), requestParameters.polygon(), requestParameters.detaljniva(), requestParameters.typeveg(), requestParameters.superid(), requestParameters.adskiltelop(), requestParameters.kryssystem(), requestParameters.sideanlegg(), requestParameters.veglenketype(), requestParameters.arm(), requestParameters.trafikantgruppe(), requestParameters.geometritoleranse(), requestParameters.historisk(), requestParameters.tidspunkt(), requestParameters.antall(), requestParameters.start(), requestParameters.inkluderAntall());
    }

  /**
  * Hent segmenterte veglenkesekvenser
  * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param requestParameters The getVeglenkesegmenter request parameters as object
     * @return ResponseEntity&lt;VeglenkesegmenterSide&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseEntity<VeglenkesegmenterSide> getVeglenkesegmenterWithHttpInfo(GetVeglenkesegmenterRequest requestParameters) throws RestClientResponseException {
      return this.getVeglenkesegmenterWithHttpInfo(requestParameters.srid(), requestParameters.ider(), requestParameters.fylke(), requestParameters.kommune(), requestParameters.kontraktsomrade(), requestParameters.riksvegrute(), requestParameters.vegforvalter(), requestParameters.vegsystemreferanse(), requestParameters.kartutsnitt(), requestParameters.polygon(), requestParameters.detaljniva(), requestParameters.typeveg(), requestParameters.superid(), requestParameters.adskiltelop(), requestParameters.kryssystem(), requestParameters.sideanlegg(), requestParameters.veglenketype(), requestParameters.arm(), requestParameters.trafikantgruppe(), requestParameters.geometritoleranse(), requestParameters.historisk(), requestParameters.tidspunkt(), requestParameters.antall(), requestParameters.start(), requestParameters.inkluderAntall());
    }

  /**
  * Hent segmenterte veglenkesekvenser
  * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param requestParameters The getVeglenkesegmenter request parameters as object
  * @return ResponseSpec
  * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseSpec getVeglenkesegmenterWithResponseSpec(GetVeglenkesegmenterRequest requestParameters) throws RestClientResponseException {
      return this.getVeglenkesegmenterWithResponseSpec(requestParameters.srid(), requestParameters.ider(), requestParameters.fylke(), requestParameters.kommune(), requestParameters.kontraktsomrade(), requestParameters.riksvegrute(), requestParameters.vegforvalter(), requestParameters.vegsystemreferanse(), requestParameters.kartutsnitt(), requestParameters.polygon(), requestParameters.detaljniva(), requestParameters.typeveg(), requestParameters.superid(), requestParameters.adskiltelop(), requestParameters.kryssystem(), requestParameters.sideanlegg(), requestParameters.veglenketype(), requestParameters.arm(), requestParameters.trafikantgruppe(), requestParameters.geometritoleranse(), requestParameters.historisk(), requestParameters.tidspunkt(), requestParameters.antall(), requestParameters.start(), requestParameters.inkluderAntall());
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
     * @param fylke Filtrer på fylke. Kommaseparert liste. Se [/omrader/api/v4/fylker](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getFylker) for mulige verdier.  Eksempel: &#x60;50&#x60;
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getKommuner) for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @param kontraktsomrade Filtrer på kontraktsomrade. Kommaseparert liste. Se [/omrader/api/v4/kontraktsomrader](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getKontraktsomrader) for mulige verdier.  Eksempel: &#x60;9503 Midtre Hålogaland 2021-2026&#x60;
     * @param riksvegrute Filtrer på riksvegrute. Kommaseparert liste. Se [/omrader/api/v4/riksvegruter](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getRiksvegruter) for mulige verdier.  Eksempel: &#x60;RUTE4A&#x60; eller som enumid &#x60;20290&#x60;
     * @param vegforvalter Filtrer på vegforvalter. Kommaseparert liste. Se [/omrader/api/v4/vegforvaltere](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getVegforvaltere) for mulige verdier.  Eksempel: &#x60;Møre og Romsdal fylkeskommune&#x60; eller som enumid &#x60;21774&#x60;
     * @param vegsystemreferanse Filtrer på [vegsystemreferanse](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1 m12&#x60;
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getVeglenkesegmenterRequestCreation(@jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable Set<String> riksvegrute, @jakarta.annotation.Nullable Set<String> vegforvalter, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable String kartutsnitt, @jakarta.annotation.Nullable String polygon, @jakarta.annotation.Nullable Set<DetaljnivaParameter> detaljniva, @jakarta.annotation.Nullable Set<TypeVegSosi> typeveg, @jakarta.annotation.Nullable Long superid, @jakarta.annotation.Nullable Set<AdskilteLop> adskiltelop, @jakarta.annotation.Nullable Boolean kryssystem, @jakarta.annotation.Nullable Boolean sideanlegg, @jakarta.annotation.Nullable Set<VeglenketypeParameter> veglenketype, @jakarta.annotation.Nullable Boolean arm, @jakarta.annotation.Nullable Trafikantgruppe trafikantgruppe, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable Boolean historisk, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable String start, @jakarta.annotation.Nullable Boolean inkluderAntall) throws RestClientResponseException {
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

        ParameterizedTypeReference<VeglenkesegmenterSide> localVarReturnType = new ParameterizedTypeReference<>() {};
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
     * @param fylke Filtrer på fylke. Kommaseparert liste. Se [/omrader/api/v4/fylker](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getFylker) for mulige verdier.  Eksempel: &#x60;50&#x60;
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getKommuner) for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @param kontraktsomrade Filtrer på kontraktsomrade. Kommaseparert liste. Se [/omrader/api/v4/kontraktsomrader](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getKontraktsomrader) for mulige verdier.  Eksempel: &#x60;9503 Midtre Hålogaland 2021-2026&#x60;
     * @param riksvegrute Filtrer på riksvegrute. Kommaseparert liste. Se [/omrader/api/v4/riksvegruter](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getRiksvegruter) for mulige verdier.  Eksempel: &#x60;RUTE4A&#x60; eller som enumid &#x60;20290&#x60;
     * @param vegforvalter Filtrer på vegforvalter. Kommaseparert liste. Se [/omrader/api/v4/vegforvaltere](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getVegforvaltere) for mulige verdier.  Eksempel: &#x60;Møre og Romsdal fylkeskommune&#x60; eller som enumid &#x60;21774&#x60;
     * @param vegsystemreferanse Filtrer på [vegsystemreferanse](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1 m12&#x60;
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public VeglenkesegmenterSide getVeglenkesegmenter(@jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable Set<String> riksvegrute, @jakarta.annotation.Nullable Set<String> vegforvalter, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable String kartutsnitt, @jakarta.annotation.Nullable String polygon, @jakarta.annotation.Nullable Set<DetaljnivaParameter> detaljniva, @jakarta.annotation.Nullable Set<TypeVegSosi> typeveg, @jakarta.annotation.Nullable Long superid, @jakarta.annotation.Nullable Set<AdskilteLop> adskiltelop, @jakarta.annotation.Nullable Boolean kryssystem, @jakarta.annotation.Nullable Boolean sideanlegg, @jakarta.annotation.Nullable Set<VeglenketypeParameter> veglenketype, @jakarta.annotation.Nullable Boolean arm, @jakarta.annotation.Nullable Trafikantgruppe trafikantgruppe, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable Boolean historisk, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable String start, @jakarta.annotation.Nullable Boolean inkluderAntall) throws RestClientResponseException {
        ParameterizedTypeReference<VeglenkesegmenterSide> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getVeglenkesegmenterRequestCreation(srid, ider, fylke, kommune, kontraktsomrade, riksvegrute, vegforvalter, vegsystemreferanse, kartutsnitt, polygon, detaljniva, typeveg, superid, adskiltelop, kryssystem, sideanlegg, veglenketype, arm, trafikantgruppe, geometritoleranse, historisk, tidspunkt, antall, start, inkluderAntall).body(localVarReturnType);
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
     * @param fylke Filtrer på fylke. Kommaseparert liste. Se [/omrader/api/v4/fylker](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getFylker) for mulige verdier.  Eksempel: &#x60;50&#x60;
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getKommuner) for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @param kontraktsomrade Filtrer på kontraktsomrade. Kommaseparert liste. Se [/omrader/api/v4/kontraktsomrader](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getKontraktsomrader) for mulige verdier.  Eksempel: &#x60;9503 Midtre Hålogaland 2021-2026&#x60;
     * @param riksvegrute Filtrer på riksvegrute. Kommaseparert liste. Se [/omrader/api/v4/riksvegruter](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getRiksvegruter) for mulige verdier.  Eksempel: &#x60;RUTE4A&#x60; eller som enumid &#x60;20290&#x60;
     * @param vegforvalter Filtrer på vegforvalter. Kommaseparert liste. Se [/omrader/api/v4/vegforvaltere](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getVegforvaltere) for mulige verdier.  Eksempel: &#x60;Møre og Romsdal fylkeskommune&#x60; eller som enumid &#x60;21774&#x60;
     * @param vegsystemreferanse Filtrer på [vegsystemreferanse](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1 m12&#x60;
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<VeglenkesegmenterSide> getVeglenkesegmenterWithHttpInfo(@jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable Set<String> riksvegrute, @jakarta.annotation.Nullable Set<String> vegforvalter, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable String kartutsnitt, @jakarta.annotation.Nullable String polygon, @jakarta.annotation.Nullable Set<DetaljnivaParameter> detaljniva, @jakarta.annotation.Nullable Set<TypeVegSosi> typeveg, @jakarta.annotation.Nullable Long superid, @jakarta.annotation.Nullable Set<AdskilteLop> adskiltelop, @jakarta.annotation.Nullable Boolean kryssystem, @jakarta.annotation.Nullable Boolean sideanlegg, @jakarta.annotation.Nullable Set<VeglenketypeParameter> veglenketype, @jakarta.annotation.Nullable Boolean arm, @jakarta.annotation.Nullable Trafikantgruppe trafikantgruppe, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable Boolean historisk, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable String start, @jakarta.annotation.Nullable Boolean inkluderAntall) throws RestClientResponseException {
        ParameterizedTypeReference<VeglenkesegmenterSide> localVarReturnType = new ParameterizedTypeReference<>() {};
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
     * @param fylke Filtrer på fylke. Kommaseparert liste. Se [/omrader/api/v4/fylker](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getFylker) for mulige verdier.  Eksempel: &#x60;50&#x60;
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getKommuner) for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @param kontraktsomrade Filtrer på kontraktsomrade. Kommaseparert liste. Se [/omrader/api/v4/kontraktsomrader](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getKontraktsomrader) for mulige verdier.  Eksempel: &#x60;9503 Midtre Hålogaland 2021-2026&#x60;
     * @param riksvegrute Filtrer på riksvegrute. Kommaseparert liste. Se [/omrader/api/v4/riksvegruter](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getRiksvegruter) for mulige verdier.  Eksempel: &#x60;RUTE4A&#x60; eller som enumid &#x60;20290&#x60;
     * @param vegforvalter Filtrer på vegforvalter. Kommaseparert liste. Se [/omrader/api/v4/vegforvaltere](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getVegforvaltere) for mulige verdier.  Eksempel: &#x60;Møre og Romsdal fylkeskommune&#x60; eller som enumid &#x60;21774&#x60;
     * @param vegsystemreferanse Filtrer på [vegsystemreferanse](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1 m12&#x60;
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getVeglenkesegmenterWithResponseSpec(@jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable Set<String> riksvegrute, @jakarta.annotation.Nullable Set<String> vegforvalter, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable String kartutsnitt, @jakarta.annotation.Nullable String polygon, @jakarta.annotation.Nullable Set<DetaljnivaParameter> detaljniva, @jakarta.annotation.Nullable Set<TypeVegSosi> typeveg, @jakarta.annotation.Nullable Long superid, @jakarta.annotation.Nullable Set<AdskilteLop> adskiltelop, @jakarta.annotation.Nullable Boolean kryssystem, @jakarta.annotation.Nullable Boolean sideanlegg, @jakarta.annotation.Nullable Set<VeglenketypeParameter> veglenketype, @jakarta.annotation.Nullable Boolean arm, @jakarta.annotation.Nullable Trafikantgruppe trafikantgruppe, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable Boolean historisk, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable String start, @jakarta.annotation.Nullable Boolean inkluderAntall) throws RestClientResponseException {
        return getVeglenkesegmenterRequestCreation(srid, ider, fylke, kommune, kontraktsomrade, riksvegrute, vegforvalter, vegsystemreferanse, kartutsnitt, polygon, detaljniva, typeveg, superid, adskiltelop, kryssystem, sideanlegg, veglenketype, arm, trafikantgruppe, geometritoleranse, historisk, tidspunkt, antall, start, inkluderAntall);
    }

    public static class GetVeglenkesekvensRequest {
        private @jakarta.annotation.Nonnull Long veglenkesekvensId;
        private @jakarta.annotation.Nullable SridParameter srid;

        public GetVeglenkesekvensRequest() {}

        public GetVeglenkesekvensRequest(@jakarta.annotation.Nonnull Long veglenkesekvensId, @jakarta.annotation.Nullable SridParameter srid) {
            this.veglenkesekvensId = veglenkesekvensId;
            this.srid = srid;
        }

        public @jakarta.annotation.Nonnull Long veglenkesekvensId() {
            return this.veglenkesekvensId;
        }
        public GetVeglenkesekvensRequest veglenkesekvensId(@jakarta.annotation.Nonnull Long veglenkesekvensId) {
            this.veglenkesekvensId = veglenkesekvensId;
            return this;
        }

        public @jakarta.annotation.Nullable SridParameter srid() {
            return this.srid;
        }
        public GetVeglenkesekvensRequest srid(@jakarta.annotation.Nullable SridParameter srid) {
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
            GetVeglenkesekvensRequest request = (GetVeglenkesekvensRequest) o;
            return Objects.equals(this.veglenkesekvensId, request.veglenkesekvensId()) &&
                Objects.equals(this.srid, request.srid());
        }

        @Override
        public int hashCode() {
            return Objects.hash(veglenkesekvensId, srid);
        }
    }

    /**
    * Hent en veglenkesekvens
    * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param requestParameters The getVeglenkesekvens request parameters as object
     * @return Veglenkesekvens
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public Veglenkesekvens getVeglenkesekvens(GetVeglenkesekvensRequest requestParameters) throws RestClientResponseException {
      return this.getVeglenkesekvens(requestParameters.veglenkesekvensId(), requestParameters.srid());
    }

  /**
  * Hent en veglenkesekvens
  * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param requestParameters The getVeglenkesekvens request parameters as object
     * @return ResponseEntity&lt;Veglenkesekvens&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseEntity<Veglenkesekvens> getVeglenkesekvensWithHttpInfo(GetVeglenkesekvensRequest requestParameters) throws RestClientResponseException {
      return this.getVeglenkesekvensWithHttpInfo(requestParameters.veglenkesekvensId(), requestParameters.srid());
    }

  /**
  * Hent en veglenkesekvens
  * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param requestParameters The getVeglenkesekvens request parameters as object
  * @return ResponseSpec
  * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseSpec getVeglenkesekvensWithResponseSpec(GetVeglenkesekvensRequest requestParameters) throws RestClientResponseException {
      return this.getVeglenkesekvensWithResponseSpec(requestParameters.veglenkesekvensId(), requestParameters.srid());
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getVeglenkesekvensRequestCreation(@jakarta.annotation.Nonnull Long veglenkesekvensId, @jakarta.annotation.Nullable SridParameter srid) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'veglenkesekvensId' is set
        if (veglenkesekvensId == null) {
            throw new RestClientResponseException("Missing the required parameter 'veglenkesekvensId' when calling getVeglenkesekvens", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("veglenkesekvensId", veglenkesekvensId);

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

        ParameterizedTypeReference<Veglenkesekvens> localVarReturnType = new ParameterizedTypeReference<>() {};
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Veglenkesekvens getVeglenkesekvens(@jakarta.annotation.Nonnull Long veglenkesekvensId, @jakarta.annotation.Nullable SridParameter srid) throws RestClientResponseException {
        ParameterizedTypeReference<Veglenkesekvens> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getVeglenkesekvensRequestCreation(veglenkesekvensId, srid).body(localVarReturnType);
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Veglenkesekvens> getVeglenkesekvensWithHttpInfo(@jakarta.annotation.Nonnull Long veglenkesekvensId, @jakarta.annotation.Nullable SridParameter srid) throws RestClientResponseException {
        ParameterizedTypeReference<Veglenkesekvens> localVarReturnType = new ParameterizedTypeReference<>() {};
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getVeglenkesekvensWithResponseSpec(@jakarta.annotation.Nonnull Long veglenkesekvensId, @jakarta.annotation.Nullable SridParameter srid) throws RestClientResponseException {
        return getVeglenkesekvensRequestCreation(veglenkesekvensId, srid);
    }

    public static class GetVeglenkesekvensEndringerRequest {
        private @jakarta.annotation.Nullable OffsetDateTime start;
        private @jakarta.annotation.Nullable Integer antall;
        private @jakarta.annotation.Nullable Set<Long> ider;
        private @jakarta.annotation.Nullable Set<Integer> fylke;
        private @jakarta.annotation.Nullable Set<Integer> kommune;

        public GetVeglenkesekvensEndringerRequest() {}

        public GetVeglenkesekvensEndringerRequest(@jakarta.annotation.Nullable OffsetDateTime start, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune) {
            this.start = start;
            this.antall = antall;
            this.ider = ider;
            this.fylke = fylke;
            this.kommune = kommune;
        }

        public @jakarta.annotation.Nullable OffsetDateTime start() {
            return this.start;
        }
        public GetVeglenkesekvensEndringerRequest start(@jakarta.annotation.Nullable OffsetDateTime start) {
            this.start = start;
            return this;
        }

        public @jakarta.annotation.Nullable Integer antall() {
            return this.antall;
        }
        public GetVeglenkesekvensEndringerRequest antall(@jakarta.annotation.Nullable Integer antall) {
            this.antall = antall;
            return this;
        }

        public @jakarta.annotation.Nullable Set<Long> ider() {
            return this.ider;
        }
        public GetVeglenkesekvensEndringerRequest ider(@jakarta.annotation.Nullable Set<Long> ider) {
            this.ider = ider;
            return this;
        }

        public @jakarta.annotation.Nullable Set<Integer> fylke() {
            return this.fylke;
        }
        public GetVeglenkesekvensEndringerRequest fylke(@jakarta.annotation.Nullable Set<Integer> fylke) {
            this.fylke = fylke;
            return this;
        }

        public @jakarta.annotation.Nullable Set<Integer> kommune() {
            return this.kommune;
        }
        public GetVeglenkesekvensEndringerRequest kommune(@jakarta.annotation.Nullable Set<Integer> kommune) {
            this.kommune = kommune;
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
            GetVeglenkesekvensEndringerRequest request = (GetVeglenkesekvensEndringerRequest) o;
            return Objects.equals(this.start, request.start()) &&
                Objects.equals(this.antall, request.antall()) &&
                Objects.equals(this.ider, request.ider()) &&
                Objects.equals(this.fylke, request.fylke()) &&
                Objects.equals(this.kommune, request.kommune());
        }

        @Override
        public int hashCode() {
            return Objects.hash(start, antall, ider, fylke, kommune);
        }
    }

    /**
    * Hent endringer på veglenkesekvenser innen siste 30 dager
    * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param requestParameters The getVeglenkesekvensEndringer request parameters as object
     * @return VeglenkesekvensEndringerSide
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public VeglenkesekvensEndringerSide getVeglenkesekvensEndringer(GetVeglenkesekvensEndringerRequest requestParameters) throws RestClientResponseException {
      return this.getVeglenkesekvensEndringer(requestParameters.start(), requestParameters.antall(), requestParameters.ider(), requestParameters.fylke(), requestParameters.kommune());
    }

  /**
  * Hent endringer på veglenkesekvenser innen siste 30 dager
  * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param requestParameters The getVeglenkesekvensEndringer request parameters as object
     * @return ResponseEntity&lt;VeglenkesekvensEndringerSide&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseEntity<VeglenkesekvensEndringerSide> getVeglenkesekvensEndringerWithHttpInfo(GetVeglenkesekvensEndringerRequest requestParameters) throws RestClientResponseException {
      return this.getVeglenkesekvensEndringerWithHttpInfo(requestParameters.start(), requestParameters.antall(), requestParameters.ider(), requestParameters.fylke(), requestParameters.kommune());
    }

  /**
  * Hent endringer på veglenkesekvenser innen siste 30 dager
  * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param requestParameters The getVeglenkesekvensEndringer request parameters as object
  * @return ResponseSpec
  * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseSpec getVeglenkesekvensEndringerWithResponseSpec(GetVeglenkesekvensEndringerRequest requestParameters) throws RestClientResponseException {
      return this.getVeglenkesekvensEndringerWithResponseSpec(requestParameters.start(), requestParameters.antall(), requestParameters.ider(), requestParameters.fylke(), requestParameters.kommune());
    }

    /**
     * Hent endringer på veglenkesekvenser innen siste 30 dager
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param start Hent alle endringer etter gitt tidspunkt. Dersom denne utelates vil de eldste endringene hentes først.
     * @param antall Antall endringer som skal være med i responsen. Merk at det faktiske antallet kan variere fra respons til respons. Dette er fordi endringer på samme veglenkesekvens innenfor samme side blir aggregert sammen ved å ta den nyeste endringen.
     * @param ider Hent endringer for oppgitte veglenkesekvens IDer. Dersom denne utelates vil alle endringer hentes.
     * @param fylke Filtrer på fylke. Kommaseparert liste. Se [/omrader/api/v4/fylker](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getFylker) for mulige verdier.  Eksempel: &#x60;50&#x60;
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getKommuner) for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @return VeglenkesekvensEndringerSide
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getVeglenkesekvensEndringerRequestCreation(@jakarta.annotation.Nullable OffsetDateTime start, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune) throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start", start));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "antall", antall));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "ider", ider));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "fylke", fylke));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "kommune", kommune));
        
        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<VeglenkesekvensEndringerSide> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/api/v4/veglenkesekvenser/endringer", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Hent endringer på veglenkesekvenser innen siste 30 dager
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param start Hent alle endringer etter gitt tidspunkt. Dersom denne utelates vil de eldste endringene hentes først.
     * @param antall Antall endringer som skal være med i responsen. Merk at det faktiske antallet kan variere fra respons til respons. Dette er fordi endringer på samme veglenkesekvens innenfor samme side blir aggregert sammen ved å ta den nyeste endringen.
     * @param ider Hent endringer for oppgitte veglenkesekvens IDer. Dersom denne utelates vil alle endringer hentes.
     * @param fylke Filtrer på fylke. Kommaseparert liste. Se [/omrader/api/v4/fylker](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getFylker) for mulige verdier.  Eksempel: &#x60;50&#x60;
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getKommuner) for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @return VeglenkesekvensEndringerSide
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public VeglenkesekvensEndringerSide getVeglenkesekvensEndringer(@jakarta.annotation.Nullable OffsetDateTime start, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune) throws RestClientResponseException {
        ParameterizedTypeReference<VeglenkesekvensEndringerSide> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getVeglenkesekvensEndringerRequestCreation(start, antall, ider, fylke, kommune).body(localVarReturnType);
    }

    /**
     * Hent endringer på veglenkesekvenser innen siste 30 dager
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param start Hent alle endringer etter gitt tidspunkt. Dersom denne utelates vil de eldste endringene hentes først.
     * @param antall Antall endringer som skal være med i responsen. Merk at det faktiske antallet kan variere fra respons til respons. Dette er fordi endringer på samme veglenkesekvens innenfor samme side blir aggregert sammen ved å ta den nyeste endringen.
     * @param ider Hent endringer for oppgitte veglenkesekvens IDer. Dersom denne utelates vil alle endringer hentes.
     * @param fylke Filtrer på fylke. Kommaseparert liste. Se [/omrader/api/v4/fylker](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getFylker) for mulige verdier.  Eksempel: &#x60;50&#x60;
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getKommuner) for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @return ResponseEntity&lt;VeglenkesekvensEndringerSide&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<VeglenkesekvensEndringerSide> getVeglenkesekvensEndringerWithHttpInfo(@jakarta.annotation.Nullable OffsetDateTime start, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune) throws RestClientResponseException {
        ParameterizedTypeReference<VeglenkesekvensEndringerSide> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getVeglenkesekvensEndringerRequestCreation(start, antall, ider, fylke, kommune).toEntity(localVarReturnType);
    }

    /**
     * Hent endringer på veglenkesekvenser innen siste 30 dager
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param start Hent alle endringer etter gitt tidspunkt. Dersom denne utelates vil de eldste endringene hentes først.
     * @param antall Antall endringer som skal være med i responsen. Merk at det faktiske antallet kan variere fra respons til respons. Dette er fordi endringer på samme veglenkesekvens innenfor samme side blir aggregert sammen ved å ta den nyeste endringen.
     * @param ider Hent endringer for oppgitte veglenkesekvens IDer. Dersom denne utelates vil alle endringer hentes.
     * @param fylke Filtrer på fylke. Kommaseparert liste. Se [/omrader/api/v4/fylker](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getFylker) for mulige verdier.  Eksempel: &#x60;50&#x60;
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getKommuner) for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getVeglenkesekvensEndringerWithResponseSpec(@jakarta.annotation.Nullable OffsetDateTime start, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune) throws RestClientResponseException {
        return getVeglenkesekvensEndringerRequestCreation(start, antall, ider, fylke, kommune);
    }

    public static class GetVeglenkesekvenserRequest {
        private @jakarta.annotation.Nullable Set<Long> ider;
        private @jakarta.annotation.Nullable Set<Integer> fylke;
        private @jakarta.annotation.Nullable Set<Integer> kommune;
        private @jakarta.annotation.Nullable Set<String> kontraktsomrade;
        private @jakarta.annotation.Nullable Set<String> riksvegrute;
        private @jakarta.annotation.Nullable Set<String> vegsystemreferanse;
        private @jakarta.annotation.Nullable TopologinivaParameter topologiniva;
        private @jakarta.annotation.Nullable Long superid;
        private @jakarta.annotation.Nullable SridParameter srid;
        private @jakarta.annotation.Nullable String polygon;
        private @jakarta.annotation.Nullable Integer antall;
        private @jakarta.annotation.Nullable String start;
        private @jakarta.annotation.Nullable Boolean inkluderAntall;

        public GetVeglenkesekvenserRequest() {}

        public GetVeglenkesekvenserRequest(@jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable Set<String> riksvegrute, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable TopologinivaParameter topologiniva, @jakarta.annotation.Nullable Long superid, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable String polygon, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable String start, @jakarta.annotation.Nullable Boolean inkluderAntall) {
            this.ider = ider;
            this.fylke = fylke;
            this.kommune = kommune;
            this.kontraktsomrade = kontraktsomrade;
            this.riksvegrute = riksvegrute;
            this.vegsystemreferanse = vegsystemreferanse;
            this.topologiniva = topologiniva;
            this.superid = superid;
            this.srid = srid;
            this.polygon = polygon;
            this.antall = antall;
            this.start = start;
            this.inkluderAntall = inkluderAntall;
        }

        public @jakarta.annotation.Nullable Set<Long> ider() {
            return this.ider;
        }
        public GetVeglenkesekvenserRequest ider(@jakarta.annotation.Nullable Set<Long> ider) {
            this.ider = ider;
            return this;
        }

        public @jakarta.annotation.Nullable Set<Integer> fylke() {
            return this.fylke;
        }
        public GetVeglenkesekvenserRequest fylke(@jakarta.annotation.Nullable Set<Integer> fylke) {
            this.fylke = fylke;
            return this;
        }

        public @jakarta.annotation.Nullable Set<Integer> kommune() {
            return this.kommune;
        }
        public GetVeglenkesekvenserRequest kommune(@jakarta.annotation.Nullable Set<Integer> kommune) {
            this.kommune = kommune;
            return this;
        }

        public @jakarta.annotation.Nullable Set<String> kontraktsomrade() {
            return this.kontraktsomrade;
        }
        public GetVeglenkesekvenserRequest kontraktsomrade(@jakarta.annotation.Nullable Set<String> kontraktsomrade) {
            this.kontraktsomrade = kontraktsomrade;
            return this;
        }

        public @jakarta.annotation.Nullable Set<String> riksvegrute() {
            return this.riksvegrute;
        }
        public GetVeglenkesekvenserRequest riksvegrute(@jakarta.annotation.Nullable Set<String> riksvegrute) {
            this.riksvegrute = riksvegrute;
            return this;
        }

        public @jakarta.annotation.Nullable Set<String> vegsystemreferanse() {
            return this.vegsystemreferanse;
        }
        public GetVeglenkesekvenserRequest vegsystemreferanse(@jakarta.annotation.Nullable Set<String> vegsystemreferanse) {
            this.vegsystemreferanse = vegsystemreferanse;
            return this;
        }

        public @jakarta.annotation.Nullable TopologinivaParameter topologiniva() {
            return this.topologiniva;
        }
        public GetVeglenkesekvenserRequest topologiniva(@jakarta.annotation.Nullable TopologinivaParameter topologiniva) {
            this.topologiniva = topologiniva;
            return this;
        }

        public @jakarta.annotation.Nullable Long superid() {
            return this.superid;
        }
        public GetVeglenkesekvenserRequest superid(@jakarta.annotation.Nullable Long superid) {
            this.superid = superid;
            return this;
        }

        public @jakarta.annotation.Nullable SridParameter srid() {
            return this.srid;
        }
        public GetVeglenkesekvenserRequest srid(@jakarta.annotation.Nullable SridParameter srid) {
            this.srid = srid;
            return this;
        }

        public @jakarta.annotation.Nullable String polygon() {
            return this.polygon;
        }
        public GetVeglenkesekvenserRequest polygon(@jakarta.annotation.Nullable String polygon) {
            this.polygon = polygon;
            return this;
        }

        public @jakarta.annotation.Nullable Integer antall() {
            return this.antall;
        }
        public GetVeglenkesekvenserRequest antall(@jakarta.annotation.Nullable Integer antall) {
            this.antall = antall;
            return this;
        }

        public @jakarta.annotation.Nullable String start() {
            return this.start;
        }
        public GetVeglenkesekvenserRequest start(@jakarta.annotation.Nullable String start) {
            this.start = start;
            return this;
        }

        public @jakarta.annotation.Nullable Boolean inkluderAntall() {
            return this.inkluderAntall;
        }
        public GetVeglenkesekvenserRequest inkluderAntall(@jakarta.annotation.Nullable Boolean inkluderAntall) {
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
            GetVeglenkesekvenserRequest request = (GetVeglenkesekvenserRequest) o;
            return Objects.equals(this.ider, request.ider()) &&
                Objects.equals(this.fylke, request.fylke()) &&
                Objects.equals(this.kommune, request.kommune()) &&
                Objects.equals(this.kontraktsomrade, request.kontraktsomrade()) &&
                Objects.equals(this.riksvegrute, request.riksvegrute()) &&
                Objects.equals(this.vegsystemreferanse, request.vegsystemreferanse()) &&
                Objects.equals(this.topologiniva, request.topologiniva()) &&
                Objects.equals(this.superid, request.superid()) &&
                Objects.equals(this.srid, request.srid()) &&
                Objects.equals(this.polygon, request.polygon()) &&
                Objects.equals(this.antall, request.antall()) &&
                Objects.equals(this.start, request.start()) &&
                Objects.equals(this.inkluderAntall, request.inkluderAntall());
        }

        @Override
        public int hashCode() {
            return Objects.hash(ider, fylke, kommune, kontraktsomrade, riksvegrute, vegsystemreferanse, topologiniva, superid, srid, polygon, antall, start, inkluderAntall);
        }
    }

    /**
    * Hent veglenkesekvenser
    * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param requestParameters The getVeglenkesekvenser request parameters as object
     * @return VeglenkesekvenserSide
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public VeglenkesekvenserSide getVeglenkesekvenser(GetVeglenkesekvenserRequest requestParameters) throws RestClientResponseException {
      return this.getVeglenkesekvenser(requestParameters.ider(), requestParameters.fylke(), requestParameters.kommune(), requestParameters.kontraktsomrade(), requestParameters.riksvegrute(), requestParameters.vegsystemreferanse(), requestParameters.topologiniva(), requestParameters.superid(), requestParameters.srid(), requestParameters.polygon(), requestParameters.antall(), requestParameters.start(), requestParameters.inkluderAntall());
    }

  /**
  * Hent veglenkesekvenser
  * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param requestParameters The getVeglenkesekvenser request parameters as object
     * @return ResponseEntity&lt;VeglenkesekvenserSide&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseEntity<VeglenkesekvenserSide> getVeglenkesekvenserWithHttpInfo(GetVeglenkesekvenserRequest requestParameters) throws RestClientResponseException {
      return this.getVeglenkesekvenserWithHttpInfo(requestParameters.ider(), requestParameters.fylke(), requestParameters.kommune(), requestParameters.kontraktsomrade(), requestParameters.riksvegrute(), requestParameters.vegsystemreferanse(), requestParameters.topologiniva(), requestParameters.superid(), requestParameters.srid(), requestParameters.polygon(), requestParameters.antall(), requestParameters.start(), requestParameters.inkluderAntall());
    }

  /**
  * Hent veglenkesekvenser
  * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param requestParameters The getVeglenkesekvenser request parameters as object
  * @return ResponseSpec
  * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseSpec getVeglenkesekvenserWithResponseSpec(GetVeglenkesekvenserRequest requestParameters) throws RestClientResponseException {
      return this.getVeglenkesekvenserWithResponseSpec(requestParameters.ider(), requestParameters.fylke(), requestParameters.kommune(), requestParameters.kontraktsomrade(), requestParameters.riksvegrute(), requestParameters.vegsystemreferanse(), requestParameters.topologiniva(), requestParameters.superid(), requestParameters.srid(), requestParameters.polygon(), requestParameters.antall(), requestParameters.start(), requestParameters.inkluderAntall());
    }

    /**
     * Hent veglenkesekvenser
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param ider Kommaseparert liste med IDer.
     * @param fylke Filtrer på fylke. Kommaseparert liste. Se [/omrader/api/v4/fylker](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getFylker) for mulige verdier.  Eksempel: &#x60;50&#x60;
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getKommuner) for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @param kontraktsomrade Filtrer på kontraktsomrade. Kommaseparert liste. Se [/omrader/api/v4/kontraktsomrader](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getKontraktsomrader) for mulige verdier.  Eksempel: &#x60;9503 Midtre Hålogaland 2021-2026&#x60;
     * @param riksvegrute Filtrer på riksvegrute. Kommaseparert liste. Se [/omrader/api/v4/riksvegruter](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getRiksvegruter) for mulige verdier.  Eksempel: &#x60;RUTE4A&#x60; eller som enumid &#x60;20290&#x60;
     * @param vegsystemreferanse Filtrer på [vegsystemreferanse](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1 m12&#x60;
     * @param topologiniva Hent kun elementer på det gitte topologinivået. - Dersom en veglenke har nivå vegtrasé er ofte feltet for topologinivå ikke tilstede. Man vil da få alle veglenker som ikke har verdi &#x60;kjørefelt&#x60; eller &#x60;kjørebane&#x60;.
     * @param superid Hent detaljerte veglenkesekvenser stedfestet på veglenkesekvens med denne IDen.
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param polygon Filtrer med polygon i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret).  Eksempel: &#x60;20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000&#x60;
     * @param antall Angir hvor mange objekter som skal returneres. Se også &#x60;sidestørrelse&#x60; i responsens &#x60;metadata&#x60;-objekt.
     * @param start Angir paginerings-start for objekter som skal returneres. Brukes sammen med &#x60;antall&#x60;. Neste start får man i metadata-feltet i responsen. Settes blankt for å starte fra begynnelsen.
     * @param inkluderAntall Hvorvidt totalt antall objekter skal returneres i responsen. Default er &#x60;false&#x60;.
     * @return VeglenkesekvenserSide
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getVeglenkesekvenserRequestCreation(@jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable Set<String> riksvegrute, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable TopologinivaParameter topologiniva, @jakarta.annotation.Nullable Long superid, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable String polygon, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable String start, @jakarta.annotation.Nullable Boolean inkluderAntall) throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "ider", ider));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "fylke", fylke));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "kommune", kommune));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "kontraktsomrade", kontraktsomrade));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "riksvegrute", riksvegrute));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "vegsystemreferanse", vegsystemreferanse));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "topologiniva", topologiniva));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "superid", superid));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "srid", srid));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "polygon", polygon));
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

        ParameterizedTypeReference<VeglenkesekvenserSide> localVarReturnType = new ParameterizedTypeReference<>() {};
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
     * @param fylke Filtrer på fylke. Kommaseparert liste. Se [/omrader/api/v4/fylker](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getFylker) for mulige verdier.  Eksempel: &#x60;50&#x60;
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getKommuner) for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @param kontraktsomrade Filtrer på kontraktsomrade. Kommaseparert liste. Se [/omrader/api/v4/kontraktsomrader](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getKontraktsomrader) for mulige verdier.  Eksempel: &#x60;9503 Midtre Hålogaland 2021-2026&#x60;
     * @param riksvegrute Filtrer på riksvegrute. Kommaseparert liste. Se [/omrader/api/v4/riksvegruter](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getRiksvegruter) for mulige verdier.  Eksempel: &#x60;RUTE4A&#x60; eller som enumid &#x60;20290&#x60;
     * @param vegsystemreferanse Filtrer på [vegsystemreferanse](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1 m12&#x60;
     * @param topologiniva Hent kun elementer på det gitte topologinivået. - Dersom en veglenke har nivå vegtrasé er ofte feltet for topologinivå ikke tilstede. Man vil da få alle veglenker som ikke har verdi &#x60;kjørefelt&#x60; eller &#x60;kjørebane&#x60;.
     * @param superid Hent detaljerte veglenkesekvenser stedfestet på veglenkesekvens med denne IDen.
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param polygon Filtrer med polygon i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret).  Eksempel: &#x60;20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000&#x60;
     * @param antall Angir hvor mange objekter som skal returneres. Se også &#x60;sidestørrelse&#x60; i responsens &#x60;metadata&#x60;-objekt.
     * @param start Angir paginerings-start for objekter som skal returneres. Brukes sammen med &#x60;antall&#x60;. Neste start får man i metadata-feltet i responsen. Settes blankt for å starte fra begynnelsen.
     * @param inkluderAntall Hvorvidt totalt antall objekter skal returneres i responsen. Default er &#x60;false&#x60;.
     * @return VeglenkesekvenserSide
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public VeglenkesekvenserSide getVeglenkesekvenser(@jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable Set<String> riksvegrute, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable TopologinivaParameter topologiniva, @jakarta.annotation.Nullable Long superid, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable String polygon, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable String start, @jakarta.annotation.Nullable Boolean inkluderAntall) throws RestClientResponseException {
        ParameterizedTypeReference<VeglenkesekvenserSide> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getVeglenkesekvenserRequestCreation(ider, fylke, kommune, kontraktsomrade, riksvegrute, vegsystemreferanse, topologiniva, superid, srid, polygon, antall, start, inkluderAntall).body(localVarReturnType);
    }

    /**
     * Hent veglenkesekvenser
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param ider Kommaseparert liste med IDer.
     * @param fylke Filtrer på fylke. Kommaseparert liste. Se [/omrader/api/v4/fylker](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getFylker) for mulige verdier.  Eksempel: &#x60;50&#x60;
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getKommuner) for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @param kontraktsomrade Filtrer på kontraktsomrade. Kommaseparert liste. Se [/omrader/api/v4/kontraktsomrader](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getKontraktsomrader) for mulige verdier.  Eksempel: &#x60;9503 Midtre Hålogaland 2021-2026&#x60;
     * @param riksvegrute Filtrer på riksvegrute. Kommaseparert liste. Se [/omrader/api/v4/riksvegruter](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getRiksvegruter) for mulige verdier.  Eksempel: &#x60;RUTE4A&#x60; eller som enumid &#x60;20290&#x60;
     * @param vegsystemreferanse Filtrer på [vegsystemreferanse](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1 m12&#x60;
     * @param topologiniva Hent kun elementer på det gitte topologinivået. - Dersom en veglenke har nivå vegtrasé er ofte feltet for topologinivå ikke tilstede. Man vil da få alle veglenker som ikke har verdi &#x60;kjørefelt&#x60; eller &#x60;kjørebane&#x60;.
     * @param superid Hent detaljerte veglenkesekvenser stedfestet på veglenkesekvens med denne IDen.
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param polygon Filtrer med polygon i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret).  Eksempel: &#x60;20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000&#x60;
     * @param antall Angir hvor mange objekter som skal returneres. Se også &#x60;sidestørrelse&#x60; i responsens &#x60;metadata&#x60;-objekt.
     * @param start Angir paginerings-start for objekter som skal returneres. Brukes sammen med &#x60;antall&#x60;. Neste start får man i metadata-feltet i responsen. Settes blankt for å starte fra begynnelsen.
     * @param inkluderAntall Hvorvidt totalt antall objekter skal returneres i responsen. Default er &#x60;false&#x60;.
     * @return ResponseEntity&lt;VeglenkesekvenserSide&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<VeglenkesekvenserSide> getVeglenkesekvenserWithHttpInfo(@jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable Set<String> riksvegrute, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable TopologinivaParameter topologiniva, @jakarta.annotation.Nullable Long superid, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable String polygon, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable String start, @jakarta.annotation.Nullable Boolean inkluderAntall) throws RestClientResponseException {
        ParameterizedTypeReference<VeglenkesekvenserSide> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getVeglenkesekvenserRequestCreation(ider, fylke, kommune, kontraktsomrade, riksvegrute, vegsystemreferanse, topologiniva, superid, srid, polygon, antall, start, inkluderAntall).toEntity(localVarReturnType);
    }

    /**
     * Hent veglenkesekvenser
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param ider Kommaseparert liste med IDer.
     * @param fylke Filtrer på fylke. Kommaseparert liste. Se [/omrader/api/v4/fylker](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getFylker) for mulige verdier.  Eksempel: &#x60;50&#x60;
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getKommuner) for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @param kontraktsomrade Filtrer på kontraktsomrade. Kommaseparert liste. Se [/omrader/api/v4/kontraktsomrader](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getKontraktsomrader) for mulige verdier.  Eksempel: &#x60;9503 Midtre Hålogaland 2021-2026&#x60;
     * @param riksvegrute Filtrer på riksvegrute. Kommaseparert liste. Se [/omrader/api/v4/riksvegruter](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getRiksvegruter) for mulige verdier.  Eksempel: &#x60;RUTE4A&#x60; eller som enumid &#x60;20290&#x60;
     * @param vegsystemreferanse Filtrer på [vegsystemreferanse](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1 m12&#x60;
     * @param topologiniva Hent kun elementer på det gitte topologinivået. - Dersom en veglenke har nivå vegtrasé er ofte feltet for topologinivå ikke tilstede. Man vil da få alle veglenker som ikke har verdi &#x60;kjørefelt&#x60; eller &#x60;kjørebane&#x60;.
     * @param superid Hent detaljerte veglenkesekvenser stedfestet på veglenkesekvens med denne IDen.
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param polygon Filtrer med polygon i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret).  Eksempel: &#x60;20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000&#x60;
     * @param antall Angir hvor mange objekter som skal returneres. Se også &#x60;sidestørrelse&#x60; i responsens &#x60;metadata&#x60;-objekt.
     * @param start Angir paginerings-start for objekter som skal returneres. Brukes sammen med &#x60;antall&#x60;. Neste start får man i metadata-feltet i responsen. Settes blankt for å starte fra begynnelsen.
     * @param inkluderAntall Hvorvidt totalt antall objekter skal returneres i responsen. Default er &#x60;false&#x60;.
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getVeglenkesekvenserWithResponseSpec(@jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable Set<String> riksvegrute, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable TopologinivaParameter topologiniva, @jakarta.annotation.Nullable Long superid, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable String polygon, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable String start, @jakarta.annotation.Nullable Boolean inkluderAntall) throws RestClientResponseException {
        return getVeglenkesekvenserRequestCreation(ider, fylke, kommune, kontraktsomrade, riksvegrute, vegsystemreferanse, topologiniva, superid, srid, polygon, antall, start, inkluderAntall);
    }
}

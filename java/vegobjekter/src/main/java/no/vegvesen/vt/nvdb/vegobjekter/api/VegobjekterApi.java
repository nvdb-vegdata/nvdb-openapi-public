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
public class VegobjekterApi {
    private ApiClient apiClient;

    public VegobjekterApi() {
        this(new ApiClient());
    }

    public VegobjekterApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }


    public static class GetVegobjektByIdRequest {
        private @jakarta.annotation.Nonnull Long id;
        private @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder;
        private @jakarta.annotation.Nullable SridParameter srid;
        private @jakarta.annotation.Nullable InkluderGeometri inkludergeometri;
        private @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper;
        private @jakarta.annotation.Nullable String dybde;
        private @jakarta.annotation.Nullable Integer geometritoleranse;
        private @jakarta.annotation.Nullable LocalDate tidspunkt;

        public GetVegobjektByIdRequest() {}

        public GetVegobjektByIdRequest(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable InkluderGeometri inkludergeometri, @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper, @jakarta.annotation.Nullable String dybde, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable LocalDate tidspunkt) {
            this.id = id;
            this.inkluder = inkluder;
            this.srid = srid;
            this.inkludergeometri = inkludergeometri;
            this.inkluderEgenskaper = inkluderEgenskaper;
            this.dybde = dybde;
            this.geometritoleranse = geometritoleranse;
            this.tidspunkt = tidspunkt;
        }

        public @jakarta.annotation.Nonnull Long id() {
            return this.id;
        }
        public GetVegobjektByIdRequest id(@jakarta.annotation.Nonnull Long id) {
            this.id = id;
            return this;
        }

        public @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder() {
            return this.inkluder;
        }
        public GetVegobjektByIdRequest inkluder(@jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder) {
            this.inkluder = inkluder;
            return this;
        }

        public @jakarta.annotation.Nullable SridParameter srid() {
            return this.srid;
        }
        public GetVegobjektByIdRequest srid(@jakarta.annotation.Nullable SridParameter srid) {
            this.srid = srid;
            return this;
        }

        public @jakarta.annotation.Nullable InkluderGeometri inkludergeometri() {
            return this.inkludergeometri;
        }
        public GetVegobjektByIdRequest inkludergeometri(@jakarta.annotation.Nullable InkluderGeometri inkludergeometri) {
            this.inkludergeometri = inkludergeometri;
            return this;
        }

        public @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper() {
            return this.inkluderEgenskaper;
        }
        public GetVegobjektByIdRequest inkluderEgenskaper(@jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper) {
            this.inkluderEgenskaper = inkluderEgenskaper;
            return this;
        }

        public @jakarta.annotation.Nullable String dybde() {
            return this.dybde;
        }
        public GetVegobjektByIdRequest dybde(@jakarta.annotation.Nullable String dybde) {
            this.dybde = dybde;
            return this;
        }

        public @jakarta.annotation.Nullable Integer geometritoleranse() {
            return this.geometritoleranse;
        }
        public GetVegobjektByIdRequest geometritoleranse(@jakarta.annotation.Nullable Integer geometritoleranse) {
            this.geometritoleranse = geometritoleranse;
            return this;
        }

        public @jakarta.annotation.Nullable LocalDate tidspunkt() {
            return this.tidspunkt;
        }
        public GetVegobjektByIdRequest tidspunkt(@jakarta.annotation.Nullable LocalDate tidspunkt) {
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
            GetVegobjektByIdRequest request = (GetVegobjektByIdRequest) o;
            return Objects.equals(this.id, request.id()) &&
                Objects.equals(this.inkluder, request.inkluder()) &&
                Objects.equals(this.srid, request.srid()) &&
                Objects.equals(this.inkludergeometri, request.inkludergeometri()) &&
                Objects.equals(this.inkluderEgenskaper, request.inkluderEgenskaper()) &&
                Objects.equals(this.dybde, request.dybde()) &&
                Objects.equals(this.geometritoleranse, request.geometritoleranse()) &&
                Objects.equals(this.tidspunkt, request.tidspunkt());
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, inkluder, srid, inkludergeometri, inkluderEgenskaper, dybde, geometritoleranse, tidspunkt);
        }
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
     * @param requestParameters The getVegobjektById request parameters as object
     * @return Vegobjekt
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public Vegobjekt getVegobjektById(GetVegobjektByIdRequest requestParameters) throws RestClientResponseException {
      return this.getVegobjektById(requestParameters.id(), requestParameters.inkluder(), requestParameters.srid(), requestParameters.inkludergeometri(), requestParameters.inkluderEgenskaper(), requestParameters.dybde(), requestParameters.geometritoleranse(), requestParameters.tidspunkt());
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
     * @param requestParameters The getVegobjektById request parameters as object
     * @return ResponseEntity&lt;Vegobjekt&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseEntity<Vegobjekt> getVegobjektByIdWithHttpInfo(GetVegobjektByIdRequest requestParameters) throws RestClientResponseException {
      return this.getVegobjektByIdWithHttpInfo(requestParameters.id(), requestParameters.inkluder(), requestParameters.srid(), requestParameters.inkludergeometri(), requestParameters.inkluderEgenskaper(), requestParameters.dybde(), requestParameters.geometritoleranse(), requestParameters.tidspunkt());
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
     * @param requestParameters The getVegobjektById request parameters as object
  * @return ResponseSpec
  * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseSpec getVegobjektByIdWithResponseSpec(GetVegobjektByIdRequest requestParameters) throws RestClientResponseException {
      return this.getVegobjektByIdWithResponseSpec(requestParameters.id(), requestParameters.inkluder(), requestParameters.srid(), requestParameters.inkludergeometri(), requestParameters.inkluderEgenskaper(), requestParameters.dybde(), requestParameters.geometritoleranse(), requestParameters.tidspunkt());
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getVegobjektByIdRequestCreation(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable InkluderGeometri inkludergeometri, @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper, @jakarta.annotation.Nullable String dybde, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable LocalDate tidspunkt) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new RestClientResponseException("Missing the required parameter 'id' when calling getVegobjektById", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

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

        ParameterizedTypeReference<Vegobjekt> localVarReturnType = new ParameterizedTypeReference<>() {};
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Vegobjekt getVegobjektById(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable InkluderGeometri inkludergeometri, @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper, @jakarta.annotation.Nullable String dybde, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable LocalDate tidspunkt) throws RestClientResponseException {
        ParameterizedTypeReference<Vegobjekt> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getVegobjektByIdRequestCreation(id, inkluder, srid, inkludergeometri, inkluderEgenskaper, dybde, geometritoleranse, tidspunkt).body(localVarReturnType);
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Vegobjekt> getVegobjektByIdWithHttpInfo(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable InkluderGeometri inkludergeometri, @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper, @jakarta.annotation.Nullable String dybde, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable LocalDate tidspunkt) throws RestClientResponseException {
        ParameterizedTypeReference<Vegobjekt> localVarReturnType = new ParameterizedTypeReference<>() {};
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getVegobjektByIdWithResponseSpec(@jakarta.annotation.Nonnull Long id, @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable InkluderGeometri inkludergeometri, @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper, @jakarta.annotation.Nullable String dybde, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable LocalDate tidspunkt) throws RestClientResponseException {
        return getVegobjektByIdRequestCreation(id, inkluder, srid, inkludergeometri, inkluderEgenskaper, dybde, geometritoleranse, tidspunkt);
    }

    public static class GetVegobjektByTypeAndIdRequest {
        private @jakarta.annotation.Nonnull Integer vegobjekttypeId;
        private @jakarta.annotation.Nonnull Long vegobjektId;
        private @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder;
        private @jakarta.annotation.Nullable SridParameter srid;
        private @jakarta.annotation.Nullable InkluderGeometri inkludergeometri;
        private @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper;
        private @jakarta.annotation.Nullable String dybde;
        private @jakarta.annotation.Nullable Integer geometritoleranse;
        private @jakarta.annotation.Nullable LocalDate tidspunkt;

        public GetVegobjektByTypeAndIdRequest() {}

        public GetVegobjektByTypeAndIdRequest(@jakarta.annotation.Nonnull Integer vegobjekttypeId, @jakarta.annotation.Nonnull Long vegobjektId, @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable InkluderGeometri inkludergeometri, @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper, @jakarta.annotation.Nullable String dybde, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable LocalDate tidspunkt) {
            this.vegobjekttypeId = vegobjekttypeId;
            this.vegobjektId = vegobjektId;
            this.inkluder = inkluder;
            this.srid = srid;
            this.inkludergeometri = inkludergeometri;
            this.inkluderEgenskaper = inkluderEgenskaper;
            this.dybde = dybde;
            this.geometritoleranse = geometritoleranse;
            this.tidspunkt = tidspunkt;
        }

        public @jakarta.annotation.Nonnull Integer vegobjekttypeId() {
            return this.vegobjekttypeId;
        }
        public GetVegobjektByTypeAndIdRequest vegobjekttypeId(@jakarta.annotation.Nonnull Integer vegobjekttypeId) {
            this.vegobjekttypeId = vegobjekttypeId;
            return this;
        }

        public @jakarta.annotation.Nonnull Long vegobjektId() {
            return this.vegobjektId;
        }
        public GetVegobjektByTypeAndIdRequest vegobjektId(@jakarta.annotation.Nonnull Long vegobjektId) {
            this.vegobjektId = vegobjektId;
            return this;
        }

        public @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder() {
            return this.inkluder;
        }
        public GetVegobjektByTypeAndIdRequest inkluder(@jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder) {
            this.inkluder = inkluder;
            return this;
        }

        public @jakarta.annotation.Nullable SridParameter srid() {
            return this.srid;
        }
        public GetVegobjektByTypeAndIdRequest srid(@jakarta.annotation.Nullable SridParameter srid) {
            this.srid = srid;
            return this;
        }

        public @jakarta.annotation.Nullable InkluderGeometri inkludergeometri() {
            return this.inkludergeometri;
        }
        public GetVegobjektByTypeAndIdRequest inkludergeometri(@jakarta.annotation.Nullable InkluderGeometri inkludergeometri) {
            this.inkludergeometri = inkludergeometri;
            return this;
        }

        public @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper() {
            return this.inkluderEgenskaper;
        }
        public GetVegobjektByTypeAndIdRequest inkluderEgenskaper(@jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper) {
            this.inkluderEgenskaper = inkluderEgenskaper;
            return this;
        }

        public @jakarta.annotation.Nullable String dybde() {
            return this.dybde;
        }
        public GetVegobjektByTypeAndIdRequest dybde(@jakarta.annotation.Nullable String dybde) {
            this.dybde = dybde;
            return this;
        }

        public @jakarta.annotation.Nullable Integer geometritoleranse() {
            return this.geometritoleranse;
        }
        public GetVegobjektByTypeAndIdRequest geometritoleranse(@jakarta.annotation.Nullable Integer geometritoleranse) {
            this.geometritoleranse = geometritoleranse;
            return this;
        }

        public @jakarta.annotation.Nullable LocalDate tidspunkt() {
            return this.tidspunkt;
        }
        public GetVegobjektByTypeAndIdRequest tidspunkt(@jakarta.annotation.Nullable LocalDate tidspunkt) {
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
            GetVegobjektByTypeAndIdRequest request = (GetVegobjektByTypeAndIdRequest) o;
            return Objects.equals(this.vegobjekttypeId, request.vegobjekttypeId()) &&
                Objects.equals(this.vegobjektId, request.vegobjektId()) &&
                Objects.equals(this.inkluder, request.inkluder()) &&
                Objects.equals(this.srid, request.srid()) &&
                Objects.equals(this.inkludergeometri, request.inkludergeometri()) &&
                Objects.equals(this.inkluderEgenskaper, request.inkluderEgenskaper()) &&
                Objects.equals(this.dybde, request.dybde()) &&
                Objects.equals(this.geometritoleranse, request.geometritoleranse()) &&
                Objects.equals(this.tidspunkt, request.tidspunkt());
        }

        @Override
        public int hashCode() {
            return Objects.hash(vegobjekttypeId, vegobjektId, inkluder, srid, inkludergeometri, inkluderEgenskaper, dybde, geometritoleranse, tidspunkt);
        }
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
     * @param requestParameters The getVegobjektByTypeAndId request parameters as object
     * @return Vegobjekt
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public Vegobjekt getVegobjektByTypeAndId(GetVegobjektByTypeAndIdRequest requestParameters) throws RestClientResponseException {
      return this.getVegobjektByTypeAndId(requestParameters.vegobjekttypeId(), requestParameters.vegobjektId(), requestParameters.inkluder(), requestParameters.srid(), requestParameters.inkludergeometri(), requestParameters.inkluderEgenskaper(), requestParameters.dybde(), requestParameters.geometritoleranse(), requestParameters.tidspunkt());
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
     * @param requestParameters The getVegobjektByTypeAndId request parameters as object
     * @return ResponseEntity&lt;Vegobjekt&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseEntity<Vegobjekt> getVegobjektByTypeAndIdWithHttpInfo(GetVegobjektByTypeAndIdRequest requestParameters) throws RestClientResponseException {
      return this.getVegobjektByTypeAndIdWithHttpInfo(requestParameters.vegobjekttypeId(), requestParameters.vegobjektId(), requestParameters.inkluder(), requestParameters.srid(), requestParameters.inkludergeometri(), requestParameters.inkluderEgenskaper(), requestParameters.dybde(), requestParameters.geometritoleranse(), requestParameters.tidspunkt());
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
     * @param requestParameters The getVegobjektByTypeAndId request parameters as object
  * @return ResponseSpec
  * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseSpec getVegobjektByTypeAndIdWithResponseSpec(GetVegobjektByTypeAndIdRequest requestParameters) throws RestClientResponseException {
      return this.getVegobjektByTypeAndIdWithResponseSpec(requestParameters.vegobjekttypeId(), requestParameters.vegobjektId(), requestParameters.inkluder(), requestParameters.srid(), requestParameters.inkludergeometri(), requestParameters.inkluderEgenskaper(), requestParameters.dybde(), requestParameters.geometritoleranse(), requestParameters.tidspunkt());
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getVegobjektByTypeAndIdRequestCreation(@jakarta.annotation.Nonnull Integer vegobjekttypeId, @jakarta.annotation.Nonnull Long vegobjektId, @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable InkluderGeometri inkludergeometri, @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper, @jakarta.annotation.Nullable String dybde, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable LocalDate tidspunkt) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'vegobjekttypeId' is set
        if (vegobjekttypeId == null) {
            throw new RestClientResponseException("Missing the required parameter 'vegobjekttypeId' when calling getVegobjektByTypeAndId", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'vegobjektId' is set
        if (vegobjektId == null) {
            throw new RestClientResponseException("Missing the required parameter 'vegobjektId' when calling getVegobjektByTypeAndId", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("vegobjekttypeId", vegobjekttypeId);
        pathParams.put("vegobjektId", vegobjektId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

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

        ParameterizedTypeReference<Vegobjekt> localVarReturnType = new ParameterizedTypeReference<>() {};
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Vegobjekt getVegobjektByTypeAndId(@jakarta.annotation.Nonnull Integer vegobjekttypeId, @jakarta.annotation.Nonnull Long vegobjektId, @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable InkluderGeometri inkludergeometri, @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper, @jakarta.annotation.Nullable String dybde, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable LocalDate tidspunkt) throws RestClientResponseException {
        ParameterizedTypeReference<Vegobjekt> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getVegobjektByTypeAndIdRequestCreation(vegobjekttypeId, vegobjektId, inkluder, srid, inkludergeometri, inkluderEgenskaper, dybde, geometritoleranse, tidspunkt).body(localVarReturnType);
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Vegobjekt> getVegobjektByTypeAndIdWithHttpInfo(@jakarta.annotation.Nonnull Integer vegobjekttypeId, @jakarta.annotation.Nonnull Long vegobjektId, @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable InkluderGeometri inkludergeometri, @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper, @jakarta.annotation.Nullable String dybde, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable LocalDate tidspunkt) throws RestClientResponseException {
        ParameterizedTypeReference<Vegobjekt> localVarReturnType = new ParameterizedTypeReference<>() {};
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getVegobjektByTypeAndIdWithResponseSpec(@jakarta.annotation.Nonnull Integer vegobjekttypeId, @jakarta.annotation.Nonnull Long vegobjektId, @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable InkluderGeometri inkludergeometri, @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper, @jakarta.annotation.Nullable String dybde, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable LocalDate tidspunkt) throws RestClientResponseException {
        return getVegobjektByTypeAndIdRequestCreation(vegobjekttypeId, vegobjektId, inkluder, srid, inkludergeometri, inkluderEgenskaper, dybde, geometritoleranse, tidspunkt);
    }

    public static class GetVegobjektByTypeIdAndVersjonRequest {
        private @jakarta.annotation.Nonnull Integer vegobjekttypeId;
        private @jakarta.annotation.Nonnull Long vegobjektId;
        private @jakarta.annotation.Nonnull Integer versjon;
        private @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder;
        private @jakarta.annotation.Nullable SridParameter srid;
        private @jakarta.annotation.Nullable InkluderGeometri inkludergeometri;
        private @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper;
        private @jakarta.annotation.Nullable String dybde;
        private @jakarta.annotation.Nullable Integer geometritoleranse;
        private @jakarta.annotation.Nullable LocalDate tidspunkt;

        public GetVegobjektByTypeIdAndVersjonRequest() {}

        public GetVegobjektByTypeIdAndVersjonRequest(@jakarta.annotation.Nonnull Integer vegobjekttypeId, @jakarta.annotation.Nonnull Long vegobjektId, @jakarta.annotation.Nonnull Integer versjon, @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable InkluderGeometri inkludergeometri, @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper, @jakarta.annotation.Nullable String dybde, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable LocalDate tidspunkt) {
            this.vegobjekttypeId = vegobjekttypeId;
            this.vegobjektId = vegobjektId;
            this.versjon = versjon;
            this.inkluder = inkluder;
            this.srid = srid;
            this.inkludergeometri = inkludergeometri;
            this.inkluderEgenskaper = inkluderEgenskaper;
            this.dybde = dybde;
            this.geometritoleranse = geometritoleranse;
            this.tidspunkt = tidspunkt;
        }

        public @jakarta.annotation.Nonnull Integer vegobjekttypeId() {
            return this.vegobjekttypeId;
        }
        public GetVegobjektByTypeIdAndVersjonRequest vegobjekttypeId(@jakarta.annotation.Nonnull Integer vegobjekttypeId) {
            this.vegobjekttypeId = vegobjekttypeId;
            return this;
        }

        public @jakarta.annotation.Nonnull Long vegobjektId() {
            return this.vegobjektId;
        }
        public GetVegobjektByTypeIdAndVersjonRequest vegobjektId(@jakarta.annotation.Nonnull Long vegobjektId) {
            this.vegobjektId = vegobjektId;
            return this;
        }

        public @jakarta.annotation.Nonnull Integer versjon() {
            return this.versjon;
        }
        public GetVegobjektByTypeIdAndVersjonRequest versjon(@jakarta.annotation.Nonnull Integer versjon) {
            this.versjon = versjon;
            return this;
        }

        public @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder() {
            return this.inkluder;
        }
        public GetVegobjektByTypeIdAndVersjonRequest inkluder(@jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder) {
            this.inkluder = inkluder;
            return this;
        }

        public @jakarta.annotation.Nullable SridParameter srid() {
            return this.srid;
        }
        public GetVegobjektByTypeIdAndVersjonRequest srid(@jakarta.annotation.Nullable SridParameter srid) {
            this.srid = srid;
            return this;
        }

        public @jakarta.annotation.Nullable InkluderGeometri inkludergeometri() {
            return this.inkludergeometri;
        }
        public GetVegobjektByTypeIdAndVersjonRequest inkludergeometri(@jakarta.annotation.Nullable InkluderGeometri inkludergeometri) {
            this.inkludergeometri = inkludergeometri;
            return this;
        }

        public @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper() {
            return this.inkluderEgenskaper;
        }
        public GetVegobjektByTypeIdAndVersjonRequest inkluderEgenskaper(@jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper) {
            this.inkluderEgenskaper = inkluderEgenskaper;
            return this;
        }

        public @jakarta.annotation.Nullable String dybde() {
            return this.dybde;
        }
        public GetVegobjektByTypeIdAndVersjonRequest dybde(@jakarta.annotation.Nullable String dybde) {
            this.dybde = dybde;
            return this;
        }

        public @jakarta.annotation.Nullable Integer geometritoleranse() {
            return this.geometritoleranse;
        }
        public GetVegobjektByTypeIdAndVersjonRequest geometritoleranse(@jakarta.annotation.Nullable Integer geometritoleranse) {
            this.geometritoleranse = geometritoleranse;
            return this;
        }

        public @jakarta.annotation.Nullable LocalDate tidspunkt() {
            return this.tidspunkt;
        }
        public GetVegobjektByTypeIdAndVersjonRequest tidspunkt(@jakarta.annotation.Nullable LocalDate tidspunkt) {
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
            GetVegobjektByTypeIdAndVersjonRequest request = (GetVegobjektByTypeIdAndVersjonRequest) o;
            return Objects.equals(this.vegobjekttypeId, request.vegobjekttypeId()) &&
                Objects.equals(this.vegobjektId, request.vegobjektId()) &&
                Objects.equals(this.versjon, request.versjon()) &&
                Objects.equals(this.inkluder, request.inkluder()) &&
                Objects.equals(this.srid, request.srid()) &&
                Objects.equals(this.inkludergeometri, request.inkludergeometri()) &&
                Objects.equals(this.inkluderEgenskaper, request.inkluderEgenskaper()) &&
                Objects.equals(this.dybde, request.dybde()) &&
                Objects.equals(this.geometritoleranse, request.geometritoleranse()) &&
                Objects.equals(this.tidspunkt, request.tidspunkt());
        }

        @Override
        public int hashCode() {
            return Objects.hash(vegobjekttypeId, vegobjektId, versjon, inkluder, srid, inkludergeometri, inkluderEgenskaper, dybde, geometritoleranse, tidspunkt);
        }
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
     * @param requestParameters The getVegobjektByTypeIdAndVersjon request parameters as object
     * @return Vegobjekt
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public Vegobjekt getVegobjektByTypeIdAndVersjon(GetVegobjektByTypeIdAndVersjonRequest requestParameters) throws RestClientResponseException {
      return this.getVegobjektByTypeIdAndVersjon(requestParameters.vegobjekttypeId(), requestParameters.vegobjektId(), requestParameters.versjon(), requestParameters.inkluder(), requestParameters.srid(), requestParameters.inkludergeometri(), requestParameters.inkluderEgenskaper(), requestParameters.dybde(), requestParameters.geometritoleranse(), requestParameters.tidspunkt());
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
     * @param requestParameters The getVegobjektByTypeIdAndVersjon request parameters as object
     * @return ResponseEntity&lt;Vegobjekt&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseEntity<Vegobjekt> getVegobjektByTypeIdAndVersjonWithHttpInfo(GetVegobjektByTypeIdAndVersjonRequest requestParameters) throws RestClientResponseException {
      return this.getVegobjektByTypeIdAndVersjonWithHttpInfo(requestParameters.vegobjekttypeId(), requestParameters.vegobjektId(), requestParameters.versjon(), requestParameters.inkluder(), requestParameters.srid(), requestParameters.inkludergeometri(), requestParameters.inkluderEgenskaper(), requestParameters.dybde(), requestParameters.geometritoleranse(), requestParameters.tidspunkt());
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
     * @param requestParameters The getVegobjektByTypeIdAndVersjon request parameters as object
  * @return ResponseSpec
  * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseSpec getVegobjektByTypeIdAndVersjonWithResponseSpec(GetVegobjektByTypeIdAndVersjonRequest requestParameters) throws RestClientResponseException {
      return this.getVegobjektByTypeIdAndVersjonWithResponseSpec(requestParameters.vegobjekttypeId(), requestParameters.vegobjektId(), requestParameters.versjon(), requestParameters.inkluder(), requestParameters.srid(), requestParameters.inkludergeometri(), requestParameters.inkluderEgenskaper(), requestParameters.dybde(), requestParameters.geometritoleranse(), requestParameters.tidspunkt());
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getVegobjektByTypeIdAndVersjonRequestCreation(@jakarta.annotation.Nonnull Integer vegobjekttypeId, @jakarta.annotation.Nonnull Long vegobjektId, @jakarta.annotation.Nonnull Integer versjon, @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable InkluderGeometri inkludergeometri, @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper, @jakarta.annotation.Nullable String dybde, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable LocalDate tidspunkt) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'vegobjekttypeId' is set
        if (vegobjekttypeId == null) {
            throw new RestClientResponseException("Missing the required parameter 'vegobjekttypeId' when calling getVegobjektByTypeIdAndVersjon", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'vegobjektId' is set
        if (vegobjektId == null) {
            throw new RestClientResponseException("Missing the required parameter 'vegobjektId' when calling getVegobjektByTypeIdAndVersjon", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'versjon' is set
        if (versjon == null) {
            throw new RestClientResponseException("Missing the required parameter 'versjon' when calling getVegobjektByTypeIdAndVersjon", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("vegobjekttypeId", vegobjekttypeId);
        pathParams.put("vegobjektId", vegobjektId);
        pathParams.put("versjon", versjon);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

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

        ParameterizedTypeReference<Vegobjekt> localVarReturnType = new ParameterizedTypeReference<>() {};
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Vegobjekt getVegobjektByTypeIdAndVersjon(@jakarta.annotation.Nonnull Integer vegobjekttypeId, @jakarta.annotation.Nonnull Long vegobjektId, @jakarta.annotation.Nonnull Integer versjon, @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable InkluderGeometri inkludergeometri, @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper, @jakarta.annotation.Nullable String dybde, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable LocalDate tidspunkt) throws RestClientResponseException {
        ParameterizedTypeReference<Vegobjekt> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getVegobjektByTypeIdAndVersjonRequestCreation(vegobjekttypeId, vegobjektId, versjon, inkluder, srid, inkludergeometri, inkluderEgenskaper, dybde, geometritoleranse, tidspunkt).body(localVarReturnType);
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Vegobjekt> getVegobjektByTypeIdAndVersjonWithHttpInfo(@jakarta.annotation.Nonnull Integer vegobjekttypeId, @jakarta.annotation.Nonnull Long vegobjektId, @jakarta.annotation.Nonnull Integer versjon, @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable InkluderGeometri inkludergeometri, @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper, @jakarta.annotation.Nullable String dybde, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable LocalDate tidspunkt) throws RestClientResponseException {
        ParameterizedTypeReference<Vegobjekt> localVarReturnType = new ParameterizedTypeReference<>() {};
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getVegobjektByTypeIdAndVersjonWithResponseSpec(@jakarta.annotation.Nonnull Integer vegobjekttypeId, @jakarta.annotation.Nonnull Long vegobjektId, @jakarta.annotation.Nonnull Integer versjon, @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable InkluderGeometri inkludergeometri, @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper, @jakarta.annotation.Nullable String dybde, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable LocalDate tidspunkt) throws RestClientResponseException {
        return getVegobjektByTypeIdAndVersjonRequestCreation(vegobjekttypeId, vegobjektId, versjon, inkluder, srid, inkludergeometri, inkluderEgenskaper, dybde, geometritoleranse, tidspunkt);
    }

    public static class GetVegobjektEndringerForTypeRequest {
        private @jakarta.annotation.Nonnull Integer vegobjekttypeId;
        private @jakarta.annotation.Nullable Set<Long> ider;
        private @jakarta.annotation.Nullable String start;
        private @jakarta.annotation.Nullable Integer antall;
        private @jakarta.annotation.Nullable Boolean historisk;

        public GetVegobjektEndringerForTypeRequest() {}

        public GetVegobjektEndringerForTypeRequest(@jakarta.annotation.Nonnull Integer vegobjekttypeId, @jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable String start, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable Boolean historisk) {
            this.vegobjekttypeId = vegobjekttypeId;
            this.ider = ider;
            this.start = start;
            this.antall = antall;
            this.historisk = historisk;
        }

        public @jakarta.annotation.Nonnull Integer vegobjekttypeId() {
            return this.vegobjekttypeId;
        }
        public GetVegobjektEndringerForTypeRequest vegobjekttypeId(@jakarta.annotation.Nonnull Integer vegobjekttypeId) {
            this.vegobjekttypeId = vegobjekttypeId;
            return this;
        }

        public @jakarta.annotation.Nullable Set<Long> ider() {
            return this.ider;
        }
        public GetVegobjektEndringerForTypeRequest ider(@jakarta.annotation.Nullable Set<Long> ider) {
            this.ider = ider;
            return this;
        }

        public @jakarta.annotation.Nullable String start() {
            return this.start;
        }
        public GetVegobjektEndringerForTypeRequest start(@jakarta.annotation.Nullable String start) {
            this.start = start;
            return this;
        }

        public @jakarta.annotation.Nullable Integer antall() {
            return this.antall;
        }
        public GetVegobjektEndringerForTypeRequest antall(@jakarta.annotation.Nullable Integer antall) {
            this.antall = antall;
            return this;
        }

        public @jakarta.annotation.Nullable Boolean historisk() {
            return this.historisk;
        }
        public GetVegobjektEndringerForTypeRequest historisk(@jakarta.annotation.Nullable Boolean historisk) {
            this.historisk = historisk;
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
            GetVegobjektEndringerForTypeRequest request = (GetVegobjektEndringerForTypeRequest) o;
            return Objects.equals(this.vegobjekttypeId, request.vegobjekttypeId()) &&
                Objects.equals(this.ider, request.ider()) &&
                Objects.equals(this.start, request.start()) &&
                Objects.equals(this.antall, request.antall()) &&
                Objects.equals(this.historisk, request.historisk());
        }

        @Override
        public int hashCode() {
            return Objects.hash(vegobjekttypeId, ider, start, antall, historisk);
        }
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
     * @param requestParameters The getVegobjektEndringerForType request parameters as object
     * @return VegobjektEndringerSide
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public VegobjektEndringerSide getVegobjektEndringerForType(GetVegobjektEndringerForTypeRequest requestParameters) throws RestClientResponseException {
      return this.getVegobjektEndringerForType(requestParameters.vegobjekttypeId(), requestParameters.ider(), requestParameters.start(), requestParameters.antall(), requestParameters.historisk());
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
     * @param requestParameters The getVegobjektEndringerForType request parameters as object
     * @return ResponseEntity&lt;VegobjektEndringerSide&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseEntity<VegobjektEndringerSide> getVegobjektEndringerForTypeWithHttpInfo(GetVegobjektEndringerForTypeRequest requestParameters) throws RestClientResponseException {
      return this.getVegobjektEndringerForTypeWithHttpInfo(requestParameters.vegobjekttypeId(), requestParameters.ider(), requestParameters.start(), requestParameters.antall(), requestParameters.historisk());
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
     * @param requestParameters The getVegobjektEndringerForType request parameters as object
  * @return ResponseSpec
  * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseSpec getVegobjektEndringerForTypeWithResponseSpec(GetVegobjektEndringerForTypeRequest requestParameters) throws RestClientResponseException {
      return this.getVegobjektEndringerForTypeWithResponseSpec(requestParameters.vegobjekttypeId(), requestParameters.ider(), requestParameters.start(), requestParameters.antall(), requestParameters.historisk());
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
     * @param start Hent alle endringer etter gitt tidspunkt. Dersom denne utelates vil de eldste endringene hentes først.  Format kan være dato (&#x60;2025-06-01&#x60;) eller tidspunkt med tidssone (&#x60;2025-06-01T12:00:00Z&#x60; eller &#x60;2025-06-01T14:00:00+02:00&#x60;). For paginering vil det bli lagt ved siste vegobjekt-ID og versjon innen siste tidspunkt i responsen, i tilfelle flere endringer har skjedd på samme tidspunkt. Format for dette er &#x60;2025-06-01T12:00:00Z,12345,1&#x60; hvor &#x60;12345&#x60; er vegobjekt-ID og &#x60;1&#x60; er versjon.
     * @param antall Antall endringer som skal være med i responsen. Merk at det faktiske antallet kan variere fra respons til respons. Dette er fordi endringer på samme vegobjektversjon innenfor samme side blir aggregert sammen ved å ta den nyeste endringen. Maksverdi: 1000
     * @param historisk Bestem om du ønsker endringer for aktive eller historiske vegobjekter. Standardverdi: &#x60;false&#x60;
     * @return VegobjektEndringerSide
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getVegobjektEndringerForTypeRequestCreation(@jakarta.annotation.Nonnull Integer vegobjekttypeId, @jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable String start, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable Boolean historisk) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'vegobjekttypeId' is set
        if (vegobjekttypeId == null) {
            throw new RestClientResponseException("Missing the required parameter 'vegobjekttypeId' when calling getVegobjektEndringerForType", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("vegobjekttypeId", vegobjekttypeId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

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

        ParameterizedTypeReference<VegobjektEndringerSide> localVarReturnType = new ParameterizedTypeReference<>() {};
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
     * @param start Hent alle endringer etter gitt tidspunkt. Dersom denne utelates vil de eldste endringene hentes først.  Format kan være dato (&#x60;2025-06-01&#x60;) eller tidspunkt med tidssone (&#x60;2025-06-01T12:00:00Z&#x60; eller &#x60;2025-06-01T14:00:00+02:00&#x60;). For paginering vil det bli lagt ved siste vegobjekt-ID og versjon innen siste tidspunkt i responsen, i tilfelle flere endringer har skjedd på samme tidspunkt. Format for dette er &#x60;2025-06-01T12:00:00Z,12345,1&#x60; hvor &#x60;12345&#x60; er vegobjekt-ID og &#x60;1&#x60; er versjon.
     * @param antall Antall endringer som skal være med i responsen. Merk at det faktiske antallet kan variere fra respons til respons. Dette er fordi endringer på samme vegobjektversjon innenfor samme side blir aggregert sammen ved å ta den nyeste endringen. Maksverdi: 1000
     * @param historisk Bestem om du ønsker endringer for aktive eller historiske vegobjekter. Standardverdi: &#x60;false&#x60;
     * @return VegobjektEndringerSide
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public VegobjektEndringerSide getVegobjektEndringerForType(@jakarta.annotation.Nonnull Integer vegobjekttypeId, @jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable String start, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable Boolean historisk) throws RestClientResponseException {
        ParameterizedTypeReference<VegobjektEndringerSide> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getVegobjektEndringerForTypeRequestCreation(vegobjekttypeId, ider, start, antall, historisk).body(localVarReturnType);
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
     * @param start Hent alle endringer etter gitt tidspunkt. Dersom denne utelates vil de eldste endringene hentes først.  Format kan være dato (&#x60;2025-06-01&#x60;) eller tidspunkt med tidssone (&#x60;2025-06-01T12:00:00Z&#x60; eller &#x60;2025-06-01T14:00:00+02:00&#x60;). For paginering vil det bli lagt ved siste vegobjekt-ID og versjon innen siste tidspunkt i responsen, i tilfelle flere endringer har skjedd på samme tidspunkt. Format for dette er &#x60;2025-06-01T12:00:00Z,12345,1&#x60; hvor &#x60;12345&#x60; er vegobjekt-ID og &#x60;1&#x60; er versjon.
     * @param antall Antall endringer som skal være med i responsen. Merk at det faktiske antallet kan variere fra respons til respons. Dette er fordi endringer på samme vegobjektversjon innenfor samme side blir aggregert sammen ved å ta den nyeste endringen. Maksverdi: 1000
     * @param historisk Bestem om du ønsker endringer for aktive eller historiske vegobjekter. Standardverdi: &#x60;false&#x60;
     * @return ResponseEntity&lt;VegobjektEndringerSide&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<VegobjektEndringerSide> getVegobjektEndringerForTypeWithHttpInfo(@jakarta.annotation.Nonnull Integer vegobjekttypeId, @jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable String start, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable Boolean historisk) throws RestClientResponseException {
        ParameterizedTypeReference<VegobjektEndringerSide> localVarReturnType = new ParameterizedTypeReference<>() {};
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
     * @param start Hent alle endringer etter gitt tidspunkt. Dersom denne utelates vil de eldste endringene hentes først.  Format kan være dato (&#x60;2025-06-01&#x60;) eller tidspunkt med tidssone (&#x60;2025-06-01T12:00:00Z&#x60; eller &#x60;2025-06-01T14:00:00+02:00&#x60;). For paginering vil det bli lagt ved siste vegobjekt-ID og versjon innen siste tidspunkt i responsen, i tilfelle flere endringer har skjedd på samme tidspunkt. Format for dette er &#x60;2025-06-01T12:00:00Z,12345,1&#x60; hvor &#x60;12345&#x60; er vegobjekt-ID og &#x60;1&#x60; er versjon.
     * @param antall Antall endringer som skal være med i responsen. Merk at det faktiske antallet kan variere fra respons til respons. Dette er fordi endringer på samme vegobjektversjon innenfor samme side blir aggregert sammen ved å ta den nyeste endringen. Maksverdi: 1000
     * @param historisk Bestem om du ønsker endringer for aktive eller historiske vegobjekter. Standardverdi: &#x60;false&#x60;
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getVegobjektEndringerForTypeWithResponseSpec(@jakarta.annotation.Nonnull Integer vegobjekttypeId, @jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable String start, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable Boolean historisk) throws RestClientResponseException {
        return getVegobjektEndringerForTypeRequestCreation(vegobjekttypeId, ider, start, antall, historisk);
    }

    public static class GetVegobjektVersjonerRequest {
        private @jakarta.annotation.Nonnull Integer vegobjekttypeId;
        private @jakarta.annotation.Nonnull Long vegobjektId;
        private @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder;
        private @jakarta.annotation.Nullable SridParameter srid;
        private @jakarta.annotation.Nullable InkluderGeometri inkludergeometri;
        private @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper;
        private @jakarta.annotation.Nullable String dybde;
        private @jakarta.annotation.Nullable Integer geometritoleranse;
        private @jakarta.annotation.Nullable LocalDate tidspunkt;

        public GetVegobjektVersjonerRequest() {}

        public GetVegobjektVersjonerRequest(@jakarta.annotation.Nonnull Integer vegobjekttypeId, @jakarta.annotation.Nonnull Long vegobjektId, @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable InkluderGeometri inkludergeometri, @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper, @jakarta.annotation.Nullable String dybde, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable LocalDate tidspunkt) {
            this.vegobjekttypeId = vegobjekttypeId;
            this.vegobjektId = vegobjektId;
            this.inkluder = inkluder;
            this.srid = srid;
            this.inkludergeometri = inkludergeometri;
            this.inkluderEgenskaper = inkluderEgenskaper;
            this.dybde = dybde;
            this.geometritoleranse = geometritoleranse;
            this.tidspunkt = tidspunkt;
        }

        public @jakarta.annotation.Nonnull Integer vegobjekttypeId() {
            return this.vegobjekttypeId;
        }
        public GetVegobjektVersjonerRequest vegobjekttypeId(@jakarta.annotation.Nonnull Integer vegobjekttypeId) {
            this.vegobjekttypeId = vegobjekttypeId;
            return this;
        }

        public @jakarta.annotation.Nonnull Long vegobjektId() {
            return this.vegobjektId;
        }
        public GetVegobjektVersjonerRequest vegobjektId(@jakarta.annotation.Nonnull Long vegobjektId) {
            this.vegobjektId = vegobjektId;
            return this;
        }

        public @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder() {
            return this.inkluder;
        }
        public GetVegobjektVersjonerRequest inkluder(@jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder) {
            this.inkluder = inkluder;
            return this;
        }

        public @jakarta.annotation.Nullable SridParameter srid() {
            return this.srid;
        }
        public GetVegobjektVersjonerRequest srid(@jakarta.annotation.Nullable SridParameter srid) {
            this.srid = srid;
            return this;
        }

        public @jakarta.annotation.Nullable InkluderGeometri inkludergeometri() {
            return this.inkludergeometri;
        }
        public GetVegobjektVersjonerRequest inkludergeometri(@jakarta.annotation.Nullable InkluderGeometri inkludergeometri) {
            this.inkludergeometri = inkludergeometri;
            return this;
        }

        public @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper() {
            return this.inkluderEgenskaper;
        }
        public GetVegobjektVersjonerRequest inkluderEgenskaper(@jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper) {
            this.inkluderEgenskaper = inkluderEgenskaper;
            return this;
        }

        public @jakarta.annotation.Nullable String dybde() {
            return this.dybde;
        }
        public GetVegobjektVersjonerRequest dybde(@jakarta.annotation.Nullable String dybde) {
            this.dybde = dybde;
            return this;
        }

        public @jakarta.annotation.Nullable Integer geometritoleranse() {
            return this.geometritoleranse;
        }
        public GetVegobjektVersjonerRequest geometritoleranse(@jakarta.annotation.Nullable Integer geometritoleranse) {
            this.geometritoleranse = geometritoleranse;
            return this;
        }

        public @jakarta.annotation.Nullable LocalDate tidspunkt() {
            return this.tidspunkt;
        }
        public GetVegobjektVersjonerRequest tidspunkt(@jakarta.annotation.Nullable LocalDate tidspunkt) {
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
            GetVegobjektVersjonerRequest request = (GetVegobjektVersjonerRequest) o;
            return Objects.equals(this.vegobjekttypeId, request.vegobjekttypeId()) &&
                Objects.equals(this.vegobjektId, request.vegobjektId()) &&
                Objects.equals(this.inkluder, request.inkluder()) &&
                Objects.equals(this.srid, request.srid()) &&
                Objects.equals(this.inkludergeometri, request.inkludergeometri()) &&
                Objects.equals(this.inkluderEgenskaper, request.inkluderEgenskaper()) &&
                Objects.equals(this.dybde, request.dybde()) &&
                Objects.equals(this.geometritoleranse, request.geometritoleranse()) &&
                Objects.equals(this.tidspunkt, request.tidspunkt());
        }

        @Override
        public int hashCode() {
            return Objects.hash(vegobjekttypeId, vegobjektId, inkluder, srid, inkludergeometri, inkluderEgenskaper, dybde, geometritoleranse, tidspunkt);
        }
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
     * @param requestParameters The getVegobjektVersjoner request parameters as object
     * @return List&lt;Vegobjekt&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public List<Vegobjekt> getVegobjektVersjoner(GetVegobjektVersjonerRequest requestParameters) throws RestClientResponseException {
      return this.getVegobjektVersjoner(requestParameters.vegobjekttypeId(), requestParameters.vegobjektId(), requestParameters.inkluder(), requestParameters.srid(), requestParameters.inkludergeometri(), requestParameters.inkluderEgenskaper(), requestParameters.dybde(), requestParameters.geometritoleranse(), requestParameters.tidspunkt());
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
     * @param requestParameters The getVegobjektVersjoner request parameters as object
     * @return ResponseEntity&lt;List&lt;Vegobjekt&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseEntity<List<Vegobjekt>> getVegobjektVersjonerWithHttpInfo(GetVegobjektVersjonerRequest requestParameters) throws RestClientResponseException {
      return this.getVegobjektVersjonerWithHttpInfo(requestParameters.vegobjekttypeId(), requestParameters.vegobjektId(), requestParameters.inkluder(), requestParameters.srid(), requestParameters.inkludergeometri(), requestParameters.inkluderEgenskaper(), requestParameters.dybde(), requestParameters.geometritoleranse(), requestParameters.tidspunkt());
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
     * @param requestParameters The getVegobjektVersjoner request parameters as object
  * @return ResponseSpec
  * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseSpec getVegobjektVersjonerWithResponseSpec(GetVegobjektVersjonerRequest requestParameters) throws RestClientResponseException {
      return this.getVegobjektVersjonerWithResponseSpec(requestParameters.vegobjekttypeId(), requestParameters.vegobjektId(), requestParameters.inkluder(), requestParameters.srid(), requestParameters.inkludergeometri(), requestParameters.inkluderEgenskaper(), requestParameters.dybde(), requestParameters.geometritoleranse(), requestParameters.tidspunkt());
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getVegobjektVersjonerRequestCreation(@jakarta.annotation.Nonnull Integer vegobjekttypeId, @jakarta.annotation.Nonnull Long vegobjektId, @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable InkluderGeometri inkludergeometri, @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper, @jakarta.annotation.Nullable String dybde, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable LocalDate tidspunkt) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'vegobjekttypeId' is set
        if (vegobjekttypeId == null) {
            throw new RestClientResponseException("Missing the required parameter 'vegobjekttypeId' when calling getVegobjektVersjoner", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'vegobjektId' is set
        if (vegobjektId == null) {
            throw new RestClientResponseException("Missing the required parameter 'vegobjektId' when calling getVegobjektVersjoner", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("vegobjekttypeId", vegobjekttypeId);
        pathParams.put("vegobjektId", vegobjektId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

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

        ParameterizedTypeReference<List<Vegobjekt>> localVarReturnType = new ParameterizedTypeReference<>() {};
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<Vegobjekt> getVegobjektVersjoner(@jakarta.annotation.Nonnull Integer vegobjekttypeId, @jakarta.annotation.Nonnull Long vegobjektId, @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable InkluderGeometri inkludergeometri, @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper, @jakarta.annotation.Nullable String dybde, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable LocalDate tidspunkt) throws RestClientResponseException {
        ParameterizedTypeReference<List<Vegobjekt>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getVegobjektVersjonerRequestCreation(vegobjekttypeId, vegobjektId, inkluder, srid, inkludergeometri, inkluderEgenskaper, dybde, geometritoleranse, tidspunkt).body(localVarReturnType);
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Vegobjekt>> getVegobjektVersjonerWithHttpInfo(@jakarta.annotation.Nonnull Integer vegobjekttypeId, @jakarta.annotation.Nonnull Long vegobjektId, @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable InkluderGeometri inkludergeometri, @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper, @jakarta.annotation.Nullable String dybde, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable LocalDate tidspunkt) throws RestClientResponseException {
        ParameterizedTypeReference<List<Vegobjekt>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getVegobjektVersjonerRequestCreation(vegobjekttypeId, vegobjektId, inkluder, srid, inkludergeometri, inkluderEgenskaper, dybde, geometritoleranse, tidspunkt).toEntity(localVarReturnType);
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getVegobjektVersjonerWithResponseSpec(@jakarta.annotation.Nonnull Integer vegobjekttypeId, @jakarta.annotation.Nonnull Long vegobjektId, @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable InkluderGeometri inkludergeometri, @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper, @jakarta.annotation.Nullable String dybde, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable LocalDate tidspunkt) throws RestClientResponseException {
        return getVegobjektVersjonerRequestCreation(vegobjekttypeId, vegobjektId, inkluder, srid, inkludergeometri, inkluderEgenskaper, dybde, geometritoleranse, tidspunkt);
    }

    public static class GetVegobjekterByTypeRequest {
        private @jakarta.annotation.Nonnull Integer vegobjekttypeId;
        private @jakarta.annotation.Nullable Set<Long> ider;
        private @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder;
        private @jakarta.annotation.Nullable SridParameter srid;
        private @jakarta.annotation.Nullable InkluderGeometri inkludergeometri;
        private @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper;
        private @jakarta.annotation.Nullable Boolean segmentering;
        private @jakarta.annotation.Nullable Set<Integer> fylke;
        private @jakarta.annotation.Nullable Set<Integer> kommune;
        private @jakarta.annotation.Nullable Set<String> kontraktsomrade;
        private @jakarta.annotation.Nullable Set<String> riksvegrute;
        private @jakarta.annotation.Nullable Set<String> vegforvalter;
        private @jakarta.annotation.Nullable Set<String> vegsystemreferanse;
        private @jakarta.annotation.Nullable String kartutsnitt;
        private @jakarta.annotation.Nullable String polygon;
        private @jakarta.annotation.Nullable Set<TypeVegSosi> typeveg;
        private @jakarta.annotation.Nullable Set<AdskilteLop> adskiltelop;
        private @jakarta.annotation.Nullable Boolean kryssystem;
        private @jakarta.annotation.Nullable Boolean sideanlegg;
        private @jakarta.annotation.Nullable Trafikantgruppe trafikantgruppe;
        private @jakarta.annotation.Nullable Integer antall;
        private @jakarta.annotation.Nullable String start;
        private @jakarta.annotation.Nullable Integer geometritoleranse;
        private @jakarta.annotation.Nullable LocalDate tidspunkt;
        private @jakarta.annotation.Nullable Boolean alleVersjoner;
        private @jakarta.annotation.Nullable Boolean inkluderAntall;
        private @jakarta.annotation.Nullable Set<String> veglenkesekvens;
        private @jakarta.annotation.Nullable List<String> egenskap;
        private @jakarta.annotation.Nullable List<String> overlapp;
        private @jakarta.annotation.Nullable Set<VeglenkeTypeParameter> veglenketype;
        private @jakarta.annotation.Nullable Set<DetaljnivaParameter> detaljniva;
        private @jakarta.annotation.Nullable OffsetDateTime endretEtter;

        public GetVegobjekterByTypeRequest() {}

        public GetVegobjekterByTypeRequest(@jakarta.annotation.Nonnull Integer vegobjekttypeId, @jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable InkluderGeometri inkludergeometri, @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper, @jakarta.annotation.Nullable Boolean segmentering, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable Set<String> riksvegrute, @jakarta.annotation.Nullable Set<String> vegforvalter, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable String kartutsnitt, @jakarta.annotation.Nullable String polygon, @jakarta.annotation.Nullable Set<TypeVegSosi> typeveg, @jakarta.annotation.Nullable Set<AdskilteLop> adskiltelop, @jakarta.annotation.Nullable Boolean kryssystem, @jakarta.annotation.Nullable Boolean sideanlegg, @jakarta.annotation.Nullable Trafikantgruppe trafikantgruppe, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable String start, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable Boolean alleVersjoner, @jakarta.annotation.Nullable Boolean inkluderAntall, @jakarta.annotation.Nullable Set<String> veglenkesekvens, @jakarta.annotation.Nullable List<String> egenskap, @jakarta.annotation.Nullable List<String> overlapp, @jakarta.annotation.Nullable Set<VeglenkeTypeParameter> veglenketype, @jakarta.annotation.Nullable Set<DetaljnivaParameter> detaljniva, @jakarta.annotation.Nullable OffsetDateTime endretEtter) {
            this.vegobjekttypeId = vegobjekttypeId;
            this.ider = ider;
            this.inkluder = inkluder;
            this.srid = srid;
            this.inkludergeometri = inkludergeometri;
            this.inkluderEgenskaper = inkluderEgenskaper;
            this.segmentering = segmentering;
            this.fylke = fylke;
            this.kommune = kommune;
            this.kontraktsomrade = kontraktsomrade;
            this.riksvegrute = riksvegrute;
            this.vegforvalter = vegforvalter;
            this.vegsystemreferanse = vegsystemreferanse;
            this.kartutsnitt = kartutsnitt;
            this.polygon = polygon;
            this.typeveg = typeveg;
            this.adskiltelop = adskiltelop;
            this.kryssystem = kryssystem;
            this.sideanlegg = sideanlegg;
            this.trafikantgruppe = trafikantgruppe;
            this.antall = antall;
            this.start = start;
            this.geometritoleranse = geometritoleranse;
            this.tidspunkt = tidspunkt;
            this.alleVersjoner = alleVersjoner;
            this.inkluderAntall = inkluderAntall;
            this.veglenkesekvens = veglenkesekvens;
            this.egenskap = egenskap;
            this.overlapp = overlapp;
            this.veglenketype = veglenketype;
            this.detaljniva = detaljniva;
            this.endretEtter = endretEtter;
        }

        public @jakarta.annotation.Nonnull Integer vegobjekttypeId() {
            return this.vegobjekttypeId;
        }
        public GetVegobjekterByTypeRequest vegobjekttypeId(@jakarta.annotation.Nonnull Integer vegobjekttypeId) {
            this.vegobjekttypeId = vegobjekttypeId;
            return this;
        }

        public @jakarta.annotation.Nullable Set<Long> ider() {
            return this.ider;
        }
        public GetVegobjekterByTypeRequest ider(@jakarta.annotation.Nullable Set<Long> ider) {
            this.ider = ider;
            return this;
        }

        public @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder() {
            return this.inkluder;
        }
        public GetVegobjekterByTypeRequest inkluder(@jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder) {
            this.inkluder = inkluder;
            return this;
        }

        public @jakarta.annotation.Nullable SridParameter srid() {
            return this.srid;
        }
        public GetVegobjekterByTypeRequest srid(@jakarta.annotation.Nullable SridParameter srid) {
            this.srid = srid;
            return this;
        }

        public @jakarta.annotation.Nullable InkluderGeometri inkludergeometri() {
            return this.inkludergeometri;
        }
        public GetVegobjekterByTypeRequest inkludergeometri(@jakarta.annotation.Nullable InkluderGeometri inkludergeometri) {
            this.inkludergeometri = inkludergeometri;
            return this;
        }

        public @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper() {
            return this.inkluderEgenskaper;
        }
        public GetVegobjekterByTypeRequest inkluderEgenskaper(@jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper) {
            this.inkluderEgenskaper = inkluderEgenskaper;
            return this;
        }

        public @jakarta.annotation.Nullable Boolean segmentering() {
            return this.segmentering;
        }
        public GetVegobjekterByTypeRequest segmentering(@jakarta.annotation.Nullable Boolean segmentering) {
            this.segmentering = segmentering;
            return this;
        }

        public @jakarta.annotation.Nullable Set<Integer> fylke() {
            return this.fylke;
        }
        public GetVegobjekterByTypeRequest fylke(@jakarta.annotation.Nullable Set<Integer> fylke) {
            this.fylke = fylke;
            return this;
        }

        public @jakarta.annotation.Nullable Set<Integer> kommune() {
            return this.kommune;
        }
        public GetVegobjekterByTypeRequest kommune(@jakarta.annotation.Nullable Set<Integer> kommune) {
            this.kommune = kommune;
            return this;
        }

        public @jakarta.annotation.Nullable Set<String> kontraktsomrade() {
            return this.kontraktsomrade;
        }
        public GetVegobjekterByTypeRequest kontraktsomrade(@jakarta.annotation.Nullable Set<String> kontraktsomrade) {
            this.kontraktsomrade = kontraktsomrade;
            return this;
        }

        public @jakarta.annotation.Nullable Set<String> riksvegrute() {
            return this.riksvegrute;
        }
        public GetVegobjekterByTypeRequest riksvegrute(@jakarta.annotation.Nullable Set<String> riksvegrute) {
            this.riksvegrute = riksvegrute;
            return this;
        }

        public @jakarta.annotation.Nullable Set<String> vegforvalter() {
            return this.vegforvalter;
        }
        public GetVegobjekterByTypeRequest vegforvalter(@jakarta.annotation.Nullable Set<String> vegforvalter) {
            this.vegforvalter = vegforvalter;
            return this;
        }

        public @jakarta.annotation.Nullable Set<String> vegsystemreferanse() {
            return this.vegsystemreferanse;
        }
        public GetVegobjekterByTypeRequest vegsystemreferanse(@jakarta.annotation.Nullable Set<String> vegsystemreferanse) {
            this.vegsystemreferanse = vegsystemreferanse;
            return this;
        }

        public @jakarta.annotation.Nullable String kartutsnitt() {
            return this.kartutsnitt;
        }
        public GetVegobjekterByTypeRequest kartutsnitt(@jakarta.annotation.Nullable String kartutsnitt) {
            this.kartutsnitt = kartutsnitt;
            return this;
        }

        public @jakarta.annotation.Nullable String polygon() {
            return this.polygon;
        }
        public GetVegobjekterByTypeRequest polygon(@jakarta.annotation.Nullable String polygon) {
            this.polygon = polygon;
            return this;
        }

        public @jakarta.annotation.Nullable Set<TypeVegSosi> typeveg() {
            return this.typeveg;
        }
        public GetVegobjekterByTypeRequest typeveg(@jakarta.annotation.Nullable Set<TypeVegSosi> typeveg) {
            this.typeveg = typeveg;
            return this;
        }

        public @jakarta.annotation.Nullable Set<AdskilteLop> adskiltelop() {
            return this.adskiltelop;
        }
        public GetVegobjekterByTypeRequest adskiltelop(@jakarta.annotation.Nullable Set<AdskilteLop> adskiltelop) {
            this.adskiltelop = adskiltelop;
            return this;
        }

        public @jakarta.annotation.Nullable Boolean kryssystem() {
            return this.kryssystem;
        }
        public GetVegobjekterByTypeRequest kryssystem(@jakarta.annotation.Nullable Boolean kryssystem) {
            this.kryssystem = kryssystem;
            return this;
        }

        public @jakarta.annotation.Nullable Boolean sideanlegg() {
            return this.sideanlegg;
        }
        public GetVegobjekterByTypeRequest sideanlegg(@jakarta.annotation.Nullable Boolean sideanlegg) {
            this.sideanlegg = sideanlegg;
            return this;
        }

        public @jakarta.annotation.Nullable Trafikantgruppe trafikantgruppe() {
            return this.trafikantgruppe;
        }
        public GetVegobjekterByTypeRequest trafikantgruppe(@jakarta.annotation.Nullable Trafikantgruppe trafikantgruppe) {
            this.trafikantgruppe = trafikantgruppe;
            return this;
        }

        public @jakarta.annotation.Nullable Integer antall() {
            return this.antall;
        }
        public GetVegobjekterByTypeRequest antall(@jakarta.annotation.Nullable Integer antall) {
            this.antall = antall;
            return this;
        }

        public @jakarta.annotation.Nullable String start() {
            return this.start;
        }
        public GetVegobjekterByTypeRequest start(@jakarta.annotation.Nullable String start) {
            this.start = start;
            return this;
        }

        public @jakarta.annotation.Nullable Integer geometritoleranse() {
            return this.geometritoleranse;
        }
        public GetVegobjekterByTypeRequest geometritoleranse(@jakarta.annotation.Nullable Integer geometritoleranse) {
            this.geometritoleranse = geometritoleranse;
            return this;
        }

        public @jakarta.annotation.Nullable LocalDate tidspunkt() {
            return this.tidspunkt;
        }
        public GetVegobjekterByTypeRequest tidspunkt(@jakarta.annotation.Nullable LocalDate tidspunkt) {
            this.tidspunkt = tidspunkt;
            return this;
        }

        public @jakarta.annotation.Nullable Boolean alleVersjoner() {
            return this.alleVersjoner;
        }
        public GetVegobjekterByTypeRequest alleVersjoner(@jakarta.annotation.Nullable Boolean alleVersjoner) {
            this.alleVersjoner = alleVersjoner;
            return this;
        }

        public @jakarta.annotation.Nullable Boolean inkluderAntall() {
            return this.inkluderAntall;
        }
        public GetVegobjekterByTypeRequest inkluderAntall(@jakarta.annotation.Nullable Boolean inkluderAntall) {
            this.inkluderAntall = inkluderAntall;
            return this;
        }

        public @jakarta.annotation.Nullable Set<String> veglenkesekvens() {
            return this.veglenkesekvens;
        }
        public GetVegobjekterByTypeRequest veglenkesekvens(@jakarta.annotation.Nullable Set<String> veglenkesekvens) {
            this.veglenkesekvens = veglenkesekvens;
            return this;
        }

        public @jakarta.annotation.Nullable List<String> egenskap() {
            return this.egenskap;
        }
        public GetVegobjekterByTypeRequest egenskap(@jakarta.annotation.Nullable List<String> egenskap) {
            this.egenskap = egenskap;
            return this;
        }

        public @jakarta.annotation.Nullable List<String> overlapp() {
            return this.overlapp;
        }
        public GetVegobjekterByTypeRequest overlapp(@jakarta.annotation.Nullable List<String> overlapp) {
            this.overlapp = overlapp;
            return this;
        }

        public @jakarta.annotation.Nullable Set<VeglenkeTypeParameter> veglenketype() {
            return this.veglenketype;
        }
        public GetVegobjekterByTypeRequest veglenketype(@jakarta.annotation.Nullable Set<VeglenkeTypeParameter> veglenketype) {
            this.veglenketype = veglenketype;
            return this;
        }

        public @jakarta.annotation.Nullable Set<DetaljnivaParameter> detaljniva() {
            return this.detaljniva;
        }
        public GetVegobjekterByTypeRequest detaljniva(@jakarta.annotation.Nullable Set<DetaljnivaParameter> detaljniva) {
            this.detaljniva = detaljniva;
            return this;
        }

        public @jakarta.annotation.Nullable OffsetDateTime endretEtter() {
            return this.endretEtter;
        }
        public GetVegobjekterByTypeRequest endretEtter(@jakarta.annotation.Nullable OffsetDateTime endretEtter) {
            this.endretEtter = endretEtter;
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
            GetVegobjekterByTypeRequest request = (GetVegobjekterByTypeRequest) o;
            return Objects.equals(this.vegobjekttypeId, request.vegobjekttypeId()) &&
                Objects.equals(this.ider, request.ider()) &&
                Objects.equals(this.inkluder, request.inkluder()) &&
                Objects.equals(this.srid, request.srid()) &&
                Objects.equals(this.inkludergeometri, request.inkludergeometri()) &&
                Objects.equals(this.inkluderEgenskaper, request.inkluderEgenskaper()) &&
                Objects.equals(this.segmentering, request.segmentering()) &&
                Objects.equals(this.fylke, request.fylke()) &&
                Objects.equals(this.kommune, request.kommune()) &&
                Objects.equals(this.kontraktsomrade, request.kontraktsomrade()) &&
                Objects.equals(this.riksvegrute, request.riksvegrute()) &&
                Objects.equals(this.vegforvalter, request.vegforvalter()) &&
                Objects.equals(this.vegsystemreferanse, request.vegsystemreferanse()) &&
                Objects.equals(this.kartutsnitt, request.kartutsnitt()) &&
                Objects.equals(this.polygon, request.polygon()) &&
                Objects.equals(this.typeveg, request.typeveg()) &&
                Objects.equals(this.adskiltelop, request.adskiltelop()) &&
                Objects.equals(this.kryssystem, request.kryssystem()) &&
                Objects.equals(this.sideanlegg, request.sideanlegg()) &&
                Objects.equals(this.trafikantgruppe, request.trafikantgruppe()) &&
                Objects.equals(this.antall, request.antall()) &&
                Objects.equals(this.start, request.start()) &&
                Objects.equals(this.geometritoleranse, request.geometritoleranse()) &&
                Objects.equals(this.tidspunkt, request.tidspunkt()) &&
                Objects.equals(this.alleVersjoner, request.alleVersjoner()) &&
                Objects.equals(this.inkluderAntall, request.inkluderAntall()) &&
                Objects.equals(this.veglenkesekvens, request.veglenkesekvens()) &&
                Objects.equals(this.egenskap, request.egenskap()) &&
                Objects.equals(this.overlapp, request.overlapp()) &&
                Objects.equals(this.veglenketype, request.veglenketype()) &&
                Objects.equals(this.detaljniva, request.detaljniva()) &&
                Objects.equals(this.endretEtter, request.endretEtter());
        }

        @Override
        public int hashCode() {
            return Objects.hash(vegobjekttypeId, ider, inkluder, srid, inkludergeometri, inkluderEgenskaper, segmentering, fylke, kommune, kontraktsomrade, riksvegrute, vegforvalter, vegsystemreferanse, kartutsnitt, polygon, typeveg, adskiltelop, kryssystem, sideanlegg, trafikantgruppe, antall, start, geometritoleranse, tidspunkt, alleVersjoner, inkluderAntall, veglenkesekvens, egenskap, overlapp, veglenketype, detaljniva, endretEtter);
        }
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
     * @param requestParameters The getVegobjekterByType request parameters as object
     * @return VegobjekterSide
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public VegobjekterSide getVegobjekterByType(GetVegobjekterByTypeRequest requestParameters) throws RestClientResponseException {
      return this.getVegobjekterByType(requestParameters.vegobjekttypeId(), requestParameters.ider(), requestParameters.inkluder(), requestParameters.srid(), requestParameters.inkludergeometri(), requestParameters.inkluderEgenskaper(), requestParameters.segmentering(), requestParameters.fylke(), requestParameters.kommune(), requestParameters.kontraktsomrade(), requestParameters.riksvegrute(), requestParameters.vegforvalter(), requestParameters.vegsystemreferanse(), requestParameters.kartutsnitt(), requestParameters.polygon(), requestParameters.typeveg(), requestParameters.adskiltelop(), requestParameters.kryssystem(), requestParameters.sideanlegg(), requestParameters.trafikantgruppe(), requestParameters.antall(), requestParameters.start(), requestParameters.geometritoleranse(), requestParameters.tidspunkt(), requestParameters.alleVersjoner(), requestParameters.inkluderAntall(), requestParameters.veglenkesekvens(), requestParameters.egenskap(), requestParameters.overlapp(), requestParameters.veglenketype(), requestParameters.detaljniva(), requestParameters.endretEtter());
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
     * @param requestParameters The getVegobjekterByType request parameters as object
     * @return ResponseEntity&lt;VegobjekterSide&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseEntity<VegobjekterSide> getVegobjekterByTypeWithHttpInfo(GetVegobjekterByTypeRequest requestParameters) throws RestClientResponseException {
      return this.getVegobjekterByTypeWithHttpInfo(requestParameters.vegobjekttypeId(), requestParameters.ider(), requestParameters.inkluder(), requestParameters.srid(), requestParameters.inkludergeometri(), requestParameters.inkluderEgenskaper(), requestParameters.segmentering(), requestParameters.fylke(), requestParameters.kommune(), requestParameters.kontraktsomrade(), requestParameters.riksvegrute(), requestParameters.vegforvalter(), requestParameters.vegsystemreferanse(), requestParameters.kartutsnitt(), requestParameters.polygon(), requestParameters.typeveg(), requestParameters.adskiltelop(), requestParameters.kryssystem(), requestParameters.sideanlegg(), requestParameters.trafikantgruppe(), requestParameters.antall(), requestParameters.start(), requestParameters.geometritoleranse(), requestParameters.tidspunkt(), requestParameters.alleVersjoner(), requestParameters.inkluderAntall(), requestParameters.veglenkesekvens(), requestParameters.egenskap(), requestParameters.overlapp(), requestParameters.veglenketype(), requestParameters.detaljniva(), requestParameters.endretEtter());
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
     * @param requestParameters The getVegobjekterByType request parameters as object
  * @return ResponseSpec
  * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseSpec getVegobjekterByTypeWithResponseSpec(GetVegobjekterByTypeRequest requestParameters) throws RestClientResponseException {
      return this.getVegobjekterByTypeWithResponseSpec(requestParameters.vegobjekttypeId(), requestParameters.ider(), requestParameters.inkluder(), requestParameters.srid(), requestParameters.inkludergeometri(), requestParameters.inkluderEgenskaper(), requestParameters.segmentering(), requestParameters.fylke(), requestParameters.kommune(), requestParameters.kontraktsomrade(), requestParameters.riksvegrute(), requestParameters.vegforvalter(), requestParameters.vegsystemreferanse(), requestParameters.kartutsnitt(), requestParameters.polygon(), requestParameters.typeveg(), requestParameters.adskiltelop(), requestParameters.kryssystem(), requestParameters.sideanlegg(), requestParameters.trafikantgruppe(), requestParameters.antall(), requestParameters.start(), requestParameters.geometritoleranse(), requestParameters.tidspunkt(), requestParameters.alleVersjoner(), requestParameters.inkluderAntall(), requestParameters.veglenkesekvens(), requestParameters.egenskap(), requestParameters.overlapp(), requestParameters.veglenketype(), requestParameters.detaljniva(), requestParameters.endretEtter());
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getVegobjekterByTypeRequestCreation(@jakarta.annotation.Nonnull Integer vegobjekttypeId, @jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable InkluderGeometri inkludergeometri, @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper, @jakarta.annotation.Nullable Boolean segmentering, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable Set<String> riksvegrute, @jakarta.annotation.Nullable Set<String> vegforvalter, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable String kartutsnitt, @jakarta.annotation.Nullable String polygon, @jakarta.annotation.Nullable Set<TypeVegSosi> typeveg, @jakarta.annotation.Nullable Set<AdskilteLop> adskiltelop, @jakarta.annotation.Nullable Boolean kryssystem, @jakarta.annotation.Nullable Boolean sideanlegg, @jakarta.annotation.Nullable Trafikantgruppe trafikantgruppe, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable String start, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable Boolean alleVersjoner, @jakarta.annotation.Nullable Boolean inkluderAntall, @jakarta.annotation.Nullable Set<String> veglenkesekvens, @jakarta.annotation.Nullable List<String> egenskap, @jakarta.annotation.Nullable List<String> overlapp, @jakarta.annotation.Nullable Set<VeglenkeTypeParameter> veglenketype, @jakarta.annotation.Nullable Set<DetaljnivaParameter> detaljniva, @jakarta.annotation.Nullable OffsetDateTime endretEtter) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'vegobjekttypeId' is set
        if (vegobjekttypeId == null) {
            throw new RestClientResponseException("Missing the required parameter 'vegobjekttypeId' when calling getVegobjekterByType", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("vegobjekttypeId", vegobjekttypeId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

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

        ParameterizedTypeReference<VegobjekterSide> localVarReturnType = new ParameterizedTypeReference<>() {};
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public VegobjekterSide getVegobjekterByType(@jakarta.annotation.Nonnull Integer vegobjekttypeId, @jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable InkluderGeometri inkludergeometri, @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper, @jakarta.annotation.Nullable Boolean segmentering, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable Set<String> riksvegrute, @jakarta.annotation.Nullable Set<String> vegforvalter, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable String kartutsnitt, @jakarta.annotation.Nullable String polygon, @jakarta.annotation.Nullable Set<TypeVegSosi> typeveg, @jakarta.annotation.Nullable Set<AdskilteLop> adskiltelop, @jakarta.annotation.Nullable Boolean kryssystem, @jakarta.annotation.Nullable Boolean sideanlegg, @jakarta.annotation.Nullable Trafikantgruppe trafikantgruppe, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable String start, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable Boolean alleVersjoner, @jakarta.annotation.Nullable Boolean inkluderAntall, @jakarta.annotation.Nullable Set<String> veglenkesekvens, @jakarta.annotation.Nullable List<String> egenskap, @jakarta.annotation.Nullable List<String> overlapp, @jakarta.annotation.Nullable Set<VeglenkeTypeParameter> veglenketype, @jakarta.annotation.Nullable Set<DetaljnivaParameter> detaljniva, @jakarta.annotation.Nullable OffsetDateTime endretEtter) throws RestClientResponseException {
        ParameterizedTypeReference<VegobjekterSide> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getVegobjekterByTypeRequestCreation(vegobjekttypeId, ider, inkluder, srid, inkludergeometri, inkluderEgenskaper, segmentering, fylke, kommune, kontraktsomrade, riksvegrute, vegforvalter, vegsystemreferanse, kartutsnitt, polygon, typeveg, adskiltelop, kryssystem, sideanlegg, trafikantgruppe, antall, start, geometritoleranse, tidspunkt, alleVersjoner, inkluderAntall, veglenkesekvens, egenskap, overlapp, veglenketype, detaljniva, endretEtter).body(localVarReturnType);
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<VegobjekterSide> getVegobjekterByTypeWithHttpInfo(@jakarta.annotation.Nonnull Integer vegobjekttypeId, @jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable InkluderGeometri inkludergeometri, @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper, @jakarta.annotation.Nullable Boolean segmentering, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable Set<String> riksvegrute, @jakarta.annotation.Nullable Set<String> vegforvalter, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable String kartutsnitt, @jakarta.annotation.Nullable String polygon, @jakarta.annotation.Nullable Set<TypeVegSosi> typeveg, @jakarta.annotation.Nullable Set<AdskilteLop> adskiltelop, @jakarta.annotation.Nullable Boolean kryssystem, @jakarta.annotation.Nullable Boolean sideanlegg, @jakarta.annotation.Nullable Trafikantgruppe trafikantgruppe, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable String start, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable Boolean alleVersjoner, @jakarta.annotation.Nullable Boolean inkluderAntall, @jakarta.annotation.Nullable Set<String> veglenkesekvens, @jakarta.annotation.Nullable List<String> egenskap, @jakarta.annotation.Nullable List<String> overlapp, @jakarta.annotation.Nullable Set<VeglenkeTypeParameter> veglenketype, @jakarta.annotation.Nullable Set<DetaljnivaParameter> detaljniva, @jakarta.annotation.Nullable OffsetDateTime endretEtter) throws RestClientResponseException {
        ParameterizedTypeReference<VegobjekterSide> localVarReturnType = new ParameterizedTypeReference<>() {};
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
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getVegobjekterByTypeWithResponseSpec(@jakarta.annotation.Nonnull Integer vegobjekttypeId, @jakarta.annotation.Nullable Set<Long> ider, @jakarta.annotation.Nullable Set<InkluderIVegobjekt> inkluder, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable InkluderGeometri inkludergeometri, @jakarta.annotation.Nullable InkluderIEgenskaper inkluderEgenskaper, @jakarta.annotation.Nullable Boolean segmentering, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable Set<String> riksvegrute, @jakarta.annotation.Nullable Set<String> vegforvalter, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable String kartutsnitt, @jakarta.annotation.Nullable String polygon, @jakarta.annotation.Nullable Set<TypeVegSosi> typeveg, @jakarta.annotation.Nullable Set<AdskilteLop> adskiltelop, @jakarta.annotation.Nullable Boolean kryssystem, @jakarta.annotation.Nullable Boolean sideanlegg, @jakarta.annotation.Nullable Trafikantgruppe trafikantgruppe, @jakarta.annotation.Nullable Integer antall, @jakarta.annotation.Nullable String start, @jakarta.annotation.Nullable Integer geometritoleranse, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable Boolean alleVersjoner, @jakarta.annotation.Nullable Boolean inkluderAntall, @jakarta.annotation.Nullable Set<String> veglenkesekvens, @jakarta.annotation.Nullable List<String> egenskap, @jakarta.annotation.Nullable List<String> overlapp, @jakarta.annotation.Nullable Set<VeglenkeTypeParameter> veglenketype, @jakarta.annotation.Nullable Set<DetaljnivaParameter> detaljniva, @jakarta.annotation.Nullable OffsetDateTime endretEtter) throws RestClientResponseException {
        return getVegobjekterByTypeRequestCreation(vegobjekttypeId, ider, inkluder, srid, inkludergeometri, inkluderEgenskaper, segmentering, fylke, kommune, kontraktsomrade, riksvegrute, vegforvalter, vegsystemreferanse, kartutsnitt, polygon, typeveg, adskiltelop, kryssystem, sideanlegg, trafikantgruppe, antall, start, geometritoleranse, tidspunkt, alleVersjoner, inkluderAntall, veglenkesekvens, egenskap, overlapp, veglenketype, detaljniva, endretEtter);
    }
}

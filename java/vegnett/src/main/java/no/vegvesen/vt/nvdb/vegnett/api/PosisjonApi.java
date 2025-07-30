package no.vegvesen.vt.nvdb.vegnett.api;

import no.vegvesen.vt.nvdb.vegnett.infrastructure.ApiClient;

import no.vegvesen.vt.nvdb.vegnett.model.AlwaysIncludeMapStringPosisjon;
import java.time.LocalDate;
import no.vegvesen.vt.nvdb.vegnett.model.Posisjon;
import no.vegvesen.vt.nvdb.vegnett.model.PosisjonMedAvstand;
import no.vegvesen.vt.nvdb.vegnett.model.ProblemDetail;
import java.util.Set;
import no.vegvesen.vt.nvdb.vegnett.model.SridParameter;
import no.vegvesen.vt.nvdb.vegnett.model.Trafikantgruppe;

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
public class PosisjonApi {
    private ApiClient apiClient;

    public PosisjonApi() {
        this(new ApiClient());
    }

    public PosisjonApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }


    public static class FindPosisjonRequest {
        private @jakarta.annotation.Nullable Double nord;
        private @jakarta.annotation.Nullable Double ost;
        private @jakarta.annotation.Nullable Double lat;
        private @jakarta.annotation.Nullable Double lon;
        private @jakarta.annotation.Nullable Integer maksAvstand;
        private @jakarta.annotation.Nullable Integer maksAntall;
        private @jakarta.annotation.Nullable Boolean konnekteringslenker;
        private @jakarta.annotation.Nullable Boolean detaljerteLenker;
        private @jakarta.annotation.Nullable LocalDate tidspunkt;
        private @jakarta.annotation.Nullable Set<String> vegsystemreferanse;
        private @jakarta.annotation.Nullable SridParameter srid;
        private @jakarta.annotation.Nullable Trafikantgruppe trafikantgruppe;

        public FindPosisjonRequest() {}

        public FindPosisjonRequest(@jakarta.annotation.Nullable Double nord, @jakarta.annotation.Nullable Double ost, @jakarta.annotation.Nullable Double lat, @jakarta.annotation.Nullable Double lon, @jakarta.annotation.Nullable Integer maksAvstand, @jakarta.annotation.Nullable Integer maksAntall, @jakarta.annotation.Nullable Boolean konnekteringslenker, @jakarta.annotation.Nullable Boolean detaljerteLenker, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable Trafikantgruppe trafikantgruppe) {
            this.nord = nord;
            this.ost = ost;
            this.lat = lat;
            this.lon = lon;
            this.maksAvstand = maksAvstand;
            this.maksAntall = maksAntall;
            this.konnekteringslenker = konnekteringslenker;
            this.detaljerteLenker = detaljerteLenker;
            this.tidspunkt = tidspunkt;
            this.vegsystemreferanse = vegsystemreferanse;
            this.srid = srid;
            this.trafikantgruppe = trafikantgruppe;
        }

        public @jakarta.annotation.Nullable Double nord() {
            return this.nord;
        }
        public FindPosisjonRequest nord(@jakarta.annotation.Nullable Double nord) {
            this.nord = nord;
            return this;
        }

        public @jakarta.annotation.Nullable Double ost() {
            return this.ost;
        }
        public FindPosisjonRequest ost(@jakarta.annotation.Nullable Double ost) {
            this.ost = ost;
            return this;
        }

        public @jakarta.annotation.Nullable Double lat() {
            return this.lat;
        }
        public FindPosisjonRequest lat(@jakarta.annotation.Nullable Double lat) {
            this.lat = lat;
            return this;
        }

        public @jakarta.annotation.Nullable Double lon() {
            return this.lon;
        }
        public FindPosisjonRequest lon(@jakarta.annotation.Nullable Double lon) {
            this.lon = lon;
            return this;
        }

        public @jakarta.annotation.Nullable Integer maksAvstand() {
            return this.maksAvstand;
        }
        public FindPosisjonRequest maksAvstand(@jakarta.annotation.Nullable Integer maksAvstand) {
            this.maksAvstand = maksAvstand;
            return this;
        }

        public @jakarta.annotation.Nullable Integer maksAntall() {
            return this.maksAntall;
        }
        public FindPosisjonRequest maksAntall(@jakarta.annotation.Nullable Integer maksAntall) {
            this.maksAntall = maksAntall;
            return this;
        }

        public @jakarta.annotation.Nullable Boolean konnekteringslenker() {
            return this.konnekteringslenker;
        }
        public FindPosisjonRequest konnekteringslenker(@jakarta.annotation.Nullable Boolean konnekteringslenker) {
            this.konnekteringslenker = konnekteringslenker;
            return this;
        }

        public @jakarta.annotation.Nullable Boolean detaljerteLenker() {
            return this.detaljerteLenker;
        }
        public FindPosisjonRequest detaljerteLenker(@jakarta.annotation.Nullable Boolean detaljerteLenker) {
            this.detaljerteLenker = detaljerteLenker;
            return this;
        }

        public @jakarta.annotation.Nullable LocalDate tidspunkt() {
            return this.tidspunkt;
        }
        public FindPosisjonRequest tidspunkt(@jakarta.annotation.Nullable LocalDate tidspunkt) {
            this.tidspunkt = tidspunkt;
            return this;
        }

        public @jakarta.annotation.Nullable Set<String> vegsystemreferanse() {
            return this.vegsystemreferanse;
        }
        public FindPosisjonRequest vegsystemreferanse(@jakarta.annotation.Nullable Set<String> vegsystemreferanse) {
            this.vegsystemreferanse = vegsystemreferanse;
            return this;
        }

        public @jakarta.annotation.Nullable SridParameter srid() {
            return this.srid;
        }
        public FindPosisjonRequest srid(@jakarta.annotation.Nullable SridParameter srid) {
            this.srid = srid;
            return this;
        }

        public @jakarta.annotation.Nullable Trafikantgruppe trafikantgruppe() {
            return this.trafikantgruppe;
        }
        public FindPosisjonRequest trafikantgruppe(@jakarta.annotation.Nullable Trafikantgruppe trafikantgruppe) {
            this.trafikantgruppe = trafikantgruppe;
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
            FindPosisjonRequest request = (FindPosisjonRequest) o;
            return Objects.equals(this.nord, request.nord()) &&
                Objects.equals(this.ost, request.ost()) &&
                Objects.equals(this.lat, request.lat()) &&
                Objects.equals(this.lon, request.lon()) &&
                Objects.equals(this.maksAvstand, request.maksAvstand()) &&
                Objects.equals(this.maksAntall, request.maksAntall()) &&
                Objects.equals(this.konnekteringslenker, request.konnekteringslenker()) &&
                Objects.equals(this.detaljerteLenker, request.detaljerteLenker()) &&
                Objects.equals(this.tidspunkt, request.tidspunkt()) &&
                Objects.equals(this.vegsystemreferanse, request.vegsystemreferanse()) &&
                Objects.equals(this.srid, request.srid()) &&
                Objects.equals(this.trafikantgruppe, request.trafikantgruppe());
        }

        @Override
        public int hashCode() {
            return Objects.hash(nord, ost, lat, lon, maksAvstand, maksAntall, konnekteringslenker, detaljerteLenker, tidspunkt, vegsystemreferanse, srid, trafikantgruppe);
        }
    }

    /**
    * Finn nærmeste posisjon på vegnettet for gitte koordinater. Koordinater kan angis som &#x60;nord&#x60; og &#x60;ost&#x60; eller &#x60;lat&#x60; og &#x60;lon&#x60;.
    * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param requestParameters The findPosisjon request parameters as object
     * @return List&lt;PosisjonMedAvstand&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public List<PosisjonMedAvstand> findPosisjon(FindPosisjonRequest requestParameters) throws RestClientResponseException {
      return this.findPosisjon(requestParameters.nord(), requestParameters.ost(), requestParameters.lat(), requestParameters.lon(), requestParameters.maksAvstand(), requestParameters.maksAntall(), requestParameters.konnekteringslenker(), requestParameters.detaljerteLenker(), requestParameters.tidspunkt(), requestParameters.vegsystemreferanse(), requestParameters.srid(), requestParameters.trafikantgruppe());
    }

  /**
  * Finn nærmeste posisjon på vegnettet for gitte koordinater. Koordinater kan angis som &#x60;nord&#x60; og &#x60;ost&#x60; eller &#x60;lat&#x60; og &#x60;lon&#x60;.
  * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param requestParameters The findPosisjon request parameters as object
     * @return ResponseEntity&lt;List&lt;PosisjonMedAvstand&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseEntity<List<PosisjonMedAvstand>> findPosisjonWithHttpInfo(FindPosisjonRequest requestParameters) throws RestClientResponseException {
      return this.findPosisjonWithHttpInfo(requestParameters.nord(), requestParameters.ost(), requestParameters.lat(), requestParameters.lon(), requestParameters.maksAvstand(), requestParameters.maksAntall(), requestParameters.konnekteringslenker(), requestParameters.detaljerteLenker(), requestParameters.tidspunkt(), requestParameters.vegsystemreferanse(), requestParameters.srid(), requestParameters.trafikantgruppe());
    }

  /**
  * Finn nærmeste posisjon på vegnettet for gitte koordinater. Koordinater kan angis som &#x60;nord&#x60; og &#x60;ost&#x60; eller &#x60;lat&#x60; og &#x60;lon&#x60;.
  * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param requestParameters The findPosisjon request parameters as object
  * @return ResponseSpec
  * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseSpec findPosisjonWithResponseSpec(FindPosisjonRequest requestParameters) throws RestClientResponseException {
      return this.findPosisjonWithResponseSpec(requestParameters.nord(), requestParameters.ost(), requestParameters.lat(), requestParameters.lon(), requestParameters.maksAvstand(), requestParameters.maksAntall(), requestParameters.konnekteringslenker(), requestParameters.detaljerteLenker(), requestParameters.tidspunkt(), requestParameters.vegsystemreferanse(), requestParameters.srid(), requestParameters.trafikantgruppe());
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
     * @param vegsystemreferanse Filtrer på [vegsystemreferanse](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1 m12&#x60;
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param trafikantgruppe Filtrer på trafikantgruppe.
     * @return List&lt;PosisjonMedAvstand&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec findPosisjonRequestCreation(@jakarta.annotation.Nullable Double nord, @jakarta.annotation.Nullable Double ost, @jakarta.annotation.Nullable Double lat, @jakarta.annotation.Nullable Double lon, @jakarta.annotation.Nullable Integer maksAvstand, @jakarta.annotation.Nullable Integer maksAntall, @jakarta.annotation.Nullable Boolean konnekteringslenker, @jakarta.annotation.Nullable Boolean detaljerteLenker, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable Trafikantgruppe trafikantgruppe) throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

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

        ParameterizedTypeReference<List<PosisjonMedAvstand>> localVarReturnType = new ParameterizedTypeReference<>() {};
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
     * @param vegsystemreferanse Filtrer på [vegsystemreferanse](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1 m12&#x60;
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param trafikantgruppe Filtrer på trafikantgruppe.
     * @return List&lt;PosisjonMedAvstand&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<PosisjonMedAvstand> findPosisjon(@jakarta.annotation.Nullable Double nord, @jakarta.annotation.Nullable Double ost, @jakarta.annotation.Nullable Double lat, @jakarta.annotation.Nullable Double lon, @jakarta.annotation.Nullable Integer maksAvstand, @jakarta.annotation.Nullable Integer maksAntall, @jakarta.annotation.Nullable Boolean konnekteringslenker, @jakarta.annotation.Nullable Boolean detaljerteLenker, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable Trafikantgruppe trafikantgruppe) throws RestClientResponseException {
        ParameterizedTypeReference<List<PosisjonMedAvstand>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return findPosisjonRequestCreation(nord, ost, lat, lon, maksAvstand, maksAntall, konnekteringslenker, detaljerteLenker, tidspunkt, vegsystemreferanse, srid, trafikantgruppe).body(localVarReturnType);
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
     * @param vegsystemreferanse Filtrer på [vegsystemreferanse](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1 m12&#x60;
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param trafikantgruppe Filtrer på trafikantgruppe.
     * @return ResponseEntity&lt;List&lt;PosisjonMedAvstand&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<PosisjonMedAvstand>> findPosisjonWithHttpInfo(@jakarta.annotation.Nullable Double nord, @jakarta.annotation.Nullable Double ost, @jakarta.annotation.Nullable Double lat, @jakarta.annotation.Nullable Double lon, @jakarta.annotation.Nullable Integer maksAvstand, @jakarta.annotation.Nullable Integer maksAntall, @jakarta.annotation.Nullable Boolean konnekteringslenker, @jakarta.annotation.Nullable Boolean detaljerteLenker, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable Trafikantgruppe trafikantgruppe) throws RestClientResponseException {
        ParameterizedTypeReference<List<PosisjonMedAvstand>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return findPosisjonRequestCreation(nord, ost, lat, lon, maksAvstand, maksAntall, konnekteringslenker, detaljerteLenker, tidspunkt, vegsystemreferanse, srid, trafikantgruppe).toEntity(localVarReturnType);
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
     * @param vegsystemreferanse Filtrer på [vegsystemreferanse](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1 m12&#x60;
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param trafikantgruppe Filtrer på trafikantgruppe.
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec findPosisjonWithResponseSpec(@jakarta.annotation.Nullable Double nord, @jakarta.annotation.Nullable Double ost, @jakarta.annotation.Nullable Double lat, @jakarta.annotation.Nullable Double lon, @jakarta.annotation.Nullable Integer maksAvstand, @jakarta.annotation.Nullable Integer maksAntall, @jakarta.annotation.Nullable Boolean konnekteringslenker, @jakarta.annotation.Nullable Boolean detaljerteLenker, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable Trafikantgruppe trafikantgruppe) throws RestClientResponseException {
        return findPosisjonRequestCreation(nord, ost, lat, lon, maksAvstand, maksAntall, konnekteringslenker, detaljerteLenker, tidspunkt, vegsystemreferanse, srid, trafikantgruppe);
    }

    public static class FindPosisjonForVegRequest {
        private @jakarta.annotation.Nullable String vegsystemreferanse;
        private @jakarta.annotation.Nullable String veglenkesekvens;
        private @jakarta.annotation.Nullable LocalDate tidspunkt;
        private @jakarta.annotation.Nullable SridParameter srid;
        private @jakarta.annotation.Nullable Set<Integer> kommune;

        public FindPosisjonForVegRequest() {}

        public FindPosisjonForVegRequest(@jakarta.annotation.Nullable String vegsystemreferanse, @jakarta.annotation.Nullable String veglenkesekvens, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable Set<Integer> kommune) {
            this.vegsystemreferanse = vegsystemreferanse;
            this.veglenkesekvens = veglenkesekvens;
            this.tidspunkt = tidspunkt;
            this.srid = srid;
            this.kommune = kommune;
        }

        public @jakarta.annotation.Nullable String vegsystemreferanse() {
            return this.vegsystemreferanse;
        }
        public FindPosisjonForVegRequest vegsystemreferanse(@jakarta.annotation.Nullable String vegsystemreferanse) {
            this.vegsystemreferanse = vegsystemreferanse;
            return this;
        }

        public @jakarta.annotation.Nullable String veglenkesekvens() {
            return this.veglenkesekvens;
        }
        public FindPosisjonForVegRequest veglenkesekvens(@jakarta.annotation.Nullable String veglenkesekvens) {
            this.veglenkesekvens = veglenkesekvens;
            return this;
        }

        public @jakarta.annotation.Nullable LocalDate tidspunkt() {
            return this.tidspunkt;
        }
        public FindPosisjonForVegRequest tidspunkt(@jakarta.annotation.Nullable LocalDate tidspunkt) {
            this.tidspunkt = tidspunkt;
            return this;
        }

        public @jakarta.annotation.Nullable SridParameter srid() {
            return this.srid;
        }
        public FindPosisjonForVegRequest srid(@jakarta.annotation.Nullable SridParameter srid) {
            this.srid = srid;
            return this;
        }

        public @jakarta.annotation.Nullable Set<Integer> kommune() {
            return this.kommune;
        }
        public FindPosisjonForVegRequest kommune(@jakarta.annotation.Nullable Set<Integer> kommune) {
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
            FindPosisjonForVegRequest request = (FindPosisjonForVegRequest) o;
            return Objects.equals(this.vegsystemreferanse, request.vegsystemreferanse()) &&
                Objects.equals(this.veglenkesekvens, request.veglenkesekvens()) &&
                Objects.equals(this.tidspunkt, request.tidspunkt()) &&
                Objects.equals(this.srid, request.srid()) &&
                Objects.equals(this.kommune, request.kommune());
        }

        @Override
        public int hashCode() {
            return Objects.hash(vegsystemreferanse, veglenkesekvens, tidspunkt, srid, kommune);
        }
    }

    /**
    * Slå opp posisjon på veglenkesekvens eller vegsystemreferanse
    * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param requestParameters The findPosisjonForVeg request parameters as object
     * @return Posisjon
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public Posisjon findPosisjonForVeg(FindPosisjonForVegRequest requestParameters) throws RestClientResponseException {
      return this.findPosisjonForVeg(requestParameters.vegsystemreferanse(), requestParameters.veglenkesekvens(), requestParameters.tidspunkt(), requestParameters.srid(), requestParameters.kommune());
    }

  /**
  * Slå opp posisjon på veglenkesekvens eller vegsystemreferanse
  * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param requestParameters The findPosisjonForVeg request parameters as object
     * @return ResponseEntity&lt;Posisjon&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseEntity<Posisjon> findPosisjonForVegWithHttpInfo(FindPosisjonForVegRequest requestParameters) throws RestClientResponseException {
      return this.findPosisjonForVegWithHttpInfo(requestParameters.vegsystemreferanse(), requestParameters.veglenkesekvens(), requestParameters.tidspunkt(), requestParameters.srid(), requestParameters.kommune());
    }

  /**
  * Slå opp posisjon på veglenkesekvens eller vegsystemreferanse
  * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param requestParameters The findPosisjonForVeg request parameters as object
  * @return ResponseSpec
  * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseSpec findPosisjonForVegWithResponseSpec(FindPosisjonForVegRequest requestParameters) throws RestClientResponseException {
      return this.findPosisjonForVegWithResponseSpec(requestParameters.vegsystemreferanse(), requestParameters.veglenkesekvens(), requestParameters.tidspunkt(), requestParameters.srid(), requestParameters.kommune());
    }

    /**
     * Slå opp posisjon på veglenkesekvens eller vegsystemreferanse
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param vegsystemreferanse Finn posisjon for [vegsystemreferanse](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Må inneholde én enkelt meterverdi. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1m341&#x60;
     * @param veglenkesekvens Finn posisjon på veglenkesekvens. Format: &#x60;posisjon@veglenkesekvensid&#x60;.  Eksempel: &#x60;0.456@1226&#x60;
     * @param tidspunkt Begrens spørring til det gitte tidspunktet.
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getKommuner) for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @return Posisjon
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec findPosisjonForVegRequestCreation(@jakarta.annotation.Nullable String vegsystemreferanse, @jakarta.annotation.Nullable String veglenkesekvens, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable Set<Integer> kommune) throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

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

        ParameterizedTypeReference<Posisjon> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/api/v4/veg", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Slå opp posisjon på veglenkesekvens eller vegsystemreferanse
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param vegsystemreferanse Finn posisjon for [vegsystemreferanse](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Må inneholde én enkelt meterverdi. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1m341&#x60;
     * @param veglenkesekvens Finn posisjon på veglenkesekvens. Format: &#x60;posisjon@veglenkesekvensid&#x60;.  Eksempel: &#x60;0.456@1226&#x60;
     * @param tidspunkt Begrens spørring til det gitte tidspunktet.
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getKommuner) for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @return Posisjon
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public Posisjon findPosisjonForVeg(@jakarta.annotation.Nullable String vegsystemreferanse, @jakarta.annotation.Nullable String veglenkesekvens, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable Set<Integer> kommune) throws RestClientResponseException {
        ParameterizedTypeReference<Posisjon> localVarReturnType = new ParameterizedTypeReference<>() {};
        return findPosisjonForVegRequestCreation(vegsystemreferanse, veglenkesekvens, tidspunkt, srid, kommune).body(localVarReturnType);
    }

    /**
     * Slå opp posisjon på veglenkesekvens eller vegsystemreferanse
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param vegsystemreferanse Finn posisjon for [vegsystemreferanse](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Må inneholde én enkelt meterverdi. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1m341&#x60;
     * @param veglenkesekvens Finn posisjon på veglenkesekvens. Format: &#x60;posisjon@veglenkesekvensid&#x60;.  Eksempel: &#x60;0.456@1226&#x60;
     * @param tidspunkt Begrens spørring til det gitte tidspunktet.
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getKommuner) for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @return ResponseEntity&lt;Posisjon&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Posisjon> findPosisjonForVegWithHttpInfo(@jakarta.annotation.Nullable String vegsystemreferanse, @jakarta.annotation.Nullable String veglenkesekvens, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable Set<Integer> kommune) throws RestClientResponseException {
        ParameterizedTypeReference<Posisjon> localVarReturnType = new ParameterizedTypeReference<>() {};
        return findPosisjonForVegRequestCreation(vegsystemreferanse, veglenkesekvens, tidspunkt, srid, kommune).toEntity(localVarReturnType);
    }

    /**
     * Slå opp posisjon på veglenkesekvens eller vegsystemreferanse
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param vegsystemreferanse Finn posisjon for [vegsystemreferanse](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Må inneholde én enkelt meterverdi. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1m341&#x60;
     * @param veglenkesekvens Finn posisjon på veglenkesekvens. Format: &#x60;posisjon@veglenkesekvensid&#x60;.  Eksempel: &#x60;0.456@1226&#x60;
     * @param tidspunkt Begrens spørring til det gitte tidspunktet.
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getKommuner) for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec findPosisjonForVegWithResponseSpec(@jakarta.annotation.Nullable String vegsystemreferanse, @jakarta.annotation.Nullable String veglenkesekvens, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable Set<Integer> kommune) throws RestClientResponseException {
        return findPosisjonForVegRequestCreation(vegsystemreferanse, veglenkesekvens, tidspunkt, srid, kommune);
    }

    public static class FindPosisjonerForVegRequest {
        private @jakarta.annotation.Nullable List<String> vegsystemreferanser;
        private @jakarta.annotation.Nullable List<String> veglenkesekvenser;
        private @jakarta.annotation.Nullable Set<Integer> kommune;
        private @jakarta.annotation.Nullable SridParameter srid;

        public FindPosisjonerForVegRequest() {}

        public FindPosisjonerForVegRequest(@jakarta.annotation.Nullable List<String> vegsystemreferanser, @jakarta.annotation.Nullable List<String> veglenkesekvenser, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable SridParameter srid) {
            this.vegsystemreferanser = vegsystemreferanser;
            this.veglenkesekvenser = veglenkesekvenser;
            this.kommune = kommune;
            this.srid = srid;
        }

        public @jakarta.annotation.Nullable List<String> vegsystemreferanser() {
            return this.vegsystemreferanser;
        }
        public FindPosisjonerForVegRequest vegsystemreferanser(@jakarta.annotation.Nullable List<String> vegsystemreferanser) {
            this.vegsystemreferanser = vegsystemreferanser;
            return this;
        }

        public @jakarta.annotation.Nullable List<String> veglenkesekvenser() {
            return this.veglenkesekvenser;
        }
        public FindPosisjonerForVegRequest veglenkesekvenser(@jakarta.annotation.Nullable List<String> veglenkesekvenser) {
            this.veglenkesekvenser = veglenkesekvenser;
            return this;
        }

        public @jakarta.annotation.Nullable Set<Integer> kommune() {
            return this.kommune;
        }
        public FindPosisjonerForVegRequest kommune(@jakarta.annotation.Nullable Set<Integer> kommune) {
            this.kommune = kommune;
            return this;
        }

        public @jakarta.annotation.Nullable SridParameter srid() {
            return this.srid;
        }
        public FindPosisjonerForVegRequest srid(@jakarta.annotation.Nullable SridParameter srid) {
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
            FindPosisjonerForVegRequest request = (FindPosisjonerForVegRequest) o;
            return Objects.equals(this.vegsystemreferanser, request.vegsystemreferanser()) &&
                Objects.equals(this.veglenkesekvenser, request.veglenkesekvenser()) &&
                Objects.equals(this.kommune, request.kommune()) &&
                Objects.equals(this.srid, request.srid());
        }

        @Override
        public int hashCode() {
            return Objects.hash(vegsystemreferanser, veglenkesekvenser, kommune, srid);
        }
    }

    /**
    * Slå opp flere posisjoner på veglenkesekvens eller vegsystemreferanse
    * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param requestParameters The findPosisjonerForVeg request parameters as object
     * @return AlwaysIncludeMapStringPosisjon
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public AlwaysIncludeMapStringPosisjon findPosisjonerForVeg(FindPosisjonerForVegRequest requestParameters) throws RestClientResponseException {
      return this.findPosisjonerForVeg(requestParameters.vegsystemreferanser(), requestParameters.veglenkesekvenser(), requestParameters.kommune(), requestParameters.srid());
    }

  /**
  * Slå opp flere posisjoner på veglenkesekvens eller vegsystemreferanse
  * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param requestParameters The findPosisjonerForVeg request parameters as object
     * @return ResponseEntity&lt;AlwaysIncludeMapStringPosisjon&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseEntity<AlwaysIncludeMapStringPosisjon> findPosisjonerForVegWithHttpInfo(FindPosisjonerForVegRequest requestParameters) throws RestClientResponseException {
      return this.findPosisjonerForVegWithHttpInfo(requestParameters.vegsystemreferanser(), requestParameters.veglenkesekvenser(), requestParameters.kommune(), requestParameters.srid());
    }

  /**
  * Slå opp flere posisjoner på veglenkesekvens eller vegsystemreferanse
  * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param requestParameters The findPosisjonerForVeg request parameters as object
  * @return ResponseSpec
  * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseSpec findPosisjonerForVegWithResponseSpec(FindPosisjonerForVegRequest requestParameters) throws RestClientResponseException {
      return this.findPosisjonerForVegWithResponseSpec(requestParameters.vegsystemreferanser(), requestParameters.veglenkesekvenser(), requestParameters.kommune(), requestParameters.srid());
    }

    /**
     * Slå opp flere posisjoner på veglenkesekvens eller vegsystemreferanse
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param vegsystemreferanser Finn posisjoner for [vegsystemreferanser](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Må inneholde én enkelt meterverdi. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1m341&#x60;
     * @param veglenkesekvenser Finn posisjoner på veglenkesekvenser. Format: &#x60;posisjon@veglenkesekvensid&#x60;.  Eksempel: &#x60;0.456@1226&#x60;
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getKommuner) for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @return AlwaysIncludeMapStringPosisjon
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec findPosisjonerForVegRequestCreation(@jakarta.annotation.Nullable List<String> vegsystemreferanser, @jakarta.annotation.Nullable List<String> veglenkesekvenser, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable SridParameter srid) throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

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

        ParameterizedTypeReference<AlwaysIncludeMapStringPosisjon> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/api/v4/veg/batch", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Slå opp flere posisjoner på veglenkesekvens eller vegsystemreferanse
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param vegsystemreferanser Finn posisjoner for [vegsystemreferanser](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Må inneholde én enkelt meterverdi. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1m341&#x60;
     * @param veglenkesekvenser Finn posisjoner på veglenkesekvenser. Format: &#x60;posisjon@veglenkesekvensid&#x60;.  Eksempel: &#x60;0.456@1226&#x60;
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getKommuner) for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @return AlwaysIncludeMapStringPosisjon
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public AlwaysIncludeMapStringPosisjon findPosisjonerForVeg(@jakarta.annotation.Nullable List<String> vegsystemreferanser, @jakarta.annotation.Nullable List<String> veglenkesekvenser, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable SridParameter srid) throws RestClientResponseException {
        ParameterizedTypeReference<AlwaysIncludeMapStringPosisjon> localVarReturnType = new ParameterizedTypeReference<>() {};
        return findPosisjonerForVegRequestCreation(vegsystemreferanser, veglenkesekvenser, kommune, srid).body(localVarReturnType);
    }

    /**
     * Slå opp flere posisjoner på veglenkesekvens eller vegsystemreferanse
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param vegsystemreferanser Finn posisjoner for [vegsystemreferanser](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Må inneholde én enkelt meterverdi. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1m341&#x60;
     * @param veglenkesekvenser Finn posisjoner på veglenkesekvenser. Format: &#x60;posisjon@veglenkesekvensid&#x60;.  Eksempel: &#x60;0.456@1226&#x60;
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getKommuner) for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @return ResponseEntity&lt;AlwaysIncludeMapStringPosisjon&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AlwaysIncludeMapStringPosisjon> findPosisjonerForVegWithHttpInfo(@jakarta.annotation.Nullable List<String> vegsystemreferanser, @jakarta.annotation.Nullable List<String> veglenkesekvenser, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable SridParameter srid) throws RestClientResponseException {
        ParameterizedTypeReference<AlwaysIncludeMapStringPosisjon> localVarReturnType = new ParameterizedTypeReference<>() {};
        return findPosisjonerForVegRequestCreation(vegsystemreferanser, veglenkesekvenser, kommune, srid).toEntity(localVarReturnType);
    }

    /**
     * Slå opp flere posisjoner på veglenkesekvens eller vegsystemreferanse
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param vegsystemreferanser Finn posisjoner for [vegsystemreferanser](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Må inneholde én enkelt meterverdi. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1m341&#x60;
     * @param veglenkesekvenser Finn posisjoner på veglenkesekvenser. Format: &#x60;posisjon@veglenkesekvensid&#x60;.  Eksempel: &#x60;0.456@1226&#x60;
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getKommuner) for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec findPosisjonerForVegWithResponseSpec(@jakarta.annotation.Nullable List<String> vegsystemreferanser, @jakarta.annotation.Nullable List<String> veglenkesekvenser, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable SridParameter srid) throws RestClientResponseException {
        return findPosisjonerForVegRequestCreation(vegsystemreferanser, veglenkesekvenser, kommune, srid);
    }
}

package no.vegvesen.vt.nvdb.vegobjekter.api;

import no.vegvesen.vt.nvdb.vegobjekter.infrastructure.ApiClient;

import no.vegvesen.vt.nvdb.vegobjekter.model.AdskilteLop;
import no.vegvesen.vt.nvdb.vegobjekter.model.DetaljnivaParameter;
import no.vegvesen.vt.nvdb.vegobjekter.model.Gruppering;
import no.vegvesen.vt.nvdb.vegobjekter.model.InkluderIStatistikk;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import no.vegvesen.vt.nvdb.vegobjekter.model.ProblemDetail;
import java.util.Set;
import no.vegvesen.vt.nvdb.vegobjekter.model.SridParameter;
import no.vegvesen.vt.nvdb.vegobjekter.model.Trafikantgruppe;
import no.vegvesen.vt.nvdb.vegobjekter.model.TypeVegSosi;
import no.vegvesen.vt.nvdb.vegobjekter.model.VeglenkeTypeParameter;
import no.vegvesen.vt.nvdb.vegobjekter.model.VegobjekterStatistikk;
import no.vegvesen.vt.nvdb.vegobjekter.model.VegobjekterStatistikkGruppert;
import no.vegvesen.vt.nvdb.vegobjekter.model.VegobjekterStatistikkMedType;

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
public class StatistikkApi {
    private ApiClient apiClient;

    public StatistikkApi() {
        this(new ApiClient());
    }

    public StatistikkApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }


    public static class GetVegobjekterStatistikkRequest {
        private @jakarta.annotation.Nonnull Integer vegobjekttypeid;
        private @jakarta.annotation.Nullable SridParameter srid;
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
        private @jakarta.annotation.Nullable Set<InkluderIStatistikk> inkluder;
        private @jakarta.annotation.Nullable Set<String> veglenkesekvens;
        private @jakarta.annotation.Nullable Set<VeglenkeTypeParameter> veglenketype;
        private @jakarta.annotation.Nullable Set<DetaljnivaParameter> detaljniva;
        private @jakarta.annotation.Nullable OffsetDateTime endretEtter;
        private @jakarta.annotation.Nullable LocalDate tidspunkt;
        private @jakarta.annotation.Nullable List<String> egenskap;
        private @jakarta.annotation.Nullable List<String> overlapp;

        public GetVegobjekterStatistikkRequest() {}

        public GetVegobjekterStatistikkRequest(@jakarta.annotation.Nonnull Integer vegobjekttypeid, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable Boolean segmentering, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable Set<String> riksvegrute, @jakarta.annotation.Nullable Set<String> vegforvalter, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable String kartutsnitt, @jakarta.annotation.Nullable String polygon, @jakarta.annotation.Nullable Set<TypeVegSosi> typeveg, @jakarta.annotation.Nullable Set<AdskilteLop> adskiltelop, @jakarta.annotation.Nullable Boolean kryssystem, @jakarta.annotation.Nullable Boolean sideanlegg, @jakarta.annotation.Nullable Trafikantgruppe trafikantgruppe, @jakarta.annotation.Nullable Set<InkluderIStatistikk> inkluder, @jakarta.annotation.Nullable Set<String> veglenkesekvens, @jakarta.annotation.Nullable Set<VeglenkeTypeParameter> veglenketype, @jakarta.annotation.Nullable Set<DetaljnivaParameter> detaljniva, @jakarta.annotation.Nullable OffsetDateTime endretEtter, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable List<String> egenskap, @jakarta.annotation.Nullable List<String> overlapp) {
            this.vegobjekttypeid = vegobjekttypeid;
            this.srid = srid;
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
            this.inkluder = inkluder;
            this.veglenkesekvens = veglenkesekvens;
            this.veglenketype = veglenketype;
            this.detaljniva = detaljniva;
            this.endretEtter = endretEtter;
            this.tidspunkt = tidspunkt;
            this.egenskap = egenskap;
            this.overlapp = overlapp;
        }

        public @jakarta.annotation.Nonnull Integer vegobjekttypeid() {
            return this.vegobjekttypeid;
        }
        public GetVegobjekterStatistikkRequest vegobjekttypeid(@jakarta.annotation.Nonnull Integer vegobjekttypeid) {
            this.vegobjekttypeid = vegobjekttypeid;
            return this;
        }

        public @jakarta.annotation.Nullable SridParameter srid() {
            return this.srid;
        }
        public GetVegobjekterStatistikkRequest srid(@jakarta.annotation.Nullable SridParameter srid) {
            this.srid = srid;
            return this;
        }

        public @jakarta.annotation.Nullable Boolean segmentering() {
            return this.segmentering;
        }
        public GetVegobjekterStatistikkRequest segmentering(@jakarta.annotation.Nullable Boolean segmentering) {
            this.segmentering = segmentering;
            return this;
        }

        public @jakarta.annotation.Nullable Set<Integer> fylke() {
            return this.fylke;
        }
        public GetVegobjekterStatistikkRequest fylke(@jakarta.annotation.Nullable Set<Integer> fylke) {
            this.fylke = fylke;
            return this;
        }

        public @jakarta.annotation.Nullable Set<Integer> kommune() {
            return this.kommune;
        }
        public GetVegobjekterStatistikkRequest kommune(@jakarta.annotation.Nullable Set<Integer> kommune) {
            this.kommune = kommune;
            return this;
        }

        public @jakarta.annotation.Nullable Set<String> kontraktsomrade() {
            return this.kontraktsomrade;
        }
        public GetVegobjekterStatistikkRequest kontraktsomrade(@jakarta.annotation.Nullable Set<String> kontraktsomrade) {
            this.kontraktsomrade = kontraktsomrade;
            return this;
        }

        public @jakarta.annotation.Nullable Set<String> riksvegrute() {
            return this.riksvegrute;
        }
        public GetVegobjekterStatistikkRequest riksvegrute(@jakarta.annotation.Nullable Set<String> riksvegrute) {
            this.riksvegrute = riksvegrute;
            return this;
        }

        public @jakarta.annotation.Nullable Set<String> vegforvalter() {
            return this.vegforvalter;
        }
        public GetVegobjekterStatistikkRequest vegforvalter(@jakarta.annotation.Nullable Set<String> vegforvalter) {
            this.vegforvalter = vegforvalter;
            return this;
        }

        public @jakarta.annotation.Nullable Set<String> vegsystemreferanse() {
            return this.vegsystemreferanse;
        }
        public GetVegobjekterStatistikkRequest vegsystemreferanse(@jakarta.annotation.Nullable Set<String> vegsystemreferanse) {
            this.vegsystemreferanse = vegsystemreferanse;
            return this;
        }

        public @jakarta.annotation.Nullable String kartutsnitt() {
            return this.kartutsnitt;
        }
        public GetVegobjekterStatistikkRequest kartutsnitt(@jakarta.annotation.Nullable String kartutsnitt) {
            this.kartutsnitt = kartutsnitt;
            return this;
        }

        public @jakarta.annotation.Nullable String polygon() {
            return this.polygon;
        }
        public GetVegobjekterStatistikkRequest polygon(@jakarta.annotation.Nullable String polygon) {
            this.polygon = polygon;
            return this;
        }

        public @jakarta.annotation.Nullable Set<TypeVegSosi> typeveg() {
            return this.typeveg;
        }
        public GetVegobjekterStatistikkRequest typeveg(@jakarta.annotation.Nullable Set<TypeVegSosi> typeveg) {
            this.typeveg = typeveg;
            return this;
        }

        public @jakarta.annotation.Nullable Set<AdskilteLop> adskiltelop() {
            return this.adskiltelop;
        }
        public GetVegobjekterStatistikkRequest adskiltelop(@jakarta.annotation.Nullable Set<AdskilteLop> adskiltelop) {
            this.adskiltelop = adskiltelop;
            return this;
        }

        public @jakarta.annotation.Nullable Boolean kryssystem() {
            return this.kryssystem;
        }
        public GetVegobjekterStatistikkRequest kryssystem(@jakarta.annotation.Nullable Boolean kryssystem) {
            this.kryssystem = kryssystem;
            return this;
        }

        public @jakarta.annotation.Nullable Boolean sideanlegg() {
            return this.sideanlegg;
        }
        public GetVegobjekterStatistikkRequest sideanlegg(@jakarta.annotation.Nullable Boolean sideanlegg) {
            this.sideanlegg = sideanlegg;
            return this;
        }

        public @jakarta.annotation.Nullable Trafikantgruppe trafikantgruppe() {
            return this.trafikantgruppe;
        }
        public GetVegobjekterStatistikkRequest trafikantgruppe(@jakarta.annotation.Nullable Trafikantgruppe trafikantgruppe) {
            this.trafikantgruppe = trafikantgruppe;
            return this;
        }

        public @jakarta.annotation.Nullable Set<InkluderIStatistikk> inkluder() {
            return this.inkluder;
        }
        public GetVegobjekterStatistikkRequest inkluder(@jakarta.annotation.Nullable Set<InkluderIStatistikk> inkluder) {
            this.inkluder = inkluder;
            return this;
        }

        public @jakarta.annotation.Nullable Set<String> veglenkesekvens() {
            return this.veglenkesekvens;
        }
        public GetVegobjekterStatistikkRequest veglenkesekvens(@jakarta.annotation.Nullable Set<String> veglenkesekvens) {
            this.veglenkesekvens = veglenkesekvens;
            return this;
        }

        public @jakarta.annotation.Nullable Set<VeglenkeTypeParameter> veglenketype() {
            return this.veglenketype;
        }
        public GetVegobjekterStatistikkRequest veglenketype(@jakarta.annotation.Nullable Set<VeglenkeTypeParameter> veglenketype) {
            this.veglenketype = veglenketype;
            return this;
        }

        public @jakarta.annotation.Nullable Set<DetaljnivaParameter> detaljniva() {
            return this.detaljniva;
        }
        public GetVegobjekterStatistikkRequest detaljniva(@jakarta.annotation.Nullable Set<DetaljnivaParameter> detaljniva) {
            this.detaljniva = detaljniva;
            return this;
        }

        public @jakarta.annotation.Nullable OffsetDateTime endretEtter() {
            return this.endretEtter;
        }
        public GetVegobjekterStatistikkRequest endretEtter(@jakarta.annotation.Nullable OffsetDateTime endretEtter) {
            this.endretEtter = endretEtter;
            return this;
        }

        public @jakarta.annotation.Nullable LocalDate tidspunkt() {
            return this.tidspunkt;
        }
        public GetVegobjekterStatistikkRequest tidspunkt(@jakarta.annotation.Nullable LocalDate tidspunkt) {
            this.tidspunkt = tidspunkt;
            return this;
        }

        public @jakarta.annotation.Nullable List<String> egenskap() {
            return this.egenskap;
        }
        public GetVegobjekterStatistikkRequest egenskap(@jakarta.annotation.Nullable List<String> egenskap) {
            this.egenskap = egenskap;
            return this;
        }

        public @jakarta.annotation.Nullable List<String> overlapp() {
            return this.overlapp;
        }
        public GetVegobjekterStatistikkRequest overlapp(@jakarta.annotation.Nullable List<String> overlapp) {
            this.overlapp = overlapp;
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
            GetVegobjekterStatistikkRequest request = (GetVegobjekterStatistikkRequest) o;
            return Objects.equals(this.vegobjekttypeid, request.vegobjekttypeid()) &&
                Objects.equals(this.srid, request.srid()) &&
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
                Objects.equals(this.inkluder, request.inkluder()) &&
                Objects.equals(this.veglenkesekvens, request.veglenkesekvens()) &&
                Objects.equals(this.veglenketype, request.veglenketype()) &&
                Objects.equals(this.detaljniva, request.detaljniva()) &&
                Objects.equals(this.endretEtter, request.endretEtter()) &&
                Objects.equals(this.tidspunkt, request.tidspunkt()) &&
                Objects.equals(this.egenskap, request.egenskap()) &&
                Objects.equals(this.overlapp, request.overlapp());
        }

        @Override
        public int hashCode() {
            return Objects.hash(vegobjekttypeid, srid, segmentering, fylke, kommune, kontraktsomrade, riksvegrute, vegforvalter, vegsystemreferanse, kartutsnitt, polygon, typeveg, adskiltelop, kryssystem, sideanlegg, trafikantgruppe, inkluder, veglenkesekvens, veglenketype, detaljniva, endretEtter, tidspunkt, egenskap, overlapp);
        }
    }

    /**
    * Hent statistikk for en vegobjekttype
    * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param requestParameters The getVegobjekterStatistikk request parameters as object
     * @return VegobjekterStatistikk
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public VegobjekterStatistikk getVegobjekterStatistikk(GetVegobjekterStatistikkRequest requestParameters) throws RestClientResponseException {
      return this.getVegobjekterStatistikk(requestParameters.vegobjekttypeid(), requestParameters.srid(), requestParameters.segmentering(), requestParameters.fylke(), requestParameters.kommune(), requestParameters.kontraktsomrade(), requestParameters.riksvegrute(), requestParameters.vegforvalter(), requestParameters.vegsystemreferanse(), requestParameters.kartutsnitt(), requestParameters.polygon(), requestParameters.typeveg(), requestParameters.adskiltelop(), requestParameters.kryssystem(), requestParameters.sideanlegg(), requestParameters.trafikantgruppe(), requestParameters.inkluder(), requestParameters.veglenkesekvens(), requestParameters.veglenketype(), requestParameters.detaljniva(), requestParameters.endretEtter(), requestParameters.tidspunkt(), requestParameters.egenskap(), requestParameters.overlapp());
    }

  /**
  * Hent statistikk for en vegobjekttype
  * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param requestParameters The getVegobjekterStatistikk request parameters as object
     * @return ResponseEntity&lt;VegobjekterStatistikk&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseEntity<VegobjekterStatistikk> getVegobjekterStatistikkWithHttpInfo(GetVegobjekterStatistikkRequest requestParameters) throws RestClientResponseException {
      return this.getVegobjekterStatistikkWithHttpInfo(requestParameters.vegobjekttypeid(), requestParameters.srid(), requestParameters.segmentering(), requestParameters.fylke(), requestParameters.kommune(), requestParameters.kontraktsomrade(), requestParameters.riksvegrute(), requestParameters.vegforvalter(), requestParameters.vegsystemreferanse(), requestParameters.kartutsnitt(), requestParameters.polygon(), requestParameters.typeveg(), requestParameters.adskiltelop(), requestParameters.kryssystem(), requestParameters.sideanlegg(), requestParameters.trafikantgruppe(), requestParameters.inkluder(), requestParameters.veglenkesekvens(), requestParameters.veglenketype(), requestParameters.detaljniva(), requestParameters.endretEtter(), requestParameters.tidspunkt(), requestParameters.egenskap(), requestParameters.overlapp());
    }

  /**
  * Hent statistikk for en vegobjekttype
  * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param requestParameters The getVegobjekterStatistikk request parameters as object
  * @return ResponseSpec
  * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseSpec getVegobjekterStatistikkWithResponseSpec(GetVegobjekterStatistikkRequest requestParameters) throws RestClientResponseException {
      return this.getVegobjekterStatistikkWithResponseSpec(requestParameters.vegobjekttypeid(), requestParameters.srid(), requestParameters.segmentering(), requestParameters.fylke(), requestParameters.kommune(), requestParameters.kontraktsomrade(), requestParameters.riksvegrute(), requestParameters.vegforvalter(), requestParameters.vegsystemreferanse(), requestParameters.kartutsnitt(), requestParameters.polygon(), requestParameters.typeveg(), requestParameters.adskiltelop(), requestParameters.kryssystem(), requestParameters.sideanlegg(), requestParameters.trafikantgruppe(), requestParameters.inkluder(), requestParameters.veglenkesekvens(), requestParameters.veglenketype(), requestParameters.detaljniva(), requestParameters.endretEtter(), requestParameters.tidspunkt(), requestParameters.egenskap(), requestParameters.overlapp());
    }

    /**
     * Hent statistikk for en vegobjekttype
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param vegobjekttypeid Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.  Eksempel: 581         
     * @param srid Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param segmentering Angir om lengde skal inkludere bare deler av vegnettet som er innenfor søkeparametre tilknyttet segmentering (fylke, kommune, vegsystemreferanse, kontraktsområde, riksvegrute, vegforvalter).  Default: &#x60;false&#x60;
     * @param fylke Filtrer på fylke. Kommaseparert liste. Se /omrader/fylker for mulige verdier.  Eksempel: &#x60;50&#x60;
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se /omrader/kommuner for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @param kontraktsomrade Filtrer på kontraktsomrade. Kommaseparert liste. Se /omrader/kontraktsomrader for mulige verdier. Det er mulig å bruke ID-en for kontraktsområdet istedenfor det fulle navnet.  Eksempel: &#x60;9503 Midtre Hålogaland 2021-2026&#x60;
     * @param riksvegrute Filtrer på riksvegrute. Kommaseparert liste. Se /omrader/riksvegruter for mulige verdier.  Eksempel: &#x60;RUTE4A&#x60; eller som enumid &#x60;20290&#x60;
     * @param vegforvalter Filtrer på vegforvalter. Kommaseparert liste. Se [/omrader/api/v4/vegforvaltere](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getVegforvaltere) for mulige verdier.  Eksempel: &#x60;Møre og Romsdal fylkeskommune&#x60; eller som enumid &#x60;21774&#x60;
     * @param vegsystemreferanse Filtrer vegobjekter på [vegsystemreferanse](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1 m12&#x60;
     * @param kartutsnitt Filtrer vegobjekter med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;. Merk at vegobjektets bounding box benyttes for sammenligning, som kan medføre at vegobjekter som er utenfor kartutsnittet også returneres. For å unngå dette, kan du bruke &#x60;polygon&#x60; i stedet.  Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60;
     * @param polygon Filtrer vegobjekter med polygon i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Merk: For statistikk-spørringer vil polygonets bounding box benyttes, ikke polygonet selv.  Eksempel: &#x60;20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000&#x60;
     * @param typeveg Filtrer Relasjonstype.vegobjekter på type veg på vegnettet objektet er stedfestet på. Kommaseparert liste.  Eksempel: &#x60;kanalisertVeg, enkelBilveg, rampe, rundkjøring, bilferje, passasjerferje, gangOgSykkelveg, sykkelveg, gangveg, gågate, fortau, trapp, gangfelt, gatetun, traktorveg, sti, annet&#x60;
     * @param adskiltelop Filtrer vegobjekter på om de er stedfestet hvor det er en Strekning med verdi satt for «adskilte løp».
     * @param kryssystem Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Kryssystem.
     * @param sideanlegg Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Sideanlegg.
     * @param trafikantgruppe Filtrer vegobjekter på trafikantgruppe.
     * @param inkluder Kommaseparert liste av statistikkfelt som skal inkluderes i resultatet.
     * @param veglenkesekvens Filtrer vegobjekter på om de er stedfestet på gjeldende veglenkesekvenser. Kommaseparert liste.  Eksempel: &#x60;0.37@319531,0.83-0.97@41640&#x60;
     * @param veglenketype Filtrer vegobjekter på veglenketype på vegnettet objektet er stedfestet. Kommaseparert liste.
     * @param detaljniva Filtrer vegobjekter på detaljnivå på vegnettet objektet er stedfestet på (kortnavn fra datakatalogen).
     * @param endretEtter Finner statistikk for vegobjekter som har blitt endret etter dette tidspunktet. Tidspunkt skal følge ISO 8601 med tidssone eller som UTC. Eksempler: &#x60;2024-12-02T10:15:30.123+01:00&#x60;, &#x60;2024-12-02T09:15:30.123Z&#x60;
     * @param tidspunkt Finner statistikk for vegobjekter som var gyldige denne datoen.
     * @param egenskap Filtrer vegobjekter på egenskaper, relasjoner og overlapp. Husk URL encoding hvis verdien inneholder likhetstegn. Se [dokumentasjon](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Avanserte_filter)
     * @param overlapp Filtrer vegobjekter på overlapp. Husk URL encoding hvis verdien inneholder likhetstegn. Se [dokumentasjon](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Avanserte_filter)
     * @return VegobjekterStatistikk
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getVegobjekterStatistikkRequestCreation(@jakarta.annotation.Nonnull Integer vegobjekttypeid, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable Boolean segmentering, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable Set<String> riksvegrute, @jakarta.annotation.Nullable Set<String> vegforvalter, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable String kartutsnitt, @jakarta.annotation.Nullable String polygon, @jakarta.annotation.Nullable Set<TypeVegSosi> typeveg, @jakarta.annotation.Nullable Set<AdskilteLop> adskiltelop, @jakarta.annotation.Nullable Boolean kryssystem, @jakarta.annotation.Nullable Boolean sideanlegg, @jakarta.annotation.Nullable Trafikantgruppe trafikantgruppe, @jakarta.annotation.Nullable Set<InkluderIStatistikk> inkluder, @jakarta.annotation.Nullable Set<String> veglenkesekvens, @jakarta.annotation.Nullable Set<VeglenkeTypeParameter> veglenketype, @jakarta.annotation.Nullable Set<DetaljnivaParameter> detaljniva, @jakarta.annotation.Nullable OffsetDateTime endretEtter, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable List<String> egenskap, @jakarta.annotation.Nullable List<String> overlapp) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'vegobjekttypeid' is set
        if (vegobjekttypeid == null) {
            throw new RestClientResponseException("Missing the required parameter 'vegobjekttypeid' when calling getVegobjekterStatistikk", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("vegobjekttypeid", vegobjekttypeid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "srid", srid));
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
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "inkluder", inkluder));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "veglenkesekvens", veglenkesekvens));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "veglenketype", veglenketype));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "detaljniva", detaljniva));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "endret_etter", endretEtter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tidspunkt", tidspunkt));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "egenskap", egenskap));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "overlapp", overlapp));
        
        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<VegobjekterStatistikk> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/api/v4/vegobjekter/{vegobjekttypeid}/statistikk", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Hent statistikk for en vegobjekttype
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param vegobjekttypeid Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.  Eksempel: 581         
     * @param srid Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param segmentering Angir om lengde skal inkludere bare deler av vegnettet som er innenfor søkeparametre tilknyttet segmentering (fylke, kommune, vegsystemreferanse, kontraktsområde, riksvegrute, vegforvalter).  Default: &#x60;false&#x60;
     * @param fylke Filtrer på fylke. Kommaseparert liste. Se /omrader/fylker for mulige verdier.  Eksempel: &#x60;50&#x60;
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se /omrader/kommuner for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @param kontraktsomrade Filtrer på kontraktsomrade. Kommaseparert liste. Se /omrader/kontraktsomrader for mulige verdier. Det er mulig å bruke ID-en for kontraktsområdet istedenfor det fulle navnet.  Eksempel: &#x60;9503 Midtre Hålogaland 2021-2026&#x60;
     * @param riksvegrute Filtrer på riksvegrute. Kommaseparert liste. Se /omrader/riksvegruter for mulige verdier.  Eksempel: &#x60;RUTE4A&#x60; eller som enumid &#x60;20290&#x60;
     * @param vegforvalter Filtrer på vegforvalter. Kommaseparert liste. Se [/omrader/api/v4/vegforvaltere](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getVegforvaltere) for mulige verdier.  Eksempel: &#x60;Møre og Romsdal fylkeskommune&#x60; eller som enumid &#x60;21774&#x60;
     * @param vegsystemreferanse Filtrer vegobjekter på [vegsystemreferanse](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1 m12&#x60;
     * @param kartutsnitt Filtrer vegobjekter med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;. Merk at vegobjektets bounding box benyttes for sammenligning, som kan medføre at vegobjekter som er utenfor kartutsnittet også returneres. For å unngå dette, kan du bruke &#x60;polygon&#x60; i stedet.  Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60;
     * @param polygon Filtrer vegobjekter med polygon i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Merk: For statistikk-spørringer vil polygonets bounding box benyttes, ikke polygonet selv.  Eksempel: &#x60;20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000&#x60;
     * @param typeveg Filtrer Relasjonstype.vegobjekter på type veg på vegnettet objektet er stedfestet på. Kommaseparert liste.  Eksempel: &#x60;kanalisertVeg, enkelBilveg, rampe, rundkjøring, bilferje, passasjerferje, gangOgSykkelveg, sykkelveg, gangveg, gågate, fortau, trapp, gangfelt, gatetun, traktorveg, sti, annet&#x60;
     * @param adskiltelop Filtrer vegobjekter på om de er stedfestet hvor det er en Strekning med verdi satt for «adskilte løp».
     * @param kryssystem Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Kryssystem.
     * @param sideanlegg Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Sideanlegg.
     * @param trafikantgruppe Filtrer vegobjekter på trafikantgruppe.
     * @param inkluder Kommaseparert liste av statistikkfelt som skal inkluderes i resultatet.
     * @param veglenkesekvens Filtrer vegobjekter på om de er stedfestet på gjeldende veglenkesekvenser. Kommaseparert liste.  Eksempel: &#x60;0.37@319531,0.83-0.97@41640&#x60;
     * @param veglenketype Filtrer vegobjekter på veglenketype på vegnettet objektet er stedfestet. Kommaseparert liste.
     * @param detaljniva Filtrer vegobjekter på detaljnivå på vegnettet objektet er stedfestet på (kortnavn fra datakatalogen).
     * @param endretEtter Finner statistikk for vegobjekter som har blitt endret etter dette tidspunktet. Tidspunkt skal følge ISO 8601 med tidssone eller som UTC. Eksempler: &#x60;2024-12-02T10:15:30.123+01:00&#x60;, &#x60;2024-12-02T09:15:30.123Z&#x60;
     * @param tidspunkt Finner statistikk for vegobjekter som var gyldige denne datoen.
     * @param egenskap Filtrer vegobjekter på egenskaper, relasjoner og overlapp. Husk URL encoding hvis verdien inneholder likhetstegn. Se [dokumentasjon](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Avanserte_filter)
     * @param overlapp Filtrer vegobjekter på overlapp. Husk URL encoding hvis verdien inneholder likhetstegn. Se [dokumentasjon](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Avanserte_filter)
     * @return VegobjekterStatistikk
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public VegobjekterStatistikk getVegobjekterStatistikk(@jakarta.annotation.Nonnull Integer vegobjekttypeid, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable Boolean segmentering, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable Set<String> riksvegrute, @jakarta.annotation.Nullable Set<String> vegforvalter, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable String kartutsnitt, @jakarta.annotation.Nullable String polygon, @jakarta.annotation.Nullable Set<TypeVegSosi> typeveg, @jakarta.annotation.Nullable Set<AdskilteLop> adskiltelop, @jakarta.annotation.Nullable Boolean kryssystem, @jakarta.annotation.Nullable Boolean sideanlegg, @jakarta.annotation.Nullable Trafikantgruppe trafikantgruppe, @jakarta.annotation.Nullable Set<InkluderIStatistikk> inkluder, @jakarta.annotation.Nullable Set<String> veglenkesekvens, @jakarta.annotation.Nullable Set<VeglenkeTypeParameter> veglenketype, @jakarta.annotation.Nullable Set<DetaljnivaParameter> detaljniva, @jakarta.annotation.Nullable OffsetDateTime endretEtter, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable List<String> egenskap, @jakarta.annotation.Nullable List<String> overlapp) throws RestClientResponseException {
        ParameterizedTypeReference<VegobjekterStatistikk> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getVegobjekterStatistikkRequestCreation(vegobjekttypeid, srid, segmentering, fylke, kommune, kontraktsomrade, riksvegrute, vegforvalter, vegsystemreferanse, kartutsnitt, polygon, typeveg, adskiltelop, kryssystem, sideanlegg, trafikantgruppe, inkluder, veglenkesekvens, veglenketype, detaljniva, endretEtter, tidspunkt, egenskap, overlapp).body(localVarReturnType);
    }

    /**
     * Hent statistikk for en vegobjekttype
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param vegobjekttypeid Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.  Eksempel: 581         
     * @param srid Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param segmentering Angir om lengde skal inkludere bare deler av vegnettet som er innenfor søkeparametre tilknyttet segmentering (fylke, kommune, vegsystemreferanse, kontraktsområde, riksvegrute, vegforvalter).  Default: &#x60;false&#x60;
     * @param fylke Filtrer på fylke. Kommaseparert liste. Se /omrader/fylker for mulige verdier.  Eksempel: &#x60;50&#x60;
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se /omrader/kommuner for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @param kontraktsomrade Filtrer på kontraktsomrade. Kommaseparert liste. Se /omrader/kontraktsomrader for mulige verdier. Det er mulig å bruke ID-en for kontraktsområdet istedenfor det fulle navnet.  Eksempel: &#x60;9503 Midtre Hålogaland 2021-2026&#x60;
     * @param riksvegrute Filtrer på riksvegrute. Kommaseparert liste. Se /omrader/riksvegruter for mulige verdier.  Eksempel: &#x60;RUTE4A&#x60; eller som enumid &#x60;20290&#x60;
     * @param vegforvalter Filtrer på vegforvalter. Kommaseparert liste. Se [/omrader/api/v4/vegforvaltere](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getVegforvaltere) for mulige verdier.  Eksempel: &#x60;Møre og Romsdal fylkeskommune&#x60; eller som enumid &#x60;21774&#x60;
     * @param vegsystemreferanse Filtrer vegobjekter på [vegsystemreferanse](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1 m12&#x60;
     * @param kartutsnitt Filtrer vegobjekter med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;. Merk at vegobjektets bounding box benyttes for sammenligning, som kan medføre at vegobjekter som er utenfor kartutsnittet også returneres. For å unngå dette, kan du bruke &#x60;polygon&#x60; i stedet.  Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60;
     * @param polygon Filtrer vegobjekter med polygon i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Merk: For statistikk-spørringer vil polygonets bounding box benyttes, ikke polygonet selv.  Eksempel: &#x60;20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000&#x60;
     * @param typeveg Filtrer Relasjonstype.vegobjekter på type veg på vegnettet objektet er stedfestet på. Kommaseparert liste.  Eksempel: &#x60;kanalisertVeg, enkelBilveg, rampe, rundkjøring, bilferje, passasjerferje, gangOgSykkelveg, sykkelveg, gangveg, gågate, fortau, trapp, gangfelt, gatetun, traktorveg, sti, annet&#x60;
     * @param adskiltelop Filtrer vegobjekter på om de er stedfestet hvor det er en Strekning med verdi satt for «adskilte løp».
     * @param kryssystem Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Kryssystem.
     * @param sideanlegg Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Sideanlegg.
     * @param trafikantgruppe Filtrer vegobjekter på trafikantgruppe.
     * @param inkluder Kommaseparert liste av statistikkfelt som skal inkluderes i resultatet.
     * @param veglenkesekvens Filtrer vegobjekter på om de er stedfestet på gjeldende veglenkesekvenser. Kommaseparert liste.  Eksempel: &#x60;0.37@319531,0.83-0.97@41640&#x60;
     * @param veglenketype Filtrer vegobjekter på veglenketype på vegnettet objektet er stedfestet. Kommaseparert liste.
     * @param detaljniva Filtrer vegobjekter på detaljnivå på vegnettet objektet er stedfestet på (kortnavn fra datakatalogen).
     * @param endretEtter Finner statistikk for vegobjekter som har blitt endret etter dette tidspunktet. Tidspunkt skal følge ISO 8601 med tidssone eller som UTC. Eksempler: &#x60;2024-12-02T10:15:30.123+01:00&#x60;, &#x60;2024-12-02T09:15:30.123Z&#x60;
     * @param tidspunkt Finner statistikk for vegobjekter som var gyldige denne datoen.
     * @param egenskap Filtrer vegobjekter på egenskaper, relasjoner og overlapp. Husk URL encoding hvis verdien inneholder likhetstegn. Se [dokumentasjon](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Avanserte_filter)
     * @param overlapp Filtrer vegobjekter på overlapp. Husk URL encoding hvis verdien inneholder likhetstegn. Se [dokumentasjon](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Avanserte_filter)
     * @return ResponseEntity&lt;VegobjekterStatistikk&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<VegobjekterStatistikk> getVegobjekterStatistikkWithHttpInfo(@jakarta.annotation.Nonnull Integer vegobjekttypeid, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable Boolean segmentering, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable Set<String> riksvegrute, @jakarta.annotation.Nullable Set<String> vegforvalter, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable String kartutsnitt, @jakarta.annotation.Nullable String polygon, @jakarta.annotation.Nullable Set<TypeVegSosi> typeveg, @jakarta.annotation.Nullable Set<AdskilteLop> adskiltelop, @jakarta.annotation.Nullable Boolean kryssystem, @jakarta.annotation.Nullable Boolean sideanlegg, @jakarta.annotation.Nullable Trafikantgruppe trafikantgruppe, @jakarta.annotation.Nullable Set<InkluderIStatistikk> inkluder, @jakarta.annotation.Nullable Set<String> veglenkesekvens, @jakarta.annotation.Nullable Set<VeglenkeTypeParameter> veglenketype, @jakarta.annotation.Nullable Set<DetaljnivaParameter> detaljniva, @jakarta.annotation.Nullable OffsetDateTime endretEtter, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable List<String> egenskap, @jakarta.annotation.Nullable List<String> overlapp) throws RestClientResponseException {
        ParameterizedTypeReference<VegobjekterStatistikk> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getVegobjekterStatistikkRequestCreation(vegobjekttypeid, srid, segmentering, fylke, kommune, kontraktsomrade, riksvegrute, vegforvalter, vegsystemreferanse, kartutsnitt, polygon, typeveg, adskiltelop, kryssystem, sideanlegg, trafikantgruppe, inkluder, veglenkesekvens, veglenketype, detaljniva, endretEtter, tidspunkt, egenskap, overlapp).toEntity(localVarReturnType);
    }

    /**
     * Hent statistikk for en vegobjekttype
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param vegobjekttypeid Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.  Eksempel: 581         
     * @param srid Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param segmentering Angir om lengde skal inkludere bare deler av vegnettet som er innenfor søkeparametre tilknyttet segmentering (fylke, kommune, vegsystemreferanse, kontraktsområde, riksvegrute, vegforvalter).  Default: &#x60;false&#x60;
     * @param fylke Filtrer på fylke. Kommaseparert liste. Se /omrader/fylker for mulige verdier.  Eksempel: &#x60;50&#x60;
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se /omrader/kommuner for mulige verdier.  Eksempel: &#x60;5001&#x60;
     * @param kontraktsomrade Filtrer på kontraktsomrade. Kommaseparert liste. Se /omrader/kontraktsomrader for mulige verdier. Det er mulig å bruke ID-en for kontraktsområdet istedenfor det fulle navnet.  Eksempel: &#x60;9503 Midtre Hålogaland 2021-2026&#x60;
     * @param riksvegrute Filtrer på riksvegrute. Kommaseparert liste. Se /omrader/riksvegruter for mulige verdier.  Eksempel: &#x60;RUTE4A&#x60; eller som enumid &#x60;20290&#x60;
     * @param vegforvalter Filtrer på vegforvalter. Kommaseparert liste. Se [/omrader/api/v4/vegforvaltere](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der#/Omr%C3%A5der/getVegforvaltere) for mulige verdier.  Eksempel: &#x60;Møre og Romsdal fylkeskommune&#x60; eller som enumid &#x60;21774&#x60;
     * @param vegsystemreferanse Filtrer vegobjekter på [vegsystemreferanse](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1 m12&#x60;
     * @param kartutsnitt Filtrer vegobjekter med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;. Merk at vegobjektets bounding box benyttes for sammenligning, som kan medføre at vegobjekter som er utenfor kartutsnittet også returneres. For å unngå dette, kan du bruke &#x60;polygon&#x60; i stedet.  Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60;
     * @param polygon Filtrer vegobjekter med polygon i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Merk: For statistikk-spørringer vil polygonets bounding box benyttes, ikke polygonet selv.  Eksempel: &#x60;20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000&#x60;
     * @param typeveg Filtrer Relasjonstype.vegobjekter på type veg på vegnettet objektet er stedfestet på. Kommaseparert liste.  Eksempel: &#x60;kanalisertVeg, enkelBilveg, rampe, rundkjøring, bilferje, passasjerferje, gangOgSykkelveg, sykkelveg, gangveg, gågate, fortau, trapp, gangfelt, gatetun, traktorveg, sti, annet&#x60;
     * @param adskiltelop Filtrer vegobjekter på om de er stedfestet hvor det er en Strekning med verdi satt for «adskilte løp».
     * @param kryssystem Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Kryssystem.
     * @param sideanlegg Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Sideanlegg.
     * @param trafikantgruppe Filtrer vegobjekter på trafikantgruppe.
     * @param inkluder Kommaseparert liste av statistikkfelt som skal inkluderes i resultatet.
     * @param veglenkesekvens Filtrer vegobjekter på om de er stedfestet på gjeldende veglenkesekvenser. Kommaseparert liste.  Eksempel: &#x60;0.37@319531,0.83-0.97@41640&#x60;
     * @param veglenketype Filtrer vegobjekter på veglenketype på vegnettet objektet er stedfestet. Kommaseparert liste.
     * @param detaljniva Filtrer vegobjekter på detaljnivå på vegnettet objektet er stedfestet på (kortnavn fra datakatalogen).
     * @param endretEtter Finner statistikk for vegobjekter som har blitt endret etter dette tidspunktet. Tidspunkt skal følge ISO 8601 med tidssone eller som UTC. Eksempler: &#x60;2024-12-02T10:15:30.123+01:00&#x60;, &#x60;2024-12-02T09:15:30.123Z&#x60;
     * @param tidspunkt Finner statistikk for vegobjekter som var gyldige denne datoen.
     * @param egenskap Filtrer vegobjekter på egenskaper, relasjoner og overlapp. Husk URL encoding hvis verdien inneholder likhetstegn. Se [dokumentasjon](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Avanserte_filter)
     * @param overlapp Filtrer vegobjekter på overlapp. Husk URL encoding hvis verdien inneholder likhetstegn. Se [dokumentasjon](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Avanserte_filter)
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getVegobjekterStatistikkWithResponseSpec(@jakarta.annotation.Nonnull Integer vegobjekttypeid, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable Boolean segmentering, @jakarta.annotation.Nullable Set<Integer> fylke, @jakarta.annotation.Nullable Set<Integer> kommune, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable Set<String> riksvegrute, @jakarta.annotation.Nullable Set<String> vegforvalter, @jakarta.annotation.Nullable Set<String> vegsystemreferanse, @jakarta.annotation.Nullable String kartutsnitt, @jakarta.annotation.Nullable String polygon, @jakarta.annotation.Nullable Set<TypeVegSosi> typeveg, @jakarta.annotation.Nullable Set<AdskilteLop> adskiltelop, @jakarta.annotation.Nullable Boolean kryssystem, @jakarta.annotation.Nullable Boolean sideanlegg, @jakarta.annotation.Nullable Trafikantgruppe trafikantgruppe, @jakarta.annotation.Nullable Set<InkluderIStatistikk> inkluder, @jakarta.annotation.Nullable Set<String> veglenkesekvens, @jakarta.annotation.Nullable Set<VeglenkeTypeParameter> veglenketype, @jakarta.annotation.Nullable Set<DetaljnivaParameter> detaljniva, @jakarta.annotation.Nullable OffsetDateTime endretEtter, @jakarta.annotation.Nullable LocalDate tidspunkt, @jakarta.annotation.Nullable List<String> egenskap, @jakarta.annotation.Nullable List<String> overlapp) throws RestClientResponseException {
        return getVegobjekterStatistikkRequestCreation(vegobjekttypeid, srid, segmentering, fylke, kommune, kontraktsomrade, riksvegrute, vegforvalter, vegsystemreferanse, kartutsnitt, polygon, typeveg, adskiltelop, kryssystem, sideanlegg, trafikantgruppe, inkluder, veglenkesekvens, veglenketype, detaljniva, endretEtter, tidspunkt, egenskap, overlapp);
    }

    public static class GetVegobjekterStatistikkGruppertRequest {
        private @jakarta.annotation.Nonnull Integer vegobjekttypeid;
        private @jakarta.annotation.Nonnull Set<Gruppering> gruppering;
        private @jakarta.annotation.Nullable SridParameter srid;
        private @jakarta.annotation.Nullable String kartutsnitt;
        private @jakarta.annotation.Nullable Set<InkluderIStatistikk> inkluder;
        private @jakarta.annotation.Nullable Set<String> veglenkesekvens;
        private @jakarta.annotation.Nullable LocalDate tidspunkt;

        public GetVegobjekterStatistikkGruppertRequest() {}

        public GetVegobjekterStatistikkGruppertRequest(@jakarta.annotation.Nonnull Integer vegobjekttypeid, @jakarta.annotation.Nonnull Set<Gruppering> gruppering, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable String kartutsnitt, @jakarta.annotation.Nullable Set<InkluderIStatistikk> inkluder, @jakarta.annotation.Nullable Set<String> veglenkesekvens, @jakarta.annotation.Nullable LocalDate tidspunkt) {
            this.vegobjekttypeid = vegobjekttypeid;
            this.gruppering = gruppering;
            this.srid = srid;
            this.kartutsnitt = kartutsnitt;
            this.inkluder = inkluder;
            this.veglenkesekvens = veglenkesekvens;
            this.tidspunkt = tidspunkt;
        }

        public @jakarta.annotation.Nonnull Integer vegobjekttypeid() {
            return this.vegobjekttypeid;
        }
        public GetVegobjekterStatistikkGruppertRequest vegobjekttypeid(@jakarta.annotation.Nonnull Integer vegobjekttypeid) {
            this.vegobjekttypeid = vegobjekttypeid;
            return this;
        }

        public @jakarta.annotation.Nonnull Set<Gruppering> gruppering() {
            return this.gruppering;
        }
        public GetVegobjekterStatistikkGruppertRequest gruppering(@jakarta.annotation.Nonnull Set<Gruppering> gruppering) {
            this.gruppering = gruppering;
            return this;
        }

        public @jakarta.annotation.Nullable SridParameter srid() {
            return this.srid;
        }
        public GetVegobjekterStatistikkGruppertRequest srid(@jakarta.annotation.Nullable SridParameter srid) {
            this.srid = srid;
            return this;
        }

        public @jakarta.annotation.Nullable String kartutsnitt() {
            return this.kartutsnitt;
        }
        public GetVegobjekterStatistikkGruppertRequest kartutsnitt(@jakarta.annotation.Nullable String kartutsnitt) {
            this.kartutsnitt = kartutsnitt;
            return this;
        }

        public @jakarta.annotation.Nullable Set<InkluderIStatistikk> inkluder() {
            return this.inkluder;
        }
        public GetVegobjekterStatistikkGruppertRequest inkluder(@jakarta.annotation.Nullable Set<InkluderIStatistikk> inkluder) {
            this.inkluder = inkluder;
            return this;
        }

        public @jakarta.annotation.Nullable Set<String> veglenkesekvens() {
            return this.veglenkesekvens;
        }
        public GetVegobjekterStatistikkGruppertRequest veglenkesekvens(@jakarta.annotation.Nullable Set<String> veglenkesekvens) {
            this.veglenkesekvens = veglenkesekvens;
            return this;
        }

        public @jakarta.annotation.Nullable LocalDate tidspunkt() {
            return this.tidspunkt;
        }
        public GetVegobjekterStatistikkGruppertRequest tidspunkt(@jakarta.annotation.Nullable LocalDate tidspunkt) {
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
            GetVegobjekterStatistikkGruppertRequest request = (GetVegobjekterStatistikkGruppertRequest) o;
            return Objects.equals(this.vegobjekttypeid, request.vegobjekttypeid()) &&
                Objects.equals(this.gruppering, request.gruppering()) &&
                Objects.equals(this.srid, request.srid()) &&
                Objects.equals(this.kartutsnitt, request.kartutsnitt()) &&
                Objects.equals(this.inkluder, request.inkluder()) &&
                Objects.equals(this.veglenkesekvens, request.veglenkesekvens()) &&
                Objects.equals(this.tidspunkt, request.tidspunkt());
        }

        @Override
        public int hashCode() {
            return Objects.hash(vegobjekttypeid, gruppering, srid, kartutsnitt, inkluder, veglenkesekvens, tidspunkt);
        }
    }

    /**
    * Hent statistikk for en vegobjekttype, gruppert på ett eller flere felter
    * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param requestParameters The getVegobjekterStatistikkGruppert request parameters as object
     * @return List&lt;VegobjekterStatistikkGruppert&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public List<VegobjekterStatistikkGruppert> getVegobjekterStatistikkGruppert(GetVegobjekterStatistikkGruppertRequest requestParameters) throws RestClientResponseException {
      return this.getVegobjekterStatistikkGruppert(requestParameters.vegobjekttypeid(), requestParameters.gruppering(), requestParameters.srid(), requestParameters.kartutsnitt(), requestParameters.inkluder(), requestParameters.veglenkesekvens(), requestParameters.tidspunkt());
    }

  /**
  * Hent statistikk for en vegobjekttype, gruppert på ett eller flere felter
  * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param requestParameters The getVegobjekterStatistikkGruppert request parameters as object
     * @return ResponseEntity&lt;List&lt;VegobjekterStatistikkGruppert&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseEntity<List<VegobjekterStatistikkGruppert>> getVegobjekterStatistikkGruppertWithHttpInfo(GetVegobjekterStatistikkGruppertRequest requestParameters) throws RestClientResponseException {
      return this.getVegobjekterStatistikkGruppertWithHttpInfo(requestParameters.vegobjekttypeid(), requestParameters.gruppering(), requestParameters.srid(), requestParameters.kartutsnitt(), requestParameters.inkluder(), requestParameters.veglenkesekvens(), requestParameters.tidspunkt());
    }

  /**
  * Hent statistikk for en vegobjekttype, gruppert på ett eller flere felter
  * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param requestParameters The getVegobjekterStatistikkGruppert request parameters as object
  * @return ResponseSpec
  * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseSpec getVegobjekterStatistikkGruppertWithResponseSpec(GetVegobjekterStatistikkGruppertRequest requestParameters) throws RestClientResponseException {
      return this.getVegobjekterStatistikkGruppertWithResponseSpec(requestParameters.vegobjekttypeid(), requestParameters.gruppering(), requestParameters.srid(), requestParameters.kartutsnitt(), requestParameters.inkluder(), requestParameters.veglenkesekvens(), requestParameters.tidspunkt());
    }

    /**
     * Hent statistikk for en vegobjekttype, gruppert på ett eller flere felter
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param vegobjekttypeid The vegobjekttypeid parameter
     * @param gruppering Velg en eller flere felter som statistikken skal grupperes på.
     * @param srid Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param kartutsnitt Filtrer vegobjekter med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;. Merk at vegobjektets bounding box benyttes for sammenligning, som kan medføre at vegobjekter som er utenfor kartutsnittet også returneres. For å unngå dette, kan du bruke &#x60;polygon&#x60; i stedet.  Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60;
     * @param inkluder Kommaseparert liste av statistikkfelt som skal inkluderes i resultatet.
     * @param veglenkesekvens Filtrer vegobjekter på om de er stedfestet på gjeldende veglenkesekvenser. Kommaseparert liste.  Eksempel: &#x60;0.37@319531,0.83-0.97@41640&#x60;
     * @param tidspunkt Finner versjonen som var gyldig denne datoen.
     * @return List&lt;VegobjekterStatistikkGruppert&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getVegobjekterStatistikkGruppertRequestCreation(@jakarta.annotation.Nonnull Integer vegobjekttypeid, @jakarta.annotation.Nonnull Set<Gruppering> gruppering, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable String kartutsnitt, @jakarta.annotation.Nullable Set<InkluderIStatistikk> inkluder, @jakarta.annotation.Nullable Set<String> veglenkesekvens, @jakarta.annotation.Nullable LocalDate tidspunkt) throws RestClientResponseException {
        Object postBody = null;
        // verify the required parameter 'vegobjekttypeid' is set
        if (vegobjekttypeid == null) {
            throw new RestClientResponseException("Missing the required parameter 'vegobjekttypeid' when calling getVegobjekterStatistikkGruppert", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'gruppering' is set
        if (gruppering == null) {
            throw new RestClientResponseException("Missing the required parameter 'gruppering' when calling getVegobjekterStatistikkGruppert", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        pathParams.put("vegobjekttypeid", vegobjekttypeid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "srid", srid));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "kartutsnitt", kartutsnitt));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "gruppering", gruppering));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "inkluder", inkluder));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "veglenkesekvens", veglenkesekvens));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tidspunkt", tidspunkt));
        
        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<List<VegobjekterStatistikkGruppert>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/api/v4/vegobjekter/{vegobjekttypeid}/statistikk/gruppert", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Hent statistikk for en vegobjekttype, gruppert på ett eller flere felter
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param vegobjekttypeid The vegobjekttypeid parameter
     * @param gruppering Velg en eller flere felter som statistikken skal grupperes på.
     * @param srid Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param kartutsnitt Filtrer vegobjekter med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;. Merk at vegobjektets bounding box benyttes for sammenligning, som kan medføre at vegobjekter som er utenfor kartutsnittet også returneres. For å unngå dette, kan du bruke &#x60;polygon&#x60; i stedet.  Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60;
     * @param inkluder Kommaseparert liste av statistikkfelt som skal inkluderes i resultatet.
     * @param veglenkesekvens Filtrer vegobjekter på om de er stedfestet på gjeldende veglenkesekvenser. Kommaseparert liste.  Eksempel: &#x60;0.37@319531,0.83-0.97@41640&#x60;
     * @param tidspunkt Finner versjonen som var gyldig denne datoen.
     * @return List&lt;VegobjekterStatistikkGruppert&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<VegobjekterStatistikkGruppert> getVegobjekterStatistikkGruppert(@jakarta.annotation.Nonnull Integer vegobjekttypeid, @jakarta.annotation.Nonnull Set<Gruppering> gruppering, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable String kartutsnitt, @jakarta.annotation.Nullable Set<InkluderIStatistikk> inkluder, @jakarta.annotation.Nullable Set<String> veglenkesekvens, @jakarta.annotation.Nullable LocalDate tidspunkt) throws RestClientResponseException {
        ParameterizedTypeReference<List<VegobjekterStatistikkGruppert>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getVegobjekterStatistikkGruppertRequestCreation(vegobjekttypeid, gruppering, srid, kartutsnitt, inkluder, veglenkesekvens, tidspunkt).body(localVarReturnType);
    }

    /**
     * Hent statistikk for en vegobjekttype, gruppert på ett eller flere felter
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param vegobjekttypeid The vegobjekttypeid parameter
     * @param gruppering Velg en eller flere felter som statistikken skal grupperes på.
     * @param srid Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param kartutsnitt Filtrer vegobjekter med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;. Merk at vegobjektets bounding box benyttes for sammenligning, som kan medføre at vegobjekter som er utenfor kartutsnittet også returneres. For å unngå dette, kan du bruke &#x60;polygon&#x60; i stedet.  Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60;
     * @param inkluder Kommaseparert liste av statistikkfelt som skal inkluderes i resultatet.
     * @param veglenkesekvens Filtrer vegobjekter på om de er stedfestet på gjeldende veglenkesekvenser. Kommaseparert liste.  Eksempel: &#x60;0.37@319531,0.83-0.97@41640&#x60;
     * @param tidspunkt Finner versjonen som var gyldig denne datoen.
     * @return ResponseEntity&lt;List&lt;VegobjekterStatistikkGruppert&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<VegobjekterStatistikkGruppert>> getVegobjekterStatistikkGruppertWithHttpInfo(@jakarta.annotation.Nonnull Integer vegobjekttypeid, @jakarta.annotation.Nonnull Set<Gruppering> gruppering, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable String kartutsnitt, @jakarta.annotation.Nullable Set<InkluderIStatistikk> inkluder, @jakarta.annotation.Nullable Set<String> veglenkesekvens, @jakarta.annotation.Nullable LocalDate tidspunkt) throws RestClientResponseException {
        ParameterizedTypeReference<List<VegobjekterStatistikkGruppert>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getVegobjekterStatistikkGruppertRequestCreation(vegobjekttypeid, gruppering, srid, kartutsnitt, inkluder, veglenkesekvens, tidspunkt).toEntity(localVarReturnType);
    }

    /**
     * Hent statistikk for en vegobjekttype, gruppert på ett eller flere felter
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param vegobjekttypeid The vegobjekttypeid parameter
     * @param gruppering Velg en eller flere felter som statistikken skal grupperes på.
     * @param srid Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;.
     * @param kartutsnitt Filtrer vegobjekter med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;. Merk at vegobjektets bounding box benyttes for sammenligning, som kan medføre at vegobjekter som er utenfor kartutsnittet også returneres. For å unngå dette, kan du bruke &#x60;polygon&#x60; i stedet.  Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60;
     * @param inkluder Kommaseparert liste av statistikkfelt som skal inkluderes i resultatet.
     * @param veglenkesekvens Filtrer vegobjekter på om de er stedfestet på gjeldende veglenkesekvenser. Kommaseparert liste.  Eksempel: &#x60;0.37@319531,0.83-0.97@41640&#x60;
     * @param tidspunkt Finner versjonen som var gyldig denne datoen.
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getVegobjekterStatistikkGruppertWithResponseSpec(@jakarta.annotation.Nonnull Integer vegobjekttypeid, @jakarta.annotation.Nonnull Set<Gruppering> gruppering, @jakarta.annotation.Nullable SridParameter srid, @jakarta.annotation.Nullable String kartutsnitt, @jakarta.annotation.Nullable Set<InkluderIStatistikk> inkluder, @jakarta.annotation.Nullable Set<String> veglenkesekvens, @jakarta.annotation.Nullable LocalDate tidspunkt) throws RestClientResponseException {
        return getVegobjekterStatistikkGruppertRequestCreation(vegobjekttypeid, gruppering, srid, kartutsnitt, inkluder, veglenkesekvens, tidspunkt);
    }

    public static class GetVegobjekterStatistikkMedTyperRequest {
        private @jakarta.annotation.Nullable Set<InkluderIStatistikk> inkluder;
        private @jakarta.annotation.Nullable Set<String> kontraktsomrade;
        private @jakarta.annotation.Nullable LocalDate tidspunkt;

        public GetVegobjekterStatistikkMedTyperRequest() {}

        public GetVegobjekterStatistikkMedTyperRequest(@jakarta.annotation.Nullable Set<InkluderIStatistikk> inkluder, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable LocalDate tidspunkt) {
            this.inkluder = inkluder;
            this.kontraktsomrade = kontraktsomrade;
            this.tidspunkt = tidspunkt;
        }

        public @jakarta.annotation.Nullable Set<InkluderIStatistikk> inkluder() {
            return this.inkluder;
        }
        public GetVegobjekterStatistikkMedTyperRequest inkluder(@jakarta.annotation.Nullable Set<InkluderIStatistikk> inkluder) {
            this.inkluder = inkluder;
            return this;
        }

        public @jakarta.annotation.Nullable Set<String> kontraktsomrade() {
            return this.kontraktsomrade;
        }
        public GetVegobjekterStatistikkMedTyperRequest kontraktsomrade(@jakarta.annotation.Nullable Set<String> kontraktsomrade) {
            this.kontraktsomrade = kontraktsomrade;
            return this;
        }

        public @jakarta.annotation.Nullable LocalDate tidspunkt() {
            return this.tidspunkt;
        }
        public GetVegobjekterStatistikkMedTyperRequest tidspunkt(@jakarta.annotation.Nullable LocalDate tidspunkt) {
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
            GetVegobjekterStatistikkMedTyperRequest request = (GetVegobjekterStatistikkMedTyperRequest) o;
            return Objects.equals(this.inkluder, request.inkluder()) &&
                Objects.equals(this.kontraktsomrade, request.kontraktsomrade()) &&
                Objects.equals(this.tidspunkt, request.tidspunkt());
        }

        @Override
        public int hashCode() {
            return Objects.hash(inkluder, kontraktsomrade, tidspunkt);
        }
    }

    /**
    * Hent overordnet statistikk for alle vegobjekttyper
    * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param requestParameters The getVegobjekterStatistikkMedTyper request parameters as object
     * @return List&lt;VegobjekterStatistikkMedType&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public List<VegobjekterStatistikkMedType> getVegobjekterStatistikkMedTyper(GetVegobjekterStatistikkMedTyperRequest requestParameters) throws RestClientResponseException {
      return this.getVegobjekterStatistikkMedTyper(requestParameters.inkluder(), requestParameters.kontraktsomrade(), requestParameters.tidspunkt());
    }

  /**
  * Hent overordnet statistikk for alle vegobjekttyper
  * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param requestParameters The getVegobjekterStatistikkMedTyper request parameters as object
     * @return ResponseEntity&lt;List&lt;VegobjekterStatistikkMedType&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseEntity<List<VegobjekterStatistikkMedType>> getVegobjekterStatistikkMedTyperWithHttpInfo(GetVegobjekterStatistikkMedTyperRequest requestParameters) throws RestClientResponseException {
      return this.getVegobjekterStatistikkMedTyperWithHttpInfo(requestParameters.inkluder(), requestParameters.kontraktsomrade(), requestParameters.tidspunkt());
    }

  /**
  * Hent overordnet statistikk for alle vegobjekttyper
  * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param requestParameters The getVegobjekterStatistikkMedTyper request parameters as object
  * @return ResponseSpec
  * @throws RestClientResponseException if an error occurs while attempting to invoke the API
    */
    public ResponseSpec getVegobjekterStatistikkMedTyperWithResponseSpec(GetVegobjekterStatistikkMedTyperRequest requestParameters) throws RestClientResponseException {
      return this.getVegobjekterStatistikkMedTyperWithResponseSpec(requestParameters.inkluder(), requestParameters.kontraktsomrade(), requestParameters.tidspunkt());
    }

    /**
     * Hent overordnet statistikk for alle vegobjekttyper
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param inkluder Kommaseparert liste av statistikkfelt som skal inkluderes i resultatet.
     * @param kontraktsomrade Filtrer på kontraktsomrade. Kommaseparert liste. Se /omrader/kontraktsomrader for mulige verdier. Det er mulig å bruke ID-en for kontraktsområdet istedenfor det fulle navnet.  Eksempel: &#x60;9503 Midtre Hålogaland 2021-2026&#x60;
     * @param tidspunkt Finner versjonen som var gyldig denne datoen.
     * @return List&lt;VegobjekterStatistikkMedType&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getVegobjekterStatistikkMedTyperRequestCreation(@jakarta.annotation.Nullable Set<InkluderIStatistikk> inkluder, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable LocalDate tidspunkt) throws RestClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "inkluder", inkluder));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "kontraktsomrade", kontraktsomrade));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tidspunkt", tidspunkt));
        
        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<List<VegobjekterStatistikkMedType>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return apiClient.invokeAPI("/api/v4/vegobjekter/statistikk", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Hent overordnet statistikk for alle vegobjekttyper
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param inkluder Kommaseparert liste av statistikkfelt som skal inkluderes i resultatet.
     * @param kontraktsomrade Filtrer på kontraktsomrade. Kommaseparert liste. Se /omrader/kontraktsomrader for mulige verdier. Det er mulig å bruke ID-en for kontraktsområdet istedenfor det fulle navnet.  Eksempel: &#x60;9503 Midtre Hålogaland 2021-2026&#x60;
     * @param tidspunkt Finner versjonen som var gyldig denne datoen.
     * @return List&lt;VegobjekterStatistikkMedType&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public List<VegobjekterStatistikkMedType> getVegobjekterStatistikkMedTyper(@jakarta.annotation.Nullable Set<InkluderIStatistikk> inkluder, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable LocalDate tidspunkt) throws RestClientResponseException {
        ParameterizedTypeReference<List<VegobjekterStatistikkMedType>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getVegobjekterStatistikkMedTyperRequestCreation(inkluder, kontraktsomrade, tidspunkt).body(localVarReturnType);
    }

    /**
     * Hent overordnet statistikk for alle vegobjekttyper
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param inkluder Kommaseparert liste av statistikkfelt som skal inkluderes i resultatet.
     * @param kontraktsomrade Filtrer på kontraktsomrade. Kommaseparert liste. Se /omrader/kontraktsomrader for mulige verdier. Det er mulig å bruke ID-en for kontraktsområdet istedenfor det fulle navnet.  Eksempel: &#x60;9503 Midtre Hålogaland 2021-2026&#x60;
     * @param tidspunkt Finner versjonen som var gyldig denne datoen.
     * @return ResponseEntity&lt;List&lt;VegobjekterStatistikkMedType&gt;&gt;
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<VegobjekterStatistikkMedType>> getVegobjekterStatistikkMedTyperWithHttpInfo(@jakarta.annotation.Nullable Set<InkluderIStatistikk> inkluder, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable LocalDate tidspunkt) throws RestClientResponseException {
        ParameterizedTypeReference<List<VegobjekterStatistikkMedType>> localVarReturnType = new ParameterizedTypeReference<>() {};
        return getVegobjekterStatistikkMedTyperRequestCreation(inkluder, kontraktsomrade, tidspunkt).toEntity(localVarReturnType);
    }

    /**
     * Hent overordnet statistikk for alle vegobjekttyper
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>200</b> - OK
     * @param inkluder Kommaseparert liste av statistikkfelt som skal inkluderes i resultatet.
     * @param kontraktsomrade Filtrer på kontraktsomrade. Kommaseparert liste. Se /omrader/kontraktsomrader for mulige verdier. Det er mulig å bruke ID-en for kontraktsområdet istedenfor det fulle navnet.  Eksempel: &#x60;9503 Midtre Hålogaland 2021-2026&#x60;
     * @param tidspunkt Finner versjonen som var gyldig denne datoen.
     * @return ResponseSpec
     * @throws RestClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getVegobjekterStatistikkMedTyperWithResponseSpec(@jakarta.annotation.Nullable Set<InkluderIStatistikk> inkluder, @jakarta.annotation.Nullable Set<String> kontraktsomrade, @jakarta.annotation.Nullable LocalDate tidspunkt) throws RestClientResponseException {
        return getVegobjekterStatistikkMedTyperRequestCreation(inkluder, kontraktsomrade, tidspunkt);
    }
}

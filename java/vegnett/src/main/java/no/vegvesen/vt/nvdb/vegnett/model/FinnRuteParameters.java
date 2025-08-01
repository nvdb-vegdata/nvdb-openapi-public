/*
 * NVDB API Les Vegnett
 * Dette API-et brukes til å lese vegnettelementer. Les mer om bruk av API-et på https://nvdb.test.atlas.vegvesen.no/produkter/nvdbapil/v4/Vegnett
 *
 * The version of the OpenAPI document: v4
 * Contact: nvdb@vegvesen.no
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package no.vegvesen.vt.nvdb.vegnett.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;
import no.vegvesen.vt.nvdb.vegnett.model.SridParameter;
import no.vegvesen.vt.nvdb.vegnett.model.Trafikantgruppe;
import no.vegvesen.vt.nvdb.vegnett.model.TypeVeg;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * FinnRuteParameters
 */
@JsonPropertyOrder({
  FinnRuteParameters.JSON_PROPERTY_START,
  FinnRuteParameters.JSON_PROPERTY_SLUTT,
  FinnRuteParameters.JSON_PROPERTY_GEOMETRI,
  FinnRuteParameters.JSON_PROPERTY_MAKS_AVSTAND,
  FinnRuteParameters.JSON_PROPERTY_OMKRETS,
  FinnRuteParameters.JSON_PROPERTY_KONNEKTERINGSLENKER,
  FinnRuteParameters.JSON_PROPERTY_DETALJERTE_LENKER,
  FinnRuteParameters.JSON_PROPERTY_KORTFORM,
  FinnRuteParameters.JSON_PROPERTY_VEGSYSTEMREFERANSE,
  FinnRuteParameters.JSON_PROPERTY_TRAFIKANTGRUPPE,
  FinnRuteParameters.JSON_PROPERTY_BEHOLD_TRAFIKANTGRUPPE,
  FinnRuteParameters.JSON_PROPERTY_TYPEVEG,
  FinnRuteParameters.JSON_PROPERTY_TIDSPUNKT,
  FinnRuteParameters.JSON_PROPERTY_SRID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public class FinnRuteParameters {
  public static final String JSON_PROPERTY_START = "start";
  @jakarta.annotation.Nullable
  private String start;

  public static final String JSON_PROPERTY_SLUTT = "slutt";
  @jakarta.annotation.Nullable
  private String slutt;

  public static final String JSON_PROPERTY_GEOMETRI = "geometri";
  @jakarta.annotation.Nullable
  private String geometri;

  public static final String JSON_PROPERTY_MAKS_AVSTAND = "maks_avstand";
  @jakarta.annotation.Nonnull
  private Integer maksAvstand;

  public static final String JSON_PROPERTY_OMKRETS = "omkrets";
  @jakarta.annotation.Nonnull
  private Integer omkrets;

  public static final String JSON_PROPERTY_KONNEKTERINGSLENKER = "konnekteringslenker";
  @jakarta.annotation.Nonnull
  private Boolean konnekteringslenker;

  public static final String JSON_PROPERTY_DETALJERTE_LENKER = "detaljerte_lenker";
  @jakarta.annotation.Nonnull
  private Boolean detaljerteLenker;

  public static final String JSON_PROPERTY_KORTFORM = "kortform";
  @jakarta.annotation.Nonnull
  private Boolean kortform;

  public static final String JSON_PROPERTY_VEGSYSTEMREFERANSE = "vegsystemreferanse";
  @jakarta.annotation.Nullable
  private Set<String> vegsystemreferanse = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_TRAFIKANTGRUPPE = "trafikantgruppe";
  @jakarta.annotation.Nullable
  private Trafikantgruppe trafikantgruppe;

  public static final String JSON_PROPERTY_BEHOLD_TRAFIKANTGRUPPE = "behold_trafikantgruppe";
  @jakarta.annotation.Nonnull
  private Boolean beholdTrafikantgruppe;

  public static final String JSON_PROPERTY_TYPEVEG = "typeveg";
  @jakarta.annotation.Nullable
  private Set<TypeVeg> typeveg = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_TIDSPUNKT = "tidspunkt";
  @jakarta.annotation.Nullable
  private LocalDate tidspunkt;

  public static final String JSON_PROPERTY_SRID = "srid";
  @jakarta.annotation.Nullable
  private SridParameter srid;

  public FinnRuteParameters() {
  }

  public FinnRuteParameters start(@jakarta.annotation.Nullable String start) {
    
    this.start = start;
    return this;
  }

  /**
   * Get start
   * @return start
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStart() {
    return start;
  }


  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStart(@jakarta.annotation.Nullable String start) {
    this.start = start;
  }

  public FinnRuteParameters slutt(@jakarta.annotation.Nullable String slutt) {
    
    this.slutt = slutt;
    return this;
  }

  /**
   * Get slutt
   * @return slutt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SLUTT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSlutt() {
    return slutt;
  }


  @JsonProperty(JSON_PROPERTY_SLUTT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSlutt(@jakarta.annotation.Nullable String slutt) {
    this.slutt = slutt;
  }

  public FinnRuteParameters geometri(@jakarta.annotation.Nullable String geometri) {
    
    this.geometri = geometri;
    return this;
  }

  /**
   * Get geometri
   * @return geometri
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GEOMETRI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGeometri() {
    return geometri;
  }


  @JsonProperty(JSON_PROPERTY_GEOMETRI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGeometri(@jakarta.annotation.Nullable String geometri) {
    this.geometri = geometri;
  }

  public FinnRuteParameters maksAvstand(@jakarta.annotation.Nonnull Integer maksAvstand) {
    
    this.maksAvstand = maksAvstand;
    return this;
  }

  /**
   * Get maksAvstand
   * @return maksAvstand
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MAKS_AVSTAND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getMaksAvstand() {
    return maksAvstand;
  }


  @JsonProperty(JSON_PROPERTY_MAKS_AVSTAND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaksAvstand(@jakarta.annotation.Nonnull Integer maksAvstand) {
    this.maksAvstand = maksAvstand;
  }

  public FinnRuteParameters omkrets(@jakarta.annotation.Nonnull Integer omkrets) {
    
    this.omkrets = omkrets;
    return this;
  }

  /**
   * Get omkrets
   * @return omkrets
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OMKRETS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getOmkrets() {
    return omkrets;
  }


  @JsonProperty(JSON_PROPERTY_OMKRETS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOmkrets(@jakarta.annotation.Nonnull Integer omkrets) {
    this.omkrets = omkrets;
  }

  public FinnRuteParameters konnekteringslenker(@jakarta.annotation.Nonnull Boolean konnekteringslenker) {
    
    this.konnekteringslenker = konnekteringslenker;
    return this;
  }

  /**
   * Get konnekteringslenker
   * @return konnekteringslenker
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_KONNEKTERINGSLENKER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getKonnekteringslenker() {
    return konnekteringslenker;
  }


  @JsonProperty(JSON_PROPERTY_KONNEKTERINGSLENKER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKonnekteringslenker(@jakarta.annotation.Nonnull Boolean konnekteringslenker) {
    this.konnekteringslenker = konnekteringslenker;
  }

  public FinnRuteParameters detaljerteLenker(@jakarta.annotation.Nonnull Boolean detaljerteLenker) {
    
    this.detaljerteLenker = detaljerteLenker;
    return this;
  }

  /**
   * Get detaljerteLenker
   * @return detaljerteLenker
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DETALJERTE_LENKER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getDetaljerteLenker() {
    return detaljerteLenker;
  }


  @JsonProperty(JSON_PROPERTY_DETALJERTE_LENKER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDetaljerteLenker(@jakarta.annotation.Nonnull Boolean detaljerteLenker) {
    this.detaljerteLenker = detaljerteLenker;
  }

  public FinnRuteParameters kortform(@jakarta.annotation.Nonnull Boolean kortform) {
    
    this.kortform = kortform;
    return this;
  }

  /**
   * Get kortform
   * @return kortform
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_KORTFORM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getKortform() {
    return kortform;
  }


  @JsonProperty(JSON_PROPERTY_KORTFORM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKortform(@jakarta.annotation.Nonnull Boolean kortform) {
    this.kortform = kortform;
  }

  public FinnRuteParameters vegsystemreferanse(@jakarta.annotation.Nullable Set<String> vegsystemreferanse) {
    
    this.vegsystemreferanse = vegsystemreferanse;
    return this;
  }

  public FinnRuteParameters addVegsystemreferanseItem(String vegsystemreferanseItem) {
    if (this.vegsystemreferanse == null) {
      this.vegsystemreferanse = new LinkedHashSet<>();
    }
    this.vegsystemreferanse.add(vegsystemreferanseItem);
    return this;
  }

  /**
   * Get vegsystemreferanse
   * @return vegsystemreferanse
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VEGSYSTEMREFERANSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<String> getVegsystemreferanse() {
    return vegsystemreferanse;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_VEGSYSTEMREFERANSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVegsystemreferanse(@jakarta.annotation.Nullable Set<String> vegsystemreferanse) {
    this.vegsystemreferanse = vegsystemreferanse;
  }

  public FinnRuteParameters trafikantgruppe(@jakarta.annotation.Nullable Trafikantgruppe trafikantgruppe) {
    
    this.trafikantgruppe = trafikantgruppe;
    return this;
  }

  /**
   * Get trafikantgruppe
   * @return trafikantgruppe
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRAFIKANTGRUPPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Trafikantgruppe getTrafikantgruppe() {
    return trafikantgruppe;
  }


  @JsonProperty(JSON_PROPERTY_TRAFIKANTGRUPPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrafikantgruppe(@jakarta.annotation.Nullable Trafikantgruppe trafikantgruppe) {
    this.trafikantgruppe = trafikantgruppe;
  }

  public FinnRuteParameters beholdTrafikantgruppe(@jakarta.annotation.Nonnull Boolean beholdTrafikantgruppe) {
    
    this.beholdTrafikantgruppe = beholdTrafikantgruppe;
    return this;
  }

  /**
   * Get beholdTrafikantgruppe
   * @return beholdTrafikantgruppe
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BEHOLD_TRAFIKANTGRUPPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getBeholdTrafikantgruppe() {
    return beholdTrafikantgruppe;
  }


  @JsonProperty(JSON_PROPERTY_BEHOLD_TRAFIKANTGRUPPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBeholdTrafikantgruppe(@jakarta.annotation.Nonnull Boolean beholdTrafikantgruppe) {
    this.beholdTrafikantgruppe = beholdTrafikantgruppe;
  }

  public FinnRuteParameters typeveg(@jakarta.annotation.Nullable Set<TypeVeg> typeveg) {
    
    this.typeveg = typeveg;
    return this;
  }

  public FinnRuteParameters addTypevegItem(TypeVeg typevegItem) {
    if (this.typeveg == null) {
      this.typeveg = new LinkedHashSet<>();
    }
    this.typeveg.add(typevegItem);
    return this;
  }

  /**
   * Get typeveg
   * @return typeveg
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPEVEG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<TypeVeg> getTypeveg() {
    return typeveg;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_TYPEVEG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypeveg(@jakarta.annotation.Nullable Set<TypeVeg> typeveg) {
    this.typeveg = typeveg;
  }

  public FinnRuteParameters tidspunkt(@jakarta.annotation.Nullable LocalDate tidspunkt) {
    
    this.tidspunkt = tidspunkt;
    return this;
  }

  /**
   * Get tidspunkt
   * @return tidspunkt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIDSPUNKT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getTidspunkt() {
    return tidspunkt;
  }


  @JsonProperty(JSON_PROPERTY_TIDSPUNKT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTidspunkt(@jakarta.annotation.Nullable LocalDate tidspunkt) {
    this.tidspunkt = tidspunkt;
  }

  public FinnRuteParameters srid(@jakarta.annotation.Nullable SridParameter srid) {
    
    this.srid = srid;
    return this;
  }

  /**
   * Get srid
   * @return srid
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SRID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SridParameter getSrid() {
    return srid;
  }


  @JsonProperty(JSON_PROPERTY_SRID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSrid(@jakarta.annotation.Nullable SridParameter srid) {
    this.srid = srid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinnRuteParameters finnRuteParameters = (FinnRuteParameters) o;
    return Objects.equals(this.start, finnRuteParameters.start) &&
        Objects.equals(this.slutt, finnRuteParameters.slutt) &&
        Objects.equals(this.geometri, finnRuteParameters.geometri) &&
        Objects.equals(this.maksAvstand, finnRuteParameters.maksAvstand) &&
        Objects.equals(this.omkrets, finnRuteParameters.omkrets) &&
        Objects.equals(this.konnekteringslenker, finnRuteParameters.konnekteringslenker) &&
        Objects.equals(this.detaljerteLenker, finnRuteParameters.detaljerteLenker) &&
        Objects.equals(this.kortform, finnRuteParameters.kortform) &&
        Objects.equals(this.vegsystemreferanse, finnRuteParameters.vegsystemreferanse) &&
        Objects.equals(this.trafikantgruppe, finnRuteParameters.trafikantgruppe) &&
        Objects.equals(this.beholdTrafikantgruppe, finnRuteParameters.beholdTrafikantgruppe) &&
        Objects.equals(this.typeveg, finnRuteParameters.typeveg) &&
        Objects.equals(this.tidspunkt, finnRuteParameters.tidspunkt) &&
        Objects.equals(this.srid, finnRuteParameters.srid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, slutt, geometri, maksAvstand, omkrets, konnekteringslenker, detaljerteLenker, kortform, vegsystemreferanse, trafikantgruppe, beholdTrafikantgruppe, typeveg, tidspunkt, srid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinnRuteParameters {\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    slutt: ").append(toIndentedString(slutt)).append("\n");
    sb.append("    geometri: ").append(toIndentedString(geometri)).append("\n");
    sb.append("    maksAvstand: ").append(toIndentedString(maksAvstand)).append("\n");
    sb.append("    omkrets: ").append(toIndentedString(omkrets)).append("\n");
    sb.append("    konnekteringslenker: ").append(toIndentedString(konnekteringslenker)).append("\n");
    sb.append("    detaljerteLenker: ").append(toIndentedString(detaljerteLenker)).append("\n");
    sb.append("    kortform: ").append(toIndentedString(kortform)).append("\n");
    sb.append("    vegsystemreferanse: ").append(toIndentedString(vegsystemreferanse)).append("\n");
    sb.append("    trafikantgruppe: ").append(toIndentedString(trafikantgruppe)).append("\n");
    sb.append("    beholdTrafikantgruppe: ").append(toIndentedString(beholdTrafikantgruppe)).append("\n");
    sb.append("    typeveg: ").append(toIndentedString(typeveg)).append("\n");
    sb.append("    tidspunkt: ").append(toIndentedString(tidspunkt)).append("\n");
    sb.append("    srid: ").append(toIndentedString(srid)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


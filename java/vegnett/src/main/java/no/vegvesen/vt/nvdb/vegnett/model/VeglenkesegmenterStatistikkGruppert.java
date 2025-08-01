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
import no.vegvesen.vt.nvdb.vegnett.model.Vegkategori;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * VeglenkesegmenterStatistikkGruppert
 */
@JsonPropertyOrder({
  VeglenkesegmenterStatistikkGruppert.JSON_PROPERTY_ANTALL,
  VeglenkesegmenterStatistikkGruppert.JSON_PROPERTY_FYLKE,
  VeglenkesegmenterStatistikkGruppert.JSON_PROPERTY_VEGKATEGORI
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public class VeglenkesegmenterStatistikkGruppert {
  public static final String JSON_PROPERTY_ANTALL = "antall";
  @jakarta.annotation.Nonnull
  private Integer antall;

  public static final String JSON_PROPERTY_FYLKE = "fylke";
  @jakarta.annotation.Nullable
  private Integer fylke;

  public static final String JSON_PROPERTY_VEGKATEGORI = "vegkategori";
  @jakarta.annotation.Nullable
  private Vegkategori vegkategori;

  public VeglenkesegmenterStatistikkGruppert() {
  }

  public VeglenkesegmenterStatistikkGruppert antall(@jakarta.annotation.Nonnull Integer antall) {
    
    this.antall = antall;
    return this;
  }

  /**
   * Antallet veglenkesegmenter i gruppen
   * @return antall
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ANTALL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getAntall() {
    return antall;
  }


  @JsonProperty(JSON_PROPERTY_ANTALL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAntall(@jakarta.annotation.Nonnull Integer antall) {
    this.antall = antall;
  }

  public VeglenkesegmenterStatistikkGruppert fylke(@jakarta.annotation.Nullable Integer fylke) {
    
    this.fylke = fylke;
    return this;
  }

  /**
   * Hvilket fylke gruppen tilhører. Utelatt hvis ikke gruppert på fylke
   * @return fylke
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FYLKE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFylke() {
    return fylke;
  }


  @JsonProperty(JSON_PROPERTY_FYLKE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFylke(@jakarta.annotation.Nullable Integer fylke) {
    this.fylke = fylke;
  }

  public VeglenkesegmenterStatistikkGruppert vegkategori(@jakarta.annotation.Nullable Vegkategori vegkategori) {
    
    this.vegkategori = vegkategori;
    return this;
  }

  /**
   * Hvilken vegkategori gruppen tilhører. Utelatt hvis ikke gruppert på vegkategori
   * @return vegkategori
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VEGKATEGORI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Vegkategori getVegkategori() {
    return vegkategori;
  }


  @JsonProperty(JSON_PROPERTY_VEGKATEGORI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVegkategori(@jakarta.annotation.Nullable Vegkategori vegkategori) {
    this.vegkategori = vegkategori;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VeglenkesegmenterStatistikkGruppert veglenkesegmenterStatistikkGruppert = (VeglenkesegmenterStatistikkGruppert) o;
    return Objects.equals(this.antall, veglenkesegmenterStatistikkGruppert.antall) &&
        Objects.equals(this.fylke, veglenkesegmenterStatistikkGruppert.fylke) &&
        Objects.equals(this.vegkategori, veglenkesegmenterStatistikkGruppert.vegkategori);
  }

  @Override
  public int hashCode() {
    return Objects.hash(antall, fylke, vegkategori);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VeglenkesegmenterStatistikkGruppert {\n");
    sb.append("    antall: ").append(toIndentedString(antall)).append("\n");
    sb.append("    fylke: ").append(toIndentedString(fylke)).append("\n");
    sb.append("    vegkategori: ").append(toIndentedString(vegkategori)).append("\n");
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


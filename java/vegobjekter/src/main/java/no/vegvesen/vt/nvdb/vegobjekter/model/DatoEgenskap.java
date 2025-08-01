/*
 * NVDB API Les Vegobjekter
 * Dette API-et brukes til å lese vegobjekter. Les mer om bruk av API-et på https://nvdb.atlas.vegvesen.no/produkter/nvdbapil/v4/Vegobjekter
 *
 * The version of the OpenAPI document: v4
 * Contact: nvdb@vegvesen.no
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package no.vegvesen.vt.nvdb.vegobjekter.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import no.vegvesen.vt.nvdb.vegobjekter.model.Egenskap;
import no.vegvesen.vt.nvdb.vegobjekter.model.Egenskapstype;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * DatoEgenskap
 */
@JsonPropertyOrder({
  DatoEgenskap.JSON_PROPERTY_VERDI
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
@JsonIgnoreProperties(
  value = "egenskapstype", // ignore manually set egenskapstype, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the egenskapstype to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "egenskapstype", visible = true)

public class DatoEgenskap extends Egenskap {
  public static final String JSON_PROPERTY_VERDI = "verdi";
  @jakarta.annotation.Nullable
  private LocalDate verdi;

  public DatoEgenskap() {

  }

  public DatoEgenskap verdi(@jakarta.annotation.Nullable LocalDate verdi) {
    
    this.verdi = verdi;
    return this;
  }

  /**
   * Get verdi
   * @return verdi
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERDI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getVerdi() {
    return verdi;
  }


  @JsonProperty(JSON_PROPERTY_VERDI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVerdi(@jakarta.annotation.Nullable LocalDate verdi) {
    this.verdi = verdi;
  }


  @Override
  public DatoEgenskap id(@jakarta.annotation.Nonnull Integer id) {
    this.setId(id);
    return this;
  }

  @Override
  public DatoEgenskap navn(@jakarta.annotation.Nonnull String navn) {
    this.setNavn(navn);
    return this;
  }

  @Override
  public DatoEgenskap egenskapstype(@jakarta.annotation.Nonnull Egenskapstype egenskapstype) {
    this.setEgenskapstype(egenskapstype);
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
    DatoEgenskap datoEgenskap = (DatoEgenskap) o;
    return Objects.equals(this.verdi, datoEgenskap.verdi) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verdi, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatoEgenskap {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    verdi: ").append(toIndentedString(verdi)).append("\n");
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


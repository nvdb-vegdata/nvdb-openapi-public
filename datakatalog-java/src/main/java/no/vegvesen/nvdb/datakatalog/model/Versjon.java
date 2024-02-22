/*
 * NVDB Datakatalog API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package no.vegvesen.nvdb.datakatalog.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Versjon
 */
@JsonPropertyOrder({
  Versjon.JSON_PROPERTY_ID,
  Versjon.JSON_PROPERTY_DATO,
  Versjon.JSON_PROPERTY_VERSJON
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-22T10:07:12.572828+01:00[Europe/Oslo]")
public class Versjon {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_DATO = "dato";
  private LocalDate dato;

  public static final String JSON_PROPERTY_VERSJON = "versjon";
  private String versjon;

  public Versjon() {
  }

  public Versjon id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(Integer id) {
    this.id = id;
  }


  public Versjon dato(LocalDate dato) {
    
    this.dato = dato;
    return this;
  }

   /**
   * Get dato
   * @return dato
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocalDate getDato() {
    return dato;
  }


  @JsonProperty(JSON_PROPERTY_DATO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDato(LocalDate dato) {
    this.dato = dato;
  }


  public Versjon versjon(String versjon) {
    
    this.versjon = versjon;
    return this;
  }

   /**
   * Get versjon
   * @return versjon
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VERSJON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getVersjon() {
    return versjon;
  }


  @JsonProperty(JSON_PROPERTY_VERSJON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVersjon(String versjon) {
    this.versjon = versjon;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Versjon versjon = (Versjon) o;
    return Objects.equals(this.id, versjon.id) &&
        Objects.equals(this.dato, versjon.dato) &&
        Objects.equals(this.versjon, versjon.versjon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dato, versjon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Versjon {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dato: ").append(toIndentedString(dato)).append("\n");
    sb.append("    versjon: ").append(toIndentedString(versjon)).append("\n");
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

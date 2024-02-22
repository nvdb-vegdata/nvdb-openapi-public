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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Enhet
 */
@JsonPropertyOrder({
  Enhet.JSON_PROPERTY_ID,
  Enhet.JSON_PROPERTY_NAVN,
  Enhet.JSON_PROPERTY_KORTNAVN
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-22T10:07:12.572828+01:00[Europe/Oslo]")
public class Enhet {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_NAVN = "navn";
  private String navn;

  public static final String JSON_PROPERTY_KORTNAVN = "kortnavn";
  private String kortnavn;

  public Enhet() {
  }

  public Enhet id(Integer id) {
    
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


  public Enhet navn(String navn) {
    
    this.navn = navn;
    return this;
  }

   /**
   * Get navn
   * @return navn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAVN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNavn() {
    return navn;
  }


  @JsonProperty(JSON_PROPERTY_NAVN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNavn(String navn) {
    this.navn = navn;
  }


  public Enhet kortnavn(String kortnavn) {
    
    this.kortnavn = kortnavn;
    return this;
  }

   /**
   * Get kortnavn
   * @return kortnavn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KORTNAVN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKortnavn() {
    return kortnavn;
  }


  @JsonProperty(JSON_PROPERTY_KORTNAVN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKortnavn(String kortnavn) {
    this.kortnavn = kortnavn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Enhet enhet = (Enhet) o;
    return Objects.equals(this.id, enhet.id) &&
        Objects.equals(this.navn, enhet.navn) &&
        Objects.equals(this.kortnavn, enhet.kortnavn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, navn, kortnavn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Enhet {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    navn: ").append(toIndentedString(navn)).append("\n");
    sb.append("    kortnavn: ").append(toIndentedString(kortnavn)).append("\n");
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


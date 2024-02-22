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
 * Kategori
 */
@JsonPropertyOrder({
  Kategori.JSON_PROPERTY_ID,
  Kategori.JSON_PROPERTY_NAVN,
  Kategori.JSON_PROPERTY_KORTNAVN,
  Kategori.JSON_PROPERTY_SORTERINGSNUMMER,
  Kategori.JSON_PROPERTY_BESKRIVELSE,
  Kategori.JSON_PROPERTY_START_DATO
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-22T10:07:12.572828+01:00[Europe/Oslo]")
public class Kategori {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_NAVN = "navn";
  private String navn;

  public static final String JSON_PROPERTY_KORTNAVN = "kortnavn";
  private String kortnavn;

  public static final String JSON_PROPERTY_SORTERINGSNUMMER = "sorteringsnummer";
  private Integer sorteringsnummer;

  public static final String JSON_PROPERTY_BESKRIVELSE = "beskrivelse";
  private String beskrivelse;

  public static final String JSON_PROPERTY_START_DATO = "startDato";
  private LocalDate startDato;

  public Kategori() {
  }

  public Kategori id(Integer id) {
    
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


  public Kategori navn(String navn) {
    
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


  public Kategori kortnavn(String kortnavn) {
    
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


  public Kategori sorteringsnummer(Integer sorteringsnummer) {
    
    this.sorteringsnummer = sorteringsnummer;
    return this;
  }

   /**
   * Get sorteringsnummer
   * @return sorteringsnummer
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SORTERINGSNUMMER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getSorteringsnummer() {
    return sorteringsnummer;
  }


  @JsonProperty(JSON_PROPERTY_SORTERINGSNUMMER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSorteringsnummer(Integer sorteringsnummer) {
    this.sorteringsnummer = sorteringsnummer;
  }


  public Kategori beskrivelse(String beskrivelse) {
    
    this.beskrivelse = beskrivelse;
    return this;
  }

   /**
   * Get beskrivelse
   * @return beskrivelse
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BESKRIVELSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBeskrivelse() {
    return beskrivelse;
  }


  @JsonProperty(JSON_PROPERTY_BESKRIVELSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBeskrivelse(String beskrivelse) {
    this.beskrivelse = beskrivelse;
  }


  public Kategori startDato(LocalDate startDato) {
    
    this.startDato = startDato;
    return this;
  }

   /**
   * Get startDato
   * @return startDato
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_DATO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getStartDato() {
    return startDato;
  }


  @JsonProperty(JSON_PROPERTY_START_DATO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDato(LocalDate startDato) {
    this.startDato = startDato;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Kategori kategori = (Kategori) o;
    return Objects.equals(this.id, kategori.id) &&
        Objects.equals(this.navn, kategori.navn) &&
        Objects.equals(this.kortnavn, kategori.kortnavn) &&
        Objects.equals(this.sorteringsnummer, kategori.sorteringsnummer) &&
        Objects.equals(this.beskrivelse, kategori.beskrivelse) &&
        Objects.equals(this.startDato, kategori.startDato);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, navn, kortnavn, sorteringsnummer, beskrivelse, startDato);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Kategori {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    navn: ").append(toIndentedString(navn)).append("\n");
    sb.append("    kortnavn: ").append(toIndentedString(kortnavn)).append("\n");
    sb.append("    sorteringsnummer: ").append(toIndentedString(sorteringsnummer)).append("\n");
    sb.append("    beskrivelse: ").append(toIndentedString(beskrivelse)).append("\n");
    sb.append("    startDato: ").append(toIndentedString(startDato)).append("\n");
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


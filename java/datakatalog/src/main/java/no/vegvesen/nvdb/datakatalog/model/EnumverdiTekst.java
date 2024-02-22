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
 * EnumverdiTekst
 */
@JsonPropertyOrder({
  EnumverdiTekst.JSON_PROPERTY_ID,
  EnumverdiTekst.JSON_PROPERTY_KORTNAVN,
  EnumverdiTekst.JSON_PROPERTY_KORTNAVNLENGDE,
  EnumverdiTekst.JSON_PROPERTY_KORTNAVN_BRUKBAR,
  EnumverdiTekst.JSON_PROPERTY_BESKRIVELSE,
  EnumverdiTekst.JSON_PROPERTY_SORTERINGSNUMMER,
  EnumverdiTekst.JSON_PROPERTY_OBJEKTLISTE_DATO,
  EnumverdiTekst.JSON_PROPERTY_SLUTTDATO,
  EnumverdiTekst.JSON_PROPERTY_STANDARDVERDI,
  EnumverdiTekst.JSON_PROPERTY_KOMPLEMENTæR_ENUMVERDI,
  EnumverdiTekst.JSON_PROPERTY_VERDI,
  EnumverdiTekst.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EnumverdiTekst {
  public static final String JSON_PROPERTY_ID = "id";
  private Integer id;

  public static final String JSON_PROPERTY_KORTNAVN = "kortnavn";
  private String kortnavn;

  public static final String JSON_PROPERTY_KORTNAVNLENGDE = "kortnavnlengde";
  private Integer kortnavnlengde;

  public static final String JSON_PROPERTY_KORTNAVN_BRUKBAR = "kortnavn_brukbar";
  private Boolean kortnavnBrukbar;

  public static final String JSON_PROPERTY_BESKRIVELSE = "beskrivelse";
  private String beskrivelse;

  public static final String JSON_PROPERTY_SORTERINGSNUMMER = "sorteringsnummer";
  private Integer sorteringsnummer;

  public static final String JSON_PROPERTY_OBJEKTLISTE_DATO = "objektliste_dato";
  private LocalDate objektlisteDato;

  public static final String JSON_PROPERTY_SLUTTDATO = "sluttdato";
  private LocalDate sluttdato;

  public static final String JSON_PROPERTY_STANDARDVERDI = "standardverdi";
  private Boolean standardverdi;

  public static final String JSON_PROPERTY_KOMPLEMENTæR_ENUMVERDI = "komplementær_enumverdi";
  private Integer komplementærEnumverdi;

  public static final String JSON_PROPERTY_VERDI = "verdi";
  private String verdi;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public EnumverdiTekst() {
  }

  public EnumverdiTekst id(Integer id) {
    
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


  public EnumverdiTekst kortnavn(String kortnavn) {
    
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


  public EnumverdiTekst kortnavnlengde(Integer kortnavnlengde) {
    
    this.kortnavnlengde = kortnavnlengde;
    return this;
  }

   /**
   * Get kortnavnlengde
   * @return kortnavnlengde
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KORTNAVNLENGDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getKortnavnlengde() {
    return kortnavnlengde;
  }


  @JsonProperty(JSON_PROPERTY_KORTNAVNLENGDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKortnavnlengde(Integer kortnavnlengde) {
    this.kortnavnlengde = kortnavnlengde;
  }


  public EnumverdiTekst kortnavnBrukbar(Boolean kortnavnBrukbar) {
    
    this.kortnavnBrukbar = kortnavnBrukbar;
    return this;
  }

   /**
   * Get kortnavnBrukbar
   * @return kortnavnBrukbar
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_KORTNAVN_BRUKBAR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getKortnavnBrukbar() {
    return kortnavnBrukbar;
  }


  @JsonProperty(JSON_PROPERTY_KORTNAVN_BRUKBAR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKortnavnBrukbar(Boolean kortnavnBrukbar) {
    this.kortnavnBrukbar = kortnavnBrukbar;
  }


  public EnumverdiTekst beskrivelse(String beskrivelse) {
    
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


  public EnumverdiTekst sorteringsnummer(Integer sorteringsnummer) {
    
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


  public EnumverdiTekst objektlisteDato(LocalDate objektlisteDato) {
    
    this.objektlisteDato = objektlisteDato;
    return this;
  }

   /**
   * Get objektlisteDato
   * @return objektlisteDato
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OBJEKTLISTE_DATO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getObjektlisteDato() {
    return objektlisteDato;
  }


  @JsonProperty(JSON_PROPERTY_OBJEKTLISTE_DATO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setObjektlisteDato(LocalDate objektlisteDato) {
    this.objektlisteDato = objektlisteDato;
  }


  public EnumverdiTekst sluttdato(LocalDate sluttdato) {
    
    this.sluttdato = sluttdato;
    return this;
  }

   /**
   * Get sluttdato
   * @return sluttdato
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SLUTTDATO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getSluttdato() {
    return sluttdato;
  }


  @JsonProperty(JSON_PROPERTY_SLUTTDATO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSluttdato(LocalDate sluttdato) {
    this.sluttdato = sluttdato;
  }


  public EnumverdiTekst standardverdi(Boolean standardverdi) {
    
    this.standardverdi = standardverdi;
    return this;
  }

   /**
   * Get standardverdi
   * @return standardverdi
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STANDARDVERDI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getStandardverdi() {
    return standardverdi;
  }


  @JsonProperty(JSON_PROPERTY_STANDARDVERDI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStandardverdi(Boolean standardverdi) {
    this.standardverdi = standardverdi;
  }


  public EnumverdiTekst komplementærEnumverdi(Integer komplementærEnumverdi) {
    
    this.komplementærEnumverdi = komplementærEnumverdi;
    return this;
  }

   /**
   * Get komplementærEnumverdi
   * @return komplementærEnumverdi
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KOMPLEMENTæR_ENUMVERDI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getKomplementærEnumverdi() {
    return komplementærEnumverdi;
  }


  @JsonProperty(JSON_PROPERTY_KOMPLEMENTæR_ENUMVERDI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKomplementærEnumverdi(Integer komplementærEnumverdi) {
    this.komplementærEnumverdi = komplementærEnumverdi;
  }


  public EnumverdiTekst verdi(String verdi) {
    
    this.verdi = verdi;
    return this;
  }

   /**
   * Get verdi
   * @return verdi
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERDI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVerdi() {
    return verdi;
  }


  @JsonProperty(JSON_PROPERTY_VERDI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVerdi(String verdi) {
    this.verdi = verdi;
  }


  public EnumverdiTekst type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnumverdiTekst enumverdiTekst = (EnumverdiTekst) o;
    return Objects.equals(this.id, enumverdiTekst.id) &&
        Objects.equals(this.kortnavn, enumverdiTekst.kortnavn) &&
        Objects.equals(this.kortnavnlengde, enumverdiTekst.kortnavnlengde) &&
        Objects.equals(this.kortnavnBrukbar, enumverdiTekst.kortnavnBrukbar) &&
        Objects.equals(this.beskrivelse, enumverdiTekst.beskrivelse) &&
        Objects.equals(this.sorteringsnummer, enumverdiTekst.sorteringsnummer) &&
        Objects.equals(this.objektlisteDato, enumverdiTekst.objektlisteDato) &&
        Objects.equals(this.sluttdato, enumverdiTekst.sluttdato) &&
        Objects.equals(this.standardverdi, enumverdiTekst.standardverdi) &&
        Objects.equals(this.komplementærEnumverdi, enumverdiTekst.komplementærEnumverdi) &&
        Objects.equals(this.verdi, enumverdiTekst.verdi) &&
        Objects.equals(this.type, enumverdiTekst.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, kortnavn, kortnavnlengde, kortnavnBrukbar, beskrivelse, sorteringsnummer, objektlisteDato, sluttdato, standardverdi, komplementærEnumverdi, verdi, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnumverdiTekst {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kortnavn: ").append(toIndentedString(kortnavn)).append("\n");
    sb.append("    kortnavnlengde: ").append(toIndentedString(kortnavnlengde)).append("\n");
    sb.append("    kortnavnBrukbar: ").append(toIndentedString(kortnavnBrukbar)).append("\n");
    sb.append("    beskrivelse: ").append(toIndentedString(beskrivelse)).append("\n");
    sb.append("    sorteringsnummer: ").append(toIndentedString(sorteringsnummer)).append("\n");
    sb.append("    objektlisteDato: ").append(toIndentedString(objektlisteDato)).append("\n");
    sb.append("    sluttdato: ").append(toIndentedString(sluttdato)).append("\n");
    sb.append("    standardverdi: ").append(toIndentedString(standardverdi)).append("\n");
    sb.append("    komplementærEnumverdi: ").append(toIndentedString(komplementærEnumverdi)).append("\n");
    sb.append("    verdi: ").append(toIndentedString(verdi)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


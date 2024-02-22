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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import no.vegvesen.nvdb.datakatalog.model.Egenskapstype;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * EgenskapstypeListe
 */
@JsonPropertyOrder({
  EgenskapstypeListe.JSON_PROPERTY_MAKSIMALT_ANTALL_VERDIER,
  EgenskapstypeListe.JSON_PROPERTY_MINIMALT_ANTALL_VERDIER,
  EgenskapstypeListe.JSON_PROPERTY_INNHOLD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonIgnoreProperties(
  value = "egenskapstype", // ignore manually set egenskapstype, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the egenskapstype to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "egenskapstype", visible = true)

public class EgenskapstypeListe extends Egenskapstype {
  public static final String JSON_PROPERTY_MAKSIMALT_ANTALL_VERDIER = "maksimalt_antall_verdier";
  private Integer maksimaltAntallVerdier;

  public static final String JSON_PROPERTY_MINIMALT_ANTALL_VERDIER = "minimalt_antall_verdier";
  private Integer minimaltAntallVerdier;

  public static final String JSON_PROPERTY_INNHOLD = "innhold";
  private Egenskapstype innhold;

  public EgenskapstypeListe() {

  }

  public EgenskapstypeListe maksimaltAntallVerdier(Integer maksimaltAntallVerdier) {
    
    this.maksimaltAntallVerdier = maksimaltAntallVerdier;
    return this;
  }

   /**
   * Get maksimaltAntallVerdier
   * @return maksimaltAntallVerdier
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAKSIMALT_ANTALL_VERDIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaksimaltAntallVerdier() {
    return maksimaltAntallVerdier;
  }


  @JsonProperty(JSON_PROPERTY_MAKSIMALT_ANTALL_VERDIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaksimaltAntallVerdier(Integer maksimaltAntallVerdier) {
    this.maksimaltAntallVerdier = maksimaltAntallVerdier;
  }


  public EgenskapstypeListe minimaltAntallVerdier(Integer minimaltAntallVerdier) {
    
    this.minimaltAntallVerdier = minimaltAntallVerdier;
    return this;
  }

   /**
   * Get minimaltAntallVerdier
   * @return minimaltAntallVerdier
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MINIMALT_ANTALL_VERDIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMinimaltAntallVerdier() {
    return minimaltAntallVerdier;
  }


  @JsonProperty(JSON_PROPERTY_MINIMALT_ANTALL_VERDIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinimaltAntallVerdier(Integer minimaltAntallVerdier) {
    this.minimaltAntallVerdier = minimaltAntallVerdier;
  }


  public EgenskapstypeListe innhold(Egenskapstype innhold) {
    
    this.innhold = innhold;
    return this;
  }

   /**
   * Get innhold
   * @return innhold
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INNHOLD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Egenskapstype getInnhold() {
    return innhold;
  }


  @JsonProperty(JSON_PROPERTY_INNHOLD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInnhold(Egenskapstype innhold) {
    this.innhold = innhold;
  }

  @Override
  public EgenskapstypeListe id(Integer id) {
    this.setId(id);
    return this;
  }

  @Override
  public EgenskapstypeListe kortnavn(String kortnavn) {
    this.setKortnavn(kortnavn);
    return this;
  }

  @Override
  public EgenskapstypeListe beskrivelse(String beskrivelse) {
    this.setBeskrivelse(beskrivelse);
    return this;
  }

  @Override
  public EgenskapstypeListe sosinavn(String sosinavn) {
    this.setSosinavn(sosinavn);
    return this;
  }

  @Override
  public EgenskapstypeListe sosinvdbnavn(String sosinvdbnavn) {
    this.setSosinvdbnavn(sosinvdbnavn);
    return this;
  }

  @Override
  public EgenskapstypeListe sorteringsnummer(Integer sorteringsnummer) {
    this.setSorteringsnummer(sorteringsnummer);
    return this;
  }

  @Override
  public EgenskapstypeListe avledet(Boolean avledet) {
    this.setAvledet(avledet);
    return this;
  }

  @Override
  public EgenskapstypeListe komplementærEgenskapstype(Integer komplementærEgenskapstype) {
    this.setKomplementærEgenskapstype(komplementærEgenskapstype);
    return this;
  }

  @Override
  public EgenskapstypeListe navn(String navn) {
    this.setNavn(navn);
    return this;
  }

  @Override
  public EgenskapstypeListe egenskapstype(EgenskapstypeEnum egenskapstype) {
    this.setEgenskapstype(egenskapstype);
    return this;
  }

  @Override
  public EgenskapstypeListe obligatoriskVerdi(Boolean obligatoriskVerdi) {
    this.setObligatoriskVerdi(obligatoriskVerdi);
    return this;
  }

  @Override
  public EgenskapstypeListe skrivebeskyttet(Boolean skrivebeskyttet) {
    this.setSkrivebeskyttet(skrivebeskyttet);
    return this;
  }

  @Override
  public EgenskapstypeListe sensitivitet(Integer sensitivitet) {
    this.setSensitivitet(sensitivitet);
    return this;
  }

  @Override
  public EgenskapstypeListe gruppesorteringsnummer(Integer gruppesorteringsnummer) {
    this.setGruppesorteringsnummer(gruppesorteringsnummer);
    return this;
  }

  @Override
  public EgenskapstypeListe veiledning(String veiledning) {
    this.setVeiledning(veiledning);
    return this;
  }

  @Override
  public EgenskapstypeListe grunnrissreferanse(String grunnrissreferanse) {
    this.setGrunnrissreferanse(grunnrissreferanse);
    return this;
  }

  @Override
  public EgenskapstypeListe høydereferanse(String høydereferanse) {
    this.setHøydereferanse(høydereferanse);
    return this;
  }

  @Override
  public EgenskapstypeListe høydereferanseTall(Integer høydereferanseTall) {
    this.setHøydereferanseTall(høydereferanseTall);
    return this;
  }

  @Override
  public EgenskapstypeListe nøyaktighetskravGrunnriss(Double nøyaktighetskravGrunnriss) {
    this.setNøyaktighetskravGrunnriss(nøyaktighetskravGrunnriss);
    return this;
  }

  @Override
  public EgenskapstypeListe nøyaktighetskravHøyde(Double nøyaktighetskravHøyde) {
    this.setNøyaktighetskravHøyde(nøyaktighetskravHøyde);
    return this;
  }

  @Override
  public EgenskapstypeListe sosiReferanse(String sosiReferanse) {
    this.setSosiReferanse(sosiReferanse);
    return this;
  }

  @Override
  public EgenskapstypeListe referansegeometriTilstrekkelig(Boolean referansegeometriTilstrekkelig) {
    this.setReferansegeometriTilstrekkelig(referansegeometriTilstrekkelig);
    return this;
  }

  @Override
  public EgenskapstypeListe viktighet(ViktighetEnum viktighet) {
    this.setViktighet(viktighet);
    return this;
  }

  @Override
  public EgenskapstypeListe kategori(Integer kategori) {
    this.setKategori(kategori);
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
    EgenskapstypeListe egenskapstypeListe = (EgenskapstypeListe) o;
    return Objects.equals(this.maksimaltAntallVerdier, egenskapstypeListe.maksimaltAntallVerdier) &&
        Objects.equals(this.minimaltAntallVerdier, egenskapstypeListe.minimaltAntallVerdier) &&
        Objects.equals(this.innhold, egenskapstypeListe.innhold) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maksimaltAntallVerdier, minimaltAntallVerdier, innhold, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EgenskapstypeListe {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    maksimaltAntallVerdier: ").append(toIndentedString(maksimaltAntallVerdier)).append("\n");
    sb.append("    minimaltAntallVerdier: ").append(toIndentedString(minimaltAntallVerdier)).append("\n");
    sb.append("    innhold: ").append(toIndentedString(innhold)).append("\n");
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


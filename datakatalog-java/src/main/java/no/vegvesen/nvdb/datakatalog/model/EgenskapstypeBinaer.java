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
import java.time.LocalDate;
import no.vegvesen.nvdb.datakatalog.model.Egenskapstype;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * EgenskapstypeBinaer
 */
@JsonPropertyOrder({
  EgenskapstypeBinaer.JSON_PROPERTY_OBJEKTLISTE_DATO,
  EgenskapstypeBinaer.JSON_PROPERTY_SLUTT_DATO,
  EgenskapstypeBinaer.JSON_PROPERTY_LENGDEAVHENGIG_VERDI,
  EgenskapstypeBinaer.JSON_PROPERTY_AJOURHOLD_SNU,
  EgenskapstypeBinaer.JSON_PROPERTY_MEDIATYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-22T10:07:12.572828+01:00[Europe/Oslo]")
@JsonIgnoreProperties(
  value = "egenskapstype", // ignore manually set egenskapstype, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the egenskapstype to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "egenskapstype", visible = true)

public class EgenskapstypeBinaer extends Egenskapstype {
  public static final String JSON_PROPERTY_OBJEKTLISTE_DATO = "objektliste_dato";
  private LocalDate objektlisteDato;

  public static final String JSON_PROPERTY_SLUTT_DATO = "slutt_dato";
  private LocalDate sluttDato;

  public static final String JSON_PROPERTY_LENGDEAVHENGIG_VERDI = "lengdeavhengig_verdi";
  private Boolean lengdeavhengigVerdi;

  public static final String JSON_PROPERTY_AJOURHOLD_SNU = "ajourhold_snu";
  private Boolean ajourholdSnu;

  /**
   * Gets or Sets mediatype
   */
  public enum MediatypeEnum {
    AUDIO("Audio"),
    
    BILDE("Bilde"),
    
    TEKST("Tekst"),
    
    TSF("TSF"),
    
    VIDEO("Video"),
    
    UDEFINERT("Udefinert");

    private String value;

    MediatypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MediatypeEnum fromValue(String value) {
      for (MediatypeEnum b : MediatypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_MEDIATYPE = "mediatype";
  private MediatypeEnum mediatype;

  public EgenskapstypeBinaer() {

  }

  public EgenskapstypeBinaer objektlisteDato(LocalDate objektlisteDato) {
    
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


  public EgenskapstypeBinaer sluttDato(LocalDate sluttDato) {
    
    this.sluttDato = sluttDato;
    return this;
  }

   /**
   * Get sluttDato
   * @return sluttDato
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SLUTT_DATO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getSluttDato() {
    return sluttDato;
  }


  @JsonProperty(JSON_PROPERTY_SLUTT_DATO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSluttDato(LocalDate sluttDato) {
    this.sluttDato = sluttDato;
  }


  public EgenskapstypeBinaer lengdeavhengigVerdi(Boolean lengdeavhengigVerdi) {
    
    this.lengdeavhengigVerdi = lengdeavhengigVerdi;
    return this;
  }

   /**
   * Get lengdeavhengigVerdi
   * @return lengdeavhengigVerdi
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LENGDEAVHENGIG_VERDI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getLengdeavhengigVerdi() {
    return lengdeavhengigVerdi;
  }


  @JsonProperty(JSON_PROPERTY_LENGDEAVHENGIG_VERDI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLengdeavhengigVerdi(Boolean lengdeavhengigVerdi) {
    this.lengdeavhengigVerdi = lengdeavhengigVerdi;
  }


  public EgenskapstypeBinaer ajourholdSnu(Boolean ajourholdSnu) {
    
    this.ajourholdSnu = ajourholdSnu;
    return this;
  }

   /**
   * Get ajourholdSnu
   * @return ajourholdSnu
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AJOURHOLD_SNU)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getAjourholdSnu() {
    return ajourholdSnu;
  }


  @JsonProperty(JSON_PROPERTY_AJOURHOLD_SNU)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAjourholdSnu(Boolean ajourholdSnu) {
    this.ajourholdSnu = ajourholdSnu;
  }


  public EgenskapstypeBinaer mediatype(MediatypeEnum mediatype) {
    
    this.mediatype = mediatype;
    return this;
  }

   /**
   * Get mediatype
   * @return mediatype
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MEDIATYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public MediatypeEnum getMediatype() {
    return mediatype;
  }


  @JsonProperty(JSON_PROPERTY_MEDIATYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMediatype(MediatypeEnum mediatype) {
    this.mediatype = mediatype;
  }

  @Override
  public EgenskapstypeBinaer id(Integer id) {
    this.setId(id);
    return this;
  }

  @Override
  public EgenskapstypeBinaer kortnavn(String kortnavn) {
    this.setKortnavn(kortnavn);
    return this;
  }

  @Override
  public EgenskapstypeBinaer beskrivelse(String beskrivelse) {
    this.setBeskrivelse(beskrivelse);
    return this;
  }

  @Override
  public EgenskapstypeBinaer sosinavn(String sosinavn) {
    this.setSosinavn(sosinavn);
    return this;
  }

  @Override
  public EgenskapstypeBinaer sosinvdbnavn(String sosinvdbnavn) {
    this.setSosinvdbnavn(sosinvdbnavn);
    return this;
  }

  @Override
  public EgenskapstypeBinaer sorteringsnummer(Integer sorteringsnummer) {
    this.setSorteringsnummer(sorteringsnummer);
    return this;
  }

  @Override
  public EgenskapstypeBinaer avledet(Boolean avledet) {
    this.setAvledet(avledet);
    return this;
  }

  @Override
  public EgenskapstypeBinaer komplementærEgenskapstype(Integer komplementærEgenskapstype) {
    this.setKomplementærEgenskapstype(komplementærEgenskapstype);
    return this;
  }

  @Override
  public EgenskapstypeBinaer navn(String navn) {
    this.setNavn(navn);
    return this;
  }

  @Override
  public EgenskapstypeBinaer egenskapstype(EgenskapstypeEnum egenskapstype) {
    this.setEgenskapstype(egenskapstype);
    return this;
  }

  @Override
  public EgenskapstypeBinaer obligatoriskVerdi(Boolean obligatoriskVerdi) {
    this.setObligatoriskVerdi(obligatoriskVerdi);
    return this;
  }

  @Override
  public EgenskapstypeBinaer skrivebeskyttet(Boolean skrivebeskyttet) {
    this.setSkrivebeskyttet(skrivebeskyttet);
    return this;
  }

  @Override
  public EgenskapstypeBinaer sensitivitet(Integer sensitivitet) {
    this.setSensitivitet(sensitivitet);
    return this;
  }

  @Override
  public EgenskapstypeBinaer gruppesorteringsnummer(Integer gruppesorteringsnummer) {
    this.setGruppesorteringsnummer(gruppesorteringsnummer);
    return this;
  }

  @Override
  public EgenskapstypeBinaer veiledning(String veiledning) {
    this.setVeiledning(veiledning);
    return this;
  }

  @Override
  public EgenskapstypeBinaer grunnrissreferanse(String grunnrissreferanse) {
    this.setGrunnrissreferanse(grunnrissreferanse);
    return this;
  }

  @Override
  public EgenskapstypeBinaer høydereferanse(String høydereferanse) {
    this.setHøydereferanse(høydereferanse);
    return this;
  }

  @Override
  public EgenskapstypeBinaer høydereferanseTall(Integer høydereferanseTall) {
    this.setHøydereferanseTall(høydereferanseTall);
    return this;
  }

  @Override
  public EgenskapstypeBinaer nøyaktighetskravGrunnriss(Double nøyaktighetskravGrunnriss) {
    this.setNøyaktighetskravGrunnriss(nøyaktighetskravGrunnriss);
    return this;
  }

  @Override
  public EgenskapstypeBinaer nøyaktighetskravHøyde(Double nøyaktighetskravHøyde) {
    this.setNøyaktighetskravHøyde(nøyaktighetskravHøyde);
    return this;
  }

  @Override
  public EgenskapstypeBinaer sosiReferanse(String sosiReferanse) {
    this.setSosiReferanse(sosiReferanse);
    return this;
  }

  @Override
  public EgenskapstypeBinaer referansegeometriTilstrekkelig(Boolean referansegeometriTilstrekkelig) {
    this.setReferansegeometriTilstrekkelig(referansegeometriTilstrekkelig);
    return this;
  }

  @Override
  public EgenskapstypeBinaer viktighet(ViktighetEnum viktighet) {
    this.setViktighet(viktighet);
    return this;
  }

  @Override
  public EgenskapstypeBinaer kategori(Integer kategori) {
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
    EgenskapstypeBinaer egenskapstypeBinaer = (EgenskapstypeBinaer) o;
    return Objects.equals(this.objektlisteDato, egenskapstypeBinaer.objektlisteDato) &&
        Objects.equals(this.sluttDato, egenskapstypeBinaer.sluttDato) &&
        Objects.equals(this.lengdeavhengigVerdi, egenskapstypeBinaer.lengdeavhengigVerdi) &&
        Objects.equals(this.ajourholdSnu, egenskapstypeBinaer.ajourholdSnu) &&
        Objects.equals(this.mediatype, egenskapstypeBinaer.mediatype) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objektlisteDato, sluttDato, lengdeavhengigVerdi, ajourholdSnu, mediatype, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EgenskapstypeBinaer {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    objektlisteDato: ").append(toIndentedString(objektlisteDato)).append("\n");
    sb.append("    sluttDato: ").append(toIndentedString(sluttDato)).append("\n");
    sb.append("    lengdeavhengigVerdi: ").append(toIndentedString(lengdeavhengigVerdi)).append("\n");
    sb.append("    ajourholdSnu: ").append(toIndentedString(ajourholdSnu)).append("\n");
    sb.append("    mediatype: ").append(toIndentedString(mediatype)).append("\n");
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


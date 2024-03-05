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
import no.vegvesen.nvdb.datakatalog.model.Enhet;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * EgenskapstypeHeltall
 */
@JsonPropertyOrder({
  EgenskapstypeHeltall.JSON_PROPERTY_OBJEKTLISTE_DATO,
  EgenskapstypeHeltall.JSON_PROPERTY_SLUTT_DATO,
  EgenskapstypeHeltall.JSON_PROPERTY_LENGDEAVHENGIG_VERDI,
  EgenskapstypeHeltall.JSON_PROPERTY_AJOURHOLD_SNU,
  EgenskapstypeHeltall.JSON_PROPERTY_STANDARDVERDI,
  EgenskapstypeHeltall.JSON_PROPERTY_MIN_ANBEFALT,
  EgenskapstypeHeltall.JSON_PROPERTY_MAKS_ANBEFALT,
  EgenskapstypeHeltall.JSON_PROPERTY_MIN,
  EgenskapstypeHeltall.JSON_PROPERTY_MAKS,
  EgenskapstypeHeltall.JSON_PROPERTY_FELTLENGDE,
  EgenskapstypeHeltall.JSON_PROPERTY_FORTEGNSENDRING_SNU,
  EgenskapstypeHeltall.JSON_PROPERTY_ENHET
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonIgnoreProperties(
  value = "egenskapstype", // ignore manually set egenskapstype, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the egenskapstype to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "egenskapstype", visible = true)

public class EgenskapstypeHeltall extends Egenskapstype {
  public static final String JSON_PROPERTY_OBJEKTLISTE_DATO = "objektliste_dato";
  private LocalDate objektlisteDato;

  public static final String JSON_PROPERTY_SLUTT_DATO = "slutt_dato";
  private LocalDate sluttDato;

  public static final String JSON_PROPERTY_LENGDEAVHENGIG_VERDI = "lengdeavhengig_verdi";
  private Boolean lengdeavhengigVerdi;

  public static final String JSON_PROPERTY_AJOURHOLD_SNU = "ajourhold_snu";
  private Boolean ajourholdSnu;

  public static final String JSON_PROPERTY_STANDARDVERDI = "standardverdi";
  private Integer standardverdi;

  public static final String JSON_PROPERTY_MIN_ANBEFALT = "min_anbefalt";
  private Integer minAnbefalt;

  public static final String JSON_PROPERTY_MAKS_ANBEFALT = "maks_anbefalt";
  private Integer maksAnbefalt;

  public static final String JSON_PROPERTY_MIN = "min";
  private Integer min;

  public static final String JSON_PROPERTY_MAKS = "maks";
  private Integer maks;

  public static final String JSON_PROPERTY_FELTLENGDE = "feltlengde";
  private Integer feltlengde;

  public static final String JSON_PROPERTY_FORTEGNSENDRING_SNU = "fortegnsendring_snu";
  private Boolean fortegnsendringSnu;

  public static final String JSON_PROPERTY_ENHET = "enhet";
  private Enhet enhet;

  public EgenskapstypeHeltall() {

  }

  public EgenskapstypeHeltall objektlisteDato(LocalDate objektlisteDato) {
    
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


  public EgenskapstypeHeltall sluttDato(LocalDate sluttDato) {
    
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


  public EgenskapstypeHeltall lengdeavhengigVerdi(Boolean lengdeavhengigVerdi) {
    
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


  public EgenskapstypeHeltall ajourholdSnu(Boolean ajourholdSnu) {
    
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


  public EgenskapstypeHeltall standardverdi(Integer standardverdi) {
    
    this.standardverdi = standardverdi;
    return this;
  }

   /**
   * Get standardverdi
   * @return standardverdi
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STANDARDVERDI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStandardverdi() {
    return standardverdi;
  }


  @JsonProperty(JSON_PROPERTY_STANDARDVERDI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStandardverdi(Integer standardverdi) {
    this.standardverdi = standardverdi;
  }


  public EgenskapstypeHeltall minAnbefalt(Integer minAnbefalt) {
    
    this.minAnbefalt = minAnbefalt;
    return this;
  }

   /**
   * Get minAnbefalt
   * @return minAnbefalt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIN_ANBEFALT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMinAnbefalt() {
    return minAnbefalt;
  }


  @JsonProperty(JSON_PROPERTY_MIN_ANBEFALT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinAnbefalt(Integer minAnbefalt) {
    this.minAnbefalt = minAnbefalt;
  }


  public EgenskapstypeHeltall maksAnbefalt(Integer maksAnbefalt) {
    
    this.maksAnbefalt = maksAnbefalt;
    return this;
  }

   /**
   * Get maksAnbefalt
   * @return maksAnbefalt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAKS_ANBEFALT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaksAnbefalt() {
    return maksAnbefalt;
  }


  @JsonProperty(JSON_PROPERTY_MAKS_ANBEFALT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaksAnbefalt(Integer maksAnbefalt) {
    this.maksAnbefalt = maksAnbefalt;
  }


  public EgenskapstypeHeltall min(Integer min) {
    
    this.min = min;
    return this;
  }

   /**
   * Get min
   * @return min
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMin() {
    return min;
  }


  @JsonProperty(JSON_PROPERTY_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMin(Integer min) {
    this.min = min;
  }


  public EgenskapstypeHeltall maks(Integer maks) {
    
    this.maks = maks;
    return this;
  }

   /**
   * Get maks
   * @return maks
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaks() {
    return maks;
  }


  @JsonProperty(JSON_PROPERTY_MAKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaks(Integer maks) {
    this.maks = maks;
  }


  public EgenskapstypeHeltall feltlengde(Integer feltlengde) {
    
    this.feltlengde = feltlengde;
    return this;
  }

   /**
   * Get feltlengde
   * @return feltlengde
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FELTLENGDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFeltlengde() {
    return feltlengde;
  }


  @JsonProperty(JSON_PROPERTY_FELTLENGDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeltlengde(Integer feltlengde) {
    this.feltlengde = feltlengde;
  }


  public EgenskapstypeHeltall fortegnsendringSnu(Boolean fortegnsendringSnu) {
    
    this.fortegnsendringSnu = fortegnsendringSnu;
    return this;
  }

   /**
   * Get fortegnsendringSnu
   * @return fortegnsendringSnu
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FORTEGNSENDRING_SNU)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getFortegnsendringSnu() {
    return fortegnsendringSnu;
  }


  @JsonProperty(JSON_PROPERTY_FORTEGNSENDRING_SNU)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFortegnsendringSnu(Boolean fortegnsendringSnu) {
    this.fortegnsendringSnu = fortegnsendringSnu;
  }


  public EgenskapstypeHeltall enhet(Enhet enhet) {
    
    this.enhet = enhet;
    return this;
  }

   /**
   * Get enhet
   * @return enhet
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENHET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Enhet getEnhet() {
    return enhet;
  }


  @JsonProperty(JSON_PROPERTY_ENHET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnhet(Enhet enhet) {
    this.enhet = enhet;
  }

  @Override
  public EgenskapstypeHeltall id(Integer id) {
    this.setId(id);
    return this;
  }

  @Override
  public EgenskapstypeHeltall navn(String navn) {
    this.setNavn(navn);
    return this;
  }

  @Override
  public EgenskapstypeHeltall egenskapstype(EgenskapstypeEnum egenskapstype) {
    this.setEgenskapstype(egenskapstype);
    return this;
  }

  @Override
  public EgenskapstypeHeltall komplementærEgenskapstype(Integer komplementærEgenskapstype) {
    this.setKomplementærEgenskapstype(komplementærEgenskapstype);
    return this;
  }

  @Override
  public EgenskapstypeHeltall obligatoriskVerdi(Boolean obligatoriskVerdi) {
    this.setObligatoriskVerdi(obligatoriskVerdi);
    return this;
  }

  @Override
  public EgenskapstypeHeltall skrivebeskyttet(Boolean skrivebeskyttet) {
    this.setSkrivebeskyttet(skrivebeskyttet);
    return this;
  }

  @Override
  public EgenskapstypeHeltall sensitivitet(Integer sensitivitet) {
    this.setSensitivitet(sensitivitet);
    return this;
  }

  @Override
  public EgenskapstypeHeltall gruppesorteringsnummer(Integer gruppesorteringsnummer) {
    this.setGruppesorteringsnummer(gruppesorteringsnummer);
    return this;
  }

  @Override
  public EgenskapstypeHeltall veiledning(String veiledning) {
    this.setVeiledning(veiledning);
    return this;
  }

  @Override
  public EgenskapstypeHeltall grunnrissreferanse(String grunnrissreferanse) {
    this.setGrunnrissreferanse(grunnrissreferanse);
    return this;
  }

  @Override
  public EgenskapstypeHeltall høydereferanse(String høydereferanse) {
    this.setHøydereferanse(høydereferanse);
    return this;
  }

  @Override
  public EgenskapstypeHeltall høydereferanseTall(Integer høydereferanseTall) {
    this.setHøydereferanseTall(høydereferanseTall);
    return this;
  }

  @Override
  public EgenskapstypeHeltall nøyaktighetskravGrunnriss(Double nøyaktighetskravGrunnriss) {
    this.setNøyaktighetskravGrunnriss(nøyaktighetskravGrunnriss);
    return this;
  }

  @Override
  public EgenskapstypeHeltall nøyaktighetskravHøyde(Double nøyaktighetskravHøyde) {
    this.setNøyaktighetskravHøyde(nøyaktighetskravHøyde);
    return this;
  }

  @Override
  public EgenskapstypeHeltall sosiReferanse(String sosiReferanse) {
    this.setSosiReferanse(sosiReferanse);
    return this;
  }

  @Override
  public EgenskapstypeHeltall referansegeometriTilstrekkelig(Boolean referansegeometriTilstrekkelig) {
    this.setReferansegeometriTilstrekkelig(referansegeometriTilstrekkelig);
    return this;
  }

  @Override
  public EgenskapstypeHeltall viktighet(ViktighetEnum viktighet) {
    this.setViktighet(viktighet);
    return this;
  }

  @Override
  public EgenskapstypeHeltall kategori(Integer kategori) {
    this.setKategori(kategori);
    return this;
  }

  @Override
  public EgenskapstypeHeltall kortnavn(String kortnavn) {
    this.setKortnavn(kortnavn);
    return this;
  }

  @Override
  public EgenskapstypeHeltall beskrivelse(String beskrivelse) {
    this.setBeskrivelse(beskrivelse);
    return this;
  }

  @Override
  public EgenskapstypeHeltall sosinavn(String sosinavn) {
    this.setSosinavn(sosinavn);
    return this;
  }

  @Override
  public EgenskapstypeHeltall sosinvdbnavn(String sosinvdbnavn) {
    this.setSosinvdbnavn(sosinvdbnavn);
    return this;
  }

  @Override
  public EgenskapstypeHeltall sorteringsnummer(Integer sorteringsnummer) {
    this.setSorteringsnummer(sorteringsnummer);
    return this;
  }

  @Override
  public EgenskapstypeHeltall avledet(Boolean avledet) {
    this.setAvledet(avledet);
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
    EgenskapstypeHeltall egenskapstypeHeltall = (EgenskapstypeHeltall) o;
    return Objects.equals(this.objektlisteDato, egenskapstypeHeltall.objektlisteDato) &&
        Objects.equals(this.sluttDato, egenskapstypeHeltall.sluttDato) &&
        Objects.equals(this.lengdeavhengigVerdi, egenskapstypeHeltall.lengdeavhengigVerdi) &&
        Objects.equals(this.ajourholdSnu, egenskapstypeHeltall.ajourholdSnu) &&
        Objects.equals(this.standardverdi, egenskapstypeHeltall.standardverdi) &&
        Objects.equals(this.minAnbefalt, egenskapstypeHeltall.minAnbefalt) &&
        Objects.equals(this.maksAnbefalt, egenskapstypeHeltall.maksAnbefalt) &&
        Objects.equals(this.min, egenskapstypeHeltall.min) &&
        Objects.equals(this.maks, egenskapstypeHeltall.maks) &&
        Objects.equals(this.feltlengde, egenskapstypeHeltall.feltlengde) &&
        Objects.equals(this.fortegnsendringSnu, egenskapstypeHeltall.fortegnsendringSnu) &&
        Objects.equals(this.enhet, egenskapstypeHeltall.enhet) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objektlisteDato, sluttDato, lengdeavhengigVerdi, ajourholdSnu, standardverdi, minAnbefalt, maksAnbefalt, min, maks, feltlengde, fortegnsendringSnu, enhet, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EgenskapstypeHeltall {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    objektlisteDato: ").append(toIndentedString(objektlisteDato)).append("\n");
    sb.append("    sluttDato: ").append(toIndentedString(sluttDato)).append("\n");
    sb.append("    lengdeavhengigVerdi: ").append(toIndentedString(lengdeavhengigVerdi)).append("\n");
    sb.append("    ajourholdSnu: ").append(toIndentedString(ajourholdSnu)).append("\n");
    sb.append("    standardverdi: ").append(toIndentedString(standardverdi)).append("\n");
    sb.append("    minAnbefalt: ").append(toIndentedString(minAnbefalt)).append("\n");
    sb.append("    maksAnbefalt: ").append(toIndentedString(maksAnbefalt)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    maks: ").append(toIndentedString(maks)).append("\n");
    sb.append("    feltlengde: ").append(toIndentedString(feltlengde)).append("\n");
    sb.append("    fortegnsendringSnu: ").append(toIndentedString(fortegnsendringSnu)).append("\n");
    sb.append("    enhet: ").append(toIndentedString(enhet)).append("\n");
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


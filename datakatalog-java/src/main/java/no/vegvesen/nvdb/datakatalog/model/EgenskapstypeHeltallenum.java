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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import no.vegvesen.nvdb.datakatalog.model.Egenskapstype;
import no.vegvesen.nvdb.datakatalog.model.Enhet;
import no.vegvesen.nvdb.datakatalog.model.EnumverdiHeltall;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * EgenskapstypeHeltallenum
 */
@JsonPropertyOrder({
  EgenskapstypeHeltallenum.JSON_PROPERTY_OBJEKTLISTE_DATO,
  EgenskapstypeHeltallenum.JSON_PROPERTY_SLUTT_DATO,
  EgenskapstypeHeltallenum.JSON_PROPERTY_LENGDEAVHENGIG_VERDI,
  EgenskapstypeHeltallenum.JSON_PROPERTY_AJOURHOLD_SNU,
  EgenskapstypeHeltallenum.JSON_PROPERTY_STANDARDVERDI,
  EgenskapstypeHeltallenum.JSON_PROPERTY_MIN_ANBEFALT,
  EgenskapstypeHeltallenum.JSON_PROPERTY_MAKS_ANBEFALT,
  EgenskapstypeHeltallenum.JSON_PROPERTY_MIN,
  EgenskapstypeHeltallenum.JSON_PROPERTY_MAKS,
  EgenskapstypeHeltallenum.JSON_PROPERTY_FELTLENGDE,
  EgenskapstypeHeltallenum.JSON_PROPERTY_FORTEGNSENDRING_SNU,
  EgenskapstypeHeltallenum.JSON_PROPERTY_ENHET,
  EgenskapstypeHeltallenum.JSON_PROPERTY_TILLATTE_VERDIER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-22T10:07:12.572828+01:00[Europe/Oslo]")
@JsonIgnoreProperties(
  value = "egenskapstype", // ignore manually set egenskapstype, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the egenskapstype to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "egenskapstype", visible = true)

public class EgenskapstypeHeltallenum extends Egenskapstype {
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

  public static final String JSON_PROPERTY_TILLATTE_VERDIER = "tillatte_verdier";
  private List<EnumverdiHeltall> tillatteVerdier = new ArrayList<>();

  public EgenskapstypeHeltallenum() {

  }

  public EgenskapstypeHeltallenum objektlisteDato(LocalDate objektlisteDato) {
    
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


  public EgenskapstypeHeltallenum sluttDato(LocalDate sluttDato) {
    
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


  public EgenskapstypeHeltallenum lengdeavhengigVerdi(Boolean lengdeavhengigVerdi) {
    
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


  public EgenskapstypeHeltallenum ajourholdSnu(Boolean ajourholdSnu) {
    
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


  public EgenskapstypeHeltallenum standardverdi(Integer standardverdi) {
    
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


  public EgenskapstypeHeltallenum minAnbefalt(Integer minAnbefalt) {
    
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


  public EgenskapstypeHeltallenum maksAnbefalt(Integer maksAnbefalt) {
    
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


  public EgenskapstypeHeltallenum min(Integer min) {
    
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


  public EgenskapstypeHeltallenum maks(Integer maks) {
    
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


  public EgenskapstypeHeltallenum feltlengde(Integer feltlengde) {
    
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


  public EgenskapstypeHeltallenum fortegnsendringSnu(Boolean fortegnsendringSnu) {
    
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


  public EgenskapstypeHeltallenum enhet(Enhet enhet) {
    
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


  public EgenskapstypeHeltallenum tillatteVerdier(List<EnumverdiHeltall> tillatteVerdier) {
    
    this.tillatteVerdier = tillatteVerdier;
    return this;
  }

  public EgenskapstypeHeltallenum addTillatteVerdierItem(EnumverdiHeltall tillatteVerdierItem) {
    if (this.tillatteVerdier == null) {
      this.tillatteVerdier = new ArrayList<>();
    }
    this.tillatteVerdier.add(tillatteVerdierItem);
    return this;
  }

   /**
   * Get tillatteVerdier
   * @return tillatteVerdier
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TILLATTE_VERDIER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<EnumverdiHeltall> getTillatteVerdier() {
    return tillatteVerdier;
  }


  @JsonProperty(JSON_PROPERTY_TILLATTE_VERDIER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTillatteVerdier(List<EnumverdiHeltall> tillatteVerdier) {
    this.tillatteVerdier = tillatteVerdier;
  }

  @Override
  public EgenskapstypeHeltallenum id(Integer id) {
    this.setId(id);
    return this;
  }

  @Override
  public EgenskapstypeHeltallenum kortnavn(String kortnavn) {
    this.setKortnavn(kortnavn);
    return this;
  }

  @Override
  public EgenskapstypeHeltallenum beskrivelse(String beskrivelse) {
    this.setBeskrivelse(beskrivelse);
    return this;
  }

  @Override
  public EgenskapstypeHeltallenum sosinavn(String sosinavn) {
    this.setSosinavn(sosinavn);
    return this;
  }

  @Override
  public EgenskapstypeHeltallenum sosinvdbnavn(String sosinvdbnavn) {
    this.setSosinvdbnavn(sosinvdbnavn);
    return this;
  }

  @Override
  public EgenskapstypeHeltallenum sorteringsnummer(Integer sorteringsnummer) {
    this.setSorteringsnummer(sorteringsnummer);
    return this;
  }

  @Override
  public EgenskapstypeHeltallenum avledet(Boolean avledet) {
    this.setAvledet(avledet);
    return this;
  }

  @Override
  public EgenskapstypeHeltallenum komplementærEgenskapstype(Integer komplementærEgenskapstype) {
    this.setKomplementærEgenskapstype(komplementærEgenskapstype);
    return this;
  }

  @Override
  public EgenskapstypeHeltallenum navn(String navn) {
    this.setNavn(navn);
    return this;
  }

  @Override
  public EgenskapstypeHeltallenum egenskapstype(EgenskapstypeEnum egenskapstype) {
    this.setEgenskapstype(egenskapstype);
    return this;
  }

  @Override
  public EgenskapstypeHeltallenum obligatoriskVerdi(Boolean obligatoriskVerdi) {
    this.setObligatoriskVerdi(obligatoriskVerdi);
    return this;
  }

  @Override
  public EgenskapstypeHeltallenum skrivebeskyttet(Boolean skrivebeskyttet) {
    this.setSkrivebeskyttet(skrivebeskyttet);
    return this;
  }

  @Override
  public EgenskapstypeHeltallenum sensitivitet(Integer sensitivitet) {
    this.setSensitivitet(sensitivitet);
    return this;
  }

  @Override
  public EgenskapstypeHeltallenum gruppesorteringsnummer(Integer gruppesorteringsnummer) {
    this.setGruppesorteringsnummer(gruppesorteringsnummer);
    return this;
  }

  @Override
  public EgenskapstypeHeltallenum veiledning(String veiledning) {
    this.setVeiledning(veiledning);
    return this;
  }

  @Override
  public EgenskapstypeHeltallenum grunnrissreferanse(String grunnrissreferanse) {
    this.setGrunnrissreferanse(grunnrissreferanse);
    return this;
  }

  @Override
  public EgenskapstypeHeltallenum høydereferanse(String høydereferanse) {
    this.setHøydereferanse(høydereferanse);
    return this;
  }

  @Override
  public EgenskapstypeHeltallenum høydereferanseTall(Integer høydereferanseTall) {
    this.setHøydereferanseTall(høydereferanseTall);
    return this;
  }

  @Override
  public EgenskapstypeHeltallenum nøyaktighetskravGrunnriss(Double nøyaktighetskravGrunnriss) {
    this.setNøyaktighetskravGrunnriss(nøyaktighetskravGrunnriss);
    return this;
  }

  @Override
  public EgenskapstypeHeltallenum nøyaktighetskravHøyde(Double nøyaktighetskravHøyde) {
    this.setNøyaktighetskravHøyde(nøyaktighetskravHøyde);
    return this;
  }

  @Override
  public EgenskapstypeHeltallenum sosiReferanse(String sosiReferanse) {
    this.setSosiReferanse(sosiReferanse);
    return this;
  }

  @Override
  public EgenskapstypeHeltallenum referansegeometriTilstrekkelig(Boolean referansegeometriTilstrekkelig) {
    this.setReferansegeometriTilstrekkelig(referansegeometriTilstrekkelig);
    return this;
  }

  @Override
  public EgenskapstypeHeltallenum viktighet(ViktighetEnum viktighet) {
    this.setViktighet(viktighet);
    return this;
  }

  @Override
  public EgenskapstypeHeltallenum kategori(Integer kategori) {
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
    EgenskapstypeHeltallenum egenskapstypeHeltallenum = (EgenskapstypeHeltallenum) o;
    return Objects.equals(this.objektlisteDato, egenskapstypeHeltallenum.objektlisteDato) &&
        Objects.equals(this.sluttDato, egenskapstypeHeltallenum.sluttDato) &&
        Objects.equals(this.lengdeavhengigVerdi, egenskapstypeHeltallenum.lengdeavhengigVerdi) &&
        Objects.equals(this.ajourholdSnu, egenskapstypeHeltallenum.ajourholdSnu) &&
        Objects.equals(this.standardverdi, egenskapstypeHeltallenum.standardverdi) &&
        Objects.equals(this.minAnbefalt, egenskapstypeHeltallenum.minAnbefalt) &&
        Objects.equals(this.maksAnbefalt, egenskapstypeHeltallenum.maksAnbefalt) &&
        Objects.equals(this.min, egenskapstypeHeltallenum.min) &&
        Objects.equals(this.maks, egenskapstypeHeltallenum.maks) &&
        Objects.equals(this.feltlengde, egenskapstypeHeltallenum.feltlengde) &&
        Objects.equals(this.fortegnsendringSnu, egenskapstypeHeltallenum.fortegnsendringSnu) &&
        Objects.equals(this.enhet, egenskapstypeHeltallenum.enhet) &&
        Objects.equals(this.tillatteVerdier, egenskapstypeHeltallenum.tillatteVerdier) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objektlisteDato, sluttDato, lengdeavhengigVerdi, ajourholdSnu, standardverdi, minAnbefalt, maksAnbefalt, min, maks, feltlengde, fortegnsendringSnu, enhet, tillatteVerdier, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EgenskapstypeHeltallenum {\n");
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
    sb.append("    tillatteVerdier: ").append(toIndentedString(tillatteVerdier)).append("\n");
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


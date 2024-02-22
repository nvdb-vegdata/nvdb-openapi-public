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
import no.vegvesen.nvdb.datakatalog.model.Stedfesting;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * StedfestingEnkel
 */
@JsonPropertyOrder({
  StedfestingEnkel.JSON_PROPERTY_STEDFESTINGSTYPE,
  StedfestingEnkel.JSON_PROPERTY_GEOMETRITYPE,
  StedfestingEnkel.JSON_PROPERTY_OVERLAPP_OK,
  StedfestingEnkel.JSON_PROPERTY_KJøREFELT_RELEVANT,
  StedfestingEnkel.JSON_PROPERTY_SIDEPOSISJON_RELEVANT,
  StedfestingEnkel.JSON_PROPERTY_INNENFOR_MOR,
  StedfestingEnkel.JSON_PROPERTY_VEGNETTSAJOURHOLD_SPLITT,
  StedfestingEnkel.JSON_PROPERTY_OVERLAPPSAUTOMATIKK,
  StedfestingEnkel.JSON_PROPERTY_RETNING_RELEVANT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonIgnoreProperties(
  value = "egenskapstype", // ignore manually set egenskapstype, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the egenskapstype to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "egenskapstype", visible = true)

public class StedfestingEnkel extends Stedfesting {
  /**
   * Gets or Sets stedfestingstype
   */
  public enum StedfestingstypeEnum {
    PUNKT("Punkt"),
    
    LINJE("Linje"),
    
    SVING("Sving");

    private String value;

    StedfestingstypeEnum(String value) {
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
    public static StedfestingstypeEnum fromValue(String value) {
      for (StedfestingstypeEnum b : StedfestingstypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STEDFESTINGSTYPE = "stedfestingstype";
  private StedfestingstypeEnum stedfestingstype;

  /**
   * Gets or Sets geometritype
   */
  public enum GeometritypeEnum {
    PUNKT("PUNKT"),
    
    LINJE("LINJE"),
    
    SVING("SVING");

    private String value;

    GeometritypeEnum(String value) {
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
    public static GeometritypeEnum fromValue(String value) {
      for (GeometritypeEnum b : GeometritypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_GEOMETRITYPE = "geometritype";
  private GeometritypeEnum geometritype;

  public static final String JSON_PROPERTY_OVERLAPP_OK = "overlapp_ok";
  private Boolean overlappOk;

  /**
   * Gets or Sets kjørefeltRelevant
   */
  public enum KjrefeltRelevantEnum {
    KAN("KAN"),
    
    NEI("NEI"),
    
    M_("MÅ");

    private String value;

    KjrefeltRelevantEnum(String value) {
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
    public static KjrefeltRelevantEnum fromValue(String value) {
      for (KjrefeltRelevantEnum b : KjrefeltRelevantEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_KJøREFELT_RELEVANT = "kjørefelt_relevant";
  private KjrefeltRelevantEnum kjørefeltRelevant;

  /**
   * Gets or Sets sideposisjonRelevant
   */
  public enum SideposisjonRelevantEnum {
    KAN("KAN"),
    
    NEI("NEI"),
    
    M_("MÅ");

    private String value;

    SideposisjonRelevantEnum(String value) {
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
    public static SideposisjonRelevantEnum fromValue(String value) {
      for (SideposisjonRelevantEnum b : SideposisjonRelevantEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SIDEPOSISJON_RELEVANT = "sideposisjon_relevant";
  private SideposisjonRelevantEnum sideposisjonRelevant;

  public static final String JSON_PROPERTY_INNENFOR_MOR = "innenfor_mor";
  private Boolean innenforMor;

  /**
   * Gets or Sets vegnettsajourholdSplitt
   */
  public enum VegnettsajourholdSplittEnum {
    IKKE_TATT_STILLING("IKKE_TATT_STILLING"),
    
    KAN_IKKE_SPLITTES("KAN_IKKE_SPLITTES"),
    
    KAN_SPLITTES("KAN_SPLITTES");

    private String value;

    VegnettsajourholdSplittEnum(String value) {
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
    public static VegnettsajourholdSplittEnum fromValue(String value) {
      for (VegnettsajourholdSplittEnum b : VegnettsajourholdSplittEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_VEGNETTSAJOURHOLD_SPLITT = "vegnettsajourhold_splitt";
  private VegnettsajourholdSplittEnum vegnettsajourholdSplitt;

  public static final String JSON_PROPERTY_OVERLAPPSAUTOMATIKK = "overlappsautomatikk";
  private String overlappsautomatikk;

  public static final String JSON_PROPERTY_RETNING_RELEVANT = "retning_relevant";
  private Boolean retningRelevant;

  public StedfestingEnkel() {

  }

  public StedfestingEnkel stedfestingstype(StedfestingstypeEnum stedfestingstype) {
    
    this.stedfestingstype = stedfestingstype;
    return this;
  }

   /**
   * Get stedfestingstype
   * @return stedfestingstype
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STEDFESTINGSTYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StedfestingstypeEnum getStedfestingstype() {
    return stedfestingstype;
  }


  @JsonProperty(JSON_PROPERTY_STEDFESTINGSTYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStedfestingstype(StedfestingstypeEnum stedfestingstype) {
    this.stedfestingstype = stedfestingstype;
  }


  public StedfestingEnkel geometritype(GeometritypeEnum geometritype) {
    
    this.geometritype = geometritype;
    return this;
  }

   /**
   * Get geometritype
   * @return geometritype
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GEOMETRITYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GeometritypeEnum getGeometritype() {
    return geometritype;
  }


  @JsonProperty(JSON_PROPERTY_GEOMETRITYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGeometritype(GeometritypeEnum geometritype) {
    this.geometritype = geometritype;
  }


  public StedfestingEnkel overlappOk(Boolean overlappOk) {
    
    this.overlappOk = overlappOk;
    return this;
  }

   /**
   * Get overlappOk
   * @return overlappOk
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OVERLAPP_OK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOverlappOk() {
    return overlappOk;
  }


  @JsonProperty(JSON_PROPERTY_OVERLAPP_OK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOverlappOk(Boolean overlappOk) {
    this.overlappOk = overlappOk;
  }


  public StedfestingEnkel kjørefeltRelevant(KjrefeltRelevantEnum kjørefeltRelevant) {
    
    this.kjørefeltRelevant = kjørefeltRelevant;
    return this;
  }

   /**
   * Get kjørefeltRelevant
   * @return kjørefeltRelevant
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KJøREFELT_RELEVANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KjrefeltRelevantEnum getKjørefeltRelevant() {
    return kjørefeltRelevant;
  }


  @JsonProperty(JSON_PROPERTY_KJøREFELT_RELEVANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKjørefeltRelevant(KjrefeltRelevantEnum kjørefeltRelevant) {
    this.kjørefeltRelevant = kjørefeltRelevant;
  }


  public StedfestingEnkel sideposisjonRelevant(SideposisjonRelevantEnum sideposisjonRelevant) {
    
    this.sideposisjonRelevant = sideposisjonRelevant;
    return this;
  }

   /**
   * Get sideposisjonRelevant
   * @return sideposisjonRelevant
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIDEPOSISJON_RELEVANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SideposisjonRelevantEnum getSideposisjonRelevant() {
    return sideposisjonRelevant;
  }


  @JsonProperty(JSON_PROPERTY_SIDEPOSISJON_RELEVANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSideposisjonRelevant(SideposisjonRelevantEnum sideposisjonRelevant) {
    this.sideposisjonRelevant = sideposisjonRelevant;
  }


  public StedfestingEnkel innenforMor(Boolean innenforMor) {
    
    this.innenforMor = innenforMor;
    return this;
  }

   /**
   * Get innenforMor
   * @return innenforMor
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INNENFOR_MOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getInnenforMor() {
    return innenforMor;
  }


  @JsonProperty(JSON_PROPERTY_INNENFOR_MOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInnenforMor(Boolean innenforMor) {
    this.innenforMor = innenforMor;
  }


  public StedfestingEnkel vegnettsajourholdSplitt(VegnettsajourholdSplittEnum vegnettsajourholdSplitt) {
    
    this.vegnettsajourholdSplitt = vegnettsajourholdSplitt;
    return this;
  }

   /**
   * Get vegnettsajourholdSplitt
   * @return vegnettsajourholdSplitt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VEGNETTSAJOURHOLD_SPLITT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VegnettsajourholdSplittEnum getVegnettsajourholdSplitt() {
    return vegnettsajourholdSplitt;
  }


  @JsonProperty(JSON_PROPERTY_VEGNETTSAJOURHOLD_SPLITT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVegnettsajourholdSplitt(VegnettsajourholdSplittEnum vegnettsajourholdSplitt) {
    this.vegnettsajourholdSplitt = vegnettsajourholdSplitt;
  }


  public StedfestingEnkel overlappsautomatikk(String overlappsautomatikk) {
    
    this.overlappsautomatikk = overlappsautomatikk;
    return this;
  }

   /**
   * Get overlappsautomatikk
   * @return overlappsautomatikk
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OVERLAPPSAUTOMATIKK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOverlappsautomatikk() {
    return overlappsautomatikk;
  }


  @JsonProperty(JSON_PROPERTY_OVERLAPPSAUTOMATIKK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOverlappsautomatikk(String overlappsautomatikk) {
    this.overlappsautomatikk = overlappsautomatikk;
  }


  public StedfestingEnkel retningRelevant(Boolean retningRelevant) {
    
    this.retningRelevant = retningRelevant;
    return this;
  }

   /**
   * Get retningRelevant
   * @return retningRelevant
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETNING_RELEVANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRetningRelevant() {
    return retningRelevant;
  }


  @JsonProperty(JSON_PROPERTY_RETNING_RELEVANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRetningRelevant(Boolean retningRelevant) {
    this.retningRelevant = retningRelevant;
  }

  @Override
  public StedfestingEnkel id(Integer id) {
    this.setId(id);
    return this;
  }

  @Override
  public StedfestingEnkel kortnavn(String kortnavn) {
    this.setKortnavn(kortnavn);
    return this;
  }

  @Override
  public StedfestingEnkel beskrivelse(String beskrivelse) {
    this.setBeskrivelse(beskrivelse);
    return this;
  }

  @Override
  public StedfestingEnkel sosinavn(String sosinavn) {
    this.setSosinavn(sosinavn);
    return this;
  }

  @Override
  public StedfestingEnkel sosinvdbnavn(String sosinvdbnavn) {
    this.setSosinvdbnavn(sosinvdbnavn);
    return this;
  }

  @Override
  public StedfestingEnkel sorteringsnummer(Integer sorteringsnummer) {
    this.setSorteringsnummer(sorteringsnummer);
    return this;
  }

  @Override
  public StedfestingEnkel avledet(Boolean avledet) {
    this.setAvledet(avledet);
    return this;
  }

  @Override
  public StedfestingEnkel komplementærEgenskapstype(Integer komplementærEgenskapstype) {
    this.setKomplementærEgenskapstype(komplementærEgenskapstype);
    return this;
  }

  @Override
  public StedfestingEnkel navn(String navn) {
    this.setNavn(navn);
    return this;
  }

  @Override
  public StedfestingEnkel egenskapstype(EgenskapstypeEnum egenskapstype) {
    this.setEgenskapstype(egenskapstype);
    return this;
  }

  @Override
  public StedfestingEnkel obligatoriskVerdi(Boolean obligatoriskVerdi) {
    this.setObligatoriskVerdi(obligatoriskVerdi);
    return this;
  }

  @Override
  public StedfestingEnkel skrivebeskyttet(Boolean skrivebeskyttet) {
    this.setSkrivebeskyttet(skrivebeskyttet);
    return this;
  }

  @Override
  public StedfestingEnkel sensitivitet(Integer sensitivitet) {
    this.setSensitivitet(sensitivitet);
    return this;
  }

  @Override
  public StedfestingEnkel gruppesorteringsnummer(Integer gruppesorteringsnummer) {
    this.setGruppesorteringsnummer(gruppesorteringsnummer);
    return this;
  }

  @Override
  public StedfestingEnkel veiledning(String veiledning) {
    this.setVeiledning(veiledning);
    return this;
  }

  @Override
  public StedfestingEnkel grunnrissreferanse(String grunnrissreferanse) {
    this.setGrunnrissreferanse(grunnrissreferanse);
    return this;
  }

  @Override
  public StedfestingEnkel høydereferanse(String høydereferanse) {
    this.setHøydereferanse(høydereferanse);
    return this;
  }

  @Override
  public StedfestingEnkel høydereferanseTall(Integer høydereferanseTall) {
    this.setHøydereferanseTall(høydereferanseTall);
    return this;
  }

  @Override
  public StedfestingEnkel nøyaktighetskravGrunnriss(Double nøyaktighetskravGrunnriss) {
    this.setNøyaktighetskravGrunnriss(nøyaktighetskravGrunnriss);
    return this;
  }

  @Override
  public StedfestingEnkel nøyaktighetskravHøyde(Double nøyaktighetskravHøyde) {
    this.setNøyaktighetskravHøyde(nøyaktighetskravHøyde);
    return this;
  }

  @Override
  public StedfestingEnkel sosiReferanse(String sosiReferanse) {
    this.setSosiReferanse(sosiReferanse);
    return this;
  }

  @Override
  public StedfestingEnkel referansegeometriTilstrekkelig(Boolean referansegeometriTilstrekkelig) {
    this.setReferansegeometriTilstrekkelig(referansegeometriTilstrekkelig);
    return this;
  }

  @Override
  public StedfestingEnkel viktighet(ViktighetEnum viktighet) {
    this.setViktighet(viktighet);
    return this;
  }

  @Override
  public StedfestingEnkel kategori(Integer kategori) {
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
    StedfestingEnkel stedfestingEnkel = (StedfestingEnkel) o;
    return Objects.equals(this.stedfestingstype, stedfestingEnkel.stedfestingstype) &&
        Objects.equals(this.geometritype, stedfestingEnkel.geometritype) &&
        Objects.equals(this.overlappOk, stedfestingEnkel.overlappOk) &&
        Objects.equals(this.kjørefeltRelevant, stedfestingEnkel.kjørefeltRelevant) &&
        Objects.equals(this.sideposisjonRelevant, stedfestingEnkel.sideposisjonRelevant) &&
        Objects.equals(this.innenforMor, stedfestingEnkel.innenforMor) &&
        Objects.equals(this.vegnettsajourholdSplitt, stedfestingEnkel.vegnettsajourholdSplitt) &&
        Objects.equals(this.overlappsautomatikk, stedfestingEnkel.overlappsautomatikk) &&
        Objects.equals(this.retningRelevant, stedfestingEnkel.retningRelevant) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stedfestingstype, geometritype, overlappOk, kjørefeltRelevant, sideposisjonRelevant, innenforMor, vegnettsajourholdSplitt, overlappsautomatikk, retningRelevant, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StedfestingEnkel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    stedfestingstype: ").append(toIndentedString(stedfestingstype)).append("\n");
    sb.append("    geometritype: ").append(toIndentedString(geometritype)).append("\n");
    sb.append("    overlappOk: ").append(toIndentedString(overlappOk)).append("\n");
    sb.append("    kjørefeltRelevant: ").append(toIndentedString(kjørefeltRelevant)).append("\n");
    sb.append("    sideposisjonRelevant: ").append(toIndentedString(sideposisjonRelevant)).append("\n");
    sb.append("    innenforMor: ").append(toIndentedString(innenforMor)).append("\n");
    sb.append("    vegnettsajourholdSplitt: ").append(toIndentedString(vegnettsajourholdSplitt)).append("\n");
    sb.append("    overlappsautomatikk: ").append(toIndentedString(overlappsautomatikk)).append("\n");
    sb.append("    retningRelevant: ").append(toIndentedString(retningRelevant)).append("\n");
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


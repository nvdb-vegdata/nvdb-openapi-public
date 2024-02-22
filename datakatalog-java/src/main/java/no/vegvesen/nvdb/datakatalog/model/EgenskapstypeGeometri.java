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
 * EgenskapstypeGeometri
 */
@JsonPropertyOrder({
  EgenskapstypeGeometri.JSON_PROPERTY_DIMENSJONER,
  EgenskapstypeGeometri.JSON_PROPERTY_GEOMETRITYPE,
  EgenskapstypeGeometri.JSON_PROPERTY_INNENFOR_MOR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-22T10:07:12.572828+01:00[Europe/Oslo]")
@JsonIgnoreProperties(
  value = "egenskapstype", // ignore manually set egenskapstype, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the egenskapstype to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "egenskapstype", visible = true)

public class EgenskapstypeGeometri extends Egenskapstype {
  public static final String JSON_PROPERTY_DIMENSJONER = "dimensjoner";
  private Integer dimensjoner;

  /**
   * Gets or Sets geometritype
   */
  public enum GeometritypeEnum {
    PUNKT("PUNKT"),
    
    POLYGON("POLYGON"),
    
    LINJE("LINJE"),
    
    FLERELINJE("FLERELINJE"),
    
    FLEREPUNKT("FLEREPUNKT"),
    
    FLEREPOLYGON("FLEREPOLYGON"),
    
    KOMPLEKS("KOMPLEKS"),
    
    UKJENT("UKJENT");

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

  public static final String JSON_PROPERTY_INNENFOR_MOR = "innenfor_mor";
  private Boolean innenforMor;

  public EgenskapstypeGeometri() {

  }

  public EgenskapstypeGeometri dimensjoner(Integer dimensjoner) {
    
    this.dimensjoner = dimensjoner;
    return this;
  }

   /**
   * Get dimensjoner
   * @return dimensjoner
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DIMENSJONER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getDimensjoner() {
    return dimensjoner;
  }


  @JsonProperty(JSON_PROPERTY_DIMENSJONER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDimensjoner(Integer dimensjoner) {
    this.dimensjoner = dimensjoner;
  }


  public EgenskapstypeGeometri geometritype(GeometritypeEnum geometritype) {
    
    this.geometritype = geometritype;
    return this;
  }

   /**
   * Get geometritype
   * @return geometritype
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_GEOMETRITYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public GeometritypeEnum getGeometritype() {
    return geometritype;
  }


  @JsonProperty(JSON_PROPERTY_GEOMETRITYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGeometritype(GeometritypeEnum geometritype) {
    this.geometritype = geometritype;
  }


  public EgenskapstypeGeometri innenforMor(Boolean innenforMor) {
    
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

  @Override
  public EgenskapstypeGeometri id(Integer id) {
    this.setId(id);
    return this;
  }

  @Override
  public EgenskapstypeGeometri kortnavn(String kortnavn) {
    this.setKortnavn(kortnavn);
    return this;
  }

  @Override
  public EgenskapstypeGeometri beskrivelse(String beskrivelse) {
    this.setBeskrivelse(beskrivelse);
    return this;
  }

  @Override
  public EgenskapstypeGeometri sosinavn(String sosinavn) {
    this.setSosinavn(sosinavn);
    return this;
  }

  @Override
  public EgenskapstypeGeometri sosinvdbnavn(String sosinvdbnavn) {
    this.setSosinvdbnavn(sosinvdbnavn);
    return this;
  }

  @Override
  public EgenskapstypeGeometri sorteringsnummer(Integer sorteringsnummer) {
    this.setSorteringsnummer(sorteringsnummer);
    return this;
  }

  @Override
  public EgenskapstypeGeometri avledet(Boolean avledet) {
    this.setAvledet(avledet);
    return this;
  }

  @Override
  public EgenskapstypeGeometri komplementærEgenskapstype(Integer komplementærEgenskapstype) {
    this.setKomplementærEgenskapstype(komplementærEgenskapstype);
    return this;
  }

  @Override
  public EgenskapstypeGeometri navn(String navn) {
    this.setNavn(navn);
    return this;
  }

  @Override
  public EgenskapstypeGeometri egenskapstype(EgenskapstypeEnum egenskapstype) {
    this.setEgenskapstype(egenskapstype);
    return this;
  }

  @Override
  public EgenskapstypeGeometri obligatoriskVerdi(Boolean obligatoriskVerdi) {
    this.setObligatoriskVerdi(obligatoriskVerdi);
    return this;
  }

  @Override
  public EgenskapstypeGeometri skrivebeskyttet(Boolean skrivebeskyttet) {
    this.setSkrivebeskyttet(skrivebeskyttet);
    return this;
  }

  @Override
  public EgenskapstypeGeometri sensitivitet(Integer sensitivitet) {
    this.setSensitivitet(sensitivitet);
    return this;
  }

  @Override
  public EgenskapstypeGeometri gruppesorteringsnummer(Integer gruppesorteringsnummer) {
    this.setGruppesorteringsnummer(gruppesorteringsnummer);
    return this;
  }

  @Override
  public EgenskapstypeGeometri veiledning(String veiledning) {
    this.setVeiledning(veiledning);
    return this;
  }

  @Override
  public EgenskapstypeGeometri grunnrissreferanse(String grunnrissreferanse) {
    this.setGrunnrissreferanse(grunnrissreferanse);
    return this;
  }

  @Override
  public EgenskapstypeGeometri høydereferanse(String høydereferanse) {
    this.setHøydereferanse(høydereferanse);
    return this;
  }

  @Override
  public EgenskapstypeGeometri høydereferanseTall(Integer høydereferanseTall) {
    this.setHøydereferanseTall(høydereferanseTall);
    return this;
  }

  @Override
  public EgenskapstypeGeometri nøyaktighetskravGrunnriss(Double nøyaktighetskravGrunnriss) {
    this.setNøyaktighetskravGrunnriss(nøyaktighetskravGrunnriss);
    return this;
  }

  @Override
  public EgenskapstypeGeometri nøyaktighetskravHøyde(Double nøyaktighetskravHøyde) {
    this.setNøyaktighetskravHøyde(nøyaktighetskravHøyde);
    return this;
  }

  @Override
  public EgenskapstypeGeometri sosiReferanse(String sosiReferanse) {
    this.setSosiReferanse(sosiReferanse);
    return this;
  }

  @Override
  public EgenskapstypeGeometri referansegeometriTilstrekkelig(Boolean referansegeometriTilstrekkelig) {
    this.setReferansegeometriTilstrekkelig(referansegeometriTilstrekkelig);
    return this;
  }

  @Override
  public EgenskapstypeGeometri viktighet(ViktighetEnum viktighet) {
    this.setViktighet(viktighet);
    return this;
  }

  @Override
  public EgenskapstypeGeometri kategori(Integer kategori) {
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
    EgenskapstypeGeometri egenskapstypeGeometri = (EgenskapstypeGeometri) o;
    return Objects.equals(this.dimensjoner, egenskapstypeGeometri.dimensjoner) &&
        Objects.equals(this.geometritype, egenskapstypeGeometri.geometritype) &&
        Objects.equals(this.innenforMor, egenskapstypeGeometri.innenforMor) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimensjoner, geometritype, innenforMor, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EgenskapstypeGeometri {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    dimensjoner: ").append(toIndentedString(dimensjoner)).append("\n");
    sb.append("    geometritype: ").append(toIndentedString(geometritype)).append("\n");
    sb.append("    innenforMor: ").append(toIndentedString(innenforMor)).append("\n");
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


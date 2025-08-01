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


package no.vegvesen.vt.nvdb.datakatalog.model;

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
import no.vegvesen.vt.nvdb.datakatalog.model.EgenskapstypeEnum;
import no.vegvesen.vt.nvdb.datakatalog.model.Viktighet;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Stedfesting
 */
@JsonPropertyOrder({
  Stedfesting.JSON_PROPERTY_ID,
  Stedfesting.JSON_PROPERTY_NAVN,
  Stedfesting.JSON_PROPERTY_EGENSKAPSTYPE,
  Stedfesting.JSON_PROPERTY_KORTNAVN,
  Stedfesting.JSON_PROPERTY_BESKRIVELSE,
  Stedfesting.JSON_PROPERTY_VEILEDNING,
  Stedfesting.JSON_PROPERTY_SOSINAVN,
  Stedfesting.JSON_PROPERTY_SOSINVDBNAVN,
  Stedfesting.JSON_PROPERTY_SORTERINGSNUMMER,
  Stedfesting.JSON_PROPERTY_AVLEDET,
  Stedfesting.JSON_PROPERTY_KOMPLEMENTæR_EGENSKAPSTYPE,
  Stedfesting.JSON_PROPERTY_SKRIVEBESKYTTET,
  Stedfesting.JSON_PROPERTY_OBLIGATORISK_VERDI,
  Stedfesting.JSON_PROPERTY_SENSITIVITET,
  Stedfesting.JSON_PROPERTY_GRUPPESORTERINGSNUMMER,
  Stedfesting.JSON_PROPERTY_GRUNNRISSREFERANSE,
  Stedfesting.JSON_PROPERTY_HøYDEREFERANSE,
  Stedfesting.JSON_PROPERTY_HøYDEREFERANSE_TALL,
  Stedfesting.JSON_PROPERTY_NøYAKTIGHETSKRAV_GRUNNRISS,
  Stedfesting.JSON_PROPERTY_NøYAKTIGHETSKRAV_HøYDE,
  Stedfesting.JSON_PROPERTY_SOSI_REFERANSE,
  Stedfesting.JSON_PROPERTY_REFERANSEGEOMETRI_TILSTREKKELIG,
  Stedfesting.JSON_PROPERTY_VIKTIGHET,
  Stedfesting.JSON_PROPERTY_KATEGORI
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
@JsonIgnoreProperties(
  value = "egenskapstype", // ignore manually set egenskapstype, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the egenskapstype to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "egenskapstype", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = StedfestingListe.class, name = "Liste"),
  @JsonSubTypes.Type(value = StedfestingEnkel.class, name = "Stedfesting"),
})

public class Stedfesting {
  public static final String JSON_PROPERTY_ID = "id";
  @jakarta.annotation.Nonnull
  protected Integer id;

  public static final String JSON_PROPERTY_NAVN = "navn";
  @jakarta.annotation.Nullable
  protected String navn;

  public static final String JSON_PROPERTY_EGENSKAPSTYPE = "egenskapstype";
  @jakarta.annotation.Nonnull
  protected EgenskapstypeEnum egenskapstype = EgenskapstypeEnum.STEDFESTING;

  public static final String JSON_PROPERTY_KORTNAVN = "kortnavn";
  @jakarta.annotation.Nullable
  protected String kortnavn;

  public static final String JSON_PROPERTY_BESKRIVELSE = "beskrivelse";
  @jakarta.annotation.Nullable
  protected String beskrivelse;

  public static final String JSON_PROPERTY_VEILEDNING = "veiledning";
  @jakarta.annotation.Nullable
  protected String veiledning;

  public static final String JSON_PROPERTY_SOSINAVN = "sosinavn";
  @jakarta.annotation.Nullable
  protected String sosinavn;

  public static final String JSON_PROPERTY_SOSINVDBNAVN = "sosinvdbnavn";
  @jakarta.annotation.Nullable
  protected String sosinvdbnavn;

  public static final String JSON_PROPERTY_SORTERINGSNUMMER = "sorteringsnummer";
  @jakarta.annotation.Nonnull
  protected Integer sorteringsnummer;

  public static final String JSON_PROPERTY_AVLEDET = "avledet";
  @jakarta.annotation.Nonnull
  protected Boolean avledet;

  public static final String JSON_PROPERTY_KOMPLEMENTæR_EGENSKAPSTYPE = "komplementær_egenskapstype";
  @jakarta.annotation.Nullable
  protected Integer komplementærEgenskapstype;

  public static final String JSON_PROPERTY_SKRIVEBESKYTTET = "skrivebeskyttet";
  @jakarta.annotation.Nonnull
  protected Boolean skrivebeskyttet;

  public static final String JSON_PROPERTY_OBLIGATORISK_VERDI = "obligatorisk_verdi";
  @jakarta.annotation.Nonnull
  protected Boolean obligatoriskVerdi;

  public static final String JSON_PROPERTY_SENSITIVITET = "sensitivitet";
  @jakarta.annotation.Nonnull
  protected Integer sensitivitet;

  public static final String JSON_PROPERTY_GRUPPESORTERINGSNUMMER = "gruppesorteringsnummer";
  @jakarta.annotation.Nullable
  protected Integer gruppesorteringsnummer;

  public static final String JSON_PROPERTY_GRUNNRISSREFERANSE = "grunnrissreferanse";
  @jakarta.annotation.Nullable
  protected String grunnrissreferanse;

  public static final String JSON_PROPERTY_HøYDEREFERANSE = "høydereferanse";
  @jakarta.annotation.Nullable
  protected String høydereferanse;

  public static final String JSON_PROPERTY_HøYDEREFERANSE_TALL = "høydereferanse_tall";
  @jakarta.annotation.Nonnull
  protected Integer høydereferanseTall;

  public static final String JSON_PROPERTY_NøYAKTIGHETSKRAV_GRUNNRISS = "nøyaktighetskrav_grunnriss";
  @jakarta.annotation.Nonnull
  protected Double nøyaktighetskravGrunnriss;

  public static final String JSON_PROPERTY_NøYAKTIGHETSKRAV_HøYDE = "nøyaktighetskrav_høyde";
  @jakarta.annotation.Nonnull
  protected Double nøyaktighetskravHøyde;

  public static final String JSON_PROPERTY_SOSI_REFERANSE = "sosi_referanse";
  @jakarta.annotation.Nullable
  protected String sosiReferanse;

  public static final String JSON_PROPERTY_REFERANSEGEOMETRI_TILSTREKKELIG = "referansegeometri_tilstrekkelig";
  @jakarta.annotation.Nonnull
  protected Boolean referansegeometriTilstrekkelig;

  public static final String JSON_PROPERTY_VIKTIGHET = "viktighet";
  @jakarta.annotation.Nonnull
  protected Viktighet viktighet;

  public static final String JSON_PROPERTY_KATEGORI = "kategori";
  @jakarta.annotation.Nonnull
  protected Integer kategori;

  public Stedfesting() {
  }

  public Stedfesting id(@jakarta.annotation.Nonnull Integer id) {
    
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(@jakarta.annotation.Nonnull Integer id) {
    this.id = id;
  }

  public Stedfesting navn(@jakarta.annotation.Nullable String navn) {
    
    this.navn = navn;
    return this;
  }

  /**
   * Get navn
   * @return navn
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAVN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNavn() {
    return navn;
  }


  @JsonProperty(JSON_PROPERTY_NAVN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNavn(@jakarta.annotation.Nullable String navn) {
    this.navn = navn;
  }

  public Stedfesting egenskapstype(@jakarta.annotation.Nonnull EgenskapstypeEnum egenskapstype) {
    
    this.egenskapstype = egenskapstype;
    return this;
  }

  /**
   * Get egenskapstype
   * @return egenskapstype
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EGENSKAPSTYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public EgenskapstypeEnum getEgenskapstype() {
    return egenskapstype;
  }


  @JsonProperty(JSON_PROPERTY_EGENSKAPSTYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEgenskapstype(@jakarta.annotation.Nonnull EgenskapstypeEnum egenskapstype) {
    this.egenskapstype = egenskapstype;
  }

  public Stedfesting kortnavn(@jakarta.annotation.Nullable String kortnavn) {
    
    this.kortnavn = kortnavn;
    return this;
  }

  /**
   * Get kortnavn
   * @return kortnavn
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KORTNAVN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKortnavn() {
    return kortnavn;
  }


  @JsonProperty(JSON_PROPERTY_KORTNAVN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKortnavn(@jakarta.annotation.Nullable String kortnavn) {
    this.kortnavn = kortnavn;
  }

  public Stedfesting beskrivelse(@jakarta.annotation.Nullable String beskrivelse) {
    
    this.beskrivelse = beskrivelse;
    return this;
  }

  /**
   * Get beskrivelse
   * @return beskrivelse
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BESKRIVELSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBeskrivelse() {
    return beskrivelse;
  }


  @JsonProperty(JSON_PROPERTY_BESKRIVELSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBeskrivelse(@jakarta.annotation.Nullable String beskrivelse) {
    this.beskrivelse = beskrivelse;
  }

  public Stedfesting veiledning(@jakarta.annotation.Nullable String veiledning) {
    
    this.veiledning = veiledning;
    return this;
  }

  /**
   * Get veiledning
   * @return veiledning
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VEILEDNING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVeiledning() {
    return veiledning;
  }


  @JsonProperty(JSON_PROPERTY_VEILEDNING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVeiledning(@jakarta.annotation.Nullable String veiledning) {
    this.veiledning = veiledning;
  }

  public Stedfesting sosinavn(@jakarta.annotation.Nullable String sosinavn) {
    
    this.sosinavn = sosinavn;
    return this;
  }

  /**
   * Get sosinavn
   * @return sosinavn
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOSINAVN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSosinavn() {
    return sosinavn;
  }


  @JsonProperty(JSON_PROPERTY_SOSINAVN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSosinavn(@jakarta.annotation.Nullable String sosinavn) {
    this.sosinavn = sosinavn;
  }

  public Stedfesting sosinvdbnavn(@jakarta.annotation.Nullable String sosinvdbnavn) {
    
    this.sosinvdbnavn = sosinvdbnavn;
    return this;
  }

  /**
   * Get sosinvdbnavn
   * @return sosinvdbnavn
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOSINVDBNAVN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSosinvdbnavn() {
    return sosinvdbnavn;
  }


  @JsonProperty(JSON_PROPERTY_SOSINVDBNAVN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSosinvdbnavn(@jakarta.annotation.Nullable String sosinvdbnavn) {
    this.sosinvdbnavn = sosinvdbnavn;
  }

  public Stedfesting sorteringsnummer(@jakarta.annotation.Nonnull Integer sorteringsnummer) {
    
    this.sorteringsnummer = sorteringsnummer;
    return this;
  }

  /**
   * Get sorteringsnummer
   * @return sorteringsnummer
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SORTERINGSNUMMER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getSorteringsnummer() {
    return sorteringsnummer;
  }


  @JsonProperty(JSON_PROPERTY_SORTERINGSNUMMER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSorteringsnummer(@jakarta.annotation.Nonnull Integer sorteringsnummer) {
    this.sorteringsnummer = sorteringsnummer;
  }

  public Stedfesting avledet(@jakarta.annotation.Nonnull Boolean avledet) {
    
    this.avledet = avledet;
    return this;
  }

  /**
   * Get avledet
   * @return avledet
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AVLEDET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getAvledet() {
    return avledet;
  }


  @JsonProperty(JSON_PROPERTY_AVLEDET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAvledet(@jakarta.annotation.Nonnull Boolean avledet) {
    this.avledet = avledet;
  }

  public Stedfesting komplementærEgenskapstype(@jakarta.annotation.Nullable Integer komplementærEgenskapstype) {
    
    this.komplementærEgenskapstype = komplementærEgenskapstype;
    return this;
  }

  /**
   * Get komplementærEgenskapstype
   * @return komplementærEgenskapstype
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KOMPLEMENTæR_EGENSKAPSTYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getKomplementærEgenskapstype() {
    return komplementærEgenskapstype;
  }


  @JsonProperty(JSON_PROPERTY_KOMPLEMENTæR_EGENSKAPSTYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKomplementærEgenskapstype(@jakarta.annotation.Nullable Integer komplementærEgenskapstype) {
    this.komplementærEgenskapstype = komplementærEgenskapstype;
  }

  public Stedfesting skrivebeskyttet(@jakarta.annotation.Nonnull Boolean skrivebeskyttet) {
    
    this.skrivebeskyttet = skrivebeskyttet;
    return this;
  }

  /**
   * Get skrivebeskyttet
   * @return skrivebeskyttet
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SKRIVEBESKYTTET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getSkrivebeskyttet() {
    return skrivebeskyttet;
  }


  @JsonProperty(JSON_PROPERTY_SKRIVEBESKYTTET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSkrivebeskyttet(@jakarta.annotation.Nonnull Boolean skrivebeskyttet) {
    this.skrivebeskyttet = skrivebeskyttet;
  }

  public Stedfesting obligatoriskVerdi(@jakarta.annotation.Nonnull Boolean obligatoriskVerdi) {
    
    this.obligatoriskVerdi = obligatoriskVerdi;
    return this;
  }

  /**
   * Get obligatoriskVerdi
   * @return obligatoriskVerdi
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OBLIGATORISK_VERDI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getObligatoriskVerdi() {
    return obligatoriskVerdi;
  }


  @JsonProperty(JSON_PROPERTY_OBLIGATORISK_VERDI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setObligatoriskVerdi(@jakarta.annotation.Nonnull Boolean obligatoriskVerdi) {
    this.obligatoriskVerdi = obligatoriskVerdi;
  }

  public Stedfesting sensitivitet(@jakarta.annotation.Nonnull Integer sensitivitet) {
    
    this.sensitivitet = sensitivitet;
    return this;
  }

  /**
   * Get sensitivitet
   * @return sensitivitet
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SENSITIVITET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getSensitivitet() {
    return sensitivitet;
  }


  @JsonProperty(JSON_PROPERTY_SENSITIVITET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSensitivitet(@jakarta.annotation.Nonnull Integer sensitivitet) {
    this.sensitivitet = sensitivitet;
  }

  public Stedfesting gruppesorteringsnummer(@jakarta.annotation.Nullable Integer gruppesorteringsnummer) {
    
    this.gruppesorteringsnummer = gruppesorteringsnummer;
    return this;
  }

  /**
   * Get gruppesorteringsnummer
   * @return gruppesorteringsnummer
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GRUPPESORTERINGSNUMMER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getGruppesorteringsnummer() {
    return gruppesorteringsnummer;
  }


  @JsonProperty(JSON_PROPERTY_GRUPPESORTERINGSNUMMER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGruppesorteringsnummer(@jakarta.annotation.Nullable Integer gruppesorteringsnummer) {
    this.gruppesorteringsnummer = gruppesorteringsnummer;
  }

  public Stedfesting grunnrissreferanse(@jakarta.annotation.Nullable String grunnrissreferanse) {
    
    this.grunnrissreferanse = grunnrissreferanse;
    return this;
  }

  /**
   * Get grunnrissreferanse
   * @return grunnrissreferanse
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GRUNNRISSREFERANSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGrunnrissreferanse() {
    return grunnrissreferanse;
  }


  @JsonProperty(JSON_PROPERTY_GRUNNRISSREFERANSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGrunnrissreferanse(@jakarta.annotation.Nullable String grunnrissreferanse) {
    this.grunnrissreferanse = grunnrissreferanse;
  }

  public Stedfesting høydereferanse(@jakarta.annotation.Nullable String høydereferanse) {
    
    this.høydereferanse = høydereferanse;
    return this;
  }

  /**
   * Get høydereferanse
   * @return høydereferanse
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HøYDEREFERANSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHøydereferanse() {
    return høydereferanse;
  }


  @JsonProperty(JSON_PROPERTY_HøYDEREFERANSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHøydereferanse(@jakarta.annotation.Nullable String høydereferanse) {
    this.høydereferanse = høydereferanse;
  }

  public Stedfesting høydereferanseTall(@jakarta.annotation.Nonnull Integer høydereferanseTall) {
    
    this.høydereferanseTall = høydereferanseTall;
    return this;
  }

  /**
   * Get høydereferanseTall
   * @return høydereferanseTall
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HøYDEREFERANSE_TALL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getHøydereferanseTall() {
    return høydereferanseTall;
  }


  @JsonProperty(JSON_PROPERTY_HøYDEREFERANSE_TALL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHøydereferanseTall(@jakarta.annotation.Nonnull Integer høydereferanseTall) {
    this.høydereferanseTall = høydereferanseTall;
  }

  public Stedfesting nøyaktighetskravGrunnriss(@jakarta.annotation.Nonnull Double nøyaktighetskravGrunnriss) {
    
    this.nøyaktighetskravGrunnriss = nøyaktighetskravGrunnriss;
    return this;
  }

  /**
   * Get nøyaktighetskravGrunnriss
   * @return nøyaktighetskravGrunnriss
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NøYAKTIGHETSKRAV_GRUNNRISS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getNøyaktighetskravGrunnriss() {
    return nøyaktighetskravGrunnriss;
  }


  @JsonProperty(JSON_PROPERTY_NøYAKTIGHETSKRAV_GRUNNRISS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNøyaktighetskravGrunnriss(@jakarta.annotation.Nonnull Double nøyaktighetskravGrunnriss) {
    this.nøyaktighetskravGrunnriss = nøyaktighetskravGrunnriss;
  }

  public Stedfesting nøyaktighetskravHøyde(@jakarta.annotation.Nonnull Double nøyaktighetskravHøyde) {
    
    this.nøyaktighetskravHøyde = nøyaktighetskravHøyde;
    return this;
  }

  /**
   * Get nøyaktighetskravHøyde
   * @return nøyaktighetskravHøyde
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NøYAKTIGHETSKRAV_HøYDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getNøyaktighetskravHøyde() {
    return nøyaktighetskravHøyde;
  }


  @JsonProperty(JSON_PROPERTY_NøYAKTIGHETSKRAV_HøYDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNøyaktighetskravHøyde(@jakarta.annotation.Nonnull Double nøyaktighetskravHøyde) {
    this.nøyaktighetskravHøyde = nøyaktighetskravHøyde;
  }

  public Stedfesting sosiReferanse(@jakarta.annotation.Nullable String sosiReferanse) {
    
    this.sosiReferanse = sosiReferanse;
    return this;
  }

  /**
   * Get sosiReferanse
   * @return sosiReferanse
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOSI_REFERANSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSosiReferanse() {
    return sosiReferanse;
  }


  @JsonProperty(JSON_PROPERTY_SOSI_REFERANSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSosiReferanse(@jakarta.annotation.Nullable String sosiReferanse) {
    this.sosiReferanse = sosiReferanse;
  }

  public Stedfesting referansegeometriTilstrekkelig(@jakarta.annotation.Nonnull Boolean referansegeometriTilstrekkelig) {
    
    this.referansegeometriTilstrekkelig = referansegeometriTilstrekkelig;
    return this;
  }

  /**
   * Get referansegeometriTilstrekkelig
   * @return referansegeometriTilstrekkelig
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REFERANSEGEOMETRI_TILSTREKKELIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getReferansegeometriTilstrekkelig() {
    return referansegeometriTilstrekkelig;
  }


  @JsonProperty(JSON_PROPERTY_REFERANSEGEOMETRI_TILSTREKKELIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReferansegeometriTilstrekkelig(@jakarta.annotation.Nonnull Boolean referansegeometriTilstrekkelig) {
    this.referansegeometriTilstrekkelig = referansegeometriTilstrekkelig;
  }

  public Stedfesting viktighet(@jakarta.annotation.Nonnull Viktighet viktighet) {
    
    this.viktighet = viktighet;
    return this;
  }

  /**
   * Get viktighet
   * @return viktighet
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VIKTIGHET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Viktighet getViktighet() {
    return viktighet;
  }


  @JsonProperty(JSON_PROPERTY_VIKTIGHET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setViktighet(@jakarta.annotation.Nonnull Viktighet viktighet) {
    this.viktighet = viktighet;
  }

  public Stedfesting kategori(@jakarta.annotation.Nonnull Integer kategori) {
    
    this.kategori = kategori;
    return this;
  }

  /**
   * Get kategori
   * @return kategori
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_KATEGORI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getKategori() {
    return kategori;
  }


  @JsonProperty(JSON_PROPERTY_KATEGORI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKategori(@jakarta.annotation.Nonnull Integer kategori) {
    this.kategori = kategori;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Stedfesting stedfesting = (Stedfesting) o;
    return Objects.equals(this.id, stedfesting.id) &&
        Objects.equals(this.navn, stedfesting.navn) &&
        Objects.equals(this.egenskapstype, stedfesting.egenskapstype) &&
        Objects.equals(this.kortnavn, stedfesting.kortnavn) &&
        Objects.equals(this.beskrivelse, stedfesting.beskrivelse) &&
        Objects.equals(this.veiledning, stedfesting.veiledning) &&
        Objects.equals(this.sosinavn, stedfesting.sosinavn) &&
        Objects.equals(this.sosinvdbnavn, stedfesting.sosinvdbnavn) &&
        Objects.equals(this.sorteringsnummer, stedfesting.sorteringsnummer) &&
        Objects.equals(this.avledet, stedfesting.avledet) &&
        Objects.equals(this.komplementærEgenskapstype, stedfesting.komplementærEgenskapstype) &&
        Objects.equals(this.skrivebeskyttet, stedfesting.skrivebeskyttet) &&
        Objects.equals(this.obligatoriskVerdi, stedfesting.obligatoriskVerdi) &&
        Objects.equals(this.sensitivitet, stedfesting.sensitivitet) &&
        Objects.equals(this.gruppesorteringsnummer, stedfesting.gruppesorteringsnummer) &&
        Objects.equals(this.grunnrissreferanse, stedfesting.grunnrissreferanse) &&
        Objects.equals(this.høydereferanse, stedfesting.høydereferanse) &&
        Objects.equals(this.høydereferanseTall, stedfesting.høydereferanseTall) &&
        Objects.equals(this.nøyaktighetskravGrunnriss, stedfesting.nøyaktighetskravGrunnriss) &&
        Objects.equals(this.nøyaktighetskravHøyde, stedfesting.nøyaktighetskravHøyde) &&
        Objects.equals(this.sosiReferanse, stedfesting.sosiReferanse) &&
        Objects.equals(this.referansegeometriTilstrekkelig, stedfesting.referansegeometriTilstrekkelig) &&
        Objects.equals(this.viktighet, stedfesting.viktighet) &&
        Objects.equals(this.kategori, stedfesting.kategori);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, navn, egenskapstype, kortnavn, beskrivelse, veiledning, sosinavn, sosinvdbnavn, sorteringsnummer, avledet, komplementærEgenskapstype, skrivebeskyttet, obligatoriskVerdi, sensitivitet, gruppesorteringsnummer, grunnrissreferanse, høydereferanse, høydereferanseTall, nøyaktighetskravGrunnriss, nøyaktighetskravHøyde, sosiReferanse, referansegeometriTilstrekkelig, viktighet, kategori);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Stedfesting {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    navn: ").append(toIndentedString(navn)).append("\n");
    sb.append("    egenskapstype: ").append(toIndentedString(egenskapstype)).append("\n");
    sb.append("    kortnavn: ").append(toIndentedString(kortnavn)).append("\n");
    sb.append("    beskrivelse: ").append(toIndentedString(beskrivelse)).append("\n");
    sb.append("    veiledning: ").append(toIndentedString(veiledning)).append("\n");
    sb.append("    sosinavn: ").append(toIndentedString(sosinavn)).append("\n");
    sb.append("    sosinvdbnavn: ").append(toIndentedString(sosinvdbnavn)).append("\n");
    sb.append("    sorteringsnummer: ").append(toIndentedString(sorteringsnummer)).append("\n");
    sb.append("    avledet: ").append(toIndentedString(avledet)).append("\n");
    sb.append("    komplementærEgenskapstype: ").append(toIndentedString(komplementærEgenskapstype)).append("\n");
    sb.append("    skrivebeskyttet: ").append(toIndentedString(skrivebeskyttet)).append("\n");
    sb.append("    obligatoriskVerdi: ").append(toIndentedString(obligatoriskVerdi)).append("\n");
    sb.append("    sensitivitet: ").append(toIndentedString(sensitivitet)).append("\n");
    sb.append("    gruppesorteringsnummer: ").append(toIndentedString(gruppesorteringsnummer)).append("\n");
    sb.append("    grunnrissreferanse: ").append(toIndentedString(grunnrissreferanse)).append("\n");
    sb.append("    høydereferanse: ").append(toIndentedString(høydereferanse)).append("\n");
    sb.append("    høydereferanseTall: ").append(toIndentedString(høydereferanseTall)).append("\n");
    sb.append("    nøyaktighetskravGrunnriss: ").append(toIndentedString(nøyaktighetskravGrunnriss)).append("\n");
    sb.append("    nøyaktighetskravHøyde: ").append(toIndentedString(nøyaktighetskravHøyde)).append("\n");
    sb.append("    sosiReferanse: ").append(toIndentedString(sosiReferanse)).append("\n");
    sb.append("    referansegeometriTilstrekkelig: ").append(toIndentedString(referansegeometriTilstrekkelig)).append("\n");
    sb.append("    viktighet: ").append(toIndentedString(viktighet)).append("\n");
    sb.append("    kategori: ").append(toIndentedString(kategori)).append("\n");
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


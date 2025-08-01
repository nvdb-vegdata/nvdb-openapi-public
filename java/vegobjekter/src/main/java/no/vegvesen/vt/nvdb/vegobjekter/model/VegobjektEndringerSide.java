/*
 * NVDB API Les Vegobjekter
 * Dette API-et brukes til å lese vegobjekter. Les mer om bruk av API-et på https://nvdb.atlas.vegvesen.no/produkter/nvdbapil/v4/Vegobjekter
 *
 * The version of the OpenAPI document: v4
 * Contact: nvdb@vegvesen.no
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package no.vegvesen.vt.nvdb.vegobjekter.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import no.vegvesen.vt.nvdb.vegobjekter.model.SideMetadata;
import no.vegvesen.vt.nvdb.vegobjekter.model.VegobjektEndret;
import no.vegvesen.vt.nvdb.vegobjekter.model.VegobjektFjernet;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * VegobjektEndringerSide
 */
@JsonPropertyOrder({
  VegobjektEndringerSide.JSON_PROPERTY_VEGOBJEKT_VERSJONER_ENDRET,
  VegobjektEndringerSide.JSON_PROPERTY_VEGOBJEKT_VERSJONER_FJERNET,
  VegobjektEndringerSide.JSON_PROPERTY_METADATA
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public class VegobjektEndringerSide {
  public static final String JSON_PROPERTY_VEGOBJEKT_VERSJONER_ENDRET = "vegobjektVersjonerEndret";
  @jakarta.annotation.Nonnull
  private List<VegobjektEndret> vegobjektVersjonerEndret = new ArrayList<>();

  public static final String JSON_PROPERTY_VEGOBJEKT_VERSJONER_FJERNET = "vegobjektVersjonerFjernet";
  @jakarta.annotation.Nonnull
  private List<VegobjektFjernet> vegobjektVersjonerFjernet = new ArrayList<>();

  public static final String JSON_PROPERTY_METADATA = "metadata";
  @jakarta.annotation.Nonnull
  private SideMetadata metadata;

  public VegobjektEndringerSide() {
  }

  public VegobjektEndringerSide vegobjektVersjonerEndret(@jakarta.annotation.Nonnull List<VegobjektEndret> vegobjektVersjonerEndret) {
    
    this.vegobjektVersjonerEndret = vegobjektVersjonerEndret;
    return this;
  }

  public VegobjektEndringerSide addVegobjektVersjonerEndretItem(VegobjektEndret vegobjektVersjonerEndretItem) {
    if (this.vegobjektVersjonerEndret == null) {
      this.vegobjektVersjonerEndret = new ArrayList<>();
    }
    this.vegobjektVersjonerEndret.add(vegobjektVersjonerEndretItem);
    return this;
  }

  /**
   * Liste med alle endringer som oppretter eller endrer versjoner av vegobjekter
   * @return vegobjektVersjonerEndret
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VEGOBJEKT_VERSJONER_ENDRET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<VegobjektEndret> getVegobjektVersjonerEndret() {
    return vegobjektVersjonerEndret;
  }


  @JsonProperty(JSON_PROPERTY_VEGOBJEKT_VERSJONER_ENDRET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVegobjektVersjonerEndret(@jakarta.annotation.Nonnull List<VegobjektEndret> vegobjektVersjonerEndret) {
    this.vegobjektVersjonerEndret = vegobjektVersjonerEndret;
  }

  public VegobjektEndringerSide vegobjektVersjonerFjernet(@jakarta.annotation.Nonnull List<VegobjektFjernet> vegobjektVersjonerFjernet) {
    
    this.vegobjektVersjonerFjernet = vegobjektVersjonerFjernet;
    return this;
  }

  public VegobjektEndringerSide addVegobjektVersjonerFjernetItem(VegobjektFjernet vegobjektVersjonerFjernetItem) {
    if (this.vegobjektVersjonerFjernet == null) {
      this.vegobjektVersjonerFjernet = new ArrayList<>();
    }
    this.vegobjektVersjonerFjernet.add(vegobjektVersjonerFjernetItem);
    return this;
  }

  /**
   * Liste med alle endringer som fjerner versjoner av vegobjekter
   * @return vegobjektVersjonerFjernet
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VEGOBJEKT_VERSJONER_FJERNET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<VegobjektFjernet> getVegobjektVersjonerFjernet() {
    return vegobjektVersjonerFjernet;
  }


  @JsonProperty(JSON_PROPERTY_VEGOBJEKT_VERSJONER_FJERNET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVegobjektVersjonerFjernet(@jakarta.annotation.Nonnull List<VegobjektFjernet> vegobjektVersjonerFjernet) {
    this.vegobjektVersjonerFjernet = vegobjektVersjonerFjernet;
  }

  public VegobjektEndringerSide metadata(@jakarta.annotation.Nonnull SideMetadata metadata) {
    
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SideMetadata getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMetadata(@jakarta.annotation.Nonnull SideMetadata metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VegobjektEndringerSide vegobjektEndringerSide = (VegobjektEndringerSide) o;
    return Objects.equals(this.vegobjektVersjonerEndret, vegobjektEndringerSide.vegobjektVersjonerEndret) &&
        Objects.equals(this.vegobjektVersjonerFjernet, vegobjektEndringerSide.vegobjektVersjonerFjernet) &&
        Objects.equals(this.metadata, vegobjektEndringerSide.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vegobjektVersjonerEndret, vegobjektVersjonerFjernet, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VegobjektEndringerSide {\n");
    sb.append("    vegobjektVersjonerEndret: ").append(toIndentedString(vegobjektVersjonerEndret)).append("\n");
    sb.append("    vegobjektVersjonerFjernet: ").append(toIndentedString(vegobjektVersjonerFjernet)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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


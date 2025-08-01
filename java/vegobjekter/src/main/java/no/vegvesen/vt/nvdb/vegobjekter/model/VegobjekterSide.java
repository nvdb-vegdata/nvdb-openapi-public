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
import no.vegvesen.vt.nvdb.vegobjekter.model.Vegobjekt;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * VegobjekterSide
 */
@JsonPropertyOrder({
  VegobjekterSide.JSON_PROPERTY_OBJEKTER,
  VegobjekterSide.JSON_PROPERTY_METADATA
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public class VegobjekterSide {
  public static final String JSON_PROPERTY_OBJEKTER = "objekter";
  @jakarta.annotation.Nonnull
  private List<Vegobjekt> objekter = new ArrayList<>();

  public static final String JSON_PROPERTY_METADATA = "metadata";
  @jakarta.annotation.Nonnull
  private SideMetadata metadata;

  public VegobjekterSide() {
  }

  public VegobjekterSide objekter(@jakarta.annotation.Nonnull List<Vegobjekt> objekter) {
    
    this.objekter = objekter;
    return this;
  }

  public VegobjekterSide addObjekterItem(Vegobjekt objekterItem) {
    if (this.objekter == null) {
      this.objekter = new ArrayList<>();
    }
    this.objekter.add(objekterItem);
    return this;
  }

  /**
   * Get objekter
   * @return objekter
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OBJEKTER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Vegobjekt> getObjekter() {
    return objekter;
  }


  @JsonProperty(JSON_PROPERTY_OBJEKTER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setObjekter(@jakarta.annotation.Nonnull List<Vegobjekt> objekter) {
    this.objekter = objekter;
  }

  public VegobjekterSide metadata(@jakarta.annotation.Nonnull SideMetadata metadata) {
    
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
    VegobjekterSide vegobjekterSide = (VegobjekterSide) o;
    return Objects.equals(this.objekter, vegobjekterSide.objekter) &&
        Objects.equals(this.metadata, vegobjekterSide.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objekter, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VegobjekterSide {\n");
    sb.append("    objekter: ").append(toIndentedString(objekter)).append("\n");
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


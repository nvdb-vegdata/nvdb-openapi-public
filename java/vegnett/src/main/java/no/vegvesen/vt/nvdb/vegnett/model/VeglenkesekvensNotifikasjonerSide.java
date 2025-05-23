/*
 * NVDB API Les Vegnett
 * Dette API-et brukes til å lese vegnettelementer. Les mer om bruk av API-et på https://nvdb.test.atlas.vegvesen.no/produkter/nvdbapil/v4/Vegnett
 *
 * The version of the OpenAPI document: v4
 * Contact: nvdb@vegvesen.no
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package no.vegvesen.vt.nvdb.vegnett.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import no.vegvesen.vt.nvdb.vegnett.model.SideMetadata;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * VeglenkesekvensNotifikasjonerSide
 */
@JsonPropertyOrder({
  VeglenkesekvensNotifikasjonerSide.JSON_PROPERTY_VEGLENKESEKVENSER_ENDRET,
  VeglenkesekvensNotifikasjonerSide.JSON_PROPERTY_VEGLENKESEKVENSER_FJERNET,
  VeglenkesekvensNotifikasjonerSide.JSON_PROPERTY_VEGLENKESEKVENSER_SEGMENTERT,
  VeglenkesekvensNotifikasjonerSide.JSON_PROPERTY_METADATA
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.13.0")
public class VeglenkesekvensNotifikasjonerSide {
  public static final String JSON_PROPERTY_VEGLENKESEKVENSER_ENDRET = "veglenkesekvenserEndret";
  @jakarta.annotation.Nonnull
  private Set<Long> veglenkesekvenserEndret = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_VEGLENKESEKVENSER_FJERNET = "veglenkesekvenserFjernet";
  @jakarta.annotation.Nonnull
  private Set<Long> veglenkesekvenserFjernet = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_VEGLENKESEKVENSER_SEGMENTERT = "veglenkesekvenserSegmentert";
  @jakarta.annotation.Nonnull
  private Set<Long> veglenkesekvenserSegmentert = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_METADATA = "metadata";
  @jakarta.annotation.Nonnull
  private SideMetadata metadata;

  public VeglenkesekvensNotifikasjonerSide() {
  }

  public VeglenkesekvensNotifikasjonerSide veglenkesekvenserEndret(@jakarta.annotation.Nonnull Set<Long> veglenkesekvenserEndret) {
    
    this.veglenkesekvenserEndret = veglenkesekvenserEndret;
    return this;
  }

  public VeglenkesekvensNotifikasjonerSide addVeglenkesekvenserEndretItem(Long veglenkesekvenserEndretItem) {
    if (this.veglenkesekvenserEndret == null) {
      this.veglenkesekvenserEndret = new LinkedHashSet<>();
    }
    this.veglenkesekvenserEndret.add(veglenkesekvenserEndretItem);
    return this;
  }

  /**
   * Get veglenkesekvenserEndret
   * @return veglenkesekvenserEndret
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VEGLENKESEKVENSER_ENDRET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Set<Long> getVeglenkesekvenserEndret() {
    return veglenkesekvenserEndret;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_VEGLENKESEKVENSER_ENDRET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVeglenkesekvenserEndret(@jakarta.annotation.Nonnull Set<Long> veglenkesekvenserEndret) {
    this.veglenkesekvenserEndret = veglenkesekvenserEndret;
  }

  public VeglenkesekvensNotifikasjonerSide veglenkesekvenserFjernet(@jakarta.annotation.Nonnull Set<Long> veglenkesekvenserFjernet) {
    
    this.veglenkesekvenserFjernet = veglenkesekvenserFjernet;
    return this;
  }

  public VeglenkesekvensNotifikasjonerSide addVeglenkesekvenserFjernetItem(Long veglenkesekvenserFjernetItem) {
    if (this.veglenkesekvenserFjernet == null) {
      this.veglenkesekvenserFjernet = new LinkedHashSet<>();
    }
    this.veglenkesekvenserFjernet.add(veglenkesekvenserFjernetItem);
    return this;
  }

  /**
   * Get veglenkesekvenserFjernet
   * @return veglenkesekvenserFjernet
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VEGLENKESEKVENSER_FJERNET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Set<Long> getVeglenkesekvenserFjernet() {
    return veglenkesekvenserFjernet;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_VEGLENKESEKVENSER_FJERNET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVeglenkesekvenserFjernet(@jakarta.annotation.Nonnull Set<Long> veglenkesekvenserFjernet) {
    this.veglenkesekvenserFjernet = veglenkesekvenserFjernet;
  }

  public VeglenkesekvensNotifikasjonerSide veglenkesekvenserSegmentert(@jakarta.annotation.Nonnull Set<Long> veglenkesekvenserSegmentert) {
    
    this.veglenkesekvenserSegmentert = veglenkesekvenserSegmentert;
    return this;
  }

  public VeglenkesekvensNotifikasjonerSide addVeglenkesekvenserSegmentertItem(Long veglenkesekvenserSegmentertItem) {
    if (this.veglenkesekvenserSegmentert == null) {
      this.veglenkesekvenserSegmentert = new LinkedHashSet<>();
    }
    this.veglenkesekvenserSegmentert.add(veglenkesekvenserSegmentertItem);
    return this;
  }

  /**
   * Get veglenkesekvenserSegmentert
   * @return veglenkesekvenserSegmentert
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VEGLENKESEKVENSER_SEGMENTERT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Set<Long> getVeglenkesekvenserSegmentert() {
    return veglenkesekvenserSegmentert;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_VEGLENKESEKVENSER_SEGMENTERT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVeglenkesekvenserSegmentert(@jakarta.annotation.Nonnull Set<Long> veglenkesekvenserSegmentert) {
    this.veglenkesekvenserSegmentert = veglenkesekvenserSegmentert;
  }

  public VeglenkesekvensNotifikasjonerSide metadata(@jakarta.annotation.Nonnull SideMetadata metadata) {
    
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
    VeglenkesekvensNotifikasjonerSide veglenkesekvensNotifikasjonerSide = (VeglenkesekvensNotifikasjonerSide) o;
    return Objects.equals(this.veglenkesekvenserEndret, veglenkesekvensNotifikasjonerSide.veglenkesekvenserEndret) &&
        Objects.equals(this.veglenkesekvenserFjernet, veglenkesekvensNotifikasjonerSide.veglenkesekvenserFjernet) &&
        Objects.equals(this.veglenkesekvenserSegmentert, veglenkesekvensNotifikasjonerSide.veglenkesekvenserSegmentert) &&
        Objects.equals(this.metadata, veglenkesekvensNotifikasjonerSide.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(veglenkesekvenserEndret, veglenkesekvenserFjernet, veglenkesekvenserSegmentert, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VeglenkesekvensNotifikasjonerSide {\n");
    sb.append("    veglenkesekvenserEndret: ").append(toIndentedString(veglenkesekvenserEndret)).append("\n");
    sb.append("    veglenkesekvenserFjernet: ").append(toIndentedString(veglenkesekvenserFjernet)).append("\n");
    sb.append("    veglenkesekvenserSegmentert: ").append(toIndentedString(veglenkesekvenserSegmentert)).append("\n");
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


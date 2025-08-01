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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import no.vegvesen.vt.nvdb.vegnett.model.SideMetadata;
import no.vegvesen.vt.nvdb.vegnett.model.VeglenkesekvensFjernet;
import no.vegvesen.vt.nvdb.vegnett.model.VeglenkesekvensSegmentert;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * VeglenkesekvensEndringerSide
 */
@JsonPropertyOrder({
  VeglenkesekvensEndringerSide.JSON_PROPERTY_VEGLENKESEKVENSER_FJERNET,
  VeglenkesekvensEndringerSide.JSON_PROPERTY_VEGLENKESEKVENSER_SEGMENTERT,
  VeglenkesekvensEndringerSide.JSON_PROPERTY_METADATA
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public class VeglenkesekvensEndringerSide {
  public static final String JSON_PROPERTY_VEGLENKESEKVENSER_FJERNET = "veglenkesekvenserFjernet";
  @jakarta.annotation.Nonnull
  private List<VeglenkesekvensFjernet> veglenkesekvenserFjernet = new ArrayList<>();

  public static final String JSON_PROPERTY_VEGLENKESEKVENSER_SEGMENTERT = "veglenkesekvenserSegmentert";
  @jakarta.annotation.Nonnull
  private List<VeglenkesekvensSegmentert> veglenkesekvenserSegmentert = new ArrayList<>();

  public static final String JSON_PROPERTY_METADATA = "metadata";
  @jakarta.annotation.Nonnull
  private SideMetadata metadata;

  public VeglenkesekvensEndringerSide() {
  }

  public VeglenkesekvensEndringerSide veglenkesekvenserFjernet(@jakarta.annotation.Nonnull List<VeglenkesekvensFjernet> veglenkesekvenserFjernet) {
    
    this.veglenkesekvenserFjernet = veglenkesekvenserFjernet;
    return this;
  }

  public VeglenkesekvensEndringerSide addVeglenkesekvenserFjernetItem(VeglenkesekvensFjernet veglenkesekvenserFjernetItem) {
    if (this.veglenkesekvenserFjernet == null) {
      this.veglenkesekvenserFjernet = new ArrayList<>();
    }
    this.veglenkesekvenserFjernet.add(veglenkesekvenserFjernetItem);
    return this;
  }

  /**
   * Liste med alle endringer som fjerner veglenkesekvenser
   * @return veglenkesekvenserFjernet
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VEGLENKESEKVENSER_FJERNET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<VeglenkesekvensFjernet> getVeglenkesekvenserFjernet() {
    return veglenkesekvenserFjernet;
  }


  @JsonProperty(JSON_PROPERTY_VEGLENKESEKVENSER_FJERNET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVeglenkesekvenserFjernet(@jakarta.annotation.Nonnull List<VeglenkesekvensFjernet> veglenkesekvenserFjernet) {
    this.veglenkesekvenserFjernet = veglenkesekvenserFjernet;
  }

  public VeglenkesekvensEndringerSide veglenkesekvenserSegmentert(@jakarta.annotation.Nonnull List<VeglenkesekvensSegmentert> veglenkesekvenserSegmentert) {
    
    this.veglenkesekvenserSegmentert = veglenkesekvenserSegmentert;
    return this;
  }

  public VeglenkesekvensEndringerSide addVeglenkesekvenserSegmentertItem(VeglenkesekvensSegmentert veglenkesekvenserSegmentertItem) {
    if (this.veglenkesekvenserSegmentert == null) {
      this.veglenkesekvenserSegmentert = new ArrayList<>();
    }
    this.veglenkesekvenserSegmentert.add(veglenkesekvenserSegmentertItem);
    return this;
  }

  /**
   * Liste med alle endringer i segmentering av veglenkesekvenser
   * @return veglenkesekvenserSegmentert
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VEGLENKESEKVENSER_SEGMENTERT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<VeglenkesekvensSegmentert> getVeglenkesekvenserSegmentert() {
    return veglenkesekvenserSegmentert;
  }


  @JsonProperty(JSON_PROPERTY_VEGLENKESEKVENSER_SEGMENTERT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVeglenkesekvenserSegmentert(@jakarta.annotation.Nonnull List<VeglenkesekvensSegmentert> veglenkesekvenserSegmentert) {
    this.veglenkesekvenserSegmentert = veglenkesekvenserSegmentert;
  }

  public VeglenkesekvensEndringerSide metadata(@jakarta.annotation.Nonnull SideMetadata metadata) {
    
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
    VeglenkesekvensEndringerSide veglenkesekvensEndringerSide = (VeglenkesekvensEndringerSide) o;
    return Objects.equals(this.veglenkesekvenserFjernet, veglenkesekvensEndringerSide.veglenkesekvenserFjernet) &&
        Objects.equals(this.veglenkesekvenserSegmentert, veglenkesekvensEndringerSide.veglenkesekvenserSegmentert) &&
        Objects.equals(this.metadata, veglenkesekvensEndringerSide.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(veglenkesekvenserFjernet, veglenkesekvenserSegmentert, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VeglenkesekvensEndringerSide {\n");
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


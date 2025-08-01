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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets InkluderIVegobjekt
 */
public enum InkluderIVegobjekt {
  
  METADATA("metadata"),
  
  EGENSKAPER("egenskaper"),
  
  RELASJONER("relasjoner"),
  
  LOKASJON("lokasjon"),
  
  VEGSEGMENTER("vegsegmenter"),
  
  GEOMETRI("geometri"),
  
  ALLE("alle"),
  
  MINIMUM("minimum");

  private String value;

  InkluderIVegobjekt(String value) {
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
  public static InkluderIVegobjekt fromValue(String value) {
    for (InkluderIVegobjekt b : InkluderIVegobjekt.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


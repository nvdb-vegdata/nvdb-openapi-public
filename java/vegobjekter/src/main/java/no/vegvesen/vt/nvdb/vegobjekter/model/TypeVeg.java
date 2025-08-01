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
 * Gets or Sets TypeVeg
 */
public enum TypeVeg {
  
  KANALISERT_VEG("Kanalisert veg"),
  
  ENKEL_BILVEG("Enkel bilveg"),
  
  RAMPE("Rampe"),
  
  RUNDKJ_RING("Rundkjøring"),
  
  BILFERJE("Bilferje"),
  
  PASSASJERFERJE("Passasjerferje"),
  
  GANG_OG_SYKKELVEG("Gang- og sykkelveg"),
  
  SYKKELVEG("Sykkelveg"),
  
  GANGVEG("Gangveg"),
  
  G_GATE("Gågate"),
  
  FORTAU("Fortau"),
  
  TRAPP("Trapp"),
  
  GANGFELT("Gangfelt"),
  
  GATETUN("Gatetun"),
  
  TRAKTORVEG("Traktorveg"),
  
  STI("Sti"),
  
  ANNET("Annet");

  private String value;

  TypeVeg(String value) {
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
  public static TypeVeg fromValue(String value) {
    for (TypeVeg b : TypeVeg.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


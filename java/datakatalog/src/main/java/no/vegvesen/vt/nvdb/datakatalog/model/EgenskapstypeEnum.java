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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EgenskapstypeEnum
 */
public enum EgenskapstypeEnum {
  
  ASSOSIASJON("Assosiasjon"),
  
  BOOLSK("Boolsk"),
  
  BIN_R("Binær"),
  
  TEKST("Tekst"),
  
  DATO("Dato"),
  
  FLYTTALL("Flyttall"),
  
  HELTALL("Heltall"),
  
  STRUKTUR("Struktur"),
  
  GEOMETRI("Geometri"),
  
  STEDFESTING("Stedfesting"),
  
  KORTDATO("Kortdato"),
  
  TID("Tid"),
  
  LISTE("Liste"),
  
  TEKSTENUM("Tekstenum"),
  
  HELTALLENUM("Heltallenum"),
  
  FLYTTALLENUM("Flyttallenum");

  private String value;

  EgenskapstypeEnum(String value) {
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
  public static EgenskapstypeEnum fromValue(String value) {
    for (EgenskapstypeEnum b : EgenskapstypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


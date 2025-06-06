/* tslint:disable */
/* eslint-disable */
/**
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

import { mapValues } from '../runtime'
/**
 *
 * @export
 * @interface EnumverdiTekst
 */
export interface EnumverdiTekst {
  /**
   *
   * @type {number}
   * @memberof EnumverdiTekst
   */
  id: number
  /**
   *
   * @type {string}
   * @memberof EnumverdiTekst
   */
  kortnavn?: string
  /**
   *
   * @type {number}
   * @memberof EnumverdiTekst
   */
  kortnavnlengde?: number
  /**
   *
   * @type {boolean}
   * @memberof EnumverdiTekst
   */
  kortnavnBrukbar: boolean
  /**
   *
   * @type {string}
   * @memberof EnumverdiTekst
   */
  beskrivelse?: string
  /**
   *
   * @type {number}
   * @memberof EnumverdiTekst
   */
  sorteringsnummer: number
  /**
   *
   * @type {Date}
   * @memberof EnumverdiTekst
   */
  objektlisteDato?: Date
  /**
   *
   * @type {Date}
   * @memberof EnumverdiTekst
   */
  sluttdato?: Date
  /**
   *
   * @type {boolean}
   * @memberof EnumverdiTekst
   */
  standardverdi: boolean
  /**
   *
   * @type {number}
   * @memberof EnumverdiTekst
   */
  komplementrEnumverdi?: number
  /**
   *
   * @type {string}
   * @memberof EnumverdiTekst
   */
  verdi?: string
  /**
   *
   * @type {string}
   * @memberof EnumverdiTekst
   */
  type: string
}

/**
 * Check if a given object implements the EnumverdiTekst interface.
 */
export function instanceOfEnumverdiTekst(
  value: object,
): value is EnumverdiTekst {
  if (!('id' in value) || value['id'] === undefined) return false
  if (!('kortnavnBrukbar' in value) || value['kortnavnBrukbar'] === undefined)
    return false
  if (!('sorteringsnummer' in value) || value['sorteringsnummer'] === undefined)
    return false
  if (!('standardverdi' in value) || value['standardverdi'] === undefined)
    return false
  if (!('type' in value) || value['type'] === undefined) return false
  return true
}

export function EnumverdiTekstFromJSON(json: any): EnumverdiTekst {
  return EnumverdiTekstFromJSONTyped(json, false)
}

export function EnumverdiTekstFromJSONTyped(
  json: any,
  ignoreDiscriminator: boolean,
): EnumverdiTekst {
  if (json == null) {
    return json
  }
  return {
    id: json['id'],
    kortnavn: json['kortnavn'] == null ? undefined : json['kortnavn'],
    kortnavnlengde:
      json['kortnavnlengde'] == null ? undefined : json['kortnavnlengde'],
    kortnavnBrukbar: json['kortnavn_brukbar'],
    beskrivelse: json['beskrivelse'] == null ? undefined : json['beskrivelse'],
    sorteringsnummer: json['sorteringsnummer'],
    objektlisteDato:
      json['objektliste_dato'] == null
        ? undefined
        : new Date(json['objektliste_dato']),
    sluttdato:
      json['sluttdato'] == null ? undefined : new Date(json['sluttdato']),
    standardverdi: json['standardverdi'],
    komplementrEnumverdi:
      json['komplementær_enumverdi'] == null
        ? undefined
        : json['komplementær_enumverdi'],
    verdi: json['verdi'] == null ? undefined : json['verdi'],
    type: json['type'],
  }
}

export function EnumverdiTekstToJSON(json: any): EnumverdiTekst {
  return EnumverdiTekstToJSONTyped(json, false)
}

export function EnumverdiTekstToJSONTyped(
  value?: EnumverdiTekst | null,
  ignoreDiscriminator: boolean = false,
): any {
  if (value == null) {
    return value
  }

  return {
    id: value['id'],
    kortnavn: value['kortnavn'],
    kortnavnlengde: value['kortnavnlengde'],
    kortnavn_brukbar: value['kortnavnBrukbar'],
    beskrivelse: value['beskrivelse'],
    sorteringsnummer: value['sorteringsnummer'],
    objektliste_dato:
      value['objektlisteDato'] == null
        ? undefined
        : value['objektlisteDato'].toISOString().substring(0, 10),
    sluttdato:
      value['sluttdato'] == null
        ? undefined
        : value['sluttdato'].toISOString().substring(0, 10),
    standardverdi: value['standardverdi'],
    komplementær_enumverdi: value['komplementrEnumverdi'],
    verdi: value['verdi'],
    type: value['type'],
  }
}

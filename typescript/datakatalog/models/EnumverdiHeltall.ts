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

import { exists, mapValues } from '../runtime'
/**
 *
 * @export
 * @interface EnumverdiHeltall
 */
export interface EnumverdiHeltall {
  /**
   *
   * @type {number}
   * @memberof EnumverdiHeltall
   */
  id: number
  /**
   *
   * @type {string}
   * @memberof EnumverdiHeltall
   */
  kortnavn?: string
  /**
   *
   * @type {number}
   * @memberof EnumverdiHeltall
   */
  kortnavnlengde?: number
  /**
   *
   * @type {boolean}
   * @memberof EnumverdiHeltall
   */
  kortnavnBrukbar: boolean
  /**
   *
   * @type {string}
   * @memberof EnumverdiHeltall
   */
  beskrivelse?: string
  /**
   *
   * @type {number}
   * @memberof EnumverdiHeltall
   */
  sorteringsnummer: number
  /**
   *
   * @type {Date}
   * @memberof EnumverdiHeltall
   */
  objektlisteDato?: Date
  /**
   *
   * @type {Date}
   * @memberof EnumverdiHeltall
   */
  sluttdato?: Date
  /**
   *
   * @type {boolean}
   * @memberof EnumverdiHeltall
   */
  standardverdi: boolean
  /**
   *
   * @type {number}
   * @memberof EnumverdiHeltall
   */
  komplementrEnumverdi?: number
  /**
   *
   * @type {number}
   * @memberof EnumverdiHeltall
   */
  verdi?: number
  /**
   *
   * @type {string}
   * @memberof EnumverdiHeltall
   */
  type: string
}

/**
 * Check if a given object implements the EnumverdiHeltall interface.
 */
export function instanceOfEnumverdiHeltall(value: object): boolean {
  let isInstance = true
  isInstance = isInstance && 'id' in value
  isInstance = isInstance && 'kortnavnBrukbar' in value
  isInstance = isInstance && 'sorteringsnummer' in value
  isInstance = isInstance && 'standardverdi' in value
  isInstance = isInstance && 'type' in value

  return isInstance
}

export function EnumverdiHeltallFromJSON(json: any): EnumverdiHeltall {
  return EnumverdiHeltallFromJSONTyped(json, false)
}

export function EnumverdiHeltallFromJSONTyped(
  json: any,
  ignoreDiscriminator: boolean,
): EnumverdiHeltall {
  if (json === undefined || json === null) {
    return json
  }
  return {
    id: json['id'],
    kortnavn: !exists(json, 'kortnavn') ? undefined : json['kortnavn'],
    kortnavnlengde: !exists(json, 'kortnavnlengde')
      ? undefined
      : json['kortnavnlengde'],
    kortnavnBrukbar: json['kortnavn_brukbar'],
    beskrivelse: !exists(json, 'beskrivelse') ? undefined : json['beskrivelse'],
    sorteringsnummer: json['sorteringsnummer'],
    objektlisteDato: !exists(json, 'objektliste_dato')
      ? undefined
      : new Date(json['objektliste_dato']),
    sluttdato: !exists(json, 'sluttdato')
      ? undefined
      : new Date(json['sluttdato']),
    standardverdi: json['standardverdi'],
    komplementrEnumverdi: !exists(json, 'komplementær_enumverdi')
      ? undefined
      : json['komplementær_enumverdi'],
    verdi: !exists(json, 'verdi') ? undefined : json['verdi'],
    type: json['type'],
  }
}

export function EnumverdiHeltallToJSON(value?: EnumverdiHeltall | null): any {
  if (value === undefined) {
    return undefined
  }
  if (value === null) {
    return null
  }
  return {
    id: value.id,
    kortnavn: value.kortnavn,
    kortnavnlengde: value.kortnavnlengde,
    kortnavn_brukbar: value.kortnavnBrukbar,
    beskrivelse: value.beskrivelse,
    sorteringsnummer: value.sorteringsnummer,
    objektliste_dato:
      value.objektlisteDato === undefined
        ? undefined
        : value.objektlisteDato.toISOString().substring(0, 10),
    sluttdato:
      value.sluttdato === undefined
        ? undefined
        : value.sluttdato.toISOString().substring(0, 10),
    standardverdi: value.standardverdi,
    komplementær_enumverdi: value.komplementrEnumverdi,
    verdi: value.verdi,
    type: value.type,
  }
}

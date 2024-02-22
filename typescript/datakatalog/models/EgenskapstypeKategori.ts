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
 * @interface EgenskapstypeKategori
 */
export interface EgenskapstypeKategori {
  /**
   *
   * @type {number}
   * @memberof EgenskapstypeKategori
   */
  id: number
  /**
   *
   * @type {string}
   * @memberof EgenskapstypeKategori
   */
  navn?: string
  /**
   *
   * @type {string}
   * @memberof EgenskapstypeKategori
   */
  kortnavn?: string
  /**
   *
   * @type {number}
   * @memberof EgenskapstypeKategori
   */
  sorteringsnummer: number
  /**
   *
   * @type {string}
   * @memberof EgenskapstypeKategori
   */
  beskrivelse?: string
}

/**
 * Check if a given object implements the EgenskapstypeKategori interface.
 */
export function instanceOfEgenskapstypeKategori(value: object): boolean {
  let isInstance = true
  isInstance = isInstance && 'id' in value
  isInstance = isInstance && 'sorteringsnummer' in value

  return isInstance
}

export function EgenskapstypeKategoriFromJSON(
  json: any,
): EgenskapstypeKategori {
  return EgenskapstypeKategoriFromJSONTyped(json, false)
}

export function EgenskapstypeKategoriFromJSONTyped(
  json: any,
  ignoreDiscriminator: boolean,
): EgenskapstypeKategori {
  if (json === undefined || json === null) {
    return json
  }
  return {
    id: json['id'],
    navn: !exists(json, 'navn') ? undefined : json['navn'],
    kortnavn: !exists(json, 'kortnavn') ? undefined : json['kortnavn'],
    sorteringsnummer: json['sorteringsnummer'],
    beskrivelse: !exists(json, 'beskrivelse') ? undefined : json['beskrivelse'],
  }
}

export function EgenskapstypeKategoriToJSON(
  value?: EgenskapstypeKategori | null,
): any {
  if (value === undefined) {
    return undefined
  }
  if (value === null) {
    return null
  }
  return {
    id: value.id,
    navn: value.navn,
    kortnavn: value.kortnavn,
    sorteringsnummer: value.sorteringsnummer,
    beskrivelse: value.beskrivelse,
  }
}
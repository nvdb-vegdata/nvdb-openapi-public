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
import type { Egenskapstype } from './Egenskapstype'
import {
  EgenskapstypeFromJSON,
  EgenskapstypeFromJSONTyped,
  EgenskapstypeToJSON,
} from './Egenskapstype'
import type { EnumverdiTekst } from './EnumverdiTekst'
import {
  EnumverdiTekstFromJSON,
  EnumverdiTekstFromJSONTyped,
  EnumverdiTekstToJSON,
} from './EnumverdiTekst'

/**
 *
 * @export
 * @interface EgenskapstypeTekstenum
 */
export interface EgenskapstypeTekstenum extends Egenskapstype {
  /**
   *
   * @type {Date}
   * @memberof EgenskapstypeTekstenum
   */
  objektlisteDato?: Date
  /**
   *
   * @type {Date}
   * @memberof EgenskapstypeTekstenum
   */
  sluttDato?: Date
  /**
   *
   * @type {boolean}
   * @memberof EgenskapstypeTekstenum
   */
  lengdeavhengigVerdi: boolean
  /**
   *
   * @type {boolean}
   * @memberof EgenskapstypeTekstenum
   */
  ajourholdSnu: boolean
  /**
   *
   * @type {string}
   * @memberof EgenskapstypeTekstenum
   */
  standardverdi?: string
  /**
   *
   * @type {number}
   * @memberof EgenskapstypeTekstenum
   */
  feltlengde?: number
  /**
   *
   * @type {string}
   * @memberof EgenskapstypeTekstenum
   */
  feltmnster?: string
  /**
   *
   * @type {Array<EnumverdiTekst>}
   * @memberof EgenskapstypeTekstenum
   */
  tillatteVerdier: Array<EnumverdiTekst>
}

/**
 * Check if a given object implements the EgenskapstypeTekstenum interface.
 */
export function instanceOfEgenskapstypeTekstenum(value: object): boolean {
  let isInstance = true
  isInstance = isInstance && 'lengdeavhengigVerdi' in value
  isInstance = isInstance && 'ajourholdSnu' in value
  isInstance = isInstance && 'tillatteVerdier' in value

  return isInstance
}

export function EgenskapstypeTekstenumFromJSON(
  json: any,
): EgenskapstypeTekstenum {
  return EgenskapstypeTekstenumFromJSONTyped(json, false)
}

export function EgenskapstypeTekstenumFromJSONTyped(
  json: any,
  ignoreDiscriminator: boolean,
): EgenskapstypeTekstenum {
  if (json === undefined || json === null) {
    return json
  }
  return {
    ...EgenskapstypeFromJSONTyped(json, ignoreDiscriminator),
    objektlisteDato: !exists(json, 'objektliste_dato')
      ? undefined
      : new Date(json['objektliste_dato']),
    sluttDato: !exists(json, 'slutt_dato')
      ? undefined
      : new Date(json['slutt_dato']),
    lengdeavhengigVerdi: json['lengdeavhengig_verdi'],
    ajourholdSnu: json['ajourhold_snu'],
    standardverdi: !exists(json, 'standardverdi')
      ? undefined
      : json['standardverdi'],
    feltlengde: !exists(json, 'feltlengde') ? undefined : json['feltlengde'],
    feltmnster: !exists(json, 'feltmønster') ? undefined : json['feltmønster'],
    tillatteVerdier: (json['tillatte_verdier'] as Array<any>).map(
      EnumverdiTekstFromJSON,
    ),
  }
}

export function EgenskapstypeTekstenumToJSON(
  value?: EgenskapstypeTekstenum | null,
): any {
  if (value === undefined) {
    return undefined
  }
  if (value === null) {
    return null
  }
  return {
    ...EgenskapstypeToJSON(value),
    objektliste_dato:
      value.objektlisteDato === undefined
        ? undefined
        : value.objektlisteDato.toISOString().substring(0, 10),
    slutt_dato:
      value.sluttDato === undefined
        ? undefined
        : value.sluttDato.toISOString().substring(0, 10),
    lengdeavhengig_verdi: value.lengdeavhengigVerdi,
    ajourhold_snu: value.ajourholdSnu,
    standardverdi: value.standardverdi,
    feltlengde: value.feltlengde,
    feltmønster: value.feltmnster,
    tillatte_verdier: (value.tillatteVerdier as Array<any>).map(
      EnumverdiTekstToJSON,
    ),
  }
}

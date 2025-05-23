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
import type { Viktighet } from './Viktighet'
import {
  ViktighetFromJSON,
  ViktighetFromJSONTyped,
  ViktighetToJSON,
  ViktighetToJSONTyped,
} from './Viktighet'
import type { Enhet } from './Enhet'
import {
  EnhetFromJSON,
  EnhetFromJSONTyped,
  EnhetToJSON,
  EnhetToJSONTyped,
} from './Enhet'
import type { EnumverdiFlyttall } from './EnumverdiFlyttall'
import {
  EnumverdiFlyttallFromJSON,
  EnumverdiFlyttallFromJSONTyped,
  EnumverdiFlyttallToJSON,
  EnumverdiFlyttallToJSONTyped,
} from './EnumverdiFlyttall'
import type { Egenskapstype } from './Egenskapstype'
import {
  EgenskapstypeFromJSON,
  EgenskapstypeFromJSONTyped,
  EgenskapstypeToJSON,
  EgenskapstypeToJSONTyped,
} from './Egenskapstype'
import type { EgenskapstypeEnum } from './EgenskapstypeEnum'
import {
  EgenskapstypeEnumFromJSON,
  EgenskapstypeEnumFromJSONTyped,
  EgenskapstypeEnumToJSON,
  EgenskapstypeEnumToJSONTyped,
} from './EgenskapstypeEnum'

/**
 *
 * @export
 * @interface EgenskapstypeFlyttallenum
 */
export interface EgenskapstypeFlyttallenum extends Egenskapstype {
  /**
   *
   * @type {Date}
   * @memberof EgenskapstypeFlyttallenum
   */
  objektlisteDato?: Date
  /**
   *
   * @type {Date}
   * @memberof EgenskapstypeFlyttallenum
   */
  sluttDato?: Date
  /**
   *
   * @type {boolean}
   * @memberof EgenskapstypeFlyttallenum
   */
  lengdeavhengigVerdi: boolean
  /**
   *
   * @type {boolean}
   * @memberof EgenskapstypeFlyttallenum
   */
  ajourholdSnu: boolean
  /**
   *
   * @type {number}
   * @memberof EgenskapstypeFlyttallenum
   */
  standardverdi?: number
  /**
   *
   * @type {number}
   * @memberof EgenskapstypeFlyttallenum
   */
  minAnbefalt?: number
  /**
   *
   * @type {number}
   * @memberof EgenskapstypeFlyttallenum
   */
  maksAnbefalt?: number
  /**
   *
   * @type {number}
   * @memberof EgenskapstypeFlyttallenum
   */
  min?: number
  /**
   *
   * @type {number}
   * @memberof EgenskapstypeFlyttallenum
   */
  maks?: number
  /**
   *
   * @type {number}
   * @memberof EgenskapstypeFlyttallenum
   */
  desimaler?: number
  /**
   *
   * @type {number}
   * @memberof EgenskapstypeFlyttallenum
   */
  feltlengde?: number
  /**
   *
   * @type {boolean}
   * @memberof EgenskapstypeFlyttallenum
   */
  fortegnsendringSnu: boolean
  /**
   *
   * @type {Enhet}
   * @memberof EgenskapstypeFlyttallenum
   */
  enhet?: Enhet
  /**
   *
   * @type {Array<EnumverdiFlyttall>}
   * @memberof EgenskapstypeFlyttallenum
   */
  tillatteVerdier: Array<EnumverdiFlyttall>
}

/**
 * Check if a given object implements the EgenskapstypeFlyttallenum interface.
 */
export function instanceOfEgenskapstypeFlyttallenum(
  value: object,
): value is EgenskapstypeFlyttallenum {
  if (
    !('lengdeavhengigVerdi' in value) ||
    value['lengdeavhengigVerdi'] === undefined
  )
    return false
  if (!('ajourholdSnu' in value) || value['ajourholdSnu'] === undefined)
    return false
  if (
    !('fortegnsendringSnu' in value) ||
    value['fortegnsendringSnu'] === undefined
  )
    return false
  if (!('tillatteVerdier' in value) || value['tillatteVerdier'] === undefined)
    return false
  return true
}

export function EgenskapstypeFlyttallenumFromJSON(
  json: any,
): EgenskapstypeFlyttallenum {
  return EgenskapstypeFlyttallenumFromJSONTyped(json, false)
}

export function EgenskapstypeFlyttallenumFromJSONTyped(
  json: any,
  ignoreDiscriminator: boolean,
): EgenskapstypeFlyttallenum {
  if (json == null) {
    return json
  }
  return {
    ...EgenskapstypeFromJSONTyped(json, true),
    objektlisteDato:
      json['objektliste_dato'] == null
        ? undefined
        : new Date(json['objektliste_dato']),
    sluttDato:
      json['slutt_dato'] == null ? undefined : new Date(json['slutt_dato']),
    lengdeavhengigVerdi: json['lengdeavhengig_verdi'],
    ajourholdSnu: json['ajourhold_snu'],
    standardverdi:
      json['standardverdi'] == null ? undefined : json['standardverdi'],
    minAnbefalt:
      json['min_anbefalt'] == null ? undefined : json['min_anbefalt'],
    maksAnbefalt:
      json['maks_anbefalt'] == null ? undefined : json['maks_anbefalt'],
    min: json['min'] == null ? undefined : json['min'],
    maks: json['maks'] == null ? undefined : json['maks'],
    desimaler: json['desimaler'] == null ? undefined : json['desimaler'],
    feltlengde: json['feltlengde'] == null ? undefined : json['feltlengde'],
    fortegnsendringSnu: json['fortegnsendring_snu'],
    enhet: json['enhet'] == null ? undefined : EnhetFromJSON(json['enhet']),
    tillatteVerdier: (json['tillatte_verdier'] as Array<any>).map(
      EnumverdiFlyttallFromJSON,
    ),
  }
}

export function EgenskapstypeFlyttallenumToJSON(
  json: any,
): EgenskapstypeFlyttallenum {
  return EgenskapstypeFlyttallenumToJSONTyped(json, false)
}

export function EgenskapstypeFlyttallenumToJSONTyped(
  value?: EgenskapstypeFlyttallenum | null,
  ignoreDiscriminator: boolean = false,
): any {
  if (value == null) {
    return value
  }

  return {
    ...EgenskapstypeToJSONTyped(value, true),
    objektliste_dato:
      value['objektlisteDato'] == null
        ? undefined
        : value['objektlisteDato'].toISOString().substring(0, 10),
    slutt_dato:
      value['sluttDato'] == null
        ? undefined
        : value['sluttDato'].toISOString().substring(0, 10),
    lengdeavhengig_verdi: value['lengdeavhengigVerdi'],
    ajourhold_snu: value['ajourholdSnu'],
    standardverdi: value['standardverdi'],
    min_anbefalt: value['minAnbefalt'],
    maks_anbefalt: value['maksAnbefalt'],
    min: value['min'],
    maks: value['maks'],
    desimaler: value['desimaler'],
    feltlengde: value['feltlengde'],
    fortegnsendring_snu: value['fortegnsendringSnu'],
    enhet: EnhetToJSON(value['enhet']),
    tillatte_verdier: (value['tillatteVerdier'] as Array<any>).map(
      EnumverdiFlyttallToJSON,
    ),
  }
}

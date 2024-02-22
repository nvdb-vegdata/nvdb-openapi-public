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

/**
 *
 * @export
 * @interface EgenskapstypeStedfesting
 */
export interface EgenskapstypeStedfesting extends Egenskapstype {
  /**
   *
   * @type {string}
   * @memberof EgenskapstypeStedfesting
   */
  stedfestingstype?: EgenskapstypeStedfestingStedfestingstypeEnum
  /**
   *
   * @type {string}
   * @memberof EgenskapstypeStedfesting
   */
  geometritype?: EgenskapstypeStedfestingGeometritypeEnum
  /**
   *
   * @type {boolean}
   * @memberof EgenskapstypeStedfesting
   */
  overlappOk?: boolean
  /**
   *
   * @type {string}
   * @memberof EgenskapstypeStedfesting
   */
  kjrefeltRelevant?: EgenskapstypeStedfestingKjrefeltRelevantEnum
  /**
   *
   * @type {string}
   * @memberof EgenskapstypeStedfesting
   */
  sideposisjonRelevant?: EgenskapstypeStedfestingSideposisjonRelevantEnum
  /**
   *
   * @type {boolean}
   * @memberof EgenskapstypeStedfesting
   */
  innenforMor?: boolean
  /**
   *
   * @type {string}
   * @memberof EgenskapstypeStedfesting
   */
  vegnettsajourholdSplitt?: EgenskapstypeStedfestingVegnettsajourholdSplittEnum
  /**
   *
   * @type {string}
   * @memberof EgenskapstypeStedfesting
   */
  overlappsautomatikk?: string
  /**
   *
   * @type {boolean}
   * @memberof EgenskapstypeStedfesting
   */
  retningRelevant?: boolean
}

/**
 * @export
 */
export const EgenskapstypeStedfestingStedfestingstypeEnum = {
  Punkt: 'Punkt',
  Linje: 'Linje',
  Sving: 'Sving',
} as const
export type EgenskapstypeStedfestingStedfestingstypeEnum =
  (typeof EgenskapstypeStedfestingStedfestingstypeEnum)[keyof typeof EgenskapstypeStedfestingStedfestingstypeEnum]

/**
 * @export
 */
export const EgenskapstypeStedfestingGeometritypeEnum = {
  Punkt: 'PUNKT',
  Linje: 'LINJE',
  Sving: 'SVING',
} as const
export type EgenskapstypeStedfestingGeometritypeEnum =
  (typeof EgenskapstypeStedfestingGeometritypeEnum)[keyof typeof EgenskapstypeStedfestingGeometritypeEnum]

/**
 * @export
 */
export const EgenskapstypeStedfestingKjrefeltRelevantEnum = {
  Kan: 'KAN',
  Nei: 'NEI',
  M: 'MÅ',
} as const
export type EgenskapstypeStedfestingKjrefeltRelevantEnum =
  (typeof EgenskapstypeStedfestingKjrefeltRelevantEnum)[keyof typeof EgenskapstypeStedfestingKjrefeltRelevantEnum]

/**
 * @export
 */
export const EgenskapstypeStedfestingSideposisjonRelevantEnum = {
  Kan: 'KAN',
  Nei: 'NEI',
  M: 'MÅ',
} as const
export type EgenskapstypeStedfestingSideposisjonRelevantEnum =
  (typeof EgenskapstypeStedfestingSideposisjonRelevantEnum)[keyof typeof EgenskapstypeStedfestingSideposisjonRelevantEnum]

/**
 * @export
 */
export const EgenskapstypeStedfestingVegnettsajourholdSplittEnum = {
  IkkeTattStilling: 'IKKE_TATT_STILLING',
  KanIkkeSplittes: 'KAN_IKKE_SPLITTES',
  KanSplittes: 'KAN_SPLITTES',
} as const
export type EgenskapstypeStedfestingVegnettsajourholdSplittEnum =
  (typeof EgenskapstypeStedfestingVegnettsajourholdSplittEnum)[keyof typeof EgenskapstypeStedfestingVegnettsajourholdSplittEnum]

/**
 * Check if a given object implements the EgenskapstypeStedfesting interface.
 */
export function instanceOfEgenskapstypeStedfesting(value: object): boolean {
  let isInstance = true

  return isInstance
}

export function EgenskapstypeStedfestingFromJSON(
  json: any,
): EgenskapstypeStedfesting {
  return EgenskapstypeStedfestingFromJSONTyped(json, false)
}

export function EgenskapstypeStedfestingFromJSONTyped(
  json: any,
  ignoreDiscriminator: boolean,
): EgenskapstypeStedfesting {
  if (json === undefined || json === null) {
    return json
  }
  return {
    ...EgenskapstypeFromJSONTyped(json, ignoreDiscriminator),
    stedfestingstype: !exists(json, 'stedfestingstype')
      ? undefined
      : json['stedfestingstype'],
    geometritype: !exists(json, 'geometritype')
      ? undefined
      : json['geometritype'],
    overlappOk: !exists(json, 'overlapp_ok') ? undefined : json['overlapp_ok'],
    kjrefeltRelevant: !exists(json, 'kjørefelt_relevant')
      ? undefined
      : json['kjørefelt_relevant'],
    sideposisjonRelevant: !exists(json, 'sideposisjon_relevant')
      ? undefined
      : json['sideposisjon_relevant'],
    innenforMor: !exists(json, 'innenfor_mor')
      ? undefined
      : json['innenfor_mor'],
    vegnettsajourholdSplitt: !exists(json, 'vegnettsajourhold_splitt')
      ? undefined
      : json['vegnettsajourhold_splitt'],
    overlappsautomatikk: !exists(json, 'overlappsautomatikk')
      ? undefined
      : json['overlappsautomatikk'],
    retningRelevant: !exists(json, 'retning_relevant')
      ? undefined
      : json['retning_relevant'],
  }
}

export function EgenskapstypeStedfestingToJSON(
  value?: EgenskapstypeStedfesting | null,
): any {
  if (value === undefined) {
    return undefined
  }
  if (value === null) {
    return null
  }
  return {
    ...EgenskapstypeToJSON(value),
    stedfestingstype: value.stedfestingstype,
    geometritype: value.geometritype,
    overlapp_ok: value.overlappOk,
    kjørefelt_relevant: value.kjrefeltRelevant,
    sideposisjon_relevant: value.sideposisjonRelevant,
    innenfor_mor: value.innenforMor,
    vegnettsajourhold_splitt: value.vegnettsajourholdSplitt,
    overlappsautomatikk: value.overlappsautomatikk,
    retning_relevant: value.retningRelevant,
  }
}
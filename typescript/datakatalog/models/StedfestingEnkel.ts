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
import type { Stedfesting } from './Stedfesting'
import {
  StedfestingFromJSON,
  StedfestingFromJSONTyped,
  StedfestingToJSON,
} from './Stedfesting'

/**
 *
 * @export
 * @interface StedfestingEnkel
 */
export interface StedfestingEnkel extends Stedfesting {
  /**
   *
   * @type {string}
   * @memberof StedfestingEnkel
   */
  stedfestingstype?: StedfestingEnkelStedfestingstypeEnum
  /**
   *
   * @type {string}
   * @memberof StedfestingEnkel
   */
  geometritype?: StedfestingEnkelGeometritypeEnum
  /**
   *
   * @type {boolean}
   * @memberof StedfestingEnkel
   */
  overlappOk?: boolean
  /**
   *
   * @type {string}
   * @memberof StedfestingEnkel
   */
  kjrefeltRelevant?: StedfestingEnkelKjrefeltRelevantEnum
  /**
   *
   * @type {string}
   * @memberof StedfestingEnkel
   */
  sideposisjonRelevant?: StedfestingEnkelSideposisjonRelevantEnum
  /**
   *
   * @type {boolean}
   * @memberof StedfestingEnkel
   */
  innenforMor?: boolean
  /**
   *
   * @type {string}
   * @memberof StedfestingEnkel
   */
  vegnettsajourholdSplitt?: StedfestingEnkelVegnettsajourholdSplittEnum
  /**
   *
   * @type {string}
   * @memberof StedfestingEnkel
   */
  overlappsautomatikk?: string
  /**
   *
   * @type {boolean}
   * @memberof StedfestingEnkel
   */
  retningRelevant?: boolean
}

/**
 * @export
 */
export const StedfestingEnkelStedfestingstypeEnum = {
  Punkt: 'Punkt',
  Linje: 'Linje',
  Sving: 'Sving',
} as const
export type StedfestingEnkelStedfestingstypeEnum =
  (typeof StedfestingEnkelStedfestingstypeEnum)[keyof typeof StedfestingEnkelStedfestingstypeEnum]

/**
 * @export
 */
export const StedfestingEnkelGeometritypeEnum = {
  Punkt: 'PUNKT',
  Linje: 'LINJE',
  Sving: 'SVING',
} as const
export type StedfestingEnkelGeometritypeEnum =
  (typeof StedfestingEnkelGeometritypeEnum)[keyof typeof StedfestingEnkelGeometritypeEnum]

/**
 * @export
 */
export const StedfestingEnkelKjrefeltRelevantEnum = {
  Kan: 'KAN',
  Nei: 'NEI',
  M: 'MÅ',
} as const
export type StedfestingEnkelKjrefeltRelevantEnum =
  (typeof StedfestingEnkelKjrefeltRelevantEnum)[keyof typeof StedfestingEnkelKjrefeltRelevantEnum]

/**
 * @export
 */
export const StedfestingEnkelSideposisjonRelevantEnum = {
  Kan: 'KAN',
  Nei: 'NEI',
  M: 'MÅ',
} as const
export type StedfestingEnkelSideposisjonRelevantEnum =
  (typeof StedfestingEnkelSideposisjonRelevantEnum)[keyof typeof StedfestingEnkelSideposisjonRelevantEnum]

/**
 * @export
 */
export const StedfestingEnkelVegnettsajourholdSplittEnum = {
  IkkeTattStilling: 'IKKE_TATT_STILLING',
  KanIkkeSplittes: 'KAN_IKKE_SPLITTES',
  KanSplittes: 'KAN_SPLITTES',
} as const
export type StedfestingEnkelVegnettsajourholdSplittEnum =
  (typeof StedfestingEnkelVegnettsajourholdSplittEnum)[keyof typeof StedfestingEnkelVegnettsajourholdSplittEnum]

/**
 * Check if a given object implements the StedfestingEnkel interface.
 */
export function instanceOfStedfestingEnkel(value: object): boolean {
  let isInstance = true

  return isInstance
}

export function StedfestingEnkelFromJSON(json: any): StedfestingEnkel {
  return StedfestingEnkelFromJSONTyped(json, false)
}

export function StedfestingEnkelFromJSONTyped(
  json: any,
  ignoreDiscriminator: boolean,
): StedfestingEnkel {
  if (json === undefined || json === null) {
    return json
  }
  return {
    ...StedfestingFromJSONTyped(json, ignoreDiscriminator),
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

export function StedfestingEnkelToJSON(value?: StedfestingEnkel | null): any {
  if (value === undefined) {
    return undefined
  }
  if (value === null) {
    return null
  }
  return {
    ...StedfestingToJSON(value),
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

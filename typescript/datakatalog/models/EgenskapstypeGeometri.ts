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
 * @interface EgenskapstypeGeometri
 */
export interface EgenskapstypeGeometri extends Egenskapstype {
  /**
   *
   * @type {number}
   * @memberof EgenskapstypeGeometri
   */
  dimensjoner: number
  /**
   *
   * @type {string}
   * @memberof EgenskapstypeGeometri
   */
  geometritype: EgenskapstypeGeometriGeometritypeEnum
  /**
   *
   * @type {boolean}
   * @memberof EgenskapstypeGeometri
   */
  innenforMor?: boolean
}

/**
 * @export
 */
export const EgenskapstypeGeometriGeometritypeEnum = {
  Punkt: 'PUNKT',
  Polygon: 'POLYGON',
  Linje: 'LINJE',
  Flerelinje: 'FLERELINJE',
  Flerepunkt: 'FLEREPUNKT',
  Flerepolygon: 'FLEREPOLYGON',
  Kompleks: 'KOMPLEKS',
  Ukjent: 'UKJENT',
} as const
export type EgenskapstypeGeometriGeometritypeEnum =
  (typeof EgenskapstypeGeometriGeometritypeEnum)[keyof typeof EgenskapstypeGeometriGeometritypeEnum]

/**
 * Check if a given object implements the EgenskapstypeGeometri interface.
 */
export function instanceOfEgenskapstypeGeometri(
  value: object,
): value is EgenskapstypeGeometri {
  if (!('dimensjoner' in value) || value['dimensjoner'] === undefined)
    return false
  if (!('geometritype' in value) || value['geometritype'] === undefined)
    return false
  return true
}

export function EgenskapstypeGeometriFromJSON(
  json: any,
): EgenskapstypeGeometri {
  return EgenskapstypeGeometriFromJSONTyped(json, false)
}

export function EgenskapstypeGeometriFromJSONTyped(
  json: any,
  ignoreDiscriminator: boolean,
): EgenskapstypeGeometri {
  if (json == null) {
    return json
  }
  return {
    ...EgenskapstypeFromJSONTyped(json, true),
    dimensjoner: json['dimensjoner'],
    geometritype: json['geometritype'],
    innenforMor:
      json['innenfor_mor'] == null ? undefined : json['innenfor_mor'],
  }
}

export function EgenskapstypeGeometriToJSON(json: any): EgenskapstypeGeometri {
  return EgenskapstypeGeometriToJSONTyped(json, false)
}

export function EgenskapstypeGeometriToJSONTyped(
  value?: EgenskapstypeGeometri | null,
  ignoreDiscriminator: boolean = false,
): any {
  if (value == null) {
    return value
  }

  return {
    ...EgenskapstypeToJSONTyped(value, true),
    dimensjoner: value['dimensjoner'],
    geometritype: value['geometritype'],
    innenfor_mor: value['innenforMor'],
  }
}

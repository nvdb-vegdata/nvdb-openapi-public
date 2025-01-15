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
import type { EgenskapstypeEnum } from './EgenskapstypeEnum'
import {
  EgenskapstypeEnumFromJSON,
  EgenskapstypeEnumFromJSONTyped,
  EgenskapstypeEnumToJSON,
} from './EgenskapstypeEnum'
import type { Viktighet } from './Viktighet'
import {
  ViktighetFromJSON,
  ViktighetFromJSONTyped,
  ViktighetToJSON,
} from './Viktighet'

/**
 *
 * @export
 * @interface EgenskapstypeStruktur
 */
export interface EgenskapstypeStruktur extends Egenskapstype {
  /**
   * Egenskapstyper som kan inngå i strukturen
   * @type {Array<Egenskapstype>}
   * @memberof EgenskapstypeStruktur
   */
  egenskapstyper: Array<Egenskapstype>
}

/**
 * Check if a given object implements the EgenskapstypeStruktur interface.
 */
export function instanceOfEgenskapstypeStruktur(value: object): boolean {
  let isInstance = true
  isInstance = isInstance && 'egenskapstyper' in value

  return isInstance
}

export function EgenskapstypeStrukturFromJSON(
  json: any,
): EgenskapstypeStruktur {
  return EgenskapstypeStrukturFromJSONTyped(json, false)
}

export function EgenskapstypeStrukturFromJSONTyped(
  json: any,
  ignoreDiscriminator: boolean,
): EgenskapstypeStruktur {
  if (json === undefined || json === null) {
    return json
  }
  return {
    ...EgenskapstypeFromJSONTyped(json, ignoreDiscriminator),
    egenskapstyper: (json['egenskapstyper'] as Array<any>).map(
      EgenskapstypeFromJSON,
    ),
  }
}

export function EgenskapstypeStrukturToJSON(
  value?: EgenskapstypeStruktur | null,
): any {
  if (value === undefined) {
    return undefined
  }
  if (value === null) {
    return null
  }
  return {
    ...EgenskapstypeToJSON(value),
    egenskapstyper: (value.egenskapstyper as Array<any>).map(
      EgenskapstypeToJSON,
    ),
  }
}

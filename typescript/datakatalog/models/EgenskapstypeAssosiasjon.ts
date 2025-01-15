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
 * @interface EgenskapstypeAssosiasjon
 */
export interface EgenskapstypeAssosiasjon extends Egenskapstype {
  /**
   *
   * @type {number}
   * @memberof EgenskapstypeAssosiasjon
   */
  tilknytning?: number
  /**
   *
   * @type {number}
   * @memberof EgenskapstypeAssosiasjon
   */
  vegobjekttypeid?: number
  /**
   *
   * @type {number}
   * @memberof EgenskapstypeAssosiasjon
   */
  innenforMor?: number
  /**
   *
   * @type {Date}
   * @memberof EgenskapstypeAssosiasjon
   */
  startdato?: Date
  /**
   *
   * @type {Date}
   * @memberof EgenskapstypeAssosiasjon
   */
  sluttdato?: Date
  /**
   *
   * @type {number}
   * @memberof EgenskapstypeAssosiasjon
   */
  assosiasjonskrav?: number
  /**
   *
   * @type {string}
   * @memberof EgenskapstypeAssosiasjon
   */
  assosiasjonskravkommentar?: string
}

/**
 * Check if a given object implements the EgenskapstypeAssosiasjon interface.
 */
export function instanceOfEgenskapstypeAssosiasjon(value: object): boolean {
  let isInstance = true

  return isInstance
}

export function EgenskapstypeAssosiasjonFromJSON(
  json: any,
): EgenskapstypeAssosiasjon {
  return EgenskapstypeAssosiasjonFromJSONTyped(json, false)
}

export function EgenskapstypeAssosiasjonFromJSONTyped(
  json: any,
  ignoreDiscriminator: boolean,
): EgenskapstypeAssosiasjon {
  if (json === undefined || json === null) {
    return json
  }
  return {
    ...EgenskapstypeFromJSONTyped(json, ignoreDiscriminator),
    tilknytning: !exists(json, 'tilknytning') ? undefined : json['tilknytning'],
    vegobjekttypeid: !exists(json, 'vegobjekttypeid')
      ? undefined
      : json['vegobjekttypeid'],
    innenforMor: !exists(json, 'innenfor_mor')
      ? undefined
      : json['innenfor_mor'],
    startdato: !exists(json, 'startdato')
      ? undefined
      : new Date(json['startdato']),
    sluttdato: !exists(json, 'sluttdato')
      ? undefined
      : new Date(json['sluttdato']),
    assosiasjonskrav: !exists(json, 'assosiasjonskrav')
      ? undefined
      : json['assosiasjonskrav'],
    assosiasjonskravkommentar: !exists(json, 'assosiasjonskravkommentar')
      ? undefined
      : json['assosiasjonskravkommentar'],
  }
}

export function EgenskapstypeAssosiasjonToJSON(
  value?: EgenskapstypeAssosiasjon | null,
): any {
  if (value === undefined) {
    return undefined
  }
  if (value === null) {
    return null
  }
  return {
    ...EgenskapstypeToJSON(value),
    tilknytning: value.tilknytning,
    vegobjekttypeid: value.vegobjekttypeid,
    innenfor_mor: value.innenforMor,
    startdato:
      value.startdato === undefined
        ? undefined
        : value.startdato.toISOString().substring(0, 10),
    sluttdato:
      value.sluttdato === undefined
        ? undefined
        : value.sluttdato.toISOString().substring(0, 10),
    assosiasjonskrav: value.assosiasjonskrav,
    assosiasjonskravkommentar: value.assosiasjonskravkommentar,
  }
}

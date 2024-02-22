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

import { exists, mapValues } from '../runtime';
import type { AssosiasjonstypeVegobjekttype } from './AssosiasjonstypeVegobjekttype';
import {
    AssosiasjonstypeVegobjekttypeFromJSON,
    AssosiasjonstypeVegobjekttypeFromJSONTyped,
    AssosiasjonstypeVegobjekttypeToJSON,
} from './AssosiasjonstypeVegobjekttype';

/**
 * 
 * @export
 * @interface AssosiasjonstypeListeInnhold
 */
export interface AssosiasjonstypeListeInnhold {
    /**
     * 
     * @type {string}
     * @memberof AssosiasjonstypeListeInnhold
     */
    innenforMor?: AssosiasjonstypeListeInnholdInnenforMorEnum;
    /**
     * 
     * @type {string}
     * @memberof AssosiasjonstypeListeInnhold
     */
    relasjonstype?: AssosiasjonstypeListeInnholdRelasjonstypeEnum;
    /**
     * 
     * @type {number}
     * @memberof AssosiasjonstypeListeInnhold
     */
    id: number;
    /**
     * 
     * @type {string}
     * @memberof AssosiasjonstypeListeInnhold
     */
    navn?: string;
    /**
     * 
     * @type {string}
     * @memberof AssosiasjonstypeListeInnhold
     */
    egenskapstype: string;
    /**
     * 
     * @type {AssosiasjonstypeVegobjekttype}
     * @memberof AssosiasjonstypeListeInnhold
     */
    type: AssosiasjonstypeVegobjekttype;
}


/**
 * @export
 */
export const AssosiasjonstypeListeInnholdInnenforMorEnum = {
    Nei: 'NEI',
    Ja: 'JA',
    MedAvvik: 'MED_AVVIK'
} as const;
export type AssosiasjonstypeListeInnholdInnenforMorEnum = typeof AssosiasjonstypeListeInnholdInnenforMorEnum[keyof typeof AssosiasjonstypeListeInnholdInnenforMorEnum];

/**
 * @export
 */
export const AssosiasjonstypeListeInnholdRelasjonstypeEnum = {
    Assosiasjon: 'ASSOSIASJON',
    Aggregering: 'AGGREGERING',
    Komposisjon: 'KOMPOSISJON',
    Topologi: 'TOPOLOGI'
} as const;
export type AssosiasjonstypeListeInnholdRelasjonstypeEnum = typeof AssosiasjonstypeListeInnholdRelasjonstypeEnum[keyof typeof AssosiasjonstypeListeInnholdRelasjonstypeEnum];


/**
 * Check if a given object implements the AssosiasjonstypeListeInnhold interface.
 */
export function instanceOfAssosiasjonstypeListeInnhold(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "id" in value;
    isInstance = isInstance && "egenskapstype" in value;
    isInstance = isInstance && "type" in value;

    return isInstance;
}

export function AssosiasjonstypeListeInnholdFromJSON(json: any): AssosiasjonstypeListeInnhold {
    return AssosiasjonstypeListeInnholdFromJSONTyped(json, false);
}

export function AssosiasjonstypeListeInnholdFromJSONTyped(json: any, ignoreDiscriminator: boolean): AssosiasjonstypeListeInnhold {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'innenforMor': !exists(json, 'innenfor_mor') ? undefined : json['innenfor_mor'],
        'relasjonstype': !exists(json, 'relasjonstype') ? undefined : json['relasjonstype'],
        'id': json['id'],
        'navn': !exists(json, 'navn') ? undefined : json['navn'],
        'egenskapstype': json['egenskapstype'],
        'type': AssosiasjonstypeVegobjekttypeFromJSON(json['type']),
    };
}

export function AssosiasjonstypeListeInnholdToJSON(value?: AssosiasjonstypeListeInnhold | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'innenfor_mor': value.innenforMor,
        'relasjonstype': value.relasjonstype,
        'id': value.id,
        'navn': value.navn,
        'egenskapstype': value.egenskapstype,
        'type': AssosiasjonstypeVegobjekttypeToJSON(value.type),
    };
}

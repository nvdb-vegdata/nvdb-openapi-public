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
import type { Egenskapstype } from './Egenskapstype';
import {
    EgenskapstypeFromJSON,
    EgenskapstypeFromJSONTyped,
    EgenskapstypeToJSON,
} from './Egenskapstype';

/**
 * 
 * @export
 * @interface EgenskapstypeKortdato
 */
export interface EgenskapstypeKortdato extends Egenskapstype {
    /**
     * 
     * @type {Date}
     * @memberof EgenskapstypeKortdato
     */
    objektlisteDato?: Date;
    /**
     * 
     * @type {Date}
     * @memberof EgenskapstypeKortdato
     */
    sluttDato?: Date;
    /**
     * 
     * @type {boolean}
     * @memberof EgenskapstypeKortdato
     */
    lengdeavhengigVerdi: boolean;
    /**
     * 
     * @type {boolean}
     * @memberof EgenskapstypeKortdato
     */
    ajourholdSnu: boolean;
    /**
     * 
     * @type {number}
     * @memberof EgenskapstypeKortdato
     */
    standardverdi?: number;
    /**
     * 
     * @type {number}
     * @memberof EgenskapstypeKortdato
     */
    minAnbefalt?: number;
    /**
     * 
     * @type {number}
     * @memberof EgenskapstypeKortdato
     */
    maksAnbefalt?: number;
    /**
     * 
     * @type {string}
     * @memberof EgenskapstypeKortdato
     */
    feltmnster?: string;
}



/**
 * Check if a given object implements the EgenskapstypeKortdato interface.
 */
export function instanceOfEgenskapstypeKortdato(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "lengdeavhengigVerdi" in value;
    isInstance = isInstance && "ajourholdSnu" in value;

    return isInstance;
}

export function EgenskapstypeKortdatoFromJSON(json: any): EgenskapstypeKortdato {
    return EgenskapstypeKortdatoFromJSONTyped(json, false);
}

export function EgenskapstypeKortdatoFromJSONTyped(json: any, ignoreDiscriminator: boolean): EgenskapstypeKortdato {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        ...EgenskapstypeFromJSONTyped(json, ignoreDiscriminator),
        'objektlisteDato': !exists(json, 'objektliste_dato') ? undefined : (new Date(json['objektliste_dato'])),
        'sluttDato': !exists(json, 'slutt_dato') ? undefined : (new Date(json['slutt_dato'])),
        'lengdeavhengigVerdi': json['lengdeavhengig_verdi'],
        'ajourholdSnu': json['ajourhold_snu'],
        'standardverdi': !exists(json, 'standardverdi') ? undefined : json['standardverdi'],
        'minAnbefalt': !exists(json, 'min_anbefalt') ? undefined : json['min_anbefalt'],
        'maksAnbefalt': !exists(json, 'maks_anbefalt') ? undefined : json['maks_anbefalt'],
        'feltmnster': !exists(json, 'feltmønster') ? undefined : json['feltmønster'],
    };
}

export function EgenskapstypeKortdatoToJSON(value?: EgenskapstypeKortdato | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        ...EgenskapstypeToJSON(value),
        'objektliste_dato': value.objektlisteDato === undefined ? undefined : (value.objektlisteDato.toISOString().substring(0,10)),
        'slutt_dato': value.sluttDato === undefined ? undefined : (value.sluttDato.toISOString().substring(0,10)),
        'lengdeavhengig_verdi': value.lengdeavhengigVerdi,
        'ajourhold_snu': value.ajourholdSnu,
        'standardverdi': value.standardverdi,
        'min_anbefalt': value.minAnbefalt,
        'maks_anbefalt': value.maksAnbefalt,
        'feltmønster': value.feltmnster,
    };
}


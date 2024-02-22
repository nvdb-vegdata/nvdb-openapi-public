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
/**
 * 
 * @export
 * @interface Versjon
 */
export interface Versjon {
    /**
     * 
     * @type {number}
     * @memberof Versjon
     */
    id: number;
    /**
     * 
     * @type {Date}
     * @memberof Versjon
     */
    dato: Date;
    /**
     * 
     * @type {string}
     * @memberof Versjon
     */
    versjon: string;
}

/**
 * Check if a given object implements the Versjon interface.
 */
export function instanceOfVersjon(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "id" in value;
    isInstance = isInstance && "dato" in value;
    isInstance = isInstance && "versjon" in value;

    return isInstance;
}

export function VersjonFromJSON(json: any): Versjon {
    return VersjonFromJSONTyped(json, false);
}

export function VersjonFromJSONTyped(json: any, ignoreDiscriminator: boolean): Versjon {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'id': json['id'],
        'dato': (new Date(json['dato'])),
        'versjon': json['versjon'],
    };
}

export function VersjonToJSON(value?: Versjon | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'id': value.id,
        'dato': (value.dato.toISOString().substring(0,10)),
        'versjon': value.versjon,
    };
}


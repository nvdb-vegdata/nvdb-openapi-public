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
 * @interface Kategori
 */
export interface Kategori {
    /**
     * 
     * @type {number}
     * @memberof Kategori
     */
    id: number;
    /**
     * 
     * @type {string}
     * @memberof Kategori
     */
    navn?: string;
    /**
     * 
     * @type {string}
     * @memberof Kategori
     */
    kortnavn?: string;
    /**
     * 
     * @type {number}
     * @memberof Kategori
     */
    sorteringsnummer: number;
    /**
     * 
     * @type {string}
     * @memberof Kategori
     */
    beskrivelse?: string;
    /**
     * 
     * @type {Date}
     * @memberof Kategori
     */
    startDato?: Date;
}

/**
 * Check if a given object implements the Kategori interface.
 */
export function instanceOfKategori(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "id" in value;
    isInstance = isInstance && "sorteringsnummer" in value;

    return isInstance;
}

export function KategoriFromJSON(json: any): Kategori {
    return KategoriFromJSONTyped(json, false);
}

export function KategoriFromJSONTyped(json: any, ignoreDiscriminator: boolean): Kategori {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'id': json['id'],
        'navn': !exists(json, 'navn') ? undefined : json['navn'],
        'kortnavn': !exists(json, 'kortnavn') ? undefined : json['kortnavn'],
        'sorteringsnummer': json['sorteringsnummer'],
        'beskrivelse': !exists(json, 'beskrivelse') ? undefined : json['beskrivelse'],
        'startDato': !exists(json, 'startDato') ? undefined : (new Date(json['startDato'])),
    };
}

export function KategoriToJSON(value?: Kategori | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'id': value.id,
        'navn': value.navn,
        'kortnavn': value.kortnavn,
        'sorteringsnummer': value.sorteringsnummer,
        'beskrivelse': value.beskrivelse,
        'startDato': value.startDato === undefined ? undefined : (value.startDato.toISOString().substring(0,10)),
    };
}


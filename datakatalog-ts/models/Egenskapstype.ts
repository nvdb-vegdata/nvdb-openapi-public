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
import {
     EgenskapstypeAssosiasjonFromJSONTyped,
     EgenskapstypeBinaerFromJSONTyped,
     EgenskapstypeBoolskFromJSONTyped,
     EgenskapstypeDatoFromJSONTyped,
     EgenskapstypeFlyttallFromJSONTyped,
     EgenskapstypeFlyttallenumFromJSONTyped,
     EgenskapstypeGeometriFromJSONTyped,
     EgenskapstypeHeltallFromJSONTyped,
     EgenskapstypeHeltallenumFromJSONTyped,
     EgenskapstypeKortdatoFromJSONTyped,
     EgenskapstypeListeFromJSONTyped,
     EgenskapstypeStedfestingFromJSONTyped,
     EgenskapstypeStrukturFromJSONTyped,
     EgenskapstypeTekstFromJSONTyped,
     EgenskapstypeTekstenumFromJSONTyped,
     EgenskapstypeTidFromJSONTyped
} from './index';

/**
 * 
 * @export
 * @interface Egenskapstype
 */
export interface Egenskapstype {
    /**
     * 
     * @type {number}
     * @memberof Egenskapstype
     */
    id: number;
    /**
     * 
     * @type {string}
     * @memberof Egenskapstype
     */
    kortnavn?: string;
    /**
     * 
     * @type {string}
     * @memberof Egenskapstype
     */
    beskrivelse?: string;
    /**
     * 
     * @type {string}
     * @memberof Egenskapstype
     */
    sosinavn?: string;
    /**
     * 
     * @type {string}
     * @memberof Egenskapstype
     */
    sosinvdbnavn?: string;
    /**
     * 
     * @type {number}
     * @memberof Egenskapstype
     */
    sorteringsnummer: number;
    /**
     * 
     * @type {boolean}
     * @memberof Egenskapstype
     */
    avledet: boolean;
    /**
     * 
     * @type {number}
     * @memberof Egenskapstype
     */
    komplementrEgenskapstype?: number;
    /**
     * 
     * @type {string}
     * @memberof Egenskapstype
     */
    navn?: string;
    /**
     * 
     * @type {string}
     * @memberof Egenskapstype
     */
    egenskapstype: EgenskapstypeEgenskapstypeEnum;
    /**
     * 
     * @type {boolean}
     * @memberof Egenskapstype
     */
    obligatoriskVerdi: boolean;
    /**
     * 
     * @type {boolean}
     * @memberof Egenskapstype
     */
    skrivebeskyttet: boolean;
    /**
     * 
     * @type {number}
     * @memberof Egenskapstype
     */
    sensitivitet: number;
    /**
     * 
     * @type {number}
     * @memberof Egenskapstype
     */
    gruppesorteringsnummer?: number;
    /**
     * 
     * @type {string}
     * @memberof Egenskapstype
     */
    veiledning?: string;
    /**
     * 
     * @type {string}
     * @memberof Egenskapstype
     */
    grunnrissreferanse?: string;
    /**
     * 
     * @type {string}
     * @memberof Egenskapstype
     */
    hydereferanse?: string;
    /**
     * 
     * @type {number}
     * @memberof Egenskapstype
     */
    hydereferanseTall: number;
    /**
     * 
     * @type {number}
     * @memberof Egenskapstype
     */
    nyaktighetskravGrunnriss: number;
    /**
     * 
     * @type {number}
     * @memberof Egenskapstype
     */
    nyaktighetskravHyde: number;
    /**
     * 
     * @type {string}
     * @memberof Egenskapstype
     */
    sosiReferanse?: string;
    /**
     * 
     * @type {boolean}
     * @memberof Egenskapstype
     */
    referansegeometriTilstrekkelig: boolean;
    /**
     * 
     * @type {string}
     * @memberof Egenskapstype
     */
    viktighet: EgenskapstypeViktighetEnum;
    /**
     * 
     * @type {number}
     * @memberof Egenskapstype
     */
    kategori: number;
}


/**
 * @export
 */
export const EgenskapstypeEgenskapstypeEnum = {
    Assosiasjon: 'Assosiasjon',
    Boolsk: 'Boolsk',
    Binr: 'Binær',
    Tekst: 'Tekst',
    Dato: 'Dato',
    Flyttall: 'Flyttall',
    Heltall: 'Heltall',
    Struktur: 'Struktur',
    Geometri: 'Geometri',
    Stedfesting: 'Stedfesting',
    Kortdato: 'Kortdato',
    Tid: 'Tid',
    Liste: 'Liste',
    Tekstenum: 'Tekstenum',
    Heltallenum: 'Heltallenum',
    Flyttallenum: 'Flyttallenum'
} as const;
export type EgenskapstypeEgenskapstypeEnum = typeof EgenskapstypeEgenskapstypeEnum[keyof typeof EgenskapstypeEgenskapstypeEnum];

/**
 * @export
 */
export const EgenskapstypeViktighetEnum = {
    IkkeSatt: 'IKKE_SATT',
    PkrevdAbsolutt: 'PÅKREVD_ABSOLUTT',
    PkrevdIkkeAbsolutt: 'PÅKREVD_IKKE_ABSOLUTT',
    Betinget: 'BETINGET',
    Opsjonell: 'OPSJONELL',
    MindreViktig: 'MINDRE_VIKTIG',
    Historisk: 'HISTORISK'
} as const;
export type EgenskapstypeViktighetEnum = typeof EgenskapstypeViktighetEnum[keyof typeof EgenskapstypeViktighetEnum];


/**
 * Check if a given object implements the Egenskapstype interface.
 */
export function instanceOfEgenskapstype(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "id" in value;
    isInstance = isInstance && "sorteringsnummer" in value;
    isInstance = isInstance && "avledet" in value;
    isInstance = isInstance && "egenskapstype" in value;
    isInstance = isInstance && "obligatoriskVerdi" in value;
    isInstance = isInstance && "skrivebeskyttet" in value;
    isInstance = isInstance && "sensitivitet" in value;
    isInstance = isInstance && "hydereferanseTall" in value;
    isInstance = isInstance && "nyaktighetskravGrunnriss" in value;
    isInstance = isInstance && "nyaktighetskravHyde" in value;
    isInstance = isInstance && "referansegeometriTilstrekkelig" in value;
    isInstance = isInstance && "viktighet" in value;
    isInstance = isInstance && "kategori" in value;

    return isInstance;
}

export function EgenskapstypeFromJSON(json: any): Egenskapstype {
    return EgenskapstypeFromJSONTyped(json, false);
}

export function EgenskapstypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): Egenskapstype {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    if (!ignoreDiscriminator) {
        if (json['egenskapstype'] === 'Assosiasjon') {
            return EgenskapstypeAssosiasjonFromJSONTyped(json, true);
        }
        if (json['egenskapstype'] === 'Binær') {
            return EgenskapstypeBinaerFromJSONTyped(json, true);
        }
        if (json['egenskapstype'] === 'Boolsk') {
            return EgenskapstypeBoolskFromJSONTyped(json, true);
        }
        if (json['egenskapstype'] === 'Dato') {
            return EgenskapstypeDatoFromJSONTyped(json, true);
        }
        if (json['egenskapstype'] === 'Flyttall') {
            return EgenskapstypeFlyttallFromJSONTyped(json, true);
        }
        if (json['egenskapstype'] === 'Flyttallenum') {
            return EgenskapstypeFlyttallenumFromJSONTyped(json, true);
        }
        if (json['egenskapstype'] === 'Geometri') {
            return EgenskapstypeGeometriFromJSONTyped(json, true);
        }
        if (json['egenskapstype'] === 'Heltall') {
            return EgenskapstypeHeltallFromJSONTyped(json, true);
        }
        if (json['egenskapstype'] === 'Heltallenum') {
            return EgenskapstypeHeltallenumFromJSONTyped(json, true);
        }
        if (json['egenskapstype'] === 'Kortdato') {
            return EgenskapstypeKortdatoFromJSONTyped(json, true);
        }
        if (json['egenskapstype'] === 'Liste') {
            return EgenskapstypeListeFromJSONTyped(json, true);
        }
        if (json['egenskapstype'] === 'Stedfesting') {
            return EgenskapstypeStedfestingFromJSONTyped(json, true);
        }
        if (json['egenskapstype'] === 'Struktur') {
            return EgenskapstypeStrukturFromJSONTyped(json, true);
        }
        if (json['egenskapstype'] === 'Tekst') {
            return EgenskapstypeTekstFromJSONTyped(json, true);
        }
        if (json['egenskapstype'] === 'Tekstenum') {
            return EgenskapstypeTekstenumFromJSONTyped(json, true);
        }
        if (json['egenskapstype'] === 'Tid') {
            return EgenskapstypeTidFromJSONTyped(json, true);
        }
    }
    return {
        
        'id': json['id'],
        'kortnavn': !exists(json, 'kortnavn') ? undefined : json['kortnavn'],
        'beskrivelse': !exists(json, 'beskrivelse') ? undefined : json['beskrivelse'],
        'sosinavn': !exists(json, 'sosinavn') ? undefined : json['sosinavn'],
        'sosinvdbnavn': !exists(json, 'sosinvdbnavn') ? undefined : json['sosinvdbnavn'],
        'sorteringsnummer': json['sorteringsnummer'],
        'avledet': json['avledet'],
        'komplementrEgenskapstype': !exists(json, 'komplementær_egenskapstype') ? undefined : json['komplementær_egenskapstype'],
        'navn': !exists(json, 'navn') ? undefined : json['navn'],
        'egenskapstype': json['egenskapstype'],
        'obligatoriskVerdi': json['obligatorisk_verdi'],
        'skrivebeskyttet': json['skrivebeskyttet'],
        'sensitivitet': json['sensitivitet'],
        'gruppesorteringsnummer': !exists(json, 'gruppesorteringsnummer') ? undefined : json['gruppesorteringsnummer'],
        'veiledning': !exists(json, 'veiledning') ? undefined : json['veiledning'],
        'grunnrissreferanse': !exists(json, 'grunnrissreferanse') ? undefined : json['grunnrissreferanse'],
        'hydereferanse': !exists(json, 'høydereferanse') ? undefined : json['høydereferanse'],
        'hydereferanseTall': json['høydereferanse_tall'],
        'nyaktighetskravGrunnriss': json['nøyaktighetskrav_grunnriss'],
        'nyaktighetskravHyde': json['nøyaktighetskrav_høyde'],
        'sosiReferanse': !exists(json, 'sosi_referanse') ? undefined : json['sosi_referanse'],
        'referansegeometriTilstrekkelig': json['referansegeometri_tilstrekkelig'],
        'viktighet': json['viktighet'],
        'kategori': json['kategori'],
    };
}

export function EgenskapstypeToJSON(value?: Egenskapstype | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'id': value.id,
        'kortnavn': value.kortnavn,
        'beskrivelse': value.beskrivelse,
        'sosinavn': value.sosinavn,
        'sosinvdbnavn': value.sosinvdbnavn,
        'sorteringsnummer': value.sorteringsnummer,
        'avledet': value.avledet,
        'komplementær_egenskapstype': value.komplementrEgenskapstype,
        'navn': value.navn,
        'egenskapstype': value.egenskapstype,
        'obligatorisk_verdi': value.obligatoriskVerdi,
        'skrivebeskyttet': value.skrivebeskyttet,
        'sensitivitet': value.sensitivitet,
        'gruppesorteringsnummer': value.gruppesorteringsnummer,
        'veiledning': value.veiledning,
        'grunnrissreferanse': value.grunnrissreferanse,
        'høydereferanse': value.hydereferanse,
        'høydereferanse_tall': value.hydereferanseTall,
        'nøyaktighetskrav_grunnriss': value.nyaktighetskravGrunnriss,
        'nøyaktighetskrav_høyde': value.nyaktighetskravHyde,
        'sosi_referanse': value.sosiReferanse,
        'referansegeometri_tilstrekkelig': value.referansegeometriTilstrekkelig,
        'viktighet': value.viktighet,
        'kategori': value.kategori,
    };
}


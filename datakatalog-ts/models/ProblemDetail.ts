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
 * @interface ProblemDetail
 */
export interface ProblemDetail {
    /**
     * 
     * @type {string}
     * @memberof ProblemDetail
     */
    type?: string;
    /**
     * 
     * @type {string}
     * @memberof ProblemDetail
     */
    title?: string;
    /**
     * 
     * @type {number}
     * @memberof ProblemDetail
     */
    status?: number;
    /**
     * 
     * @type {string}
     * @memberof ProblemDetail
     */
    detail?: string;
    /**
     * 
     * @type {string}
     * @memberof ProblemDetail
     */
    instance?: string;
    /**
     * 
     * @type {{ [key: string]: object; }}
     * @memberof ProblemDetail
     */
    properties?: { [key: string]: object; };
}

/**
 * Check if a given object implements the ProblemDetail interface.
 */
export function instanceOfProblemDetail(value: object): boolean {
    let isInstance = true;

    return isInstance;
}

export function ProblemDetailFromJSON(json: any): ProblemDetail {
    return ProblemDetailFromJSONTyped(json, false);
}

export function ProblemDetailFromJSONTyped(json: any, ignoreDiscriminator: boolean): ProblemDetail {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'type': !exists(json, 'type') ? undefined : json['type'],
        'title': !exists(json, 'title') ? undefined : json['title'],
        'status': !exists(json, 'status') ? undefined : json['status'],
        'detail': !exists(json, 'detail') ? undefined : json['detail'],
        'instance': !exists(json, 'instance') ? undefined : json['instance'],
        'properties': !exists(json, 'properties') ? undefined : json['properties'],
    };
}

export function ProblemDetailToJSON(value?: ProblemDetail | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'type': value.type,
        'title': value.title,
        'status': value.status,
        'detail': value.detail,
        'instance': value.instance,
        'properties': value.properties,
    };
}


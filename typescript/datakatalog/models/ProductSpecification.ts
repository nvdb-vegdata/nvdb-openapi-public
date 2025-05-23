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
/**
 *
 * @export
 * @interface ProductSpecification
 */
export interface ProductSpecification {
  /**
   *
   * @type {string}
   * @memberof ProductSpecification
   */
  url: string
}

/**
 * Check if a given object implements the ProductSpecification interface.
 */
export function instanceOfProductSpecification(
  value: object,
): value is ProductSpecification {
  if (!('url' in value) || value['url'] === undefined) return false
  return true
}

export function ProductSpecificationFromJSON(json: any): ProductSpecification {
  return ProductSpecificationFromJSONTyped(json, false)
}

export function ProductSpecificationFromJSONTyped(
  json: any,
  ignoreDiscriminator: boolean,
): ProductSpecification {
  if (json == null) {
    return json
  }
  return {
    url: json['url'],
  }
}

export function ProductSpecificationToJSON(json: any): ProductSpecification {
  return ProductSpecificationToJSONTyped(json, false)
}

export function ProductSpecificationToJSONTyped(
  value?: ProductSpecification | null,
  ignoreDiscriminator: boolean = false,
): any {
  if (value == null) {
    return value
  }

  return {
    url: value['url'],
  }
}

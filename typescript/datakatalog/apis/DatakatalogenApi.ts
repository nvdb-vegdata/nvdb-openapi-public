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

import * as runtime from '../runtime'
import type {
  Egenskapstype,
  EgenskapstypeKategori,
  Enhet,
  Kategori,
  ProblemDetail,
  Vegobjekttype,
  Versjon,
} from '../models/index'
import {
  EgenskapstypeFromJSON,
  EgenskapstypeToJSON,
  EgenskapstypeKategoriFromJSON,
  EgenskapstypeKategoriToJSON,
  EnhetFromJSON,
  EnhetToJSON,
  KategoriFromJSON,
  KategoriToJSON,
  ProblemDetailFromJSON,
  ProblemDetailToJSON,
  VegobjekttypeFromJSON,
  VegobjekttypeToJSON,
  VersjonFromJSON,
  VersjonToJSON,
} from '../models/index'

export interface GetEgenskapstypeRequest {
  egenskapstypeid: number
}

export interface GetEgenskapstypeForVegobjekttypeRequest {
  vegobjekttypeid: number
  egenskapstypeid: number
}

export interface GetVegobjekttypeRequest {
  vegobjekttypeid: number
  inkluder?: Array<GetVegobjekttypeInkluderEnum>
}

export interface GetVegobjekttyperRequest {
  inkluder?: Array<GetVegobjekttyperInkluderEnum>
  kategori?: number
}

export interface GetVegobjekttyperHistoriskRequest {
  versjon: string
  inkluder?: Array<GetVegobjekttyperHistoriskInkluderEnum>
  kategori?: number
}

/**
 *
 */
export class DatakatalogenApi extends runtime.BaseAPI {
  /**
   * Returnerer angitt egenskapstype
   */
  async getEgenskapstypeRaw(
    requestParameters: GetEgenskapstypeRequest,
    initOverrides?: RequestInit | runtime.InitOverrideFunction,
  ): Promise<runtime.ApiResponse<Egenskapstype>> {
    if (
      requestParameters.egenskapstypeid === null ||
      requestParameters.egenskapstypeid === undefined
    ) {
      throw new runtime.RequiredError(
        'egenskapstypeid',
        'Required parameter requestParameters.egenskapstypeid was null or undefined when calling getEgenskapstype.',
      )
    }

    const queryParameters: any = {}

    const headerParameters: runtime.HTTPHeaders = {}

    const response = await this.request(
      {
        path: `/api/v1/egenskapstyper/{egenskapstypeid}`.replace(
          `{${'egenskapstypeid'}}`,
          encodeURIComponent(String(requestParameters.egenskapstypeid)),
        ),
        method: 'GET',
        headers: headerParameters,
        query: queryParameters,
      },
      initOverrides,
    )

    return new runtime.JSONApiResponse(response, (jsonValue) =>
      EgenskapstypeFromJSON(jsonValue),
    )
  }

  /**
   * Returnerer angitt egenskapstype
   */
  async getEgenskapstype(
    requestParameters: GetEgenskapstypeRequest,
    initOverrides?: RequestInit | runtime.InitOverrideFunction,
  ): Promise<Egenskapstype> {
    const response = await this.getEgenskapstypeRaw(
      requestParameters,
      initOverrides,
    )
    return await response.value()
  }

  /**
   * Returnerer angitt egenskapstype for angitt vegobjekttype
   */
  async getEgenskapstypeForVegobjekttypeRaw(
    requestParameters: GetEgenskapstypeForVegobjekttypeRequest,
    initOverrides?: RequestInit | runtime.InitOverrideFunction,
  ): Promise<runtime.ApiResponse<Egenskapstype>> {
    if (
      requestParameters.vegobjekttypeid === null ||
      requestParameters.vegobjekttypeid === undefined
    ) {
      throw new runtime.RequiredError(
        'vegobjekttypeid',
        'Required parameter requestParameters.vegobjekttypeid was null or undefined when calling getEgenskapstypeForVegobjekttype.',
      )
    }

    if (
      requestParameters.egenskapstypeid === null ||
      requestParameters.egenskapstypeid === undefined
    ) {
      throw new runtime.RequiredError(
        'egenskapstypeid',
        'Required parameter requestParameters.egenskapstypeid was null or undefined when calling getEgenskapstypeForVegobjekttype.',
      )
    }

    const queryParameters: any = {}

    const headerParameters: runtime.HTTPHeaders = {}

    const response = await this.request(
      {
        path: `/api/v1/vegobjekttyper/{vegobjekttypeid}/{egenskapstypeid}`
          .replace(
            `{${'vegobjekttypeid'}}`,
            encodeURIComponent(String(requestParameters.vegobjekttypeid)),
          )
          .replace(
            `{${'egenskapstypeid'}}`,
            encodeURIComponent(String(requestParameters.egenskapstypeid)),
          ),
        method: 'GET',
        headers: headerParameters,
        query: queryParameters,
      },
      initOverrides,
    )

    return new runtime.JSONApiResponse(response, (jsonValue) =>
      EgenskapstypeFromJSON(jsonValue),
    )
  }

  /**
   * Returnerer angitt egenskapstype for angitt vegobjekttype
   */
  async getEgenskapstypeForVegobjekttype(
    requestParameters: GetEgenskapstypeForVegobjekttypeRequest,
    initOverrides?: RequestInit | runtime.InitOverrideFunction,
  ): Promise<Egenskapstype> {
    const response = await this.getEgenskapstypeForVegobjekttypeRaw(
      requestParameters,
      initOverrides,
    )
    return await response.value()
  }

  /**
   * Returnerer alle kategorier for egenskapstypene
   */
  async getEgenskapstypeKategorierRaw(
    initOverrides?: RequestInit | runtime.InitOverrideFunction,
  ): Promise<runtime.ApiResponse<Array<EgenskapstypeKategori>>> {
    const queryParameters: any = {}

    const headerParameters: runtime.HTTPHeaders = {}

    const response = await this.request(
      {
        path: `/api/v1/egenskapstypekategorier`,
        method: 'GET',
        headers: headerParameters,
        query: queryParameters,
      },
      initOverrides,
    )

    return new runtime.JSONApiResponse(response, (jsonValue) =>
      jsonValue.map(EgenskapstypeKategoriFromJSON),
    )
  }

  /**
   * Returnerer alle kategorier for egenskapstypene
   */
  async getEgenskapstypeKategorier(
    initOverrides?: RequestInit | runtime.InitOverrideFunction,
  ): Promise<Array<EgenskapstypeKategori>> {
    const response = await this.getEgenskapstypeKategorierRaw(initOverrides)
    return await response.value()
  }

  /**
   * Returnerer alle enheter
   */
  async getEnheterRaw(
    initOverrides?: RequestInit | runtime.InitOverrideFunction,
  ): Promise<runtime.ApiResponse<Array<Enhet>>> {
    const queryParameters: any = {}

    const headerParameters: runtime.HTTPHeaders = {}

    const response = await this.request(
      {
        path: `/api/v1/enheter`,
        method: 'GET',
        headers: headerParameters,
        query: queryParameters,
      },
      initOverrides,
    )

    return new runtime.JSONApiResponse(response, (jsonValue) =>
      jsonValue.map(EnhetFromJSON),
    )
  }

  /**
   * Returnerer alle enheter
   */
  async getEnheter(
    initOverrides?: RequestInit | runtime.InitOverrideFunction,
  ): Promise<Array<Enhet>> {
    const response = await this.getEnheterRaw(initOverrides)
    return await response.value()
  }

  /**
   * Returnerer alle kategorier for vegobjekter
   */
  async getKategorierRaw(
    initOverrides?: RequestInit | runtime.InitOverrideFunction,
  ): Promise<runtime.ApiResponse<Array<Kategori>>> {
    const queryParameters: any = {}

    const headerParameters: runtime.HTTPHeaders = {}

    const response = await this.request(
      {
        path: `/api/v1/kategorier`,
        method: 'GET',
        headers: headerParameters,
        query: queryParameters,
      },
      initOverrides,
    )

    return new runtime.JSONApiResponse(response, (jsonValue) =>
      jsonValue.map(KategoriFromJSON),
    )
  }

  /**
   * Returnerer alle kategorier for vegobjekter
   */
  async getKategorier(
    initOverrides?: RequestInit | runtime.InitOverrideFunction,
  ): Promise<Array<Kategori>> {
    const response = await this.getKategorierRaw(initOverrides)
    return await response.value()
  }

  /**
   * Returnerer angitt vegobjekttype
   */
  async getVegobjekttypeRaw(
    requestParameters: GetVegobjekttypeRequest,
    initOverrides?: RequestInit | runtime.InitOverrideFunction,
  ): Promise<runtime.ApiResponse<Vegobjekttype>> {
    if (
      requestParameters.vegobjekttypeid === null ||
      requestParameters.vegobjekttypeid === undefined
    ) {
      throw new runtime.RequiredError(
        'vegobjekttypeid',
        'Required parameter requestParameters.vegobjekttypeid was null or undefined when calling getVegobjekttype.',
      )
    }

    const queryParameters: any = {}

    if (requestParameters.inkluder) {
      queryParameters['inkluder'] = requestParameters.inkluder
    }

    const headerParameters: runtime.HTTPHeaders = {}

    const response = await this.request(
      {
        path: `/api/v1/vegobjekttyper/{vegobjekttypeid}`.replace(
          `{${'vegobjekttypeid'}}`,
          encodeURIComponent(String(requestParameters.vegobjekttypeid)),
        ),
        method: 'GET',
        headers: headerParameters,
        query: queryParameters,
      },
      initOverrides,
    )

    return new runtime.JSONApiResponse(response, (jsonValue) =>
      VegobjekttypeFromJSON(jsonValue),
    )
  }

  /**
   * Returnerer angitt vegobjekttype
   */
  async getVegobjekttype(
    requestParameters: GetVegobjekttypeRequest,
    initOverrides?: RequestInit | runtime.InitOverrideFunction,
  ): Promise<Vegobjekttype> {
    const response = await this.getVegobjekttypeRaw(
      requestParameters,
      initOverrides,
    )
    return await response.value()
  }

  /**
   * Returnerer alle vegobjekttypene
   */
  async getVegobjekttyperRaw(
    requestParameters: GetVegobjekttyperRequest,
    initOverrides?: RequestInit | runtime.InitOverrideFunction,
  ): Promise<runtime.ApiResponse<Array<Vegobjekttype>>> {
    const queryParameters: any = {}

    if (requestParameters.inkluder) {
      queryParameters['inkluder'] = requestParameters.inkluder
    }

    if (requestParameters.kategori !== undefined) {
      queryParameters['kategori'] = requestParameters.kategori
    }

    const headerParameters: runtime.HTTPHeaders = {}

    const response = await this.request(
      {
        path: `/api/v1/vegobjekttyper`,
        method: 'GET',
        headers: headerParameters,
        query: queryParameters,
      },
      initOverrides,
    )

    return new runtime.JSONApiResponse(response, (jsonValue) =>
      jsonValue.map(VegobjekttypeFromJSON),
    )
  }

  /**
   * Returnerer alle vegobjekttypene
   */
  async getVegobjekttyper(
    requestParameters: GetVegobjekttyperRequest = {},
    initOverrides?: RequestInit | runtime.InitOverrideFunction,
  ): Promise<Array<Vegobjekttype>> {
    const response = await this.getVegobjekttyperRaw(
      requestParameters,
      initOverrides,
    )
    return await response.value()
  }

  /**
   * Returnerer alle vegobjekttypene for en gitt versjon av datakatalogen, f.eks. 2.31
   */
  async getVegobjekttyperHistoriskRaw(
    requestParameters: GetVegobjekttyperHistoriskRequest,
    initOverrides?: RequestInit | runtime.InitOverrideFunction,
  ): Promise<runtime.ApiResponse<Array<Vegobjekttype>>> {
    if (
      requestParameters.versjon === null ||
      requestParameters.versjon === undefined
    ) {
      throw new runtime.RequiredError(
        'versjon',
        'Required parameter requestParameters.versjon was null or undefined when calling getVegobjekttyperHistorisk.',
      )
    }

    const queryParameters: any = {}

    if (requestParameters.inkluder) {
      queryParameters['inkluder'] = requestParameters.inkluder
    }

    if (requestParameters.kategori !== undefined) {
      queryParameters['kategori'] = requestParameters.kategori
    }

    const headerParameters: runtime.HTTPHeaders = {}

    const response = await this.request(
      {
        path: `/api/v1/vegobjekttyper/historisk/{versjon}`.replace(
          `{${'versjon'}}`,
          encodeURIComponent(String(requestParameters.versjon)),
        ),
        method: 'GET',
        headers: headerParameters,
        query: queryParameters,
      },
      initOverrides,
    )

    return new runtime.JSONApiResponse(response, (jsonValue) =>
      jsonValue.map(VegobjekttypeFromJSON),
    )
  }

  /**
   * Returnerer alle vegobjekttypene for en gitt versjon av datakatalogen, f.eks. 2.31
   */
  async getVegobjekttyperHistorisk(
    requestParameters: GetVegobjekttyperHistoriskRequest,
    initOverrides?: RequestInit | runtime.InitOverrideFunction,
  ): Promise<Array<Vegobjekttype>> {
    const response = await this.getVegobjekttyperHistoriskRaw(
      requestParameters,
      initOverrides,
    )
    return await response.value()
  }

  /**
   * Returnerer aktiv versjon på datakatalog
   */
  async getVersjonRaw(
    initOverrides?: RequestInit | runtime.InitOverrideFunction,
  ): Promise<runtime.ApiResponse<Versjon>> {
    const queryParameters: any = {}

    const headerParameters: runtime.HTTPHeaders = {}

    const response = await this.request(
      {
        path: `/api/v1/versjon`,
        method: 'GET',
        headers: headerParameters,
        query: queryParameters,
      },
      initOverrides,
    )

    return new runtime.JSONApiResponse(response, (jsonValue) =>
      VersjonFromJSON(jsonValue),
    )
  }

  /**
   * Returnerer aktiv versjon på datakatalog
   */
  async getVersjon(
    initOverrides?: RequestInit | runtime.InitOverrideFunction,
  ): Promise<Versjon> {
    const response = await this.getVersjonRaw(initOverrides)
    return await response.value()
  }
}

/**
 * @export
 */
export const GetVegobjekttypeInkluderEnum = {
  Egenskapstyper: 'egenskapstyper',
  Relasjonstyper: 'relasjonstyper',
  Stedfesting: 'stedfesting',
  Alle: 'alle',
  Minimum: 'minimum',
} as const
export type GetVegobjekttypeInkluderEnum =
  (typeof GetVegobjekttypeInkluderEnum)[keyof typeof GetVegobjekttypeInkluderEnum]
/**
 * @export
 */
export const GetVegobjekttyperInkluderEnum = {
  Egenskapstyper: 'egenskapstyper',
  Relasjonstyper: 'relasjonstyper',
  Stedfesting: 'stedfesting',
  Alle: 'alle',
  Minimum: 'minimum',
} as const
export type GetVegobjekttyperInkluderEnum =
  (typeof GetVegobjekttyperInkluderEnum)[keyof typeof GetVegobjekttyperInkluderEnum]
/**
 * @export
 */
export const GetVegobjekttyperHistoriskInkluderEnum = {
  Egenskapstyper: 'egenskapstyper',
  Relasjonstyper: 'relasjonstyper',
  Stedfesting: 'stedfesting',
  Alle: 'alle',
  Minimum: 'minimum',
} as const
export type GetVegobjekttyperHistoriskInkluderEnum =
  (typeof GetVegobjekttyperHistoriskInkluderEnum)[keyof typeof GetVegobjekttyperHistoriskInkluderEnum]
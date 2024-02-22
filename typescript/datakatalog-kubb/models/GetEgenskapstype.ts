import type { ProblemDetail } from './ProblemDetail'
import type { Egenskapstype } from './Egenskapstype'

export type GetEgenskapstypePathParams = {
  /**
   * @type integer int32
   */
  egenskapstypeid: number
}

/**
 * @description Not Found
 */
export type GetEgenskapstype404 = ProblemDetail

/**
 * @description Internal Server Error
 */
export type GetEgenskapstype500 = ProblemDetail

/**
 * @description Service Unavailable
 */
export type GetEgenskapstype503 = ProblemDetail

/**
 * @description OK
 */
export type GetEgenskapstypeQueryResponse = Egenskapstype
export type GetEgenskapstypeQuery = {
  Response: GetEgenskapstypeQueryResponse
  PathParams: GetEgenskapstypePathParams
  Errors: GetEgenskapstype404 | GetEgenskapstype500 | GetEgenskapstype503
}

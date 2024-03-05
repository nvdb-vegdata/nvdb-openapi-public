import type { Egenskapstype } from './Egenskapstype'
import type { ProblemDetail } from './ProblemDetail'

export type GetEgenskapstypeForVegobjekttypePathParams = {
  /**
   * @type integer int32
   */
  vegobjekttypeid: number
  /**
   * @type integer int32
   */
  egenskapstypeid: number
}

/**
 * @description OK
 */
export type GetEgenskapstypeForVegobjekttype200 = Egenskapstype

/**
 * @description Not Found
 */
export type GetEgenskapstypeForVegobjekttype404 = ProblemDetail

/**
 * @description Internal Server Error
 */
export type GetEgenskapstypeForVegobjekttype500 = ProblemDetail

/**
 * @description Service Unavailable
 */
export type GetEgenskapstypeForVegobjekttype503 = ProblemDetail

/**
 * @description OK
 */
export type GetEgenskapstypeForVegobjekttypeQueryResponse = Egenskapstype
export type GetEgenskapstypeForVegobjekttypeQuery = {
  Response: GetEgenskapstypeForVegobjekttypeQueryResponse
  PathParams: GetEgenskapstypeForVegobjekttypePathParams
  Errors:
    | GetEgenskapstypeForVegobjekttype404
    | GetEgenskapstypeForVegobjekttype500
    | GetEgenskapstypeForVegobjekttype503
}

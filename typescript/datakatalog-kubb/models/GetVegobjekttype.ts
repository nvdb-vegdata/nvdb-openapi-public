import type { Vegobjekttype } from './Vegobjekttype'
import type { ProblemDetail } from './ProblemDetail'

export type GetVegobjekttypePathParams = {
  /**
   * @type integer, int32
   */
  vegobjekttypeid: number
}
export type GetVegobjekttypeQueryParamsInkluder =
  | 'egenskapstyper'
  | 'relasjonstyper'
  | 'stedfesting'
  | 'alle'
  | 'minimum'
export type GetVegobjekttypeQueryParams = {
  /**
   * @description Kommaseparert liste med hvilke informasjonsfelter som skal inkluderes i tillegg til vegobjekttypenes metadata.
   * @type array | undefined
   */
  inkluder?: GetVegobjekttypeQueryParamsInkluder[]
}
/**
 * @description OK
 */
export type GetVegobjekttype200 = Vegobjekttype
/**
 * @description Not Found
 */
export type GetVegobjekttype404 = ProblemDetail
/**
 * @description Internal Server Error
 */
export type GetVegobjekttype500 = ProblemDetail
/**
 * @description Service Unavailable
 */
export type GetVegobjekttype503 = ProblemDetail
/**
 * @description OK
 */
export type GetVegobjekttypeQueryResponse = Vegobjekttype
export type GetVegobjekttypeQuery = {
  Response: GetVegobjekttypeQueryResponse
  PathParams: GetVegobjekttypePathParams
  QueryParams: GetVegobjekttypeQueryParams
  Errors: GetVegobjekttype404 | GetVegobjekttype500 | GetVegobjekttype503
}

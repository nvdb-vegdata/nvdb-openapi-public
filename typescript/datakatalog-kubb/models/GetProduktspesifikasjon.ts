import type { ProductSpecification } from './ProductSpecification'
import type { ProblemDetail } from './ProblemDetail'

export type GetProduktspesifikasjonPathParams = {
  /**
   * @type integer, int32
   */
  vegobjekttypeid: number
}
/**
 * @description OK
 */
export type GetProduktspesifikasjon200 = ProductSpecification
/**
 * @description Not Found
 */
export type GetProduktspesifikasjon404 = ProblemDetail
/**
 * @description Internal Server Error
 */
export type GetProduktspesifikasjon500 = ProblemDetail
/**
 * @description Service Unavailable
 */
export type GetProduktspesifikasjon503 = ProblemDetail
/**
 * @description OK
 */
export type GetProduktspesifikasjonQueryResponse = ProductSpecification
export type GetProduktspesifikasjonQuery = {
  Response: GetProduktspesifikasjonQueryResponse
  PathParams: GetProduktspesifikasjonPathParams
  Errors:
    | GetProduktspesifikasjon404
    | GetProduktspesifikasjon500
    | GetProduktspesifikasjon503
}

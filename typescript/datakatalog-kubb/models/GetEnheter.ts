import type { Enhet } from './Enhet'
import type { ProblemDetail } from './ProblemDetail'

/**
 * @description OK
 */
export type GetEnheter200 = Enhet[]

/**
 * @description Not Found
 */
export type GetEnheter404 = ProblemDetail

/**
 * @description Internal Server Error
 */
export type GetEnheter500 = ProblemDetail

/**
 * @description Service Unavailable
 */
export type GetEnheter503 = ProblemDetail

/**
 * @description OK
 */
export type GetEnheterQueryResponse = Enhet[]
export type GetEnheterQuery = {
  Response: GetEnheterQueryResponse
  Errors: GetEnheter404 | GetEnheter500 | GetEnheter503
}

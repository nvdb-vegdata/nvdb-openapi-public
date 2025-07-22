import type { ProblemDetail } from './ProblemDetail'
import type { Kategori } from './Kategori'

/**
 * @description Not Found
 */
export type GetKategorier404 = ProblemDetail

/**
 * @description Internal Server Error
 */
export type GetKategorier500 = ProblemDetail

/**
 * @description Service Unavailable
 */
export type GetKategorier503 = ProblemDetail

/**
 * @description OK
 */
export type GetKategorierQueryResponse = Kategori[]
export type GetKategorierQuery = {
  Response: GetKategorierQueryResponse
  Errors: GetKategorier404 | GetKategorier500 | GetKategorier503
}

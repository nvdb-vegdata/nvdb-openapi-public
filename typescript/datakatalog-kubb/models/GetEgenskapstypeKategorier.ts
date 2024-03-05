import type { EgenskapstypeKategori } from './EgenskapstypeKategori'
import type { ProblemDetail } from './ProblemDetail'

/**
 * @description OK
 */
export type GetEgenskapstypeKategorier200 = EgenskapstypeKategori[]

/**
 * @description Not Found
 */
export type GetEgenskapstypeKategorier404 = ProblemDetail

/**
 * @description Internal Server Error
 */
export type GetEgenskapstypeKategorier500 = ProblemDetail

/**
 * @description Service Unavailable
 */
export type GetEgenskapstypeKategorier503 = ProblemDetail

/**
 * @description OK
 */
export type GetEgenskapstypeKategorierQueryResponse = EgenskapstypeKategori[]
export type GetEgenskapstypeKategorierQuery = {
  Response: GetEgenskapstypeKategorierQueryResponse
  Errors:
    | GetEgenskapstypeKategorier404
    | GetEgenskapstypeKategorier500
    | GetEgenskapstypeKategorier503
}

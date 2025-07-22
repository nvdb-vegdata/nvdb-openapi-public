import type { ProblemDetail } from './ProblemDetail'
import type { Versjon } from './Versjon'

/**
 * @description Not Found
 */
export type GetVersjon404 = ProblemDetail

/**
 * @description Internal Server Error
 */
export type GetVersjon500 = ProblemDetail

/**
 * @description Service Unavailable
 */
export type GetVersjon503 = ProblemDetail

/**
 * @description OK
 */
export type GetVersjonQueryResponse = Versjon
export type GetVersjonQuery = {
  Response: GetVersjonQueryResponse
  Errors: GetVersjon404 | GetVersjon500 | GetVersjon503
}

import type { ProblemDetail } from './ProblemDetail'
import type { Vegobjekttype } from './Vegobjekttype'

export type GetVegobjekttyperQueryParamsInkluder =
  | 'egenskapstyper'
  | 'relasjonstyper'
  | 'stedfesting'
  | 'alle'
  | 'minimum'
export type GetVegobjekttyperQueryParams =
  | {
      /**
       * @description Kommaseparert liste med hvilke informasjonsfelter som skal inkluderes i tillegg til vegobjekttypenes metadata.
       * @type array | undefined
       */
      inkluder?: GetVegobjekttyperQueryParamsInkluder[]
      /**
       * @description Begrens vegobjekttyper etter kategori. (/vegobjekttyper/kategorier)
       * @type integer | undefined int32
       */
      kategori?: number
    }
  | undefined

/**
 * @description Not Found
 */
export type GetVegobjekttyper404 = ProblemDetail

/**
 * @description Internal Server Error
 */
export type GetVegobjekttyper500 = ProblemDetail

/**
 * @description Service Unavailable
 */
export type GetVegobjekttyper503 = ProblemDetail

/**
 * @description OK
 */
export type GetVegobjekttyperQueryResponse = Vegobjekttype[]
export type GetVegobjekttyperQuery = {
  Response: GetVegobjekttyperQueryResponse
  QueryParams: GetVegobjekttyperQueryParams
  Errors: GetVegobjekttyper404 | GetVegobjekttyper500 | GetVegobjekttyper503
}

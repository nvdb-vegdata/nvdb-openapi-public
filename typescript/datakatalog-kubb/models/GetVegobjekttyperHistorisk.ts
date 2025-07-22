import type { ProblemDetail } from './ProblemDetail'
import type { Vegobjekttype } from './Vegobjekttype'

export type GetVegobjekttyperHistoriskPathParams = {
  /**
   * @type string
   */
  versjon: string
}

export type GetVegobjekttyperHistoriskQueryParamsInkluder =
  | 'egenskapstyper'
  | 'relasjonstyper'
  | 'stedfesting'
  | 'alle'
  | 'minimum'
export type GetVegobjekttyperHistoriskQueryParams =
  | {
      /**
       * @description Kommaseparert liste med hvilke informasjonsfelter som skal inkluderes i tillegg til vegobjekttypenes metadata.
       * @type array | undefined
       */
      inkluder?: GetVegobjekttyperHistoriskQueryParamsInkluder[]
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
export type GetVegobjekttyperHistorisk404 = ProblemDetail

/**
 * @description Internal Server Error
 */
export type GetVegobjekttyperHistorisk500 = ProblemDetail

/**
 * @description Service Unavailable
 */
export type GetVegobjekttyperHistorisk503 = ProblemDetail

/**
 * @description OK
 */
export type GetVegobjekttyperHistoriskQueryResponse = Vegobjekttype[]
export type GetVegobjekttyperHistoriskQuery = {
  Response: GetVegobjekttyperHistoriskQueryResponse
  PathParams: GetVegobjekttyperHistoriskPathParams
  QueryParams: GetVegobjekttyperHistoriskQueryParams
  Errors:
    | GetVegobjekttyperHistorisk404
    | GetVegobjekttyperHistorisk500
    | GetVegobjekttyperHistorisk503
}

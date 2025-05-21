import type { VegobjektNotifikasjonerSide } from './VegobjektNotifikasjonerSide'
import type { ProblemDetail } from './ProblemDetail'

export type GetVegobjektNotifikasjonerPathParams = {
  /**
   * @description Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.\n\nEksempel: 581\n
   * @type integer, int32
   */
  vegobjekttypeId: number
}
export type GetVegobjektNotifikasjonerQueryParams = {
  /**
   * @description Hent alle endringer etter gitt tidspunkt. Dersom denne utelates vil de eldste endringene hentes først.
   * @type string | undefined, date-time
   */
  start?: string
  /**
   * @description Antall endringer som skal være med i responsen. Merk at det faktiske antallet kan variere fra respons til respons. Dette er fordi endringer på samme vegobjektversjon innenfor samme side blir aggregert sammen ved å ta den nyeste endringen. Maksverdi: 1000
   * @type integer | undefined, int32
   */
  antall?: number
  /**
   * @description Bestem om du ønsker endringer for aktive eller historiske vegobjekter. Standardverdi: `false`
   * @type boolean | undefined
   */
  historisk?: boolean
}
/**
 * @description OK
 */
export type GetVegobjektNotifikasjoner200 = VegobjektNotifikasjonerSide
/**
 * @description Bad Request
 */
export type GetVegobjektNotifikasjoner400 = ProblemDetail
/**
 * @description Unauthorized
 */
export type GetVegobjektNotifikasjoner401 = ProblemDetail
/**
 * @description Forbidden
 */
export type GetVegobjektNotifikasjoner403 = ProblemDetail
/**
 * @description Not Found
 */
export type GetVegobjektNotifikasjoner404 = ProblemDetail
/**
 * @description Internal Server Error
 */
export type GetVegobjektNotifikasjoner500 = ProblemDetail
/**
 * @description OK
 */
export type GetVegobjektNotifikasjonerQueryResponse =
  VegobjektNotifikasjonerSide
export type GetVegobjektNotifikasjonerQuery = {
  Response: GetVegobjektNotifikasjonerQueryResponse
  PathParams: GetVegobjektNotifikasjonerPathParams
  QueryParams: GetVegobjektNotifikasjonerQueryParams
  Errors:
    | GetVegobjektNotifikasjoner400
    | GetVegobjektNotifikasjoner401
    | GetVegobjektNotifikasjoner403
    | GetVegobjektNotifikasjoner404
    | GetVegobjektNotifikasjoner500
}

import type { VegobjektEndringerSide } from './VegobjektEndringerSide'
import type { ProblemDetail } from './ProblemDetail'

export type GetVegobjektEndringerForTypePathParams = {
  /**
   * @description Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.\n\nEksempel: 581\n
   * @type integer, int32
   */
  vegobjekttypeId: number
}
export type GetVegobjektEndringerForTypeQueryParams = {
  /**
   * @description Hent endringer for oppgitte vegobjekt IDer. Dersom denne utelates vil alle endringer for den angitte typen hentes.
   * @type array | undefined
   */
  ider?: number[]
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
export type GetVegobjektEndringerForType200 = VegobjektEndringerSide
/**
 * @description Bad Request
 */
export type GetVegobjektEndringerForType400 = ProblemDetail
/**
 * @description Unauthorized
 */
export type GetVegobjektEndringerForType401 = ProblemDetail
/**
 * @description Forbidden
 */
export type GetVegobjektEndringerForType403 = ProblemDetail
/**
 * @description Not Found
 */
export type GetVegobjektEndringerForType404 = ProblemDetail
/**
 * @description Internal Server Error
 */
export type GetVegobjektEndringerForType500 = ProblemDetail
/**
 * @description OK
 */
export type GetVegobjektEndringerForTypeQueryResponse = VegobjektEndringerSide
export type GetVegobjektEndringerForTypeQuery = {
  Response: GetVegobjektEndringerForTypeQueryResponse
  PathParams: GetVegobjektEndringerForTypePathParams
  QueryParams: GetVegobjektEndringerForTypeQueryParams
  Errors:
    | GetVegobjektEndringerForType400
    | GetVegobjektEndringerForType401
    | GetVegobjektEndringerForType403
    | GetVegobjektEndringerForType404
    | GetVegobjektEndringerForType500
}

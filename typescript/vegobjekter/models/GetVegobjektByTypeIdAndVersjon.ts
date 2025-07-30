import type { InkluderIVegobjekt } from './InkluderIVegobjekt'
import type { SridParameter } from './SridParameter'
import type { InkluderGeometri } from './InkluderGeometri'
import type { InkluderIEgenskaper } from './InkluderIEgenskaper'
import type { Vegobjekt } from './Vegobjekt'
import type { ProblemDetail } from './ProblemDetail'

export type GetVegobjektByTypeIdAndVersjonPathParams = {
  /**
   * @description Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.\n\nEksempel: 581\n
   * @type integer, int32
   */
  vegobjekttypeId: number
  /**
   * @type integer, int64
   */
  vegobjektId: number
  /**
   * @type integer, int32
   */
  versjon: number
}
export type GetVegobjektByTypeIdAndVersjonQueryParams = {
  /**
   * @description Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID.
   * @type array | undefined
   */
  inkluder?: InkluderIVegobjekt[]
  /**
   * @type string | undefined
   */
  srid?: SridParameter
  /**
   * @type string | undefined
   */
  inkludergeometri?: InkluderGeometri
  /**
   * @type string | undefined
   */
  inkluder_egenskaper?: InkluderIEgenskaper
  /**
   * @description Hvor mange nivå barn skal inkluderes. 1 betyr bare IDer, 2-n betyr ett eller flere mellomnivåer, \'full\' betyr alle nivåer.
   * @type string | undefined
   */
  dybde?: string
  /**
   * @description Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.
   * @type integer | undefined, int32
   */
  geometritoleranse?: number
  /**
   * @description Finner versjonen som var gyldig denne datoen.
   * @type string | undefined, date
   */
  tidspunkt?: string
}
/**
 * @description OK
 */
export type GetVegobjektByTypeIdAndVersjon200 = Vegobjekt
/**
 * @description Bad Request
 */
export type GetVegobjektByTypeIdAndVersjon400 = ProblemDetail
/**
 * @description Unauthorized
 */
export type GetVegobjektByTypeIdAndVersjon401 = ProblemDetail
/**
 * @description Forbidden
 */
export type GetVegobjektByTypeIdAndVersjon403 = ProblemDetail
/**
 * @description Not Found
 */
export type GetVegobjektByTypeIdAndVersjon404 = ProblemDetail
/**
 * @description Internal Server Error
 */
export type GetVegobjektByTypeIdAndVersjon500 = ProblemDetail
/**
 * @description OK
 */
export type GetVegobjektByTypeIdAndVersjonQueryResponse = Vegobjekt
export type GetVegobjektByTypeIdAndVersjonQuery = {
  Response: GetVegobjektByTypeIdAndVersjonQueryResponse
  PathParams: GetVegobjektByTypeIdAndVersjonPathParams
  QueryParams: GetVegobjektByTypeIdAndVersjonQueryParams
  Errors:
    | GetVegobjektByTypeIdAndVersjon400
    | GetVegobjektByTypeIdAndVersjon401
    | GetVegobjektByTypeIdAndVersjon403
    | GetVegobjektByTypeIdAndVersjon404
    | GetVegobjektByTypeIdAndVersjon500
}

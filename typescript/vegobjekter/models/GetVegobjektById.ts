import type { InkluderIVegobjekt } from './InkluderIVegobjekt'
import type { SridParameter } from './SridParameter'
import type { InkluderGeometri } from './InkluderGeometri'
import type { InkluderIEgenskaper } from './InkluderIEgenskaper'
import type { Vegobjekt } from './Vegobjekt'
import type { ProblemDetail } from './ProblemDetail'

export type GetVegobjektByIdQueryParams = {
  /**
   * @description ID for vegobjekt som skal hentes.
   * @type integer, int64
   */
  id: number
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
export type GetVegobjektById200 = Vegobjekt
/**
 * @description Bad Request
 */
export type GetVegobjektById400 = ProblemDetail
/**
 * @description Unauthorized
 */
export type GetVegobjektById401 = ProblemDetail
/**
 * @description Forbidden
 */
export type GetVegobjektById403 = ProblemDetail
/**
 * @description Not Found
 */
export type GetVegobjektById404 = ProblemDetail
/**
 * @description Internal Server Error
 */
export type GetVegobjektById500 = ProblemDetail
/**
 * @description OK
 */
export type GetVegobjektByIdQueryResponse = Vegobjekt
export type GetVegobjektByIdQuery = {
  Response: GetVegobjektByIdQueryResponse
  QueryParams: GetVegobjektByIdQueryParams
  Errors:
    | GetVegobjektById400
    | GetVegobjektById401
    | GetVegobjektById403
    | GetVegobjektById404
    | GetVegobjektById500
}

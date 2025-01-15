import type { Egenskapstype } from './Egenskapstype'
import type { Enhet } from './Enhet'
import type { EnumverdiHeltall } from './EnumverdiHeltall'

export type EgenskapstypeHeltallenum = Egenskapstype & {
  /**
   * @type string | undefined, date
   */
  objektliste_dato?: string
  /**
   * @type string | undefined, date
   */
  slutt_dato?: string
  /**
   * @type boolean | undefined
   */
  lengdeavhengig_verdi?: boolean
  /**
   * @type boolean | undefined
   */
  ajourhold_snu?: boolean
  /**
   * @type integer | undefined, int32
   */
  standardverdi?: number
  /**
   * @type integer | undefined, int32
   */
  min_anbefalt?: number
  /**
   * @type integer | undefined, int32
   */
  maks_anbefalt?: number
  /**
   * @type integer | undefined, int32
   */
  min?: number
  /**
   * @type integer | undefined, int32
   */
  maks?: number
  /**
   * @type integer | undefined, int32
   */
  feltlengde?: number
  /**
   * @type boolean | undefined
   */
  fortegnsendring_snu?: boolean
  /**
   * @type object | undefined
   */
  enhet?: Enhet
  /**
   * @type array | undefined
   */
  tillatte_verdier?: EnumverdiHeltall[]
}

import type { Egenskapstype } from './Egenskapstype'
import type { Enhet } from './Enhet'

export type EgenskapstypeFlyttall = Egenskapstype & {
  /**
   * @type string | undefined date
   */
  objektliste_dato?: string
  /**
   * @type string | undefined date
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
   * @type number | undefined double
   */
  standardverdi?: number
  /**
   * @type number | undefined double
   */
  min_anbefalt?: number
  /**
   * @type number | undefined double
   */
  maks_anbefalt?: number
  /**
   * @type number | undefined double
   */
  min?: number
  /**
   * @type number | undefined double
   */
  maks?: number
  /**
   * @type integer | undefined int32
   */
  desimaler?: number
  /**
   * @type integer | undefined int32
   */
  feltlengde?: number
  /**
   * @type boolean | undefined
   */
  fortegnsendring_snu?: boolean
  enhet?: Enhet
}

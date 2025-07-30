import type { Egenskapstype } from './Egenskapstype'

export type EgenskapstypeBoolsk = Egenskapstype & {
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
   * @type boolean | undefined
   */
  standardverdi?: boolean
}

import type { Egenskapstype } from './Egenskapstype'

export type EgenskapstypeDato = Egenskapstype & {
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
   * @type string | undefined, date
   */
  standardverdi?: string
  /**
   * @type string | undefined, date
   */
  min_anbefalt?: string
  /**
   * @type string | undefined, date
   */
  maks_anbefalt?: string
  /**
   * @type string | undefined
   */
  feltmønster?: string
}

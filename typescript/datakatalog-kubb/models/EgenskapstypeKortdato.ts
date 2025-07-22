import type { Egenskapstype } from './Egenskapstype'

export type EgenskapstypeKortdato = Egenskapstype & {
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
   * @type integer | undefined int32
   */
  standardverdi?: number
  /**
   * @type integer | undefined int32
   */
  min_anbefalt?: number
  /**
   * @type integer | undefined int32
   */
  maks_anbefalt?: number
  /**
   * @type string | undefined
   */
  feltmønster?: string
}

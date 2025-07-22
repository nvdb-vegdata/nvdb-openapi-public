import type { Egenskapstype } from './Egenskapstype'
import type { EnumverdiTekst } from './EnumverdiTekst'

export type EgenskapstypeTekstenum = Egenskapstype & {
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
   * @type string | undefined
   */
  standardverdi?: string
  /**
   * @type integer | undefined int32
   */
  feltlengde?: number
  /**
   * @type string | undefined
   */
  feltmønster?: string
  /**
   * @type array | undefined
   */
  tillatte_verdier?: EnumverdiTekst[]
}

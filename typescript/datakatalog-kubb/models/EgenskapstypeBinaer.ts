import type { Egenskapstype } from './Egenskapstype'

export type EgenskapstypeBinaerMediatype =
  | 'Audio'
  | 'Bilde'
  | 'Tekst'
  | 'TSF'
  | 'Video'
  | 'Udefinert'
export type EgenskapstypeBinaer = Egenskapstype & {
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
   * @type string | undefined
   */
  mediatype?: EgenskapstypeBinaerMediatype
}

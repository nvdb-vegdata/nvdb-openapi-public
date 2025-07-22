import type { Egenskapstype } from './Egenskapstype'

export type Stedfestingstype = 'Punkt' | 'Linje' | 'Sving'
export type Geometritype2 = 'PUNKT' | 'LINJE' | 'SVING'
export type KjørefeltRelevant = 'KAN' | 'NEI' | 'M\u00C5'
export type SideposisjonRelevant = 'KAN' | 'NEI' | 'M\u00C5'
export type VegnettsajourholdSplitt =
  | 'IKKE_TATT_STILLING'
  | 'KAN_IKKE_SPLITTES'
  | 'KAN_SPLITTES'
export type EgenskapstypeStedfesting = Egenskapstype & {
  /**
   * @type string | undefined
   */
  stedfestingstype?: Stedfestingstype
  /**
   * @type string | undefined
   */
  geometritype?: Geometritype2
  /**
   * @type boolean | undefined
   */
  overlapp_ok?: boolean
  /**
   * @type string | undefined
   */
  kjørefelt_relevant?: KjørefeltRelevant
  /**
   * @type string | undefined
   */
  sideposisjon_relevant?: SideposisjonRelevant
  /**
   * @type boolean | undefined
   */
  innenfor_mor?: boolean
  /**
   * @type string | undefined
   */
  vegnettsajourhold_splitt?: VegnettsajourholdSplitt
  /**
   * @type string | undefined
   */
  overlappsautomatikk?: string
  /**
   * @type boolean | undefined
   */
  retning_relevant?: boolean
}

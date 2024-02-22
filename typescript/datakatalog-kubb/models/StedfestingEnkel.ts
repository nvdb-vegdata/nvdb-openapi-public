import type { Stedfesting } from './Stedfesting'

export type Stedfestingstype2 = 'Punkt' | 'Linje' | 'Sving'
export type Geometritype3 = 'PUNKT' | 'LINJE' | 'SVING'
export type KjørefeltRelevant2 = 'KAN' | 'NEI' | 'M\u00C5'
export type SideposisjonRelevant2 = 'KAN' | 'NEI' | 'M\u00C5'
export type VegnettsajourholdSplitt2 =
  | 'IKKE_TATT_STILLING'
  | 'KAN_IKKE_SPLITTES'
  | 'KAN_SPLITTES'
export type StedfestingEnkel = Stedfesting & {
  /**
   * @type string | undefined
   */
  stedfestingstype?: Stedfestingstype2
  /**
   * @type string | undefined
   */
  geometritype?: Geometritype3
  /**
   * @type boolean | undefined
   */
  overlapp_ok?: boolean
  /**
   * @type string | undefined
   */
  kjørefelt_relevant?: KjørefeltRelevant2
  /**
   * @type string | undefined
   */
  sideposisjon_relevant?: SideposisjonRelevant2
  /**
   * @type boolean | undefined
   */
  innenfor_mor?: boolean
  /**
   * @type string | undefined
   */
  vegnettsajourhold_splitt?: VegnettsajourholdSplitt2
  /**
   * @type string | undefined
   */
  overlappsautomatikk?: string
  /**
   * @type boolean | undefined
   */
  retning_relevant?: boolean
}

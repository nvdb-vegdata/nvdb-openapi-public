import type { Stedfesting } from './Stedfesting'

export type StedfestingEnkelStedfestingstype = 'Punkt' | 'Linje' | 'Sving'
export type StedfestingEnkelGeometritype = 'PUNKT' | 'LINJE' | 'SVING'
export type StedfestingEnkelKjørefeltRelevant = 'KAN' | 'NEI' | 'M\u00C5'
export type StedfestingEnkelSideposisjonRelevant = 'KAN' | 'NEI' | 'M\u00C5'
export type StedfestingEnkelVegnettsajourholdSplitt =
  | 'IKKE_TATT_STILLING'
  | 'KAN_IKKE_SPLITTES'
  | 'KAN_SPLITTES'
export type StedfestingEnkel = Stedfesting & {
  /**
   * @type string | undefined
   */
  stedfestingstype?: StedfestingEnkelStedfestingstype
  /**
   * @type string | undefined
   */
  geometritype?: StedfestingEnkelGeometritype
  /**
   * @type boolean | undefined
   */
  overlapp_ok?: boolean
  /**
   * @type string | undefined
   */
  kjørefelt_relevant?: StedfestingEnkelKjørefeltRelevant
  /**
   * @type string | undefined
   */
  sideposisjon_relevant?: StedfestingEnkelSideposisjonRelevant
  /**
   * @type boolean | undefined
   */
  innenfor_mor?: boolean
  /**
   * @type string | undefined
   */
  vegnettsajourhold_splitt?: StedfestingEnkelVegnettsajourholdSplitt
  /**
   * @type string | undefined
   */
  overlappsautomatikk?: string
  /**
   * @type boolean | undefined
   */
  retning_relevant?: boolean
}

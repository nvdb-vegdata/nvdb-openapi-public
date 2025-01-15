import type { Egenskapstype } from './Egenskapstype'

export type EgenskapstypeStedfestingStedfestingstype =
  | 'Punkt'
  | 'Linje'
  | 'Sving'
export type EgenskapstypeStedfestingGeometritype = 'PUNKT' | 'LINJE' | 'SVING'
export type EgenskapstypeStedfestingKjørefeltRelevant =
  | 'KAN'
  | 'NEI'
  | 'M\u00C5'
export type EgenskapstypeStedfestingSideposisjonRelevant =
  | 'KAN'
  | 'NEI'
  | 'M\u00C5'
export type EgenskapstypeStedfestingVegnettsajourholdSplitt =
  | 'IKKE_TATT_STILLING'
  | 'KAN_IKKE_SPLITTES'
  | 'KAN_SPLITTES'
export type EgenskapstypeStedfesting = Egenskapstype & {
  /**
   * @type string | undefined
   */
  stedfestingstype?: EgenskapstypeStedfestingStedfestingstype
  /**
   * @type string | undefined
   */
  geometritype?: EgenskapstypeStedfestingGeometritype
  /**
   * @type boolean | undefined
   */
  overlapp_ok?: boolean
  /**
   * @type string | undefined
   */
  kjørefelt_relevant?: EgenskapstypeStedfestingKjørefeltRelevant
  /**
   * @type string | undefined
   */
  sideposisjon_relevant?: EgenskapstypeStedfestingSideposisjonRelevant
  /**
   * @type boolean | undefined
   */
  innenfor_mor?: boolean
  /**
   * @type string | undefined
   */
  vegnettsajourhold_splitt?: EgenskapstypeStedfestingVegnettsajourholdSplitt
  /**
   * @type string | undefined
   */
  overlappsautomatikk?: string
  /**
   * @type boolean | undefined
   */
  retning_relevant?: boolean
}

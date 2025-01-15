import type { Egenskap } from './Egenskap'
import type { Stedfesting } from './Stedfesting'

export type StedfestingEgenskapStedfestingstype = 'Punkt' | 'Linje' | 'Sving'
export type StedfestingEgenskapRetning = 'MED' | 'MOT'
export type StedfestingEgenskapSideposisjon =
  | 'MH'
  | 'MV'
  | 'VT'
  | 'M'
  | 'H'
  | 'HT'
  | 'VH'
  | 'HV'
  | 'K'
  | 'V'
  | 'L'
  | 'R'
  | 'R0'
export type StedfestingEgenskap = Egenskap & {
  /**
   * @type integer | undefined, int64
   */
  veglenkesekvensid?: number
  /**
   * @type integer | undefined, int64
   */
  nodeid?: number
  /**
   * @type string | undefined
   */
  stedfestingstype?: StedfestingEgenskapStedfestingstype
  /**
   * @type string | undefined
   */
  retning?: StedfestingEgenskapRetning
  /**
   * @type string | undefined
   */
  sideposisjon?: StedfestingEgenskapSideposisjon
  /**
   * @type array | undefined
   */
  kjørefelt?: string[]
  /**
   * @type number | undefined, double
   */
  relativPosisjon?: number
  /**
   * @type number | undefined, double
   */
  startposisjon?: number
  /**
   * @type number | undefined, double
   */
  sluttposisjon?: number
  /**
   * @type object | undefined
   */
  startpunkt?: Stedfesting
  /**
   * @type object | undefined
   */
  sluttpunkt?: Stedfesting
}

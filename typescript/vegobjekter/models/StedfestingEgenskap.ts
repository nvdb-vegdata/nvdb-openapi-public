import type { Egenskap } from './Egenskap'

export type Stedfestingstype = 'Punkt' | 'Linje' | 'Sving'
export type Retning = 'MED' | 'MOT'
export type Sideposisjon =
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
   * @type integer | undefined int64
   */
  veglenkesekvensid?: number
  /**
   * @type integer | undefined int64
   */
  nodeid?: number
  /**
   * @type string | undefined
   */
  stedfestingstype?: Stedfestingstype
  /**
   * @type string | undefined
   */
  retning?: Retning
  /**
   * @type string | undefined
   */
  sideposisjon?: Sideposisjon
  /**
   * @type array | undefined
   */
  kjørefelt?: string[]
  /**
   * @type number | undefined double
   */
  relativPosisjon?: number
  /**
   * @type number | undefined double
   */
  startposisjon?: number
  /**
   * @type number | undefined double
   */
  sluttposisjon?: number
}

export type StedfestingType = 'Punkt' | 'Linje' | 'Sving'
export type StedfestingRetning = 'MED' | 'MOT'
export type StedfestingSideposisjon =
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
export type Stedfesting = {
  /**
   * @type string
   */
  type: StedfestingType
  /**
   * @type integer | undefined, int64
   */
  veglenkesekvensid?: number
  /**
   * @type integer | undefined, int64
   */
  nodeid?: number
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
  /**
   * @type string | undefined
   */
  retning?: StedfestingRetning
  /**
   * @type array | undefined
   */
  kjørefelt?: string[]
  /**
   * @type string | undefined
   */
  sideposisjon?: StedfestingSideposisjon
  /**
   * @type string | undefined
   */
  kortform?: string
}

export type MetrertLokasjonRetning = 'MED' | 'MOT'
export type MetrertLokasjonSideposisjon =
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
export type MetrertLokasjon = {
  /**
   * @type string | undefined
   */
  retning?: MetrertLokasjonRetning
  /**
   * @type string | undefined
   */
  sideposisjon?: MetrertLokasjonSideposisjon
  /**
   * @type array | undefined
   */
  kjørefelt?: string[]
}

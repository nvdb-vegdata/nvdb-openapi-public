export type StrekningAdskilteLøp = 'Med' | 'Mot' | 'Nei'
export type StrekningTrafikantgruppe = 'K' | 'G'
export type StrekningRetning = 'MED' | 'MOT'
export type Strekning = {
  /**
   * @type integer, int32
   */
  strekning: number
  /**
   * @type integer, int32
   */
  delstrekning: number
  /**
   * @type boolean
   */
  arm: boolean
  /**
   * @type string
   */
  adskilte_løp: StrekningAdskilteLøp
  /**
   * @type string
   */
  trafikantgruppe: StrekningTrafikantgruppe
  /**
   * @type string
   */
  retning: StrekningRetning
  /**
   * @type number | undefined, double
   */
  meter?: number
  /**
   * @type number | undefined, double
   */
  fra_meter?: number
  /**
   * @type number | undefined, double
   */
  til_meter?: number
  /**
   * @type string | undefined
   */
  adskilte_løp_nummer?: string
}

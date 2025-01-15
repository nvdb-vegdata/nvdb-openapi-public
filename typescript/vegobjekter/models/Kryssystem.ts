export type KryssystemRetning = 'MED' | 'MOT'
export type KryssystemTrafikantgruppe = 'K' | 'G'
export type Kryssystem = {
  /**
   * @type integer, int32
   */
  kryssystem: number
  /**
   * @type integer, int32
   */
  kryssdel: number
  /**
   * @type string
   */
  retning: KryssystemRetning
  /**
   * @type string
   */
  trafikantgruppe: KryssystemTrafikantgruppe
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
}

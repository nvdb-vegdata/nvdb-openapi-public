export type SideanleggRetning = 'MED' | 'MOT'
export type SideanleggTrafikantgruppe = 'K' | 'G'
export type Sideanlegg = {
  /**
   * @type integer int64
   */
  id: number
  /**
   * @type integer int32
   */
  versjon: number
  /**
   * @type integer int32
   */
  sideanlegg: number
  /**
   * @type integer int32
   */
  sideanleggsdel: number
  /**
   * @type string
   */
  retning: SideanleggRetning
  /**
   * @type string
   */
  trafikantgruppe: SideanleggTrafikantgruppe
  /**
   * @type number | undefined double
   */
  meter?: number
  /**
   * @type number | undefined double
   */
  fra_meter?: number
  /**
   * @type number | undefined double
   */
  til_meter?: number
}

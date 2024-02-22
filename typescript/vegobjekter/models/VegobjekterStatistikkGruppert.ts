export type VegobjekterStatistikkGruppertVegkategori =
  | 'E'
  | 'F'
  | 'K'
  | 'P'
  | 'R'
  | 'S'
export type VegobjekterStatistikkGruppert = {
  /**
   * @type integer | undefined int32
   */
  antall?: number
  /**
   * @type number | undefined double
   */
  lengde?: number
  /**
   * @type integer | undefined int32
   */
  fylke?: number
  /**
   * @type integer | undefined int32
   */
  kommune?: number
  /**
   * @type string | undefined
   */
  vegkategori?: VegobjekterStatistikkGruppertVegkategori
}

export type VegobjekterStatistikk = {
  /**
   * @description Antallet objekter. Utelatt dersom inkluder=lengde
   * @type integer | undefined int32
   */
  antall?: number
  /**
   * @description Den summerte lengden av objektene. Utelatt dersom inkluder=antall
   * @type number | undefined double
   */
  lengde?: number
}

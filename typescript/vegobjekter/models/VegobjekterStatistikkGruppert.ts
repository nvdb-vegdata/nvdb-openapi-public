import type { Vegkategori } from './Vegkategori'

export type VegobjekterStatistikkGruppert = {
  /**
   * @description Antallet objekter i gruppen. Utelatt dersom inkluder=lengde
   * @type integer | undefined, int32
   */
  antall?: number
  /**
   * @description Den summerte lengden av objektene i gruppen. Utelatt dersom inkluder=antall
   * @type number | undefined, double
   */
  lengde?: number
  /**
   * @description Hvilket fylke gruppen tilhører. Utelatt hvis ikke gruppert på fylke
   * @type integer | undefined, int32
   */
  fylke?: number
  /**
   * @description Hvilken kommune gruppen tilhører. Utelatt hvis ikke gruppert på kommune
   * @type integer | undefined, int32
   */
  kommune?: number
  /**
   * @type string | undefined
   */
  vegkategori?: Vegkategori
}

import type { NesteSide } from './NesteSide'

export type SideMetadata = {
  /**
   * @description Totalt antall treff. Kun tilstede dersom inkluderAntall=true
   * @type integer | undefined, int32
   */
  antall?: number
  /**
   * @description Antallet objekter som ble returnert i denne responsen
   * @type integer, int32
   */
  returnert: number
  /**
   * @description Maks antall objekter som blir returnert per side
   * @type integer, int32
   */
  sidestørrelse: number
  /**
   * @type object | undefined
   */
  neste?: NesteSide
}

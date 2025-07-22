import type { NesteSide } from './NesteSide'

export type SideMetadata = {
  /**
   * @description Totalt antall treff. Kun tilstede dersom inkluderAntall=true
   * @type integer | undefined int32
   */
  antall?: number
  /**
   * @description Antallet objekter som ble returnert i denne responsen
   * @type integer int32
   */
  returnert: number
  /**
   * @description Maks antall objekter som blir returnert per side
   * @type integer int32
   */
  sidestørrelse: number
  /**
   * @description Informasjon om neste side, utelatt dersom man spør på et endepunkt som gjelder et spesifikt vegobjekt. Når resultatsettet er tomt vil neste side være tom og samme start token vil returneres for påfølgende side.
   */
  neste?: NesteSide
}

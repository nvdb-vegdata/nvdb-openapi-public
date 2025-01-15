import type { NesteSide } from './NesteSide'

export type SideMetadata = {
  /**
   * @type integer | undefined, int32
   */
  antall?: number
  /**
   * @type integer, int32
   */
  returnert: number
  /**
   * @type integer, int32
   */
  sidestørrelse: number
  /**
   * @type object | undefined
   */
  neste?: NesteSide
}

import type { Srid } from './Srid'

export type Geometri = {
  /**
   * @type string
   */
  wkt: string
  /**
   * @type string
   */
  srid: Srid
  /**
   * @description Indikerer at geometrien er forenklet. Kun inkludert om den er true
   * @default "false"
   * @type boolean | undefined
   */
  forenklet?: boolean
  /**
   * @description Angir om geometrien er vegobjektets egengeometri, eller om geometrien er utledet fra vegnettes geometri
   * @type boolean | undefined
   */
  egengeometri?: boolean
}

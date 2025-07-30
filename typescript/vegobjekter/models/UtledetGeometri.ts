import type { Srid } from './Srid'

export type UtledetGeometri = {
  /**
   * @type string
   */
  wkt: string
  /**
   * @type string
   */
  srid: Srid
  /**
   * @description Angir om geometrien er vegobjektets egengeometri, eller om geometrien er utledet fra vegnettes geometri
   * @type boolean
   */
  egengeometri: boolean
  /**
   * @description Indikerer at geometrien er forenklet. Kun inkludert om den er true
   * @type boolean | undefined
   */
  forenklet?: boolean
  /**
   * @description Utelatt hvis geometrien ikke er en linje
   * @type number | undefined, double
   */
  lengde?: number
  /**
   * @description Utelatt hvis geometrien ikke er et polygon
   * @type number | undefined, double
   */
  areal?: number
}

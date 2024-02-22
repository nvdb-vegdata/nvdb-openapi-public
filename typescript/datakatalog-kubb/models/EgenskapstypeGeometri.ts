import type { Egenskapstype } from './Egenskapstype'

export type Geometritype =
  | 'PUNKT'
  | 'POLYGON'
  | 'LINJE'
  | 'FLERELINJE'
  | 'FLEREPUNKT'
  | 'FLEREPOLYGON'
  | 'KOMPLEKS'
  | 'UKJENT'
export type EgenskapstypeGeometri = Egenskapstype & {
  /**
   * @type integer | undefined int32
   */
  dimensjoner?: number
  /**
   * @type string | undefined
   */
  geometritype?: Geometritype
  /**
   * @type boolean | undefined
   */
  innenfor_mor?: boolean
}

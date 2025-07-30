import type { Egenskapstype } from './Egenskapstype'

export type EgenskapstypeGeometriGeometritype =
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
   * @type integer | undefined, int32
   */
  dimensjoner?: number
  /**
   * @type string | undefined
   */
  geometritype?: EgenskapstypeGeometriGeometritype
  /**
   * @type boolean | undefined
   */
  innenfor_mor?: boolean
}

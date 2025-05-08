export type UtledetGeometriSrid = '5972' | '5973' | '5975' | '4326'
export type UtledetGeometri = {
  /**
   * @type string
   */
  wkt: string
  /**
   * @type string
   */
  srid: UtledetGeometriSrid
  /**
   * @type boolean
   */
  egengeometri: boolean
  /**
   * @type boolean | undefined
   */
  forenklet?: boolean
  /**
   * @type number | undefined, double
   */
  lengde?: number
  /**
   * @type number | undefined, double
   */
  areal?: number
}

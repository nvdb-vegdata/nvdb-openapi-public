export type UtledetGeometriSrid = '5972' | '5973' | '5974' | '5975' | '4326'
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
}

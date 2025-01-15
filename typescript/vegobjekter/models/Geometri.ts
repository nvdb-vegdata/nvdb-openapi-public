export type GeometriSrid = '5972' | '5973' | '5975' | '4326'
export type Geometri = {
  /**
   * @type string
   */
  wkt: string
  /**
   * @type string
   */
  srid: GeometriSrid
  /**
   * @type boolean | undefined
   */
  forenklet?: boolean
  /**
   * @type boolean | undefined
   */
  egengeometri?: boolean
}

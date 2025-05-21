export type VegobjektEndret = {
  /**
   * @type integer, int64
   */
  id: number
  /**
   * @type integer, int32
   */
  versjon: number
  /**
   * @type integer, int32
   */
  type: number
  /**
   * @type string, date-time
   */
  tidspunkt: string
  /**
   * @type string, date
   */
  startdato: string
  /**
   * @type string | undefined, date
   */
  sluttdato?: string
  /**
   * @type boolean
   */
  egenskaperEndret: boolean
  /**
   * @type boolean
   */
  barnEndret: boolean
  /**
   * @type boolean
   */
  stedfestingEndret: boolean
  /**
   * @type boolean
   */
  gyldighetsperiodeEndret: boolean
}

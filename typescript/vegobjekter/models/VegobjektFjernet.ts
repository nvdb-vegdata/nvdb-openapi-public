export type VegobjektFjernet = {
  /**
   * @type integer, int64
   */
  id: number
  /**
   * @description Versjon av vegobjektet som er fjernet
   * @type integer, int32
   */
  versjon: number
  /**
   * @type integer, int32
   */
  type: number
  /**
   * @description Tidspunktet da endringen ble gjort tilgjengelig i Les API V4
   * @type string, date-time
   */
  tidspunkt: string
}

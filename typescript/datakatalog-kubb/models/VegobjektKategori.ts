export type VegobjektKategori = {
  /**
   * @type integer, int32
   */
  id: number
  /**
   * @type boolean
   */
  primærkategori: boolean
  /**
   * @type integer, int32
   */
  nummer: number
  /**
   * @type string | undefined
   */
  navn?: string
  /**
   * @type string | undefined
   */
  kortnavn?: string
  /**
   * @type integer, int32
   */
  sorteringsnummer: number
  /**
   * @type string | undefined
   */
  beskrivelse?: string
  /**
   * @type string | undefined, date
   */
  startDato?: string
}

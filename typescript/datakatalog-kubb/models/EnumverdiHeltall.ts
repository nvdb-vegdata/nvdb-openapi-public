export type EnumverdiHeltall = {
  /**
   * @type integer, int32
   */
  id: number
  /**
   * @type string | undefined
   */
  kortnavn?: string
  /**
   * @type integer | undefined, int32
   */
  kortnavnlengde?: number
  /**
   * @type boolean
   */
  kortnavn_brukbar: boolean
  /**
   * @type string | undefined
   */
  beskrivelse?: string
  /**
   * @type integer, int32
   */
  sorteringsnummer: number
  /**
   * @type string | undefined, date
   */
  objektliste_dato?: string
  /**
   * @type string | undefined, date
   */
  sluttdato?: string
  /**
   * @type boolean
   */
  standardverdi: boolean
  /**
   * @type integer | undefined, int32
   */
  komplementær_enumverdi?: number
  /**
   * @type integer | undefined, int32
   */
  verdi?: number
  /**
   * @type string
   */
  type: string
}

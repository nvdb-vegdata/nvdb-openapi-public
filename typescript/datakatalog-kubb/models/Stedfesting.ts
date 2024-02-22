export type StedfestingEgenskapstype =
  | 'Assosiasjon'
  | 'Boolsk'
  | 'Bin\u00E6r'
  | 'Tekst'
  | 'Dato'
  | 'Flyttall'
  | 'Heltall'
  | 'Struktur'
  | 'Geometri'
  | 'Stedfesting'
  | 'Kortdato'
  | 'Tid'
  | 'Liste'
  | 'Tekstenum'
  | 'Heltallenum'
  | 'Flyttallenum'
export type StedfestingViktighet =
  | 'IKKE_SATT'
  | 'P\u00C5KREVD_ABSOLUTT'
  | 'P\u00C5KREVD_IKKE_ABSOLUTT'
  | 'BETINGET'
  | 'OPSJONELL'
  | 'MINDRE_VIKTIG'
  | 'HISTORISK'
export type Stedfesting = {
  /**
   * @type integer int32
   */
  id: number
  /**
   * @type string | undefined
   */
  navn?: string
  /**
   * @type string
   */
  egenskapstype: StedfestingEgenskapstype
  /**
   * @type string | undefined
   */
  kortnavn?: string
  /**
   * @type string | undefined
   */
  beskrivelse?: string
  /**
   * @type string | undefined
   */
  sosinavn?: string
  /**
   * @type string | undefined
   */
  sosinvdbnavn?: string
  /**
   * @type integer int32
   */
  sorteringsnummer: number
  /**
   * @type boolean
   */
  avledet: boolean
  /**
   * @type integer | undefined int32
   */
  komplementær_egenskapstype?: number
  /**
   * @type boolean
   */
  obligatorisk_verdi: boolean
  /**
   * @type boolean
   */
  skrivebeskyttet: boolean
  /**
   * @type integer int32
   */
  sensitivitet: number
  /**
   * @type integer | undefined int32
   */
  gruppesorteringsnummer?: number
  /**
   * @type string | undefined
   */
  veiledning?: string
  /**
   * @type string | undefined
   */
  grunnrissreferanse?: string
  /**
   * @type string | undefined
   */
  høydereferanse?: string
  /**
   * @type integer int32
   */
  høydereferanse_tall: number
  /**
   * @type number double
   */
  nøyaktighetskrav_grunnriss: number
  /**
   * @type number double
   */
  nøyaktighetskrav_høyde: number
  /**
   * @type string | undefined
   */
  sosi_referanse?: string
  /**
   * @type boolean
   */
  referansegeometri_tilstrekkelig: boolean
  /**
   * @type string
   */
  viktighet: StedfestingViktighet
  /**
   * @type integer int32
   */
  kategori: number
}

import type { EgenskapstypeEnum } from './EgenskapstypeEnum'
import type { Viktighet } from './Viktighet'

export type Egenskapstype = {
  /**
   * @type integer, int32
   */
  id: number
  /**
   * @type string | undefined
   */
  navn?: string
  /**
   * @type string
   */
  egenskapstype: EgenskapstypeEnum
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
  veiledning?: string
  /**
   * @type string | undefined
   */
  sosinavn?: string
  /**
   * @type string | undefined
   */
  sosinvdbnavn?: string
  /**
   * @type integer, int32
   */
  sorteringsnummer: number
  /**
   * @type boolean
   */
  avledet: boolean
  /**
   * @type integer | undefined, int32
   */
  komplementær_egenskapstype?: number
  /**
   * @type boolean
   */
  skrivebeskyttet: boolean
  /**
   * @type boolean
   */
  obligatorisk_verdi: boolean
  /**
   * @type integer, int32
   */
  sensitivitet: number
  /**
   * @type integer | undefined, int32
   */
  gruppesorteringsnummer?: number
  /**
   * @type string | undefined
   */
  grunnrissreferanse?: string
  /**
   * @type string | undefined
   */
  høydereferanse?: string
  /**
   * @type integer, int32
   */
  høydereferanse_tall: number
  /**
   * @type number, double
   */
  nøyaktighetskrav_grunnriss: number
  /**
   * @type number, double
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
  viktighet: Viktighet
  /**
   * @type integer, int32
   */
  kategori: number
  /**
   * @type array | undefined
   */
  tilleggskrav?: string[]
}

import type { Stedfesting } from './Stedfesting'
import type { VegobjektKategori } from './VegobjektKategori'
import type { Egenskapstype } from './Egenskapstype'
import type { Relasjonstyper } from './Relasjonstyper'

export type Vegobjekttype = {
  /**
   * @type integer, int32
   */
  id: number
  /**
   * @type string | undefined
   */
  navn?: string
  /**
   * @type string | undefined
   */
  kortnavn?: string
  /**
   * @type string | undefined
   */
  beskrivelse?: string
  /**
   * @type string | undefined, date
   */
  objektliste_dato?: string
  /**
   * @type string | undefined
   */
  veiledning?: string
  /**
   * @type object | undefined
   */
  stedfesting?: Stedfesting
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
   * @type string | undefined
   */
  status?: string
  /**
   * @type string | undefined
   */
  hovedkategori?: string
  /**
   * @type boolean
   */
  tidsrom_relevant: boolean
  /**
   * @type boolean | undefined
   */
  konnekteringslenke_ok?: boolean
  /**
   * @type boolean
   */
  abstrakt_type: boolean
  /**
   * @type boolean
   */
  avledet: boolean
  /**
   * @type boolean
   */
  må_ha_mor: boolean
  /**
   * @type boolean
   */
  er_dataserie: boolean
  /**
   * @type boolean
   */
  en_versjon: boolean
  /**
   * @type string | undefined
   */
  tilleggsinformasjon?: string
  /**
   * @type array
   */
  kategorier: VegobjektKategori[]
  /**
   * @type array | undefined
   */
  egenskapstyper?: Egenskapstype[]
  /**
   * @type object | undefined
   */
  relasjonstyper?: Relasjonstyper
  /**
   * @type boolean
   */
  sensitiv: boolean
}

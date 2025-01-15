import type { AssosiasjonstypeListeInnhold } from './AssosiasjonstypeListeInnhold'
import type { AssosiasjonstypeVegobjekttype } from './AssosiasjonstypeVegobjekttype'

export type Assosiasjonstype = {
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
  egenskapstype: string
  /**
   * @type integer | undefined, int32
   */
  maksimalt_antall_verdier?: number
  /**
   * @type integer | undefined, int32
   */
  minimalt_antall_verdier?: number
  /**
   * @type object | undefined
   */
  innhold?: AssosiasjonstypeListeInnhold
  /**
   * @type object | undefined
   */
  type?: AssosiasjonstypeVegobjekttype
}

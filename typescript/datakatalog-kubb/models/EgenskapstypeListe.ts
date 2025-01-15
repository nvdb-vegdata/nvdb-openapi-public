import type { Egenskapstype } from './Egenskapstype'

export type EgenskapstypeListe = Egenskapstype & {
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
  innhold?: Egenskapstype
}

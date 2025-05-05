import type { Stedfesting } from './Stedfesting'
import type { EgenskapstypeStedfesting } from './EgenskapstypeStedfesting'

export type StedfestingListe = Stedfesting & {
  /**
   * @type integer | undefined, int32
   */
  maksimalt_antall_verdier?: number
  /**
   * @type integer | undefined, int32
   */
  minimalt_antall_verdier?: number
  innhold?: EgenskapstypeStedfesting
}

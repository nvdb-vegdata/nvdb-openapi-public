import type { Egenskap } from './Egenskap'
import type { Enhet } from './Enhet'

export type FlyttallEgenskap = Egenskap & {
  /**
   * @type number | undefined double
   */
  verdi?: number
  enhet?: Enhet
}

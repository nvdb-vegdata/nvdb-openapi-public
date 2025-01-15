import type { Egenskap } from './Egenskap'
import type { Enhet } from './Enhet'

export type FlyttallEgenskap = Egenskap & {
  /**
   * @type number | undefined, double
   */
  verdi?: number
  /**
   * @type object | undefined
   */
  enhet?: Enhet
}

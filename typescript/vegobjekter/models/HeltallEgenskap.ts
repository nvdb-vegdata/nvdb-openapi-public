import type { Egenskap } from './Egenskap'
import type { Enhet } from './Enhet'

export type HeltallEgenskap = Egenskap & {
  /**
   * @type integer | undefined, int32
   */
  verdi?: number
  /**
   * @type object | undefined
   */
  enhet?: Enhet
}

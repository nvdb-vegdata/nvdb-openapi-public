import type { Egenskap } from './Egenskap'
import type { Enhet } from './Enhet'

export type FlyttallEnumEgenskap = Egenskap & {
  /**
   * @type number | undefined, double
   */
  verdi?: number
  /**
   * @type integer | undefined, int32
   */
  enum_id?: number
  /**
   * @type object | undefined
   */
  enhet?: Enhet
}

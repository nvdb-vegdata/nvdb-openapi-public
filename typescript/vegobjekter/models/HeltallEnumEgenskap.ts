import type { Egenskap } from './Egenskap'
import type { Enhet } from './Enhet'

export type HeltallEnumEgenskap = Egenskap & {
  /**
   * @type integer | undefined int32
   */
  verdi?: number
  /**
   * @type integer | undefined int32
   */
  enum_id?: number
  enhet?: Enhet
}

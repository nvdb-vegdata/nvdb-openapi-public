import type { Egenskap } from './Egenskap'

export type TekstEnumEgenskap = Egenskap & {
  /**
   * @type string | undefined
   */
  verdi?: string
  /**
   * @type integer | undefined, int32
   */
  enum_id?: number
}

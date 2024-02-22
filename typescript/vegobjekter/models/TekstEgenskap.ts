import type { Egenskap } from './Egenskap'

export type TekstEgenskap = Egenskap & {
  /**
   * @type string | undefined
   */
  verdi?: string
}

import type { Egenskap } from './Egenskap'

export type DatoEgenskap = Egenskap & {
  /**
   * @type string | undefined date
   */
  verdi?: string
}

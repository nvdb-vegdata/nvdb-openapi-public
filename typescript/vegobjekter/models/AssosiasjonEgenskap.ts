import type { Egenskap } from './Egenskap'

export type AssosiasjonEgenskap = Egenskap & {
  /**
   * @type integer | undefined int64
   */
  verdi?: number
}

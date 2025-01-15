import type { Egenskap } from './Egenskap'

export type KortDatoEgenskap = Egenskap & {
  /**
   * @description Måned og dato på formatet MM-DD
   * @type string | undefined
   */
  verdi?: string
}

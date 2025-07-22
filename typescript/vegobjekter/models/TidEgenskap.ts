import type { Egenskap } from './Egenskap'

export type TidEgenskap = Egenskap & {
  /**
   * @description Klokkeslett på formatet HH:mm
   * @type string | undefined
   * @example 12:34
   */
  verdi?: string
}

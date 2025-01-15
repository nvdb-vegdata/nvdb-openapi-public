import type { Egenskap } from './Egenskap'

export type TidEgenskap = Egenskap & {
  /**
   * @description Klokkeslett på formatet HH:mm
   * @type string | undefined
   */
  verdi?: string
}

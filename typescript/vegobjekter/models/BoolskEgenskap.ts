import type { Egenskap } from './Egenskap'

export type BoolskEgenskap = Egenskap & {
  /**
   * @type boolean | undefined
   */
  verdi?: boolean
}

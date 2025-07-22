import type { Egenskap } from './Egenskap'

export type StrukturEgenskap = Egenskap & {
  /**
   * @type array | undefined
   */
  innhold?: Egenskap[]
}

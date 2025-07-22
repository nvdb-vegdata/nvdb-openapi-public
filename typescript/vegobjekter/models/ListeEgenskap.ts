import type { Egenskap } from './Egenskap'

export type ListeEgenskap = Egenskap & {
  /**
   * @type array | undefined
   */
  innhold?: Egenskap[]
}

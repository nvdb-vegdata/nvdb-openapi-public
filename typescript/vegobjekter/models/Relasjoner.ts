import type { Relasjon } from './Relasjon'

export type Relasjoner = {
  /**
   * @type array | undefined
   */
  foreldre?: Relasjon[]
  /**
   * @type array | undefined
   */
  barn?: Relasjon[]
}

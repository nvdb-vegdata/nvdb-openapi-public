import type { RelasjonMedIder } from './RelasjonMedIder'
import type { Relasjon } from './Relasjon'

export type Relasjoner = {
  /**
   * @type array | undefined
   */
  foreldre?: RelasjonMedIder[]
  /**
   * @type array | undefined
   */
  barn?: Relasjon[]
}

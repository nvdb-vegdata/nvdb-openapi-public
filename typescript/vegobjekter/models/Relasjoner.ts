import type { RelasjonMedIder } from './RelasjonMedIder'
import type { Relasjon } from './Relasjon'

export type Relasjoner = {
  /**
   * @description Utelatt dersom vegobjektet ikke har noen foreldre
   * @type array | undefined
   */
  foreldre?: RelasjonMedIder[]
  /**
   * @description Utelatt dersom vegobjektet ikke har noen barn
   * @type array | undefined
   */
  barn?: Relasjon[]
}

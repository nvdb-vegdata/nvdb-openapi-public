import type { Relasjon } from './Relasjon'
import type { Vegobjekt } from './Vegobjekt'

export type RelasjonMedVegobjekter = Relasjon & {
  /**
   * @type array | undefined
   */
  vegobjekter?: any[]
} & {
  /**
   * @type array | undefined
   */
  vegobjekter?: Vegobjekt[]
}

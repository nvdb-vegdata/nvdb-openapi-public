import type { Relasjon } from './Relasjon'

export type RelasjonMedIder = Relasjon & {
  /**
   * @type array | undefined
   */
  vegobjekter?: number[]
}

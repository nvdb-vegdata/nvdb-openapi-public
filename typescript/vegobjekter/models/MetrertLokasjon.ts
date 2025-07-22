import type { Retning } from './Retning'
import type { Sideposisjon } from './Sideposisjon'

export type MetrertLokasjon = {
  retning?: Retning
  sideposisjon?: Sideposisjon
  /**
   * @type array | undefined
   */
  kjørefelt?: string[]
}

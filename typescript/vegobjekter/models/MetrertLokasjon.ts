import type { Retning } from './Retning'
import type { Sideposisjon } from './Sideposisjon'

export type MetrertLokasjon = {
  /**
   * @type string | undefined
   */
  retning?: Retning
  /**
   * @type string | undefined
   */
  sideposisjon?: Sideposisjon
  /**
   * @type array | undefined
   */
  kjørefelt?: string[]
}

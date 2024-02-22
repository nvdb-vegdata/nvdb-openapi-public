import type { VegobjektType } from './VegobjektType'
import type { VegobjektEllerIdListe } from './VegobjektEllerIdListe'

export type Relasjon = {
  /**
   * @type integer int32
   */
  listeid: number
  /**
   * @type integer int32
   */
  id: number
  type: VegobjektType
  vegobjekter: VegobjektEllerIdListe
}

import type { VegobjektType } from './VegobjektType'
import type { Relasjonstype } from './Relasjonstype'

export type Relasjon = {
  /**
   * @type integer, int32
   */
  id: number
  /**
   * @type object
   */
  type: VegobjektType
  /**
   * @type integer | undefined, int32
   */
  listeid?: number
  /**
   * @type string
   */
  relasjonstype: Relasjonstype
}

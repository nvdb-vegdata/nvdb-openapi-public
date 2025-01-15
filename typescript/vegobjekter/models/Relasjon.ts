import type { VegobjektType } from './VegobjektType'

export type RelasjonRelasjonstype = 'vegobjekter' | 'vegobjektIder'
export type Relasjon = {
  /**
   * @type string
   */
  relasjonstype: RelasjonRelasjonstype
  /**
   * @type integer, int32
   */
  id: number
  /**
   * @type object
   */
  type: VegobjektType
  /**
   * @type integer, int32
   */
  listeid: number
}

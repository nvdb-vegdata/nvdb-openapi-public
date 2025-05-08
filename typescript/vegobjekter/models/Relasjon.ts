import type { VegobjektType } from './VegobjektType'

export type RelasjonRelasjonstype = 'vegobjekter' | 'vegobjektIder'
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
  relasjonstype: RelasjonRelasjonstype
}

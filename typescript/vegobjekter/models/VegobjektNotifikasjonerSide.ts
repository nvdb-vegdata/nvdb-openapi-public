import type { VegobjektEndret } from './VegobjektEndret'
import type { VegobjektFjernet } from './VegobjektFjernet'
import type { SideMetadata } from './SideMetadata'

export type VegobjektNotifikasjonerSide = {
  /**
   * @type array
   */
  vegobjektVersjonerEndret: VegobjektEndret[]
  /**
   * @type array
   */
  vegobjektVersjonerFjernet: VegobjektFjernet[]
  /**
   * @type object
   */
  metadata: SideMetadata
}

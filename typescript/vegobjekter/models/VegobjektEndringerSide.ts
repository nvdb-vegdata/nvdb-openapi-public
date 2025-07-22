import type { VegobjektEndret } from './VegobjektEndret'
import type { VegobjektFjernet } from './VegobjektFjernet'
import type { SideMetadata } from './SideMetadata'

export type VegobjektEndringerSide = {
  /**
   * @description Liste med alle endringer som oppretter eller endrer versjoner av vegobjekter
   * @type array
   */
  vegobjektVersjonerEndret: VegobjektEndret[]
  /**
   * @description Liste med alle endringer som fjerner versjoner av vegobjekter
   * @type array
   */
  vegobjektVersjonerFjernet: VegobjektFjernet[]
  metadata: SideMetadata
}

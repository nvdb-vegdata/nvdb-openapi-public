import type { Vegobjekt } from './Vegobjekt'
import type { SideMetadata } from './SideMetadata'

export type VegobjekterSide = {
  /**
   * @type array
   */
  objekter: Vegobjekt[]
  /**
   * @type object
   */
  metadata: SideMetadata
}

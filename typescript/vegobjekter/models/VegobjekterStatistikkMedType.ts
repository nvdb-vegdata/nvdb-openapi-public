import type { VegobjekterStatistikk } from './VegobjekterStatistikk'

export type VegobjekterStatistikkMedType = {
  /**
   * @type integer, int32
   */
  id: number
  /**
   * @type string
   */
  navn: string
  /**
   * @type string
   */
  href: string
  /**
   * @type object
   */
  statistikk: VegobjekterStatistikk
}

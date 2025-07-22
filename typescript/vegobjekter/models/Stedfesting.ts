import type { Stedfestingstype } from './Stedfestingstype'
import type { Retning } from './Retning'
import type { Sideposisjon } from './Sideposisjon'

export type Stedfesting = {
  type: Stedfestingstype
  /**
   * @type integer | undefined int64
   */
  veglenkesekvensid?: number
  /**
   * @type integer | undefined int64
   */
  nodeid?: number
  /**
   * @type number | undefined double
   */
  relativPosisjon?: number
  /**
   * @type number | undefined double
   */
  startposisjon?: number
  /**
   * @type number | undefined double
   */
  sluttposisjon?: number
  startpunkt?: Stedfesting
  sluttpunkt?: Stedfesting
  retning?: Retning
  /**
   * @description Utelatt for svingstedfesting
   * @type array | undefined
   */
  kjørefelt?: string[]
  sideposisjon?: Sideposisjon
  /**
   * @type string | undefined
   */
  kortform?: string
}

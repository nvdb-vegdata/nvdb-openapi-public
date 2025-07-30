import type { Stedfestingstype } from './Stedfestingstype'
import type { Retning } from './Retning'
import type { Sideposisjon } from './Sideposisjon'

export type Stedfesting = {
  /**
   * @type string
   */
  type: Stedfestingstype
  /**
   * @type integer | undefined, int64
   */
  veglenkesekvensid?: number
  /**
   * @type integer | undefined, int64
   */
  nodeid?: number
  /**
   * @type number | undefined, double
   */
  relativPosisjon?: number
  /**
   * @type number | undefined, double
   */
  startposisjon?: number
  /**
   * @type number | undefined, double
   */
  sluttposisjon?: number
  /**
   * @type object | undefined
   */
  startpunkt?: Stedfesting
  /**
   * @type object | undefined
   */
  sluttpunkt?: Stedfesting
  /**
   * @type string | undefined
   */
  retning?: Retning
  /**
   * @description Utelatt for svingstedfesting
   * @type array | undefined
   */
  kjørefelt?: string[]
  /**
   * @type string | undefined
   */
  sideposisjon?: Sideposisjon
  /**
   * @type string | undefined
   */
  kortform?: string
}

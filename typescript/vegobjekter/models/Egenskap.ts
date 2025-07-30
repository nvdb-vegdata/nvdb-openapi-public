import type { Egenskapstype } from './Egenskapstype'

export type Egenskap = {
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
  egenskapstype: Egenskapstype
}

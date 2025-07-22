import type { Retning } from './Retning'
import type { Trafikantgruppe } from './Trafikantgruppe'

export type Kryssystem = {
  /**
   * @type integer int32
   */
  kryssystem: number
  /**
   * @type integer int32
   */
  kryssdel: number
  retning: Retning
  trafikantgruppe: Trafikantgruppe
  /**
   * @type number | undefined double
   */
  meter?: number
  /**
   * @type number | undefined double
   */
  fra_meter?: number
  /**
   * @type number | undefined double
   */
  til_meter?: number
}

import type { Retning } from './Retning'
import type { Trafikantgruppe } from './Trafikantgruppe'

export type Sideanlegg = {
  /**
   * @type integer, int32
   */
  sideanlegg: number
  /**
   * @type integer, int32
   */
  sideanleggsdel: number
  /**
   * @type string
   */
  retning: Retning
  /**
   * @type string
   */
  trafikantgruppe: Trafikantgruppe
  /**
   * @type number | undefined, double
   */
  meter?: number
  /**
   * @type number | undefined, double
   */
  fra_meter?: number
  /**
   * @type number | undefined, double
   */
  til_meter?: number
}

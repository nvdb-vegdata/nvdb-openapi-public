import type { AdskilteLop } from './AdskilteLop'
import type { Trafikantgruppe } from './Trafikantgruppe'
import type { Retning } from './Retning'

export type Strekning = {
  /**
   * @type integer int32
   */
  strekning: number
  /**
   * @type integer int32
   */
  delstrekning: number
  /**
   * @type boolean
   */
  arm: boolean
  adskilte_løp: AdskilteLop
  trafikantgruppe: Trafikantgruppe
  retning: Retning
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
  /**
   * @type string | undefined
   */
  adskilte_løp_nummer?: string
}

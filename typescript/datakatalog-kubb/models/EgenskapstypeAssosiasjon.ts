import type { Egenskapstype } from './Egenskapstype'

export type EgenskapstypeAssosiasjon = Egenskapstype & {
  /**
   * @type integer | undefined int32
   */
  tilknytning?: number
  /**
   * @type integer | undefined int32
   */
  vegobjekttypeid?: number
  /**
   * @type integer | undefined int32
   */
  innenfor_mor?: number
  /**
   * @type string | undefined date
   */
  startdato?: string
  /**
   * @type string | undefined date
   */
  sluttdato?: string
  /**
   * @type integer | undefined int32
   */
  assosiasjonskrav?: number
  /**
   * @type string | undefined
   */
  assosiasjonskravkommentar?: string
}

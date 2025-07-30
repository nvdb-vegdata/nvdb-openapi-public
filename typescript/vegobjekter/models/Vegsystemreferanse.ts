import type { Vegsystem } from './Vegsystem'
import type { Strekning } from './Strekning'
import type { Kryssystem } from './Kryssystem'
import type { Sideanlegg } from './Sideanlegg'
import type { MetrertLokasjon } from './MetrertLokasjon'

export type Vegsystemreferanse = {
  /**
   * @type object | undefined
   */
  vegsystem?: Vegsystem
  /**
   * @type object | undefined
   */
  strekning?: Strekning
  /**
   * @type object | undefined
   */
  kryssystem?: Kryssystem
  /**
   * @type object | undefined
   */
  sideanlegg?: Sideanlegg
  /**
   * @type object | undefined
   */
  metrertLokasjon?: MetrertLokasjon
  /**
   * @type string | undefined
   */
  kortform?: string
}

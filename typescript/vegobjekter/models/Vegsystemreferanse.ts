import type { Vegsystem } from './Vegsystem'
import type { Strekning } from './Strekning'
import type { Kryssystem } from './Kryssystem'
import type { Sideanlegg } from './Sideanlegg'
import type { MetrertLokasjon } from './MetrertLokasjon'

export type Vegsystemreferanse = {
  vegsystem?: Vegsystem
  strekning?: Strekning
  kryssystem?: Kryssystem
  sideanlegg?: Sideanlegg
  metrertLokasjon?: MetrertLokasjon
  /**
   * @type string | undefined
   */
  kortform?: string
}

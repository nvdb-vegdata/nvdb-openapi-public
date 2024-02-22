import type { Vegsystem } from './Vegsystem'
import type { Strekning } from './Strekning'
import type { Kryssystem } from './Kryssystem'
import type { Sideanlegg } from './Sideanlegg'

export type Vegsystemreferanse = {
  vegsystem?: Vegsystem
  strekning?: Strekning
  kryssystem?: Kryssystem
  sideanlegg?: Sideanlegg
  /**
   * @type string | undefined
   */
  kortform?: string
}

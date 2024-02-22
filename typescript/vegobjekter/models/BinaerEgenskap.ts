import type { Egenskap } from './Egenskap'

export type BinaerEgenskap = Egenskap & {
  /**
   * @type integer | undefined int32
   */
  blob_id?: number
  /**
   * @type string | undefined
   */
  blob_format?: string
  /**
   * @type string | undefined
   */
  href?: string
}

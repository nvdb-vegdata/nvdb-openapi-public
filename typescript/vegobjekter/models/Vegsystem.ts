import type { Vegkategori } from './Vegkategori'
import type { Vegfase } from './Vegfase'

export type Vegsystem = {
  /**
   * @type string
   */
  vegkategori: Vegkategori
  /**
   * @type string
   */
  fase: Vegfase
  /**
   * @type integer | undefined, int32
   */
  nummer?: number
}

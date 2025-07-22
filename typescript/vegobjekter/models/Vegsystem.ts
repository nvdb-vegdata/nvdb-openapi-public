import type { Vegkategori } from './Vegkategori'
import type { Vegfase } from './Vegfase'

export type Vegsystem = {
  vegkategori: Vegkategori
  fase: Vegfase
  /**
   * @type integer | undefined int32
   */
  nummer?: number
}

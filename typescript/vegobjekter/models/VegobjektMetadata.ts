import type { VegobjektType } from './VegobjektType'

export type VegobjektMetadata = {
  type: VegobjektType
  /**
   * @type integer int32
   */
  versjon: number
  /**
   * @type string date
   */
  startdato: string
  /**
   * @type string | undefined date
   */
  sluttdato?: string
  /**
   * @description Dato og tid uten tidssone på formatet yyyy-MM-ddTHH:mm:ss
   * @type string
   * @example 2023-01-01T12:34:56
   */
  sist_modifisert: string
}

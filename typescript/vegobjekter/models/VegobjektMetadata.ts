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
   * @description Dato og tid i UTC-format: yyyy-MM-ddTHH:mm:ssZ
   * @type string
   * @example 2023-01-01T12:34:56Z
   */
  sist_modifisert: string
}

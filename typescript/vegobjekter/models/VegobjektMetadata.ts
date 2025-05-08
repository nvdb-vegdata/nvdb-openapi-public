import type { VegobjektType } from './VegobjektType'

export type VegobjektMetadata = {
  /**
   * @type object
   */
  type: VegobjektType
  /**
   * @type integer, int32
   */
  versjon: number
  /**
   * @type string, date
   */
  startdato: string
  /**
   * @type string | undefined, date
   */
  sluttdato?: string
  /**
   * @description Dato og tid i UTC-format: yyyy-MM-ddTHH:mm:ssZ
   * @type string
   */
  sist_modifisert: string
}

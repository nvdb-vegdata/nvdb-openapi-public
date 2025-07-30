import type { Egenskapstype } from './Egenskapstype'

export type EgenskapstypeStruktur = Egenskapstype & {
  egenskapstyper?: any
} & {
  /**
   * @description Egenskapstyper som kan inngå i strukturen
   * @type array | undefined
   */
  egenskapstyper?: Egenskapstype[]
}

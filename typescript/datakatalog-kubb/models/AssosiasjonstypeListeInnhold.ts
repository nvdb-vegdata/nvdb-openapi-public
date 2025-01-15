import type { AssosiasjonstypeVegobjekttype } from './AssosiasjonstypeVegobjekttype'

export type AssosiasjonstypeListeInnholdInnenforMor = 'NEI' | 'JA' | 'MED_AVVIK'
export type AssosiasjonstypeListeInnholdRelasjonstype =
  | 'ASSOSIASJON'
  | 'AGGREGERING'
  | 'KOMPOSISJON'
  | 'TOPOLOGI'
export type AssosiasjonstypeListeInnhold = {
  /**
   * @type string | undefined
   */
  innenfor_mor?: AssosiasjonstypeListeInnholdInnenforMor
  /**
   * @type string | undefined
   */
  relasjonstype?: AssosiasjonstypeListeInnholdRelasjonstype
  /**
   * @type integer, int32
   */
  id: number
  /**
   * @type string | undefined
   */
  navn?: string
  /**
   * @type string
   */
  egenskapstype: string
  /**
   * @type object
   */
  type: AssosiasjonstypeVegobjekttype
}

import type { Geometri } from './Geometri'
import type { Vegsystemreferanse } from './Vegsystemreferanse'

export type VegsegmentRetning = 'MED' | 'MOT'
export type VegsegmentVeglenkeType =
  | 'Ukjent'
  | 'DETALJERT'
  | 'KONNEKTERING'
  | 'DETALJERT_KONNEKTERING'
  | 'HOVED'
export type VegsegmentDetaljnivå =
  | 'Vegtrase'
  | 'Kj\u00F8rebane'
  | 'Kj\u00F8refelt'
  | 'Vegtrase og kj\u00F8rebane'
export type VegsegmentTypeVeg =
  | 'Kanalisert veg'
  | 'Enkel bilveg'
  | 'Rampe'
  | 'Rundkj\u00F8ring'
  | 'Bilferje'
  | 'Passasjerferje'
  | 'Gang- og sykkelveg'
  | 'Sykkelveg'
  | 'Gangveg'
  | 'G\u00E5gate'
  | 'Fortau'
  | 'Trapp'
  | 'Gangfelt'
  | 'Gatetun'
  | 'Traktorveg'
  | 'Sti'
  | 'Annet'
export type VegsegmentTypeVegSosi =
  | 'kanalisertVeg'
  | 'enkelBilveg'
  | 'rampe'
  | 'rundkj\u00F8ring'
  | 'bilferje'
  | 'passasjerferje'
  | 'gangOgSykkelveg'
  | 'sykkelveg'
  | 'gangveg'
  | 'g\u00E5gate'
  | 'fortau'
  | 'trapp'
  | 'gangfelt'
  | 'gatetun'
  | 'traktorveg'
  | 'sti'
  | 'annet'
export type Vegsegment = {
  /**
   * @type integer int64
   */
  veglenkesekvensid: number
  /**
   * @type number | undefined double
   */
  startposisjon?: number
  /**
   * @type number | undefined double
   */
  sluttposisjon?: number
  /**
   * @type number | undefined double
   */
  relativPosisjon?: number
  /**
   * @type number | undefined double
   */
  lengde?: number
  /**
   * @type string
   */
  retning: VegsegmentRetning
  /**
   * @type string
   */
  veglenkeType: VegsegmentVeglenkeType
  /**
   * @type string
   */
  detaljnivå: VegsegmentDetaljnivå
  /**
   * @type string
   */
  typeVeg: VegsegmentTypeVeg
  /**
   * @type string
   */
  typeVeg_sosi: VegsegmentTypeVegSosi
  /**
   * @type string date
   */
  startdato: string
  /**
   * @type string | undefined date
   */
  sluttdato?: string
  geometri: Geometri
  /**
   * @type integer int32
   */
  kommune: number
  /**
   * @type integer int32
   */
  fylke: number
  vegsystemreferanse: Vegsystemreferanse
  /**
   * @type array | undefined
   */
  kontraktsområder?: number[]
  /**
   * @type array | undefined
   */
  riksvegruter?: number[]
}

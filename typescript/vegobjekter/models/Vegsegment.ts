import type { Retning } from './Retning'
import type { Sideposisjon } from './Sideposisjon'
import type { VeglenkeType } from './VeglenkeType'
import type { Detaljniva } from './Detaljniva'
import type { TypeVeg } from './TypeVeg'
import type { TypeVegSosi } from './TypeVegSosi'
import type { Geometri } from './Geometri'
import type { Vegsystemreferanse } from './Vegsystemreferanse'

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
   * @description Utelatt dersom vegsegmentets lengde er lik 0
   * @type number | undefined double
   */
  lengde?: number
  retning: Retning
  /**
   * @description Utelatt dersom kjørefelt ikke er relevant for vegsegmentet
   * @type array | undefined
   */
  kjørefelt?: string[]
  sideposisjon?: Sideposisjon
  /**
   * @description Utelatt dersom vegsegmentet ikke har noen felter i feltoversikten
   * @type array | undefined
   */
  feltoversikt?: string[]
  veglenkeType: VeglenkeType
  detaljnivå: Detaljniva
  typeVeg: TypeVeg
  typeVeg_sosi: TypeVegSosi
  /**
   * @type string date
   */
  startdato: string
  /**
   * @description Utelatt dersom vegsegmentet ikke har noe satt sluttdato
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
  vegsystemreferanse?: Vegsystemreferanse
  /**
   * @description Utelatt om vegsegmentet ikke overlapper med noen kontraktsområder
   * @type array | undefined
   */
  kontraktsområder?: number[]
  /**
   * @description Utelatt om vegsegmentet ikke overlapper med noen riksvegruter
   * @type array | undefined
   */
  riksvegruter?: number[]
  /**
   * @description Utelatt om vegsegmentet ikke overlapper med noen vegforvaltere
   * @type array | undefined
   */
  vegforvaltere?: number[]
  /**
   * @description Utelatt om vegsegmentet ikke overlapper med noen adresser
   * @type array | undefined
   */
  adresser?: number[]
}

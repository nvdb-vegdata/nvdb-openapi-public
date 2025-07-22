import type { Kontraktsomrade } from './Kontraktsomrade'
import type { Riksvegrute } from './Riksvegrute'
import type { Vegforvalter } from './Vegforvalter'
import type { Adresse } from './Adresse'
import type { Vegsystemreferanse } from './Vegsystemreferanse'
import type { Stedfesting } from './Stedfesting'
import type { Geometri } from './Geometri'

export type Lokasjon = {
  /**
   * @type array
   */
  kommuner: number[]
  /**
   * @type array
   */
  fylker: number[]
  /**
   * @description Utelatt om vegobjektet ikke overlapper med noen kontraktsområder
   * @type array | undefined
   */
  kontraktsområder?: Kontraktsomrade[]
  /**
   * @description Utelatt om vegobjektet ikke overlapper med noen riksvegruter
   * @type array | undefined
   */
  riksvegruter?: Riksvegrute[]
  /**
   * @description Utelatt om vegobjektet ikke overlapper med noen vegforvaltere
   * @type array | undefined
   */
  vegforvaltere?: Vegforvalter[]
  /**
   * @description Utelatt om vegobjektet ikke overlapper med noen adresser
   * @type array | undefined
   */
  adresser?: Adresse[]
  /**
   * @description Utelatt om vegobjektet ikke har noen vegsystemreferanser
   * @type array | undefined
   */
  vegsystemreferanser?: Vegsystemreferanse[]
  /**
   * @description Utelatt om vegobjektet ikke har noen stedfestinger
   * @type array | undefined
   */
  stedfestinger?: Stedfesting[]
  /**
   * @description Kun med om inkludergeometri=lokasjon eller inkludergeometri ikke er oppgitt
   */
  geometri?: Geometri
  /**
   * @description Utelatt om lengde er lik 0
   * @type number | undefined double
   */
  lengde?: number
}

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
   * @type array | undefined
   */
  kontraktsområder?: Kontraktsomrade[]
  /**
   * @type array | undefined
   */
  riksvegruter?: Riksvegrute[]
  /**
   * @type array | undefined
   */
  vegforvaltere?: Vegforvalter[]
  /**
   * @type array | undefined
   */
  adresser?: Adresse[]
  /**
   * @type array | undefined
   */
  vegsystemreferanser?: Vegsystemreferanse[]
  /**
   * @type array | undefined
   */
  stedfestinger?: Stedfesting[]
  /**
   * @type object | undefined
   */
  geometri?: Geometri
  /**
   * @type number | undefined, double
   */
  lengde?: number
}

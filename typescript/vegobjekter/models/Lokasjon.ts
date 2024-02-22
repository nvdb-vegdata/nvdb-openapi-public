import type { Kontraktsomrade } from './Kontraktsomrade'
import type { Riksvegrute } from './Riksvegrute'
import type { Gate } from './Gate'
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
   * @type array
   */
  kontraktsområder: Kontraktsomrade[]
  /**
   * @type array
   */
  riksvegruter: Riksvegrute[]
  /**
   * @type array
   */
  gater: Gate[]
  /**
   * @type array
   */
  vegsystemreferanser: Vegsystemreferanse[]
  /**
   * @type array
   */
  stedfestinger: Stedfesting[]
  geometri?: Geometri
  /**
   * @type number | undefined double
   */
  lengde?: number
}

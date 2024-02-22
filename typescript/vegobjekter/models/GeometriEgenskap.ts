import type { Egenskap } from './Egenskap'
import type { GeometriKvalitet } from './GeometriKvalitet'

export type Medium =
  | 'T'
  | 'B'
  | 'L'
  | 'U'
  | 'S'
  | 'O'
  | 'V'
  | 'D'
  | 'I'
  | 'W'
  | 'J'
  | 'X'
  | 'IKKE_REGISTRERT'
export type GeometriEgenskap = Egenskap & {
  /**
   * @type string | undefined
   */
  verdi?: string
  kvalitet?: GeometriKvalitet
  /**
   * @type string | undefined date
   */
  datafangstdato?: string
  /**
   * @type string | undefined date
   */
  verifiseringsdato?: string
  /**
   * @type string | undefined date
   */
  oppdateringsdato?: string
  /**
   * @type string | undefined
   */
  prosesshistoriskk?: string
  /**
   * @type integer | undefined int32
   */
  kommune?: number
  /**
   * @type string | undefined
   */
  medium?: Medium
  /**
   * @type integer | undefined int32
   */
  medium_nvdb?: number
  /**
   * @type string | undefined
   */
  sosinavn?: string
  /**
   * @type integer | undefined int32
   */
  temakode?: number
  /**
   * @type boolean | undefined
   */
  referansegeometri?: boolean
  /**
   * @type number | undefined double
   */
  lengde?: number
  /**
   * @type integer | undefined int32
   */
  høydereferanse?: number
}

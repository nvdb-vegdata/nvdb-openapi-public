import type { Egenskap } from './Egenskap'
import type { GeometriKvalitet } from './GeometriKvalitet'
import type { SosiMedium } from './SosiMedium'

export type GeometriEgenskap = Egenskap & {
  /**
   * @type string | undefined
   */
  verdi?: string
  /**
   * @type integer | undefined int32
   */
  srid?: number
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
  prosesshistorikk?: string
  /**
   * @type integer | undefined int32
   */
  kommune?: number
  medium?: SosiMedium
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

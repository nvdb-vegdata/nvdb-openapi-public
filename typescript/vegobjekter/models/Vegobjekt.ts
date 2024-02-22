import type { VegobjektMetadata } from './VegobjektMetadata'
import type { Egenskap } from './Egenskap'
import type { UtledetGeometri } from './UtledetGeometri'
import type { Geometrimal } from './Geometrimal'
import type { Lokasjon } from './Lokasjon'
import type { Relasjoner } from './Relasjoner'
import type { Vegsegment } from './Vegsegment'

export type Vegobjekt = {
  /**
   * @type integer int64
   */
  id: number
  /**
   * @type string
   */
  href: string
  metadata?: VegobjektMetadata
  /**
   * @type array | undefined
   */
  egenskaper?: Egenskap[]
  geometri?: UtledetGeometri
  geometrimål?: Geometrimal
  lokasjon?: Lokasjon
  relasjoner?: Relasjoner
  /**
   * @type array | undefined
   */
  vegsegmenter?: Vegsegment[]
}

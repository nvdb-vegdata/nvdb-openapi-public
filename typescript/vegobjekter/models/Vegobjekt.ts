import type { VegobjektMetadata } from './VegobjektMetadata'
import type { Egenskap } from './Egenskap'
import type { UtledetGeometri } from './UtledetGeometri'
import type { Lokasjon } from './Lokasjon'
import type { Relasjoner } from './Relasjoner'
import type { Vegsegment } from './Vegsegment'

export type Vegobjekt = {
  /**
   * @description Vegobjektets id i NVDB
   * @type integer, int64
   */
  id: number
  /**
   * @description URL-en til dette vegobjektet
   * @type string
   */
  href: string
  /**
   * @type object | undefined
   */
  metadata?: VegobjektMetadata
  /**
   * @description Objektets egenskaper. Tilstede dersom inkluder=alle|egenskaper. Inneholder ikke stedfestings- og relasjonsegenskaper til forskjell fra Les API V3 (tilsvarende informasjon finnes i vegobjekt.lokasjon og vegobjekt.relasjoner).
   * @type array | undefined
   */
  egenskaper?: Egenskap[]
  /**
   * @type object | undefined
   */
  geometri?: UtledetGeometri
  /**
   * @type object | undefined
   */
  lokasjon?: Lokasjon
  /**
   * @type object | undefined
   */
  relasjoner?: Relasjoner
  /**
   * @description Segmenter for dette objektet. Tilstede dersom inkluder=alle|vegsegmenter
   * @type array | undefined
   */
  vegsegmenter?: Vegsegment[]
}

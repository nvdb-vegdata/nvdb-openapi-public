import { vegobjektMetadataSchema } from './vegobjektMetadataSchema'
import { egenskapSchema } from './egenskapSchema'
import { utledetGeometriSchema } from './utledetGeometriSchema'
import { lokasjonSchema } from './lokasjonSchema'
import { relasjonerSchema } from './relasjonerSchema'
import { vegsegmentSchema } from './vegsegmentSchema'
import { z } from 'zod'

export const vegobjektSchema = z.object({
  id: z.number().describe(`Vegobjektets id i NVDB`),
  href: z.string().describe(`URL-en til dette vegobjektet`),
  metadata: z.lazy(() => vegobjektMetadataSchema).optional(),
  egenskaper: z
    .array(z.lazy(() => egenskapSchema))
    .describe(
      `Objektets egenskaper. Tilstede dersom inkluder=alle|egenskaper. Inneholder ikke stedfestings- og relasjonsegenskaper til forskjell fra Les API V3 (tilsvarende informasjon finnes i vegobjekt.lokasjon og vegobjekt.relasjoner).`,
    )
    .optional(),
  geometri: z.lazy(() => utledetGeometriSchema).optional(),
  lokasjon: z.lazy(() => lokasjonSchema).optional(),
  relasjoner: z.lazy(() => relasjonerSchema).optional(),
  vegsegmenter: z
    .array(z.lazy(() => vegsegmentSchema))
    .describe(
      `Segmenter for dette objektet. Tilstede dersom inkluder=alle|vegsegmenter`,
    )
    .optional(),
})

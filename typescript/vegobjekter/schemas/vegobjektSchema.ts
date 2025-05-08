import { vegobjektMetadataSchema } from './vegobjektMetadataSchema'
import { egenskapSchema } from './egenskapSchema'
import { utledetGeometriSchema } from './utledetGeometriSchema'
import { lokasjonSchema } from './lokasjonSchema'
import { relasjonerSchema } from './relasjonerSchema'
import { vegsegmentSchema } from './vegsegmentSchema'
import { z } from 'zod'

export const vegobjektSchema = z.object({
  id: z.number().int(),
  href: z.string(),
  metadata: z.lazy(() => vegobjektMetadataSchema).optional(),
  egenskaper: z.array(z.lazy(() => egenskapSchema)).optional(),
  geometri: z.lazy(() => utledetGeometriSchema).optional(),
  lokasjon: z.lazy(() => lokasjonSchema).optional(),
  relasjoner: z.lazy(() => relasjonerSchema).optional(),
  vegsegmenter: z.array(z.lazy(() => vegsegmentSchema)).optional(),
})

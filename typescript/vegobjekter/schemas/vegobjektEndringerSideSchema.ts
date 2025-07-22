import { vegobjektEndretSchema } from './vegobjektEndretSchema'
import { vegobjektFjernetSchema } from './vegobjektFjernetSchema'
import { sideMetadataSchema } from './sideMetadataSchema'
import { z } from 'zod'

export const vegobjektEndringerSideSchema = z.object({
  vegobjektVersjonerEndret: z
    .array(z.lazy(() => vegobjektEndretSchema))
    .describe(
      `Liste med alle endringer som oppretter eller endrer versjoner av vegobjekter`,
    ),
  vegobjektVersjonerFjernet: z
    .array(z.lazy(() => vegobjektFjernetSchema))
    .describe(`Liste med alle endringer som fjerner versjoner av vegobjekter`),
  metadata: z.lazy(() => sideMetadataSchema),
})

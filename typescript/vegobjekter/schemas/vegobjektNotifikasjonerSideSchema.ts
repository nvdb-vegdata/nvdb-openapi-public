import { vegobjektEndretSchema } from './vegobjektEndretSchema'
import { vegobjektFjernetSchema } from './vegobjektFjernetSchema'
import { sideMetadataSchema } from './sideMetadataSchema'
import { z } from 'zod'

export const vegobjektNotifikasjonerSideSchema = z.object({
  vegobjektVersjonerEndret: z.array(z.lazy(() => vegobjektEndretSchema)),
  vegobjektVersjonerFjernet: z.array(z.lazy(() => vegobjektFjernetSchema)),
  metadata: z.lazy(() => sideMetadataSchema),
})

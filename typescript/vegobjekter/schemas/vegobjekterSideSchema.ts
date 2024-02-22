import { vegobjektSchema } from './vegobjektSchema'
import { sideMetadataSchema } from './sideMetadataSchema'
import { z } from 'zod'

export const vegobjekterSideSchema = z.object({
  objekter: z.array(z.lazy(() => vegobjektSchema)),
  metadata: z.lazy(() => sideMetadataSchema),
})

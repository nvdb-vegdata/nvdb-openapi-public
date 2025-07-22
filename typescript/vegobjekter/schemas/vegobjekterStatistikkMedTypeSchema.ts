import { vegobjekterStatistikkSchema } from './vegobjekterStatistikkSchema'
import { z } from 'zod'

export const vegobjekterStatistikkMedTypeSchema = z.object({
  id: z.number(),
  navn: z.string(),
  href: z.string(),
  statistikk: z.lazy(() => vegobjekterStatistikkSchema),
})

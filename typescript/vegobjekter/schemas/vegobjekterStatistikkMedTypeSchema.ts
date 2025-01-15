import { vegobjekterStatistikkSchema } from './vegobjekterStatistikkSchema'
import { z } from 'zod'

export const vegobjekterStatistikkMedTypeSchema = z.object({
  id: z.number().int(),
  navn: z.string(),
  href: z.string(),
  statistikk: z.lazy(() => vegobjekterStatistikkSchema),
})

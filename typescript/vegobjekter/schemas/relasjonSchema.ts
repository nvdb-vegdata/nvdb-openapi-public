import { vegobjektTypeSchema } from './vegobjektTypeSchema'
import { z } from 'zod'

export const relasjonSchema = z.object({
  relasjonstype: z.enum(['vegobjekter', 'vegobjektIder']),
  id: z.number().int(),
  type: z.lazy(() => vegobjektTypeSchema),
  listeid: z.number().int(),
})

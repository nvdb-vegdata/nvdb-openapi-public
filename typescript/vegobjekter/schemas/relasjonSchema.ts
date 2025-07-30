import { vegobjektTypeSchema } from './vegobjektTypeSchema'
import { relasjonstypeSchema } from './relasjonstypeSchema'
import { z } from 'zod'

export const relasjonSchema = z.object({
  id: z.number().int(),
  type: z.lazy(() => vegobjektTypeSchema),
  listeid: z.number().int().optional(),
  relasjonstype: z.lazy(() => relasjonstypeSchema),
})

import { vegobjektTypeSchema } from './vegobjektTypeSchema'
import { vegobjektEllerIdListeSchema } from './vegobjektEllerIdListeSchema'
import { z } from 'zod'

export const relasjonSchema = z.object({
  listeid: z.number(),
  id: z.number(),
  type: z.lazy(() => vegobjektTypeSchema),
  vegobjekter: z.lazy(() => vegobjektEllerIdListeSchema),
})

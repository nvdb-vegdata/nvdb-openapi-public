import { relasjonSchema } from './relasjonSchema'
import { vegobjektSchema } from './vegobjektSchema'
import { z } from 'zod'

export const relasjonMedVegobjekterSchema = z
  .lazy(() => relasjonSchema)
  .and(z.object({ vegobjekter: z.array(z.any()).optional() }))
  .and(
    z.object({
      vegobjekter: z.array(z.lazy(() => vegobjektSchema)).optional(),
    }),
  )

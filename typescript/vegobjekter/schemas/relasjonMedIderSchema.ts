import { relasjonSchema } from './relasjonSchema'
import { z } from 'zod'

export const relasjonMedIderSchema = z
  .lazy(() => relasjonSchema)
  .and(z.object({ vegobjekter: z.array(z.number()).optional() }))

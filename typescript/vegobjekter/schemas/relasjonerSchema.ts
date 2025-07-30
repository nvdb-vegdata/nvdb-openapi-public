import { relasjonMedIderSchema } from './relasjonMedIderSchema'
import { relasjonSchema } from './relasjonSchema'
import { z } from 'zod'

export const relasjonerSchema = z.object({
  foreldre: z
    .array(z.lazy(() => relasjonMedIderSchema))
    .describe('Utelatt dersom vegobjektet ikke har noen foreldre')
    .optional(),
  barn: z
    .array(z.lazy(() => relasjonSchema))
    .describe('Utelatt dersom vegobjektet ikke har noen barn')
    .optional(),
})

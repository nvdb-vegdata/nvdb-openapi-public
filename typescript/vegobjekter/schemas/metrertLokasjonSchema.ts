import { retningSchema } from './retningSchema'
import { sideposisjonSchema } from './sideposisjonSchema'
import { z } from 'zod'

export const metrertLokasjonSchema = z.object({
  retning: z.lazy(() => retningSchema).optional(),
  sideposisjon: z.lazy(() => sideposisjonSchema).optional(),
  kjørefelt: z.array(z.string()).optional(),
})

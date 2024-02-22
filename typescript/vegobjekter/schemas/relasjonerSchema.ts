import { relasjonSchema } from './relasjonSchema'
import { z } from 'zod'

export const relasjonerSchema = z.object({
  foreldre: z.array(z.lazy(() => relasjonSchema)).optional(),
  barn: z.array(z.lazy(() => relasjonSchema)).optional(),
})

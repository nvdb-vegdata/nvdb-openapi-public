import { retningSchema } from './retningSchema'
import { sideposisjonSchema } from './sideposisjonSchema'
import { z } from 'zod'

export const metrertLokasjonSchema = z.object({
  retning: z.lazy(() => retningSchema).optional(),
  sideposisjon: z.lazy(() => sideposisjonSchema).optional(),
  'kj\u00F8refelt': z.array(z.string()).optional(),
})

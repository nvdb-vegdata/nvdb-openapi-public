import { egenskapSchema } from './egenskapSchema'
import { z } from 'zod'

export const listeEgenskapSchema = z
  .lazy(() => egenskapSchema)
  .and(z.object({ innhold: z.array(z.lazy(() => egenskapSchema)).optional() }))

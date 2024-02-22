import { egenskapSchema } from './egenskapSchema'
import { z } from 'zod'

export const boolskEgenskapSchema = z
  .lazy(() => egenskapSchema)
  .and(z.object({ verdi: z.boolean().optional() }))

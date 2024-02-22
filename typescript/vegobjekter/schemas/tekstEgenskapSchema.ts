import { egenskapSchema } from './egenskapSchema'
import { z } from 'zod'

export const tekstEgenskapSchema = z
  .lazy(() => egenskapSchema)
  .and(z.object({ verdi: z.string().optional() }))

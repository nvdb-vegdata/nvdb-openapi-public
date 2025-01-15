import { egenskapSchema } from './egenskapSchema'
import { z } from 'zod'

export const assosiasjonEgenskapSchema = z
  .lazy(() => egenskapSchema)
  .and(z.object({ verdi: z.number().int().optional() }))

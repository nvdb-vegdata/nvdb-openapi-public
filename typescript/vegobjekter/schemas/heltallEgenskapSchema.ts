import { egenskapSchema } from './egenskapSchema'
import { enhetSchema } from './enhetSchema'
import { z } from 'zod'

export const heltallEgenskapSchema = z
  .lazy(() => egenskapSchema)
  .and(
    z.object({
      verdi: z.number().int().optional(),
      enhet: z.lazy(() => enhetSchema).optional(),
    }),
  )

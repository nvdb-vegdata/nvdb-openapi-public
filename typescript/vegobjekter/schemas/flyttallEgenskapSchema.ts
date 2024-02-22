import { egenskapSchema } from './egenskapSchema'
import { enhetSchema } from './enhetSchema'
import { z } from 'zod'

export const flyttallEgenskapSchema = z
  .lazy(() => egenskapSchema)
  .and(
    z.object({
      verdi: z.number().optional(),
      enhet: z.lazy(() => enhetSchema).optional(),
    }),
  )

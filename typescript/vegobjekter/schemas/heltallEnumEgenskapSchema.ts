import { egenskapSchema } from './egenskapSchema'
import { enhetSchema } from './enhetSchema'
import { z } from 'zod'

export const heltallEnumEgenskapSchema = z
  .lazy(() => egenskapSchema)
  .and(
    z.object({
      verdi: z.number().int().optional(),
      enum_id: z.number().int().optional(),
      enhet: z.lazy(() => enhetSchema).optional(),
    }),
  )

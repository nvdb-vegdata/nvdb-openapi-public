import { egenskapSchema } from './egenskapSchema'
import { z } from 'zod'

export const tekstEnumEgenskapSchema = z
  .lazy(() => egenskapSchema)
  .and(
    z.object({
      verdi: z.string().optional(),
      enum_id: z.number().int().optional(),
    }),
  )

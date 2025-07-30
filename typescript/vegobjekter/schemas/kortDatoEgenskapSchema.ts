import { egenskapSchema } from './egenskapSchema'
import { z } from 'zod'

export const kortDatoEgenskapSchema = z
  .lazy(() => egenskapSchema)
  .and(
    z.object({
      verdi: z
        .string()
        .regex(new RegExp('^(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$'))
        .describe('M\u00E5ned og dato p\u00E5 formatet MM-DD')
        .optional(),
    }),
  )

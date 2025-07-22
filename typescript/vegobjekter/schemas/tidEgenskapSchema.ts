import { egenskapSchema } from './egenskapSchema'
import { z } from 'zod'

export const tidEgenskapSchema = z
  .lazy(() => egenskapSchema)
  .and(
    z.object({
      verdi: z
        .string()
        .regex(new RegExp('^([01][0-9]|2[0-3]):[0-5][0-9]$'))
        .describe(`Klokkeslett på formatet HH:mm`)
        .optional(),
    }),
  )

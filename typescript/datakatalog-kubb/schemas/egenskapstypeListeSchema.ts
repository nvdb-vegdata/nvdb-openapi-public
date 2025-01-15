import { egenskapstypeSchema } from './egenskapstypeSchema'
import { z } from 'zod'

export const egenskapstypeListeSchema = z
  .lazy(() => egenskapstypeSchema)
  .and(
    z.object({
      maksimalt_antall_verdier: z.number().int().optional(),
      minimalt_antall_verdier: z.number().int().optional(),
      innhold: z.lazy(() => egenskapstypeSchema).optional(),
    }),
  )

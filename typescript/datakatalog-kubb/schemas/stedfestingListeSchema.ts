import { stedfestingSchema } from './stedfestingSchema'
import { egenskapstypeStedfestingSchema } from './egenskapstypeStedfestingSchema'
import { z } from 'zod'

export const stedfestingListeSchema = z
  .lazy(() => stedfestingSchema)
  .and(
    z.object({
      maksimalt_antall_verdier: z.number().optional(),
      minimalt_antall_verdier: z.number().optional(),
      innhold: z.lazy(() => egenskapstypeStedfestingSchema).optional(),
    }),
  )

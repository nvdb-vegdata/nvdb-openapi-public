import { egenskapstypeSchema } from './egenskapstypeSchema'
import { z } from 'zod'

export const egenskapstypeStrukturSchema = z
  .lazy(() => egenskapstypeSchema)
  .and(z.object({ egenskapstyper: z.any().optional() }))
  .and(
    z.object({
      egenskapstyper: z
        .array(z.lazy(() => egenskapstypeSchema))
        .describe(`Egenskapstyper som kan inngå i strukturen`)
        .optional(),
    }),
  )

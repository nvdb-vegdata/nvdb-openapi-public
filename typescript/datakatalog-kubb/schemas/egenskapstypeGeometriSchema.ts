import { egenskapstypeSchema } from './egenskapstypeSchema'
import { z } from 'zod'

export const egenskapstypeGeometriSchema = z
  .lazy(() => egenskapstypeSchema)
  .and(
    z.object({
      dimensjoner: z.number().optional(),
      geometritype: z
        .enum([
          `PUNKT`,
          `POLYGON`,
          `LINJE`,
          `FLERELINJE`,
          `FLEREPUNKT`,
          `FLEREPOLYGON`,
          `KOMPLEKS`,
          `UKJENT`,
        ])
        .optional(),
      innenfor_mor: z.boolean().optional(),
    }),
  )

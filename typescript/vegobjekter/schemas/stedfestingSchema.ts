import { stedfestingstypeSchema } from './stedfestingstypeSchema'
import { retningSchema } from './retningSchema'
import { sideposisjonSchema } from './sideposisjonSchema'
import { z } from 'zod'

export const stedfestingSchema = z.object({
  type: z.lazy(() => stedfestingstypeSchema),
  veglenkesekvensid: z.number().optional(),
  nodeid: z.number().optional(),
  relativPosisjon: z.number().optional(),
  startposisjon: z.number().optional(),
  sluttposisjon: z.number().optional(),
  startpunkt: z.any().optional(),
  sluttpunkt: z.any().optional(),
  retning: z.lazy(() => retningSchema).optional(),
  kjørefelt: z
    .array(z.string())
    .describe(`Utelatt for svingstedfesting`)
    .optional(),
  sideposisjon: z.lazy(() => sideposisjonSchema).optional(),
  kortform: z.string().optional(),
})

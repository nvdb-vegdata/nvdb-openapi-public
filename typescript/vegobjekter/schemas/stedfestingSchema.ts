import { stedfestingstypeSchema } from './stedfestingstypeSchema'
import { retningSchema } from './retningSchema'
import { sideposisjonSchema } from './sideposisjonSchema'
import { z } from 'zod'

export const stedfestingSchema = z.object({
  type: z.lazy(() => stedfestingstypeSchema),
  veglenkesekvensid: z.number().int().optional(),
  nodeid: z.number().int().optional(),
  relativPosisjon: z.number().optional(),
  startposisjon: z.number().optional(),
  sluttposisjon: z.number().optional(),
  startpunkt: z.lazy(() => stedfestingSchema).optional(),
  sluttpunkt: z.lazy(() => stedfestingSchema).optional(),
  retning: z.lazy(() => retningSchema).optional(),
  'kj\u00F8refelt': z
    .array(z.string())
    .describe('Utelatt for svingstedfesting')
    .optional(),
  sideposisjon: z.lazy(() => sideposisjonSchema).optional(),
  kortform: z.string().optional(),
})

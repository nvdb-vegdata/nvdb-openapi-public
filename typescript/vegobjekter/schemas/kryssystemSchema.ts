import { retningSchema } from './retningSchema'
import { trafikantgruppeSchema } from './trafikantgruppeSchema'
import { z } from 'zod'

export const kryssystemSchema = z.object({
  kryssystem: z.number().int(),
  kryssdel: z.number().int(),
  retning: z.lazy(() => retningSchema),
  trafikantgruppe: z.lazy(() => trafikantgruppeSchema),
  meter: z.number().optional(),
  fra_meter: z.number().optional(),
  til_meter: z.number().optional(),
})

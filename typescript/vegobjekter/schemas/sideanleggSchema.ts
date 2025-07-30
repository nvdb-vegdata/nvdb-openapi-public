import { retningSchema } from './retningSchema'
import { trafikantgruppeSchema } from './trafikantgruppeSchema'
import { z } from 'zod'

export const sideanleggSchema = z.object({
  sideanlegg: z.number().int(),
  sideanleggsdel: z.number().int(),
  retning: z.lazy(() => retningSchema),
  trafikantgruppe: z.lazy(() => trafikantgruppeSchema),
  meter: z.number().optional(),
  fra_meter: z.number().optional(),
  til_meter: z.number().optional(),
})

import { z } from 'zod'

export const sideanleggSchema = z.object({
  sideanlegg: z.number().int(),
  sideanleggsdel: z.number().int(),
  retning: z.enum(['MED', 'MOT']),
  trafikantgruppe: z.enum(['K', 'G']),
  meter: z.number().optional(),
  fra_meter: z.number().optional(),
  til_meter: z.number().optional(),
})

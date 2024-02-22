import { z } from 'zod'

export const sideanleggSchema = z.object({
  id: z.number(),
  versjon: z.number(),
  sideanlegg: z.number(),
  sideanleggsdel: z.number(),
  retning: z.enum([`MED`, `MOT`]),
  trafikantgruppe: z.enum([`K`, `G`]),
  meter: z.number().optional(),
  fra_meter: z.number().optional(),
  til_meter: z.number().optional(),
})

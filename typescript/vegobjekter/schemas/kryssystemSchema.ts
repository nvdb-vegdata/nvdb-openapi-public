import { z } from 'zod'

export const kryssystemSchema = z.object({
  id: z.number(),
  versjon: z.number(),
  kryssystem: z.number(),
  kryssdel: z.number(),
  retning: z.enum([`MED`, `MOT`]),
  trafikantgruppe: z.enum([`K`, `G`]),
  meter: z.number().optional(),
  fra_meter: z.number().optional(),
  til_meter: z.number().optional(),
})

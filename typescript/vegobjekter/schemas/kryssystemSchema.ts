import { z } from 'zod'

export const kryssystemSchema = z.object({
  kryssystem: z.number().int(),
  kryssdel: z.number().int(),
  retning: z.enum(['MED', 'MOT']),
  trafikantgruppe: z.enum(['K', 'G']),
  meter: z.number().optional(),
  fra_meter: z.number().optional(),
  til_meter: z.number().optional(),
})

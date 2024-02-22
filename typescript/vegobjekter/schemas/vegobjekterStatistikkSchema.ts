import { z } from 'zod'

export const vegobjekterStatistikkSchema = z.object({
  antall: z.number().optional(),
  lengde: z.number().optional(),
})

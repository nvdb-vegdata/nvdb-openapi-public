import { z } from 'zod'

export const vegobjekterStatistikkSchema = z.object({
  antall: z.number().int().optional(),
  lengde: z.number().optional(),
})

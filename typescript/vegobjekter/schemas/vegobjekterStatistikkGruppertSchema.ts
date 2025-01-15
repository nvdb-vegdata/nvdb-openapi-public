import { z } from 'zod'

export const vegobjekterStatistikkGruppertSchema = z.object({
  antall: z.number().int().optional(),
  lengde: z.number().optional(),
  fylke: z.number().int().optional(),
  kommune: z.number().int().optional(),
  vegkategori: z.enum(['E', 'F', 'K', 'P', 'R', 'S']).optional(),
})

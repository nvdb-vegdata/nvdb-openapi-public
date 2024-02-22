import { z } from 'zod'

export const vegobjekterStatistikkGruppertSchema = z.object({
  antall: z.number().optional(),
  lengde: z.number().optional(),
  fylke: z.number().optional(),
  kommune: z.number().optional(),
  vegkategori: z.enum([`E`, `F`, `K`, `P`, `R`, `S`]).optional(),
})

import { z } from 'zod'

export const vegsystemSchema = z.object({
  id: z.number(),
  versjon: z.number(),
  vegkategori: z.enum([`E`, `F`, `K`, `P`, `R`, `S`]),
  fase: z.enum([`P`, `A`, `V`, `F`]),
  nummer: z.number(),
})

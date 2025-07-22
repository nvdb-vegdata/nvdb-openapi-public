import { z } from 'zod'

export const vegobjekterStatistikkSchema = z.object({
  antall: z
    .number()
    .describe(`Antallet objekter. Utelatt dersom inkluder=lengde`)
    .optional(),
  lengde: z
    .number()
    .describe(
      `Den summerte lengden av objektene. Utelatt dersom inkluder=antall`,
    )
    .optional(),
})

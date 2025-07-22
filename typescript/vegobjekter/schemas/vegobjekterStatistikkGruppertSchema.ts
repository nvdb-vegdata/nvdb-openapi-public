import { vegkategoriSchema } from './vegkategoriSchema'
import { z } from 'zod'

export const vegobjekterStatistikkGruppertSchema = z.object({
  antall: z
    .number()
    .describe(`Antallet objekter i gruppen. Utelatt dersom inkluder=lengde`)
    .optional(),
  lengde: z
    .number()
    .describe(
      `Den summerte lengden av objektene i gruppen. Utelatt dersom inkluder=antall`,
    )
    .optional(),
  fylke: z
    .number()
    .describe(
      `Hvilket fylke gruppen tilhører. Utelatt hvis ikke gruppert på fylke`,
    )
    .optional(),
  kommune: z
    .number()
    .describe(
      `Hvilken kommune gruppen tilhører. Utelatt hvis ikke gruppert på kommune`,
    )
    .optional(),
  vegkategori: z.lazy(() => vegkategoriSchema).optional(),
})

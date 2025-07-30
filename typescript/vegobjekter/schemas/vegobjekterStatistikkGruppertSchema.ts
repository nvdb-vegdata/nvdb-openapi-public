import { vegkategoriSchema } from './vegkategoriSchema'
import { z } from 'zod'

export const vegobjekterStatistikkGruppertSchema = z.object({
  antall: z
    .number()
    .int()
    .describe('Antallet objekter i gruppen. Utelatt dersom inkluder=lengde')
    .optional(),
  lengde: z
    .number()
    .describe(
      'Den summerte lengden av objektene i gruppen. Utelatt dersom inkluder=antall',
    )
    .optional(),
  fylke: z
    .number()
    .int()
    .describe(
      'Hvilket fylke gruppen tilh\u00F8rer. Utelatt hvis ikke gruppert p\u00E5 fylke',
    )
    .optional(),
  kommune: z
    .number()
    .int()
    .describe(
      'Hvilken kommune gruppen tilh\u00F8rer. Utelatt hvis ikke gruppert p\u00E5 kommune',
    )
    .optional(),
  vegkategori: z.lazy(() => vegkategoriSchema).optional(),
})

import { egenskapSchema } from './egenskapSchema'
import { geometriKvalitetSchema } from './geometriKvalitetSchema'
import { z } from 'zod'

export const geometriEgenskapSchema = z
  .lazy(() => egenskapSchema)
  .and(
    z.object({
      verdi: z.string().optional(),
      kvalitet: z.lazy(() => geometriKvalitetSchema).optional(),
      datafangstdato: z.string().date().optional(),
      verifiseringsdato: z.string().date().optional(),
      oppdateringsdato: z.string().date().optional(),
      prosesshistoriskk: z.string().optional(),
      kommune: z.number().int().optional(),
      medium: z
        .enum([
          'T',
          'B',
          'L',
          'U',
          'S',
          'O',
          'V',
          'D',
          'I',
          'W',
          'J',
          'X',
          'IKKE_REGISTRERT',
        ])
        .optional(),
      medium_nvdb: z.number().int().optional(),
      sosinavn: z.string().optional(),
      temakode: z.number().int().optional(),
      referansegeometri: z.boolean().optional(),
      lengde: z.number().optional(),
      'h\u00F8ydereferanse': z.number().int().optional(),
    }),
  )

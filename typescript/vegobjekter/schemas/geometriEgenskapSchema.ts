import { egenskapSchema } from './egenskapSchema'
import { geometriKvalitetSchema } from './geometriKvalitetSchema'
import { sosiMediumSchema } from './sosiMediumSchema'
import { z } from 'zod'

export const geometriEgenskapSchema = z
  .lazy(() => egenskapSchema)
  .and(
    z.object({
      verdi: z.string().optional(),
      srid: z.number().optional(),
      kvalitet: z.lazy(() => geometriKvalitetSchema).optional(),
      datafangstdato: z.string().optional(),
      verifiseringsdato: z.string().optional(),
      oppdateringsdato: z.string().optional(),
      prosesshistorikk: z.string().optional(),
      kommune: z.number().optional(),
      medium: z.lazy(() => sosiMediumSchema).optional(),
      medium_nvdb: z.number().optional(),
      sosinavn: z.string().optional(),
      temakode: z.number().optional(),
      referansegeometri: z.boolean().optional(),
      lengde: z.number().optional(),
      høydereferanse: z.number().optional(),
    }),
  )

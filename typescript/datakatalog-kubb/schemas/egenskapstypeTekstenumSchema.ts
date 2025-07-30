import { egenskapstypeSchema } from './egenskapstypeSchema'
import { enumverdiTekstSchema } from './enumverdiTekstSchema'
import { z } from 'zod'

export const egenskapstypeTekstenumSchema = z
  .lazy(() => egenskapstypeSchema)
  .and(
    z.object({
      objektliste_dato: z.string().date().optional(),
      slutt_dato: z.string().date().optional(),
      lengdeavhengig_verdi: z.boolean().optional(),
      ajourhold_snu: z.boolean().optional(),
      standardverdi: z.string().optional(),
      feltlengde: z.number().int().optional(),
      'feltm\u00F8nster': z.string().optional(),
      tillatte_verdier: z.array(z.lazy(() => enumverdiTekstSchema)).optional(),
    }),
  )

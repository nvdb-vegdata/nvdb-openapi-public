import { egenskapstypeSchema } from './egenskapstypeSchema'
import { z } from 'zod'

export const egenskapstypeDatoSchema = z
  .lazy(() => egenskapstypeSchema)
  .and(
    z.object({
      objektliste_dato: z.string().date().optional(),
      slutt_dato: z.string().date().optional(),
      lengdeavhengig_verdi: z.boolean().optional(),
      ajourhold_snu: z.boolean().optional(),
      standardverdi: z.string().date().optional(),
      min_anbefalt: z.string().date().optional(),
      maks_anbefalt: z.string().date().optional(),
      'feltm\u00F8nster': z.string().optional(),
    }),
  )

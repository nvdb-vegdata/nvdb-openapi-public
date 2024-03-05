import { egenskapstypeSchema } from './egenskapstypeSchema'
import { z } from 'zod'

export const egenskapstypeDatoSchema = z
  .lazy(() => egenskapstypeSchema)
  .and(
    z.object({
      objektliste_dato: z.string().optional(),
      slutt_dato: z.string().optional(),
      lengdeavhengig_verdi: z.boolean().optional(),
      ajourhold_snu: z.boolean().optional(),
      standardverdi: z.string().optional(),
      min_anbefalt: z.string().optional(),
      maks_anbefalt: z.string().optional(),
      'feltm\u00F8nster': z.string().optional(),
    }),
  )

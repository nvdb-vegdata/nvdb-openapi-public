import { egenskapstypeSchema } from './egenskapstypeSchema'
import { z } from 'zod'

export const egenskapstypeKortdatoSchema = z
  .lazy(() => egenskapstypeSchema)
  .and(
    z.object({
      objektliste_dato: z.string().date().optional(),
      slutt_dato: z.string().date().optional(),
      lengdeavhengig_verdi: z.boolean().optional(),
      ajourhold_snu: z.boolean().optional(),
      standardverdi: z.number().int().optional(),
      min_anbefalt: z.number().int().optional(),
      maks_anbefalt: z.number().int().optional(),
      'feltm\u00F8nster': z.string().optional(),
    }),
  )

import { egenskapstypeSchema } from './egenskapstypeSchema'
import { enhetSchema } from './enhetSchema'
import { z } from 'zod'

export const egenskapstypeHeltallSchema = z
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
      min: z.number().int().optional(),
      maks: z.number().int().optional(),
      feltlengde: z.number().int().optional(),
      fortegnsendring_snu: z.boolean().optional(),
      enhet: z.lazy(() => enhetSchema).optional(),
    }),
  )

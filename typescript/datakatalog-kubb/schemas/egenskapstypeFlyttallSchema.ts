import { egenskapstypeSchema } from './egenskapstypeSchema'
import { enhetSchema } from './enhetSchema'
import { z } from 'zod'

export const egenskapstypeFlyttallSchema = z
  .lazy(() => egenskapstypeSchema)
  .and(
    z.object({
      objektliste_dato: z.string().date().optional(),
      slutt_dato: z.string().date().optional(),
      lengdeavhengig_verdi: z.boolean().optional(),
      ajourhold_snu: z.boolean().optional(),
      standardverdi: z.number().optional(),
      min_anbefalt: z.number().optional(),
      maks_anbefalt: z.number().optional(),
      min: z.number().optional(),
      maks: z.number().optional(),
      desimaler: z.number().int().optional(),
      feltlengde: z.number().int().optional(),
      fortegnsendring_snu: z.boolean().optional(),
      enhet: z.lazy(() => enhetSchema).optional(),
    }),
  )

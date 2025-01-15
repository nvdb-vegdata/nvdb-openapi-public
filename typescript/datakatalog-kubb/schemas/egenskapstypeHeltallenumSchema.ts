import { egenskapstypeSchema } from './egenskapstypeSchema'
import { enhetSchema } from './enhetSchema'
import { enumverdiHeltallSchema } from './enumverdiHeltallSchema'
import { z } from 'zod'

export const egenskapstypeHeltallenumSchema = z
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
      tillatte_verdier: z
        .array(z.lazy(() => enumverdiHeltallSchema))
        .optional(),
    }),
  )

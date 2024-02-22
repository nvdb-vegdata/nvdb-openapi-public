import { egenskapstypeSchema } from './egenskapstypeSchema'
import { enhetSchema } from './enhetSchema'
import { enumverdiHeltallSchema } from './enumverdiHeltallSchema'
import { z } from 'zod'

export const egenskapstypeHeltallenumSchema = z
  .lazy(() => egenskapstypeSchema)
  .and(
    z.object({
      objektliste_dato: z.string().optional(),
      slutt_dato: z.string().optional(),
      lengdeavhengig_verdi: z.boolean().optional(),
      ajourhold_snu: z.boolean().optional(),
      standardverdi: z.number().optional(),
      min_anbefalt: z.number().optional(),
      maks_anbefalt: z.number().optional(),
      min: z.number().optional(),
      maks: z.number().optional(),
      feltlengde: z.number().optional(),
      fortegnsendring_snu: z.boolean().optional(),
      enhet: z.lazy(() => enhetSchema).optional(),
      tillatte_verdier: z
        .array(z.lazy(() => enumverdiHeltallSchema))
        .optional(),
    }),
  )

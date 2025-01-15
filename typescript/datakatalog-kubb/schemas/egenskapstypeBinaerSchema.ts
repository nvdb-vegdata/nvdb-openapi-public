import { egenskapstypeSchema } from './egenskapstypeSchema'
import { z } from 'zod'

export const egenskapstypeBinaerSchema = z
  .lazy(() => egenskapstypeSchema)
  .and(
    z.object({
      objektliste_dato: z.string().date().optional(),
      slutt_dato: z.string().date().optional(),
      lengdeavhengig_verdi: z.boolean().optional(),
      ajourhold_snu: z.boolean().optional(),
      mediatype: z
        .enum(['Audio', 'Bilde', 'Tekst', 'TSF', 'Video', 'Udefinert'])
        .optional(),
    }),
  )

import { egenskapstypeSchema } from './egenskapstypeSchema'
import { z } from 'zod'

export const egenskapstypeAssosiasjonSchema = z
  .lazy(() => egenskapstypeSchema)
  .and(
    z.object({
      tilknytning: z.number().optional(),
      vegobjekttypeid: z.number().optional(),
      innenfor_mor: z.number().optional(),
      startdato: z.string().optional(),
      sluttdato: z.string().optional(),
      assosiasjonskrav: z.number().optional(),
      assosiasjonskravkommentar: z.string().optional(),
    }),
  )

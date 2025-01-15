import { egenskapstypeSchema } from './egenskapstypeSchema'
import { z } from 'zod'

export const egenskapstypeAssosiasjonSchema = z
  .lazy(() => egenskapstypeSchema)
  .and(
    z.object({
      tilknytning: z.number().int().optional(),
      vegobjekttypeid: z.number().int().optional(),
      innenfor_mor: z.number().int().optional(),
      startdato: z.string().date().optional(),
      sluttdato: z.string().date().optional(),
      assosiasjonskrav: z.number().int().optional(),
      assosiasjonskravkommentar: z.string().optional(),
    }),
  )

import { egenskapstypeSchema } from './egenskapstypeSchema'
import { z } from 'zod'

export const egenskapstypeStedfestingSchema = z
  .lazy(() => egenskapstypeSchema)
  .and(
    z.object({
      stedfestingstype: z.enum([`Punkt`, `Linje`, `Sving`]).optional(),
      geometritype: z.enum([`PUNKT`, `LINJE`, `SVING`]).optional(),
      overlapp_ok: z.boolean().optional(),
      kjørefelt_relevant: z.enum([`KAN`, `NEI`, `MÅ`]).optional(),
      sideposisjon_relevant: z.enum([`KAN`, `NEI`, `MÅ`]).optional(),
      innenfor_mor: z.boolean().optional(),
      vegnettsajourhold_splitt: z
        .enum([`IKKE_TATT_STILLING`, `KAN_IKKE_SPLITTES`, `KAN_SPLITTES`])
        .optional(),
      overlappsautomatikk: z.string().optional(),
      retning_relevant: z.boolean().optional(),
    }),
  )

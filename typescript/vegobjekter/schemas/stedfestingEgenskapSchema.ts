import { egenskapSchema } from './egenskapSchema'
import { z } from 'zod'

export const stedfestingEgenskapSchema = z
  .lazy(() => egenskapSchema)
  .and(
    z.object({
      veglenkesekvensid: z.number().optional(),
      nodeid: z.number().optional(),
      stedfestingstype: z.enum([`Punkt`, `Linje`, `Sving`]).optional(),
      retning: z.enum([`MED`, `MOT`]).optional(),
      sideposisjon: z
        .enum([
          `MH`,
          `MV`,
          `VT`,
          `M`,
          `H`,
          `HT`,
          `VH`,
          `HV`,
          `K`,
          `V`,
          `L`,
          `R`,
          `R0`,
        ])
        .optional(),
      kjørefelt: z.array(z.string()).optional(),
      relativPosisjon: z.number().optional(),
      startposisjon: z.number().optional(),
      sluttposisjon: z.number().optional(),
    }),
  )

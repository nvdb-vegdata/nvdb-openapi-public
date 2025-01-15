import { egenskapSchema } from './egenskapSchema'
import { stedfestingSchema } from './stedfestingSchema'
import { z } from 'zod'

export const stedfestingEgenskapSchema = z
  .lazy(() => egenskapSchema)
  .and(
    z.object({
      veglenkesekvensid: z.number().int().optional(),
      nodeid: z.number().int().optional(),
      stedfestingstype: z.enum(['Punkt', 'Linje', 'Sving']).optional(),
      retning: z.enum(['MED', 'MOT']).optional(),
      sideposisjon: z
        .enum([
          'MH',
          'MV',
          'VT',
          'M',
          'H',
          'HT',
          'VH',
          'HV',
          'K',
          'V',
          'L',
          'R',
          'R0',
        ])
        .optional(),
      'kj\u00F8refelt': z.array(z.string()).optional(),
      relativPosisjon: z.number().optional(),
      startposisjon: z.number().optional(),
      sluttposisjon: z.number().optional(),
      startpunkt: z.lazy(() => stedfestingSchema).optional(),
      sluttpunkt: z.lazy(() => stedfestingSchema).optional(),
    }),
  )

import { z } from 'zod'

export const stedfestingSchema = z.object({
  type: z.enum(['Punkt', 'Linje', 'Sving']),
  veglenkesekvensid: z.number().int().optional(),
  nodeid: z.number().int().optional(),
  relativPosisjon: z.number().optional(),
  startposisjon: z.number().optional(),
  sluttposisjon: z.number().optional(),
  startpunkt: z.lazy(() => stedfestingSchema).optional(),
  sluttpunkt: z.lazy(() => stedfestingSchema).optional(),
  retning: z.enum(['MED', 'MOT']).optional(),
  'kj\u00F8refelt': z.array(z.string()).optional(),
  kortform: z.string().optional(),
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
})

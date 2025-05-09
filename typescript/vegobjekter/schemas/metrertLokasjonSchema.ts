import { z } from 'zod'

export const metrertLokasjonSchema = z.object({
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
})

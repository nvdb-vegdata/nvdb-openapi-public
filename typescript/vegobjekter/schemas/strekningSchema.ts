import { z } from 'zod'

export const strekningSchema = z.object({
  strekning: z.number().int(),
  delstrekning: z.number().int(),
  arm: z.boolean(),
  'adskilte_l\u00F8p': z.enum(['Med', 'Mot', 'Nei']),
  trafikantgruppe: z.enum(['K', 'G']),
  retning: z.enum(['MED', 'MOT']),
  meter: z.number().optional(),
  fra_meter: z.number().optional(),
  til_meter: z.number().optional(),
  'adskilte_l\u00F8p_nummer': z.string().optional(),
})

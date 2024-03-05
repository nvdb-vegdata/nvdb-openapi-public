import { z } from 'zod'

export const strekningSchema = z.object({
  id: z.number(),
  versjon: z.number(),
  strekning: z.number(),
  delstrekning: z.number(),
  arm: z.boolean(),
  'adskilte_l\u00F8p': z.enum([`Med`, `Mot`, `Nei`]),
  trafikantgruppe: z.enum([`K`, `G`]),
  retning: z.enum([`MED`, `MOT`]),
  meter: z.number().optional(),
  fra_meter: z.number().optional(),
  til_meter: z.number().optional(),
})

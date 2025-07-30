import { adskilteLopSchema } from './adskilteLopSchema'
import { trafikantgruppeSchema } from './trafikantgruppeSchema'
import { retningSchema } from './retningSchema'
import { z } from 'zod'

export const strekningSchema = z.object({
  strekning: z.number().int(),
  delstrekning: z.number().int(),
  arm: z.boolean(),
  'adskilte_l\u00F8p': z.lazy(() => adskilteLopSchema),
  trafikantgruppe: z.lazy(() => trafikantgruppeSchema),
  retning: z.lazy(() => retningSchema),
  meter: z.number().optional(),
  fra_meter: z.number().optional(),
  til_meter: z.number().optional(),
  'adskilte_l\u00F8p_nummer': z.string().optional(),
})

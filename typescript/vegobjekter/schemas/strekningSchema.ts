import { adskilteLopSchema } from './adskilteLopSchema'
import { trafikantgruppeSchema } from './trafikantgruppeSchema'
import { retningSchema } from './retningSchema'
import { z } from 'zod'

export const strekningSchema = z.object({
  strekning: z.number(),
  delstrekning: z.number(),
  arm: z.boolean(),
  adskilte_løp: z.lazy(() => adskilteLopSchema),
  trafikantgruppe: z.lazy(() => trafikantgruppeSchema),
  retning: z.lazy(() => retningSchema),
  meter: z.number().optional(),
  fra_meter: z.number().optional(),
  til_meter: z.number().optional(),
  adskilte_løp_nummer: z.string().optional(),
})

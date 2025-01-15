import { assosiasjonstypeListeInnholdSchema } from './assosiasjonstypeListeInnholdSchema'
import { assosiasjonstypeVegobjekttypeSchema } from './assosiasjonstypeVegobjekttypeSchema'
import { z } from 'zod'

export const assosiasjonstypeSchema = z.object({
  id: z.number().int(),
  navn: z.string().optional(),
  egenskapstype: z.string(),
  maksimalt_antall_verdier: z.number().int().optional(),
  minimalt_antall_verdier: z.number().int().optional(),
  innhold: z.lazy(() => assosiasjonstypeListeInnholdSchema).optional(),
  type: z.lazy(() => assosiasjonstypeVegobjekttypeSchema).optional(),
})

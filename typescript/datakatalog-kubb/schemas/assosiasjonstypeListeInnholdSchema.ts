import { assosiasjonstypeVegobjekttypeSchema } from './assosiasjonstypeVegobjekttypeSchema'
import { z } from 'zod'

export const assosiasjonstypeListeInnholdSchema = z.object({
  innenfor_mor: z.enum([`NEI`, `JA`, `MED_AVVIK`]).optional(),
  relasjonstype: z
    .enum([`ASSOSIASJON`, `AGGREGERING`, `KOMPOSISJON`, `TOPOLOGI`])
    .optional(),
  id: z.number(),
  navn: z.string().optional(),
  egenskapstype: z.string(),
  type: z.lazy(() => assosiasjonstypeVegobjekttypeSchema),
})

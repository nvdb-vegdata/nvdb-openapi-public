import { z } from 'zod'

export const assosiasjonstypeVegobjekttypeSchema = z.object({
  id: z.number().int(),
  navn: z.string().optional(),
  objektliste_dato: z.string().date().optional(),
})

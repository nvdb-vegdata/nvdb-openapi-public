import { z } from 'zod'

export const assosiasjonstypeVegobjekttypeSchema = z.object({
  id: z.number(),
  navn: z.string().optional(),
  objektliste_dato: z.string().optional(),
})

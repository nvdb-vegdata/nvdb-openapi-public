import { z } from 'zod'

export const gateSchema = z.object({
  navn: z.string(),
  gatekode: z.number(),
  sideveg: z.boolean().optional(),
})

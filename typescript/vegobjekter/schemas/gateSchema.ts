import { z } from 'zod'

export const gateSchema = z.object({
  navn: z.string(),
  gatekode: z.number().int(),
  sideveg: z.boolean().optional(),
})

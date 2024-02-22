import { z } from 'zod'

export const geometrimalSchema = z.object({
  lengde: z.number().optional(),
  areal: z.number().optional(),
  egengeometri: z.boolean(),
})

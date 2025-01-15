import { z } from 'zod'

export const versjonSchema = z.object({
  id: z.number().int(),
  dato: z.string().date(),
  versjon: z.string(),
})

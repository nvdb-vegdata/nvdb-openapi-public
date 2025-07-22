import { z } from 'zod'

export const versjonSchema = z.object({
  id: z.number(),
  dato: z.string(),
  versjon: z.string(),
})

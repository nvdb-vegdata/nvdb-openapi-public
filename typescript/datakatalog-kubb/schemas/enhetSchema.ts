import { z } from 'zod'

export const enhetSchema = z.object({
  id: z.number(),
  navn: z.string().optional(),
  kortnavn: z.string().optional(),
})

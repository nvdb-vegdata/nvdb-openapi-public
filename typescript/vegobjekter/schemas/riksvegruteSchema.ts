import { z } from 'zod'

export const riksvegruteSchema = z.object({
  id: z.number(),
  nummer: z.string(),
  navn: z.string(),
  periode: z.string(),
})

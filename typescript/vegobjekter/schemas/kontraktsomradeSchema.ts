import { z } from 'zod'

export const kontraktsomradeSchema = z.object({
  id: z.number(),
  nummer: z.number().optional(),
  navn: z.string(),
})

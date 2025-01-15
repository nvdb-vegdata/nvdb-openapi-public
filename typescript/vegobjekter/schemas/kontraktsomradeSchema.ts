import { z } from 'zod'

export const kontraktsomradeSchema = z.object({
  id: z.number().int(),
  nummer: z.number().int().optional(),
  navn: z.string(),
})

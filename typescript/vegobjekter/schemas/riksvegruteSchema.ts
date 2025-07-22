import { z } from 'zod'

export const riksvegruteSchema = z.object({
  enumid: z.number(),
  riksvegrute: z.string(),
})

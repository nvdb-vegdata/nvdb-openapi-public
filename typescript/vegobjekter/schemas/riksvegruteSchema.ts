import { z } from 'zod'

export const riksvegruteSchema = z.object({
  enumid: z.number().int(),
  riksvegrute: z.string(),
})

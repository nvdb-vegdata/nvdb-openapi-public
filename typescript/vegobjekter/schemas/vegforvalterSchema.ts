import { z } from 'zod'

export const vegforvalterSchema = z.object({
  enumid: z.number(),
  vegforvalter: z.string(),
})

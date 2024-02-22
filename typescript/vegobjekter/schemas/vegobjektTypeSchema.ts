import { z } from 'zod'

export const vegobjektTypeSchema = z.object({
  id: z.number(),
  navn: z.string(),
})

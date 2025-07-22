import { z } from 'zod'

export const problemDetailSchema = z.object({
  type: z.string().optional(),
  title: z.string().optional(),
  status: z.number().optional(),
  detail: z.string().optional(),
  instance: z.string().optional(),
  properties: z.object({}).catchall(z.object({})).optional(),
})

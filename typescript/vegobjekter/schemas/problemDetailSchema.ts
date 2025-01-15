import { z } from 'zod'

export const problemDetailSchema = z.object({
  type: z.string().url().optional(),
  title: z.string().optional(),
  status: z.number().int().optional(),
  detail: z.string().optional(),
  instance: z.string().url().optional(),
  properties: z.object({}).catchall(z.object({})).optional(),
})

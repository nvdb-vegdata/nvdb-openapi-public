import { egenskapstypeSchema } from './egenskapstypeSchema'
import { z } from 'zod'

export const egenskapSchema = z.object({
  id: z.number(),
  navn: z.string(),
  egenskapstype: z.lazy(() => egenskapstypeSchema),
})

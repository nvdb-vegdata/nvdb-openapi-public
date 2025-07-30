import { egenskapstypeSchema } from './egenskapstypeSchema'
import { z } from 'zod'

export const egenskapSchema = z.object({
  id: z.number().int(),
  navn: z.string(),
  egenskapstype: z.lazy(() => egenskapstypeSchema),
})

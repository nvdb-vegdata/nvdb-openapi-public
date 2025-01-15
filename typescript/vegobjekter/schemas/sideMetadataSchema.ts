import { nesteSideSchema } from './nesteSideSchema'
import { z } from 'zod'

export const sideMetadataSchema = z.object({
  antall: z.number().int().optional(),
  returnert: z.number().int(),
  'sidest\u00F8rrelse': z.number().int(),
  neste: z.lazy(() => nesteSideSchema).optional(),
})

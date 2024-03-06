import { nesteSideSchema } from './nesteSideSchema'
import { z } from 'zod'

export const sideMetadataSchema = z.object({
  antall: z.number().optional(),
  returnert: z.number(),
  sidestørrelse: z.number(),
  neste: z.lazy(() => nesteSideSchema).optional(),
})

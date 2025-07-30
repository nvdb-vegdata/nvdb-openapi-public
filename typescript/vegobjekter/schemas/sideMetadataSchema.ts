import { nesteSideSchema } from './nesteSideSchema'
import { z } from 'zod'

export const sideMetadataSchema = z.object({
  antall: z
    .number()
    .int()
    .describe('Totalt antall treff. Kun tilstede dersom inkluderAntall=true')
    .optional(),
  returnert: z
    .number()
    .int()
    .describe('Antallet objekter som ble returnert i denne responsen'),
  'sidest\u00F8rrelse': z
    .number()
    .int()
    .describe('Maks antall objekter som blir returnert per side'),
  neste: z.lazy(() => nesteSideSchema).optional(),
})

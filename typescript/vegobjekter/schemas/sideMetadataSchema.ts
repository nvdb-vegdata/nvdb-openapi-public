import { nesteSideSchema } from './nesteSideSchema'
import { z } from 'zod'

export const sideMetadataSchema = z.object({
  antall: z
    .number()
    .describe(`Totalt antall treff. Kun tilstede dersom inkluderAntall=true`)
    .optional(),
  returnert: z
    .number()
    .describe(`Antallet objekter som ble returnert i denne responsen`),
  sidestørrelse: z
    .number()
    .describe(`Maks antall objekter som blir returnert per side`),
  neste: z.lazy(() => nesteSideSchema).optional(),
})

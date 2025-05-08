import { vegobjektTypeSchema } from './vegobjektTypeSchema'
import { z } from 'zod'

export const vegobjektMetadataSchema = z.object({
  type: z.lazy(() => vegobjektTypeSchema),
  versjon: z.number().int(),
  startdato: z.string().date(),
  sluttdato: z.string().date().optional(),
  sist_modifisert: z
    .string()
    .describe('Dato og tid i UTC-format: yyyy-MM-ddTHH:mm:ssZ'),
})

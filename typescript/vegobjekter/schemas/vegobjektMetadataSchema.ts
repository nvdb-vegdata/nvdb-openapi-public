import { vegobjektTypeSchema } from './vegobjektTypeSchema'
import { z } from 'zod'

export const vegobjektMetadataSchema = z.object({
  type: z.lazy(() => vegobjektTypeSchema),
  versjon: z.number(),
  startdato: z.string(),
  sluttdato: z.string().optional(),
  sist_modifisert: z
    .string()
    .describe(`Dato og tid uten tidssone på formatet yyyy-MM-ddTHH:mm:ss`),
})

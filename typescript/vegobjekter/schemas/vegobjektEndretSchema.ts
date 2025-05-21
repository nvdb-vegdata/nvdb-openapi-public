import { z } from 'zod'

export const vegobjektEndretSchema = z.object({
  id: z.number().int(),
  versjon: z.number().int(),
  type: z.number().int(),
  tidspunkt: z.string().datetime(),
  startdato: z.string().date(),
  sluttdato: z.string().date().optional(),
  egenskaperEndret: z.boolean(),
  barnEndret: z.boolean(),
  stedfestingEndret: z.boolean(),
  gyldighetsperiodeEndret: z.boolean(),
})

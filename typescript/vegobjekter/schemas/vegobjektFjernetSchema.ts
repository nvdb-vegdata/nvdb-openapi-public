import { z } from 'zod'

export const vegobjektFjernetSchema = z.object({
  id: z.number().int(),
  versjon: z.number().int(),
  type: z.number().int(),
  tidspunkt: z.string().datetime(),
})

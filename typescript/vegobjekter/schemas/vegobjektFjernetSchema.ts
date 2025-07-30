import { z } from 'zod'

export const vegobjektFjernetSchema = z.object({
  id: z.number().int(),
  versjon: z.number().int().describe('Versjon av vegobjektet som er fjernet'),
  type: z.number().int(),
  tidspunkt: z
    .string()
    .datetime()
    .describe('Tidspunktet da endringen ble gjort tilgjengelig i Les API V4'),
})

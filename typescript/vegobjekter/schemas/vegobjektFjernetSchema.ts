import { z } from 'zod'

export const vegobjektFjernetSchema = z.object({
  id: z.number(),
  versjon: z.number().describe(`Versjon av vegobjektet som er fjernet`),
  type: z.number(),
  tidspunkt: z
    .string()
    .datetime()
    .describe(`Tidspunktet da endringen ble gjort tilgjengelig i Les API V4`),
})

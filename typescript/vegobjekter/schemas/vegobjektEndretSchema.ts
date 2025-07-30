import { z } from 'zod'

export const vegobjektEndretSchema = z.object({
  id: z.number().int(),
  versjon: z
    .number()
    .int()
    .describe(
      'Versjon av vegobjektet som er endret. Dersom ny versjon er opprettet, vil dette v\u00E6re den nye versjonen',
    ),
  type: z.number().int(),
  tidspunkt: z
    .string()
    .datetime()
    .describe('Tidspunktet da endringen ble gjort tilgjengelig i Les API V4'),
  startdato: z.string().date(),
  sluttdato: z
    .string()
    .date()
    .describe('Utelatt dersom sluttdato ikke er satt')
    .optional(),
})

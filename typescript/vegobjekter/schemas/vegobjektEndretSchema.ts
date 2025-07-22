import { z } from 'zod'

export const vegobjektEndretSchema = z.object({
  id: z.number(),
  versjon: z
    .number()
    .describe(
      `Versjon av vegobjektet som er endret. Dersom ny versjon er opprettet, vil dette være den nye versjonen`,
    ),
  type: z.number(),
  tidspunkt: z
    .string()
    .datetime()
    .describe(`Tidspunktet da endringen ble gjort tilgjengelig i Les API V4`),
  startdato: z.string(),
  sluttdato: z
    .string()
    .describe(`Utelatt dersom sluttdato ikke er satt`)
    .optional(),
  egenskaperEndret: z
    .boolean()
    .describe(
      `Indikerer om egenskaper er endret/korrigert. Vil alltid være true dersom ny versjon av vegobjektet er opprettet`,
    ),
  barnEndret: z
    .boolean()
    .describe(
      `Indikerer om barn er endret/korrigert. Vil alltid være true dersom ny versjon av vegobjektet er opprettet`,
    ),
  stedfestingEndret: z
    .boolean()
    .describe(
      `Indikerer om stedfesting er endret/korrigert. Vil alltid være true dersom ny versjon av vegobjektet er opprettet`,
    ),
  gyldighetsperiodeEndret: z
    .boolean()
    .describe(
      `Indikerer om gyldighetsperioden er endret/korrigert. Vil alltid være true dersom ny versjon av vegobjektet er opprettet`,
    ),
})

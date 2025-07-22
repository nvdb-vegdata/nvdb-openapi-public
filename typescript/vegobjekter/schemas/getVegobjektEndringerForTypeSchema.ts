import { z } from 'zod'
import { problemDetailSchema } from './problemDetailSchema'
import { vegobjektEndringerSideSchema } from './vegobjektEndringerSideSchema'

export const getVegobjektEndringerForTypePathParamsSchema = z.object({
  vegobjekttypeId: z
    .number()
    .describe(
      `Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.  Eksempel: 581         `,
    ),
})
export const getVegobjektEndringerForTypeQueryParamsSchema = z
  .object({
    ider: z
      .array(z.number())
      .describe(
        `Hent endringer for oppgitte vegobjekt IDer. Dersom denne utelates vil alle endringer for den angitte typen hentes.`,
      )
      .optional(),
    start: z
      .string()
      .datetime()
      .describe(
        `Hent alle endringer etter gitt tidspunkt. Dersom denne utelates vil de eldste endringene hentes først.`,
      )
      .optional(),
    antall: z
      .number()
      .describe(
        `Antall endringer som skal være med i responsen. Merk at det faktiske antallet kan variere fra respons til respons. Dette er fordi endringer på samme vegobjektversjon innenfor samme side blir aggregert sammen ved å ta den nyeste endringen. Maksverdi: 1000`,
      )
      .optional(),
    historisk: z
      .boolean()
      .describe(
        `Bestem om du ønsker endringer for aktive eller historiske vegobjekter. Standardverdi: 'false'`,
      )
      .optional(),
  })
  .optional()

/**
 * @description Bad Request
 */
export const getVegobjektEndringerForType400Schema = z.lazy(
  () => problemDetailSchema,
)

/**
 * @description Unauthorized
 */
export const getVegobjektEndringerForType401Schema = z.lazy(
  () => problemDetailSchema,
)

/**
 * @description Forbidden
 */
export const getVegobjektEndringerForType403Schema = z.lazy(
  () => problemDetailSchema,
)

/**
 * @description Not Found
 */
export const getVegobjektEndringerForType404Schema = z.lazy(
  () => problemDetailSchema,
)

/**
 * @description Internal Server Error
 */
export const getVegobjektEndringerForType500Schema = z.lazy(
  () => problemDetailSchema,
)

/**
 * @description OK
 */
export const getVegobjektEndringerForTypeQueryResponseSchema = z.lazy(
  () => vegobjektEndringerSideSchema,
)

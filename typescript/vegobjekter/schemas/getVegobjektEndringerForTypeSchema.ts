import { z } from 'zod'
import { vegobjektEndringerSideSchema } from './vegobjektEndringerSideSchema'
import { problemDetailSchema } from './problemDetailSchema'

export const getVegobjektEndringerForTypePathParamsSchema = z.object({
  vegobjekttypeId: z
    .number()
    .int()
    .describe(
      'Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.\n\nEksempel: 581\n        ',
    ),
})

export const getVegobjektEndringerForTypeQueryParamsSchema = z
  .object({
    ider: z
      .array(z.number().int())
      .describe(
        'Hent endringer for oppgitte vegobjekt IDer. Dersom denne utelates vil alle endringer for den angitte typen hentes.',
      )
      .optional(),
    start: z
      .string()
      .datetime()
      .describe(
        'Hent alle endringer etter gitt tidspunkt. Dersom denne utelates vil de eldste endringene hentes f\u00F8rst.',
      )
      .optional(),
    antall: z
      .number()
      .int()
      .describe(
        'Antall endringer som skal v\u00E6re med i responsen. Merk at det faktiske antallet kan variere fra respons til respons. Dette er fordi endringer p\u00E5 samme vegobjektversjon innenfor samme side blir aggregert sammen ved \u00E5 ta den nyeste endringen. Maksverdi: 1000',
      )
      .optional(),
    historisk: z
      .boolean()
      .describe(
        'Bestem om du \u00F8nsker endringer for aktive eller historiske vegobjekter. Standardverdi: `false`',
      )
      .optional(),
  })
  .optional()
/**
 * @description OK
 */
export const getVegobjektEndringerForType200Schema = z.lazy(
  () => vegobjektEndringerSideSchema,
)
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

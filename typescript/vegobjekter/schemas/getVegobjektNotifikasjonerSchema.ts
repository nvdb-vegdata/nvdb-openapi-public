import { z } from 'zod'
import { vegobjektNotifikasjonerSideSchema } from './vegobjektNotifikasjonerSideSchema'
import { problemDetailSchema } from './problemDetailSchema'

export const getVegobjektNotifikasjonerPathParamsSchema = z.object({
  vegobjekttypeId: z
    .number()
    .int()
    .describe(
      'Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.\n\nEksempel: 581\n        ',
    ),
})

export const getVegobjektNotifikasjonerQueryParamsSchema = z
  .object({
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
export const getVegobjektNotifikasjoner200Schema = z.lazy(
  () => vegobjektNotifikasjonerSideSchema,
)
/**
 * @description Bad Request
 */
export const getVegobjektNotifikasjoner400Schema = z.lazy(
  () => problemDetailSchema,
)
/**
 * @description Unauthorized
 */
export const getVegobjektNotifikasjoner401Schema = z.lazy(
  () => problemDetailSchema,
)
/**
 * @description Forbidden
 */
export const getVegobjektNotifikasjoner403Schema = z.lazy(
  () => problemDetailSchema,
)
/**
 * @description Not Found
 */
export const getVegobjektNotifikasjoner404Schema = z.lazy(
  () => problemDetailSchema,
)
/**
 * @description Internal Server Error
 */
export const getVegobjektNotifikasjoner500Schema = z.lazy(
  () => problemDetailSchema,
)
/**
 * @description OK
 */
export const getVegobjektNotifikasjonerQueryResponseSchema = z.lazy(
  () => vegobjektNotifikasjonerSideSchema,
)

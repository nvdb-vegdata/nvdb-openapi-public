import { z } from 'zod'
import { inkluderIVegobjektSchema } from './inkluderIVegobjektSchema'
import { sridParameterSchema } from './sridParameterSchema'
import { inkluderGeometriSchema } from './inkluderGeometriSchema'
import { inkluderIEgenskaperSchema } from './inkluderIEgenskaperSchema'
import { vegobjektSchema } from './vegobjektSchema'
import { problemDetailSchema } from './problemDetailSchema'

export const getVegobjektByTypeIdAndVersjonPathParamsSchema = z.object({
  vegobjekttypeId: z
    .number()
    .int()
    .describe(
      'Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.\n\nEksempel: 581\n        ',
    ),
  vegobjektId: z.number().int(),
  versjon: z.number().int(),
})

export const getVegobjektByTypeIdAndVersjonQueryParamsSchema = z
  .object({
    inkluder: z
      .array(z.lazy(() => inkluderIVegobjektSchema))
      .describe(
        'Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID.',
      )
      .optional(),
    srid: z.lazy(() => sridParameterSchema).optional(),
    inkludergeometri: z.lazy(() => inkluderGeometriSchema).optional(),
    inkluder_egenskaper: z.lazy(() => inkluderIEgenskaperSchema).optional(),
    dybde: z
      .string()
      .describe(
        "Hvor mange niv\u00E5 barn skal inkluderes. 1 betyr bare IDer, 2-n betyr ett eller flere mellomniv\u00E5er, 'full' betyr alle niv\u00E5er.",
      )
      .optional(),
    geometritoleranse: z
      .number()
      .int()
      .describe(
        'Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.',
      )
      .optional(),
    tidspunkt: z
      .string()
      .date()
      .describe('Finner versjonen som var gyldig denne datoen.')
      .optional(),
  })
  .optional()
/**
 * @description OK
 */
export const getVegobjektByTypeIdAndVersjon200Schema = z.lazy(
  () => vegobjektSchema,
)
/**
 * @description Bad Request
 */
export const getVegobjektByTypeIdAndVersjon400Schema = z.lazy(
  () => problemDetailSchema,
)
/**
 * @description Unauthorized
 */
export const getVegobjektByTypeIdAndVersjon401Schema = z.lazy(
  () => problemDetailSchema,
)
/**
 * @description Forbidden
 */
export const getVegobjektByTypeIdAndVersjon403Schema = z.lazy(
  () => problemDetailSchema,
)
/**
 * @description Not Found
 */
export const getVegobjektByTypeIdAndVersjon404Schema = z.lazy(
  () => problemDetailSchema,
)
/**
 * @description Internal Server Error
 */
export const getVegobjektByTypeIdAndVersjon500Schema = z.lazy(
  () => problemDetailSchema,
)
/**
 * @description OK
 */
export const getVegobjektByTypeIdAndVersjonQueryResponseSchema = z.lazy(
  () => vegobjektSchema,
)

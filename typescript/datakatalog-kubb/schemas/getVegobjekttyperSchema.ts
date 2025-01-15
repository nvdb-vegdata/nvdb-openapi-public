import { z } from 'zod'
import { vegobjekttypeSchema } from './vegobjekttypeSchema'
import { problemDetailSchema } from './problemDetailSchema'

export const getVegobjekttyperQueryParamsSchema = z
  .object({
    inkluder: z
      .array(
        z.enum([
          'egenskapstyper',
          'relasjonstyper',
          'stedfesting',
          'alle',
          'minimum',
        ]),
      )
      .describe(
        'Kommaseparert liste med hvilke informasjonsfelter som skal inkluderes i tillegg til vegobjekttypenes metadata.',
      )
      .optional(),
    kategori: z
      .number()
      .int()
      .describe(
        'Begrens vegobjekttyper etter kategori. (/vegobjekttyper/kategorier)',
      )
      .optional(),
  })
  .optional()
/**
 * @description OK
 */
export const getVegobjekttyper200Schema = z.array(
  z.lazy(() => vegobjekttypeSchema),
)
/**
 * @description Not Found
 */
export const getVegobjekttyper404Schema = z.lazy(() => problemDetailSchema)
/**
 * @description Internal Server Error
 */
export const getVegobjekttyper500Schema = z.lazy(() => problemDetailSchema)
/**
 * @description Service Unavailable
 */
export const getVegobjekttyper503Schema = z.lazy(() => problemDetailSchema)
/**
 * @description OK
 */
export const getVegobjekttyperQueryResponseSchema = z.array(
  z.lazy(() => vegobjekttypeSchema),
)

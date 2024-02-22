import { z } from 'zod'
import { problemDetailSchema } from './problemDetailSchema'
import { vegobjekttypeSchema } from './vegobjekttypeSchema'

export const getVegobjekttypePathParamsSchema = z.object({
  vegobjekttypeid: z.number(),
})
export const getVegobjekttypeQueryParamsSchema = z
  .object({
    inkluder: z
      .array(
        z.enum([
          `egenskapstyper`,
          `relasjonstyper`,
          `stedfesting`,
          `alle`,
          `minimum`,
        ]),
      )
      .describe(
        `Kommaseparert liste med hvilke informasjonsfelter som skal inkluderes i tillegg til vegobjekttypenes metadata.`,
      )
      .optional(),
  })
  .optional()

/**
 * @description Not Found
 */
export const getVegobjekttype404Schema = z.lazy(() => problemDetailSchema)

/**
 * @description Internal Server Error
 */
export const getVegobjekttype500Schema = z.lazy(() => problemDetailSchema)

/**
 * @description Service Unavailable
 */
export const getVegobjekttype503Schema = z.lazy(() => problemDetailSchema)

/**
 * @description OK
 */
export const getVegobjekttypeQueryResponseSchema = z.lazy(
  () => vegobjekttypeSchema,
)

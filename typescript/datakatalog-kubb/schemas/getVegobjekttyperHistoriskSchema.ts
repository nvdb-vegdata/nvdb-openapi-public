import { z } from 'zod'
import { problemDetailSchema } from './problemDetailSchema'
import { vegobjekttypeSchema } from './vegobjekttypeSchema'

export const getVegobjekttyperHistoriskPathParamsSchema = z.object({
  versjon: z.string(),
})
export const getVegobjekttyperHistoriskQueryParamsSchema = z
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
    kategori: z
      .number()
      .describe(
        `Begrens vegobjekttyper etter kategori. (/vegobjekttyper/kategorier)`,
      )
      .optional(),
  })
  .optional()

/**
 * @description Not Found
 */
export const getVegobjekttyperHistorisk404Schema = z.lazy(
  () => problemDetailSchema,
)

/**
 * @description Internal Server Error
 */
export const getVegobjekttyperHistorisk500Schema = z.lazy(
  () => problemDetailSchema,
)

/**
 * @description Service Unavailable
 */
export const getVegobjekttyperHistorisk503Schema = z.lazy(
  () => problemDetailSchema,
)

/**
 * @description OK
 */
export const getVegobjekttyperHistoriskQueryResponseSchema = z.array(
  z.lazy(() => vegobjekttypeSchema),
)

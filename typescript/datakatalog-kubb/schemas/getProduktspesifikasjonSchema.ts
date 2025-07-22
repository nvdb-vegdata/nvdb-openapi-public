import { z } from 'zod'
import { problemDetailSchema } from './problemDetailSchema'
import { productSpecificationSchema } from './productSpecificationSchema'

export const getProduktspesifikasjonPathParamsSchema = z.object({
  vegobjekttypeid: z.number(),
})

/**
 * @description Not Found
 */
export const getProduktspesifikasjon404Schema = z.lazy(
  () => problemDetailSchema,
)

/**
 * @description Internal Server Error
 */
export const getProduktspesifikasjon500Schema = z.lazy(
  () => problemDetailSchema,
)

/**
 * @description Service Unavailable
 */
export const getProduktspesifikasjon503Schema = z.lazy(
  () => problemDetailSchema,
)

/**
 * @description OK
 */
export const getProduktspesifikasjonQueryResponseSchema = z.lazy(
  () => productSpecificationSchema,
)

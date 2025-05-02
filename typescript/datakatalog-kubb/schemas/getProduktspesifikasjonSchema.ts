import { z } from 'zod'
import { productSpecificationSchema } from './productSpecificationSchema'
import { problemDetailSchema } from './problemDetailSchema'

export const getProduktspesifikasjonPathParamsSchema = z.object({
  vegobjekttypeid: z.number().int(),
})
/**
 * @description OK
 */
export const getProduktspesifikasjon200Schema = z.lazy(
  () => productSpecificationSchema,
)
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

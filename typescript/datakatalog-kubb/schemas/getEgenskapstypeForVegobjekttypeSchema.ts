import { z } from 'zod'
import { egenskapstypeSchema } from './egenskapstypeSchema'
import { problemDetailSchema } from './problemDetailSchema'

export const getEgenskapstypeForVegobjekttypePathParamsSchema = z.object({
  vegobjekttypeid: z.number().int(),
  egenskapstypeid: z.number().int(),
})
/**
 * @description OK
 */
export const getEgenskapstypeForVegobjekttype200Schema = z.lazy(
  () => egenskapstypeSchema,
)
/**
 * @description Not Found
 */
export const getEgenskapstypeForVegobjekttype404Schema = z.lazy(
  () => problemDetailSchema,
)
/**
 * @description Internal Server Error
 */
export const getEgenskapstypeForVegobjekttype500Schema = z.lazy(
  () => problemDetailSchema,
)
/**
 * @description Service Unavailable
 */
export const getEgenskapstypeForVegobjekttype503Schema = z.lazy(
  () => problemDetailSchema,
)
/**
 * @description OK
 */
export const getEgenskapstypeForVegobjekttypeQueryResponseSchema = z.lazy(
  () => egenskapstypeSchema,
)

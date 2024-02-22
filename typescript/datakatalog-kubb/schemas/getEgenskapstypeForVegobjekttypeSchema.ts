import { z } from 'zod'
import { problemDetailSchema } from './problemDetailSchema'
import { egenskapstypeSchema } from './egenskapstypeSchema'

export const getEgenskapstypeForVegobjekttypePathParamsSchema = z.object({
  vegobjekttypeid: z.number(),
  egenskapstypeid: z.number(),
})

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

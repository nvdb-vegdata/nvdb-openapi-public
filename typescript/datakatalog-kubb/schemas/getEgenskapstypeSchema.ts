import { z } from 'zod'
import { problemDetailSchema } from './problemDetailSchema'
import { egenskapstypeSchema } from './egenskapstypeSchema'

export const getEgenskapstypePathParamsSchema = z.object({
  egenskapstypeid: z.number(),
})

/**
 * @description Not Found
 */
export const getEgenskapstype404Schema = z.lazy(() => problemDetailSchema)

/**
 * @description Internal Server Error
 */
export const getEgenskapstype500Schema = z.lazy(() => problemDetailSchema)

/**
 * @description Service Unavailable
 */
export const getEgenskapstype503Schema = z.lazy(() => problemDetailSchema)

/**
 * @description OK
 */
export const getEgenskapstypeQueryResponseSchema = z.lazy(
  () => egenskapstypeSchema,
)

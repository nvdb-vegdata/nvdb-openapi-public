import { z } from 'zod'
import { problemDetailSchema } from './problemDetailSchema'
import { egenskapstypeKategoriSchema } from './egenskapstypeKategoriSchema'

/**
 * @description Not Found
 */
export const getEgenskapstypeKategorier404Schema = z.lazy(
  () => problemDetailSchema,
)

/**
 * @description Internal Server Error
 */
export const getEgenskapstypeKategorier500Schema = z.lazy(
  () => problemDetailSchema,
)

/**
 * @description Service Unavailable
 */
export const getEgenskapstypeKategorier503Schema = z.lazy(
  () => problemDetailSchema,
)

/**
 * @description OK
 */
export const getEgenskapstypeKategorierQueryResponseSchema = z.array(
  z.lazy(() => egenskapstypeKategoriSchema),
)

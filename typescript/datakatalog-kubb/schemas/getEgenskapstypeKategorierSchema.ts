import { z } from 'zod'
import { egenskapstypeKategoriSchema } from './egenskapstypeKategoriSchema'
import { problemDetailSchema } from './problemDetailSchema'

/**
 * @description OK
 */
export const getEgenskapstypeKategorier200Schema = z.array(
  z.lazy(() => egenskapstypeKategoriSchema),
)

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

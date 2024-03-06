import { z } from 'zod'
import { problemDetailSchema } from './problemDetailSchema'
import { kategoriSchema } from './kategoriSchema'

/**
 * @description Not Found
 */
export const getKategorier404Schema = z.lazy(() => problemDetailSchema)

/**
 * @description Internal Server Error
 */
export const getKategorier500Schema = z.lazy(() => problemDetailSchema)

/**
 * @description Service Unavailable
 */
export const getKategorier503Schema = z.lazy(() => problemDetailSchema)

/**
 * @description OK
 */
export const getKategorierQueryResponseSchema = z.array(
  z.lazy(() => kategoriSchema),
)

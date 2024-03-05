import { z } from 'zod'
import { kategoriSchema } from './kategoriSchema'
import { problemDetailSchema } from './problemDetailSchema'

/**
 * @description OK
 */
export const getKategorier200Schema = z.array(z.lazy(() => kategoriSchema))

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

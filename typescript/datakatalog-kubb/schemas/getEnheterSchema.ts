import { z } from 'zod'
import { problemDetailSchema } from './problemDetailSchema'
import { enhetSchema } from './enhetSchema'

/**
 * @description Not Found
 */
export const getEnheter404Schema = z.lazy(() => problemDetailSchema)

/**
 * @description Internal Server Error
 */
export const getEnheter500Schema = z.lazy(() => problemDetailSchema)

/**
 * @description Service Unavailable
 */
export const getEnheter503Schema = z.lazy(() => problemDetailSchema)

/**
 * @description OK
 */
export const getEnheterQueryResponseSchema = z.array(z.lazy(() => enhetSchema))

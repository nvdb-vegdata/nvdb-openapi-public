import { z } from 'zod'
import { enhetSchema } from './enhetSchema'
import { problemDetailSchema } from './problemDetailSchema'

/**
 * @description OK
 */
export const getEnheter200Schema = z.array(z.lazy(() => enhetSchema))

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

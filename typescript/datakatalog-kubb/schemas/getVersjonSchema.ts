import { z } from 'zod'
import { versjonSchema } from './versjonSchema'
import { problemDetailSchema } from './problemDetailSchema'

/**
 * @description OK
 */
export const getVersjon200Schema = z.lazy(() => versjonSchema)

/**
 * @description Not Found
 */
export const getVersjon404Schema = z.lazy(() => problemDetailSchema)

/**
 * @description Internal Server Error
 */
export const getVersjon500Schema = z.lazy(() => problemDetailSchema)

/**
 * @description Service Unavailable
 */
export const getVersjon503Schema = z.lazy(() => problemDetailSchema)

/**
 * @description OK
 */
export const getVersjonQueryResponseSchema = z.lazy(() => versjonSchema)

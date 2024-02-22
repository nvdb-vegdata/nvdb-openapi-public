import { egenskapSchema } from './egenskapSchema'
import { z } from 'zod'

export const strukturEgenskapSchema = z.lazy(() => egenskapSchema)

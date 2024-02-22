import { egenskapSchema } from './egenskapSchema'
import { z } from 'zod'

export const listeEgenskapSchema = z.lazy(() => egenskapSchema)

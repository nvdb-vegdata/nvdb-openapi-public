import { egenskapSchema } from './egenskapSchema'
import { z } from 'zod'

export const datoEgenskapSchema = z
  .lazy(() => egenskapSchema)
  .and(z.object({ verdi: z.string().date().optional() }))

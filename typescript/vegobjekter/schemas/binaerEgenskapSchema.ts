import { egenskapSchema } from './egenskapSchema'
import { z } from 'zod'

export const binaerEgenskapSchema = z
  .lazy(() => egenskapSchema)
  .and(
    z.object({
      blob_id: z.number().optional(),
      blob_format: z.string().optional(),
      href: z.string().optional(),
    }),
  )

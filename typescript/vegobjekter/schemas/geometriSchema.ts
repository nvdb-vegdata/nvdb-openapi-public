import { z } from 'zod'

export const geometriSchema = z.object({
  wkt: z.string(),
  srid: z.enum([`5972`, `5973`, `5974`, `5975`, `4326`]),
  forenklet: z.boolean().optional(),
})

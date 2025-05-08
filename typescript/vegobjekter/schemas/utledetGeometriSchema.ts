import { z } from 'zod'

export const utledetGeometriSchema = z.object({
  wkt: z.string(),
  srid: z.enum(['5972', '5973', '5975', '4326']),
  egengeometri: z.boolean(),
  forenklet: z.boolean().optional(),
  lengde: z.number().optional(),
  areal: z.number().optional(),
})

import { sridSchema } from './sridSchema'
import { z } from 'zod'

export const utledetGeometriSchema = z.object({
  wkt: z.string(),
  srid: z.lazy(() => sridSchema),
  egengeometri: z
    .boolean()
    .describe(
      'Angir om geometrien er vegobjektets egengeometri, eller om geometrien er utledet fra vegnettes geometri',
    ),
  forenklet: z
    .boolean()
    .describe(
      'Indikerer at geometrien er forenklet. Kun inkludert om den er true',
    )
    .optional(),
  lengde: z
    .number()
    .describe('Utelatt hvis geometrien ikke er en linje')
    .optional(),
  areal: z
    .number()
    .describe('Utelatt hvis geometrien ikke er et polygon')
    .optional(),
})

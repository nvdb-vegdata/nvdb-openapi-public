import { sridSchema } from './sridSchema'
import { z } from 'zod'

export const geometriSchema = z.object({
  wkt: z.string(),
  srid: z.lazy(() => sridSchema),
  forenklet: z
    .boolean()
    .default('false')
    .describe(
      `Indikerer at geometrien er forenklet. Kun inkludert om den er true`,
    )
    .optional(),
  egengeometri: z
    .boolean()
    .describe(
      `Angir om geometrien er vegobjektets egengeometri, eller om geometrien er utledet fra vegnettes geometri`,
    )
    .optional(),
})

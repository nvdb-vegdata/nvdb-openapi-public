import { kontraktsomradeSchema } from './kontraktsomradeSchema'
import { riksvegruteSchema } from './riksvegruteSchema'
import { vegforvalterSchema } from './vegforvalterSchema'
import { adresseSchema } from './adresseSchema'
import { vegsystemreferanseSchema } from './vegsystemreferanseSchema'
import { stedfestingSchema } from './stedfestingSchema'
import { geometriSchema } from './geometriSchema'
import { z } from 'zod'

export const lokasjonSchema = z.object({
  kommuner: z.array(z.number().int()),
  fylker: z.array(z.number().int()),
  'kontraktsomr\u00E5der': z
    .array(z.lazy(() => kontraktsomradeSchema))
    .optional(),
  riksvegruter: z.array(z.lazy(() => riksvegruteSchema)).optional(),
  vegforvaltere: z.array(z.lazy(() => vegforvalterSchema)).optional(),
  adresser: z.array(z.lazy(() => adresseSchema)).optional(),
  vegsystemreferanser: z
    .array(z.lazy(() => vegsystemreferanseSchema))
    .optional(),
  stedfestinger: z.array(z.lazy(() => stedfestingSchema)).optional(),
  geometri: z.lazy(() => geometriSchema).optional(),
  lengde: z.number().optional(),
})

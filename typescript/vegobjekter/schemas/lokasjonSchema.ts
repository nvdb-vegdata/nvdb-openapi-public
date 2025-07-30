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
    .describe(
      'Utelatt om vegobjektet ikke overlapper med noen kontraktsomr\u00E5der',
    )
    .optional(),
  riksvegruter: z
    .array(z.lazy(() => riksvegruteSchema))
    .describe('Utelatt om vegobjektet ikke overlapper med noen riksvegruter')
    .optional(),
  vegforvaltere: z
    .array(z.lazy(() => vegforvalterSchema))
    .describe('Utelatt om vegobjektet ikke overlapper med noen vegforvaltere')
    .optional(),
  adresser: z
    .array(z.lazy(() => adresseSchema))
    .describe('Utelatt om vegobjektet ikke overlapper med noen adresser')
    .optional(),
  vegsystemreferanser: z
    .array(z.lazy(() => vegsystemreferanseSchema))
    .describe('Utelatt om vegobjektet ikke har noen vegsystemreferanser')
    .optional(),
  stedfestinger: z
    .array(z.lazy(() => stedfestingSchema))
    .describe('Utelatt om vegobjektet ikke har noen stedfestinger')
    .optional(),
  geometri: z.lazy(() => geometriSchema).optional(),
  lengde: z.number().describe('Utelatt om lengde er lik 0').optional(),
})

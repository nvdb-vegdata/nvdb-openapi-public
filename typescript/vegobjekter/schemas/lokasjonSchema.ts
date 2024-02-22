import { kontraktsomradeSchema } from './kontraktsomradeSchema'
import { riksvegruteSchema } from './riksvegruteSchema'
import { gateSchema } from './gateSchema'
import { vegsystemreferanseSchema } from './vegsystemreferanseSchema'
import { stedfestingSchema } from './stedfestingSchema'
import { geometriSchema } from './geometriSchema'
import { z } from 'zod'

export const lokasjonSchema = z.object({
  kommuner: z.array(z.number()),
  fylker: z.array(z.number()),
  kontraktsområder: z.array(z.lazy(() => kontraktsomradeSchema)),
  riksvegruter: z.array(z.lazy(() => riksvegruteSchema)),
  gater: z.array(z.lazy(() => gateSchema)),
  vegsystemreferanser: z.array(z.lazy(() => vegsystemreferanseSchema)),
  stedfestinger: z.array(z.lazy(() => stedfestingSchema)),
  geometri: z.lazy(() => geometriSchema).optional(),
  lengde: z.number().optional(),
})

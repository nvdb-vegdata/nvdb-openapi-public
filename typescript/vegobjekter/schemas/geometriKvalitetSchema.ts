import { z } from 'zod'

export const geometriKvalitetSchema = z.object({
  målemetode: z.number().optional(),
  datafangstmetode: z.string().optional(),
  nøyaktighet: z.number().optional(),
  synbarhet: z.number().optional(),
  målemetodeHøyde: z.number().optional(),
  datafangstmetodeHøyde: z.string().optional(),
  nøyaktighetHøyde: z.number().optional(),
  maksimaltAvvik: z.number().optional(),
})

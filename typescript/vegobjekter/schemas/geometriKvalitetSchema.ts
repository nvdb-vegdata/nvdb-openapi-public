import { z } from 'zod'

export const geometriKvalitetSchema = z.object({
  'm\u00E5lemetode': z.number().optional(),
  datafangstmetode: z.string().optional(),
  'n\u00F8yaktighet': z.number().optional(),
  synbarhet: z.number().optional(),
  'm\u00E5lemetodeH\u00F8yde': z.number().optional(),
  'datafangstmetodeH\u00F8yde': z.string().optional(),
  'n\u00F8yaktighetH\u00F8yde': z.number().optional(),
  maksimaltAvvik: z.number().optional(),
})

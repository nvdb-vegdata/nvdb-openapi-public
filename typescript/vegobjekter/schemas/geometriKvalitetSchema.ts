import { z } from 'zod'

export const geometriKvalitetSchema = z.object({
  'm\u00E5lemetode': z.number().int().optional(),
  datafangstmetode: z.string().optional(),
  'n\u00F8yaktighet': z.number().int().optional(),
  synbarhet: z.number().int().optional(),
  'm\u00E5lemetodeH\u00F8yde': z.number().int().optional(),
  'datafangstmetodeH\u00F8yde': z.string().optional(),
  'n\u00F8yaktighetH\u00F8yde': z.number().int().optional(),
  maksimaltAvvik: z.number().int().optional(),
})

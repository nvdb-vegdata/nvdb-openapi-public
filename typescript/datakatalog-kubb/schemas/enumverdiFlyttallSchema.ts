import { z } from 'zod'

export const enumverdiFlyttallSchema = z.object({
  id: z.number().int(),
  kortnavn: z.string().optional(),
  kortnavnlengde: z.number().int().optional(),
  kortnavn_brukbar: z.boolean(),
  beskrivelse: z.string().optional(),
  sorteringsnummer: z.number().int(),
  objektliste_dato: z.string().date().optional(),
  sluttdato: z.string().date().optional(),
  standardverdi: z.boolean(),
  'komplement\u00E6r_enumverdi': z.number().int().optional(),
  verdi: z.number().optional(),
  type: z.string(),
})

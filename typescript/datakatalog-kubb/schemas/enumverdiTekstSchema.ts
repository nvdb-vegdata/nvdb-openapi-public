import { z } from 'zod'

export const enumverdiTekstSchema = z.object({
  id: z.number(),
  kortnavn: z.string().optional(),
  kortnavnlengde: z.number().optional(),
  kortnavn_brukbar: z.boolean(),
  beskrivelse: z.string().optional(),
  sorteringsnummer: z.number(),
  objektliste_dato: z.string().optional(),
  sluttdato: z.string().optional(),
  standardverdi: z.boolean(),
  'komplement\u00E6r_enumverdi': z.number().optional(),
  verdi: z.string().optional(),
  type: z.string(),
})

import { z } from 'zod'

export const vegobjektKategoriSchema = z.object({
  id: z.number().int(),
  'prim\u00E6rkategori': z.boolean(),
  nummer: z.number().int(),
  navn: z.string().optional(),
  kortnavn: z.string().optional(),
  sorteringsnummer: z.number().int(),
  beskrivelse: z.string().optional(),
  startDato: z.string().date().optional(),
})

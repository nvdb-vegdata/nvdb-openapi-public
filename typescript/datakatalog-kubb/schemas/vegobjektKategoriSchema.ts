import { z } from 'zod'

export const vegobjektKategoriSchema = z.object({
  id: z.number(),
  primærkategori: z.boolean(),
  nummer: z.number(),
  navn: z.string().optional(),
  kortnavn: z.string().optional(),
  sorteringsnummer: z.number(),
  beskrivelse: z.string().optional(),
  startDato: z.string().optional(),
})

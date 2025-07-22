import { z } from 'zod'

export const egenskapstypeKategoriSchema = z.object({
  id: z.number(),
  navn: z.string().optional(),
  kortnavn: z.string().optional(),
  sorteringsnummer: z.number(),
  beskrivelse: z.string().optional(),
})

import { z } from 'zod'

export const egenskapstypeKategoriSchema = z.object({
  id: z.number().int(),
  navn: z.string().optional(),
  kortnavn: z.string().optional(),
  sorteringsnummer: z.number().int(),
  beskrivelse: z.string().optional(),
})

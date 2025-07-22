import { z } from 'zod'

export const adresseSchema = z.object({
  navn: z.string(),
  adressekode: z.number(),
})

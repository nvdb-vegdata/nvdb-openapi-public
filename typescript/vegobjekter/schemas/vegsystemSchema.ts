import { vegkategoriSchema } from './vegkategoriSchema'
import { vegfaseSchema } from './vegfaseSchema'
import { z } from 'zod'

export const vegsystemSchema = z.object({
  vegkategori: z.lazy(() => vegkategoriSchema),
  fase: z.lazy(() => vegfaseSchema),
  nummer: z.number().int().optional(),
})

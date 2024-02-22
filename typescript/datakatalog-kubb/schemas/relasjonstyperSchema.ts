import { assosiasjonstypeSchema } from './assosiasjonstypeSchema'
import { z } from 'zod'

export const relasjonstyperSchema = z.object({
  foreldre: z.array(z.lazy(() => assosiasjonstypeSchema)),
  barn: z.array(z.lazy(() => assosiasjonstypeSchema)),
})

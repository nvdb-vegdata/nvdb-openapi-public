import { vegsystemSchema } from './vegsystemSchema'
import { strekningSchema } from './strekningSchema'
import { kryssystemSchema } from './kryssystemSchema'
import { sideanleggSchema } from './sideanleggSchema'
import { z } from 'zod'

export const vegsystemreferanseSchema = z.object({
  vegsystem: z.lazy(() => vegsystemSchema).optional(),
  strekning: z.lazy(() => strekningSchema).optional(),
  kryssystem: z.lazy(() => kryssystemSchema).optional(),
  sideanlegg: z.lazy(() => sideanleggSchema).optional(),
  kortform: z.string().optional(),
})

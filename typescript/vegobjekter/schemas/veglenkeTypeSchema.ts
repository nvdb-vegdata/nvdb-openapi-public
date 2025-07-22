import { z } from 'zod'

export const veglenkeTypeSchema = z.enum([
  `Ukjent`,
  `DETALJERT`,
  `KONNEKTERING`,
  `DETALJERT_KONNEKTERING`,
  `HOVED`,
])

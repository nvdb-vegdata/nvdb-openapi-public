import { z } from 'zod'

export const veglenkeTypeParameterSchema = z.enum([
  `ukjent`,
  `detaljert`,
  `konnektering`,
  `detaljert_konnektering`,
  `hoved`,
])

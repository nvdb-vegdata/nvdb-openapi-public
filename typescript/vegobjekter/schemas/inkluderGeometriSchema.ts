import { z } from 'zod'

export const inkluderGeometriSchema = z.enum([
  'ingen',
  'egenskap',
  'lokasjon',
  'utledet',
])

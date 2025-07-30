import { z } from 'zod'

export const sideposisjonSchema = z.enum([
  'MH',
  'MV',
  'VT',
  'M',
  'H',
  'HT',
  'VH',
  'HV',
  'K',
  'V',
  'L',
  'R',
  'R0',
])

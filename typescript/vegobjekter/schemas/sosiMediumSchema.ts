import { z } from 'zod'

export const sosiMediumSchema = z.enum([
  'T',
  'B',
  'L',
  'U',
  'S',
  'O',
  'V',
  'D',
  'I',
  'W',
  'J',
  'X',
  'IKKE_REGISTRERT',
])

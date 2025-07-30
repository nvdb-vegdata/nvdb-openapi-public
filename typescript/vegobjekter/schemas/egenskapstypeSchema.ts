import { z } from 'zod'

export const egenskapstypeSchema = z.enum([
  'Boolsk',
  'Bin\u00E6r',
  'Tekst',
  'Dato',
  'Flyttall',
  'Heltall',
  'Struktur',
  'Geometri',
  'Kortdato',
  'Tid',
  'Liste',
  'Tekstenum',
  'Heltallenum',
  'Flyttallenum',
])

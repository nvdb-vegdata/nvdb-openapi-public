import { z } from 'zod'

export const egenskapstypeEnumSchema = z.enum([
  'Assosiasjon',
  'Boolsk',
  'Bin\u00E6r',
  'Tekst',
  'Dato',
  'Flyttall',
  'Heltall',
  'Struktur',
  'Geometri',
  'Stedfesting',
  'Kortdato',
  'Tid',
  'Liste',
  'Tekstenum',
  'Heltallenum',
  'Flyttallenum',
])

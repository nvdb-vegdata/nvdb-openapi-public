import { z } from 'zod'

export const egenskapSchema = z.object({
  id: z.number().int(),
  navn: z.string(),
  egenskapstype: z.enum([
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
  ]),
})

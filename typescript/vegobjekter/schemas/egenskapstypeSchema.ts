import { z } from 'zod'

export const egenskapstypeSchema = z.enum([
  `Boolsk`,
  `Binær`,
  `Tekst`,
  `Dato`,
  `Flyttall`,
  `Heltall`,
  `Struktur`,
  `Geometri`,
  `Kortdato`,
  `Tid`,
  `Liste`,
  `Tekstenum`,
  `Heltallenum`,
  `Flyttallenum`,
])

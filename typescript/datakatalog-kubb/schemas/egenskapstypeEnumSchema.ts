import { z } from 'zod'

export const egenskapstypeEnumSchema = z.enum([
  `Assosiasjon`,
  `Boolsk`,
  `Binær`,
  `Tekst`,
  `Dato`,
  `Flyttall`,
  `Heltall`,
  `Struktur`,
  `Geometri`,
  `Stedfesting`,
  `Kortdato`,
  `Tid`,
  `Liste`,
  `Tekstenum`,
  `Heltallenum`,
  `Flyttallenum`,
])

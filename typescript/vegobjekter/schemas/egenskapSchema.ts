import { z } from 'zod'

export const egenskapSchema = z.object({
  id: z.number(),
  navn: z.string(),
  egenskapstype: z.enum([
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
  ]),
})

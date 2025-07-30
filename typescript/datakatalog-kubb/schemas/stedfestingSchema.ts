import { egenskapstypeEnumSchema } from './egenskapstypeEnumSchema'
import { viktighetSchema } from './viktighetSchema'
import { z } from 'zod'

export const stedfestingSchema = z.object({
  id: z.number().int(),
  navn: z.string().optional(),
  egenskapstype: z.lazy(() => egenskapstypeEnumSchema),
  kortnavn: z.string().optional(),
  beskrivelse: z.string().optional(),
  veiledning: z.string().optional(),
  sosinavn: z.string().optional(),
  sosinvdbnavn: z.string().optional(),
  sorteringsnummer: z.number().int(),
  avledet: z.boolean(),
  'komplement\u00E6r_egenskapstype': z.number().int().optional(),
  skrivebeskyttet: z.boolean(),
  obligatorisk_verdi: z.boolean(),
  sensitivitet: z.number().int(),
  gruppesorteringsnummer: z.number().int().optional(),
  grunnrissreferanse: z.string().optional(),
  'h\u00F8ydereferanse': z.string().optional(),
  'h\u00F8ydereferanse_tall': z.number().int(),
  'n\u00F8yaktighetskrav_grunnriss': z.number(),
  'n\u00F8yaktighetskrav_h\u00F8yde': z.number(),
  sosi_referanse: z.string().optional(),
  referansegeometri_tilstrekkelig: z.boolean(),
  viktighet: z.lazy(() => viktighetSchema),
  kategori: z.number().int(),
})

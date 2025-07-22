import { egenskapstypeEnumSchema } from './egenskapstypeEnumSchema'
import { viktighetSchema } from './viktighetSchema'
import { z } from 'zod'

export const egenskapstypeSchema = z.object({
  id: z.number(),
  navn: z.string().optional(),
  egenskapstype: z.lazy(() => egenskapstypeEnumSchema),
  komplementær_egenskapstype: z.number().optional(),
  kortnavn: z.string().optional(),
  beskrivelse: z.string().optional(),
  veiledning: z.string().optional(),
  sosinavn: z.string().optional(),
  sosinvdbnavn: z.string().optional(),
  sorteringsnummer: z.number(),
  avledet: z.boolean(),
  obligatorisk_verdi: z.boolean(),
  skrivebeskyttet: z.boolean(),
  sensitivitet: z.number(),
  gruppesorteringsnummer: z.number().optional(),
  grunnrissreferanse: z.string().optional(),
  høydereferanse: z.string().optional(),
  høydereferanse_tall: z.number(),
  nøyaktighetskrav_grunnriss: z.number(),
  nøyaktighetskrav_høyde: z.number(),
  sosi_referanse: z.string().optional(),
  referansegeometri_tilstrekkelig: z.boolean(),
  viktighet: z.lazy(() => viktighetSchema),
  kategori: z.number(),
  tilleggskrav: z.array(z.string()).optional(),
})

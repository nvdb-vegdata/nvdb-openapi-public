import { stedfestingSchema } from './stedfestingSchema'
import { vegobjektKategoriSchema } from './vegobjektKategoriSchema'
import { egenskapstypeSchema } from './egenskapstypeSchema'
import { relasjonstyperSchema } from './relasjonstyperSchema'
import { z } from 'zod'

export const vegobjekttypeSchema = z.object({
  id: z.number(),
  navn: z.string().optional(),
  kortnavn: z.string().optional(),
  beskrivelse: z.string().optional(),
  objektliste_dato: z.string().optional(),
  veiledning: z.string().optional(),
  stedfesting: z.lazy(() => stedfestingSchema).optional(),
  sosinavn: z.string().optional(),
  sosinvdbnavn: z.string().optional(),
  sorteringsnummer: z.number(),
  status: z.string().optional(),
  hovedkategori: z.string().optional(),
  tidsrom_relevant: z.boolean(),
  konnekteringslenke_ok: z.boolean().optional(),
  abstrakt_type: z.boolean(),
  avledet: z.boolean(),
  må_ha_mor: z.boolean(),
  er_dataserie: z.boolean(),
  en_versjon: z.boolean(),
  tilleggsinformasjon: z.string().optional(),
  kategorier: z.array(z.lazy(() => vegobjektKategoriSchema)),
  egenskapstyper: z.array(z.lazy(() => egenskapstypeSchema)).optional(),
  relasjonstyper: z.lazy(() => relasjonstyperSchema).optional(),
  sensitiv: z.boolean(),
})

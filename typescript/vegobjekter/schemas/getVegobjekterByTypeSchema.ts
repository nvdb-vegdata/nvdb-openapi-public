import { z } from 'zod'
import { inkluderIVegobjektSchema } from './inkluderIVegobjektSchema'
import { sridParameterSchema } from './sridParameterSchema'
import { inkluderGeometriSchema } from './inkluderGeometriSchema'
import { inkluderIEgenskaperSchema } from './inkluderIEgenskaperSchema'
import { typeVegSosiSchema } from './typeVegSosiSchema'
import { adskilteLopSchema } from './adskilteLopSchema'
import { trafikantgruppeSchema } from './trafikantgruppeSchema'
import { veglenkeTypeParameterSchema } from './veglenkeTypeParameterSchema'
import { detaljnivaParameterSchema } from './detaljnivaParameterSchema'
import { vegobjekterSideSchema } from './vegobjekterSideSchema'
import { problemDetailSchema } from './problemDetailSchema'

export const getVegobjekterByTypePathParamsSchema = z.object({
  vegobjekttypeId: z
    .number()
    .int()
    .describe(
      'Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.\n\nEksempel: 581\n        ',
    ),
})

export const getVegobjekterByTypeQueryParamsSchema = z
  .object({
    ider: z
      .array(z.number().int())
      .min(1)
      .max(2147483647)
      .describe('Kommaseparert liste med vegobjekt-IDer.')
      .optional(),
    inkluder: z
      .array(z.lazy(() => inkluderIVegobjektSchema))
      .describe(
        'Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID.',
      )
      .optional(),
    srid: z.lazy(() => sridParameterSchema).optional(),
    inkludergeometri: z.lazy(() => inkluderGeometriSchema).optional(),
    inkluder_egenskaper: z.lazy(() => inkluderIEgenskaperSchema).optional(),
    segmentering: z
      .boolean()
      .describe(
        'Angir om strekningsobjekter skal segmenteres etter s\u00F8keomr\u00E5det (fylke, kommune, vegsystemreferanse, kontraktsomr\u00E5de, riksvegrute, vegforvalter).\n\nDefault: `false`',
      )
      .optional(),
    fylke: z
      .array(z.number().int())
      .describe(
        'Filtrer p\u00E5 fylke. Kommaseparert liste. Se /omrader/fylker for mulige verdier.\n\nEksempel: `50`',
      )
      .optional(),
    kommune: z
      .array(z.number().int())
      .describe(
        'Filtrer p\u00E5 kommune. Kommaseparert liste. Se /omrader/kommuner for mulige verdier.\n\nEksempel: `5001`',
      )
      .optional(),
    kontraktsomrade: z
      .array(z.string())
      .describe(
        'Filtrer p\u00E5 kontraktsomrade. Kommaseparert liste. Se /omrader/kontraktsomrader for mulige verdier.\nDet er mulig \u00E5 bruke ID-en for kontraktsomr\u00E5det istedenfor det fulle navnet.\n\nEksempel: `9503 Midtre H\u00E5logaland 2021-2026`',
      )
      .optional(),
    riksvegrute: z
      .array(z.string())
      .describe(
        'Filtrer p\u00E5 riksvegrute. Kommaseparert liste. Se /omrader/riksvegruter for mulige verdier.\n\nEksempel: `RUTE4A` eller som enumid `20290`',
      )
      .optional(),
    vegforvalter: z
      .array(z.string())
      .describe(
        'Filtrer p\u00E5 vegforvalter. Kommaseparert liste. Se [/omrader/api/v4/vegforvaltere](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der#/Omr%C3%A5der/getVegforvaltere) for mulige verdier.\n\nEksempel: `M\u00F8re og Romsdal fylkeskommune` eller som enumid `21774`',
      )
      .optional(),
    vegsystemreferanse: z
      .array(z.string())
      .describe(
        'Filtrer vegobjekter p\u00E5 [vegsystemreferanse](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for \u00E5 filtrere p\u00E5 omr\u00E5de.\n\nEksempel: `EV6S1D1 m12`',
      )
      .optional(),
    kartutsnitt: z
      .string()
      .describe(
        'Filtrer vegobjekter med kartutsnitt i det gjeldende geografiske referansesystemet (`srid`-paramteret). Formatet er `minX, minY, maxX, maxY`. Merk at vegobjektets bounding box benyttes for sammenligning, som kan medf\u00F8re at vegobjekter som er utenfor kartutsnittet ogs\u00E5 returneres. For \u00E5 unng\u00E5 dette, kan du bruke `polygon` i stedet.\n\nEksempel: `265273, 7019372, 346553, 7061071`',
      )
      .optional(),
    polygon: z
      .string()
      .describe(
        'Filtrer vegobjekter med polygon i det gjeldende geografiske referansesystemet (`srid`-paramteret).\n\nEksempel: `20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000`',
      )
      .optional(),
    typeveg: z
      .array(z.lazy(() => typeVegSosiSchema))
      .describe(
        'Filtrer Relasjonstype.vegobjekter p\u00E5 type veg p\u00E5 vegnettet objektet er stedfestet p\u00E5. Kommaseparert liste.\n\nEksempel: `kanalisertVeg, enkelBilveg, rampe, rundkj\u00F8ring, bilferje, passasjerferje, gangOgSykkelveg, sykkelveg, gangveg, g\u00E5gate, fortau, trapp, gangfelt, gatetun, traktorveg, sti, annet`',
      )
      .optional(),
    adskiltelop: z
      .array(z.lazy(() => adskilteLopSchema))
      .describe(
        'Filtrer vegobjekter p\u00E5 om de er stedfestet hvor det er en Strekning med verdi satt for \u00ABadskilte l\u00F8p\u00BB.',
      )
      .optional(),
    kryssystem: z
      .boolean()
      .describe(
        'Filtrer vegobjekter p\u00E5 om de er stedfestet p\u00E5 samme sted hvor det er et Kryssystem.',
      )
      .optional(),
    sideanlegg: z
      .boolean()
      .describe(
        'Filtrer vegobjekter p\u00E5 om de er stedfestet p\u00E5 samme sted hvor det er et Sideanlegg.',
      )
      .optional(),
    trafikantgruppe: z.lazy(() => trafikantgruppeSchema).optional(),
    antall: z
      .number()
      .int()
      .describe(
        'Angir hvor mange objekter som skal returneres. \u00D8vre grense er avhengig av st\u00F8rrelse p\u00E5 respons, og vil kunne variere fra endepunkt til endepunkt. Dersom det angis en verdi for antall som overskrider maksimum, vil maksimumsverdi benyttes. Se ogs\u00E5 `sidest\u00F8rrelse` i responsens `metadata`-objekt.',
      )
      .optional(),
    start: z
      .string()
      .describe(
        'Angir offset for hvilke objekter som skal returneres. Denne f\u00E5r man i metadata-feltet i responsen.',
      )
      .optional(),
    geometritoleranse: z
      .number()
      .int()
      .describe(
        'Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.',
      )
      .optional(),
    tidspunkt: z
      .string()
      .date()
      .describe('Finner versjonen som var gyldig denne datoen.')
      .optional(),
    alle_versjoner: z
      .boolean()
      .describe(
        'Returner alle versjoner som matcher de oppgitte parametrene. Dersom ikke satt eller `false` vil kun objekter uten sluttdato returneres.',
      )
      .optional(),
    inkluderAntall: z
      .boolean()
      .describe(
        'Hvorvidt totalt antall objekter skal returneres i responsen. Default er `false`.',
      )
      .optional(),
    veglenkesekvens: z
      .array(z.string())
      .describe(
        'Filtrer vegobjekter p\u00E5 om de er stedfestet p\u00E5 gjeldende veglenkesekvenser. Kommaseparert liste.\n\nEksempel: `0.37@319531,0.83-0.97@41640`',
      )
      .optional(),
    egenskap: z
      .array(z.string())
      .describe(
        'Filtrer vegobjekter p\u00E5 egenskaper, relasjoner og overlapp. Husk URL encoding hvis verdien inneholder likhetstegn. Se [dokumentasjon](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Avanserte_filter)',
      )
      .optional(),
    overlapp: z
      .array(z.string())
      .describe(
        'Filtrer vegobjekter p\u00E5 overlapp. Husk URL encoding hvis verdien inneholder likhetstegn. Se [dokumentasjon](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Avanserte_filter)',
      )
      .optional(),
    veglenketype: z
      .array(z.lazy(() => veglenkeTypeParameterSchema))
      .describe(
        'Filtrer vegobjekter p\u00E5 veglenketype p\u00E5 vegnettet objektet er stedfestet. Kommaseparert liste.',
      )
      .optional(),
    detaljniva: z
      .array(z.lazy(() => detaljnivaParameterSchema))
      .describe(
        'Filtrer vegobjekter p\u00E5 detaljniv\u00E5 p\u00E5 vegnettet objektet er stedfestet p\u00E5 (kortnavn fra datakatalogen).',
      )
      .optional(),
    endret_etter: z
      .string()
      .datetime()
      .describe(
        'Hente endringer siden et tidspunkt. Tidspunkt skal f\u00F8lge ISO 8601 med tidssone eller som UTC. Eksempler: `2024-12-02T10:15:30.123+01:00`, `2024-12-02T09:15:30.123Z`',
      )
      .optional(),
  })
  .optional()
/**
 * @description OK
 */
export const getVegobjekterByType200Schema = z.lazy(() => vegobjekterSideSchema)
/**
 * @description Bad Request
 */
export const getVegobjekterByType400Schema = z.lazy(() => problemDetailSchema)
/**
 * @description Unauthorized
 */
export const getVegobjekterByType401Schema = z.lazy(() => problemDetailSchema)
/**
 * @description Forbidden
 */
export const getVegobjekterByType403Schema = z.lazy(() => problemDetailSchema)
/**
 * @description Not Found
 */
export const getVegobjekterByType404Schema = z.lazy(() => problemDetailSchema)
/**
 * @description Internal Server Error
 */
export const getVegobjekterByType500Schema = z.lazy(() => problemDetailSchema)
/**
 * @description OK
 */
export const getVegobjekterByTypeQueryResponseSchema = z.lazy(
  () => vegobjekterSideSchema,
)

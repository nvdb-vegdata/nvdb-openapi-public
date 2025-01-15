import { z } from 'zod'
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
      .array(
        z.enum([
          'metadata',
          'egenskaper',
          'relasjoner',
          'lokasjon',
          'vegsegmenter',
          'geometri',
          'alle',
          'minimum',
        ]),
      )
      .describe(
        'Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID.',
      )
      .optional(),
    srid: z
      .enum([
        '5972',
        '5973',
        '5975',
        '4326',
        'UTM32',
        'UTM33',
        'UTM35',
        'WGS84',
      ])
      .describe(
        "Angir hvilket geografisk referansesystem som benyttes for geografisk s\u00F8k, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: <a href='https://epsg.io/5972'>EPSG:5972</a> <a href='https://epsg.io/5973'>EPSG:5973</a> <a href='https://epsg.io/5975'>EPSG:5975</a> <a href='https://epsg.io/4326'>EPSG:4326</a>.",
      )
      .optional(),
    inkludergeometri: z
      .enum(['ingen', 'egenskaper', 'lokasjon', 'utledet'])
      .describe(
        'Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under `vegobjekt.egenskaper` om den finnes, stedfestet geometri er plassert under `vegobjekt.lokasjon`. I tillegg til de nevnte feltene p\u00E5 vegobjekt-responsen returneres ogs\u00E5 `vegobjekt.geometri` (dersom man har `inkluder=geometri` eller `alle`), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved \u00E5 se p\u00E5 `vegobjekt.geometri.egengeometri`.',
      )
      .optional(),
    inkluder_egenskaper: z
      .enum(['basis', 'assosiasjon', 'stedfesting', 'geometri', 'alle'])
      .describe(
        'Gir mulighet til \u00E5 filtrere hvilke egenskaper som skal returneres med inkluder=egenskaper. `basis` er alle egenskaper som ikke er assosiasjoner, stedfesting, geometri, eller lister av disse.',
      )
      .optional(),
    segmentering: z
      .boolean()
      .describe(
        'Angir om strekningsobjekter skal segmenteres etter s\u00F8keomr\u00E5det (fylke, kommune, vegsystemreferanse, kontraktsomr\u00E5de, riksvegrute).\n\nDefault: `true`',
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
        'Filtrer p\u00E5 kontraktsomrade. Kommaseparert liste. Se /omrader/kontraktsomrader for mulige verdier.\n\nEksempel: `1539 Tunnel- og bergsikr 2018-2023 Nordm og Romsd`',
      )
      .optional(),
    riksvegrute: z
      .array(z.string())
      .describe(
        'Filtrer p\u00E5 riksvegrute. Kommaseparert liste. Se /omrader/riksvegruter for mulige verdier.\n\nEksempel: `RUTE4A` eller som enumid `20290`',
      )
      .optional(),
    vegsystemreferanse: z
      .array(z.string())
      .describe(
        'Filtrer vegobjekter p\u00E5 [vegsystemreferanse](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for \u00E5 filtrere p\u00E5 omr\u00E5de.\n\nEksempel: `EV6S1D1 m12`',
      )
      .optional(),
    kartutsnitt: z
      .string()
      .describe(
        'Filtrer vegobjekter med kartutsnitt i det gjeldende geografiske referansesystemet (`srid`-paramteret). Formatet er `minX, minY, maxX, maxY`.\n\nEksempel: `265273, 7019372, 346553, 7061071`',
      )
      .optional(),
    polygon: z
      .string()
      .describe(
        'Filtrer vegobjekter med polygon i det gjeldende geografiske referansesystemet (`srid`-paramteret).\n\nEksempel: `20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000`',
      )
      .optional(),
    typeveg: z
      .array(
        z.enum([
          'kanalisertVeg',
          'enkelBilveg',
          'rampe',
          'rundkj\u00F8ring',
          'bilferje',
          'passasjerferje',
          'gangOgSykkelveg',
          'sykkelveg',
          'gangveg',
          'g\u00E5gate',
          'fortau',
          'trapp',
          'gangfelt',
          'gatetun',
          'traktorveg',
          'sti',
          'annet',
        ]),
      )
      .describe(
        'Filtrer vegobjekter p\u00E5 type veg p\u00E5 vegnettet objektet er stedfestet p\u00E5. Kommaseparert liste.\n\nEksempel: `kanalisertVeg, enkelBilveg, rampe, rundkj\u00F8ring, bilferje, passasjerferje, gangOgSykkelveg, sykkelveg, gangveg, g\u00E5gate, fortau, trapp, gangfelt, gatetun, traktorveg, sti, annet`',
      )
      .optional(),
    overlappendeVegobjektIder: z
      .array(z.number().int())
      .describe(
        'Filtrer vegobjekter p\u00E5 om de har geometri som overlapper med vegobjekt med gitt id. Hvis flere vegobjekt-ider spesifiseres vil vegobjekter som overlapper med minst \u00E9n av de bli returnert.',
      )
      .optional(),
    adskiltelop: z
      .array(z.enum(['Med', 'Mot', 'Nei']))
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
    trafikantgruppe: z
      .enum(['K', 'G'])
      .describe('Filtrer vegobjekter p\u00E5 trafikantgruppe.')
      .optional(),
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
    sortert: z
      .boolean()
      .describe(
        'Hvorvidt resultatet skal sorteres p\u00E5 ID. Default er `true`. B\u00F8r v\u00E6re satt for paginering for \u00E5 sikre deterministisk resultat, men kan sl\u00E5s av for \u00E5 forbedre ytelse. Satt `false` som standard for s\u00F8k med kartutsnitt eller polygon.',
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
        'Filtrer vegobjekter p\u00E5 egenskaper, relasjoner og overlapp. Se [dokumentasjon](https://nvdb.atlas.vegvesen.no/docs/produkter/nvdbapil/v4/introduksjon/Avanserte_filter)',
      )
      .optional(),
    overlapp: z
      .array(z.string())
      .describe(
        'Filtrer vegobjekter p\u00E5 overlapp. Se [dokumentasjon](https://nvdb.atlas.vegvesen.no/docs/produkter/nvdbapil/v4/introduksjon/Avanserte_filter)',
      )
      .optional(),
    endret_etter: z
      .string()
      .datetime()
      .describe(
        'Hente endringer siden sist. Eksempel: 2024-12-02T10:15:30.123456',
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

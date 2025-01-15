import { z } from 'zod'
import { vegobjektSchema } from './vegobjektSchema'
import { problemDetailSchema } from './problemDetailSchema'

export const getVegobjektVersjonerPathParamsSchema = z.object({
  vegobjekttypeId: z
    .number()
    .int()
    .describe(
      'Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.\n\nEksempel: 581\n        ',
    ),
  vegobjektId: z.number().int(),
})

export const getVegobjektVersjonerQueryParamsSchema = z
  .object({
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
    dybde: z
      .string()
      .describe(
        "Hvor mange niv\u00E5 barn skal inkluderes. 1 betyr bare IDer, 2-n betyr ett eller flere mellomniv\u00E5er, 'full' betyr alle niv\u00E5er.",
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
  })
  .optional()
/**
 * @description OK
 */
export const getVegobjektVersjoner200Schema = z.array(
  z.lazy(() => vegobjektSchema),
)
/**
 * @description Bad Request
 */
export const getVegobjektVersjoner400Schema = z.lazy(() => problemDetailSchema)
/**
 * @description Unauthorized
 */
export const getVegobjektVersjoner401Schema = z.lazy(() => problemDetailSchema)
/**
 * @description Forbidden
 */
export const getVegobjektVersjoner403Schema = z.lazy(() => problemDetailSchema)
/**
 * @description Not Found
 */
export const getVegobjektVersjoner404Schema = z.lazy(() => problemDetailSchema)
/**
 * @description Internal Server Error
 */
export const getVegobjektVersjoner500Schema = z.lazy(() => problemDetailSchema)
/**
 * @description OK
 */
export const getVegobjektVersjonerQueryResponseSchema = z.array(
  z.lazy(() => vegobjektSchema),
)

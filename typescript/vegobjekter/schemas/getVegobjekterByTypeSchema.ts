import { z } from 'zod'
import { vegobjekterSideSchema } from './vegobjekterSideSchema'
import { problemDetailSchema } from './problemDetailSchema'

export const getVegobjekterByTypePathParamsSchema = z.object({
  vegobjekttypeId: z
    .number()
    .describe(
      `Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.  Eksempel: 581         `,
    ),
})
export const getVegobjekterByTypeQueryParamsSchema = z
  .object({
    ider: z
      .array(z.number())
      .describe(`Kommaseparert liste med vegobjekt-IDer.`)
      .optional(),
    inkluder: z
      .array(
        z.enum([
          `metadata`,
          `egenskaper`,
          `relasjoner`,
          `lokasjon`,
          `vegsegmenter`,
          `geometri`,
          `alle`,
          `minimum`,
        ]),
      )
      .describe(
        `Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID.`,
      )
      .optional(),
    srid: z
      .enum([
        `5972`,
        `5973`,
        `5974`,
        `5975`,
        `4326`,
        `UTM32`,
        `UTM33`,
        `UTM34`,
        `UTM35`,
        `WGS84`,
      ])
      .describe(
        `Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: <a href='https://epsg.io/5972'>EPSG:5972</a> <a href='https://epsg.io/5973'>EPSG:5973</a> <a href='https://epsg.io/5974'>EPSG:5974</a> <a href='https://epsg.io/5975'>EPSG:5975</a> <a href='https://epsg.io/4326'>EPSG:4326</a>.`,
      )
      .optional(),
    inkludergeometri: z
      .enum([`ingen`, `egenskaper`, `lokasjon`, `utledet`])
      .describe(
        `Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under 'vegobjekt.egenskaper' om den finnes, stedfestet geometri er plassert under 'vegobjekt.lokasjon'. I tillegg til de nevnte feltene på vegobjekt-responsen returneres også 'vegobjekt.geometri' (dersom man har 'inkluder=geometri' eller 'alle'), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved å se på 'vegobjekt.geometri.egengeometri'.`,
      )
      .optional(),
    inkluder_egenskaper: z
      .enum([`basis`, `assosiasjon`, `stedfesting`, `geometri`, `alle`])
      .describe(
        `Gir mulighet til å filtrere hvilke egenskaper som skal returneres med inkluder=egenskaper. 'basis' er alle egenskaper som ikke er assosiasjoner, stedfesting, geometri, eller lister av disse.`,
      )
      .optional(),
    segmentering: z
      .boolean()
      .describe(
        `Angir om strekningsobjekter skal segmenteres etter søkeområdet (fylke, kommune, vegsystemreferanse, kontraktsområde, riksvegrute).  Default: 'true'`,
      )
      .optional(),
    fylke: z
      .array(z.number())
      .describe(
        `Filtrer på fylke. Kommaseparert liste. Se /omrader/fylker for mulige verdier.  Eksempel: '50'`,
      )
      .optional(),
    kommune: z
      .array(z.number())
      .describe(
        `Filtrer på kommune. Kommaseparert liste. Se /omrader/kommuner for mulige verdier.  Eksempel: '5001'`,
      )
      .optional(),
    kontraktsomrade: z
      .array(z.string())
      .describe(
        `Filtrer på kontraktsomrade. Kommaseparert liste. Se /omrader/kontraktsomrader for mulige verdier.  Eksempel: '1539 Tunnel- og bergsikr 2018-2023 Nordm og Romsd'`,
      )
      .optional(),
    riksvegrute: z
      .array(z.string())
      .describe(
        `Filtrer på riksvegrute. Kommaseparert liste. Se /omrader/riksvegruter for mulige verdier.  Eksempel: 'RUTE4A'`,
      )
      .optional(),
    vegsystemreferanse: z
      .array(z.string())
      .describe(
        `Filtrer vegobjekter på [vegsystemreferanse](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: 'EV6S1D1 m12'`,
      )
      .optional(),
    kartutsnitt: z
      .string()
      .describe(
        `Filtrer vegobjekter med kartutsnitt i det gjeldende geografiske referansesystemet ('srid'-paramteret). Formatet er 'minX, minY, maxX, maxY'.  Eksempel: '265273, 7019372, 346553, 7061071'`,
      )
      .optional(),
    kartutsnittPresisjon: z
      .enum([`presis`, `forenklet`, `skalar`])
      .describe(
        `Angir om filtrering med kartutsnitt skal benytte en forenklet geometri (senterpunkt) for å finne vegobjekter, for bedre ytelse. Den kan også benytte skalar-verdier for X og Y av senterpunkt, som kan gi bedre ytelse for spørringer der kartutsnittet er stort. Gyldige verdier er 'presis', 'forenklet' og 'skalar'. Default er 'presis'.`,
      )
      .optional(),
    polygon: z
      .string()
      .describe(
        `Filtrer vegobjekter med polygon i det gjeldende geografiske referansesystemet ('srid'-paramteret).  Eksempel: '20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000'`,
      )
      .optional(),
    overlappendeVegobjektIder: z
      .array(z.number())
      .describe(
        `Filtrer vegobjekter på om de har geometri som overlapper med vegobjekt med gitt id. Hvis flere vegobjekt-ider spesifiseres vil vegobjekter som overlapper med minst én av de bli returnert.`,
      )
      .optional(),
    adskiltelop: z
      .array(z.enum([`Med`, `Mot`, `Nei`]))
      .describe(
        `Filtrer vegobjekter på om de er stedfestet hvor det er en Strekning med verdi satt for «adskilte løp».`,
      )
      .optional(),
    kryssystem: z
      .boolean()
      .describe(
        `Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Kryssystem.`,
      )
      .optional(),
    sideanlegg: z
      .boolean()
      .describe(
        `Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Sideanlegg.`,
      )
      .optional(),
    trafikantgruppe: z
      .enum([`K`, `G`])
      .describe(`Filtrer vegobjekter på trafikantgruppe.`)
      .optional(),
    antall: z
      .number()
      .describe(
        `Angir hvor mange objekter som skal returneres. Øvre grense er avhengig av størrelse på respons, og vil kunne variere fra endepunkt til endepunkt. Dersom det angis en verdi for antall som overskrider maksimum, vil maksimumsverdi benyttes. Se også 'sidestørrelse' i responsens 'metadata'-objekt.`,
      )
      .optional(),
    start: z
      .number()
      .describe(
        `Angir offset for hvilke objekter som skal returneres. Denne får man i metadata-feltet i responsen.`,
      )
      .optional(),
    geometritoleranse: z
      .number()
      .describe(
        `Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.`,
      )
      .optional(),
    tidspunkt: z
      .string()
      .describe(`Finner versjonen som var gyldig denne datoen.`)
      .optional(),
    alle_versjoner: z
      .boolean()
      .describe(
        `Returner alle versjoner som matcher de oppgitte parametrene. Dersom ikke satt eller 'false' vil kun objekter uten sluttdato returneres.`,
      )
      .optional(),
    inkluderAntall: z
      .boolean()
      .describe(
        `Hvorvidt totalt antall objekter skal returneres i responsen. Default er 'false'.`,
      )
      .optional(),
    sortert: z
      .boolean()
      .describe(
        `Hvorvidt resultatet skal sorteres på ID. Default er 'true'. Bør være satt for paginering for å sikre deterministisk resultat, men kan slås av for å forbedre ytelse. Satt 'false' som standard for søk med kartutsnitt eller polygon.`,
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

import { z } from 'zod'
import { problemDetailSchema } from './problemDetailSchema'
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

export const getVegobjekterByTypePathParamsSchema = z.object({
  vegobjekttypeId: z
    .number()
    .describe(
      `Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.  Eksempel: 581         `,
    ),
})

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
export const getVegobjekterByTypeQueryParamsSchema = z
  .object({
    ider: z
      .array(z.number())
      .min(1)
      .max(2147483647)
      .describe(`Kommaseparert liste med vegobjekt-IDer.`)
      .optional(),
    inkluder: z
      .array(z.lazy(() => inkluderIVegobjektSchema))
      .describe(
        `Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID.`,
      )
      .optional(),
    srid: z.lazy(() => sridParameterSchema).optional(),
    inkludergeometri: z.lazy(() => inkluderGeometriSchema).optional(),
    inkluder_egenskaper: z.lazy(() => inkluderIEgenskaperSchema).optional(),
    segmentering: z
      .boolean()
      .describe(
        `Angir om strekningsobjekter skal segmenteres etter søkeområdet (fylke, kommune, vegsystemreferanse, kontraktsområde, riksvegrute, vegforvalter).  Default: 'false'`,
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
        `Filtrer på kontraktsomrade. Kommaseparert liste. Se /omrader/kontraktsomrader for mulige verdier. Det er mulig å bruke ID-en for kontraktsområdet istedenfor det fulle navnet.  Eksempel: '9503 Midtre Hålogaland 2021-2026'`,
      )
      .optional(),
    riksvegrute: z
      .array(z.string())
      .describe(
        `Filtrer på riksvegrute. Kommaseparert liste. Se /omrader/riksvegruter for mulige verdier.  Eksempel: 'RUTE4A' eller som enumid '20290'`,
      )
      .optional(),
    vegforvalter: z
      .array(z.string())
      .describe(
        `Filtrer på vegforvalter. Kommaseparert liste. Se [/omrader/api/v4/vegforvaltere](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der#/Omr%C3%A5der/getVegforvaltere) for mulige verdier.  Eksempel: 'Møre og Romsdal fylkeskommune' eller som enumid '21774'`,
      )
      .optional(),
    vegsystemreferanse: z
      .array(z.string())
      .describe(
        `Filtrer vegobjekter på [vegsystemreferanse](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: 'EV6S1D1 m12'`,
      )
      .optional(),
    kartutsnitt: z
      .string()
      .describe(
        `Filtrer vegobjekter med kartutsnitt i det gjeldende geografiske referansesystemet ('srid'-paramteret). Formatet er 'minX, minY, maxX, maxY'. Merk at vegobjektets bounding box benyttes for sammenligning, som kan medføre at vegobjekter som er utenfor kartutsnittet også returneres. For å unngå dette, kan du bruke 'polygon' i stedet.  Eksempel: '265273, 7019372, 346553, 7061071'`,
      )
      .optional(),
    polygon: z
      .string()
      .describe(
        `Filtrer vegobjekter med polygon i det gjeldende geografiske referansesystemet ('srid'-paramteret).  Eksempel: '20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000'`,
      )
      .optional(),
    typeveg: z
      .array(z.lazy(() => typeVegSosiSchema))
      .describe(
        `Filtrer Relasjonstype.vegobjekter på type veg på vegnettet objektet er stedfestet på. Kommaseparert liste.  Eksempel: 'kanalisertVeg, enkelBilveg, rampe, rundkjøring, bilferje, passasjerferje, gangOgSykkelveg, sykkelveg, gangveg, gågate, fortau, trapp, gangfelt, gatetun, traktorveg, sti, annet'`,
      )
      .optional(),
    adskiltelop: z
      .array(z.lazy(() => adskilteLopSchema))
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
    trafikantgruppe: z.lazy(() => trafikantgruppeSchema).optional(),
    antall: z
      .number()
      .describe(
        `Angir hvor mange objekter som skal returneres. Øvre grense er avhengig av størrelse på respons, og vil kunne variere fra endepunkt til endepunkt. Dersom det angis en verdi for antall som overskrider maksimum, vil maksimumsverdi benyttes. Se også 'sidestørrelse' i responsens 'metadata'-objekt.`,
      )
      .optional(),
    start: z
      .string()
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
    veglenkesekvens: z
      .array(z.string())
      .describe(
        `Filtrer vegobjekter på om de er stedfestet på gjeldende veglenkesekvenser. Kommaseparert liste.  Eksempel: '0.37@319531,0.83-0.97@41640'`,
      )
      .optional(),
    egenskap: z
      .array(z.string())
      .describe(
        `Filtrer vegobjekter på egenskaper, relasjoner og overlapp. Husk URL encoding hvis verdien inneholder likhetstegn. Se [dokumentasjon](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Avanserte_filter)`,
      )
      .optional(),
    overlapp: z
      .array(z.string())
      .describe(
        `Filtrer vegobjekter på overlapp. Husk URL encoding hvis verdien inneholder likhetstegn. Se [dokumentasjon](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Avanserte_filter)`,
      )
      .optional(),
    veglenketype: z
      .array(z.lazy(() => veglenkeTypeParameterSchema))
      .describe(
        `Filtrer vegobjekter på veglenketype på vegnettet objektet er stedfestet. Kommaseparert liste.`,
      )
      .optional(),
    detaljniva: z
      .array(z.lazy(() => detaljnivaParameterSchema))
      .describe(
        `Filtrer vegobjekter på detaljnivå på vegnettet objektet er stedfestet på (kortnavn fra datakatalogen).`,
      )
      .optional(),
    endret_etter: z
      .string()
      .datetime()
      .describe(
        `Hente endringer siden et tidspunkt. Tidspunkt skal følge ISO 8601 med tidssone eller som UTC. Eksempler: '2024-12-02T10:15:30.123+01:00', '2024-12-02T09:15:30.123Z'`,
      )
      .optional(),
  })
  .optional()

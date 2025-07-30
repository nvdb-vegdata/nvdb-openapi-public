import type { InkluderIVegobjekt } from './InkluderIVegobjekt'
import type { SridParameter } from './SridParameter'
import type { InkluderGeometri } from './InkluderGeometri'
import type { InkluderIEgenskaper } from './InkluderIEgenskaper'
import type { TypeVegSosi } from './TypeVegSosi'
import type { AdskilteLop } from './AdskilteLop'
import type { Trafikantgruppe } from './Trafikantgruppe'
import type { VeglenkeTypeParameter } from './VeglenkeTypeParameter'
import type { DetaljnivaParameter } from './DetaljnivaParameter'
import type { VegobjekterSide } from './VegobjekterSide'
import type { ProblemDetail } from './ProblemDetail'

export type GetVegobjekterByTypePathParams = {
  /**
   * @description Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.\n\nEksempel: 581\n
   * @type integer, int32
   */
  vegobjekttypeId: number
}
export type GetVegobjekterByTypeQueryParams = {
  /**
   * @description Kommaseparert liste med vegobjekt-IDer.
   * @type array | undefined
   */
  ider?: number[]
  /**
   * @description Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID.
   * @type array | undefined
   */
  inkluder?: InkluderIVegobjekt[]
  /**
   * @type string | undefined
   */
  srid?: SridParameter
  /**
   * @type string | undefined
   */
  inkludergeometri?: InkluderGeometri
  /**
   * @type string | undefined
   */
  inkluder_egenskaper?: InkluderIEgenskaper
  /**
   * @description Angir om strekningsobjekter skal segmenteres etter søkeområdet (fylke, kommune, vegsystemreferanse, kontraktsområde, riksvegrute, vegforvalter).\n\nDefault: `false`
   * @type boolean | undefined
   */
  segmentering?: boolean
  /**
   * @description Filtrer på fylke. Kommaseparert liste. Se /omrader/fylker for mulige verdier.\n\nEksempel: `50`
   * @type array | undefined
   */
  fylke?: number[]
  /**
   * @description Filtrer på kommune. Kommaseparert liste. Se /omrader/kommuner for mulige verdier.\n\nEksempel: `5001`
   * @type array | undefined
   */
  kommune?: number[]
  /**
   * @description Filtrer på kontraktsomrade. Kommaseparert liste. Se /omrader/kontraktsomrader for mulige verdier.\nDet er mulig å bruke ID-en for kontraktsområdet istedenfor det fulle navnet.\n\nEksempel: `9503 Midtre Hålogaland 2021-2026`
   * @type array | undefined
   */
  kontraktsomrade?: string[]
  /**
   * @description Filtrer på riksvegrute. Kommaseparert liste. Se /omrader/riksvegruter for mulige verdier.\n\nEksempel: `RUTE4A` eller som enumid `20290`
   * @type array | undefined
   */
  riksvegrute?: string[]
  /**
   * @description Filtrer på vegforvalter. Kommaseparert liste. Se [/omrader/api/v4/vegforvaltere](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der#/Omr%C3%A5der/getVegforvaltere) for mulige verdier.\n\nEksempel: `Møre og Romsdal fylkeskommune` eller som enumid `21774`
   * @type array | undefined
   */
  vegforvalter?: string[]
  /**
   * @description Filtrer vegobjekter på [vegsystemreferanse](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.\n\nEksempel: `EV6S1D1 m12`
   * @type array | undefined
   */
  vegsystemreferanse?: string[]
  /**
   * @description Filtrer vegobjekter med kartutsnitt i det gjeldende geografiske referansesystemet (`srid`-paramteret). Formatet er `minX, minY, maxX, maxY`. Merk at vegobjektets bounding box benyttes for sammenligning, som kan medføre at vegobjekter som er utenfor kartutsnittet også returneres. For å unngå dette, kan du bruke `polygon` i stedet.\n\nEksempel: `265273, 7019372, 346553, 7061071`
   * @type string | undefined
   */
  kartutsnitt?: string
  /**
   * @description Filtrer vegobjekter med polygon i det gjeldende geografiske referansesystemet (`srid`-paramteret).\n\nEksempel: `20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000`
   * @type string | undefined
   */
  polygon?: string
  /**
   * @description Filtrer Relasjonstype.vegobjekter på type veg på vegnettet objektet er stedfestet på. Kommaseparert liste.\n\nEksempel: `kanalisertVeg, enkelBilveg, rampe, rundkjøring, bilferje, passasjerferje, gangOgSykkelveg, sykkelveg, gangveg, gågate, fortau, trapp, gangfelt, gatetun, traktorveg, sti, annet`
   * @type array | undefined
   */
  typeveg?: TypeVegSosi[]
  /**
   * @description Filtrer vegobjekter på om de er stedfestet hvor det er en Strekning med verdi satt for «adskilte løp».
   * @type array | undefined
   */
  adskiltelop?: AdskilteLop[]
  /**
   * @description Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Kryssystem.
   * @type boolean | undefined
   */
  kryssystem?: boolean
  /**
   * @description Filtrer vegobjekter på om de er stedfestet på samme sted hvor det er et Sideanlegg.
   * @type boolean | undefined
   */
  sideanlegg?: boolean
  /**
   * @type string | undefined
   */
  trafikantgruppe?: Trafikantgruppe
  /**
   * @description Angir hvor mange objekter som skal returneres. Øvre grense er avhengig av størrelse på respons, og vil kunne variere fra endepunkt til endepunkt. Dersom det angis en verdi for antall som overskrider maksimum, vil maksimumsverdi benyttes. Se også `sidestørrelse` i responsens `metadata`-objekt.
   * @type integer | undefined, int32
   */
  antall?: number
  /**
   * @description Angir offset for hvilke objekter som skal returneres. Denne får man i metadata-feltet i responsen.
   * @type string | undefined
   */
  start?: string
  /**
   * @description Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.
   * @type integer | undefined, int32
   */
  geometritoleranse?: number
  /**
   * @description Finner versjonen som var gyldig denne datoen.
   * @type string | undefined, date
   */
  tidspunkt?: string
  /**
   * @description Returner alle versjoner som matcher de oppgitte parametrene. Dersom ikke satt eller `false` vil kun objekter uten sluttdato returneres.
   * @type boolean | undefined
   */
  alle_versjoner?: boolean
  /**
   * @description Hvorvidt totalt antall objekter skal returneres i responsen. Default er `false`.
   * @type boolean | undefined
   */
  inkluderAntall?: boolean
  /**
   * @description Filtrer vegobjekter på om de er stedfestet på gjeldende veglenkesekvenser. Kommaseparert liste.\n\nEksempel: `0.37@319531,0.83-0.97@41640`
   * @type array | undefined
   */
  veglenkesekvens?: string[]
  /**
   * @description Filtrer vegobjekter på egenskaper, relasjoner og overlapp. Husk URL encoding hvis verdien inneholder likhetstegn. Se [dokumentasjon](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Avanserte_filter)
   * @type array | undefined
   */
  egenskap?: string[]
  /**
   * @description Filtrer vegobjekter på overlapp. Husk URL encoding hvis verdien inneholder likhetstegn. Se [dokumentasjon](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Avanserte_filter)
   * @type array | undefined
   */
  overlapp?: string[]
  /**
   * @description Filtrer vegobjekter på veglenketype på vegnettet objektet er stedfestet. Kommaseparert liste.
   * @type array | undefined
   */
  veglenketype?: VeglenkeTypeParameter[]
  /**
   * @description Filtrer vegobjekter på detaljnivå på vegnettet objektet er stedfestet på (kortnavn fra datakatalogen).
   * @type array | undefined
   */
  detaljniva?: DetaljnivaParameter[]
  /**
   * @description Hente endringer siden et tidspunkt. Tidspunkt skal følge ISO 8601 med tidssone eller som UTC. Eksempler: `2024-12-02T10:15:30.123+01:00`, `2024-12-02T09:15:30.123Z`
   * @type string | undefined, date-time
   */
  endret_etter?: string
}
/**
 * @description OK
 */
export type GetVegobjekterByType200 = VegobjekterSide
/**
 * @description Bad Request
 */
export type GetVegobjekterByType400 = ProblemDetail
/**
 * @description Unauthorized
 */
export type GetVegobjekterByType401 = ProblemDetail
/**
 * @description Forbidden
 */
export type GetVegobjekterByType403 = ProblemDetail
/**
 * @description Not Found
 */
export type GetVegobjekterByType404 = ProblemDetail
/**
 * @description Internal Server Error
 */
export type GetVegobjekterByType500 = ProblemDetail
/**
 * @description OK
 */
export type GetVegobjekterByTypeQueryResponse = VegobjekterSide
export type GetVegobjekterByTypeQuery = {
  Response: GetVegobjekterByTypeQueryResponse
  PathParams: GetVegobjekterByTypePathParams
  QueryParams: GetVegobjekterByTypeQueryParams
  Errors:
    | GetVegobjekterByType400
    | GetVegobjekterByType401
    | GetVegobjekterByType403
    | GetVegobjekterByType404
    | GetVegobjekterByType500
}

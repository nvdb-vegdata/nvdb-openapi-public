import type { ProblemDetail } from './ProblemDetail'
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

export type GetVegobjekterByTypePathParams = {
  /**
     * @description Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.
    
    Eksempel: 581
            
     * @type integer int32
    */
  vegobjekttypeId: number
}

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

export type GetVegobjekterByTypeQueryParams =
  | {
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
       * @description Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: <a href='https://epsg.io/5972'>EPSG:5972</a> <a href='https://epsg.io/5973'>EPSG:5973</a> <a href='https://epsg.io/5975'>EPSG:5975</a> <a href='https://epsg.io/4326'>EPSG:4326</a>.
       */
      srid?: SridParameter
      /**
       * @description Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under `vegobjekt.egenskaper` om den finnes, stedfestet geometri er plassert under `vegobjekt.lokasjon`. I tillegg til de nevnte feltene på vegobjekt-responsen returneres også `vegobjekt.geometri` (dersom man har `inkluder=geometri` eller `alle`), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved å se på `vegobjekt.geometri.egengeometri`.
       */
      inkludergeometri?: InkluderGeometri
      /**
       * @description Gir mulighet til å filtrere hvilke egenskaper som skal returneres med inkluder=egenskaper. `basis` er alle egenskaper som ikke er geometri, eller lister av geometri.
       */
      inkluder_egenskaper?: InkluderIEgenskaper
      /**
     * @description Angir om strekningsobjekter skal segmenteres etter søkeområdet (fylke, kommune, vegsystemreferanse, kontraktsområde, riksvegrute, vegforvalter).
    
    Default: `false`
     * @type boolean | undefined
    */
      segmentering?: boolean
      /**
     * @description Filtrer på fylke. Kommaseparert liste. Se /omrader/fylker for mulige verdier.
    
    Eksempel: `50`
     * @type array | undefined
    */
      fylke?: number[]
      /**
     * @description Filtrer på kommune. Kommaseparert liste. Se /omrader/kommuner for mulige verdier.
    
    Eksempel: `5001`
     * @type array | undefined
    */
      kommune?: number[]
      /**
     * @description Filtrer på kontraktsomrade. Kommaseparert liste. Se /omrader/kontraktsomrader for mulige verdier.
    Det er mulig å bruke ID-en for kontraktsområdet istedenfor det fulle navnet.
    
    Eksempel: `9503 Midtre Hålogaland 2021-2026`
     * @type array | undefined
    */
      kontraktsomrade?: string[]
      /**
     * @description Filtrer på riksvegrute. Kommaseparert liste. Se /omrader/riksvegruter for mulige verdier.
    
    Eksempel: `RUTE4A` eller som enumid `20290`
     * @type array | undefined
    */
      riksvegrute?: string[]
      /**
     * @description Filtrer på vegforvalter. Kommaseparert liste. Se [/omrader/api/v4/vegforvaltere](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName=Omr%C3%A5der#/Omr%C3%A5der/getVegforvaltere) for mulige verdier.
    
    Eksempel: `Møre og Romsdal fylkeskommune` eller som enumid `21774`
     * @type array | undefined
    */
      vegforvalter?: string[]
      /**
     * @description Filtrer vegobjekter på [vegsystemreferanse](https://nvdb-docs.atlas.vegvesen.no/nvdbapil/v4/introduksjon/Vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.
    
    Eksempel: `EV6S1D1 m12`
     * @type array | undefined
    */
      vegsystemreferanse?: string[]
      /**
     * @description Filtrer vegobjekter med kartutsnitt i det gjeldende geografiske referansesystemet (`srid`-paramteret). Formatet er `minX, minY, maxX, maxY`. Merk at vegobjektets bounding box benyttes for sammenligning, som kan medføre at vegobjekter som er utenfor kartutsnittet også returneres. For å unngå dette, kan du bruke `polygon` i stedet.
    
    Eksempel: `265273, 7019372, 346553, 7061071`
     * @type string | undefined
    */
      kartutsnitt?: string
      /**
     * @description Filtrer vegobjekter med polygon i det gjeldende geografiske referansesystemet (`srid`-paramteret).
    
    Eksempel: `20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000`
     * @type string | undefined
    */
      polygon?: string
      /**
     * @description Filtrer Relasjonstype.vegobjekter på type veg på vegnettet objektet er stedfestet på. Kommaseparert liste.
    
    Eksempel: `kanalisertVeg, enkelBilveg, rampe, rundkjøring, bilferje, passasjerferje, gangOgSykkelveg, sykkelveg, gangveg, gågate, fortau, trapp, gangfelt, gatetun, traktorveg, sti, annet`
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
       * @description Filtrer vegobjekter på trafikantgruppe.
       */
      trafikantgruppe?: Trafikantgruppe
      /**
       * @description Angir hvor mange objekter som skal returneres. Øvre grense er avhengig av størrelse på respons, og vil kunne variere fra endepunkt til endepunkt. Dersom det angis en verdi for antall som overskrider maksimum, vil maksimumsverdi benyttes. Se også `sidestørrelse` i responsens `metadata`-objekt.
       * @type integer | undefined int32
       */
      antall?: number
      /**
       * @description Angir offset for hvilke objekter som skal returneres. Denne får man i metadata-feltet i responsen.
       * @type string | undefined
       */
      start?: string
      /**
       * @description Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.
       * @type integer | undefined int32
       */
      geometritoleranse?: number
      /**
       * @description Finner versjonen som var gyldig denne datoen.
       * @type string | undefined date
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
     * @description Filtrer vegobjekter på om de er stedfestet på gjeldende veglenkesekvenser. Kommaseparert liste.
    
    Eksempel: `0.37@319531,0.83-0.97@41640`
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
       * @type string | undefined date-time
       */
      endret_etter?: string
    }
  | undefined
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

import type { ProblemDetail } from './ProblemDetail'
import type { VegobjekterSide } from './VegobjekterSide'

export type GetVegobjekterByTypePathParams = {
  /**
     * @description Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.
    
    Eksempel: 581
            
     * @type integer int32
    */
  vegobjekttypeId: number
}

export type GetVegobjekterByTypeQueryParamsInkluder =
  | 'metadata'
  | 'egenskaper'
  | 'relasjoner'
  | 'lokasjon'
  | 'vegsegmenter'
  | 'geometri'
  | 'alle'
  | 'minimum'
export type GetVegobjekterByTypeQueryParamsSrid =
  | '5972'
  | '5973'
  | '5974'
  | '5975'
  | '4326'
  | 'UTM32'
  | 'UTM33'
  | 'UTM34'
  | 'UTM35'
  | 'WGS84'
export type GetVegobjekterByTypeQueryParamsInkludergeometri =
  | 'ingen'
  | 'egenskaper'
  | 'lokasjon'
  | 'utledet'
export type GetVegobjekterByTypeQueryParamsInkluderEgenskaper =
  | 'basis'
  | 'assosiasjon'
  | 'stedfesting'
  | 'geometri'
  | 'alle'
export type GetVegobjekterByTypeQueryParamsKartutsnittPresisjon =
  | 'presis'
  | 'forenklet'
  | 'skalar'
export type GetVegobjekterByTypeQueryParamsAdskiltelop = 'Med' | 'Mot' | 'Nei'
export type GetVegobjekterByTypeQueryParamsTrafikantgruppe = 'K' | 'G'
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
      inkluder?: GetVegobjekterByTypeQueryParamsInkluder[]
      /**
       * @description Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: <a href='https://epsg.io/5972'>EPSG:5972</a> <a href='https://epsg.io/5973'>EPSG:5973</a> <a href='https://epsg.io/5974'>EPSG:5974</a> <a href='https://epsg.io/5975'>EPSG:5975</a> <a href='https://epsg.io/4326'>EPSG:4326</a>.
       * @type string | undefined
       */
      srid?: GetVegobjekterByTypeQueryParamsSrid
      /**
       * @description Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under `vegobjekt.egenskaper` om den finnes, stedfestet geometri er plassert under `vegobjekt.lokasjon`. I tillegg til de nevnte feltene på vegobjekt-responsen returneres også `vegobjekt.geometri` (dersom man har `inkluder=geometri` eller `alle`), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved å se på `vegobjekt.geometri.egengeometri`.
       * @type string | undefined
       */
      inkludergeometri?: GetVegobjekterByTypeQueryParamsInkludergeometri
      /**
       * @description Gir mulighet til å filtrere hvilke egenskaper som skal returneres med inkluder=egenskaper. `basis` er alle egenskaper som ikke er assosiasjoner, stedfesting, geometri, eller lister av disse.
       * @type string | undefined
       */
      inkluder_egenskaper?: GetVegobjekterByTypeQueryParamsInkluderEgenskaper
      /**
     * @description Angir om strekningsobjekter skal segmenteres etter søkeområdet (fylke, kommune, vegsystemreferanse, kontraktsområde, riksvegrute).
    
    Default: `true`
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
    
    Eksempel: `1539 Tunnel- og bergsikr 2018-2023 Nordm og Romsd`
     * @type array | undefined
    */
      kontraktsomrade?: string[]
      /**
     * @description Filtrer på riksvegrute. Kommaseparert liste. Se /omrader/riksvegruter for mulige verdier.
    
    Eksempel: `RUTE4A`
     * @type array | undefined
    */
      riksvegrute?: string[]
      /**
     * @description Filtrer vegobjekter på [vegsystemreferanse](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.
    
    Eksempel: `EV6S1D1 m12`
     * @type array | undefined
    */
      vegsystemreferanse?: string[]
      /**
     * @description Filtrer vegobjekter med kartutsnitt i det gjeldende geografiske referansesystemet (`srid`-paramteret). Formatet er `minX, minY, maxX, maxY`.
    
    Eksempel: `265273, 7019372, 346553, 7061071`
     * @type string | undefined
    */
      kartutsnitt?: string
      /**
       * @description Angir om filtrering med kartutsnitt skal benytte en forenklet geometri (senterpunkt) for å finne vegobjekter, for bedre ytelse. Den kan også benytte skalar-verdier for X og Y av senterpunkt, som kan gi bedre ytelse for spørringer der kartutsnittet er stort. Gyldige verdier er 'presis', 'forenklet' og 'skalar'. Default er 'presis'.
       * @type string | undefined
       */
      kartutsnittPresisjon?: GetVegobjekterByTypeQueryParamsKartutsnittPresisjon
      /**
     * @description Filtrer vegobjekter med polygon i det gjeldende geografiske referansesystemet (`srid`-paramteret).
    
    Eksempel: `20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000`
     * @type string | undefined
    */
      polygon?: string
      /**
       * @description Filtrer vegobjekter på om de har geometri som overlapper med vegobjekt med gitt id. Hvis flere vegobjekt-ider spesifiseres vil vegobjekter som overlapper med minst én av de bli returnert.
       * @type array | undefined
       */
      overlappendeVegobjektIder?: number[]
      /**
       * @description Filtrer vegobjekter på om de er stedfestet hvor det er en Strekning med verdi satt for «adskilte løp».
       * @type array | undefined
       */
      adskiltelop?: GetVegobjekterByTypeQueryParamsAdskiltelop[]
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
       * @type string | undefined
       */
      trafikantgruppe?: GetVegobjekterByTypeQueryParamsTrafikantgruppe
      /**
       * @description Angir hvor mange objekter som skal returneres. Øvre grense er avhengig av størrelse på respons, og vil kunne variere fra endepunkt til endepunkt. Dersom det angis en verdi for antall som overskrider maksimum, vil maksimumsverdi benyttes. Se også `sidestørrelse` i responsens `metadata`-objekt.
       * @type integer | undefined int32
       */
      antall?: number
      /**
       * @description Angir offset for hvilke objekter som skal returneres. Denne får man i metadata-feltet i responsen.
       * @type integer | undefined int32
       */
      start?: number
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
       * @description Hvorvidt resultatet skal sorteres på ID. Default er `true`. Bør være satt for paginering for å sikre deterministisk resultat, men kan slås av for å forbedre ytelse. Satt `false` som standard for søk med kartutsnitt eller polygon.
       * @type boolean | undefined
       */
      sortert?: boolean
    }
  | undefined

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

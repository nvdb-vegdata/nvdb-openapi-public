import type { ProblemDetail } from './ProblemDetail'
import type { Vegobjekt } from './Vegobjekt'

export type GetVegobjektVersjonerPathParams = {
  /**
     * @description Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.
    
    Eksempel: 581
            
     * @type integer int32
    */
  vegobjekttypeId: number
  /**
   * @type integer int64
   */
  vegobjektId: number
}

export type GetVegobjektVersjonerQueryParamsInkluder =
  | 'metadata'
  | 'egenskaper'
  | 'relasjoner'
  | 'lokasjon'
  | 'vegsegmenter'
  | 'geometri'
  | 'alle'
  | 'minimum'
export type GetVegobjektVersjonerQueryParamsSrid =
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
export type GetVegobjektVersjonerQueryParamsInkludergeometri =
  | 'ingen'
  | 'egenskaper'
  | 'lokasjon'
  | 'utledet'
export type GetVegobjektVersjonerQueryParamsInkluderEgenskaper =
  | 'basis'
  | 'assosiasjon'
  | 'stedfesting'
  | 'geometri'
  | 'alle'
export type GetVegobjektVersjonerQueryParams =
  | {
      /**
       * @description Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID.
       * @type array | undefined
       */
      inkluder?: GetVegobjektVersjonerQueryParamsInkluder[]
      /**
       * @description Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: <a href='https://epsg.io/5972'>EPSG:5972</a> <a href='https://epsg.io/5973'>EPSG:5973</a> <a href='https://epsg.io/5974'>EPSG:5974</a> <a href='https://epsg.io/5975'>EPSG:5975</a> <a href='https://epsg.io/4326'>EPSG:4326</a>.
       * @type string | undefined
       */
      srid?: GetVegobjektVersjonerQueryParamsSrid
      /**
       * @description Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under `vegobjekt.egenskaper` om den finnes, stedfestet geometri er plassert under `vegobjekt.lokasjon`. I tillegg til de nevnte feltene på vegobjekt-responsen returneres også `vegobjekt.geometri` (dersom man har `inkluder=geometri` eller `alle`), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved å se på `vegobjekt.geometri.egengeometri`.
       * @type string | undefined
       */
      inkludergeometri?: GetVegobjektVersjonerQueryParamsInkludergeometri
      /**
       * @description Gir mulighet til å filtrere hvilke egenskaper som skal returneres med inkluder=egenskaper. `basis` er alle egenskaper som ikke er assosiasjoner, stedfesting, geometri, eller lister av disse.
       * @type string | undefined
       */
      inkluder_egenskaper?: GetVegobjektVersjonerQueryParamsInkluderEgenskaper
      /**
       * @description Hvor mange nivå barn skal inkluderes. 1 betyr bare IDer, 2-n betyr ett eller flere mellomnivåer, 'full' betyr alle nivåer.
       * @type string | undefined
       */
      dybde?: string
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
    }
  | undefined

/**
 * @description Bad Request
 */
export type GetVegobjektVersjoner400 = ProblemDetail

/**
 * @description Unauthorized
 */
export type GetVegobjektVersjoner401 = ProblemDetail

/**
 * @description Forbidden
 */
export type GetVegobjektVersjoner403 = ProblemDetail

/**
 * @description Not Found
 */
export type GetVegobjektVersjoner404 = ProblemDetail

/**
 * @description Internal Server Error
 */
export type GetVegobjektVersjoner500 = ProblemDetail

/**
 * @description OK
 */
export type GetVegobjektVersjonerQueryResponse = Vegobjekt[]
export type GetVegobjektVersjonerQuery = {
  Response: GetVegobjektVersjonerQueryResponse
  PathParams: GetVegobjektVersjonerPathParams
  QueryParams: GetVegobjektVersjonerQueryParams
  Errors:
    | GetVegobjektVersjoner400
    | GetVegobjektVersjoner401
    | GetVegobjektVersjoner403
    | GetVegobjektVersjoner404
    | GetVegobjektVersjoner500
}

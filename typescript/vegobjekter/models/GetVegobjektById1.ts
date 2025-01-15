import type { Vegobjekt } from './Vegobjekt'
import type { ProblemDetail } from './ProblemDetail'

export type GetVegobjektById1PathParams = {
  /**
   * @description Finn vegobjekter med denne vegobjekttypen. Se [Datakatalogen](https://datakatalogen.atlas.vegvesen.no) for mulige verdier.\n\nEksempel: 581\n
   * @type integer, int32
   */
  vegobjekttypeId: number
  /**
   * @type integer, int64
   */
  vegobjektId: number
}
export type GetVegobjektById1QueryParamsInkluder =
  | 'metadata'
  | 'egenskaper'
  | 'relasjoner'
  | 'lokasjon'
  | 'vegsegmenter'
  | 'geometri'
  | 'alle'
  | 'minimum'
export type GetVegobjektById1QueryParamsSrid =
  | '5972'
  | '5973'
  | '5975'
  | '4326'
  | 'UTM32'
  | 'UTM33'
  | 'UTM35'
  | 'WGS84'
export type GetVegobjektById1QueryParamsInkludergeometri =
  | 'ingen'
  | 'egenskaper'
  | 'lokasjon'
  | 'utledet'
export type GetVegobjektById1QueryParamsInkluderEgenskaper =
  | 'basis'
  | 'assosiasjon'
  | 'stedfesting'
  | 'geometri'
  | 'alle'
export type GetVegobjektById1QueryParams = {
  /**
   * @description Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID.
   * @type array | undefined
   */
  inkluder?: GetVegobjektById1QueryParamsInkluder[]
  /**
   * @description Angir hvilket geografisk referansesystem som benyttes for geografisk søk, og som geometrien skal returneres i (hvis relevant). Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: <a href=\'https://epsg.io/5972\'>EPSG:5972</a> <a href=\'https://epsg.io/5973\'>EPSG:5973</a> <a href=\'https://epsg.io/5975\'>EPSG:5975</a> <a href=\'https://epsg.io/4326\'>EPSG:4326</a>.
   * @type string | undefined
   */
  srid?: GetVegobjektById1QueryParamsSrid
  /**
   * @description Et vegobjekt har opptil to geometrier, egengeometri og stedfestet geometri. Egengeometrien er plassert under `vegobjekt.egenskaper` om den finnes, stedfestet geometri er plassert under `vegobjekt.lokasjon`. I tillegg til de nevnte feltene på vegobjekt-responsen returneres også `vegobjekt.geometri` (dersom man har `inkluder=geometri` eller `alle`), slik at man alltid finner geometrien for vegobjektet ett sted. Dette feltet er egengeometri dersom objektet har det, hvis ikke har feltet stedfestet geometri Ved hvilken av disse som er tilfelle finner man ut ved å se på `vegobjekt.geometri.egengeometri`.
   * @type string | undefined
   */
  inkludergeometri?: GetVegobjektById1QueryParamsInkludergeometri
  /**
   * @description Gir mulighet til å filtrere hvilke egenskaper som skal returneres med inkluder=egenskaper. `basis` er alle egenskaper som ikke er assosiasjoner, stedfesting, geometri, eller lister av disse.
   * @type string | undefined
   */
  inkluder_egenskaper?: GetVegobjektById1QueryParamsInkluderEgenskaper
  /**
   * @description Hvor mange nivå barn skal inkluderes. 1 betyr bare IDer, 2-n betyr ett eller flere mellomnivåer, \'full\' betyr alle nivåer.
   * @type string | undefined
   */
  dybde?: string
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
}
/**
 * @description OK
 */
export type GetVegobjektById1200 = Vegobjekt
/**
 * @description Bad Request
 */
export type GetVegobjektById1400 = ProblemDetail
/**
 * @description Unauthorized
 */
export type GetVegobjektById1401 = ProblemDetail
/**
 * @description Forbidden
 */
export type GetVegobjektById1403 = ProblemDetail
/**
 * @description Not Found
 */
export type GetVegobjektById1404 = ProblemDetail
/**
 * @description Internal Server Error
 */
export type GetVegobjektById1500 = ProblemDetail
/**
 * @description OK
 */
export type GetVegobjektById1QueryResponse = Vegobjekt
export type GetVegobjektById1Query = {
  Response: GetVegobjektById1QueryResponse
  PathParams: GetVegobjektById1PathParams
  QueryParams: GetVegobjektById1QueryParams
  Errors:
    | GetVegobjektById1400
    | GetVegobjektById1401
    | GetVegobjektById1403
    | GetVegobjektById1404
    | GetVegobjektById1500
}

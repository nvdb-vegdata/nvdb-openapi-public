export type VegobjektEndret = {
  /**
   * @type integer int64
   */
  id: number
  /**
   * @description Versjon av vegobjektet som er endret. Dersom ny versjon er opprettet, vil dette være den nye versjonen
   * @type integer int32
   */
  versjon: number
  /**
   * @type integer int32
   */
  type: number
  /**
   * @description Tidspunktet da endringen ble gjort tilgjengelig i Les API V4
   * @type string date-time
   */
  tidspunkt: string
  /**
   * @type string date
   */
  startdato: string
  /**
   * @description Utelatt dersom sluttdato ikke er satt
   * @type string | undefined date
   */
  sluttdato?: string
  /**
   * @description Indikerer om egenskaper er endret/korrigert. Vil alltid være true dersom ny versjon av vegobjektet er opprettet
   * @type boolean
   */
  egenskaperEndret: boolean
  /**
   * @description Indikerer om barn er endret/korrigert. Vil alltid være true dersom ny versjon av vegobjektet er opprettet
   * @type boolean
   */
  barnEndret: boolean
  /**
   * @description Indikerer om stedfesting er endret/korrigert. Vil alltid være true dersom ny versjon av vegobjektet er opprettet
   * @type boolean
   */
  stedfestingEndret: boolean
  /**
   * @description Indikerer om gyldighetsperioden er endret/korrigert. Vil alltid være true dersom ny versjon av vegobjektet er opprettet
   * @type boolean
   */
  gyldighetsperiodeEndret: boolean
}

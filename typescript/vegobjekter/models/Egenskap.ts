export type EgenskapEgenskapstype =
  | 'Assosiasjon'
  | 'Boolsk'
  | 'Bin\u00E6r'
  | 'Tekst'
  | 'Dato'
  | 'Flyttall'
  | 'Heltall'
  | 'Struktur'
  | 'Geometri'
  | 'Stedfesting'
  | 'Kortdato'
  | 'Tid'
  | 'Liste'
  | 'Tekstenum'
  | 'Heltallenum'
  | 'Flyttallenum'
export type Egenskap = {
  /**
   * @type integer, int32
   */
  id: number
  /**
   * @type string
   */
  navn: string
  /**
   * @type string
   */
  egenskapstype: EgenskapEgenskapstype
}

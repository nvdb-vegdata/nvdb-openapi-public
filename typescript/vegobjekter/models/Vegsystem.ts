export type VegsystemVegkategori = 'E' | 'F' | 'K' | 'P' | 'R' | 'S'
export type VegsystemFase = 'P' | 'A' | 'V' | 'F'
export type Vegsystem = {
  /**
   * @type integer int64
   */
  id: number
  /**
   * @type integer int32
   */
  versjon: number
  /**
   * @type string
   */
  vegkategori: VegsystemVegkategori
  /**
   * @type string
   */
  fase: VegsystemFase
  /**
   * @type integer int32
   */
  nummer: number
}

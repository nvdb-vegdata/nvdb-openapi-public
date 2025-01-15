export type VegsystemVegkategori = 'E' | 'F' | 'K' | 'P' | 'R' | 'S'
export type VegsystemFase = 'P' | 'A' | 'V' | 'F'
export type Vegsystem = {
  /**
   * @type string
   */
  vegkategori: VegsystemVegkategori
  /**
   * @type string
   */
  fase: VegsystemFase
  /**
   * @type integer | undefined, int32
   */
  nummer?: number
}

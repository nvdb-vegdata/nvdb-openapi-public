export type ProblemDetail = {
  /**
   * @type string | undefined, uri
   */
  type?: string
  /**
   * @type string | undefined
   */
  title?: string
  /**
   * @type integer | undefined, int32
   */
  status?: number
  /**
   * @type string | undefined
   */
  detail?: string
  /**
   * @type string | undefined, uri
   */
  instance?: string
  /**
   * @type object | undefined
   */
  properties?: {
    [key: string]: object
  }
}

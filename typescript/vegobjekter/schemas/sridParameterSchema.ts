import { z } from 'zod'

export const sridParameterSchema = z.enum([
  `5972`,
  `5973`,
  `5975`,
  `4326`,
  `UTM32`,
  `UTM33`,
  `UTM35`,
  `WGS84`,
])

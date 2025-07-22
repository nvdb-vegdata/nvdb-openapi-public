import { z } from 'zod'

export const viktighetSchema = z.enum([
  `IKKE_SATT`,
  `PÅKREVD_ABSOLUTT`,
  `PÅKREVD_IKKE_ABSOLUTT`,
  `BETINGET`,
  `OPSJONELL`,
  `MINDRE_VIKTIG`,
  `HISTORISK`,
])

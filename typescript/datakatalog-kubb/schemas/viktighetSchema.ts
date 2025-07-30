import { z } from 'zod'

export const viktighetSchema = z.enum([
  'IKKE_SATT',
  'P\u00C5KREVD_ABSOLUTT',
  'P\u00C5KREVD_IKKE_ABSOLUTT',
  'BETINGET',
  'OPSJONELL',
  'MINDRE_VIKTIG',
  'HISTORISK',
])

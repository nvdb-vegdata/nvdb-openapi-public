import { z } from 'zod'

export const inkluderIVegobjektSchema = z.enum([
  'metadata',
  'egenskaper',
  'relasjoner',
  'lokasjon',
  'vegsegmenter',
  'geometri',
  'alle',
  'minimum',
])

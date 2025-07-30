import { z } from 'zod'

export const detaljnivaSchema = z.enum([
  'Vegtrase',
  'Kj\u00F8rebane',
  'Kj\u00F8refelt',
  'Vegtrase og kj\u00F8rebane',
])

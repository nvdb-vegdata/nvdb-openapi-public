import { z } from 'zod'

export const nesteSideSchema = z.object({
  start: z.string().describe('Token som brukes for \u00E5 f\u00E5 neste side'),
  href: z.string().describe('Komplett url for neste side'),
})

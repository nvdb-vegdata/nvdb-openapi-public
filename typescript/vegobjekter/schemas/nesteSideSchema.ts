import { z } from 'zod'

export const nesteSideSchema = z.object({
  start: z.string().describe(`Token som brukes for å få neste side`),
  href: z.string().describe(`Komplett url for neste side`),
})

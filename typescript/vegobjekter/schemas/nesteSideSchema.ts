import { z } from 'zod'

export const nesteSideSchema = z.object({ start: z.string(), href: z.string() })

import { z } from 'zod'

export const relasjonstypeSchema = z.enum([`vegobjekter`, `vegobjektIder`])

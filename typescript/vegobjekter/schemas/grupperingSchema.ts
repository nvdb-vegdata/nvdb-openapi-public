import { z } from 'zod'

export const grupperingSchema = z.enum([`fylke`, `kommune`, `vegkategori`])

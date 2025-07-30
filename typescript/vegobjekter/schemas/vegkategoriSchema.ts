import { z } from 'zod'

export const vegkategoriSchema = z.enum(['E', 'F', 'K', 'P', 'R', 'S'])

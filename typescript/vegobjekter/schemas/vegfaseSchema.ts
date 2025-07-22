import { z } from 'zod'

export const vegfaseSchema = z.enum([`P`, `A`, `V`, `F`])

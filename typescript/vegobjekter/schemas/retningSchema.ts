import { z } from 'zod'

export const retningSchema = z.enum([`MED`, `MOT`])

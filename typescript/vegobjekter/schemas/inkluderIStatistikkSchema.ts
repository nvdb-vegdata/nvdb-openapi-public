import { z } from 'zod'

export const inkluderIStatistikkSchema = z.enum([`lengde`, `antall`, `alle`])

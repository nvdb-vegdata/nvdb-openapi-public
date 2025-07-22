import { z } from 'zod'

export const inkluderIEgenskaperSchema = z.enum([`basis`, `geometri`, `alle`])

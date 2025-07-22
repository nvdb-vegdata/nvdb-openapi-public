import { z } from 'zod'

export const trafikantgruppeSchema = z.enum([`K`, `G`])

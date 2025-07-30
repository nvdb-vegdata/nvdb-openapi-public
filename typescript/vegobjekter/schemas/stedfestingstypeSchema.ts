import { z } from 'zod'

export const stedfestingstypeSchema = z.enum(['Punkt', 'Linje', 'Sving'])

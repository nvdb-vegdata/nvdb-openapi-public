import { z } from 'zod'

export const detaljnivaSchema = z.enum([
  `Vegtrase`,
  `Kjørebane`,
  `Kjørefelt`,
  `Vegtrase og kjørebane`,
])

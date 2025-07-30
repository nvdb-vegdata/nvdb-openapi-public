import { z } from 'zod'

export const detaljnivaParameterSchema = z.enum(['VT', 'KB', 'KF', 'VTKB'])

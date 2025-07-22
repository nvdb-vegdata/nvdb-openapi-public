import { z } from 'zod'
import { problemDetailSchema } from './problemDetailSchema'
import { inkluderIVegobjektSchema } from './inkluderIVegobjektSchema'
import { sridParameterSchema } from './sridParameterSchema'
import { inkluderGeometriSchema } from './inkluderGeometriSchema'
import { inkluderIEgenskaperSchema } from './inkluderIEgenskaperSchema'
import { vegobjektSchema } from './vegobjektSchema'

/**
 * @description Bad Request
 */
export const getVegobjektById400Schema = z.lazy(() => problemDetailSchema)

/**
 * @description Unauthorized
 */
export const getVegobjektById401Schema = z.lazy(() => problemDetailSchema)

/**
 * @description Forbidden
 */
export const getVegobjektById403Schema = z.lazy(() => problemDetailSchema)

/**
 * @description Not Found
 */
export const getVegobjektById404Schema = z.lazy(() => problemDetailSchema)

/**
 * @description Internal Server Error
 */
export const getVegobjektById500Schema = z.lazy(() => problemDetailSchema)

/**
 * @description OK
 */
export const getVegobjektByIdQueryResponseSchema = z.lazy(() => vegobjektSchema)
export const getVegobjektByIdQueryParamsSchema = z.object({
  id: z.number().describe(`ID for vegobjekt som skal hentes.`),
  inkluder: z
    .array(z.lazy(() => inkluderIVegobjektSchema))
    .describe(
      `Kommaseparert liste over hvilke informasjonselementer som skal returneres i tillegg til vegobjektenes ID.`,
    )
    .optional(),
  srid: z.lazy(() => sridParameterSchema).optional(),
  inkludergeometri: z.lazy(() => inkluderGeometriSchema).optional(),
  inkluder_egenskaper: z.lazy(() => inkluderIEgenskaperSchema).optional(),
  dybde: z
    .string()
    .describe(
      `Hvor mange nivå barn skal inkluderes. 1 betyr bare IDer, 2-n betyr ett eller flere mellomnivåer, 'full' betyr alle nivåer.`,
    )
    .optional(),
  geometritoleranse: z
    .number()
    .describe(
      `Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri for vegobjektene. Nummeret angir distansetoleranse i meter for generering av forenklet geometri.`,
    )
    .optional(),
  tidspunkt: z
    .string()
    .describe(`Finner versjonen som var gyldig denne datoen.`)
    .optional(),
})

import { retningSchema } from './retningSchema'
import { sideposisjonSchema } from './sideposisjonSchema'
import { veglenkeTypeSchema } from './veglenkeTypeSchema'
import { detaljnivaSchema } from './detaljnivaSchema'
import { typeVegSchema } from './typeVegSchema'
import { typeVegSosiSchema } from './typeVegSosiSchema'
import { geometriSchema } from './geometriSchema'
import { vegsystemreferanseSchema } from './vegsystemreferanseSchema'
import { z } from 'zod'

export const vegsegmentSchema = z.object({
  veglenkesekvensid: z.number(),
  startposisjon: z.number().optional(),
  sluttposisjon: z.number().optional(),
  relativPosisjon: z.number().optional(),
  lengde: z
    .number()
    .describe(`Utelatt dersom vegsegmentets lengde er lik 0`)
    .optional(),
  retning: z.lazy(() => retningSchema),
  kjørefelt: z
    .array(z.string())
    .describe(`Utelatt dersom kjørefelt ikke er relevant for vegsegmentet`)
    .optional(),
  sideposisjon: z.lazy(() => sideposisjonSchema).optional(),
  feltoversikt: z
    .array(z.string())
    .describe(
      `Utelatt dersom vegsegmentet ikke har noen felter i feltoversikten`,
    )
    .optional(),
  veglenkeType: z.lazy(() => veglenkeTypeSchema),
  detaljnivå: z.lazy(() => detaljnivaSchema),
  typeVeg: z.lazy(() => typeVegSchema),
  typeVeg_sosi: z.lazy(() => typeVegSosiSchema),
  startdato: z.string(),
  sluttdato: z
    .string()
    .describe(`Utelatt dersom vegsegmentet ikke har noe satt sluttdato`)
    .optional(),
  geometri: z.lazy(() => geometriSchema),
  kommune: z.number(),
  fylke: z.number(),
  vegsystemreferanse: z.lazy(() => vegsystemreferanseSchema).optional(),
  kontraktsområder: z
    .array(z.number())
    .describe(
      `Utelatt om vegsegmentet ikke overlapper med noen kontraktsområder`,
    )
    .optional(),
  riksvegruter: z
    .array(z.number())
    .describe(`Utelatt om vegsegmentet ikke overlapper med noen riksvegruter`)
    .optional(),
  vegforvaltere: z
    .array(z.number())
    .describe(`Utelatt om vegsegmentet ikke overlapper med noen vegforvaltere`)
    .optional(),
  adresser: z
    .array(z.number())
    .describe(`Utelatt om vegsegmentet ikke overlapper med noen adresser`)
    .optional(),
})

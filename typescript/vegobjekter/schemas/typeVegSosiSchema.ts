import { z } from 'zod'

export const typeVegSosiSchema = z.enum([
  `kanalisertVeg`,
  `enkelBilveg`,
  `rampe`,
  `rundkjøring`,
  `bilferje`,
  `passasjerferje`,
  `gangOgSykkelveg`,
  `sykkelveg`,
  `gangveg`,
  `gågate`,
  `fortau`,
  `trapp`,
  `gangfelt`,
  `gatetun`,
  `traktorveg`,
  `sti`,
  `annet`,
])

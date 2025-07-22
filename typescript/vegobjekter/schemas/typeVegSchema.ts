import { z } from 'zod'

export const typeVegSchema = z.enum([
  `Kanalisert veg`,
  `Enkel bilveg`,
  `Rampe`,
  `Rundkjøring`,
  `Bilferje`,
  `Passasjerferje`,
  `Gang- og sykkelveg`,
  `Sykkelveg`,
  `Gangveg`,
  `Gågate`,
  `Fortau`,
  `Trapp`,
  `Gangfelt`,
  `Gatetun`,
  `Traktorveg`,
  `Sti`,
  `Annet`,
])

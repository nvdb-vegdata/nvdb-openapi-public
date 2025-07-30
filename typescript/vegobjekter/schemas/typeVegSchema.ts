import { z } from 'zod'

export const typeVegSchema = z.enum([
  'Kanalisert veg',
  'Enkel bilveg',
  'Rampe',
  'Rundkj\u00F8ring',
  'Bilferje',
  'Passasjerferje',
  'Gang- og sykkelveg',
  'Sykkelveg',
  'Gangveg',
  'G\u00E5gate',
  'Fortau',
  'Trapp',
  'Gangfelt',
  'Gatetun',
  'Traktorveg',
  'Sti',
  'Annet',
])

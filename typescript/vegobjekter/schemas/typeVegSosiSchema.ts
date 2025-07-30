import { z } from 'zod'

export const typeVegSosiSchema = z.enum([
  'kanalisertVeg',
  'enkelBilveg',
  'rampe',
  'rundkj\u00F8ring',
  'bilferje',
  'passasjerferje',
  'gangOgSykkelveg',
  'sykkelveg',
  'gangveg',
  'g\u00E5gate',
  'fortau',
  'trapp',
  'gangfelt',
  'gatetun',
  'traktorveg',
  'sti',
  'annet',
])

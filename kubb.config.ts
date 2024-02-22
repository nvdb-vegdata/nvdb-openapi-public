import { defineConfig } from '@kubb/core'
import createSwagger, { Include } from '@kubb/swagger'
import createSwaggerTanstackQuery from '@kubb/swagger-tanstack-query'
import createSwaggerTS from '@kubb/swagger-ts'
import createSwaggerZod from '@kubb/swagger-zod'

const includeVegobjekter = [
  {
    type: 'tag',
    pattern: 'Vegobjekter',
  },
] satisfies Array<Include>

export default defineConfig([
  {
    name: 'Datakatalog',
    root: '.',
    input: {
      path: 'https://nvdbapiles.atlas.vegvesen.no/api-docs/datakatalog',
    },
    output: {
      path: './typescript/datakatalog-kubb',
      clean: true,
    },
    hooks: {
      done: ['npm run lint'],
    },
    plugins: [
      createSwagger({
        output: false,
        validate: true,
      }),
      createSwaggerTS({
        output: { path: 'models' },
        enumType: 'literal',
      }),
      createSwaggerZod({
        output: { path: 'schemas' },
      }),
      createSwaggerTanstackQuery({
        output: { path: 'hooks' },
        parser: 'zod',
        suspense: true,
      }),
    ],
  },
  {
    name: 'Vegobjekter',
    root: '.',
    input: {
      path: 'https://nvdbapiles.atlas.vegvesen.no/api-docs/vegobjekter',
    },
    output: {
      path: './typescript/vegobjekter',
      clean: true,
    },
    hooks: {
      done: ['npm run lint'],
    },
    plugins: [
      createSwagger({
        output: false,
        validate: true,
      }),
      createSwaggerTS({
        output: { path: 'models' },
        enumType: 'literal',
        include: includeVegobjekter,
      }),
      createSwaggerZod({
        output: { path: 'schemas' },
        include: includeVegobjekter,
      }),
      createSwaggerTanstackQuery({
        output: { path: 'hooks' },
        parser: 'zod',
        suspense: true,
        include: includeVegobjekter,
      }),
    ],
  },
])

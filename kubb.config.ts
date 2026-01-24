import { defineConfig } from '@kubb/core'
import { Include, pluginOas } from '@kubb/plugin-oas'
import { pluginReactQuery } from '@kubb/plugin-react-query'
import { pluginTs } from '@kubb/plugin-ts'
import { pluginZod } from '@kubb/plugin-zod'

const includeVegobjekter = [
  {
    type: 'tag',
    pattern: 'Vegobjekter',
  },
] as Array<Include>

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
      done: ['bun run lint'],
    },
    plugins: [
      pluginOas({
        // @ts-ignore
        output: false,
        validate: true,
      }),
      pluginTs({
        output: { path: 'models' },
        enumType: 'literal',
      }),
      pluginZod({
        output: { path: 'schemas' },
      }),
      pluginReactQuery({
        output: { path: 'hooks' },
        parser: 'zod',
        suspense: {},
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
      done: ['bun run lint'],
    },
    plugins: [
      pluginOas({
        // @ts-ignore
        output: false,
        validate: true,
      }),
      pluginTs({
        output: { path: 'models' },
        enumType: 'literal',
        include: includeVegobjekter,
      }),
      pluginZod({
        output: { path: 'schemas' },
        include: includeVegobjekter,
      }),
      pluginReactQuery({
        output: { path: 'hooks' },
        parser: 'zod',
        suspense: {},
        include: includeVegobjekter,
      }),
    ],
  },
])

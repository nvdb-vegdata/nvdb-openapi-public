// kubb.config.ts
import { defineConfig } from '@kubb/core'
import createSwagger from '@kubb/swagger'
import createSwaggerTanstackQuery from '@kubb/swagger-tanstack-query'
import createSwaggerTS from '@kubb/swagger-ts'
import createSwaggerZod from '@kubb/swagger-zod'
var includeVegobjekter = [
  {
    type: 'tag',
    pattern: 'Vegobjekter',
  },
]
var kubb_config_default = defineConfig([
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
export { kubb_config_default as default }
//# sourceMappingURL=data:application/json;base64,ewogICJ2ZXJzaW9uIjogMywKICAic291cmNlcyI6IFsia3ViYi5jb25maWcudHMiXSwKICAic291cmNlc0NvbnRlbnQiOiBbImNvbnN0IF9faW5qZWN0ZWRfZmlsZW5hbWVfXyA9IFwiL2hvbWUvam9hcGV0L3Byb2plY3RzL252ZGItb3BlbmFwaS1wdWJsaWMva3ViYi5jb25maWcudHNcIjtjb25zdCBfX2luamVjdGVkX2Rpcm5hbWVfXyA9IFwiL2hvbWUvam9hcGV0L3Byb2plY3RzL252ZGItb3BlbmFwaS1wdWJsaWNcIjtjb25zdCBfX2luamVjdGVkX2ltcG9ydF9tZXRhX3VybF9fID0gXCJmaWxlOi8vL2hvbWUvam9hcGV0L3Byb2plY3RzL252ZGItb3BlbmFwaS1wdWJsaWMva3ViYi5jb25maWcudHNcIjtpbXBvcnQgeyBkZWZpbmVDb25maWcgfSBmcm9tICdAa3ViYi9jb3JlJ1xuaW1wb3J0IGNyZWF0ZVN3YWdnZXIsIHsgSW5jbHVkZSB9IGZyb20gJ0BrdWJiL3N3YWdnZXInXG5pbXBvcnQgY3JlYXRlU3dhZ2dlclRhbnN0YWNrUXVlcnkgZnJvbSAnQGt1YmIvc3dhZ2dlci10YW5zdGFjay1xdWVyeSdcbmltcG9ydCBjcmVhdGVTd2FnZ2VyVFMgZnJvbSAnQGt1YmIvc3dhZ2dlci10cydcbmltcG9ydCBjcmVhdGVTd2FnZ2VyWm9kIGZyb20gJ0BrdWJiL3N3YWdnZXItem9kJ1xuXG5jb25zdCBpbmNsdWRlVmVnb2JqZWt0ZXIgPSBbXG4gIHtcbiAgICB0eXBlOiAndGFnJyxcbiAgICBwYXR0ZXJuOiAnVmVnb2JqZWt0ZXInLFxuICB9LFxuXSBzYXRpc2ZpZXMgQXJyYXk8SW5jbHVkZT5cblxuZXhwb3J0IGRlZmF1bHQgZGVmaW5lQ29uZmlnKFtcbiAge1xuICAgIG5hbWU6ICdEYXRha2F0YWxvZycsXG4gICAgcm9vdDogJy4nLFxuICAgIGlucHV0OiB7XG4gICAgICBwYXRoOiAnaHR0cHM6Ly9udmRiYXBpbGVzLmF0bGFzLnZlZ3Zlc2VuLm5vL2FwaS1kb2NzL2RhdGFrYXRhbG9nJyxcbiAgICB9LFxuICAgIG91dHB1dDoge1xuICAgICAgcGF0aDogJy4vdHlwZXNjcmlwdC9kYXRha2F0YWxvZy1rdWJiJyxcbiAgICAgIGNsZWFuOiB0cnVlLFxuICAgIH0sXG4gICAgaG9va3M6IHtcbiAgICAgIGRvbmU6IFsnbnBtIHJ1biBsaW50J10sXG4gICAgfSxcbiAgICBwbHVnaW5zOiBbXG4gICAgICBjcmVhdGVTd2FnZ2VyKHtcbiAgICAgICAgb3V0cHV0OiBmYWxzZSxcbiAgICAgICAgdmFsaWRhdGU6IHRydWUsXG4gICAgICB9KSxcbiAgICAgIGNyZWF0ZVN3YWdnZXJUUyh7XG4gICAgICAgIG91dHB1dDogeyBwYXRoOiAnbW9kZWxzJyB9LFxuICAgICAgICBlbnVtVHlwZTogJ2xpdGVyYWwnLFxuICAgICAgfSksXG4gICAgICBjcmVhdGVTd2FnZ2VyWm9kKHtcbiAgICAgICAgb3V0cHV0OiB7IHBhdGg6ICdzY2hlbWFzJyB9LFxuICAgICAgfSksXG4gICAgICBjcmVhdGVTd2FnZ2VyVGFuc3RhY2tRdWVyeSh7XG4gICAgICAgIG91dHB1dDogeyBwYXRoOiAnaG9va3MnIH0sXG4gICAgICAgIHBhcnNlcjogJ3pvZCcsXG4gICAgICAgIHN1c3BlbnNlOiB0cnVlLFxuICAgICAgfSksXG4gICAgXSxcbiAgfSxcbiAge1xuICAgIG5hbWU6ICdWZWdvYmpla3RlcicsXG4gICAgcm9vdDogJy4nLFxuICAgIGlucHV0OiB7XG4gICAgICBwYXRoOiAnaHR0cHM6Ly9udmRiYXBpbGVzLmF0bGFzLnZlZ3Zlc2VuLm5vL2FwaS1kb2NzL3ZlZ29iamVrdGVyJyxcbiAgICB9LFxuICAgIG91dHB1dDoge1xuICAgICAgcGF0aDogJy4vdHlwZXNjcmlwdC92ZWdvYmpla3RlcicsXG4gICAgICBjbGVhbjogdHJ1ZSxcbiAgICB9LFxuICAgIGhvb2tzOiB7XG4gICAgICBkb25lOiBbJ25wbSBydW4gbGludCddLFxuICAgIH0sXG4gICAgcGx1Z2luczogW1xuICAgICAgY3JlYXRlU3dhZ2dlcih7XG4gICAgICAgIG91dHB1dDogZmFsc2UsXG4gICAgICAgIHZhbGlkYXRlOiB0cnVlLFxuICAgICAgfSksXG4gICAgICBjcmVhdGVTd2FnZ2VyVFMoe1xuICAgICAgICBvdXRwdXQ6IHsgcGF0aDogJ21vZGVscycgfSxcbiAgICAgICAgZW51bVR5cGU6ICdsaXRlcmFsJyxcbiAgICAgICAgaW5jbHVkZTogaW5jbHVkZVZlZ29iamVrdGVyLFxuICAgICAgfSksXG4gICAgICBjcmVhdGVTd2FnZ2VyWm9kKHtcbiAgICAgICAgb3V0cHV0OiB7IHBhdGg6ICdzY2hlbWFzJyB9LFxuICAgICAgICBpbmNsdWRlOiBpbmNsdWRlVmVnb2JqZWt0ZXIsXG4gICAgICB9KSxcbiAgICAgIGNyZWF0ZVN3YWdnZXJUYW5zdGFja1F1ZXJ5KHtcbiAgICAgICAgb3V0cHV0OiB7IHBhdGg6ICdob29rcycgfSxcbiAgICAgICAgcGFyc2VyOiAnem9kJyxcbiAgICAgICAgc3VzcGVuc2U6IHRydWUsXG4gICAgICAgIGluY2x1ZGU6IGluY2x1ZGVWZWdvYmpla3RlcixcbiAgICAgIH0pLFxuICAgIF0sXG4gIH0sXG5dKVxuIl0sCiAgIm1hcHBpbmdzIjogIjtBQUF5USxTQUFTLG9CQUFvQjtBQUN0UyxPQUFPLG1CQUFnQztBQUN2QyxPQUFPLGdDQUFnQztBQUN2QyxPQUFPLHFCQUFxQjtBQUM1QixPQUFPLHNCQUFzQjtBQUU3QixJQUFNLHFCQUFxQjtBQUFBLEVBQ3pCO0FBQUEsSUFDRSxNQUFNO0FBQUEsSUFDTixTQUFTO0FBQUEsRUFDWDtBQUNGO0FBRUEsSUFBTyxzQkFBUSxhQUFhO0FBQUEsRUFDMUI7QUFBQSxJQUNFLE1BQU07QUFBQSxJQUNOLE1BQU07QUFBQSxJQUNOLE9BQU87QUFBQSxNQUNMLE1BQU07QUFBQSxJQUNSO0FBQUEsSUFDQSxRQUFRO0FBQUEsTUFDTixNQUFNO0FBQUEsTUFDTixPQUFPO0FBQUEsSUFDVDtBQUFBLElBQ0EsT0FBTztBQUFBLE1BQ0wsTUFBTSxDQUFDLGNBQWM7QUFBQSxJQUN2QjtBQUFBLElBQ0EsU0FBUztBQUFBLE1BQ1AsY0FBYztBQUFBLFFBQ1osUUFBUTtBQUFBLFFBQ1IsVUFBVTtBQUFBLE1BQ1osQ0FBQztBQUFBLE1BQ0QsZ0JBQWdCO0FBQUEsUUFDZCxRQUFRLEVBQUUsTUFBTSxTQUFTO0FBQUEsUUFDekIsVUFBVTtBQUFBLE1BQ1osQ0FBQztBQUFBLE1BQ0QsaUJBQWlCO0FBQUEsUUFDZixRQUFRLEVBQUUsTUFBTSxVQUFVO0FBQUEsTUFDNUIsQ0FBQztBQUFBLE1BQ0QsMkJBQTJCO0FBQUEsUUFDekIsUUFBUSxFQUFFLE1BQU0sUUFBUTtBQUFBLFFBQ3hCLFFBQVE7QUFBQSxRQUNSLFVBQVU7QUFBQSxNQUNaLENBQUM7QUFBQSxJQUNIO0FBQUEsRUFDRjtBQUFBLEVBQ0E7QUFBQSxJQUNFLE1BQU07QUFBQSxJQUNOLE1BQU07QUFBQSxJQUNOLE9BQU87QUFBQSxNQUNMLE1BQU07QUFBQSxJQUNSO0FBQUEsSUFDQSxRQUFRO0FBQUEsTUFDTixNQUFNO0FBQUEsTUFDTixPQUFPO0FBQUEsSUFDVDtBQUFBLElBQ0EsT0FBTztBQUFBLE1BQ0wsTUFBTSxDQUFDLGNBQWM7QUFBQSxJQUN2QjtBQUFBLElBQ0EsU0FBUztBQUFBLE1BQ1AsY0FBYztBQUFBLFFBQ1osUUFBUTtBQUFBLFFBQ1IsVUFBVTtBQUFBLE1BQ1osQ0FBQztBQUFBLE1BQ0QsZ0JBQWdCO0FBQUEsUUFDZCxRQUFRLEVBQUUsTUFBTSxTQUFTO0FBQUEsUUFDekIsVUFBVTtBQUFBLFFBQ1YsU0FBUztBQUFBLE1BQ1gsQ0FBQztBQUFBLE1BQ0QsaUJBQWlCO0FBQUEsUUFDZixRQUFRLEVBQUUsTUFBTSxVQUFVO0FBQUEsUUFDMUIsU0FBUztBQUFBLE1BQ1gsQ0FBQztBQUFBLE1BQ0QsMkJBQTJCO0FBQUEsUUFDekIsUUFBUSxFQUFFLE1BQU0sUUFBUTtBQUFBLFFBQ3hCLFFBQVE7QUFBQSxRQUNSLFVBQVU7QUFBQSxRQUNWLFNBQVM7QUFBQSxNQUNYLENBQUM7QUFBQSxJQUNIO0FBQUEsRUFDRjtBQUNGLENBQUM7IiwKICAibmFtZXMiOiBbXQp9Cg==

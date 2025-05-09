# NVDB OpenAPI

[Nasjonal vegdatabank (NVDB)](https://nvdb.atlas.vegvesen.no/) er en database med informasjon om statlige, kommunale, private, fylkes- og skogsbilveger, levert av Statens vegvesen.

Her finner du kode og eksempler for bruk av verktøy som [openapi-generator](https://openapi-generator.tech/) til å generere modeller fra NVDBs APIer.

## APIer

- LES Områder v4: https://nvdbapiles.atlas.vegvesen.no/api-docs/omrader
- LES Vegobjekter v4: https://nvdbapiles.atlas.vegvesen.no/api-docs/vegobjekter
- LES Vegnett v4: https://nvdbapiles.atlas.vegvesen.no/api-docs/vegnett
- NVDB Datakatalog v1: https://nvdbapiles.atlas.vegvesen.no/api-docs/datakatalog

## Kom i gang

Du trenger en nyere Node-versjon (20+) og NPM tilgjengelig i PATH. Du kan følge [Getting Started](https://openapi-generator.tech/docs/installation), eller installere med NPM:

```
npm install @openapitools/openapi-generator-cli -g
```

For å generere f.eks. en ferdig Java-klient mot vår datakatalog, med `webclient` og Jackson-serialisering, kall dette:

```
openapi-generator-cli generate --input-spec https://nvdbapiles.atlas.vegvesen.no/api-docs/datakatalog \
  --generator-name java \
  --output nvdb-datakatalog \
  --global-property models,apis,modelDocs=false \
  --library restclient \
  --additional-properties serializationLibrary=jackson,packageName=no.vegvesen.nvdb.datakatalog,sourceFolder=src/main/java
```

For å bare generere modeller, med f.eks. Jackson serialisering, kall dette:

```
openapi-generator-cli generate --input-spec https://nvdbapiles.atlas.vegvesen.no/api-docs/datakatalog \
  --generator-name java \
  --output nvdb-datakatalog \
  --global-property models,modelDocs=false \
  --additional-properties serializationLibrary=jackson,packageName=no.vegevesen.nvdb.datakatalog,sourceFolder=src/main/java
```

## Konfigurasjon

Det kan være nyttig å kjenne til alle parametre som kan sendes med som `--global-property`, [her er en oversikt](https://openapi-generator.tech/docs/globals).

I tillegg kan man [se alle generatorene her](https://openapi-generator.tech/docs/generators), med hver sine konfigurasjoner som kan sendes med som `--additional-properties`.

### openapitools.json

Hvis man foretrekker å definere konfigurasjonen i en fil, kan man bruke `openapitools.json`. Denne genereres første gang man kjører `openapi-generator-cli`, og kan utvides med faste konfigurasjoner for flere OpenAPI-samlinger.

Vi anbefaler å initialisere en `package.json` og legge inn `@openapitools/openapi-generator-cli`, da vil man få bedre skjemastøtte når man redigerer `openapitools.json`:

```json
{
  "private": true,
  "scripts": {
    "generate:datakatalog": "rm -rf datakatalog openapi-generator-cli generate --generator-key datakatalog"
  },
  "dependencies": {
    "@openapitools/openapi-generator-cli": "^2.20.0"
  }
}
```

Her er et eksempel på `openapitools.json`:

```json
{
  "$schema": "./node_modules/@openapitools/openapi-generator-cli/config.schema.json",
  "spaces": 2,
  "generator-cli": {
    "version": "7.13.0",
    "generators": {
      "datakatalog": {
        "inputSpec": "https://nvdbapiles.atlas.vegvesen.no/api-docs/datakatalog",
        "output": "datakatalog",
        "generatorName": "java",
        "library": "restclient",
        "apiPackage": "no.vegvesen.nvdb.datakatalog.api",
        "modelPackage": "no.vegvesen.nvdb.datakatalog.model",
        "globalProperty": "models,apis,modelDocs=false,modelTests=false,apiTests=false",
        "additionalProperties": {
          "dateLibrary": "java8-datetime",
          "sourceFolder": "src/main/java"
        }
      }
    }
  }
}
```

For å generere koden kjører man så:

```
npm run generate:datakatalog
```

Se også [package.json](package.json) og [openapitools.json](openapitools.json) i dette repoet for flere eksempler.

### Ferdig genererte eksempler

- [Java-klient for datakatalogen, med Spring Reactive WebClient og Jackson](./java/datakatalog/)
- [Java-klient for vegnett-APIet, med Spring Reactive Webclient og Jackson](./java/vegnett/)
- [Java-klient for vegobjekter-APIet, med Spring Reactive Webclient og Jackson](./java/vegobjekter/)
- [TypeScript-klient for datakatalogen, med fetch](./typescript/datakatalog/)

# Bedre Frontend-støtte med [Kubb](https://www.kubb.dev/)

Støtten for TypeScript i `openapi-generator` er noe grunnleggende. Dersom man ønsker mer avansert funksjonalitet, som generering av [Zod-skjemaer](https://zod.dev) eller [TanStack Query-hooks](https://tanstack.com/query/latest), kan man ta i bruk [Kubb](https://www.kubb.dev/).

I dette repoet finnes et eksempel som genererer ferdige hooks med TanStack Query for React, inkludert fulle Zod-skjema for validering.

Se [package.json](package.json) for installerte pakker (alle som starter med `@kubb`), og [kubb.config.ts](kubb.config.ts) for oppsettet. Generert kode finnes for [datakatalogen](./typescript/datakatalog-kubb/) og [vegobjekter fra NVDB LES API v4](./typescript/vegobjekter/).

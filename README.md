# NVDB OpenAPI

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

For å generere f.eks. en ferdig Kotlin-klient mot vår datakatalog, med `RestClient` og Jackson-serialisering, kall dette:

```
openapi-generator-cli generate --input-spec https://nvdbapiles.atlas.vegvesen.no/api-docs/datakatalog \
  --generator-name kotlin \
  --output nvdb-datakatalog \
  --global-property models,apis,modelDocs=false \
  --library jvm-spring-restclient \
  --additional-properties useSpringBoot3=true,serializationLibrary=jackson,packageName=no.eksempel.nvdb.datakatalog,sourceFolder=src/main/kotlin
```

Hvis du heller ønsker en full Kotlin-implementasjon med `kotlinx.serialization`, kall dette:

```
openapi-generator-cli generate --input-spec https://nvdbapiles.atlas.vegvesen.no/api-docs/datakatalog \
  --generator-name kotlin \
  --output nvdb-datakatalog \
  --global-property models,apis,modelDocs=false \
  --library multiplatform \
  --additional-properties dateLibrary=kotlinx-datetime,packageName=no.eksempel.nvdb.datakatalog,sourceFolder=src/main/kotlin
```

For å bare generere modeller, med f.eks. Jackson serialisering, kall dette:

```
openapi-generator-cli generate --input-spec https://nvdbapiles.atlas.vegvesen.no/api-docs/datakatalog \
  --generator-name kotlin \
  --output nvdb-datakatalog \
  --global-property models,modelDocs=false \
  --additional-properties serializationLibrary=jackson,packageName=no.eksempel.nvdb.datakatalog,sourceFolder=src/main/kotlin
```

### Konfigurasjon

Det kan være nyttig å kjenne til alle parametre som kan sendes med som `--global-property`, [her er en oversikt](https://openapi-generator.tech/docs/globals).

I tillegg kan man [se alle generatorene her](https://openapi-generator.tech/docs/generators), med hver sine konfigurasjoner som kan sendes med som `--additional-properties`.

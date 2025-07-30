# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Architecture

This repository contains OpenAPI-generated client libraries for Norwegian National Road Database (NVDB) APIs. The project supports multiple programming languages and build systems:

- **Java clients** (in `java/` directory) - Using Spring WebClient with Jackson serialization
- **Kotlin clients** (in `kotlin/` directory) - Using Spring RestClient with Jackson serialization
- **TypeScript clients** (in `typescript/` directory) - Using fetch API
- **Advanced TypeScript** (in `typescript/*-kubb/` directories) - Generated with Kubb for TanStack Query hooks and Zod schemas

### Generated APIs

The project generates clients for these NVDB APIs:

- **Datakatalog** - Data catalog and metadata
- **Vegnett** - Road network data
- **Vegobjekter** - Road objects and features

All API clients are generated from OpenAPI specifications hosted at `https://nvdbapiles.atlas.vegvesen.no/api-docs/`.

## Development Commands

### Code Generation

```bash
# Generate all clients
npm run generate

# Generate specific clients
npm run generate:datakatalog-java
npm run generate:vegnett-java
npm run generate:vegobjekter-java
npm run generate:datakatalog-ts
npm run generate:vegnett-kotlin
npm run generate:kubb
```

### Linting and Formatting

```bash
# Format all files with Prettier
npm run lint

# For Kotlin code (run from kotlin/ directory)
./gradlew spotlessApply
```

### Building and Testing

```bash
# For Java projects
mvn clean install
mvn test

# For Kotlin projects (from kotlin/ directory)
./gradlew build
./gradlew test
```

## Configuration Files

- **openapitools.json** - Main configuration for OpenAPI Generator with settings for each client
- **kubb.config.ts** - Configuration for advanced TypeScript generation with TanStack Query and Zod
- **package.json** - NPM scripts and dependencies for generation tools

## Working with Generated Code

- Generated code should NOT be manually edited as it will be overwritten on regeneration
- Client tests are located in `java/java-client-tests/src/test/kotlin/`
- Generated documentation is in `docs/` directories within each client
- Kotlin clients use Spring Boot 3 with Jakarta EE and Java 17
- Java clients use Spring WebClient with Jackson for JSON serialization

## Package Structure

Generated clients follow consistent package naming:

- API classes: `no.vegvesen.vt.nvdb.{api}.api`
- Model classes: `no.vegvesen.vt.nvdb.{api}.model`
- Infrastructure: `no.vegvesen.vt.nvdb.{api}.infrastructure`

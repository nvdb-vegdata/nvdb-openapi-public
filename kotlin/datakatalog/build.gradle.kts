plugins {
    kotlin("jvm") version "2.2.0"
    kotlin("plugin.serialization") version "2.2.0"
}

group = "no.vegvesen.vt.nvdb.apiles"
version = "1.0.0"

val kotlin_version = "2.2.0"
val datetime_version = "0.7.1"
val coroutines_version = "1.10.2"
val serialization_version = "1.9.0"
val ktor_version = "3.2.2"
val kotest_version = "5.9.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutines_version")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:$serialization_version")

    api("io.ktor:ktor-client-core:$ktor_version")
    api("io.ktor:ktor-client-serialization:$ktor_version")
    api("io.ktor:ktor-client-content-negotiation:$ktor_version")
    api("io.ktor:ktor-serialization-kotlinx-json:$ktor_version")
    api("org.jetbrains.kotlinx:kotlinx-datetime:$datetime_version")
    api("com.squareup.moshi:moshi-kotlin:1.15.2")

    testImplementation("io.ktor:ktor-client-cio-jvm:$ktor_version")
    testImplementation("io.kotest:kotest-runner-junit5:$kotest_version")
    testImplementation("io.kotest:kotest-assertions-core:$kotest_version")
}

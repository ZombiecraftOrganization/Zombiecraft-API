plugins {
    id("java")
}

group = "net.stephcraft"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // compileOnly(projectOrGithubPackage(":zombiecraft-utility", "shadow"))

    // spigot
    compileOnly("org.spigotmc:spigot:1.19.3-R0.1-SNAPSHOT:remapped-mojang")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
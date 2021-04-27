plugins {
    kotlin("jvm") version "1.4.32"
    kotlin("plugin.jpa")      version "1.4.21"
    kotlin("plugin.allopen")  version "1.4.21"
    kotlin("plugin.noarg")    version "1.4.21"
}

group = "study"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.hibernate:hibernate-core:5.4.30.Final")
    implementation("com.h2database:h2:1.4.199")
}


allOpen {
    annotation("javax.persistence.Entity")
    annotation("javax.persistence.MappedSuperclass")
    annotation("javax.persistence.Embeddable")
}
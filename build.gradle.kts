import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  id("org.springframework.boot") version "3.0.1"
  id("io.spring.dependency-management") version "1.1.0"
  id("org.asciidoctor.jvm.convert") version "3.3.2"
  kotlin("jvm") version "1.8.0"
  kotlin("plugin.spring") version "1.8.0"
  kotlin("plugin.jpa") version "1.8.0"
}

group = "com.waterfogsw"
version = "0.0.1-snapshot"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
  mavenCentral()
}

val snippetsDir by extra { file("build/generated-snippets") }

allOpen {
  annotation("javax.persistence.Entity")
  annotation("javax.persistence.MappedSuperclass")
  annotation("javax.persistence.Embeddable")
}

dependencies {
  implementation("org.springframework.boot:spring-boot-starter-web")
  implementation("org.springframework.boot:spring-boot-starter-validation")
  implementation("org.springframework.boot:spring-boot-starter-data-jpa")
  implementation("org.springframework.boot:spring-boot-starter-data-redis")
  implementation("org.jetbrains.kotlin:kotlin-reflect")
  implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

  runtimeOnly("com.mysql:mysql-connector-j:8.0.31")

  annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")

  testImplementation("org.springframework.boot:spring-boot-starter-test")
  testImplementation("org.springframework.restdocs:spring-restdocs-mockmvc")
  testImplementation("io.kotest:kotest-runner-junit5:5.5.4")
  testImplementation("io.kotest:kotest-assertions-core:5.5.4")
}

tasks.jar {
  enabled = false
}

tasks.withType<KotlinCompile> {
  kotlinOptions {
    freeCompilerArgs = listOf("-Xjsr305=strict")
    jvmTarget = "17"
  }
}

tasks.withType<Test> {
  useJUnitPlatform()
}

tasks.test {
  outputs.dir(snippetsDir)
}

tasks.asciidoctor {
  inputs.dir(snippetsDir)
  dependsOn(tasks.test)
}

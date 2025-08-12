plugins {
	java
	id("org.springframework.boot") version "3.5.4" apply false
	id("io.spring.dependency-management") version "1.1.7" apply false
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

repositories {
	mavenCentral()
}

dependencies {
	//implementation("javax.persistence:javax.persistence-api:2.2")
	//implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	//implementation("org.springframework.boot:spring-boot-starter-web")
	//implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-server")
	//developmentOnly("org.springframework.boot:spring-boot-devtools")
	//runtimeOnly("com.h2database:h2")
	//testImplementation("org.springframework.boot:spring-boot-starter-test")
	//testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<JavaCompile> {
	options.compilerArgs.add("-parameters")
}

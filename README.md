# Spring-Boot-CRUD

## 개발환경 및 개발스택
* Intellij IDEA
* Git + Source Tree + Github
* Max OS X
* SpringBoot 2.0.0
* JAVA 8
* Gradle
* Postman
* Handlebars(템플릿 엔진)
* Bootstrap
* JPA+하이버네이트
* AWS RDS MySQL

## Dependencies
* Web
* JPA
* H2
* Lombok
* Actuator
* JDBC
* MySQL Connector

```groovy
buildscript {
    ext {
        springBootVersion = '2.0.0.RELEASE'
    }
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:${springBootVersion}")
        classpath "io.spring.gradle:dependency-management-plugin:1.0.4.RELEASE"
    }
}

apply plugin: 'java'
apply plugin: 'eclipse'
apply plugin: 'org.springframework.boot'
apply plugin: 'io.spring.dependency-management'

group = 'com.sml'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = 1.8

repositories {
    mavenCentral()
}

ext['hibernate.version'] = '5.2.11.Final' //추가


dependencies {
    compile('org.springframework.boot:spring-boot-starter-actuator')
    compile('org.springframework.boot:spring-boot-starter-data-jpa')
    compile('org.springframework.boot:spring-boot-starter-web')
    compile 'pl.allegro.tech.boot:handlebars-spring-boot-starter:0.3.0'
    compile("org.springframework:spring-jdbc:+")
    compile("commons-dbcp:commons-dbcp:1.4")
    compile("mysql:mysql-connector-java:5.1.31")
    compile('org.springframework.boot:spring-boot-starter-jdbc')
    runtime('com.h2database:h2')
    compileOnly('org.projectlombok:lombok')
    testCompile('org.springframework.boot:spring-boot-starter-test')
}

```


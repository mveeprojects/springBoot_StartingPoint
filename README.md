# springBoot_StartingPoint
Basic starting point created while writing a blog post on Spring Boot

Open using IntelliJ (File -> open -> click on pom.xml -> open -> open as project)

Run using __./mvnw clean compile spring-boot:run__

## Docker

* ./mvnw clean package docker:build
* docker images
* docker run -d -p 8080:8080 <imageId>
* docker ps
* localhost:8080
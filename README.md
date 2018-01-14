# springBoot_StartingPoint
To run with JVM/JMX metrics exposed:
* ./mvnw clean package
* docker build .
* docker images
* docker run -d -p8080:8080 -p1234:1234 __imageid__

http://localhost:8080 -> app endpoint

http://localhost:1234 -> JMX endpoint

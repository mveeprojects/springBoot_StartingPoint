# springBoot_StartingPoint
Basic starting point created while writing a blog post on Spring Boot

Open using IntelliJ (File -> open -> click on pom.xml -> open -> open as project)

### Steps taken to modify original master branch to this version:

__(Notes for blog)__

Based on the following tutorial

https://www.youtube.com/watch?v=U8nmVUBRmFQ

Tutorial source code

https://github.com/dheeraj-mummareddy/micro-services/tree/master/tests/user-microservice-gatling-tests

Complete working finished version based on Suited & (Spring) Booted

https://github.com/MarkVee87/springBoot_StartingPoint/tree/gatling

Make sure scala plugin and scala sdk are installed and working by following this tutorial:

https://www.jetbrains.com/help/idea/creating-and-running-your-scala-application.html

Add dependency to pom.xml

> <dependencies>
     <dependency>
        <groupId>io.gatling.highcharts</groupId>
        <artifactId>gatling-charts-highcharts</artifactId>
        <version>2.2.5</version>
        <scope>test</scope>
     </dependency>
> </dependencies>

Add plugin to pom.xml

> <plugins>
    <plugin>
        <groupId>io.gatling</groupId>
        <artifactId>gatling-maven-plugin</artifactId>
        <version>2.2.4</version>
    </plugin>
> </plugins>

Add src/test/scala dir

Set up new scala dir as a Test dir in IntelliJ

cmd + ; -> modules

Click on src/test/scala dir and click on the green Tests icon

Press ok to close window

Right click the new scala dir -> new -> package

Call it 'hello' to match the package name of the code

Add three packages under the new hello package
 - scenarios
 - simulations
 - utils

Scala objects & scala class in new packages:

utils/Environment.scala (new scala Object)
 - baseURL, users, maxResponseTime

utils/Headers.scala (new scala Object)
 - Map of default headers for usage when making http requests during tests

scenarios/GetRootEndpoint.scala (new scala Object)
 - val getHelloWorldEndpoint - HttpRequestBuilder object defines endpoint to be appended onto baseURL to test against and the type of check to perform
 - val getHomeEndpoint - creates Scenario object and includes .exec class call to run the test according to the HttpRequestBuilder object (getHelloWorldEndpoint)

simulation/EndpointLoadSimulations.scala (new scala Class)
 - extends Simulation
 - httpConf - pulls values from both scala objects in the utils package to set up the base run conditions
 - basicEndpointCheckScenarios - defines the test scenarios (comma separated) that this simulation should run
 - setUp - uses the config assigned to the httpConf variable as well as defining the overall duration and additional assertions to make (e.g. maximum run time of the simulation)

Run Gatling tests using terminal command

mvn clean gatling:execute

Open chrome -> file:///<value after 'Please open the following file:' in maven output>


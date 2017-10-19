package hello.scenarios

import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder
import io.gatling.http.Predef._
import io.gatling.http.request.builder.HttpRequestBuilder

object GetRootEndpoint {

  val getHelloWorldEndpoint: HttpRequestBuilder = http("touch the root url")
    .get("/")
    .check(status is 200)

  val getHomeEndpoint: ScenarioBuilder = scenario("Checking root url returns OK under load")
    .exec(getHelloWorldEndpoint)
}
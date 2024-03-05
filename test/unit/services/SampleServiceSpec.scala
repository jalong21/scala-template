package unit.services

import akka.stream.Materializer
import akka.util.Timeout
import controllers.HealthController
import org.scalatest.Matchers.convertToAnyShouldWrapper
import org.scalatestplus.mockito.MockitoSugar
import org.scalatestplus.play._
import org.scalatestplus.play.guice.GuiceOneAppPerSuite
import play.api.http.Status.{NO_CONTENT, OK}
import play.api.test.Helpers.{GET, status}
import play.api.test._
import services.SampleService

import scala.concurrent.duration.DurationInt

class SampleServiceSpec extends PlaySpec with MockitoSugar with GuiceOneAppPerSuite {

  implicit lazy val materializer: Materializer = app.materializer
  implicit val timeout: Timeout = Timeout(5.seconds)

  "SampleService" must {
    "return true from doTheThing" in {

      val result = SampleService.doTheThings
      result shouldBe Some(true)
    }
  }
}

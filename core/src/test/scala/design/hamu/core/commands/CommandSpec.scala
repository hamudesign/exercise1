package design.hamu.core.commands

import org.scalatest.matchers.must.Matchers
import org.scalatest.wordspec.AnyWordSpec

class CommandSpec extends AnyWordSpec with Matchers {
  "Command" should {
    "produce the correct command for key word 'greet'" in {
      Command("greet") must equal(GreetCommand)
    }
  }
}

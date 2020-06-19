package design.hamu.core.command

import design.hamu.core.command.GreetCommand
import org.scalatest.matchers.must.Matchers
import org.scalatest.wordspec.AnyWordSpec

class GreetCommandSpec extends AnyWordSpec with Matchers {
  "Greet command" should {
    "greet a given name" in {
      GreetCommand.run(List("Michael")) must equal("Hello Michael")
    }
  }
}

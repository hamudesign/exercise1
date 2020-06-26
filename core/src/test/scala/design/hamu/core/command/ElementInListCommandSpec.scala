package design.hamu.core.command

import design.hamu.core.command.GreetCommand
import org.scalatest.matchers.must.Matchers
import org.scalatest.wordspec.AnyWordSpec

class ElementInListCommandSpec extends AnyWordSpec with Matchers {
  "list command" should {
    "have a list and N" in {
      ElementInListCommand.run(List("apple,orange,pineapple 2")) must equal("pineapple")
    }
  }
}

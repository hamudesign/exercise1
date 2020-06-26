package design.hamu.core.command

import design.hamu.core.command.FibCommand
import org.scalatest.matchers.must.Matchers
import org.scalatest.wordspec.AnyWordSpec

class FibCommandSpec extends AnyWordSpec with Matchers {
  "Fib command" should {
    "generate the fibbonaci numbers" in {
      FibCommand.run(List("10")) must equal("55")
    }

    "return input if input is 1 or less" in {
      FibCommand.run(List("1")) must equal("1")
      FibCommand.run(List("0")) must equal("0")
      FibCommand.run(List("-10")) must equal("-10")
    }
  }
}

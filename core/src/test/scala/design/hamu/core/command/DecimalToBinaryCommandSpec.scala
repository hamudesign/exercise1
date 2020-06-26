package test.scala.design.hamu.core.command

import design.hamu.core.command.DecimalToBinaryCommand
import org.scalatest.matchers.must.Matchers
import org.scalatest.wordspec.AnyWordSpec

class DecimalToBinaryCommandSpec extends AnyWordSpec with Matchers {
  "DecimalToBinary command" should {
    "given a positive int" in {
      DecimalToBinaryCommand.run(List("20")) must equal("10100")
    }
    "given a 0" in {
      DecimalToBinaryCommand.run(List("0")) must equal("0")
    }
    "given a negative int" in {
      DecimalToBinaryCommand.run(List("-20")) must equal("-10100")
    }
  }
}

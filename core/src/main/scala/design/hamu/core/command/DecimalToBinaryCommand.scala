package design.hamu.core.command

object DecimalToBinaryCommand extends Command {

  def toBinaryCalculate(decimal: Int, finalString: String): String = {
    if (decimal == 0) finalString
    else toBinaryCalculate((decimal - decimal % 2) / 2, s"${decimal % 2}" + finalString)
  }

  def toBinary(decimal: Int): String = {
    if (decimal == 0) "0"
    else if (decimal < 0) s"-${toBinaryCalculate(math.abs(decimal), "")}"
    else toBinaryCalculate(decimal, "")
  }

  def run(ls: List[String]): String = ls match {
    case decimal :: tail =>
      toBinary(decimal.toInt)
  }
}

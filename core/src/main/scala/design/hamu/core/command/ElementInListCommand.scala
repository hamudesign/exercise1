package design.hamu.core.command

object ElementInListCommand extends Command {

  def run(ls: List[String]): String = ls match {
    case listAndN :: tail =>
      val arr = listAndN.split(" ")
      val list = arr(0).split(",")
      val N = arr(1).toInt
      s"${list(N)}" // Assuming starting at 0
  }
}
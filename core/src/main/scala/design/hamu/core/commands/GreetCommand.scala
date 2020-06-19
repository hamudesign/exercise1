package design.hamu.core.commands

object GreetCommand extends Command {
  def run(ls: List[String]): String = ls match {
    case name :: tail =>
      s"Hello ${name}"
  }
}

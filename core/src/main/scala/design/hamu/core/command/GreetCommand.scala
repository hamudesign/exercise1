package design.hamu.core.command

object GreetCommand extends Command {
  def run(ls: List[String]): String = ls match {
    case name :: tail =>
      s"Hello ${name}"
  }
}

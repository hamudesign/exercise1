package design.hamu.core.commands

trait Command {
  def run(ls: List[String]): String
}

object Command {
  def apply(string: String): Command = string match {
    case "greet" => GreetCommand
  }
}
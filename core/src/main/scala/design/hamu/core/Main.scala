package design.hamu.core

import design.hamu.core.command.Command

object Main extends App {
  args.toList match {
    case head :: tail =>
      val result = Command(head).run(tail)
      println(result)
  }
}

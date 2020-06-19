package design.hamu.core

import design.hamu.core.commands.Command

object Main {
  def main(args: Array[String]): Unit = args.toList match {
    case head :: tail =>
      val result = Command(head).run(tail)
      println(result)
  }
}

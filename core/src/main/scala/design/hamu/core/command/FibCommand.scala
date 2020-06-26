package design.hamu.core.command

object FibCommand extends Command {

  // catch parameter, convert to int, pass to fib()
  def run(ls: List[String]): String = ls match {
    case (head: String) :: (tail: List[String]) => {
      fib(head.toInt).toString
    }
  }

  def fib(n: Int): Int = n match {
    case n if n <= 1 => n
    case _ => (fib(n - 1) + fib(n - 2))
  }
}

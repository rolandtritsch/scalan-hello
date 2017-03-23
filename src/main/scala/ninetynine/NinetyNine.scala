package ninetynine

object NinetyNine {
  def p01FindLast(list: List[Int]): Int = {
    def go(l: List[Int]): Int = l match {
      case List(i) => i
      case _ => go(l.tail)
    }
    go(list)
  }

  def main(args: Array[String]): Unit = {
    val list = (0 to 9).toList
    println(s"Last of >${list}< is >${p01FindLast(list)}<")
  }
}
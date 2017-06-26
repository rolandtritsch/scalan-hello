package ninetynine

object NinetyNine {
  def p01FindLast(list: List[Int]): Int = {
    def last(l: List[Int]): Int = l match {
      case List(i) => i
      case _ => last(l.tail)
    }
    last(list)
  }

  def p02FindLastButOne(list: List[Int]): Int = {
    require(list.size >= 2, s"list.size >= 2 failed with >${list.size}<")
    def lastButOne(l: List[Int]): Int = l match {
      case List(i, _) => i
      case _ => lastButOne(l.tail)
    }
    lastButOne(list)
  }

  def p03FindNth(nth: Int, list: List[Int]): Int = {
    require(nth >= 0 && nth <= list.size - 1, s"nth >= 0 && nth <= list.size - 1 - failed")
    list(nth)
  }

  def main(args: Array[String]): Unit = {
    val list = (0 to 9).toList
    println(s"Last of >${list}< is >${p01FindLast(list)}<")
    println(s"Last but one of >${list}< is >${p02FindLastButOne(list)}<")

    val nth = 5
    println(s"Access >${nth}< in >${list}< returns >${p03FindNth(nth, list)}<")
  }
}
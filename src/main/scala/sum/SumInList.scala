package sum

object SumInList {

  def gen(len: Int) : Seq[(Int, Int)] = {
    for (i ← 0 until len;
         j ← len - 1 until i by -1)
    yield (i, j)
  }

  def check(sum: Int, ints: Int*): Boolean = {
    gen(ints.length)
      .filter(p ⇒ ints(p._1) + ints(p._2) == sum)
    .length > 0
  }
}

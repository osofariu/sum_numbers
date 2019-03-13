package sum

object SumInList {

  def check(sum: Int, nums: Int*): Boolean = {
    gen(nums.length)
      .filter(p ⇒ nums(p._1) + nums(p._2) == sum)
      .length > 0
  }

  def gen(len: Int) : Seq[(Int, Int)] = {
    for (i ← 0 until len;
         j ← len - 1 until i by -1)
    yield (i, j)
  }

  def checkSimple(sum: Int, nums: Int*) : Boolean = {
    nums.map(num ⇒ nums.contains(sum - num))
      .filter(_ == true)
      .length > 0
  }
}

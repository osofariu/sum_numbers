package sum

import org.scalatest._

class SumInListTest extends path.FunSpec with Matchers {

  describe("SumInList") {

    it("check returns false when list of numbers is empty") {
      testSumSolutions(false, 12)
    }

    it("check returns false when list of numbers has just one item") {
      testSumSolutions(false, 12, 12)
    }

    it ("check returns false when list of three numbers has no matching sum") {
      testSumSolutions(false, 10, 1, 2, 7)
    }

    it("check returns true when list of two numers has matching sum") {
      testSumSolutions(true, 10, 8, 2)
    }

    it ("check returns false when list of three numbers has matching sum at beginning") {
      testSumSolutions(true, 3, 1, 2, 7)
    }

    it ("check returns true when list of three numbers has matching sum at end") {
      testSumSolutions(true, 10, 3, 2, 8)
    }

    it ("check returns false when list of three numbers has matching sum in middle") {
      testSumSolutions(true, 9, 1, 2, 7, 13) 
    }

    describe("gen") {
      it("makes no pairs when length is 0") {
        assert(SumInList.gen(0) == Seq())
      }
      it("makes no pairs when length is 1") {
        assert(SumInList.gen(1) == Seq())
      }
      it("makes pairs for two") {
        assert(SumInList.gen(2) == Seq((0, 1)))
      }
      it("makes pairs for three") {
        assert(SumInList.gen(3).toSet == Set((0, 1),(0, 2), (1, 2)))
      }
    }
  }

  def testSumSolutions(expectedResult: Boolean, sum: Int, nums: Int*) = {
    val res1 : Boolean = SumInList.check(sum, nums: _*)
    val res2 : Boolean = SumInList.checkSimple(sum, nums: _*)
    res1 shouldBe res2
    res1 shouldBe expectedResult
  }
}

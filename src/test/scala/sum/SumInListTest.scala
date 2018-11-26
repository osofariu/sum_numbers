package sum

import org.scalatest.path

class SumInListTest extends path.FunSpec {

  describe("SumInList") {

    it("check returns false when list of numbers is empty") {
      assert(SumInList.check(12) == false)
    }

    it("check returns false when list of numbers has just one item") {
      assert(SumInList.check(12, 12) == false)
    }

    it ("check returns false when list of three numbers has no matching sum") {
      assert(SumInList.check(10, 1, 2, 7) == false)
    }

    it("check returns true when list of two numers has matching sum") {
      assert(SumInList.check(10, 8, 2) == true)
    }

    it ("check returns false when list of three numbers has matching sum at beginning") {
      assert(SumInList.check(3, 1, 2, 7) == true)
    }

    it ("check returns true when list of three numbers has matching sum at end") {
      assert(SumInList.check(10, 3, 2, 8) == true)
    }

    it ("check returns false when list of three numbers has matching sum in middle") {
      assert(SumInList.check(9, 1, 2, 7, 13) == true)
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
}

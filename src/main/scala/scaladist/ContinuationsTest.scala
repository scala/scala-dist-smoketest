package scaladist

import scala.util.continuations._

object ContinuationsTest {
  def foo(): Int @cps[Int] = { // could leave out return type
    shift { k: (Int=>Int) =>
      k(7)
    } + 1
  }

  def test(): Unit = {
    assert(reset(2 * foo()) == 16)
  }
}

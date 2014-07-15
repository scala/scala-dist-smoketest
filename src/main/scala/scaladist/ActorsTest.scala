package scaladist

import scala.actors._
import scala.actors.Actor._

object ActorsTest {
  def test(): Unit = {
    val a = actor {
      react { case x: Int => assert(x == 0) }
    }

    a ! 0
  }
}

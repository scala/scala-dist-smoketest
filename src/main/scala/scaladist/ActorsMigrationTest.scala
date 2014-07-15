package scaladist

import scala.actors._
import scala.actors.Actor._
import scala.actors.migration._

object ActorsMigrationTest {
  def test(): Unit = {
    val a = ActorDSL.actor(new Actor {
      def act() {
        react { case x: Int => assert(x == 0) }
      }
   })

    a ! 0
  }
}

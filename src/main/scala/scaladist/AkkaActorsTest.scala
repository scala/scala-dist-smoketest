package scaladist

import akka.actor.{Actor, Props, ActorSystem}

object AkkaActorsTest {

  class A extends Actor {
    def receive = {
      case x: Int => sender() ! x + 1
    }
  }

  class B extends Actor {
    def receive = {
      case "start" => a ! 0
      case x: Int =>
        assert(x == 1)
        system.shutdown
    }
  }

  val system = ActorSystem("t")
  val a = system.actorOf(Props[A], "a")
  val b = system.actorOf(Props[B], "b")

  def test(): Unit = {
    b ! "start"
  }
}

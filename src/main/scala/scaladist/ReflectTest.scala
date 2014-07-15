package scaladist

import scala.reflect.runtime.universe._

object ReflectTest {
  def test(): Unit = {
    val t = typeOf[List[Int]]
    assert(t.member(TermName("map")).toString == "method map")
  }
}
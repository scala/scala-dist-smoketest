package scaladist

import scala.util.Properties.versionString

object Main extends App {
  println(s"scala.util.Properties.versionString: $versionString")
  XmlTest.test()
  ScalapTest.test()
  ReflectTest.test()
}

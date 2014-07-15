package scaladist

object ScalapTest {
  def test(): Unit = {
    val s = new java.io.ByteArrayOutputStream()
    Console.withOut(s) {
      scala.tools.scalap.Main.usage()
    }
    assert(s.toString() contains "scalap")
  }
}
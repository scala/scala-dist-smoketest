package scaladist

object XmlTest {
  def test(): Unit = {
    <hallo>mai mai</hallo> match {
      case <hallo>{text}</hallo> => assert(text.toString == "mai mai")
    }
  }
}

package scaladist

import scala.swing._

object SwingTest {
  def test(): Unit = {
    val label = new Label("hi")
    assert(label.text == "hi")
  }
}

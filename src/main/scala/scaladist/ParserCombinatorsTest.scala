package scaladist

import scala.util.parsing.combinator._

object ParserCombinatorsTest extends RegexParsers {
  def sign = "-"
  def number = "\\d+".r
  type ResultType = Option[String] ~ String
  def p: Parser[ResultType] = sign.? ~ number

  def test(): Unit = {
    (parseAll(p, "-512") : @unchecked) match {
      case Success(Some("-") ~ "512", _) => ()
    }
  }
}

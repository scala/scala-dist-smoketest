package metabuild

import sbt._

object Dependencies {
  def scalaDistVersion = sys.props("project.version")
}

object Configs {
  lazy val BogusConfig = config("bogus")
}

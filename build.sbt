// be scala steward friendly, as per scala/scala-dist-smoketest#45
ThisBuild / dynverSeparator := "-"

scalaVersion := version.value
libraryDependencies += "org.scala-lang" % "scala-dist" % version.value

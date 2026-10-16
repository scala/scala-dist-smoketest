version := sys.props.get("project.version").getOrElse("2.13.18")
scalaVersion := version.value
libraryDependencies += "org.scala-lang" % "scala-dist" % version.value

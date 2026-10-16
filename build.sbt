version := sys.props.get("project.version").getOrElse("2.12.4")
scalaVersion := version.value
libraryDependencies += "org.scala-lang" % "scala-dist" % version.value

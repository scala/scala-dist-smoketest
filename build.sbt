version := sys.props.get("project.version").getOrElse("2.13.10")
scalaVersion := version.value
libraryDependencies += "org.scala-lang" % "scala-dist" % version.value

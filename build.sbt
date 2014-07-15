versionWithGit

scalaVersion := version.value

libraryDependencies += "org.scala-lang" % "scala-dist" % version.value

//autoCompilerPlugins := true

//val addContinuationsPlugin = taskKey[Unit]("Add continuations plugin")

//addContinuationsPlugin := {
//  println(update.value.allModules.find(_.name contains "continuations-plugin"))
//  compilerPlugin(update.value.allModules.find(_.name contains "continuations-plugin").get)
//}

//libraryDependencies += compilerPlugin(update.value.allModules.find(_.name contains "continuations-plugin").get)

//scalacOptions += "-P:continuations:enable"

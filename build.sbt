versionWithGit

scalaVersion := version.value

libraryDependencies += "org.scala-lang" % "scala-dist" % version.value

// TODO: find out how to enable continuations plugin. also un-comment ContinuationsTest afterwards!
// http://stackoverflow.com/questions/24755254/how-to-enable-compiler-plugin-from-librarydependencies

//autoCompilerPlugins := true

//val addContinuationsPlugin = taskKey[Unit]("Add continuations plugin")

//addContinuationsPlugin := {
//  println(update.value.allModules.find(_.name contains "continuations-plugin"))
//  compilerPlugin(update.value.allModules.find(_.name contains "continuations-plugin").get)
//}

//libraryDependencies += compilerPlugin(update.value.allModules.find(_.name contains "continuations-plugin").get)

//scalacOptions += "-P:continuations:enable"

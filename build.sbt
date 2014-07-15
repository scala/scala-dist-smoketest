versionWithGit

scalaVersion := version.value

libraryDependencies += "org.scala-lang" % "scala-dist" % version.value

// funky way to enable the continuations plugin.
// http://stackoverflow.com/questions/24755254/how-to-enable-compiler-plugin-from-librarydependencies
scalacOptions ++= {
  val compileConfig = update.value.configurations.find(_.configuration == "compile").get
  val pluginModule = compileConfig.modules.find(_.module.name contains "continuations-plugin").get
  val pluginFile = pluginModule.artifacts.head._2
  Seq(s"-Xplugin:${pluginFile.getCanonicalPath}", "-P:continuations:enable")
}

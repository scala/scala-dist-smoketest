versionWithGit

val scalaDistVersion = settingKey[String]("e.g. 2.11.1")

scalaDistVersion := "2.11.1"

scalaVersion := scalaDistVersion.value

libraryDependencies += "org.scala-lang" % "scala-dist" % scalaDistVersion.value

scalacOptions += "-P:continuations:enable"

// We add the plugin JAR to the classpath manually with -Xplugin, rather than
// relying on `autoCompilerPlugins`, which is not straight forward if we want
// to look up the versions of the continuations plugin from within `scala-dist.pom.`
//
// Discussion: http://stackoverflow.com/questions/24755254/how-to-enable-compiler-plugin-from-librarydependencies
scalacOptions in Compile += {
  val cp = (externalDependencyClasspath in Compile).value
  def fail = sys.error("plugin not found in " + cp)
  val plugin = cp.find(_.data.getName contains "continuations-plugin").getOrElse(fail)
  "-Xplugin:" + plugin.data
}

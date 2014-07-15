import metabuild.Dependencies._
import metabuild.Configs._

lazy val continuationPluginVersion = taskKey[String]("version of the continuation plugin")

lazy val build = (project in file(".")).
  configs(BogusConfig).
  settings(inConfig(BogusConfig)(Defaults.configSettings): _*).
  settings(buildInfoSettings: _*).
  settings(addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "0.6.4"): _*).
  settings(
    resolvers += "jgit-repo" at "http://download.eclipse.org/jgit/maven",
    libraryDependencies += "org.scala-lang" % "scala-dist" % scalaDistVersion % BogusConfig,
    sourceGenerators in Compile <+= buildInfo,
    buildInfoKeys := Seq[BuildInfoKey](
      "scalaDistVersion" -> scalaDistVersion,
      continuationPluginVersion
    ),
    buildInfoPackage := "metabuild",
    continuationPluginVersion := {
    	val bogusClasspath = (externalDependencyClasspath in BogusConfig).value
    	val f = (bogusClasspath find { _.data.getName contains "continuations-plugin" }).get.data
    	f.getName.replaceAllLiterally("scala-continuations-plugin_" + scalaDistVersion + "-", "").replaceAllLiterally(".jar", "")
    }
  )

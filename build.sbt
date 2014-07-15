import metabuild.BuildInfo._

// versionWithGit

version := scalaDistVersion

scalaVersion := version.value

libraryDependencies += "org.scala-lang" % "scala-dist" % version.value

autoCompilerPlugins := true

libraryDependencies +=
  compilerPlugin("org.scala-lang.plugins" % ("scala-continuations-plugin_" + version.value) % continuationPluginVersion)

scalacOptions += "-P:continuations:enable"

# Smoke Tests for Scala Distributions

An sbt project that touches all dependencies built with a Scala release. Makes sure that the JARs exist and work.

Runs as a GitHub Actions workflow during the release, called from the scala-dist release workflow once the
distribution is uploaded. To test a version manually, run the Smoketest workflow from the Actions tab.

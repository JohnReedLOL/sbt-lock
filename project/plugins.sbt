addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.3.1")
addSbtPlugin("com.github.gseitz" % "sbt-release" % "0.8.2")
//addSbtPlugin("com.github.tkawachi" % "sbt-lock" % "0.2.2")
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.0.0")
addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.1.7")
addSbtPlugin("com.typesafe.sbt" % "sbt-scalariform" % "1.3.0")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "0.2.1")

libraryDependencies += "org.scala-sbt" % "scripted-plugin" % sbtVersion.value

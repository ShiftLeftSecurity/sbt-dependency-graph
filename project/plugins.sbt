libraryDependencies += "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value

addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.8.2")
addSbtPlugin("com.dwijnand"     % "sbt-dynver"      % "2.0.0")
addSbtPlugin("io.shiftleft" % "sbt-ci-release-early" % "2.0.13")

publishTo := sonatypePublishToBundle.value

publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

scmInfo := Some(
  ScmInfo(
    browseUrl = url("https://github.com/jrudolph/sbt-dependency-graph"),
    connection = "scm:git:git@github.com:jrudolph/sbt-dependency-graph.git"
  )
)

developers := List(
  Developer(
    "jrudolph",
    "Johannes Rudolph",
    "johannes.rudolph@gmail.com",
    url("https://virtual-void.net")
  )
)

useGpg := true

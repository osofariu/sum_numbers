lazy val root = (project in file("."))
  .settings(
    name := "SumInList",
    scalaVersion := "2.12.7",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"
  )

name := "scala-interview-prep"

scalaVersion := "2.11.7"

enablePlugins(ScalaJSPlugin)

libraryDependencies ++= Seq(
  "org.scalacheck" %%% "scalacheck" % "1.12.5",
  "org.scalatest" %%% "scalatest" % "3.0.0-M7" % "test"
)

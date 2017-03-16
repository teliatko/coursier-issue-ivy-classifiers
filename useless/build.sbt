name := "useless"

organization := "co.oops"

version := "0.0.1"

scalaVersion := "2.11.8"

publishArtifact in Test := true // <-- creates also "tests" artifact by publishLocal
publishMavenStyle := true // <-- generates POM too

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.1"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"
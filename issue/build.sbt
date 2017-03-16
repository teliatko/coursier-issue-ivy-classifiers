name := "coursier-issue-ivy-classifiers"

scalaVersion := "2.11.8"

classpathTypes += "test-jar" // <-- workaround from #444

coursierResolvers := Seq(
  DefaultMavenRepository, // <-- for resolwing Scala & Co.

  // Local repos for resolution of `co.oops.useless`
  Resolver.defaultLocal
  // Resolver.mavenLocal // <-- when `co.oops.useless` is published in ~/.ivy2 (with pom) and copied to ~/.m2 everything works as expected
)

libraryDependencies ++= Seq(
  "co.oops" %% "useless" % "0.0.1",
  "co.oops" %% "useless" % "0.0.1" classifier "tests"
)
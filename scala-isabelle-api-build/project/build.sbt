ThisBuild / scalaVersion     := "2.12.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

resolvers += Resolver.sbtPluginRepo("releases")
resolvers += Resolver.typesafeRepo("releases")
resolvers += "sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

lazy val envVars = sys.props.getOrElse("ISABELLE_HOME","D:\\Tools\\Isabelle2018")
lazy val envVarss = sys.props.getOrElse("ISABELLE_ROOT","D:\\Tools\\Isabelle2018")

lazy val root = (project in file("."))
  .settings(
    name := "IsabelleServerTest",
	libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test,
  )

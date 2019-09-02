import Dependencies._

ThisBuild / scalaVersion     := "2.11.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "beanpuree",
    libraryDependencies += scalaTest % Test,
    libraryDependencies ++= Seq("com.chuusai" %% "shapeless" % "2.3.3",
      "org.scala-lang"      % "scala-reflect"     % scalaVersion.value    % Provided,
      "org.scala-lang"      % "scala-compiler"    % scalaVersion.value)
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.

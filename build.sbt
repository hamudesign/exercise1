import design.hamu.Dependencies

lazy val commonSettings = Seq(
  scalaVersion := "2.12.11",
  organization := "design.hamu",
  version := "0.0.1",
  scalacOptions := Seq("-Xlint", "-Ywarn-unused", "-deprecation", "-Ymacro-annotations"),
  dependencyUpdatesFailBuild := true
)

lazy val publishSettings = Seq(
  coverageMinimum := 20,
  coverageFailOnMinimum := true,
  scalacOptions := Seq("-Ypartial-unification", "-deprecation")
)

lazy val root = project
  .in(file("."))
  .aggregate(core)

lazy val core = project
  .in(file("core"))
  .settings(
    name := "core",
    commonSettings,
    publishSettings,
    libraryDependencies ++= Seq(
      Dependencies.Cats.core
    ) ++ Seq(
      Dependencies.Scalatest.core
    ).map(_ % "test")
  )


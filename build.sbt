ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.2.0"

lazy val root = (project in file("."))
  .settings(
    name := "scala_sorting_searching",
    idePackagePrefix := Some("com.thepfarrer")
  )

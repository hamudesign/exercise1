package design.hamu

import sbt._

object Plugins {
  object SBTUpdates {
    private val version = "0.4.2"
    val core: ModuleID = "com.timushev.sbt" % "sbt-updates" % version
  }
  object SCoverage {
    private val version = "1.6.1"
    val core: ModuleID = "org.scoverage" % "sbt-scoverage" % version
  }
  object ScalaFmt {
    private val version = "2.0.1"
    val core: ModuleID = "org.scalameta" % "sbt-scalafmt" % version
  }
  object SBTAssembly {
    private val version = "0.14.10"
    val core: ModuleID = "com.eed3si9n" % "sbt-assembly" % version
  }
}

package design.hamu

import sbt._

object Dependencies {
  object FS2 {
    private val version = "2.4.0"
    val core = "co.fs2" %% "fs2-core" % version
  }

  object Cats {
    private val version = "2.1.1"
    val core = "org.typelevel" %% "cats-core" % version
    val effect = "org.typelevel" %% "cats-effect" % version
  }

  object SCodec {
    private val version = "1.11.7"
    val core = "org.scodec" %% "scodec-core" % version
    val stream = "org.scodec" %% "scodec-stream" % "2.0.0"
  }

  object Scalatest {
    private val version = "3.2.0"
    val core: ModuleID = "org.scalatest" %% "scalatest" % version
  }
}

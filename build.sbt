sbtPlugin := true

scalaVersion :="2.9.1"

name := "xsbt-sh"

organization := "com.blue"

version := "0.4.0"

scalacOptions := Seq("-deprecation", "-unchecked")

resolvers += "sbt-plugin-releases" at "http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/"

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.8.3")

publishTo := Some(Resolver.file("Github Pages", file("/home/Soft/programs/ruby/tomasky.github.com/repo/release/")))

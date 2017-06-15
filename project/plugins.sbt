// repository for Typesafe plugins
resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/"
resolvers += Resolver.bintrayRepo("sbt", "sbt-plugin-releases")

// https://index.scala-lang.org/vmunier/sbt-web-scalajs
addSbtPlugin("com.vmunier" % "sbt-web-scalajs" % "1.0.4")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.17")

// https://index.scala-lang.org/playframework/playframework/sbt-plugin/2.5.13
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.5.13")



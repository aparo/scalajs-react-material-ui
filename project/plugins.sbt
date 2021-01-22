// Unmanaged jars in client/lib are used until the LTS version of sbt-scalablytyped appears
//resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")

resolvers += Resolver.bintrayRepo("oyvindberg", "converter")

addSbtPlugin("org.scalablytyped.converter" % "sbt-converter" % "1.0.0-beta29.1")

addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat" % "0.1.16")

addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.9.24")


addSbtPlugin(
  "ch.epfl.scala" % s"sbt-scalajs-bundler"% "0.20.0"
)
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.3.1")

addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.13")
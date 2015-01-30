val ldaplib =  "com.unboundid" % "unboundid-ldapsdk" % "2.3.8"

lazy val commonSettings = Seq(
  organization := "edu.hawaii.its.scala",
  version := "0.1.0",
  scalaVersion := "2.11.4"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "ldap-runner",
    libraryDependencies += ldaplib
  )  
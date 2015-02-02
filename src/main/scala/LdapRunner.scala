package edu.hawaii.its.scala

object LdapRunner {
  def main(args: Array[String]) {
    new Ldap().search("duckart")
  }    
}

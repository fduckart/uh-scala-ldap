package edu.hawaii.its.scala

object LdapRunner {
  def main(args: Array[String]) {
    val search = new Ldap()
    search.search("duckart")
  }    
}

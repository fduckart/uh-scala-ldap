package edu.hawaii.its.scala

import com.unboundid.ldap.sdk._
import com.unboundid.util.ssl._ 

class Ldap {
  final val LdapHost = "ldap.hawaii.edu"
  final val LdapPort = 636
  final val LdapBind = "cn=filedrop,ou=Specials,dc=hawaii,dc=edu"
  final val LdapBase = "ou=people,dc=hawaii,dc=edu"
  final val LdapPass = "" // <-- Your password goes here.

  def search(uid: String) {    
    var sslUtil = new SSLUtil(new TrustAllTrustManager());
    var con = new LDAPConnection(sslUtil.createSSLSocketFactory());
    con.connect(LdapHost, LdapPort)
        
    var bindResult = con.bind(LdapBind, LdapPass)  
    val results = con.search(LdapBase, SearchScope.SUB, "uid=" + uid) 

    if (results.getEntryCount > 0) {
      var searchResultEntry =  results.getSearchEntries.get(0);
      println("a. ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
      var it = searchResultEntry.getAttributes.iterator();
      while (it.hasNext) {
        println("  --> " + it.next())
      }
      println("z. ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    }
  }
}

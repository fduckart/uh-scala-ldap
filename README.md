uh-scala-ldap
===========

LDAP Scala Demonstration Program

**Overview**

The program demonstrates how to do a simple LDAP search
of the University of Hawaii LDAP service. 

Note: You must specify a password for your special DN.<br/>
The example run of the program uses the 'filedrop' special DN,
but the value of the password has been removed from the 
checked-in code.

**Technology**

The program was developed on Apple Mac OS X 10.10.2,
using scala version 2.11.5 and sbt version 0.13.6.

**Verify you have Scala installed**

    $ scala -version
    Scala code runner version 2.11.5 -- Copyright 2002-2013, LAMP/EPFL

**Verify you have Scala installed**

    $ sbt --version
    sbt launcher version 0.13.6

**Compile Program (and Download the Dependencies)**

    $ sbt compile

    [info] Loading project definition from ~/uh-scala-ldap/project
    [info] Updating {file:~/uh-scala-ldap/project/}uh-scala-ldap-build...
    [info] Resolving org.fusesource.jansi#jansi;1.4 ...
    [info] downloading https://repo1.maven.org/maven2/org/scala-lang/scala-library/2.10.4/scala-library-2.10.4.jar ...
    ...
    ...
    [info] [SUCCESSFUL ] jline#jline;2.12!jline.jar (1047ms)
    [info] Done updating.
    [success] Total time: 2 s, completed Jan 29, 2015 11:20:54 PM

**Running the Program**

Run the program from the command line: 

    $ sbt run
    [info] Loading project definition from ~/uh-scala-ldap/project
    [info] Set current project to ldap-runner (in build file:~/uh-scala-ldap/)
    [info] Running edu.hawaii.its.scala.LdapRunner 
    a. ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      --> Attribute(name=objectClass, values={'eduPerson', 'inetOrgPerson', 'organizationalPerson', 'person', 'top', 'uhEduPerson'})
      --> Attribute(name=uhUuid, values={'17958670'})
      --> Attribute(name=cn, values={'Frank R Duckart'})
      --> Attribute(name=eduPersonAffiliation, values={'staff'})
      --> Attribute(name=eduPersonOrgDN, values={'uhsystem'})
      --> Attribute(name=givenName, values={'Frank'})
      --> Attribute(name=mail, values={'duckart@hawaii.edu', 'frank.duckart@hawaii.edu'})
      --> Attribute(name=sn, values={'Duckart'})
      --> Attribute(name=uhAcknowledgement, values={'generalConfidentialityNotice=20060101T000000'})
      --> Attribute(name=uhOrgAffiliation, values={'eduPersonOrgDN=uhsystem,eduPersonAffiliation=staff'})
      --> Attribute(name=uid, values={'duckart'})
      --> Attribute(name=displayName, values={'Frank Duckart'})
      --> Attribute(name=facsimileTelephoneNumber, values={'(808) 956-2412'})
      --> Attribute(name=ou, values={'University of Hawaii System', 'Information Technology Services, Management Information Systems'})
      --> Attribute(name=physicalDeliveryOfficeName, values={'Info Tech Ctr, 6th Fl'})
      --> Attribute(name=telephoneNumber, values={'(808) 956-8904'})
      --> Attribute(name=title, values={'Info Tech Spec'})
    z. ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    [success] Total time: 1 s, completed Jan 29, 2015 11:23:36 PM

**For More Information**

Contact me via email at duckart@hawaii.edu


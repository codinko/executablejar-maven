executablejar-maven
===================

A simple Java project that prints hello.

Apache Maven is used  to build the  executable jar.

To demonstrate one step further - An executable jar with dependant libraries, the Java project is configured in Spring framework.


The objective is to create an executable jar named executablejarmaven-1.0.jar which is self executable.

This jar has other dependencies [Spring libraries]. So we tell the main executable jar [in its MANIFEST] file to look for the dependencies in a particular relative location to where executablejarmaven-1.0.jar is placed.

Maven helps to package the libraries, create the executable jar. [Also resolve dependencies]

The heart of this project deals with pom.xml definitions , in  build plugins  

maven-dependency-plugin  to copy-dependencies

and

maven-jar-plugin to create the executable jar

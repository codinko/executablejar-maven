executablejar-maven
===================

Java project using Maven for building a executable jar , and it's dependent libs

For the dependent libs, let's go with a Spring project.

The objective is to create an executable jar named HelloWorld.jar

This jar has other dependencies [Spring libraries]. So we tell the main executable jar [in its MANIFEST] file that, hey, please look for the depenndencies in a particular relative location to where HelloWorld.jar is placed.

Maven helps to package the libraries, create the executable jar.

The heart of this project deals with pom.xml definitions , in  build plugins  

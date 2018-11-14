# KotlinBasics
Learning basics of Kotlin language 

My Kotlin notes from the course "Introduction to Kotlin Programming" by Hadi Hariri of JetBrains

Introduction

- Kotlin for the JVM and JS. On the JVM it generates byte code. 
- Pragmatic language for any kind of application (server, web, desktop, mobile)
- Kotlin is compatible with Java6, no boilerplate code.
- More concise language.
- Inspired by static languages like Java. 
- Interoperable with Java 100%. Can include integrating Kotlin to match existing codebase.
- Grade adopted Kotlin as a scripting language

Intro to JVM

- Abstract machine that runs Java apps
- OpenJDK most common implementation. There is single specification of JVM.
- Instance that runs Java code
- Java Runtime Environment , is needed to run the Java app.
- Java Development Kit is needed to develop Java Applications.
- JVM is polyglot environment : Scala, Ceylon, Clojure, Frege, Kotlin, Java, all of them are compiled to the byte code
- Kotlin file in Kotlin source code Customer.kt is compiled to the byte code Customer.class and then it is executed in one of the instances of JVM (java MyApplication).
- You can call Java from Kotlin and visa versa. 

Structure of Kotlin app

- No semicolons (only in declaration of enum class with method calls)
- You can create a top level function, open a file and create a function in it, no need of creation of classes etc.
- Main function is an entry point (equivalent of Java public static void main ). The the .kt file is created. 
- No package information needed, however we can specify it if needed. It is recommended to use packages, to match java conventions.

Conventions

- Follows Java Coding Conventions. 
- Lower camelCase for names
- Types in Uppercase
- Methods and Properties lower camelCase
- Semicolons are optional and only required in a single place
- Packages following reverse notation
- Multiple classes per file allowed
- Packages do not have to match the folder names, there is not reason for not doing this.

Main functions

- One package allows you to have multiple main functions
- Only one main function per same file

Import packages

- println function is implicitly imported from the package Kotlin.io
- we can explicitly import the packages
- in case of conflicts we can rename the imported function in the new file

Conditionals

- if and when can be expressions but only with else branch included

Functions

- Kotlin is a functional language
- Function is declared using keyword fun
- Can treat functions as first class citizens and as primitives
- Unit is similar to void but it is an object that we can compare to.
- There is a type Nothing. It is different to Unit. Nothing represents the value that never exists.
- Return value of function can be inferred by compiler
- Availability to have default parameters, we can add the default value in the parameters when declaring the function.
This avoids to massively overload of the functions. THis cuts down the boilerplate code.
- We can change order of how we pass parameters, using named parameters when calling the method.
- Functions with unlimited parameters: when we don't know beforehand how many parameters we have to use. vararg allows us to create a function with undefined number of parameters.
- when we want to pass a vararg to another function we have to use the * operator in the braces before the parameter
- Single expression functions don't need function block

Classes

- To declare a class in Kotlin we need to use keyword class adn then the name of the the class
- Class can have properties, we need to open curly braces and declare the property
- For class properties, we don't need to be explicit about the type of properties
- there are no fields in Kotlin, only properties
- Much like variables we can have immutable properties
- To declare an instance of the class we need to create a new variable and instantiate it with name fo the class and braces. There is no new keyword
- To access class properties we use .-notation. className.propertyName
- Property can be intitialized right away after the declaration or move to constructor parameters and initialize properties from constructor paramenters(though it is a lot of code repetition)
- or in the constructor declare var/val parameters "class Customer(var id: Int, var name: String)"
- to add constructor to the class add the braces after the name of the class and put parameters (just name and type) or properties *var/val, name and type) there inside the braces
- Classes also can have default parameters in their constructor, just like functions
- We can use the init{} block to work with properties of the class right at the moment when the instance of the class is created.
-
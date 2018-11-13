# KotlinBasics
Learning basics of Kotlin language 

Kotlin Notes

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


# KotlinBasics
Learning basics of Kotlin language 

My notes while following the course "Introduction to Kotlin Programming" by Hadi Hariri of JetBrains

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
- there are no fields in Kotlin, only properties.
- We have access to the "backing" field if required in custom getters/setters
- Much like variables we can have immutable properties
- To declare an instance of the class we need to create a new variable and instantiate it with name fo the class and braces. There is no new keyword
- To access class properties we use .-notation. className.propertyName
- Property can be intitialized right away after the declaration or move to constructor parameters and initialize properties from constructor paramenters(though it is a lot of code repetition)
- or in the constructor declare var/val parameters "class Customer(var id: Int, var name: String)"
- to add constructor to the class add the braces after the name of the class and put parameters (just name and type) or properties *var/val, name and type) there inside the braces
- Classes also can have default parameters in their constructor, just like functions
- We can use the init{} block to work with properties of the class right at the moment when the instance of the class is created.
- There is ability to create secondary constructor on the main constructor that will do the same thing as init block
- We can use custom getters and setter for the properties in Kotlin. We use curly braces for multiline and = for one line
- In order to set the property value in the setter in Kotlin, we should use the special recognized word field
- We can create an object without being it an instance of specific class
- If we create a global object it implements a Singleton pattern with very little code
- We can create local objects inside the functions, for instance. To declare the local object variable we use object keyword and initialize object properties inside curly braces
- Data classes with data modifier provides toString and hashCode functions

Visibility modifiers

- Public - default and anywhere accessible
- Top-level declarations:
- private - available inside the file containing declaration
- internal - Anywhere in the same module. Module here is a Gradle module, or maven or IntelliJ module
- Classes:
- private - only available for class members
- protected - same as private and subclasses
- internal - Any client inside the module

Data classes

- Java data classes uses a lot of boilerplate code. We never know it is generated or it is byt he company standards or anything else
- there is a data modifier that we put before the class, it gives us toString method, getHashCode and equals functions ready
- also the ability to copy objects nad override the properties if needed
- any of these methods can be overriden by override keyword.

Enum classes

- We can add a value to enum class (in the constructor)
- We can override toString method of each enum member
- Kotlin requires the semicolon in the end of enum member before creating the abstract function in the enum class

Inheritance

- Kotlin supports inheritance
- The base class for all is Any()
- We don't have to explicitly put that our class inherits from Any()
- In Kotlin by default all types are final, so in order to inherit from one class we should declare it open
- In order to override method that belongs to a parent class we should make it open too
- If we want to access primary constructor from secondary one, we use super()
- There is a final keyword in Kotlin that is used when we don't want functions to be overridden in inherited classes
- Data class can inherit from a other class. It is useful when you have a hierarchy of data objects that we want to persist with ORM for example.
And it requires some level of inheritance

Abstract classes

- They cannot be instantiated, only inherited
- They can have abstract members without the implementation. Implementation of abstract members is provided in the child class.
- Not every member of an abstract class cna be abstract.

Interfaces

- Interfaces can have default implementations
- The difference between interface and abstract class is that you cannot maintain state in an interface.
- There is single inheritance model, when you can only inherit from one class. But with interfaces you can implement many interfaces
- Interfaces cannot maintain state but they can have properties (just without instantiation)
- However it is possible to provide getters/setters for the properties
- We can override default getters and setters for the properties in the interfaces
- We can override the default implementation of the methods in the interfaces
- We can specify which method of which interface we want to override, it methods have the same name in both interfaces.
we need to use super<interface name>.method().

Generics

- Generics is supported in Kotlin
- Allows us to cut the boilerplate code.
- Kotlin supports generic functions fun <T> functionName().
In this case the T generic parameter moves from the interface/class to the function level (only makes sense when there is a need in different types of parameters)

Null safety

- By default Kotlin is null safe, therefore all types cannot be null by default
- If we need to work with null values, we can specify the type for variables adding question marks after the type like var message: String?. Here we explicitly tell that message is nullable
- In order to provide nullability checks, use "elvis operator" message?.length. It checks message for being not null and invokes its length only if it is not null.
- Elvis operator can be also used with functions
- Elvis operator helps to reduce boilerplate code with multiple indented if checks
- There is !! operator that tell compiler to stop complaining about the null checks. There are certain situations where we want to use this operator:
interoperability situations.

Type casting

- We dont need explicitly cast it to type Employee because compiler uses smart casting and checks by itself beforehand
- Int cannot be cast to String.
- Safe casting in this case: use ? operator. In this case if casting cannot be done, it returns null as a string.

Tuples

- Sometimes we might want to work with more than one value but not go fully fledged into use Data classes. That's where Tuples come in.
- There are classes Pair<T1,T2> and Triple<T1, T2, T3> that are just data classes with 2 or 3 properties.
- Ability to deconstruct values
- That leads to the Ability to enhance the semantics of the code that we are writing
- Deconstruction of values can be done in for-loops as well


Exceptions

- Exceptions extend Throwable class
- To pass a message to an exception, we need to pass a message to a Throwable constructor that our exception class extends
- In Kotlin in try-catch block can return an expression and a value, the block can be expression itself.
- There are no checked exceptions. We don't need to declare them as a boilerplate code

Constants

- you either create an top object (should be imported prior to usage)
- or create a top level property (variable)
- it is good to group several constant values and put it in the same object
- Top level properties will be difficult to track , where the things are in a sense.


Annotations

- Compilable with Java annotations
- Can create custom annotations
- Can rename the annotations (Test as Specification for instance)

Functional programming

- A function taking another function as a parameter
- or a function returning a function
- To pass in the function by name we use ::
- There are nio limitations in what w can create in the higher order functions

Lambda expressions

- Don't need to declare function header but just the body
- If the only parameter of the function is another function, it does not go into brackets. Just curly braces.
- Sometimes it is like creating keywords and passing an object on which you need to so something (like commiting to the database etc) and a chunk of code. And the 'keyword" going to encapsulate this code and commit and tun the transaction

Anonymous functions

- They do not have a name, just the fun keyword
- They can have a body and return smth

Closures
 - When a lambda expression references variables of the function in which it's contained, this forms a closure, and it has some gotcha's we need to be aware of.

 Extended functions

 - We can create a new function on its class without having to extend it and inherit from this class.
 - As soon as you import the package where the extended function is, you can use it oin other files
 - If an extended function will be called the same as an existing member function, the preference will be to the member function
 - Extension functions are statically resolved

 Java interoperability

 -Can use java classes in Kotlin files
 - Kotlin classes can extend Java classes and implement Java interfaces
 - For throwing exceptions that can be used in java talking to kotlin,  in Kotlin file  use annotations @Throws
 - In order to use top level functions in java, we use the kt file name and invoke the function as it would be the static one in java
 - Or we can name the kt file with annotation as @file:JvmName("new calss name") and use this name in java
 - To use extention function from java we need to call the ktFileName.nameExtentionFunction(nameOfClassInstanceInJava)
 - Kotlin is compatible with Java 6
 - Some Java 8 functionality have their implementation in Kotlin.
 - Lambdas become anonymous classes in Kotlin
 - There is ability to generate Java 8 bytecode, use the -jvm.target-1.8
 - Two new standard libraries for Java 7/8 Api
 - 100% interop with Java
 - for smoother experience using annotations (JetBrains annotations, Android annotations, JSR-305 Javax Annotations)
 - You can decide when a value can be null (@Nullable) or not null (@NotNull), with or without ? in Kotlin


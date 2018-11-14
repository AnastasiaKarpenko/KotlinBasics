package ws.tilda.anastasia.kotlinbasics.functions

fun hello(): Unit {
    println("Hello")
}

fun throwingExceptions(): Nothing {
    throw Exception("This function throws an exception")
}

fun returnsAFour(): Int {
    return 4;
}

fun takingString(name: String) {
    println(name)
}

fun sum(x: Int, y: Int, z: Int = 0) = x + y + z // the same as if we returned , we can infer the return type as well

//
fun printDetails(name: String, email: String = "NA", phone: String) {
    println("name: $name - email: $email - phone: $phone")
}

fun main(args: Array<String>) {

    hello()
    val value = returnsAFour()
    takingString("hello")

    sum(1,2)
    printDetails("Anastasiia", phone ="555-55-55") //since email has default value, we may not pass email in method parameters
}
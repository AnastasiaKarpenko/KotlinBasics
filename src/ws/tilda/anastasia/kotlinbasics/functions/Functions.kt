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

fun sum(x: Int, y: Int) = x + y // the same as if we returned , we can infer the return type as well

fun main(args: Array<String>) {

    hello()
    val value = returnsAFour()
    takingString("hello")
}
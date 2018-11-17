package ws.tilda.anastasia.kotlinbasics.functional

fun String.hello() {
    println("It's me!")
}

fun String.toTitleCase(): String {
    return this.split(" ").joinToString(" ") {it.capitalize()}
}

fun main(args: Array<String>) {
    "Hello".hello()
    println("hello kotlin".toTitleCase())
}
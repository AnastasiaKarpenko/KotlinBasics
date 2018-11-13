package ws.tilda.anastasia.kotlinbasics.basics

fun main(args: Array<String>) {
    var myString = "Not Empty"

    // If else can become an expression

    val result = if (myString != "") {
        "A string"

    } else {
        "Another string"
    }

    println(result)

    //when: a matcher. When the condition is met, it breaks (dies not reach to the second condition).
    // Can be expression as well with else branch
    val whenValue = when (result) {
        "Value" -> {
            println("Is a value")
            println("Second statement")
            "returning from first when case"
        }
        is String ->  {
            println("Excellent")
        }
        else -> {
            println("it came to this?")
        }
    }
    println(whenValue)
}
package ws.tilda.anastasia.kotlinbasics.basics

fun main(args: Array<String>) {

    //Incrementing and decrementing numbers

    for (a in 1..100) {
        println(a)
    }

    val numbers = 1..100

    for (a in numbers) {
        println(a)
    }

    for (a in 100 downTo 1) {
        println(a)
    }

    for (a in 100..1) {
        println(a)
    }

    for (b in 100 downTo 1 step 5) {
        println(b)
    }

    //Over lists

    val capitals = listOf("London", "Paris", "Madrid")
    //it is allowed to name the items in the list
    for (capital in capitals) {
        println(capital)
    }

    //While loop
    var i = 100 //should be mutable
    while (i > 0) {
        i--
    }

    //Do while loop
    do {
        var x = 10
        x--
    } while (x > 10)

    //Ability to break from the loop and continue


}
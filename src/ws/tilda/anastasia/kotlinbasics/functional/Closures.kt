package ws.tilda.anastasia.kotlinbasics.functional

fun outsideFunction() {
    val number = 10

    unaryOperation(20, { x -> x * number })
    //outside function is a closure that allows the lambda inside unaryOperation to access the number that is outside the unaryOperation.
}

fun outsideFunction2() {
    for (number2 in 1..30) {
        unaryOperation(20, { x ->
            println(number2)
            x * number2
            })
    }


    //outside function is a closure that allows the lambda inside unaryOperation to access the number that is outside the unaryOperation.
}

fun main(args: Array<String>) {
    outsideFunction2()
}
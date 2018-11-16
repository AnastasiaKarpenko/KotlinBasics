package ws.tilda.anastasia.kotlinbasics.functional

fun operation(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    // higher order function that takes two integers and a function with two integers that returns an Integer.
   return  op(x,y)
}

fun operations(x: Int, op: (Int, Int) -> Unit) {

}

fun route(path: String, vararg action: (String, String) -> String) {

}

fun sum(x: Int, y: Int) = x + y

fun main(args: Array<String>) {
    println(operation(1,2, ::sum))
}


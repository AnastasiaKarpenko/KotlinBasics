package ws.tilda.anastasia.kotlinbasics.functional

fun operation(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    // higher order function that takes two integers and a function with two integers that returns an Integer.
    return op(x, y)
}

fun operations(x: Int, op: (Int, Int) -> Unit) {

}

fun route(path: String, vararg action: (String, String) -> String) {

}

fun unaryOperation(x: Int, op: (Int) -> Int) {

}

fun unaryOp(op: (Int) -> Int) {

}

fun transaction(db: Database, code: () -> Unit) {
//code does not take any parameters and does not return a value. Database has one method commit. Function transaction takes in the database and some code.
    //then the code executes and then make commit to the database
    try {
        code()
    } finally {
        db.commit()
    }
}

class Database {
    fun commit() {}
}

fun sum(x: Int, y: Int) = x + y

fun main(args: Array<String>) {
    println(operation(1, 2, ::sum))

    operation(1, 2, { x, y -> x + y }) // lambda expression, not necessary to specify the types, Kotlin provides types inference

    unaryOperation(2, { x -> x * x })
    unaryOperation(3, { it * it }) // the same as before but less code , we can call it differently not an  but an it

    unaryOperation(3) { it * it }

    unaryOp {
        it * it
    } // there are no brackets. Because the parameter of this function is another function.

    val db = Database()

    transaction(db) {
        //interact with the database code
        //this code will be taken in the try block as code() and then finally block automatically executes.
        //Sometimes it is like creating keywords and passing an object on which you need to so something
        // (like commiting to the database etc) and a chunk of code. And the 'keyword" going to encapsulate this
        // code and commit and tun the transaction
    }

    unaryOperation(3, fun(x: Int): Int { return x * x } ) // fun here is an anonymous function

}


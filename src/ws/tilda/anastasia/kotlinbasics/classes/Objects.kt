package ws.tilda.anastasia.kotlinbasics.classes

//It's a Singleton
object Global{
    val PI = 3.14
}

fun main(args: Array<String>) {
    //Initialize local object
    val localObject = object {
        val PI = 3.14159
    }
    println(Global.PI)
    println(localObject.PI)
}
package ws.tilda.anastasia.kotlinbasics.Interop

import ws.tilda.anastasia.kotlinbasics.classes.Customerjava

fun main(args: Array<String>) {
    val customer = Customerjava()

    customer.email = "anastasiia@gmail.com"

    customer.prettyPrint()
}

class PersonKotlin: PersonJava() {

}

